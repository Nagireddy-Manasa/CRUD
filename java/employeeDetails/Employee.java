package employeeDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeedetails")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long EMPLOYEE_ID;

	public Employee() {
		super();
	}

	@Column(name = "FIRST_NAME")
	String FIRST_NAME;

	@Column(name = "LAST_NAME")
	String LAST_NAME;

	@Column(name = "EMAIL")
	String EMAIL;

	@Column(name = "PHONE_NUMBER")
	Long PHONE_NUMBER;

	public Long getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}

	public void setEMPLOYEE_ID(Long eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}

	public String getFIRST_NAME() {
		return FIRST_NAME;
	}

	public Employee(Long eMPLOYEE_ID, String fIRST_NAME, String lAST_NAME, String eMAIL, Long pHONE_NUMBER,
			String hIRE_DATE, String jOB_ID, Long sALARY) {
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

	public Long getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}

	public void setPHONE_NUMBER(Long pHONE_NUMBER) {
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

	public Long getSALARY() {
		return SALARY;
	}

	public void setSALARY(Long sALARY) {
		SALARY = sALARY;
	}

	@Column(name = "HIRE_DATE")
	String HIRE_DATE;

	@Column(name = "JOB_ID")
	String JOB_ID;

	@Column(name = "SALARY")
	Long SALARY;

}