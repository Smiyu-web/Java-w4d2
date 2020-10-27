package schoolManagement;

public class Instructor {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int experienceYear;
	
	public Instructor(String firstName, String lastName, String phoneNumber, int experienceYear) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setExperienceYear(experienceYear);
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public int getExperienceYear() {
		return experienceYear;
	}
	
	public String getStatus() {
		String level = "";
		switch(this.experienceYear) {
		case 1 : 
			return level = "Junior Instructor";
		case 2 : case 3 :
			return level = "Intermediate Instructor";
		default :
			return level = "Senior Instructor";
		}
	}
	
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "Uknown";
		}
	}
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Uknown";
		}
	}
	public void setPhoneNumber(String phoneNumber) {
		if (!phoneNumber.isEmpty() && !phoneNumber.equalsIgnoreCase(null)) {
			this.phoneNumber = phoneNumber;
		} else {
			this.phoneNumber = "Uknown";
		}
	}
	
	public void setExperienceYear(int experienceYear) {
		if (experienceYear < 1) {
			this.experienceYear = 1;
		} else {
			 this.experienceYear = experienceYear;
		}
	}
	

}
