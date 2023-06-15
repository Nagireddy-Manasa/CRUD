package employeeDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Creating Entity class
@Entity
//Creating Table
@Table(name = "data")
public class Employee {
	// Primarykey Field
	@Id
	@Column(name = "EMPLOYEE_ID")
	int EMPLOYEE_ID;
	// Column for firstname
	@Column(name = "FIRST_NAME")
	String FIRST_NAME;
	// Column for lastname
	@Column(name = "LAST_NAME")
	String LAST_NAME;
	// Column for email
	@Column(name = "EMAIL")
	String EMAIL;
	// Column for phonenumber
	@Column(name = "PHONE_NUMBER")
	String PHONE_NUMBER;
	// Column for hiredate
	@Column(name = "HIRE_DATE")
	String HIRE_DATE;
	// Column for jobId
	@Column(name = "JOB_ID")
	String JOB_ID;
	// Column for salary
	@Column(name = "SALARY")
	String SALARY;

	// Getters and Setters for Cloumns
	public int getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}

	public void setEMPLOYEE_ID(int eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}

	public String getFIRST_NAME() {
		return FIRST_NAME;
	}

	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}

	public String getLAST_NAME() {
		return LAST_NAME;
	}

	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}

	public void setPHONE_NUMBER(String pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}

	public String getHIRE_DATE() {
		return HIRE_DATE;
	}

	public void setHIRE_DATE(String hIRE_DATE) {
		HIRE_DATE = hIRE_DATE;
	}

	public String getJOB_ID() {
		return JOB_ID;
	}

	public void setJOB_ID(String jOB_ID) {
		JOB_ID = jOB_ID;
	}

	public String getSALARY() {
		return SALARY;
	}

	public void setSALARY(String sALARY) {
		SALARY = sALARY;
	}

	// Parameterized constructor
	public Employee(int eMPLOYEE_ID, String fIRST_NAME, String lAST_NAME, String eMAIL, String pHONE_NUMBER,
			String hIRE_DATE, String jOB_ID, String sALARY) {
		super();
		EMPLOYEE_ID = eMPLOYEE_ID;
		FIRST_NAME = fIRST_NAME;
		LAST_NAME = lAST_NAME;
		EMAIL = eMAIL;
		PHONE_NUMBER = pHONE_NUMBER;
		HIRE_DATE = hIRE_DATE;
		JOB_ID = jOB_ID;
		SALARY = sALARY;
	}

	// Default constructor
	public Employee() {
		super();
	}

}
