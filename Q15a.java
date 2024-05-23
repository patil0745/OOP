import java.util.*;
class Q15a
{
	public int[] reverseArray(int[]a)
	{
		int[]b=new int[a.length];
		for(int i=0;i<a.length;i++){
			b[i]=a[a.length-1-i];
		}
		return b;
	}
	
	public static void main(String[]args)
	{
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size= sc.nextInt();
		int[]c=new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++){
			c[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(c));
		Q15a v=new Q15a();
		int[]d=v.reverseArray(c);
		System.out.println(Arrays.toString(d));		
	}
}