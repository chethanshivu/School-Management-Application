package mainclass;

import java.util.ArrayList;
import java.util.List;

import Student.Student;
import Teacher.Teacher;
import school.School;

public class MainClass {

	public static void main(String[] args) {
		
		Teacher shankar = new Teacher(01, "Shankar",500);
		Teacher sharath = new Teacher(02, "Sharath",200);
		Teacher ajay    = new Teacher(03, "Ajay",   100);
		
		List<Teacher> teacherslist = new ArrayList<Teacher>();
		teacherslist.add(shankar);
		teacherslist.add(sharath);
		teacherslist.add(ajay);
		
		Student shiva  = new Student(01,"Shiva",8);
		Student ram    = new Student(01,"Ram",6);
		Student pranav = new Student(01,"Pranav",5);
		
		List<Student> studentslist = new ArrayList<Student>();
		studentslist.add(shiva);
		studentslist.add(ram);
		studentslist.add(pranav);
		
		School jss = new School(teacherslist, studentslist);
		System.out.println("Total Money Eerned = "+jss.getTotalMoneyEarned());
		
		shiva.setFeesPaid(5000);
		System.out.println("Total Money Eerned = "+jss.getTotalMoneyEarned());
		
		shankar.updateEarnedSalary(shankar.getSalary());
		System.out.println("Total Money Eerned = "+jss.getTotalMoneyEarned());
		
		System.out.println( shankar.toString());
		
		System.out.println( shiva.toString());
		
		System.out.println( jss.toString());
	}

}
