package LambdaSeries_SectionThree_Function;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num  = 5;
		
		//Andthen --> Calls Fone first and then Ftwo
		
		Function<Integer, Integer> fone  = (n)->(n*3);
		Function<Integer, Integer> ftwo  = (n)->(n*2);
		
		
		System.out.println(fone.andThen(ftwo).apply(5));
		
		//Compose --> Calls Ftwo first and then Fone ( Reverse of Andthen )
		
		System.out.println(fone.compose(ftwo).apply(2));
		

	}

}
