package com.ifex;

/*
 * 문]
 * 입력받은 수가 3의 배수인지를 판별하는 프로그램을 구현하시오.
 * 정수입력 : 129
 * 129는 3의 배수입니다.
 */

import java.io.*;
import java.util.Scanner;
public class IfEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		
		if (num%3==0)
			System.out.println(num+"은 3의 배수입니다.");
		
		else 
			System.out.println(num+"은 3의 배수가 아닙니다.");
		
		
	}

}
