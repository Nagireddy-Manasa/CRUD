package employeeDetailsTests;

import org.junit.Test;

import employeeDetails.Employee;

import static org.junit.Assert.*;

public class EmployeeTest {
    
    @Test
    public void testGettersAndSetters() {
        // Given
        int employeeId = 1;
        String firstName = "John";
        String lastName = "Doe";
        String email = "john.doe@example.com";
        String phoneNumber = "1234567890";
        String hireDate = "2023-06-14";
        String jobId = "001";
        String salary = "5000";
        
        // When
        Employee employee = new Employee();
        employee.setEMPLOYEE_ID(employeeId);
        employee.setFIRST_NAME(firstName);
        employee.setLAST_NAME(lastName);
        employee.setEMAIL(email);
        employee.setPHONE_NUMBER(phoneNumber);
        employee.setHIRE_DATE(hireDate);
        employee.setJOB_ID(jobId);
        employee.setSALARY(salary);
        
        // Then
        assertEquals(employeeId, employee.getEMPLOYEE_ID());
        assertEquals(firstName, employee.getFIRST_NAME());
        assertEquals(lastName, employee.getLAST_NAME());
        assertEquals(email, employee.getEMAIL());
        assertEquals(phoneNumber, employee.getPHONE_NUMBER());
        assertEquals(hireDate, employee.getHIRE_DATE());
        assertEquals(jobId, employee.getJOB_ID());
        assertEquals(salary, employee.getSALARY());
    }
    
    @Test
    public void testDefaultConstructor() {
        // When
        Employee employee = new Employee();
        
        // Then
        assertNotNull(employee);
    }
    
    @Test
    public void testParameterizedConstructor() {
        // Given
        int employeeId = 1;
        String firstName = "John";
        String lastName = "Doe";
        String email = "john.doe@example.com";
        String phoneNumber = "1234567890";
        String hireDate = "2023-06-14";
        String jobId = "001";
        String salary = "5000";
        
        // When
        Employee employee = new Employee(employeeId, firstName, lastName, email, phoneNumber, hireDate, jobId, salary);
        
        // Then
        assertEquals(employeeId, employee.getEMPLOYEE_ID());
        assertEquals(firstName, employee.getFIRST_NAME());
        assertEquals(lastName, employee.getLAST_NAME());
        assertEquals(email, employee.getEMAIL());
        assertEquals(phoneNumber, employee.getPHONE_NUMBER());
        assertEquals(hireDate, employee.getHIRE_DATE());
        assertEquals(jobId, employee.getJOB_ID());
        assertEquals(salary, employee.getSALARY());
    }
}




