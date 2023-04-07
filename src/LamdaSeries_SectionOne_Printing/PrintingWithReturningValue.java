package LamdaSeries_SectionOne_Printing;

interface ReturnTest
{
	
	public String Ronevalue(String fname,String lname);
	
	}
public class PrintingWithReturningValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnTest obj = (String s1,String s2)->{System.out.println("This is my first name "+s1+" This is my LastName "+s2);
												return ("test");};
												
		System.out.println(obj.Ronevalue("testfname","testlname"));

	}

}
