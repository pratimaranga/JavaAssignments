package Nov8_2020;

public class WhileHelloWorld {
	public static void main(String[] args) {
		int i=10;
		while(i>=1) {
			
			System.out.println("Hello World");
			
			i--;
		}
		
	System.out.println("------------");	
		int k=1;
		while(k<=10) {
			
			System.out.println(k);
			if(k%7 ==0) {
				break;
			}
			k++;
		}

  }
	
}
