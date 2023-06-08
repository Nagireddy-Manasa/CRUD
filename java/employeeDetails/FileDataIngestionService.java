package employeeDetails;

import java.io.IOException;
import java.util.List;

public interface FileDataIngestionService {
	

	public  void loadFileData(String csvFilePath);
	List<String> ParseFileData(String csvFilePath);
	public String readFile(String filePath);
    public void updateEmployeeName(long aEMPLOYEE_ID, String FIRST_NAME);
	public void deleteEmployee(long aEMPLOYEE_ID);
}
