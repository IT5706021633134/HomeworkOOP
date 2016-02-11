import java.util.Scanner;
public class HWOOP1 {
	
	
	public static void main (String[]args){
	Scanner scan = new Scanner(System.in);
	int n,k;
	System.out.print("Enter Max Number :");
	n = scan.nextInt();
	System.out.print("Enter Pointer of Number :");
	k = scan.nextInt();
	int count=0;
	for(int j=2;j<=n;j++){
		if (j%2==0)
		{
		count++;
		if (k==count){
		System.out.print(j+" ");
		System.exit( 0 );  
	}}
	}
	for(int j=2;j<=n;j++){
		if (j%3==0&&j%2!=0)
		{
		count++;
		if (k==count){
			System.out.print(j+" ");
			System.exit( 0 );  
		}  
		}
	}
	for(int j=2;j<=n;j++){
		if (j%5==0&&j%3!=0&&j%2!=0)
		{		
		count++;
		if (k==count){
			System.out.print(j+" ");
			System.exit( 0 );  
		}  
		}
	}
	for(int j=2;j<=n;j++){
		
		if (j%7==0&&j%5!=0&&j%3!=0&&j%2!=0)
		{
		count++;
		if (k==count){
			System.out.print(j+" ");
			System.exit( 0 );  
		}  
		}
	}
	for(int j=2;j<=n;j++){
		
		if (j%11==0&&j%7!=0&&j%5!=0&&j%3!=0&&j%2!=0)
		{
		count++;
		if (k==count){
			System.out.print(j+" ");
			System.exit( 0 );  
		}  
		}
	}
	for(int j=2;j<=n;j++){
		if (j%13==0&&j%7!=0&&j%5!=0&&j%3!=0&&j%2!=0&&j%11!=0)
		{
		count++;
		if (k==count){
			System.out.print(j+" ");
			System.exit( 0 );
		}  
		}
	}
	for(int j=2;j<=n;j++){
		if (j%17==0&&j%7!=0&&j%5!=0&&j%3!=0&&j%2!=0&&j%11!=0&&j%13!=0)
		{
		count++;
		if (k==count){
			System.out.print(j+" ");
			System.exit( 0 );
		}  
		}
	}



}

}
