package employeeDetailsTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


public class EmployeeTest {
	@Before

	public void setUp() {

		fileDataIngestionService = new FileDataIngestionServiceImplTest();
	}

	@Test
	public void testLoadFileData() {
		String filePath = "C:\\Users\\nagmanasa\\Documents\\SampleData.csv";
		List<EmployeeTest> employees = fileDataIngestionService.loadFileData(filePath);
		assertNotNull(employees);
		assertFalse(employees.isEmpty());
	}
}
