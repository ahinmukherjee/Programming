interface Cricket{
	void test();
}

interface Chess{
	void chess();
}

interface Sports{
	void sports();
}

class  MultipleInheritanceJava implements Cricket, Chess, Sports {
	public void test(){
		System.out.println("I love Test Format, in cricket");
	}
	public void chess(){
		System.out.println("Chess is very historical sports");
	}
	public void sports(){
		System.out.println("Sports");
	}
	public static void main(String args[]){
		MultipleInheritanceJava c= new MultipleInheritanceJava();
		c.test();
		c.chess();
		c.sports();
	}
}
