package com.javaex.ex03;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mon;
		System.out.println("월을 입력하세요");
		mon=sc.nextInt();
		if ((mon==4)||(mon==6)||(mon==9)||(mon==11)) {
			System.out.println("30일 입니다.");
		}
		else if (mon==2) {
			System.out.println("28일 입니다.");			
		}
		else {
			System.out.println("31일 입니다.");	
	    }

	sc.close();	
	}
}
