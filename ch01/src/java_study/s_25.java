package java_study;

import java.util.Scanner; // Scanner는 java.util 패키지에 있는 클래스이다(입력, 출력)

public class s_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // 키보드
		
		System.out.println("정수를 입력하세요.");
        int choice = scanner.nextInt();           // 키보드로 정수 입력
        System.out.println(choice);
        
        System.out.println("실수를 입력하세요.");
        double rchoice = scanner.nextDouble();    // 실수 입력
        System.out.println(rchoice);
        
        System.out.println("문자열을 입력하세요.");
        String schoice = scanner.next();          // 문자열 입력
        System.out.println(schoice);
        

}
