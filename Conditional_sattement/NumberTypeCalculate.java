import java.util.Scanner;

public class NumberTypeCalculate {
    public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter value");
	    int a= sc.nextInt();
	    Number nb = new Number();
	    nb.numberCalculate(a);
        sc.close();
    }
}

class Number{
	void numberCalculate(int n){
		if(n>0){
			System.out.println("Number is Positive");
		}
		else if(n<0){
			System.out.println("Number is Negetive");
		}
		else{
			System.out.println("Number is Equal");
		}
	}
}

