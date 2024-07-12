package com.ifex;

/*
 * 문]
 * 두 정수를 입력받아 큰 수를 출력하는 프로그램을 구현하시오.
 * 첫 번째 정수 : 5
 * 두 번째 정수 : 2
 * 
 * 큰 수 : 5, 작은 수 : 2 
 * 
 */
import java.util.*;
public class IfEx09 {

	public static void main(String[] args) {
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력 : ");
		a = sc.nextInt();
		System.out.print("두번째 정수를 입력 : ");
		b = sc.nextInt();
		System.out.print("세번째 정수를 입력 : ");
		c = sc.nextInt();
		
		if (a > b) {
			System.out.println("첫번째 정수("+a+")가 두번째 정수("+b+")보다 큰 수입니다.");
		}else {
			System.out.println("첫번째 정수("+a+")가 두번째 정수("+b+")보다 작은 수입니다.");
		}
		
		
	
		
		
		
		
		
		
	}

}
