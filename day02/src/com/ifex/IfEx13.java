package com.ifex;
/*
 * 문]
 * 임의의 년도를 입력받아 윤년인지 평년인지를 판정하는 프로그램을 구현하시오.
 * 윤년 조건
 * 4로 나누어 떨어지면 윤년
 * 4로 나누어 떨어지고 100으로 나누어 떨어지면 평년,
 * 4, 100, 400으로 나누어 떨어지면 윤년임
 */

import java.util.*;
public class IfEx13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		int a = sc.nextInt();
		
		if ((a%4==0)&&(a%100!=0)||(a%400==0)) {
			System.out.println("윤년입니다.");
			}
		else {
			System.out.println("평년입니다");
		}
		
	}

}
