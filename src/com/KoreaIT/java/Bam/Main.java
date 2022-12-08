package com.KoreaIT.java.Bam; //해당 클래스를 명시한 패키지에 넣을 것임.

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");  

		Scanner sc = new Scanner(System.in);
		
		String cmd = sc.nextLine();
		
		
		System.out.println("입력된 명령어 : "+ cmd);
		
		System.out.println("==프로그램 끝==");  
		
		sc.close();

	}
}
