import java.util.*;
class SignalTest {
     void red(){
		System.out.println("Signal is Red.");	
	}
	void yellow(){
		System.out.println("Signal is Yellow.");	
	}
	void green(){
		System.out.println("Signal is Green. Ready for your journey.");	
	}	
}

public class TrafficSignelTest {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        SignalTest st= new SignalTest();
        try{
                System.out.println("Plz enter traffic signel");
                String nu = sc.nextLine();
                System.out.println("Enter 1 for Red || Enter 2 for Yellow || Enter 3 for Green || Enter for exit");
                int choices=sc.nextInt();
            
            switch(choices){
            case 1: 
                st.red();
                break;
            case 2: 
                st.yellow();
                break;
            case 3: 
                st.green();
                break;
            case 4: 
                System.exit(0);
            default:
                System.out.println("Plz enter the screen numbers");
            }
        
        }
        catch(ArithmeticException ae){
            System.out.println("Doesn't divisibel by zero: "+ae);;
        }
        catch(InputMismatchException ime){
            System.out.println("Doesn't match valid input numbers: "+ime);
        }
        catch(Exception e){
            System.out.println("Doesn't match input numbers"+e);
        }
        finally{
            sc.close();
        }
         
    }
}
