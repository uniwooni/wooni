package java_study;

public class s_26 {
	
	public static final int PHYSICAL = 23; // 상수(개발자 정의)
	// public static final 예약어를 붙여 상수를 선언한다. 상수는 대문자를 쓴다
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PHYSICAL);
		int index = PHYSICAL;              // 상수값을 변수에 대입
		// Math.PI 3.14에서 정의되어 있는 상수
		double vals = 2 * Math.PI / index;
		System.out.println(vals + "라디안");
	
		// 변수는 저장된 값을 변경할 수 있지만, 상수는 변경할 수 없다. 변수에 static final을 붙이면 상수가 된다.
	}

}
