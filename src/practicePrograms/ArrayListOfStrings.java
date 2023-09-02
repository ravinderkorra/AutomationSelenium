package practicePrograms;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfStrings {

	public static void main(String[] args) {
		  ArrayList<String> al = new ArrayList<>();
		  
	        // Adding elements to ArrayList
	        // Cutom inpus
	        al.add("Geeks");
	        al.add("Geeks");
	 
	        // Here we are mentioning the index
	        // at which it is to be added
	        al.add(1, "For");
	 
	        // Printing all the elements in an ArrayList
	        System.out.println(al);
	    
	}}