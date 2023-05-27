import java.util.Scanner;
class ArgumentNotFound extends Exception{
	public ArgumentNotFound(){
		System.out.println("ArgumentNotFount Please enter a valid Argument");
		
	}
	
}

public class NameAge {
	int a;
	String n;
	public void checkAge(int a) throws ArgumentNotFound{
		if(a>=18 && a<60) {
			System.out.println("Eveything is fine");
			
		}
		else {
			throw new ArgumentNotFound();
			
		}
		
		
	}

	public static void main(String[] args) throws ArgumentNotFound {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enetr the Name");
//		String name = sc.nextLine();
//		System.out.println("Enter the Age");
//		int age= sc.nextInt();
		String name=args[0];
		int age = Integer.parseInt(args[1]);
		NameAge ob = new NameAge();
		ob.checkAge(age);
		
	}

}
