package LambdaSeries_SectionFive_Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Sup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Supplier is predefined functional interface used to get the value 
		//Method includes is get
		
		Supplier<Date> sup  = ()->new Date();
		
		System.out.println(sup.get());
	}

}
