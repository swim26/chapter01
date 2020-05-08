package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//출력문 출력
		//외부에서 이름을 입력받는다
		//string name
		//name+문자열을 출력한다
		
		System.out.println("이름을 입력해 주세요");
		System.out.println("이름:");
		String name=sc.nextLine();
		
		System.out.println("나이를 입력해 주세요");
		System.out.println("나이:");
		int age=sc.nextInt();
		
		
		System.out.println("당신의 이름은 "+ name +" 나이는 "+ age +"입니다.");
		
	}
	
}
