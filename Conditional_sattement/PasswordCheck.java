import java.util.Scanner;

public class PasswordCheck {
    public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Username\n");
 	    String username = sc.nextLine();
	    System.out.print("Enter Password");
	    String password = sc.nextLine();
	    PasswordIdentify pc= new PasswordIdentify();
		pc.PasswordCheckr();
        sc.close();
    }
}


class PasswordIdentify{
	void PasswordCheckr(){
		System.out.print("Plz ennter your password");
		String a= sc.nextLine();
		if(a!=password){
			System.out.print("Plz enter your correct Password");
		}
	}
}