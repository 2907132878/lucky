package lucky;

import java.util.Scanner;

public class Lucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "rrr";
		String password = "123";
		String[] name = new String[2];// ����ע�������û���
		String[] pwd = new String[2];
		String yn = null;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("��ӭ�������˳齱����ѡ��1,ע��   2,��¼  3,�齱   4,�˳�");
			int num = input.nextInt();// ����ѡ��Ĳ���
			switch (num) {
			case 1:
				// ע��
				Scanner input1 = new Scanner(System.in);
				System.out.println("****ע��****");
				System.out.println("�����������Ϣ");
				for (int i = 0; i < name.length; i++) {
					System.out.println("�û�����");
					name[i] = input1.nextLine();// ��ȡ�û���
					System.out.println("���룺");
					pwd[i] = input1.nextLine();// ��ȡ����
					System.out.println("ע��ɹ������õĻ�Ա��Ϊ��");
					int cardNum = (int) (Math.random() * 10);// �������һλ����Ϊ��Ա��
					System.out.println(cardNum);// ��ӡ��Ա��
					System.out.println("����ע��");
				}
				break;
			case 2:
				// ��¼
				// System.out.println(userName+"!")
				int count = 0;// ��������������
				String userName1, password1;// ��¼�û���������
				Scanner input2 = new Scanner(System.in);
				System.out.println("****��¼****");
				System.out.println("�����������õڼ����û�����¼");
				int index = input2.nextInt();
				do {
					System.out.println("�û�����");
					// input2.nextLine();
					userName1 = input2.next();
					System.out.println("���룺");
					password1 = input2.next();
					if (!password1.equals(pwd[index - 1]) && !password1.equals(pwd[index = 1])) {
						System.out.println("������û������������������");
						count++;
					}
				} while (!password1.equals(pwd[index - 1]) && !password1.equals(pwd[index = 1]) && count < 3);
				if (count >= 3) {// ����������ν�������
					System.out.println("�����ѱ���������ʮ�����Ժ����ԣ�");
					break;
				}
				break;
			case 3:
				// �齱
				int count1 = 0;
				System.out.println("****�齱****");
				System.out.println("���ȵ�¼��");
				String userName2, password2;
				Scanner input3 = new Scanner(System.in);
				System.out.println("****��¼****");
				do {
					System.out.println("�û�����");// �����û����������ж��Ƿ����󣬴�������������
					userName2 = input3.nextLine();
					System.out.println("���룺");// �������룬�����ж��Ƿ����󣬴�������������
					password2 = input3.nextLine();
					if (!userName.equals(userName2) && !password2.equals(password)) {
						System.out.println("�������������������");
						count1++;
					}
				} while (!userName.equals(userName2) && !password2.equals(password) && count1 < 3);
				if (count1 >= 3) {
					System.out.println("�����ѱ���������20���Ӻ�����");// �ж������������Ƿ񳬹����Σ��������ν�������
					break;
				}
				System.out.println("��Ա�ţ�");
				int cardNum1 = input3.nextInt();
				System.out.println("��Ļ�Ա��Ϊ��" + cardNum1);
				int[] lucknum = new int[5];
				boolean flag = false;
				int i = 0;
				System.out.println("��������˺���");
				for (i = 0; i < 5; i++) {// ������������
					lucknum[i] = (int) (Math.random() * 10);
					for (int j = 0; j < i; j++) {
						// int a=lucknum[i];
						if (lucknum[i] == lucknum[j])
							i--;
					}
				}
				for (i = 0; i < lucknum.length; i++) {// ��ӡ����������
					System.out.println(lucknum[i]);
				}
				// System.out.println( lucknum[i]);
				for (i = 0; i < lucknum.length; i++) {// �ж��Ƿ��н�
					if (cardNum1 == lucknum[i]) {
						// System.out.println("��ϲ�㣬���ǽ�������˺�");
						flag = true;
						// break;
					}
				}
				// ������
				if (flag) {
					System.out.println("��ϲ�㣬���ǽ�������˺�");
				}

				if (!flag) {
					System.out.println("�㲻�ǽ�������˺�");
				}

				break;
			case 4:
				// �˳�
				System.out.println("�ݰݣ�");
				break;

			default:
				System.out.println("�������,������ѡ��");
				continue;
			}
			System.out.println("�����𣿣�y/n��");
			yn = input.next();
		} while (yn.equals("y"));
		if (yn.equals("n"))
			System.out.println("�ݰݣ�");
	}

}
