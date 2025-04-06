interface pointtable{
    void print();
}
interface showtable{
    void show();
}

public class InterfaceCheck implements pointtable,showtable{

    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Hii");
    }
    public static void main(String args[]){
        InterfaceCheck i=new InterfaceCheck();
            i.print();
            i.show();
    }
}
