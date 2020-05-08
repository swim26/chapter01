package com.javaex.ex03;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.print("근무시간:");
		int time, a;
		time=sc.nextInt();	
		
		
		if(time>8){
			a=8*10000+(time-8)*12000;
			System.out.println("임금은 "+a+" 입니다.");	
		}
		else {
			a=time*1000;
			System.out.println("임금은 "+a+" 입니다.");	
		} 
		sc.close();
	}

}
