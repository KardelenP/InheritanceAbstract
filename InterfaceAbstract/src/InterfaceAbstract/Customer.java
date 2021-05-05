package InterfaceAbstract;

import java.time.LocalDate;

public class Customer {
	
	public static final String FirstName = null;
	public String firstName;
	public String lastName;
	public LocalDate DateOfBirth;
	public String NationalityId;
	
	public Customer() {
		
	}
	
	
	public Customer(String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		DateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}


}
