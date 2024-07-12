package com.ifex;
/*
 * 문]
 * 임의의 알파벳 한 문자를 입력받아
 * 입력받은 알파벳이 모음일 경우 모음,
 * 그외는 자음으로 출력하는 프로그램을 구현하시오.
 * 단, 알파벳 범위 : 대소문자의 범위임
 * 알파벳이 아닌경우
 * "입력오류"라고 출력하시오.
 * 
 * if문을 활용
 */
import java.io.*;
public class IfEx12 {

	public static void main(String[] args) throws IOException{
	 
	 System.out.print("알파벳을 입력 : ");
	 char a = (char)System.in.read();
	
	 
	 
	if((a>='a' && a<='z')||(a>='A' && a<='Z')) {
		 if (a == 'a'|| a == 'e'|| a == 'i'|| a == 'o'|| a == 'u'||a == 'A'|| a == 'E'|| a == 'I'|| a == 'O'|| a == 'U')
		 {
			System.out.println("모음입니다");
		}
		 else {
			 System.out.println("자음입니다.");
		 }
	}else {
		System.out.println("입력오류!!!");
	}
	}
		
	
	 
	}


