package com.yrdomain.ch11;
import java.util.Objects;
public class ToStringEx2 {

		public static void main(String[] args) {
			String str1 = "�����";
			String str2 = null;
			
			System.out.println(Objects.toString(str1));
			System.out.println(Objects.toString(str2));
			System.out.println(Objects.toString(str2, "�̸��� �����ϴپƾ�~~"));
		}
	}