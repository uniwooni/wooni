package java_study;

import java.util.Scanner; // Scanner�� java.util ��Ű���� �ִ� Ŭ�����̴�(�Է�, ���)

public class s_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // Ű����
		
		System.out.println("������ �Է��ϼ���.");
        int choice = scanner.nextInt();           // Ű����� ���� �Է�
        System.out.println(choice);
        
        System.out.println("�Ǽ��� �Է��ϼ���.");
        double rchoice = scanner.nextDouble();    // �Ǽ� �Է�
        System.out.println(rchoice);
        
        System.out.println("���ڿ��� �Է��ϼ���.");
        String schoice = scanner.next();          // ���ڿ� �Է�
        System.out.println(schoice);
        

}
