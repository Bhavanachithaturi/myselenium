package arrays;

public class Twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[][]= {{"testing","engineers"},{"a","b","c"}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				System.out.println();
			}
		}

	}

}
