import java.util.Scanner;

class OddNum{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		for(int i=1;i<=num;i++){
			if(i%2 != 0){
				System.out.print(i+" ");
			}
		}
		
	}
}