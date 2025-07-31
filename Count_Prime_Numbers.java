class Count_Prime_Numbers{
	public static void main(String[]args){
		int n=54371;
		int count=0;
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
				count++;
			}
			 i=i/10;
			}
			System.out.print(count);
		
	}
}