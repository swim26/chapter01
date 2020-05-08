package com.javaex.ex03_1;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자:");
		a=sc.nextInt();
		if (a>0) {
		   if(a%2==0) {
			System.out.println("짝수입니다.");
		}
			else {
				System.out.println("홀수입니다.");				
		}
		}
		else if (a==0) {
			System.out.println("0입니다.");		
		}
		else {
			System.out.println("음수입니다.");		
		}
		sc.close();
	}

}
