package arrays;

public class Wret_Nargs {
public int add()
{
	int a=10,b=20;
	return a+b;
}
	public int sub()
	{
		int a=10,b=2;
		return a-b;
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Wret_Nargs a=new Wret_Nargs();
	System.out.println(a.add());
	System.out.println(a.sub());
	

	}

}
