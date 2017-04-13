package exam;

import java.util.Scanner;

public class one {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int p = scanner.nextInt();
		int array[] = new int[p];
		for (int i = 0; i < p; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println(sort(array,p));
	}

	static int[] sort(int[] array, int l) {
		int max=0,p;
		for(int j=0;j<l;j++){
			for(int i=j;j<l;i++){
			if(array[max]<array[i]){
				p=array[i];
				array[i]=array[max];
				array[max]=p;
				max=i;
				
			}
			}
		}
		return array;

	}

}
