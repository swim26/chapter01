package com.javaex.ex03_1;
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int time, a;
		float b;
		System.out.print("근무시간: ");
		time=sc.nextInt();
		if (time>8) {
			b=8*10000+(time-8)*(float)1.5;
			System.out.print("임금은 "+b+"원 입니다");
			
		}
		else {
			a=time*10000;
			System.out.print("임금은 "+a+"원 입니다");
			sc.close();
	}
	}
}
