import java.util.Scanner;
//Base class
class School
{
	int number_of_students;
	String grades;
}

//Derived class
class highSchool extends School
{
	highSchool()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students:");
		number_of_students = sc.nextInt();
	}
}

class elementarySchool extends School
{
	public void getInput()
	{
		
		
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Amount of Students:");
			int n = sc.nextInt();
			elementaryScool[] arr = new  elementaryScool[n];
			for(int i=0;i<n;++i)
			{	
				arr[i] = new  elementaryScool();
				int j=i+1;
				System.out.println("Enter the GRADE of "+j+" Student:");
				arr[i].grades = sc.next();
			}
			System.out.println("GRADES of all Students:");
			for(int i=0;i<n;++i)
			{
				int j=i+1;
				System.out.println("GRADE of "+j+" Student:"+arr[i].grades);
			
			}
		
	}
	
}


public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Enter info for High school:");
		highSchool obj1 = new highSchool();
		System.out.println("Enter info for Elementary school: ");
		elementarySchool obj2 = new elementarySchool();
		obj2.getInput();
	}
}





