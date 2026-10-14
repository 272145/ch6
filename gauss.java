import java.util.Scanner;
public class gauss{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("x?:");
		double x = in.nextDouble();
		System.out.println("How many numbers?");
		int n = in.nextInt();
		System.out.println("Sum is:" + gauss(x,n));
		
	}
	
	public static double gauss(double x, int n){
		double sum = 0.0;
		double term = 1.0;
			for (int i = 0;i< n; i++){
				sum += term;
				term = term *(-x *x) / (i+1);
			}
		return sum;
	}
	
}

	

