package LambdaSeries_SectionThree_Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmpFilter {

	String Ename;
	Integer Salary;
	
	public EmpFilter(String Ename,Integer Salary) {
		// TODO Auto-generated constructor stub
		this.Ename  = Ename;
		this.Salary = Salary;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<EmpFilter, Integer> fn  = (n)->(n.Salary*10/100);
		
		ArrayList<EmpFilter> al  = new ArrayList<>();
		
		al.add(new EmpFilter("Ganesha",554444));
		al.add(new EmpFilter("Shubham", 55555));
		
		Predicate<Integer> pr  = (n)->(n>50000);
		
		for(EmpFilter e  : al)
		{
			int bonus  = fn.apply(e);
			
			//System.out.println(bonus);
			
			if(pr.test(bonus))
			{
				System.out.println("This is my Actual Bonus "+bonus + "For employee "+e.Ename);
			}
		}
		

	}

}
