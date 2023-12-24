import java.util.Scanner;

class area{

	static void cal(int rad){

		double area=3.14*rad*rad;

		System.out.println("Area of circle with radius "+rad+" is "+area);
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter radius of circle ");
		int rad=sc.nextInt();

		cal(rad);
	}
}