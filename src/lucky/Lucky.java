package lucky;

import java.util.Scanner;

public class Lucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "rrr";
		String password = "123";
		String[] name = new String[2];// 可以注册两个用户名
		String[] pwd = new String[2];
		String yn = null;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("欢迎来到幸运抽奖，请选择1,注册   2,登录  3,抽奖   4,退出");
			int num = input.nextInt();// 输入选择的操作
			switch (num) {
			case 1:
				// 注册
				Scanner input1 = new Scanner(System.in);
				System.out.println("****注册****");
				System.out.println("请输入个人信息");
				for (int i = 0; i < name.length; i++) {
					System.out.println("用户名：");
					name[i] = input1.nextLine();// 读取用户名
					System.out.println("密码：");
					pwd[i] = input1.nextLine();// 读取密码
					System.out.println("注册成功，你获得的会员号为：");
					int cardNum = (int) (Math.random() * 10);// 随机产生一位数作为会员号
					System.out.println(cardNum);// 打印会员号
					System.out.println("继续注册");
				}
				break;
			case 2:
				// 登录
				// System.out.println(userName+"!")
				int count = 0;// 密码输入错误次数
				String userName1, password1;// 登录用户名和密码
				Scanner input2 = new Scanner(System.in);
				System.out.println("****登录****");
				System.out.println("请输入你想用第几个用户名登录");
				int index = input2.nextInt();
				do {
					System.out.println("用户名：");
					// input2.nextLine();
					userName1 = input2.next();
					System.out.println("密码：");
					password1 = input2.next();
					if (!password1.equals(pwd[index - 1]) && !password1.equals(pwd[index = 1])) {
						System.out.println("密码或用户名输入错误，重新输入");
						count++;
					}
				} while (!password1.equals(pwd[index - 1]) && !password1.equals(pwd[index = 1]) && count < 3);
				if (count >= 3) {// 密码输错三次结束程序
					System.out.println("密码已被锁定，二十分钟以后再试！");
					break;
				}
				break;
			case 3:
				// 抽奖
				int count1 = 0;
				System.out.println("****抽奖****");
				System.out.println("请先登录：");
				String userName2, password2;
				Scanner input3 = new Scanner(System.in);
				System.out.println("****登录****");
				do {
					System.out.println("用户名：");// 输入用户名，并且判断是否有误，错误则重新输入
					userName2 = input3.nextLine();
					System.out.println("密码：");// 输入密码，并且判断是否有误，错误则重新输入
					password2 = input3.nextLine();
					if (!userName.equals(userName2) && !password2.equals(password)) {
						System.out.println("密码输入错误，重新输入");
						count1++;
					}
				} while (!userName.equals(userName2) && !password2.equals(password) && count1 < 3);
				if (count1 >= 3) {
					System.out.println("密码已被锁定，请20分钟后再试");// 判断密码输错次数是否超过三次，超过三次结束程序
					break;
				}
				System.out.println("会员号：");
				int cardNum1 = input3.nextInt();
				System.out.println("你的会员号为：" + cardNum1);
				int[] lucknum = new int[5];
				boolean flag = false;
				int i = 0;
				System.out.println("今天的幸运号是");
				for (i = 0; i < 5; i++) {// 产生五个随机数
					lucknum[i] = (int) (Math.random() * 10);
					for (int j = 0; j < i; j++) {
						// int a=lucknum[i];
						if (lucknum[i] == lucknum[j])
							i--;
					}
				}
				for (i = 0; i < lucknum.length; i++) {// 打印随机随机数组
					System.out.println(lucknum[i]);
				}
				// System.out.println( lucknum[i]);
				for (i = 0; i < lucknum.length; i++) {// 判断是否中奖
					if (cardNum1 == lucknum[i]) {
						// System.out.println("恭喜你，你是今天的幸运号");
						flag = true;
						// break;
					}
				}
				// 输出结果
				if (flag) {
					System.out.println("恭喜你，你是今天的幸运号");
				}

				if (!flag) {
					System.out.println("你不是今天的幸运号");
				}

				break;
			case 4:
				// 退出
				System.out.println("拜拜！");
				break;

			default:
				System.out.println("输入错误,请重新选择");
				continue;
			}
			System.out.println("继续吗？（y/n）");
			yn = input.next();
		} while (yn.equals("y"));
		if (yn.equals("n"))
			System.out.println("拜拜！");
	}

}
