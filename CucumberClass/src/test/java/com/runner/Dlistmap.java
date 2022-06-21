package com.runner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class Dlistmap {
	public static void main(String[] args) {
//		//1D without header
//		List<String> emp = new ArrayList<String>();
//		emp.add("Subash");
//		emp.add("Subash@gmail.com");
//		emp.add("Selenium");
//		
//		String name = emp.get(2);
//		System.out.println(name);
		
		
//		//2D without header
//		List<ArrayList<String>> emp1 = new ArrayList<ArrayList<String>>();
//		
//		ArrayList<String> a1 = new ArrayList<String>();
//		a1.add("Subash");
//		a1.add("Subash@gmail.com");
//		a1.add("Selenium");
//		
//		ArrayList<String> a2 = new ArrayList<String>();
//		a2.add("Sankar");
//		a2.add("Sankar@gmail.com");
//		a2.add("API");
//
//		ArrayList<String> a3 = new ArrayList<String>();
//		a3.add("Mani");
//		a3.add("Mani@gmail.com");
//		a3.add("Java");
//		
//		ArrayList<String> a4 = new ArrayList<String>();
//		a4.add("Karan");
//		a4.add("Karan@gmail.com");
//		a4.add("Appium");
//		
//		//Outer list
//		emp1.add(a1);
//		emp1.add(a2);
//		emp1.add(a3);
//		emp1.add(a4);
//		
//		//Outer list retrieve
//		ArrayList<String> a = emp1.get(2);
//		
//		//Inner list retrieve
//		String name = a.get(1);
//		System.out.println(name);
		
//		//1D with header
//		Map<String, String> emp2 = new LinkedHashMap<String, String>();
//		
//		emp2.put("name", "Subash");
//		emp2.put("email", "Subash@gmail.com");
//		emp2.put("course", "Java");
//		
//		String name2 = emp2.get("email");
//		System.out.println(name2);
	
		//2D with header
		List<LinkedHashMap<String, String>> emp3 = new ArrayList<LinkedHashMap<String,String>>();
		
		LinkedHashMap<String, String> m1 = new LinkedHashMap<String,String>();
		m1.put("name", "Subash");
		m1.put("email", "Subash@gmail.com");
		m1.put("course", "Java");
		
		LinkedHashMap<String, String> m2 = new LinkedHashMap<String,String>();
		m2.put("name", "Sankar");
		m2.put("email", "Sankar@gmail.com");
		m2.put("course", "API");
		
		LinkedHashMap<String, String> m3 = new LinkedHashMap<String,String>();
		m3.put("name", "Mani");
		m3.put("email", "Mani@gmail.com");
		m3.put("course", "Appium");
		
		LinkedHashMap<String, String> m4 = new LinkedHashMap<String,String>();
		m4.put("name", "Karan");
		m4.put("email", "Karan@gmail.com");
		m4.put("course", "Selenium");
		
		emp3.add(m1);
		emp3.add(m2);
		emp3.add(m3);
		emp3.add(m4);
		
		LinkedHashMap<String, String> m = emp3.get(2);
		String name3 = m.get("name");
		System.out.println(name3);
		
	}
	

}
