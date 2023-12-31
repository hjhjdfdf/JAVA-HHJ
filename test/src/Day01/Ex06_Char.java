package Day01;

public class Ex06_Char {

	public static void main(String[] args) {
	
	// 리터럴 : 소스코드에 표기하는 데이터(숫자인지, 문자인지, 문자열인지 의무부여)
	char c1 = 'A';                 // 문자 리터럴 : 'A' (작은 따옴표)
	char c2 = 65;                  // 십진수 --> 아스키코드표에 예정된 문자
	char c3 = '\u0041';            // 유니코드로 지정
	
	char c4 = '가';
	char c5 = 44032;
	char c6 = '\uac00';
	
	int unlCode = c1;
	
	char b = (char) (c2 + 1);
	
	System.out.println("c1 : " + c1);
	System.out.println("c1 : " + c2);
	System.out.println("c1 : " + c3);
	System.out.println("c1 : " + c4);
	System.out.println("c1 : " + c5);
	System.out.println("c1 : " + c6);
	System.out.println("A 의 코드값 : " + unlCode);
	System.out.println("b : + " + b);
	
		
	}
}
