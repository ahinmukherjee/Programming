public class PowerCalculate {  public static void main(String args[]){
	new TryTest(2,4);    
}
}

class TryTest{
TryTest(int base, int power){
	int a=1;
	for (int i=1; i<=power; i++){
		a = base*a;
	}
	System.out.println("Result is:"+a);
}

}

