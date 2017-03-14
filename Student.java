/**
 * Student
 * Created on March 10, 2017
 * @author Vinod Pillai <vinodthebest@gmail.com>
 * @version 1.0
 * 
 */
package com.vinod.comparable;

public class Student implements Comparable<Student> {

	private int id;
	private String name;

	public Student() {
		super();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {

		return this.id - o.id;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Student)) {
			return false;
		}

		if (obj instanceof Student) {
			Student temp = (Student) obj;

			if (temp.id != this.id) {
				return false;
			}
		}

		return true;
	}

	@Override
	public String toString() {
		return "[ID : " + this.id + " Name is:" + this.name + "]";
	}

}
