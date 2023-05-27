

public class Project1{
	
    private int Emp_No[] = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
    private String Emp_Name[] = { "Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay" };
    private String Join_Nate[] = { "01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000",
            "12/06/2006" };
    private char Designation_Code[] = { 'e', 'c', 'k', 'r', 'm', 'e', 'c' };
    private String Department[] = { "R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM" };
    private int Basic[] = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
    private int HRA[] = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
    private int IT[] = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };
    
    
    private int calDA(int i) {
    	char Deg = Designation_Code[i];
    	switch(Deg) {
    	case 'e': return 20000;
        case 'c': return 32000;
        case 'k': return 12000;
        case 'r': return 15000;
        case 'm': return 40000;
    }
    return 0;
}
    
    public int get_Index(int no) {
    	int Index=-1;
    	for(int j=0;j<Emp_No.length;j++) {
    		if(no==Emp_No[j]) {
    			Index =j;
    			break;
    		}
    		
    	}
    	return Index;
    }
    
    public String getE_Name(int no) {
    	return Emp_Name[get_Index(no)];
    }
    public String getDepart(int no) {
    	return Department[get_Index(no)];
    }
    public int getSalary(int no) {
    	int Indx = get_Index(no);
    	return (Basic[Indx] + HRA[Indx] - IT[Indx] + calDA(Indx));
    }
    public  char getDesigcode(int no) {
    	return Designation_Code[get_Index(no)];
    }
    
    
    
    public String getDesignation(int no) {
        char d = getDesigcode(no);
        switch(d) {
            case 'e': return "Engineer";
            case 'c': return "Consultant";
            case 'k': return "Clerk";
            case 'r': return "Receptionist";
            case 'm': return "Manager";
        }
        return null;
    }
        
        
        public boolean Emp_Exists(int no) {
        	if(get_Index(no)!= -1) 
        		return true;
            else
        	     return false; 
        }

    

public static void main(String[] args)
{
	// TODO Auto-generated method stub
	if(args.length!=1) {
		System.out.println("Pleasew Enter Employee Number");
	}
	else
	{
		int Emp_No=Integer.parseInt(args[0]);
		Project1 p = new Project1();
		if(p.Emp_Exists(Emp_No))
		{
			System.out.println("Emp No    Emp Name    Department    Designation    Salary");
			System.out.printf("%d ", Emp_No);
			System.out.printf("%11s  ", p.getE_Name(Emp_No));
			System.out.printf("%12s", p.getDepart(Emp_No));
			System.out.printf("%13s  ", p.getDesignation(Emp_No));
			System.out.printf("%11d\n", p.getSalary(Emp_No));
		}
		else
		{
			System.out.println("There is no Employee with " + Emp_No);
		}
	}
}
}
