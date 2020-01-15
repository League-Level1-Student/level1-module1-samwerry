package _05_vault;

public class JamesBond {

	
	int findCode(Vault v ){
		for(int i =0; i < 1000000; i++) {
			boolean check = v.trycode(i);
			if(check==true) {
				return(i);
				
			}
			
		}
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		JamesBond james = new JamesBond();
		
		Vault v= new Vault();
		v.secretCode = 345621;
		int code = james.findCode(v);
		
		System.out.println(code);
	}
}
