package com.rohit.main;
import java.lang.reflect.*;
public class RadioHandler implements InvocationHandler{
	
	private final Object target;
	public RadioHandler(Object target) {
		// TODO Auto-generated constructor stub
		this.target=target;
	}
	@Override
	public Object invoke(Object proxy,Method m,Object args[])throws Throwable{
		IO.println("Before invoking method");
		Object res=m.invoke(target);
		IO.println("Adter invoking method");
		return res;
		
	}
	
}
