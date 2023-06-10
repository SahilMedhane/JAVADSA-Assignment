class Sahil {
	public static void main(String [] args){
		int sum = 0;
		int product = 1;
		int i=1;

		while(i<=10){
			
			if(i%2==0){
				sum= sum+i;

			}else{

				product = product * i;


			}

			i++;

		}

		System.out.println("Sum of the even numbers is=  "+sum);
		System.out.println("product of odd numbers is=  "+product);


	}

}
