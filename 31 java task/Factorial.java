import java.util.Scanner;

class Factorial{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int fact = 1;
		for(int i=1;i<=num;i++){
			fact *= i;
		}
		System.out.println("Factorial: "+fact);
	}
}