package oops;
/**
 * 
 * @author Mukesh Kumar Maurya
 *
 */
public class Inheritance {

	public static void main(String[] args) {
	

	}

}

class Parent {
	protected String sirName;
	protected double income;
	protected int fame;
	public String getSirName() {
		return sirName;
	}
	public void setSirName(String sirName) {
		this.sirName = sirName;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public int getFame() {
		return fame;
	}
	public void setFame(int fame) {
		this.fame = fame;
	}
	
}

class Child extends Parent{
	
}
