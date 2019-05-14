import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		String ans;
		sc.close();
		if(i%2!=0) {
			ans="Weird";
		}else {
			if(i>=2&&i<=5) {
				ans="Not Weird";	
			}else if(i>=6&&i<=20) {
				ans="Weird";	
			}else {
				ans="Not Weird";
			}
		}
		
		System.out.println(ans);
	}

}
