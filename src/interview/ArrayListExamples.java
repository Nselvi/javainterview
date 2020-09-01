package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(3);
		System.out.println(list);
		list.add(1, 7);
		System.out.println(list);
		list.set(0, 9);
		// list.remove(1);

		System.out.println(list);
		System.out.println("List size : " + list.size());

		for (Integer str : list)
			System.out.println(str);

		System.out.println("*******");

		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pineapple");
		
		Collections.sort(fruits, Collections.reverseOrder());
		System.out.println(fruits);
		
//		Collections.sort(fruits);
//		Collections.reverse(fruits); //Bu sekilde de olur.
//		System.out.println(fruits);
		
Collections.sort(fruits);
		System.out.println(fruits.get(0));
		System.out.println(fruits.contains("Banana"));

		System.out.println(fruits);
		for (String str : fruits) {
			System.out.println(str);
		}
		//fruits.clear();
		//System.out.println(fruits);
		
	//Method 1: Anonymous inner class method to initialize ArrayList	
		ArrayList<String> cities = new ArrayList<String>(){{
			   add("Delhi");
			   add("Agra");
			   add("Chennai");
			   }};
		  System.out.println("Content of Array list cities:"+cities);
		  
		  
		//Method 2: Initialization using Arrays.asList  
		  ArrayList<String> obj = new ArrayList<String>(
					Arrays.asList("Pratap", "Peter", "Harsh"));
				  System.out.println("Elements are:"+obj);
				  
				//Normal way 
				  ArrayList<String> books = new ArrayList<String>();
				   books.add("Java Book1");
				   books.add("Java Book2");
				   books.add("Java Book3");
				  System.out.println("Books stored in array list are: "+books);	  
	   
				  
			//Collections.nCopies method.Same element n times	  
				  ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
				  System.out.println("ArrayList items: "+intlist);
	//al.addAll(al2);iki listi birlestirir.
				  
				  ArrayList<String> friendsnames= new ArrayList<String>();
					friendsnames.add("Ankur");
					friendsnames.add("Ajeet");
					friendsnames.add("Harsh");
					friendsnames.add("John");

					/*ArrayList to Array Conversion */
					String frnames[]=friendsnames.toArray(new String[friendsnames.size()]);

					/*Displaying Array elements*/
					for(String k: frnames)
					{
						System.out.println(k);
					}
	
	}

	}

