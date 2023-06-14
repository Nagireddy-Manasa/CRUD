package employeeDetailsTests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import employeeDetails.Employee;
import employeeDetails.FileDataIngestionServiceImpl;
import java.io.*;

public class FileDataIngestionServiceImplTest {
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	private FileDataIngestionServiceImpl fileDataIngestionService;

	@Before
	public void setUp() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		fileDataIngestionService = new FileDataIngestionServiceImpl();
		fileDataIngestionService.setSessionFactory(sessionFactory);

	}
	@After
	public void closing() {
		transaction.rollback();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void atestLoadFileData() throws IOException {
		String csvFilePath = "C:\\Users\\nagmanasa\\Documents\\SampleData.csv";
		Employee employee = new Employee();
		fileDataIngestionService.loadFileData(csvFilePath);
//		assertEquals(100, employee.getEMPLOYEE_ID());
//      assertEquals("Steven", employee.getFIRST_NAME());

	}

	@Test
	public void ctestUpdateEmployeeName() {
		int EMPLOYEE_ID=100;
		String FIRST_NAME="Steven";
		Employee employee = new Employee();
		employee.setEMPLOYEE_ID(EMPLOYEE_ID);
	    employee.setFIRST_NAME("neha");
		fileDataIngestionService.updateEmployeeName(EMPLOYEE_ID, FIRST_NAME);
		Employee updateEmployee = getEMPLOYEE_ID(EMPLOYEE_ID);
	//	assertEquals(FIRST_NAME, updatedEmployee.getFIRST_NAME());
		
	}

	private Employee getEMPLOYEE_ID(int EMPLOYEE_ID ) {
		// TODO Auto-generated method stub
		return session.get(Employee.class, 100);
	}

	@Test
	public void btestDeleteEmployee() {
		int EMPLOYEE_ID=102;
		Employee employee = new Employee();
		fileDataIngestionService.deleteEmployee((long) EMPLOYEE_ID);
	}

}
