package Day01;

import java.util.Scanner;

public class Ex11_Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("전원 : ");
	    
	    // boolean : ture(참), false(거짓) 논리값만 가지는 자료형
		
		boolean on = sc.nextBoolean();
		
		System.out.println("on : " + on);
		
		if( on ) {
			System.out.println("전원 ON");
		}
			else {
				System.out.println("전원 OFF");
		
		}
        sc.close();
	}

}
