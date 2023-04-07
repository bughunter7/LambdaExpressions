package LamdaSeries_SectionOne_Printing;

interface paramtest
{
	public void namedisplay(String fname,String lname);

}

public class PrintingWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		paramtest obj  = (String s1, String s2)->{System.out.println("My first name is "+s1 + " My last name is "+s2);};
		
		obj.namedisplay("Shubham","Parab");
		
		
	}

}
