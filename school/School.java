package school;

import java.util.List;

import Student.Student;
import Teacher.Teacher;

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static double TotalMoneyEarned;
	private static double TotalMoneySpent;
	
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		TotalMoneyEarned = 0;
		TotalMoneySpent = 0;
	}

	public List<Teacher> getTeacher() {
		return teachers;
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public List<Student> getStudent() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public double getTotalMoneyEarned() {
		return TotalMoneyEarned;
	}

	public static void updateTotalMoneyEarned(double MoneyEarned) {
		TotalMoneyEarned +=MoneyEarned;
	}

	public double getTotalMoneySpent() {
		return TotalMoneySpent;
	}

	public static void updateTotalMoneySpent(double MoneySpent) {
		TotalMoneyEarned -= MoneySpent;
		TotalMoneySpent+=MoneySpent;
	}
     @Override
     public String toString()
     {
    	 return "Total Money Earned = "+TotalMoneyEarned+" "+"Total Money Spent = "+TotalMoneySpent+" "+teachers+" "+students;
     }
	
}
