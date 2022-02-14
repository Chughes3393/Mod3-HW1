package Lessons;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;


public class ArrayLessonsHW {
	
	public static void main(String[] args) {
		
		ArrayList<String> rockers = new ArrayList<>();
		
		rockers.add("Lux Interior");
		rockers.add("Danzig");
		rockers.add("Ozzy Osbourne");
		rockers.add("Neil Young");
		rockers.add("Elvis Presley");
		rockers.add("Little Richard");
		
		System.out.println(rockers);
		
//		Write program to copy one array list into another
		ArrayList<String> newRockers = new ArrayList<>();
		
		newRockers.add("Jack White");
		newRockers.addAll(rockers);
		
		System.out.println(newRockers);
		
//		Write a Java program to extract a portion of an array list
		
		String str = rockers.get(3);
		
		System.out.println(str);
		
		ArrayList<String> moreRockers = new ArrayList<>();
		
		moreRockers.add(rockers.get(0));
		moreRockers.add(rockers.get(1));
		moreRockers.add(rockers.get(3));
		
		System.out.println(moreRockers);
		
		// Write a Java program -- swap two elements in an array list
		// swap indexes 0 & 1
		
		
		str = rockers.get(0);
		rockers.set(0, rockers.get(1));
		rockers.set(1, str);
		System.out.println(rockers);
		
		

		// Write a Java program to test an array list is empty or not
		
		ArrayList<String> noRockers = new ArrayList<>();
		
		if (noRockers.size() != 0) {
			System.out.println("Rock out!");
		} else {
			System.out.println("Crickets");
		}
		
		
		// Write a Java program to replace the second element of an ArrayList with the specified element.
		// specified element is index of 2
		
		str = rockers.get(3);
		rockers.set(3, rockers.get(2));
		rockers.set(2, str);
		System.out.println(rockers);

		// Write a Java program to trim the capacity of an array list the current list size
		
		rockers.trimToSize();
		System.out.println(rockers);
		
		
	}

}
