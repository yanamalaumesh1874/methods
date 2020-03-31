class prmt
{
	void a(String get)
	{
		System.out.println("welcome to java methods");
	}
    void b(int a,int b)
	{
		System.out.println("adding of two integers"+(a+b));
	}
	void  c(float a,int b)
	{
		System.out.println("adding of 1 float and 1 integer"+(a+b));
	}
    void d(float a,float b)
	{
		System.out.println("adding of two float values"+(a+b));
	}
	int e(int a,int b)
	{
		return a*b;
	}
    public static void main(String[] args)
    {
	prmt obj=new prmt();
	 obj.a("welcome to java methods");
	 obj.b(1,9);
	 obj.c(1.8f,9);
	 obj.d(1.2f,3.1f);
	 obj.e(6,2);
	}
}
