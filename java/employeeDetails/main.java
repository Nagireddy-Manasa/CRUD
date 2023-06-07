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
//		obj.getAllEmployees();
//		System.out.println("eed");
	obj.updateEmployeeName(198,"manasa");
	System.out.println("updated");
//		obj.deleteEmployee(199);
//		System.out.println("eeeeeed");
	}
//		String csvFilePath = "C:\\Users\\nagmanasa\\Documents\\SampleData.csv";
//		try {
//			BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
//			CSVParser records = CSVParser.parse(lineReader,
//					CSVFormat.EXCEL.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
//			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
//					.addAnnotatedClass(Employee.class).buildSessionFactory();
//			Session session = factory.openSession();
//			session.beginTransaction();
//			for (CSVRecord record : records) {
//				Employee employee = new Employee();
//
//				employee.setEMPLOYEE_ID(Long.parseLong(record.get("EMPLOYEE_ID")));
//				employee.setFIRST_NAME(record.get("FIRST_NAME"));
//				employee.setLAST_NAME(record.get("LAST_NAME"));
//				employee.setEMAIL(record.get("EMAIL"));
//				employee.setPHONE_NUMBER(record.get("PHONE_NUMBER"));
//				employee.setHIRE_DATE(record.get("HIRE_DATE"));
//				employee.setJOB_ID(record.get("JOB_ID"));
//				employee.setSALARY(record.get("SALARY"));
//				session.save(employee);
//			}
//			session.getTransaction().commit();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

}
