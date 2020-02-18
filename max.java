import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		System.out.println("give first number");
		double d = t.nextDouble();
		System.out.println("give your 2nd number");
		double e = t.nextDouble();
		System.out.println("give your 3rd number");
		double f = t.nextDouble();
		double g = maximum(d,e,f);
		System.out.print(g);
		
		

	}
	public static double maximum(double a, double b, double c) {
		double max = a;
		if(max>b) {
			max=a;
			
		}
		else {
			max=b;
		}
		if(max>c) {
			return max;
		}
		else {
			max = c;
			return max;
		}
	}
}


