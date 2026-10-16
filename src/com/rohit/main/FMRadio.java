package com.rohit.main;

public class FMRadio implements Radio {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		IO.println("FMRadio Turned ON");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		IO.println("FMRadio Turned OFF");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		IO.println("Playing FMRadio");
	}
}
