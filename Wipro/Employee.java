public class Employee {

    private int Emp_No[] = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
    private String Emp_Name[] = { "Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay" };
    private String Join_Nate[] = { "01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000",
            "12/06/2006" };
    private char Designation_Code[] = { 'e', 'c', 'k', 'r', 'm', 'e', 'c' };
    private String Department[] = { "R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM" };
    private int Basic[] = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
    private int HRA[] = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
    private int IT[] = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };
    
    private int calcDA(int i) {
        char designation = Designation_Code[i];
        switch(designation) {
            case 'e': return 20000;
            case 'c': return 32000;
            case 'k': return 12000;
            case 'r': return 15000;
            case 'm': return 40000;
        }
        return 0;
    }

    private char getDesigCode(int no) {
        return Designation_Code[getIndex(no)];
    }

    private int getIndex(int no) {
        int index = -1;
        for(int i = 0; i < Emp_No.length; i++) {
            if(no == Emp_No[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
    public int getSalary(int no) {
        int index = getIndex(no);
        if(index == -1) return -1;
        return (Basic[index] + HRA[index] - IT[index] + calcDA(index));
    }

    public String getName(int no) {
        return Emp_Name[getIndex(no)];
    }

    public String getDept(int no) {
        return Department[getIndex(no)];
    }

    public boolean empExists(int no) {
        if(getIndex(no) != -1)
            return true;
        else
            return false;
    }

    public String getDesignation(int no) {
        char d = getDesigCode(no);
        switch(d) {
            case 'e': return "Engineer";
            case 'c': return "Consultant";
            case 'k': return "Clerk";
            case 'r': return "Receptionist";
            case 'm': return "Manager";
        }
        return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("Usage: java Employee emp_id");
		}
		else {
			int Emp_No = Integer.parseInt(args[0]);
			Employee emp = new Employee();
			if(emp.empExists(Emp_No)) {
				System.out.println("Emp No.  Emp Name  Department  Designation  Salary");
				System.out.printf("%d    ", Emp_No);
				System.out.printf("%s          ", emp.getName(Emp_No));
				System.out.printf("%s    ", emp.getDept(Emp_No));
				System.out.printf("%s    ", emp.getDesignation(Emp_No));
				System.out.printf("%d\n", emp.getSalary(Emp_No));
			}
			else {
				System.out.println("There is no employee with empid: " + Emp_No);
			}
		}
	}
}