class  Method_chaining
{
	 Method_chaining m1() {
		System.out.println(1);
		return this;
	}
	 Method_chaining m2() {
		System.out.println(2);
		return this;
	}
	 Method_chaining m3() {
		System.out.println(3);
		return this;
	}
	public static void main(String[] args) 
	{
		Method_chaining m=new Method_chaining();
		m.m1().m2().m3();
		
	}
}
