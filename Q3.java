import java.util.*;
class Q3
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size= sc.nextInt();
		int[]a=new int[size];
		System.out.println("Enter elements of the array");
		for(int i=0;i<size;i++){
		a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		int sum= a[0];
		int max=a[0];
		int min=a[0];
		for(int i=1;i<size;i++){
		sum=sum+a[i];
		if(a[i]>max){
			max=a[i];
		}
		if(a[i]<min){
			min=a[i];
		}
		}
		System.out.println("Sum: "+sum);
		double avg=(double)sum/size;
		System.out.println("Average: "+avg);
		System.out.println("Maximum: "+max);
		System.out.println("Minimum: "+min);
		System.out.println("Enter a value to search");
		int v=sc.nextInt();
		int w=0;
		for(int i=0;i<size;i++){
			if(v==a[i]){
				w=i;
				break;
			}
			else{
				w=0;
			}
		}
		if(w!=0){
		System.out.println("The value is present at index no."+w);
		}
		else{
		System.out.println("The value is not present in the array.");	
		}
	}
}