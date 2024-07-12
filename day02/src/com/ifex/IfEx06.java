package com.ifex;

/* 문]
 * 국어, 영어, 수학, 사회, 과학과목을 점수를 입력받아
 * 총점과 평균을 구하고 평균을 이용하여 학점을 판정하는 프로그램을 구현하시오.
 * 단, 다중 if문으로 구현
 * 
 * A : 90이상
 * B : 80~89
 * C : 70~79
 * D : 60~69
 * F : 60미만은 F로 처리
 * 
 */

import java.io.*;
public class IfEx06 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char grade=' ';
		int a, b, c, d, e;
		System.out.print("국어 점수를 입력하시오 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("영어 점수를 입력하시오 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("수학 점수를 입력하시오 : ");
		c = Integer.parseInt(br.readLine());
		System.out.print("사회 점수를 입력하시오 : ");
		d = Integer.parseInt(br.readLine());
		System.out.print("과학 점수를 입력하시오 : ");
		e = Integer.parseInt(br.readLine());	
		
		int all = a+b+c+d+e;
		
		int average = all/5;
		
		System.out.println("총점은"+(all)+"입니다.");
		if (average >= 90) {
			System.out.println("평균은"+average+"입니다. \n등급은 A입니다.");
		}
		else if (average >= 80) {
			System.out.println("평균은"+average+"입니다. \n등급은 B입니다.");
		}
		else if (average >= 70) {
			System.out.println("평균은"+average+"입니다. \n등급은 C입니다.");
		}
		else if (average >= 60) {
			System.out.println("평균은"+average+"입니다. \n등급은 D입니다.");
		}
		else if (average <60) {
			System.out.println("평균은"+average+"입니다. \n등급은 F입니다.");
		}
		
//		if (average >= 90) {
//			grade='A';
//		}
//		else if (average >= 80 &&<= 89) {
//			grade='B';
//		}
//		else if (average >= 70 && <= 79) {
//			grade='C';
//		}
//		else if (average >= 60 && <= 69) {
//			grade='D';
//		}
//		else if (average >= 0 && <= 59) {
//			grade='F';
//		}
//		System.out.println("당신의 학점은"+);
//	}

	}}
