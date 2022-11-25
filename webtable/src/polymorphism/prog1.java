package polymorphism;

public class prog1 {
	public void add()
	{
		System.out.println("null parametre");
	}
public void add(int a,int b)
{
	int c=a+b;
	System.out.println(c);
	
}
public void add(double c,double d)
{
	System.out.println(c+d);
}
public void add(String a1,String a2)
{
	System.out.println(a1+a2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prog1 a=new prog1();
		a.add();
		a.add(1,2);
		a.add(2.0,7.0);
		a.add("apple","banana");
	}

}
