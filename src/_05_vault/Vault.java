package _05_vault;

public class Vault {
	int secretCode= 2358763;
	
	
	
	boolean trycode(int number ) {
		if( number== secretCode) {
		
		return true;
	}
		else {
		return false;
		}
		
	}
	
public static void main(String[] args) {
	
	
	Vault v = new Vault();
	
boolean t=	v.trycode(235);
	
	System.out.println(t);
}
}
