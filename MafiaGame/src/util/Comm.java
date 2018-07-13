package util;

import java.util.Scanner;

public class Comm {
	
	public  int InputByInt(String msg,Scanner s) {
		System.out.println(msg+"를 입력해주세요");
		return s.nextInt();
	}
	public  String InputByString(String msg,Scanner s) {
		System.out.println(msg+"를 입력해주세요");
		return s.next();
	}
}
