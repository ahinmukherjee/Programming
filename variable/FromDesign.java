import java.util.*;
public class FromDesign{
    public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
        try{
            System.out.println("Enter first name:\t");
            String name= sc.nextLine();
            System.out.println("Enter last name:\t");
            String name2= sc.nextLine();
            System.out.println("Enter Your age:\t");
            int age= sc.nextInt();
            System.out.println("Enter your blood group:\t");
            String blood= sc.nextLine();
            System.out.println("Your name is:"+name+" "+name2);
            System.out.println("Your age is:"+age);
            System.out.println("Your Blood is:"+blood+"+");
        }
        catch(InputMismatchException ime){
            System.out.println("Doesn't match valid inputs format: "+ime);
        }
        catch(Exception e){
            System.out.println("Plz enter courrect input"+e);
        }
        finally{
		    sc.close();
	    } 
    }
}