package com.stringtoint;
/*
 * ����һ��String�ͳɼ����飬�������еĸ�Ԫ��ת����int�ͣ����������Ԫ�ص�ƽ��ֵ���������
 * String���͵������ǲ��ܽ�����ѧ����ģ�����ͨ������parseInt()ת��ΪInteger�����ݺ󣬱��ܹ�ʵ����ѧ����
 */
public class StringToInt {

	public static void main(String[] args) {
		String grade[] = {"66", "56", "78", "89", "83"}; //����ɼ�����grade
		int sum = 0;
		int average = 1;
		System.out.println("�ɼ��ֱ�Ϊ��");
		for (int i = 0; i < grade.length; i++) { //ѭ����������
			int gradeInt = Integer.parseInt(grade[i]); //�������е�Ԫ�ض�ת��Ϊint��
			System.out.print(gradeInt + "\t"); //�������и�Ԫ�����
			sum = sum + gradeInt; //������������Ԫ��֮��
		}
		average = sum / grade.length; //��ƽ����
		System.out.println("\nƽ���ɼ�Ϊ��" + average);
	}

}
