public class PowerCalculate {
   public static void main(String args[]){
        TryTest st= new TryTest(2,3);    
    }
}

class TryTest{
	TryTest(int power, int base){
		int a=1;
		for (int i=1; i<=base; i++){
			int a = power*a;
		}
		System.out.println(a);
	}
	
}

