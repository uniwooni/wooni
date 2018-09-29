package java_study;

public class s_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double S = 6;    // 영국 신발 사이즈 (255mm)
		double P = 0.75; // 75% 히트할 확률
		double L = 200;  // 200파운드 
		double T = 0;    // 0년 유행
		double A = 1;    // 음주량 0잔
		double Y = 2;    // 착용년도
		double ups1 = P*L*(Y+9);
		double downs = (T+1)*(A+1)*(Y+10)*(L+20);
		double ups2 = 12 + 3 * S / 8;
		double high = ups1 / downs * ups2; // 밝혀낸 식
		System.out.printf("적당한 하이힐 높이는 %1$.2fcm입니다.", high);
		   /* %1$는 첫 번째 변수 high를 1$ 위치에 대입하라는 의미 */

	}

}
