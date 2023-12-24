import java.util.*;
public class StudentGradeCalculator 
{

	public static void main(String[] args)
	{
		double average=0,sum=0,n;
		Scanner sc =new Scanner(System.in);
		System.out.println("THE PROGRAM OF STUDENT GRADE CALCULATOR");
		System.out.println("Enter the no of Subject:");
		int subject_no=sc.nextInt();
		for(int i=1;i<=subject_no;i++)
		{
			System.out.println("Enter the marks for subject "+i);
			n=sc.nextDouble();
			if(n<0)
			{
				System.out.println("Invalid marks");
			}
			else 
			{
				sum=sum+n;
			}
		}
		System.out.println("sum of marks :"+sum);
		average=sum/subject_no;
		System.out.println("Average of marks :"+average);
		if(average>=90)
		{
			System.out.println("Grade:A");
		}
		else if(average>=80)
		
		{
			System.out.println("Grade:B");
		}
		else if(average>70)
		{
			System.out.println("Grade:C");
		}
		else if(average>60)
		{
			System.out.println("Grade:D");
		}
		else
		{
			System.out.println("Grade:E");
		}

	}

}
