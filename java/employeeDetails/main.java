package employeeDetails;

import java.io.IOException;

public class main {
	 static FileDataIngestionServiceImpl obj = new FileDataIngestionServiceImpl();

	public static void main(String[] args) throws IOException {
		String filepath="C:\\Users\\nagmanasa\\Documents\\SampleData.csv";
		obj.loadFileData(filepath);
		System.out.println("loaded");
	    obj.updateEmployeeName(100,"manasa");
	    System.out.println("updated");
		obj.deleteEmployee(101L);
		System.out.println("deleted");
		
	}


}
