class Numbers_1to_100{
	public static void main(String[]args){
	int i;
	int count=0;

	 for(i=1;i<=100;i++){
		if(i%2==0){
		
		System.out.println(i);
		count++;
		}
		}
		System.out.println("============");
		System.out.println(count);
	}
}