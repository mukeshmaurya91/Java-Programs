package oops;
/**
 * This class demonstrate Data hiding 
 * Data Hiding- Internal data should not go out directly, After Validation or Authentication out side one can access our internal  data.
 * Advantage- Security improvement
 * 
 * @author Mukesh Kumar Maurya
 *
 */
public class DataHiding {
  
	public static void main(String[] args){
		Account acc=new Account();
		acc.setAccNo(123);    // Only 123 account number have access to get balance. *take it as a login process  
		System.out.println("Balance in account number 123: "+acc.getBalence());
	}
}

// The Account class data member not accessible directly out side, there are must be some methods which validate everything before providing access.
class Account{
	private int accNo; 
	private double balence;
	
	public int getAccNo() {
		//To get account number validation required
		return accNo;
	}
	public void setAccNo(int accNo) {
		//Authentication required
		this.accNo = accNo;
		setBalence(getAccNo()*4); // this is just an example.
	}
	public double getBalence() {
		//Authentication required then only return balance.
		return balence;
	}
	public void setBalence(double balence) {
		//before setting balance of an account Authentication required
		this.balence = balence;
	}
	
}
