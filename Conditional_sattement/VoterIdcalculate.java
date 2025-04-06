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
            if(18<=n){
                System.out.println("Voter card is availabel");
            }
    
            else{
                System.out.println("Voter card not availabel");
            }
    
    
    }
}
