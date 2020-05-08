package com.javaex.ex03;
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("근무시간:");
		int time,b;
		float a;
		time=sc.nextInt();	
		
		
		if(time>8){
			a=time*10000+(time-8)*(float)1.5;   			
			System.out.println("임금은 "+a+" 입니다.");	
		}
		else {
		b=time*10000;
		System.out.println("임금은 "+b+" 입니다.");	
		}
		sc.close();
	}
}

