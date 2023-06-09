package employeeDetails;

import java.io.IOException;
import java.util.List;

public interface FileDataIngestionService {
	

	public  void loadFileData(String csvFilePath);
	List<String> ParseFileData(String csvFilePath);
    public void updateEmployeeName(int EMPLOYEE_ID, String FIRST_NAME);
	public void deleteEmployee(Long EMPLOYEE_ID);
}
