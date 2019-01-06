package intro_to_array_lists;
import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> str = new ArrayList<String>();
		
		//2. Add five Strings to your list
		str.add("String a");
		str.add("String b");
		str.add("String c");
		str.add("String d");
		str.add("String e");
		
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < str.size(); i++)
			System.out.println(str.get(i));
		System.out.println();
		
		//4. Print all the Strings using a for-each loop
		for(String s : str)
			System.out.println(s);
		System.out.println();
		
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < str.size(); i += 2)
			System.out.println(str.get(i));
		System.out.println();
		
		//6. Print all the Strings in reverse order.
		for(int i = str.size() - 1; i >= 0; i--)
			System.out.println(str.get(i));
		System.out.println();
		
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < str.size(); i++)
			if(str.get(i).indexOf("e") != -1)
				System.out.println(str.get(i));
	}
}
