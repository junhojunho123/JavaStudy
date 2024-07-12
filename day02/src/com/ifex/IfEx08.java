package com.ifex;

/*
 * 문]
 *	점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격
 *	단 학년이 4학년인 경우 70점 이상이면 합격 미만이면 불합격
 * 점수범위 : 0 ~ 100, 학년의 범위 : 1 ~ 4
 * 
 */
import java.io.*;
public class IfEx08 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		
		System.out.print("점수를 입력하시오 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("학년을 입력하시오 : ");
		b = Integer.parseInt(br.readLine());
		
		if (b == 4) {
			if(a >= 70) {
				System.out.println("합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
		}if(b < 4){
			if(a>=60) {
				System.out.println("합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
		}
		
		
	}

}
