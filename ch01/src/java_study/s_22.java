package java_study;

public class s_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double S = 6;    // ���� �Ź� ������ (255mm)
		double P = 0.75; // 75% ��Ʈ�� Ȯ��
		double L = 200;  // 200�Ŀ�� 
		double T = 0;    // 0�� ����
		double A = 1;    // ���ַ� 0��
		double Y = 2;    // ����⵵
		double ups1 = P*L*(Y+9);
		double downs = (T+1)*(A+1)*(Y+10)*(L+20);
		double ups2 = 12 + 3 * S / 8;
		double high = ups1 / downs * ups2; // ������ ��
		System.out.printf("������ ������ ���̴� %1$.2fcm�Դϴ�.", high);
		   /* %1$�� ù ��° ���� high�� 1$ ��ġ�� �����϶�� �ǹ� */

	}

}
