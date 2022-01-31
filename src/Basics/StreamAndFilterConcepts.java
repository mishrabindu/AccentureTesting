package Basics;

import java.util.ArrayList;

public class StreamAndFilterConcepts {

	public static void main(String[] args) {

		ArrayList<String> nameslist= new ArrayList<String>();
		
		nameslist.add("bindu IBM");
		nameslist.add("mishra IBM");
		nameslist.add("vidushi");
		nameslist.add("ankur");
		nameslist.add("awasthi");
		
//		for( String e : nameslist ) {
//			System.out.println(e);
//		}
		
		nameslist.stream().forEach(ele -> System.out.println(ele));
//		nameslist.stream().filter(ele->ele.contains( "IBM")).forEach(ele -> System.out.println(ele));
//		
//		
//		nameslist.stream().forEach(ele -> System.out.println(ele));
//		
//		nameslist.stream().filter(ele->ele.contains("IBM")).forEach(ele -> System.out.println(ele));
		
	}

}
