import java.util.*;
class Q10
{
	public static boolean allVowel(String a)
	{
		a= a.toLowerCase();
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)!='a' && a.charAt(i)!='e' && a.charAt(i)!='i' && a.charAt(i)!='o' && a.charAt(i)!='u'){
				return false;
			}
		}
		return true;
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String v=sc.nextLine();
		boolean ans = allVowel(v);
		System.out.println(ans);
	}
}