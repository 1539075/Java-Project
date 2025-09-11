package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String a = "12";
		String b = "x9";
		// TODO: 捕获异常并处理
		int c = stringToInt(a);
		int d = stringToInt(b);
		System.out.println(c * d);
	}

	static int stringToInt(String s) {
		try {
			return Integer.parseInt(s);
		} catch (NullPointerException e) {
			e.printStackTrace();
			throw new RuntimeException("input is null");
			// return 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			throw new RuntimeException("input is empty");
			// return 0;
		} catch (NumberFormatException e) {
			e.printStackTrace();
			throw new RuntimeException("input is not a number: " + s);
			// return 0;

		}
	}
}
