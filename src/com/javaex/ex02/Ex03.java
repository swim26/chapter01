package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int age;

		
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름:");
		name=sc.nextLine();
		
		System.out.println("나이를 입력해 주세요");
		System.out.print("나이:");
		age=sc.nextInt();
		
		
		System.out.println("당신의 이름은 "+ name +" 나이는 "+ age +"입니다.");
		
	}
	
}
