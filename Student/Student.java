package Student;

import school.School;

public class Student {

	private int id;
	private String name;
	private int grade;
	private double totalFees;
	private double feesPaid;
	
	public Student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.totalFees = 50000;
		this.feesPaid = 0;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(double totalFees) {
		this.totalFees = totalFees;
	}

	public double getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(double fees) {
		this.feesPaid += fees;
		
		School.updateTotalMoneyEarned(fees);
	}
	@Override
	public String toString()
	{
		return "Id is "+ id+" "+ "Name of student is "+name+" "+"Grade is "+grade;
	}
	

}
