package com.javaex.ex03;
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int point;
		System.out.print("점수를 입력하세요:");
		point=sc.nextInt();
		if (point>=90) {
			System.out.print("A등급");			
		}
		else if(point>=80) {
			System.out.print("B등급");			
		}
		else if(point>=70) {
			System.out.print("C등급");			
		}
		else if(point>=60) {
			System.out.print("D등급");			
		}
		else {
			System.out.print("F등급");			
		}
		sc.close();

	}

}
