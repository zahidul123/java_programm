import java.util.*;
public class JavaOutputFormatting {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            
            System.out.print(s1);
            
            for(int j=s1.length();j<15;j++) {
            	System.out.print(" ");
            }
            
            int j=String.valueOf(x).length(); //finding how many digits
            
            if(j<3) {
         
            	for(int l=0;l<(3-j);l++) {
            		System.out.print("0");
            	}
            }
            System.out.println(x);
            
        }
        System.out.println("================================");
	}

}
