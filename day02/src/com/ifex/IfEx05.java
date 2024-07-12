package com.ifex;

/*
 * 문]
 * 두개의 정수와 연산자를 입력받아 계싼하는 프로그램을 구현하시오.
 * 
 * 
 * ex)
 * 		첫번째 정수 : 3
 *		 연산자 : 3
 *		 두번째 정수 : 5
 * 
 * 		결과 출력
 * 		3 + 5 = 8
 * 
 * 
 * 
 */

import java.io.*;
public class IfEx05 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n1,n2;
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("연산자를 입력하세요 : ");
		char i = (char)System.in.read();
		System.in.read();
		System.in.read();
		System.out.print("두번째 정수를 입력하세요 : ");
		n2 = Integer.parseInt(br.readLine());
		
		if(i == '*' ) {
			System.out.println("결과는"+(n1*n2)+"입니다.");
		}
		else if(i == '+' ) {
			System.out.println("결과는"+(n1+n2)+"입니다.");
		}
		else if(i == '%' ) {
			System.out.println("결과는"+(n1%n2)+"입니다.");
		}
		else if(i == '/' ) {
			System.out.println("결과는"+(n1/n2)+"입니다.");
		}
		else if(i == '-' ) {
			System.out.println("결과는"+(n1-n2)+"입니다.");
		}else {System.out.println("연산자가 아닙니다.");
		}
		
	}

}
