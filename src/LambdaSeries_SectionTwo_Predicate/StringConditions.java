package LambdaSeries_SectionTwo_Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StringConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<String> pr = (s) -> (s.length() > 4);

		System.out.println(pr.test("tests"));

		ArrayList<String> al = new ArrayList<>();

		al.add("dfsdfs");
		al.add("sd");

		for (String sn : al)

		{
			System.out.println(pr.test(sn));
		}

	}

}
