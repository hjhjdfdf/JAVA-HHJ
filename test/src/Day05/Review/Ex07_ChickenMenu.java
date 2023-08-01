package Day05.Review;

import java.util.Scanner;

/*
    ########## 메뉴판 ##########
    1. 굽네치킨 - 볼케이노 치킨
    2. BBQ - 황금올리브 반반치킨
    3. 교촌치킨 - 허니콤보 치킨
    4. BHC - 뿌링클
    5. 레드락 치킨 - 양념치킨
    6. 종료
    ########## 입력 : 
    
    메뉴번호에 따라 메뉴 변수에 해당 메뉴를 저장해주고,
    "(해당메뉴) 이 주문되었습니다." 라고 출력하시오.
    0을 입력하기 전까지 반복하고,
    0을 입력하면 반복을 종료합니다.
    종료 시, "?개의 주문을 완료합니다." 라고 출력하시오.
 */

public class Ex07_ChickenMenu {
	
	// 메뉴판 출력
	public static void printmenu() {
		System.out.println("##### 메뉴판 #####");
		System.out.println("1. 굽네치킨 - 볼케이노 치킨");
		System.out.println("2. BBQ - 황금올리브 반반치킨");
		System.out.println("3. 교촌치킨 - 허니콤보 치킨");
		System.out.println("4. BHC - 뿌링클");
		System.out.println("5. 레드락 치킨 - 양념치킨");
		System.out.println("0. 종료");
		System.out.println("입력 : ");
		
	
	}
	// 메뉴 선택
	public static String selectMenu(int menuNo) {
		String menuName = "";
		switch (menuNo) {
		case 1 : menuName = "1. 굽네치킨 - 볼케이노 치킨"; break;
		case 2 : menuName = "2. BBQ - 황금올리브 반반치킨"; break;
		case 3 : menuName = "3. 교촌치킨 - 허니콤보 치킨"; break;
		case 4 : menuName = "4. BHC - 뿌링클"; break;
		case 5 : menuName = "5. 레드락 치킨 - 양념치킨"; break;
		default : menuName = "종료"; break;
		
	}
		return menuName
	
	public static void main(String[] args) {
		int menuNo = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		do {
			printMenu();           // 메뉴판 출력
			
			menuNo = sc.nextInt(); 
			
			// 종료조건
			if(menuNo == 0) break;
			menuName = selectMenu(menuNo); // 메뉴 선택
			}
			
			if( menuNo >= 1 && menuNo <= 6) {
				System.out.println(menuName + "이 주문되었습니다.");
				count++;
			}
			else {
				System.out.println("(0~6)번 사이의 숫자를 입력해주세요.");
			}
			
			
		} while (true);
		
		System.out.println(count + "개의 주문을 완료합니다.");
		
		// ?개의 주문을 완료하였습니다.
		
		
		
		//System.out.println("개의 주문을 완료하였습니다.");
		
		
//		for (int i = 1; i < args.length; i++) {
//			for (int j = 0; j < args.length; j++) {
//				
//			}
//			
//		}
			
		
		
		
		sc.close();
		
		
		
		
		
		
				
		
	}

	}
