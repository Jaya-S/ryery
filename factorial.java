# ryery
import java.util.Scanner;

public class factorial {
	public static void main(String []args){
		Scanner s=new Scanner (System.in);
		int n,i,fact=1;
		System.out.println("Enter the integer to caluclate the factorial");
		n=s.nextInt();
		if(n<0)
		System.out.println("Enter the non negtive numbers");
		else
		{
			for(i=1;i<n;i++){
				fact=fact*i;
			}
				System.out.println("The factorial of "+n+" is="+fact);
			}
		}

}
