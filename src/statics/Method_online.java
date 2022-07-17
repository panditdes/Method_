package statics;

public class Method_online {
	static int logic (int x, int y) {
        int z;
        
        if(x>y) {
        	z = x+y;
        }
        else {
        	z = (x + y)*5;
        }
        	return z;
        
        }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 5;
		int b = 7;
        int c = (a+b)*5;
        System.out.println(c);
        int a1 = 5;
		int b1 = 7;
        int c1 = (a1+b1)*5;
        System.out.println(c1);*/
        
        // we have to use again and again so i dont want to use.
        //so i want to make one method and use that method whenever o need
		//that is simple but if program get comlicated like below
		int a = 5;
		int b = 7;
        int c;
        c = logic(a,b);
        //same logic we can use for a1 and b1
        
        System.out.println(c);
	
	int a1 = 2;
	int b1 = 1;
    int c1;
    
    c1 = logic(a1,b1);
   
    
    
    System.out.println(c1);
    
    }
}
	
