package Day04.Ex01_student;

public class StudentEx {
	
	public static void main(String[] args) {
	// Student 객체 생성
	Student student = new Student();
    Student1.name = "김조은";
	Student1.age = "20";
	Student1.stdNo = "20240001";
	Student1.major = "영상디자인과";
	
	// Student 객체 생성
	Student student1 = new Student("이용성", 20, "20220002", "컴퓨터공학");
	
	// Student2 객체 생성
	Student student2 = new Student("이용성", 20, "20220002", "컴퓨터공학");
	
	int[] scores1 = {10,20,30,40,50};    // 학생 1의 성적
	int[] scores2 = {100,100,100,90,95}; // 학생 2의 성적
	
	System.out.println("##### 학생1 #####");
	System.out.println("학생1 - 이름 : " + student1.name);
	System.out.println("학생1 - 나이 : " + student1.age);
	System.out.println("학생1 - 학번 : " + student1.stdNo);
	System.out.println("학생1 - 전공 : " + student1.major);
    System.out.println("학생1 - 유튜브 편집 실습");
	System.out.println("유튜브 편집 실습");
	System.out.println("학생1 - 중간고사 점수 : " + student1.getAverage(10, 20));
	System.out.println("학생1 - 기말고사 점수 : " + student1.getAverage(30, 40, 50));
	System.out.println("학생1 - 최종 점수 : " + student1.getAverage(scores1) );
	
	System.out.println("##### 학생2 #####");
	System.out.println("학생2 - 이름 : " + student2.name);
	System.out.println("학생2 - 나이 : " + student2.age);
	System.out.println("학생2 - 학번 : " + student2.stdNo);
	System.out.println("학생2 - 전공 : " + student2.major);
    System.out.println("학생2 - 플러터 공부하기");
	System.out.println("유튜브 편집 실습");
	System.out.println("학생2 - 중간고사 점수 : " + student2.getAverage(100, 100));
	System.out.println("학생2 - 기말고사 점수 : " + student2.getAverage(100, 90, 95));
	System.out.println("학생2 - 최종 점수 : " + student2.getAverage(scores1) );

	}

}
