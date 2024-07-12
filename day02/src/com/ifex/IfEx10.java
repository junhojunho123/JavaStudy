package com.ifex;

/*
 * 문]
 * 
 * 세개의 정수를 입력받아 큰 순서대로 출력하는 프로그램을 구현하시오.
 * 첫 번째 정수 : 5
 * 두 번째 정수 : 2
 * 세 번째 정수 : 4
 * 
 * 5 4 2 
 * 
 * 
 */
import java.util.*;
public class IfEx10 {

	public static void main(String[] args) {
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력 : ");
		a = sc.nextInt();
		System.out.print("두번째 정수를 입력 : ");
		b = sc.nextInt();
		System.out.print("세번째 정수를 입력 : ");
		c = sc.nextInt();
		
		int temp; // 임시 저장할 공간
		
		
		if ( b>=a && b >= c) {
			temp = a; // 첫번째 정수가 임시공간 저장됨
			a = b; // 두번째 정수가 첫번째 공간에 저장됨
			b = temp; // 두번째 공간에 임시공간에 저장되어 있는 첫번째 정수가 저장됨
		}
		else if(c >= a && c >= b) {
			temp = a; // 첫번째 정수가 임시공간 저장됨
			a = c; // 세번째 정수가 첫번째 공간에 저장됨
			c = temp; // 임시 공간에 저장된 정수가 세번째 정수가 저장된 공간에 저장됨
			
		}
		if(c>=b) {
			temp = b;
			b = c;
			c = temp;
			
		}
		
	System.out.println(a+">="+ b+">=" +c);	
		
		
	}

}
