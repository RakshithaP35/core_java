package com.xworkz.interfaceconcept.markerInterface;

public class StudentTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		Subject sub = new Subject("Physics", "Chemistry");
		
		Student s = new Student();
		s.age = 19;
		s.name= "Ram";
		s.phno= 987654321;
		System.out.println(s.subject);
		
		System.out.println("HashCode of s: "+ s.hashCode());
		System.out.println(s);
		Student s1 = (Student)s.clone();
		s1.name="seetha";
		System.out.println("HashCode of s: "+ s1.hashCode());
		System.out.println(s1);
		
		Student s2 = s;
		System.out.println("HashCode of s: "+ s2.hashCode());



	}

}
