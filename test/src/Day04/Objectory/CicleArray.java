package Day04.Objectory;

/*
 *  반지름이 1~5인 Circle 객체를 5개 가지는 배열을 생성하고,
 *  배열 요소에 있는 모든 Circle 객체의 넓이를 출력하시오.
 * 
 */

public class CicleArray {
	
	// 변수       : 반지름
	// 메소드     : 넓이
	int radius;
	
	
	// 생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	
	// 메소드
	public double getArea() {
		 // (원의 넓이) = (원주율) * (반지름)^2
		return Math.PI * Math.pow(radius, 2);
	}


}

public class CircleArray {
	public static void main(String[] args) {
		Circle[] c;        // Circle 배열에 대한 레퍼런스 c 선언
		c = new Circle[5]; // 5개의 요소를 갖는 배열 생성
		
		for (int i = 0; i < c.length; i++) {
			// 반지름이 1~5인 Circle 객체 5개를 생성 후 배열요소에 대입
			c[i] = new Circle(i+1);
			
		}
		for (Circle circle : c) {
			System.out.println("넓이 : " + circle.getArea());
		}
		
	}
}
