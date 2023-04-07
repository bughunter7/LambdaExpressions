package LamdaSeries_SectionOne_Printing;

interface testprnt
{
	public void pline();
	
	
	}

public class BasicPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testprnt tl  = ()->{System.out.println("test line ");};
		
		testprnt t2  = ()->System.out.println("test line without curly ");
		tl.pline();
		t2.pline();
	}

}
