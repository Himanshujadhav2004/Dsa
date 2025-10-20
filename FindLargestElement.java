package arraypractice;

import java.util.Scanner;

public class FindLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		int arr[] =new int[n];
		
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		
	}
	
	int largest=arr[0];
	for(int i=0;i<n;i++) {
		if(arr[i]>largest) {
			largest=arr[i];
		}
	
	}
System.out.println(largest);
	
	}

}
