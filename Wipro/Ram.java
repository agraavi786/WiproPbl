public class Ram {
	public static void main(String args[])
	{
		int age;
		age = Integer.parseInt(args[0]);
		if (age>18) {
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("Noy eligible for voting");
		}
	}

}