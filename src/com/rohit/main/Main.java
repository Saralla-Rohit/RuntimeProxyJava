package com.rohit.main;

import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		Radio r=new FMRadio();
		Radio proxy=(Radio)Proxy.newProxyInstance(
				Radio.class.getClassLoader(),
				new Class<?>[] {Radio.class},
				new RadioHandler(r)
				);
		proxy.play();
	}
}
