import java.util.Scanner;

class temprature{

	static void cal(int fahre){

		double celcius= (fahre-32)/1.8;

		System.out.println(fahre+" fahrenheit is equals to "+ celcius + "C.");
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter degrees in fahrenheit ");
		int fahre= sc.nextInt();

		cal(fahre);
	}
}