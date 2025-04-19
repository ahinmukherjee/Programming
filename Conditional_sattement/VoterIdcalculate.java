import java.util.*;

public class VoterIdcalculate {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value");
            int age = sc.nextInt();
            Votercalculate vc = new Votercalculate();
            vc.ageCalculate(age);
            sc.close();
        }
    }
    
class Votercalculate{
    void ageCalculate(int n){
        if(n<=18){
            System.out.println("Voter card is not availabel");
        }

        else{
            System.out.println("Voter card is availabel");
        }
    
    
    }
}