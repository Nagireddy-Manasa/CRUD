package employeeDetails;

import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class main {
	// Creating object for FileDataIngestionServiceImpclass to access the methods
	// and properties
	static FileDataIngestionServiceImpl obj = new FileDataIngestionServiceImpl();
	static Logger logger = LoggerFactory.getLogger(main.class);

	public static void main(String[] args){
		// path to the file
		String filepath = "C:\\Users\\nagmanasa\\Documents\\SampleData.csv";
		// loading the filedata
		obj.loadFileData(filepath);
		logger.info("Loading the file into database completed Successfully");
		// updating the firstname
		obj.updateEmployeeName(100, "manasa");
		logger.info("updating the file completed successfully");
		// deleting the row
		obj.deleteEmployee(101L);
		logger.info("deleting the row completed successfully");

	}

}
