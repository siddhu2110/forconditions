class Reverse_Number{
	public static void main(String[]args){
		int n=1234567890;
		int rev=0;
		for(int i=n;i>0;){
			int rem=i%10;
			rev=(rev*10)+rem;
			i=i/10;
		}
		System.out.println(rev);
	}
}