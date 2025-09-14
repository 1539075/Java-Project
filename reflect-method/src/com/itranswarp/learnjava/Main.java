package com.itranswarp.learnjava;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws Exception {
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射调用setName和setAge方法:
        Class c1 = p.getClass();
        Method m1 = c1.getMethod("setName", String.class);
        Method m2 = c1.getMethod("setAge", int.class);
        m1.invoke(p, name);
        m2.invoke(p, age);

		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
	}
}
