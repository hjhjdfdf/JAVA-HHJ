package Day01;

public class Ex09_Long {
	
	public static void main(String[] args) {
		// int (4byte : 32bits) : 2^32개    : 42억 개
		// int 수 표현 범위 : -21억xxx ~ 21억xxx
		
		// long (8byte : 64bits) : 2^64 개
		long ln1 = 1000;
		long ln2 = 210000000;
		// long 타입 리터럴 : 숫자 L
		long ln3 = 2200000000L;
		
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);
	}

}
