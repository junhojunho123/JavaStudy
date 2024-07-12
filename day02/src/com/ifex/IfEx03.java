package com.ifex;

/*
 * 문]
 * 임의의 정수를 입력 받은 후 
 * 정수가 짝수인지 홀수인지를 판정하는 프로그램을 구현하시오.
 * 
 */
import java.io.*;
import java.util.Scanner;
public class IfEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int n = sc.nextInt();
		
		
		
		if (n%2==0) {
			System.out.println(n+"은 짝수입니다.");
		}
		else {
			System.out.println(n+"은 홀수입니다.");
		
	}

}}
