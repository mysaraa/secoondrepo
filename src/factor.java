import java.util.Scanner;
//salam
public class factor {
	public static void main(String[] args) {
		String s = "I want to walk my dog";

		 String[] arr = s.split(" ");    

		 for ( String sa : arr) {

		       System.out.println(sa);
		  }
		double r;
		Scanner scanner = new Scanner(System.in);
		r = scanner.nextInt();
		System.out.println(factor(r));
		System.out.println(factoryel(r));

	}

	static double factor(double r) {
		double s=1;
		for(int i=1;i<=r;i++){
			s*=i;
			}
		return s;

	}
	
	static double factoryel(double r) {
		double s=1;
		if(r==0){
			
			return 1;
		}
		else
		s=factoryel(r-1)*r;
			
		return s;
	}
}
