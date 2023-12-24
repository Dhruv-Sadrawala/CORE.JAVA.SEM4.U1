import java.util.Scanner;

class calculator{

	static int addi(int a,int b){
		return a+b;
	}
	
	public static void main(String[] args){

		
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter First Number ");
		int a=sc.nextInt();

		System.out.println("Enter Second Number ");
		int b=sc.nextInt();

		int ans_a=addi(a,b);
		System.out.println("Addition is "+ans_a);
		/*subs(a,b);
		mult(a,b);
		divi(a,b);*/
	}
}