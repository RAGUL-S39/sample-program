import java.util.*;
class Armstrong
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a num");
		int num=sc.nextInt();
		int dc=count(num);
		if(isprime(num,dc) )
			{
			System.out.println("armstrong number");
			
		}
		else
		{
			System.out.println("not a armstrong number");
		}
	}
	public static int count(int c){
		int n=0;
		while(c!=0){
			c=c/10;
			n++;	
				}
			return n;
	}
    public static boolean isprime(int n,int i) {
	      int sum =0;
	      int temp=n;
	while(n!=0) {
		int rem=n%10;
		sum=sum+pow(rem,i);
		n=n/10;
	}
	if(temp==sum) {
		return true;
	}
	else {
		return false;
	}
}
    public static int pow(int b,int e) {
	 int pow=1;
	for(int i=1;i<=e;i++){
		pow=pow*b;
	}
	return pow;
}
			
}
