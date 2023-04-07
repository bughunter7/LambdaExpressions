package LambdaSeries_SectionTwo_Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeMultiTest {

	
	String Ename;
	String City;
	
	public EmployeeMultiTest(String Ename,String City) {
		// TODO Auto-generated constructor stub
		this.Ename = Ename;
		this.City = City;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<EmployeeMultiTest> pr = (e) -> (e.Ename.length()>4 && e.City.length()>4);
		
		EmployeeMultiTest obj   = new EmployeeMultiTest("test","ssssfs");
		
		System.out.println(pr.test(obj));
		
		ArrayList<EmployeeMultiTest> al  = new ArrayList<>();
		
		al.add(new EmployeeMultiTest("SFDFDS","SDFSD"));
		al.add(new EmployeeMultiTest("adsa", "sda"));
		
		for(EmployeeMultiTest eb : al)
		{
			if(pr.test(eb))
			{
				System.out.println(eb.City);
			}
		}
		

	}

}
