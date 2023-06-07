package employeeDetails;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;

public class FileDataIngestionServiceImpl implements FileDataIngestionService {
	
	@Override
	public void loadFileData(String csvFilePath) {
		try {
			BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
			CSVParser records = CSVParser.parse(lineReader,
					CSVFormat.EXCEL.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Employee.class).buildSessionFactory();
			Session session = factory.openSession();
			session.beginTransaction();
			
			for (CSVRecord record : records) {
				
				Employee employee = new Employee();
				employee.setEMPLOYEE_ID(Long.parseLong(record.get("EMPLOYEE_ID")));
				employee.setFIRST_NAME(record.get("FIRST_NAME"));
				employee.setLAST_NAME(record.get("LAST_NAME"));
				employee.setEMAIL(record.get("EMAIL"));
		      	employee.setPHONE_NUMBER(record.get("PHONE_NUMBER"));
				employee.setHIRE_DATE(record.get("HIRE_DATE"));
				employee.setJOB_ID(record.get("JOB_ID"));
				employee.setSALARY(record.get("SALARY"));
				
				session.save(employee);
			}
				session.getTransaction().commit();
		}
	 catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}
	@Override
	public List<String> ParseFileData(String csvFilePath) {
        List<String> FileData = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                FileData.add(line);
            }
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        return FileData;
    }



//	@Override
//	public List<Employee> getAllEmployees() {
//		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//			CriteriaBuilder cb = session.getCriteriaBuilder();
//			CriteriaQuery<Employee> query = session.getCriteriaBuilder().createQuery(Employee.class);
//			query.from(Employee.class);
//			List<Employee> employees = session.createQuery(query).list();
//			
//			return employees;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return Collections.emptyList();
//		}
//	}
	public String readFile(String filePath) {
		StringBuilder fileData = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				fileData.append(line).append("\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileData.toString();
	}

	@Override
	public void updateEmployeeName(int aEMPLOYEE_ID, String bFIRST_NAME) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction transaction = session.beginTransaction();
			Employee employee = session.get(Employee.class, aEMPLOYEE_ID);
			if (employee != null) {
				employee.setFIRST_NAME(bFIRST_NAME);
				session.update(employee);
				transaction.commit();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//
//	@Override
//	public void deleteEmployee(int employeeId) {
//		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//			Transaction transaction = session.beginTransaction();
//			Employee employee = session.get(Employee.class, employeeId);
//			if (employee != null) {
//				session.delete(employee);
//				transaction.commit();
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	
}


