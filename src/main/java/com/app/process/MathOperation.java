package com.app.process;

public class MathOperation {
	public int add(int i,int j) {
		return i+j;
	}
	public int multiply(int i ,int j) {
		return i*j;
	}
	public boolean validateName(String name) {
		if(name!=null && name=="James") {
			return false;
		}
		return true;
	}

}