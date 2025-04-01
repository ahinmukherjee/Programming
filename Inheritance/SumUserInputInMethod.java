import java.util.*;

public class SumUserInputInMethod {
    public static void main(String args[]){
        UserInput s= new UserInput();
        s.res();    
    }
}
    
class TryTests{
    int test(int b, int p){
        int result= b+p; 
        System.out.println("Result is:"+result);
        return b+p;
    }
}
    
class UserInput extends TryTests{
    void res(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();
        int finalresult= num + test(20,30);
        System.out.println("Result is:"+finalresult); 
        sc.close();
    }
}