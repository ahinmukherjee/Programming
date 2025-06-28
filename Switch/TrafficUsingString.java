import java.util.Scanner;

class Switch{
	void red(){
		System.out.println("Hello I am Red.");
	}
	void yellow(){
		System.out.println("Hello I am Yellow.");
	}
	void green(){
		System.out.println("Hello I am Green.");
	}
}

public class TrafficUsingString{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		Switch st= new Switch();
		try{
			System.out.println("Enter Red || Enter Yellow || Enter Green || Enter for exit");
               		String color=sc.nextLine();
			switch(color){
            case "red": 
                st.red();
                break;
            case "yellow": 
                st.yellow();
                break;
            case "green": 
                st.green();
                break;
            case "close": 
                System.exit(0);
            default:
                System.out.println("Plz enter the screen numbers");
            }
        }
        catch(ArithmeticException ae){
            System.out.println("Doesn't divisibel by zero: "+ae);;
        }	
	
        catch(Exception e){
            System.out.println("Doesn't match input numbers"+e);
        }
        finally{
            sc.close();
        }
         
    }
}
