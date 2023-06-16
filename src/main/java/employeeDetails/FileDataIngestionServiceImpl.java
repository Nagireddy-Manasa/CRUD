package employeeDetails;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

import org.slf4j.*;

import com.google.protobuf.TextFormat.ParseException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FileDataIngestionServiceImpl implements FileDataIngestionService {
	Logger logger = LoggerFactory.getLogger(FileDataIngestionServiceImpl.class);

	// This method is used to read and load the file into Database
	@Override
	public void loadFileData(String csvFilePath)  {

		try {
			logger.info("Reading the file");
			// read the file
			File file = new File(csvFilePath);
			InputStream inStream = new FileInputStream(file);
			BufferedReader lineReader = new BufferedReader(new InputStreamReader(inStream));
			String line;
			// creating session factory
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Employee.class).buildSessionFactory();
			Session session = factory.openSession();
			session.beginTransaction();
			// reading each line and saving the employee data into database
			while ((line = lineReader.readLine()) != null) {
				String[] columns = line.split(",");
				Employee employee = new Employee();
				employee.setEMPLOYEE_ID(Integer.valueOf(columns[0]));
				employee.setFIRST_NAME(columns[1]);
				employee.setLAST_NAME(columns[2]);
				employee.setEMAIL(columns[3]);
				employee.setPHONE_NUMBER(columns[4]);
				employee.setHIRE_DATE(columns[5]);
				employee.setJOB_ID(columns[6]);
				employee.setSALARY(columns[7]);
				session.save(employee);
			}	
			// commiting the transaction and closing the session
			session.getTransaction().commit();
			session.close();
			factory.close();
			logger.info("Loading the data completed");
		} catch (FileNotFoundException e) {
			logger.error("Exception has been occured while loading the file");
		} catch (IOException e) {
			logger.error("Exception has been occured while loading the file");
		}

	}

	// This method is used to Updating the FIRST_NAME based on EMPLOYEE_ID
	@Override
	public void updateEmployeeName(int EMPLOYEE_ID, String FIRST_NAME) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction transaction = session.beginTransaction();
			Employee employee = session.get(Employee.class, EMPLOYEE_ID);
			if (employee != null) {
				// updating the firstname
				employee.setFIRST_NAME(FIRST_NAME);
				session.update(employee);
				transaction.commit();
				logger.info("FIRST_NAME is Updated");
			}

		} catch (Exception e) {
			logger.error("Exception has been occured while updating the file");
		}
	}

	// This method is used to deleting the row based on EMPLOYEE_ID
	@Override
	public void deleteEmployee(Long EMPLOYEE_ID) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction transaction = session.beginTransaction();
			Employee employee = session.get(Employee.class, EMPLOYEE_ID);
			if (employee != null) {
				// deleting the employee id
				session.delete(employee);
				transaction.commit();
				logger.info("EMPLOYEE_ID is deleted");
			}

		} catch (Exception e) {
			logger.error("Exception has been occured while deleting the row");
		}
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		// TODO Auto-generated method stub
		
	}

	public Employee getEmployeeById(long l) {
		// TODO Auto-generated method stub
		return null;
	}
}
