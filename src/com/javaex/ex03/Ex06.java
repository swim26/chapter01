package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 
{	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int point;
	System.out.println("점수를 입력하세요");

	point=sc.nextInt();
	if(point%3==0) {
		System.out.println(point+" 은(는)3의배수 입니다.");
				
	}
	else {
		System.out.println(point+" 은(는)3의배수 가 아닙니다.");	
	}
	sc.close();
}

}