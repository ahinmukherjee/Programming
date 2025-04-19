import java.util.Scanner;

public class PasswordCheck {
    public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Username: ");
 	    String username = sc.nextLine();
	    System.out.print("Enter Password: ");
	    String password = sc.nextLine();
	    PasswordIdentify pc= new PasswordIdentify();
		pc.PasswordCheckr(password, sc);
        sc.close();
    }
}


class PasswordIdentify{
	void PasswordCheckr(String password, Scanner sc){
		System.out.print("Plz ennter your password");
		String a= sc.nextLine();
		if(!a.equals(password)){
            System.out.println("Incorrect password. Please try again.");
        }
		else {
            System.out.println("Password verified successfully.");
        }
	}
}