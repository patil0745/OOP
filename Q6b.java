import java.util.*;
class Q6b
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String a=sc.nextLine();
		System.out.println("Enter the second string");
		String b=sc.nextLine();
		char[]ac=a.toCharArray();
		char[]bc=b.toCharArray();
		Arrays.sort(ac);
		Arrays.sort(bc);
		boolean isAnagram=true;
		for(int i=0;i<a.length();i++){
			if(ac[i]!=bc[i]){
				isAnagram=false;
				break;
			}
		}
		if(isAnagram){
			System.out.println("The two strings are anagram");
		}
		else{
			System.out.println("The two strings are not anagram");
		}
	}
}