package employeeDetails;

public interface FileDataIngestionService {
	

	public  void loadFileData(String csvFilePath);
    public void updateEmployeeName(int EMPLOYEE_ID, String FIRST_NAME);
	public void deleteEmployee(Long EMPLOYEE_ID);
}
