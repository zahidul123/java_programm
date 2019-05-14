import java.util.Scanner;

public class JavaStaticInitializerBlock {
	static int n,b;
	static boolean flag=true;
	static {
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
	     b=sc.nextInt();
		
	/*	try {
			
			throw new Exception("hi dar");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		*/
		if(n<=0||b<=0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
