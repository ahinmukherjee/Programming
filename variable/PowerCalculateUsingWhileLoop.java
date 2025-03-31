public class PowerCalculateUsingWhileLoop {
    public static void main(String args[]){
        TryPowerCalculate st= new TryPowerCalculate();
	    st.f(2,3);    
    }
}


class TryPowerCalculate{
	void f(int base,int power){
		int result=1;
		while(power>0){
		   result= result*base;
		  power--;	  
		}
		System.out.println("Result is:"+result);
	}	
}
