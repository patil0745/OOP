class Q9
{
	public static int isPrime(int a)
	{
		int prime=1;
		if(a<=1){
			prime=0;
		}
		for(int i=2;i<a;i++){
			if(a%i==0){
				prime=0;
				break;
			}
		}
		return prime;
	}
	public static void main(String[]args)
	{
		for(int i=2;i<100;i++){
			if(isPrime(i)==1 && isPrime(i+2)==1){
				System.out.println("("+i+","+ (i+2) +")");
			}
		}

	}
}