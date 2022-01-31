package Basics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		System.out.println(ar.size());
		
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());

		ar.add(300);
		ar.add(400);
		ar.add(600);
		ar.add(700);
		ar.add(800);
		ar.add(900);
		
		for(int e : ar) {
			System.out.println(e);
		}

		
//		System.out.println(ar.size());
//		
//		System.out.println(ar.get(0));
//		
//		System.out.println(ar.get(7));
////		System.out.println(ar.get(9));
//		
//		System.out.println(ar); //[100, 200, 300, 400, 600, 700, 800, 900] for array list but fr array we get garbage value
//
//		System.out.println(ar.remove(2));
//		System.out.println(ar);
//		System.out.println(ar.get(6));
//		System.out.println(ar.get(7));
//
//
//		
//		
//		
//		
//		
//
	}

}
