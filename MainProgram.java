/**
 * MainProgram
 * Created on March 10, 2017
 * @author Vinod Pillai <vinodthebest@gmail.com>
 * @version 1.0
 * 
 */
package com.vinod.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.vinod.comparable.Student;
import com.vinod.comparator.NameComparator;

public class MainProgram {

	public static void main(String[] args) {
		
		List<Student> studentlist=Arrays.asList( new Student(1, "Vinod"),
				new Student(5,"Anil"),
				new Student(22,"Ashok"),
				new Student(3, "Viky")
				);
			
		studentlist.forEach(s -> System.out.println(s));

		studentlist.sort(new NameComparator());
		
		System.out.println("=========== Comparator =================");
		
		studentlist.forEach(s -> System.out.println(s));
		
		System.out.println("============== Comparable ==============");
		
		Collections.sort(studentlist);
		
		studentlist.forEach(s -> System.out.println(s));
	}

}
