//Add students detalis 

// package Practice;

import java.util.Scanner;
import java.util.InputMismatchException;

class Student{
	void studentDetails(String ID, String name, int marks){
		System.out.println("Student Id is: "+ID);
		System.out.println("Student Name is: "+name);
		if(marks>0){
			System.out.println("Student marks is: "+marks);
		}
		else{
			System.out.println("Student marks is not negative");
			
		}
		
	}
}

public class StudentDetailsAdd{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		Student s= new Student();
		try{
			System.out.println("Enter how many student's details register?");
			int num=sc.nextInt();
			sc.nextLine();
			for(int i=0; i<num;i++){
				System.out.println("Enter student Id");
				String ID=sc.nextLine();
				System.out.println("Enter student name");
				String name=sc.nextLine();
				System.out.println("Enter student marks");
				int marks=sc.nextInt();
				sc.nextLine();
				s.studentDetails(ID, name, marks);
				System.out.println();
			}
        }
       	catch(InputMismatchException ime){
            System.out.println("Doesn't match valid inputs: "+ime);
        }
        catch(Exception e){
            System.out.println("Plz enter valid inputs:"+e);
        }
        finally{
            sc.close();
        }
         
    }
}
