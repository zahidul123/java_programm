import java.util.Scanner;

public class JavaEndoffile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=1;
		while(sc.hasNext()) {
			String lin=sc.nextLine();
			System.out.println(a+" "+lin);
			a++;
		}

	}

}
