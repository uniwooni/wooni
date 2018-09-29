package java_study;

public class s_31 {

	public enum FRUIT{  // enum 키워드, enum 상수는 static final을 사용하지 않고 대문자로 선언한다
		                // 선언한 순서(ordinal)대로 0, 1, 2처럼 값이 자동으로 대입된다
		APPLE, BANANA, MANGO
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FRUIT pear = FRUIT.APPLE;
		FRUIT pear2 = FRUIT.MANGO;
		System.out.println(pear);
		System.out.println(pear.name());
		System.out.println(pear.ordinal());  // 선언 될 때 APPLE의 순서는 0
		System.out.println(pear2.ordinal()); // 선언 될 때 MANGO의 순서는 2
		FRUIT[] fruits = FRUIT.values();     // 모든 enum 상수를 반환한다
		System.out.println(fruits[0]);
	}

}
