package polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<UserDefineDatatype>listi=new ArrayList<>();
		
		Scanner sc= new Scanner(System.in);
		Scanner sci= new Scanner(System.in);
		String name1,id1;
		Double height1;
		int i=0;
		while(i<2) {
			
			
			name1=sc.next();
			id1=sc.next();
			height1=sci.nextDouble();
			
			UserDefineDatatype udp=new UserDefineDatatype(name1,id1,height1);
			listi.add(udp);
			
			i++;
		}
		
		for(UserDefineDatatype df:listi) {
			
			System.out.println(df);
		}

	}

}
