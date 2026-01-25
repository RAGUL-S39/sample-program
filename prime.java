import java.util.Scanner;
class prime 
{
	public static boolean isrise(int t){
		int max=9;
		while(t!=0){
			int rem=t%10;
			if(max>rem){
				max=rem;
			}
			else{
				return false;
			}
			t=t/10; 
		}
		return true;
	}
	public static boolean isprime(int n){
			int c=0;
			if(n==1){
				return false;
			}
				for (int i=1;i<=n;i++)
				{
					if(n%i==0){
						c++;
					}
				}
				if(c==2){
				return true;
				}
				else{
					return false;
				}
			}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("start num");
		int a=sc.nextInt();
		System.out.println("end num");
		int b=sc.nextInt();
		for (int i=a;i<=b;i++ ){
			if (isprime(i) && isrise(i))
			{
				System.out.println(i);
			}
		}
		}
}
	