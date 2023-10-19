import java.util.Scanner;
//Base class
class Employee
{
	int number_of_employee;
	String field;
	int avg_salary;
}

class Manager extends Employee
{
	Manager()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employees:");
		number_of_employee = sc.nextInt();
		System.out.print("\nEnter the average salary of manager:");
		avg_salary = sc.nextInt();
	}
}

class Engineer extends Employee
{
	Engineer()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of engineers:");
		number_of_employee = sc.nextInt();
		System.out.print("\nEnter the average salary of an engineer:");
		avg_salary = sc.nextInt();
	}
}

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Give MANAGER info:");
		Manager obj1 = new Manager();
		System.out.println("Give ENGINEER info:");
		Engineer obj2 = new Engineer();
	}
}		