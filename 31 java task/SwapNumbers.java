import java.util.Scanner;
class SwapNumbers{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number1");
		int num1 = scan.nextInt();
		System.out.println("Enter the number2");
		int num2 = scan.nextInt();
		System.out.println("Before Swapping of the numbers: "+num1+" "+num2);
		num2 = num1+num2;
		num1 = num2-num1;
		num2 = num2-num1                          ;
		System.out.println("After Swapping of the numbers: "+num1+" "+num2);
	}
}