package com.javaex.ex03;
import java.util.Scanner;
public class Ex08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int point;
		System.out.println("숫자를 입력하세요");
		System.out.println("숫자:");
		point=sc.nextInt();
		
		if (point > 0) {
			if (point%2==0) {
				System.out.println("짝수입니다.");
			}
			else {
				System.out.println("홀수입니다");
		    }
		}
	    else if (point == 0) {			
			System.out.println("0입니다.");
		}
		else  {			
			System.out.println("음수입니다.");
		}
		
	sc.close();

	}

}
