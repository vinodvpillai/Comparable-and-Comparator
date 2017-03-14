/**
 * IdComparator
 * Created on March 10, 2017
 * @author Vinod Pillai <vinodthebest@gmail.com>
 * @version 1.0
 * 
 */
package com.vinod.comparator;

import java.util.Comparator;

import com.vinod.comparable.Student;

public class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
	
		return o1.getId()-o2.getId();
	}

}
