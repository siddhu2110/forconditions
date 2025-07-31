class Prime_Number_or_Not{
	public static void main(String[]args){
		int n=13;
		Boolean isPrime=true;
		for (int i=2;i<n;i++){
		 if(n%i==0){
		  isPrime=false;	
			}	
		}

		if(isPrime){
			System.out.println("prime");
		}
		else{
			System.out.println("not a prime");
		}
	}
}