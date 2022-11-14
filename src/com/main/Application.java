package com.main;

import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);	
//		System.out.println("mahkum sayısını giriniz");
//		int n = scan.nextInt(); if(1>n) System.out.println("n: "+1+"'den kucuk olamaz");
//		System.out.println("hediye sayısı giriniz");
//		int m = scan.nextInt(); if(1>m) System.out.println("m: "+1+"'den kucuk olamaz");
//		int s=2;
//		boolean a=false;	
//		while(true) {
//			for(int i=s;i<=n;i++) {				
//				m--;
//				if(i==n) {
//					s=1;
//				}
//				if(m==0) {
//					System.out.println(i);
//					a=true;
//				}
//			}
//			if(a==true) {
//				break;
//			}
//		}
		int n = 4; // mahkum sayisi
		int m = 6; // ikram  sayisi
		int s = 4; // kacinci siradan baslanacagi
		int result = (m+s-1)%n;
		if(result==0) result = n;
		System.out.println(result); //return result;
	}
	

}
