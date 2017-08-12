package com.hand.exam.Exam2;

import java.util.Scanner;

/**
 * 用来计算税率
 * 
 * @author YiNa
 *
 */
public class CountTax {
	/**
	 * 计算税率的
	 * 
	 * @param salary
	 *            员工工资
	 * @param baseSalary
	 *            起征税点
	 * @return
	 */
	public static double count(double salary, int baseSalary) {
		double tax = 0;
		double rest = salary - baseSalary; // 总工资跟起征点的差值
		// 判断差值的范围
		if (rest == 0) {
			tax = 0;
		} else if (rest <= 1500) {// 小于1500
			tax = rest * 0.03;
		} else if (1500 < rest && rest <= 4500) { // 1500~4500
			tax = rest * 0.1;
		} else if (4500 < rest && rest <= 9000) {// 4500~9000
			tax = rest * 0.2;
		} else if (9000 < rest && rest <= 35000) {// 9000~35000
			tax = rest * 0.25;
		} else if (35000 < rest && rest <= 55000) {// 35000~55000
			tax = rest * 0.3;
		} else if (55000 < rest && rest <= 80000) {// 55000~80000
			tax = rest * 0.35;
		} else {// >80000
			tax = rest * 0.45;
		}
		return tax;
	}

	public static void main(String[] args) {
		int isForginer = 1; // 是否是外来人员，默认为1，不是外来人员
		int isContinue = 0;// 是否继续计算税率 0 默认退出
		double tax = 0;
		Scanner scanner = new Scanner(System.in);// 定义一个扫描器，扫描键盘输入
		try {
			continueCount: while (true) {
				System.out.println("请输入工资：");
				// 获取用户输入的工资
				double salary = scanner.nextDouble();
				// 判断输入是否合法
				while (salary < 0) {
					System.out.println("薪资输入不合法请重新输入（薪资必须大于0）");
					System.out.println("请输入合法薪资：");
					salary = scanner.nextDouble();
				}
				// 判断是否是外来人员
				System.out.println("请选择是否是外籍人员，输入【0（是外籍人员），1（不是外籍人员）】");
				// 接受键盘输入
				isForginer = scanner.nextInt();
				switch (isForginer) {
				case 0:// 外籍人员
					tax = count(salary, 4800);
					break;
				case 1:// 非外籍人员
					tax = count(salary, 3500);
					break;
				default:
					System.out.println("抱歉，系统暂未提供其他计算。。。。。。。");
					break;
				}
				System.out.println("所需缴纳的税费为：" + tax);
				System.out.println("是否继续。。。。。（1【继续】，0【退出系统】）");
				isContinue = scanner.nextInt();
				switch (isContinue) {
				case 1:
					/* continueCount; */
					break;
				default:
					System.exit(0); // 退出系统
					break;
				}
			}
		} catch (Exception e) {
			new Exception("输入有误。。。。。。。");
		}
	}
}
