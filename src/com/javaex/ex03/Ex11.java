package com.javaex.ex03;
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mon;
		System.out.println("월을 입력하세요");
		mon=sc.nextInt();
		switch(mon) {
		case 4:
		case 6:
		case 9:
		case 11:			
			System.out.print("30일 입니다");
			break;
		case 2:
			System.out.print("28일 입니다");
			break;
		default:		
			System.out.print("31일 입니다");
			break;					
		}
		sc.close();	
	}
}
