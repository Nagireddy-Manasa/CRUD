package employeeDetailsTests;

////import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import employeeDetails.Employee;
//import employeeDetails.FileDataIngestionServiceImpl;

//public class FileDataIngestionServiceImplTest {
//
//    @Mock
//    private Employee employeeDao;
//
//    @InjectMocks
//    private FileDataIngestionServiceImpl fileDataIngestionService1;
//
//    @Before
//    public void setup() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void testLoadFileData() {
//        String filePath = "C:\\Users\\nagmanasa\\Documents\\SampleData.csv";
//       String fileData = "SH_CLERK,DOCONNEL\nSH_CLERK,DGRANT\nAD_ASST,JWHALEN";
//        List<Employee> expectedEmployees = new ArrayList<>();
//        Employee employee1 = new Employee();
//        employee1.setJOB_ID("SH_CLERK");
//        employee1.setEMAIL("DOCONNEL");
//        Employee employee2 = new Employee();
//        employee2.setJOB_ID("SH_CLERK");
//        employee2.setEMAIL("DGRANT");
//        Employee employee3 = new Employee();
//        employee3.setJOB_ID("AD_ASST");
//        employee3.setEMAIL("JWHALEN");
//        expectedEmployees.add(employee1);
//        expectedEmployees.add(employee2);
//        expectedEmployees.add(employee3);
//
//        when(fileDataIngestionService1.readFile(filePath)).thenReturn(fileData);
//        when(fileDataIngestionService1.parseFileData(fileData)).thenReturn(expectedEmployees);
//
//        List<Employee> actualEmployees = fileDataIngestionService1.loadFileData(filePath);
//
//        assertEquals(expectedEmployees, actualEmployees);
//        verify(fileDataIngestionService1, times(1)).readFile(filePath);
//        verify(fileDataIngestionService1, times(1)).parseFileData(fileData);
//    }
//
//    @Test
//    public void testParseFileData() {
//        String fileData = "SH_CLERK,DOCONNEL\\nSH_CLERK,DGRANT\\nAD_ASST,JWHALEN";
//        List<Employee> expectedEmployees = new ArrayList<>();
//        Employee employee1 = new Employee();
//        employee1.setJOB_ID("SH_CLERK");
//        employee1.setEMAIL("DOCONNEL");
//        Employee employee2 = new Employee();
//        employee2.setJOB_ID("SH_CLERK");
//        employee2.setEMAIL("DGRANT");
//        Employee employee3 = new Employee();
//        employee3.setJOB_ID("AD_ASST");
//        employee3.setEMAIL("JWHALEN");
//        expectedEmployees.add(employee1);
//        expectedEmployees.add(employee2);
//        expectedEmployees.add(employee3);
//
//        List<Employee> actualEmployees = fileDataIngestionService1.parseFileData(fileData);
//
//        assertEquals(expectedEmployees, actualEmployees);
//    }
//}