public class DefaultValue {
    int a;
    static int s;
    static float b;
    String str;
    boolean c;
    public static void main(String args[]){
	DefaultValue s= new DefaultValue();
        System.out.println(s.a); //0
        System.out.println(s); //0
        System.out.println(b); // 0.0
    }
}

