package com.javaex.ex04;
import java.util.Scanner;
public class Ex02 {
public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
        int dan,i,a ;
        i=1;
        System.out.println("단을 입력해 주세요");
        System.out.print("단: ");
        dan=sc.nextInt();
        while(i<10){
        	a=dan*i;
        	System.out.println(dan+"*"+i+"="+a);
        	i++;        	
        }
        sc.close();
        }
	    }

