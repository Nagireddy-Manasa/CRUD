package employeeDetails;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main {
	static FileDataIngestionServiceImpl obj = new FileDataIngestionServiceImpl();

	public static void main(String[] args) throws IOException {
		String filepath="C:\\Users\\nagmanasa\\Documents\\SampleData.csv";
		obj.loadFileData(filepath);
		System.out.println("loaded");
		obj.ParseFileData(filepath);
		System.out.println("parsed");
		obj.readFile(filepath);
        System.out.println("read");
	    obj.updateEmployeeName(198,"manasa");
	    System.out.println("updated");
		obj.deleteEmployee(199);
		System.out.println("deleted");
	}


}
