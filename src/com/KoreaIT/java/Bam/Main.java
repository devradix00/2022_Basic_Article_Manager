package com.KoreaIT.java.Bam; //해당 클래스를 명시한 패키지에 넣을 것임.

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");  

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("명령어");
			String cmd = sc.nextLine();
			
			if(cmd.equals("exit")) {
				break;
			}
			
			
		}
		
		System.out.println("==프로그램 끝==");  
		
		sc.close();

	}
}
