package statics;

public class Statics_1 {
static int count =0; //to count how many times it run
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printzerotofive();
		printsixtoten();
	}
public static void printzerotofive() {
	System.out.println("0");
	System.out.println("1");
	System.out.println("2");
	System.out.println("3");
	System.out.println("4");
	System.out.println("5");
	count++;
	System.out.println(count);
	
}
public static void printsixtoten()
{
System.out.println("6");
System.out.println("7");
System.out.println("8");
System.out.println("9");
System.out.println("10");
count++;
System.out.println(count);
printzerotofive();

}

}
