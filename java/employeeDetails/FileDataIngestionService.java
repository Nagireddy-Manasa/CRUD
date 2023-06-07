package employeeDetails;

import java.io.IOException;
import java.util.List;

public interface FileDataIngestionService {
	

	 void loadFileData(String csvFilePath);
	List<String> ParseFileData(String csvFilePath);

//	List<Employee> getAllEmployees();
//
    void updateEmployeeName(int aEMPLOYEE_ID, String FIRST_NAME);
//
//	void deleteEmployee(int EMPLOYEE_ID);
}
