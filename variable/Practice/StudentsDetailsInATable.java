// package Practice;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

class Student{
	String ID;
	String name;
 	int marks;

	Student(String ID, String name, int marks){
		this.ID=ID;
		this.name=name;
		this.marks=marks;
	}
	
}

public class StudentsDetailsInATable{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		ArrayList<Student> studentList= new ArrayList<>();
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
				studentList.add(new Student(ID, name, marks));
				System.out.println();
			}
			System.out.println("\nAll Students Details");
			System.out.println("-------------------------------------");
			System.out.printf("%-10s %-20s %-10s%n", "Id", "Name", "Marks");
			System.out.println("-------------------------------------");
			for(Student s:studentList){
				String marksDisplay=(s.marks >=0) ? String.valueOf(s.marks):"?";
				System.out.printf("%-10s %-20s %-10s%n", s.ID, s.name, marksDisplay);
			}
			System.out.println("-------------------------------------");
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

