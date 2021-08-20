package com.ntt.test;
import java.util.*;
public class Question1b {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the size of string array : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			arrList.add(sc.next());
		}
		System.out.println("Reversed Strings : ");
		for(int j=arrList.size()-1;j>=0;j--) {
			System.out.println(arrList.get(j));
		}

	}
}


	

