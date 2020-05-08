package com.javaex.ex04;
import java.util.Scanner;
public class Ex03 {
public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
        int dan,i,a ;              
        System.out.println("단을 입력해 주세요");
        System.out.print("단: ");
        dan=sc.nextInt();
        for(i=1;i<10;i++){
        	a=dan*i;
        	System.out.println(dan+"*"+i+"="+a);       	
        }
        sc.close();
        }
	    }
