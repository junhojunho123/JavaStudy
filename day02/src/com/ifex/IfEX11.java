package com.ifex;

import java.util.Scanner;
public class IfEX11 {

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
		
		
		if ( a > b ) {
			// 첫번째 정수가 두번째 정수보다 큰 경우
			// 두 정수의 자리를 바꾼다.
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}
		if(a > c) {
			// 첫번째 정수가 세번째 정수보다 큰 경우
			// 두 정수의 자리를 바꾼다.
			a = a ^ c;
			c = c ^ a;
			a = a ^ c;
		}
		if(b > c) {
			// 두번째 정수가 세번째 정수보다 큰 경우
			// 두 정수의 자리를 바꾼다.
			b = b ^ c;
			c = c ^ b;
			b = b ^ c;
		}
		
	System.out.println("결과 : "+a+", "+b+", "+c);	
		
		
	}

}