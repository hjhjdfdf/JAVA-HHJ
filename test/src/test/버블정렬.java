package test;

import java.util.Scanner;

public class 버블정렬 {
	
	public static void main(String[] args) {
		
		int temp;
		int arr[] = new int [5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력:  " );
		int arr[] = sc.nextInt();
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) 
					// 두 요소를 교환
					int temp = lotto[j];
					arr[i] = arr[j];
					arrr[j] = temp;
					
					
				
				
			}
			System.out.println();
			
		}
		
		sc.close();
	}

}
