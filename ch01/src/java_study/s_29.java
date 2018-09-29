package java_study;

public class s_29 {

	public static final int PHYSICAL = 23; // 상수, static 메서드 선언
	public static double getBioRhythm(long days, int index, int max){
		return max * Math.sin((days % index) * 2 * Math.PI / index);
	}
	
	public static void main(String[] args) {
		int days = 1200; // 메서드 호출
		double phyval = getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("나의 신체 지수 %1$.2f입니다.\n", phyval);
	
	// static 메서드는 메서드에 static 예약어가 붙은 메서드로, 객체 생성 없이 호출할 수 있다.
    // "public static 반환 타입 메서드이름(아규먼트){}" 형태로 사용한다.
	}
}


