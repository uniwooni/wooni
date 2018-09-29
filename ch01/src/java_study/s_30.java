package java_study;

public class s_30 {
	
	public static final int PHYSICAL = 23;   // static 변수 생성 없이 사용, 멤버 메서드(non static) 선언
	public double getBioRhythm(long days, int index, int max) {
		return max * Math.sin((days % index) * 2 * Math.PI / index);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days = 1200;
		s_30 bio = new s_30(); // 객체를 생성, 멤버 메서드 호출
		double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("나의 신체 지수 %1$.2f입니다.\n", phyval);
	
	/* 메서드 앞에 static이 붙지 않으면 멤버 메서드(non-static)라고 한다. 
	     멤버 메서드는 new 예약어를 이용해 객체를 생성해야 한다. */
		
	}

}
