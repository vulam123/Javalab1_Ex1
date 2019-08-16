import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		System.out.print("input number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<2) {
			System.out.print("Not prime number");
		}
		else if(n==2) {
			System.out.print("Prime number");
		}
		else {
			boolean prime = true;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				System.out.print("Prime number");
			}
			else {
				System.out.print("Not prime number");
			}
		}
	}
}
