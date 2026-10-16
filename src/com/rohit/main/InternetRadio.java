package com.rohit.main;

public class InternetRadio implements Radio{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		IO.println("InternetRadio Turned ON");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		IO.println("InternetRadio Turned OFF");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		IO.println("Playing InternetRadio");
	}

}
