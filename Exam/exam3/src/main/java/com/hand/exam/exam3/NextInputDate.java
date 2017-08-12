package com.hand.exam.exam3;

import java.util.Scanner;

/**
 * 计算输入的天数的下一天
 * @author YiNa
 *
 */
public class NextInputDate {
	
	/**
	 * 判断字符串是否合法
	 * @param inputDate 要进行判断的字符串
	 * @return
	 */
	public static int isRightDate(String inputDate){
		int errorMessage = 0; //
		//判断字符串的长度
		int strLength = inputDate.length();
		int year = inputDate.substring(0, 4).length(); //获取前四位年的长度
		int month = inputDate.substring(5,7).length(); //获取两位月份的长度
		int day = inputDate.substring(8,10).length(); //获取两位天的长度
		//截取字符串的第五位和第八位
		String fifth = inputDate.substring(4,5);
		String eighth = inputDate.substring(7,8);
		if (strLength != 10) 
			return errorMessage; //字符串长度不够
		if(year != 4)
			return errorMessage = -2; //年输入不合法
		if(month != 2)
			return errorMessage = -3; //月输入不合法
		if(day != 2)
			return errorMessage = -4; //日输入不合法
		if (!(fifth.equals("-") && eighth.equals("-"))) 
			return errorMessage = -5; //字符串中没有包含 -
		return errorMessage;
	}
	
	/**
	 * 计算输入日期的下一天
	 * @param inputDate 要计算的日期
	 * @return 返回输入日期的后一天
	 */
	public static String nextDay(String inputDate){
		//判断一个年份是否为闰年
		int year = Integer.parseInt(inputDate.substring(0,4));
		/*if (year) {
			
		}*/
		return "";
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个日期，格式为【2017-07-09】：");
		String inputDate = scanner.nextLine();
		//判断用户输入的日期格式
		int errorMessage = isRightDate(inputDate);
		switch (errorMessage) {
		case 0://输入合法
			
			
			
			break;
		case -1:
			System.out.println("输入的日期长度不够，正确格式为【2017-07-09】，请重新输入。。。");
			break;
		case -2:
			System.out.println("输入的年份格式不正确，正确格式为【2017-07-09】，请重新输入。。。");
			break;
		case -3:
			System.out.println("输入的月份格式不正确，正确格式为【2017-07-09】，请重新输入。。。");
			break;
		case -4:
			System.out.println("输入的天格式不正确，正确格式为【2017-07-09】，请重新输入。。。");
			break;
		case -5:
			System.out.println("输入的日期中以'-'间隔，正确格式为【2017-07-09】，请重新输入。。。");
			break;
		default:
			System.out.println("输入的日期格式错误，请按照【2017-07-09】输入。。。。。。");
			break;
		}
	}

}
