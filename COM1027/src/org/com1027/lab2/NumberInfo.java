package org.com1027.lab2;

public class NumberInfo {
	private int limit = 0;
	private int value = 0;
	public NumberInfo(int limit) {
        super();
		this.limit = limit;
		
	}
	public int getValue() {
		return value;
	}
	public void increment() {
    this.value++;
	this.value = (this.value) % this.limit;
	}
}

