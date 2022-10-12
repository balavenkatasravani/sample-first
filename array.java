package HelloWorld;

import java.util.Scanner;

public class array {	
	public static void main(String[] args) {
		int ab=1;
		int c=1;
		int a=ab+c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the ele");
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++) {
			ab=ab*arr[i];
		}
		if(ab>=0) {
		System.out.println("0");
		}
		else
		{
			System.out.println("1");
		}
		
		sc.close();
		
}


}
