class Sahil{
	public static void main(String[] args){

		int no = 43719615;
		int rev = 0;
		int temp = no;
		int rem = 0;

		while(temp != 0){
			rem = temp%10;
			rev = rev * 10+rem;
			temp= temp/10;

		}
		System.out.println("reverse no is= "+rev);

	}

}
