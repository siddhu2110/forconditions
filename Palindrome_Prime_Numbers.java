class Palindrome_Prime_Numbers{
	public static void main(String[]args){
		int n=123321;
		int sum=0;
		for(int i=n;i>0;){
			int rem=i%10;
			Boolean isPrime=true;
			for(int j =2;j<rem;j++){
			  if(rem%j==0){
				isPrime=false;
				}
			}
			if(rem<=1){
				isPrime=false;
			}
			if(isPrime){
				sum=(sum*10)+rem;
			}
			 i=i/10;
			}
			if(sum==n){
				System.out.println("Palindrome");
				}
			else{
				System.out.println("Not a Palindrome");
				}
		
	}
}