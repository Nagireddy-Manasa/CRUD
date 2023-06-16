package employeeDetailsTests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import employeeDetails.Employee;
import employeeDetails.FileDataIngestionServiceImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

import java.text.ParseException;

public class FileDataIngestionServiceImplTest {

    @Mock
    private SessionFactory sessionFactory;
    @Mock
    private Session session;
    @Mock
    private Transaction transaction;
    private FileDataIngestionServiceImpl fileDataIngestionService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        fileDataIngestionService = new FileDataIngestionServiceImpl();
        fileDataIngestionService.setSessionFactory(sessionFactory);

        when(sessionFactory.openSession()).thenReturn(session);
        when(session.beginTransaction()).thenReturn(transaction);
    }

    @After
    public void closing() {
        session.close();
        sessionFactory.close();
    }

    @Test
    public void atestLoadFileData() throws ParseException {
        String csvFilePath = "C:\\Users\\nagmanasa\\Documents\\SampleData.csv";
        fileDataIngestionService.loadFileData(csvFilePath);
        Employee employee1 = fileDataIngestionService.getEmployeeById(100L);
       // assertNotNull("Employee with ID 1 should exist", employee1);
    }

    @Test
    public void btestUpdateEmployeeName() {
        int employeeId = 100;
        String firstName = "Steven";
        Employee employee = new Employee();
        employee.setEMPLOYEE_ID(employeeId);
        employee.setFIRST_NAME("neha");

        when(sessionFactory.openSession()).thenReturn(session);
        when(session.get(Employee.class, employeeId)).thenReturn(employee);

        fileDataIngestionService.updateEmployeeName(employeeId, firstName);

       // assertEquals(firstName,employee.getFIRST_NAME());
    }

    @Test
    public void ctestDeleteEmployee() {
        int employeeId = 102;

        fileDataIngestionService.deleteEmployee((long) employeeId);

        assertNull(fileDataIngestionService.getEmployeeById(102));
    }
}
