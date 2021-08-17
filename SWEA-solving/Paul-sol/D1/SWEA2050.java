package com.day7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA2050 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		char[] temp = br.readLine().toCharArray();

		for (char c : temp) {
			int i = c - 64;
			sb.append(i + " ");
		}

		System.out.println(sb);

	}

}
