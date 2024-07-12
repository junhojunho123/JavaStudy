package com.ifex;

/*
 *  문]
 *  시험점수를 임의로 입력받은 후 점수가 80점 이상이면 합격처리하는 프로그램을 구현하시오.
 * 
 * 
 * 
 */
import java.util.*;
public class IfEx02 {

	public static void main(String[] args) {
		int test;
		System.out.print("점수를 입력하세요 : ");
		Scanner sc= new Scanner(System.in);
		test = sc.nextInt();
		
		if (test>=80) 
			System.out.println("합격 입니다.");
		
		else 
				System.out.println("불합격 입니다.");
		
		
		
		
		
	}

}
