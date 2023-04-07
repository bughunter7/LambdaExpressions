package LambdaSeries_SectionTwo_Predicate;

import java.util.function.Predicate;

public class SimpleConditionInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p1 = (n)->(n>10);
		
		System.out.println(p1.test(15));
		System.out.println(p1.test(5));

	}

}
