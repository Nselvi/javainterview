package interview;

import java.util.LinkedList;
import java.util.*;  

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedListReverse {

	public static void main(String[] args) {


		LinkedList<String> ll=new LinkedList<String>();  
        ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
        //Traversing the list of elements in reverse order  
        java.util.Iterator<String> i=ll.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
          
}  
}  

	