package LambdaSeries_SectionThree_Function;

import java.util.function.Function;

public class FunctTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer, Integer> fn  = (n)->(n*2);
		int t  = fn.apply(5);
		
		System.out.println(t);
		
		

	}

}
