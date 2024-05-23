import java.util.*;
class Q18
{
	public static void main(String[]args)
	{
		int[]a=new int[]{10,20,30,40,50};
		int sum=a[0];
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++){
			sum=sum+a[i];
			if(a[i]>max){
				max=a[i];
			}
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Sum: "+sum);
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
		Arrays.sort(a);
		System.out.println("Sorted array: "+Arrays.toString(a));
		int[]b=new int[a.length];
		for(int i=0;i<a.length;i++){
			b[i]=a[a.length-1-i];
		}
        System.out.println("Reverse: "+Arrays.toString(b));
				
		
	}
}