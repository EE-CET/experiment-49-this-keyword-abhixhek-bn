import java.util.Scanner;

class ThisDemo {
    int value;
    void setValue(int value){
	this.value=value;
    }
    void display(){
	System.out.println("Value: "+value);
    }
    // TODO: Define setValue(int value)
    // Use 'this.value = value' to resolve naming conflict
    
    // TODO: Define display() to print "Value: " + value
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read the integer input
        int n=sc.nextInt();
	ThisDemo ob=new ThisDemo();
        ob.setValue(n);
	ob.display();
    }
}
