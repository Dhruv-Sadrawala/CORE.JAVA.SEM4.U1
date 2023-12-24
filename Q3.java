import java.util.Scanner;

class salary{

	static int gross(int hr_rate, int noh_worked){

		int gross=hr_rate*noh_worked;
		return gross;
	}

	static void net(int gross_p){

		double taxRate = 0.075;
        double tax = gross_p * taxRate;

        double net_sal = gross_p - taxRate;

        System.out.println(net_sal+" is net salary.");
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter Hourly Rate ");
		int hr_rate= sc.nextInt();

		System.out.print("Enter no of hours worked ");
		int noh_worked= sc.nextInt();

		int gross_p=gross(hr_rate,noh_worked);
		System.out.println(gross_p+" is gross salary.");

		net(gross_p);

		
	}
}