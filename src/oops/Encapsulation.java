package oops;

/**
 * 
 * @author Mukesh Kumar Maurya
 *
 */
public class Encapsulation {

	public static void main(String[] args) {
		//
	}

}

//Encapsulated class

class Student{
	private String name;
	private long rollNo;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
