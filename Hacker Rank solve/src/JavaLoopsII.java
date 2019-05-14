import java.util.Scanner;

public class JavaLoopsII {
	
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res=0,put;
            
            for(int j=0;j<n;j++) {
            	res=(res*2)+1;
            	put=a+(res*b);
            	System.out.print(put+" ");
            }
            System.out.print("\n");
        }
        in.close();
    }

}
