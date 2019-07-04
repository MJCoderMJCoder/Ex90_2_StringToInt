package com.stringtoint;
/*
 * 定义一个String型成绩数组，将数组中的各元素转换成int型，并求出所有元素的平均值，将其输出
 * String类型的数据是不能进行数学运算的，但是通过调用parseInt()转换为Integer型数据后，便能够实现数学运算
 */
public class StringToInt {

	public static void main(String[] args) {
		String grade[] = {"66", "56", "78", "89", "83"}; //定义成绩数组grade
		int sum = 0;
		int average = 1;
		System.out.println("成绩分别为：");
		for (int i = 0; i < grade.length; i++) { //循环遍历数组
			int gradeInt = Integer.parseInt(grade[i]); //将数组中的元素都转换为int型
			System.out.print(gradeInt + "\t"); //将数组中各元素输出
			sum = sum + gradeInt; //求数组中所有元素之和
		}
		average = sum / grade.length; //求平均数
		System.out.println("\n平均成绩为：" + average);
	}

}
