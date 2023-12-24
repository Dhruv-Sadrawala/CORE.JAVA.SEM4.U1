import java.util.Scanner;
class cu_sq_calc{

	static void square(int num_1){
		int square=num_1*num_1;
		System.out.println(square+" is square of "+num_1+" .");
	}

	static void cube(int num_1){
		int cube= num_1*num_1*num_1;
		System.out.println(cube+" is cube of "+num_1+" .");
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter one number ");
		int num_1=sc.nextInt();

		square(num_1);
		cube(num_1);	
	}
}