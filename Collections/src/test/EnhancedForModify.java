package test;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForModify {

	public static void main(String[] args) {
		List<String> lijst = new ArrayList<>();
		lijst.add("piraat");
		lijst.add("smurf");
		lijst.add("kabouter");
		lijst.add("draak");
		lijst.add("engel");
		lijst.add("vampier");
		lijst.add("robot");
		
		for (String string : lijst) {
			string = "vervanging";
			System.out.println(string);
		}
		
		for (String string : lijst) {
			System.out.println(string);
		}

	}

}
