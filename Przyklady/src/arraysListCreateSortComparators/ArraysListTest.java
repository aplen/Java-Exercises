package arraysListCreateSortComparators;
import java.util.*;

public class ArraysListTest {

	public static void main(String[] args) {
	
		ArrayList <String> wyrazy = new ArrayList<String>();
		
		wyrazy.add("Jestem ");
		wyrazy.add("programistš ");
		wyrazy.add("hehe ");
		wyrazy.add(" :D :D ");
		wyrazy.add(1, "zajebistym ");
		wyrazy.remove(3);
		
		for(String s:wyrazy)
		{System.out.print(s+" ");}
		
		System.out.println();
		wyrazy.remove(3);
		
		
		for(String s:wyrazy)
		{System.out.print(s+" ");}
		
		System.out.println();
			System.out.println(wyrazy.contains("Jestem "));
			System.out.println(wyrazy.get(1));
			wyrazy.set(1,"przezajebistym");
		
			for(String s:wyrazy)
			{System.out.print(s+" \n");}
				
			ArrayList <Integer> liczby = new ArrayList<Integer>();
			liczby.add(1);
			liczby.add(2);
			liczby.add(4);
			liczby.add(3);
			Collections.sort(liczby);
			System.out.println(liczby);
			
			ArrayList <ArraysListTest> obiekty = new ArrayList<ArraysListTest>();
			
			ArraysListTest dupa = new ArraysListTest();
			
			obiekty.add(dupa);
			
			for(ArraysListTest s:obiekty)
			{System.out.print(s);}
			
			
			
	}

}
