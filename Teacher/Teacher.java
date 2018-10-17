package Teacher;

import school.School;

public class Teacher {
	private int id;
	private String name;
	private double salary;
	private double earnedSalary;
	
	public Teacher(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		setEarnedSalary(0);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary= salary;
	}
	
	public void updateEarnedSalary(double salary)
	{
	   setEarnedSalary(getEarnedSalary() + salary);
	   School.updateTotalMoneySpent(salary);
	}

	public double getEarnedSalary() {
		return earnedSalary;
	}

	public void setEarnedSalary(double earnedSalary) {
		this.earnedSalary = earnedSalary;
	}
	@Override
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
}
