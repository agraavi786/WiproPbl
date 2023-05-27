//import java.util.Scanner;
//import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
//		int m;
//		System.out.println("Enter month");
//		Scanner d= new Scanner (System.in);
//		m= d.nextInt();
		switch(args[0])
		{
		case "1":  //m=1;
		System.out.println("january");
		break;
		case "2"://m=2;
		System.out.println("february");
		break;
		case "3"://m=3;
		System.out.println("March");
		break;
		case "4"://m=4;
		System.out.println("April");
		break;
		case "5"://m=5;
		System.out.println("may");
		break;
		case "6"://m=6;
		System.out.println("june");
		break;
		case "7"://m=7;
		System.out.println("july");
		break;
		case "8"://m=8;
		System.out.println("August");
		break;
		case "9"://m=9;
		System.out.println("September");
		break;
		case "10"://m=10;
		System.out.println("October");
		break;
		case "11"://m=11;
			System.out.println("November");
			break;
		case "12"://m=12;
			System.out.println("December");
			break;
		default:
			System.out.println("Please Enter month in number");
		
			
		}
		
	}

}