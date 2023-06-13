package employeeDetails;

public interface FileDataIngestionService {
	// method to load the file
	public void loadFileData(String csvFilePath);

	// method to update the firstname
	public void updateEmployeeName(int EMPLOYEE_ID, String FIRST_NAME);

	// method to delete the employeeid
	public void deleteEmployee(Long EMPLOYEE_ID);
}
