package com.ifex;

import java.io.*;
import java.util.*;
public class IfEx01 {

	public static void main(String[] args) throws IOException {
		// 버퍼 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input;
		System.out.print("임의의 숫자 입력 : ");
		input = Integer.parseInt(br.readLine());
		
		
		// 스캐너 객체 생성
		int input2;
		System.out.print("임의의 숫자 입력 : ");
		Scanner sc =  new Scanner(System.in);
		input2 = sc.nextInt();		

		
//		if (input==0) {// 조건이 참일 경우
//			System.out.println("입력하신 숫자는 "+input+"입니다.");
//			
//		}
//		if (input!=0) {// 조건이 거짓일 경우
//			System.out.println("입력하신 숫자는 0이 아닙니다.");
//			System.out.printf("입력하신 숫자는 %d입니다.%n", input);
//		}
		
		if (input==0) {// 조건이 참일 경우
			System.out.println("입력하신 숫자는 "+input+"입니다.");
			
		}
		else {// 조건이 거짓일 경우
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d입니다.%n", input);
		
		
		
		
	}
	}
}
