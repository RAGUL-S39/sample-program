class  Method_overloading
{
	int display(int a) {
		return a;
	}
	int display(int a,int b) {
		return a+b;
	}
	int display(int a,int b,int c){
		return a+b+c;
	}
	public static void main(String[] args) 
	{
		 Method_overloading m=new Method_overloading();
		System.out.println(m.display(1));
		System.out.println(m.display(1,2));
		System.out.println(m.display(1,2,3));
	}
}
