import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
class Q6c
{
	
	public static String compareDOB(String dob1,String dob2)
	{
		String result;
		LocalDate db1=LocalDate.parse(dob1, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		LocalDate db2=LocalDate.parse(dob2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		int comparison= db1.compareTo(db2);
		if(comparison < 0){
			result="Elder";
		}
		if(comparison > 0){
			result="Younger";
		}
		else{
			result="of same age";
		}
		return result;
	}
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the DOB of first person");
		String a=sc.nextLine();
		System.out.println("Enter the DOB of second person");
		String b=sc.nextLine();
		String ans= compareDOB(a,b);
		System.out.println("The first person is "+ans+" as compared to second person.");
	}	
}