package com.javaex.ex03_1;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int core;
		System.out.println("점수: ");
		core=sc.nextInt();
		if (core>=60) {
			System.out.println("합격입니다");
		}
		else {
			System.out.println("불합격입니다");
			
		}
		
		sc.close();

	}

}
