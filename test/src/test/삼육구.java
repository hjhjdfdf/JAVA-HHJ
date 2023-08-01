package test;

public class 삼육구 {
	

		
		// hint 1) 일의 자릿수와 십의 자릿수를 각각 1, 10에 넣기
	// hint 2) 13을 10으로 나눴을 때 몫이 십의 자리가 되고, 나머지가 일의 자리가 된다.
	// hint 3) a and b => **
	//         a or b -> *
	
	// 나는 조건문 안에 직접 조건을 길게 풀어서 썼었는데, 애초에 그 조건을 아래처럼(ex. In28, In29) 변수에 넣어서 작성하면 훨씬 간결함.
	int one = 0;
	int ten = 0;
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			
			int one = i % 10;
			int ten = i / 10;
			
				boolean one369 = ten == 3 || ten == 6 || ten == 9;
				boolean ten369 = ten == 3 || ten == 6 || ten == 9;
				
				if((ten369) && (one369)) {
					System.out.println("count : " + i + " => **");
				
			}
				else if (ten369) { 
					System.out.println("count : " + i + " => *");
					
				else if(one369) { 
					System.out.println("count : " + i + " => *");
					
				else { 
					System.out.println("count : " + i + " => 해당없음");
				}
				}
							
							
				}
				
//				else if(ten369) {
//					System.out.println("count : " + i + " => *");
//					
//					else if (one369) {
//						System.out.println("count : " + i  );
//					}
					
					
				
				
				
				
				
				
			
			
			
		}
		
		}
}


 


