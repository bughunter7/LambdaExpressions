package LambdaSeries_SectionTwo_Predicate;

import java.util.function.Predicate;

public class Predicate_Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num []  = {3,4,5,34,44,42,23,84,4,12};
		
		Predicate<Integer>  pone = (n)->(n%2==0);
		Predicate<Integer> ptwo  = (n)->(n>25);
		
		// We can use -> and , or , negate 
		
		for(int n : num)
		{
			if(pone.and(ptwo).test(n))
			{
				System.out.println(n);
			}
		}
		

	}

}
