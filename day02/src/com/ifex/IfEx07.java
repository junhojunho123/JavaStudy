package com.ifex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *	if (조건식1){
 *		조건식 1의 결과 true일때 수행
 *		if(조건식2){
 *			조건식1과조건식2가 모두 true일때 수행
 *		}else {
 *			조건식1은 true이고, 조건식2는 false일때 수행
 *		}}
 *		else{
 *			조건식1이 false일때
 *		}
 * 
 * 
 * 
 */
public class IfEx07 {

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
		
		char op = 0;
		
		if (average >= 90) {
			grade='A'; // A+ : 98이상일때는 A+, A : 94 ~ 97, 94점 미만일 경우 A-
			if(average >=98) {
				op='+';
			}else if (average < 94) {
				op='-';
			}
			
		}
		else if (average >= 80 && average<= 89) {
			grade='B';
			if(average >=88) {
				op='+';
			}else if (average < 84) {
				op='-';
			}}
		else if (average >= 70 && average<= 79) {
			grade='C';
			if(average >=78) {
				op='+';
			}else if (average < 74) {
				op='-';
			}}
		else if (average >= 60 && average<= 69) {
			grade='D';
			if(average >=68) {
				op='+';
			}else if (average < 64) {
				op='-';
			}}
		else if (average >= 0 && average<= 59) {
			grade='F';
		}
		System.out.printf("당신의 학점은 %c%c입니다.",grade,op);
	}

	}


