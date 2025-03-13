class Array{
    int[] arr = {10, 20, 30, 40, 50};
    int target = -30;
    boolean found = false;

void find(){
    for (int num : arr) {
        if (num == target) {
            found = true;
            break;
        }
    }
    
    System.out.println("Element " + target + " found: " + found);
    }
}

public class FindElementsInArrayUsingObjCall {
    public static void main(String[] args) {
        Array a= new Array();
        a.find();
        
    }
}
