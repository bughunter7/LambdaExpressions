package LambdaSeries_SectionFour_Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmpTest {
	
	String Ename;
	Integer Salary;
	
	public EmpTest(String Ename,Integer Salary) {
		// TODO Auto-generated constructor stub
		this.Ename = Ename;
		this.Salary= Salary;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<EmpTest> aa  = (b)->(b.Salary>5000);
		Function<EmpTest, Integer> fn  = (e)->(e.Salary*10/100);
		
		Consumer<EmpTest> e  = (n)-> System.out.println("This is accept method called value "+n.Salary);
		
		ArrayList<EmpTest> al  =  new ArrayList<>();
		al.add(new EmpTest("Ganesha",100000));
		al.add(new EmpTest("Mahadeva",64343));
		
		
		for(EmpTest ea: al)
		{
			if(aa.test(ea))
			{
				System.out.println(fn.apply(ea));
				e.accept(ea);
			}
		}
		
	}

}
