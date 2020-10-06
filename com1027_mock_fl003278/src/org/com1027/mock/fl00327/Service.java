package org.com1027.mock.fl00327;

public class Service {
private String code = null;
private String name = null;
private VATRate rate = null;
private double standardCharge = 0;

public Service(String code, String name, VATRate rate, double standardCharge)throws IllegalArgumentException {
	super();
	if(code.matches("[A-Z]{4}[0-9]{4}")) {
	this.code = code;
	}else {
		throw new IllegalArgumentException("Invalid Code");
	}
	if(name == null && rate == null) {
		throw new IllegalArgumentException("Enter Something");
	}else {
	this.name = name;
	this.rate = rate;
	}
	if(standardCharge < 0) {
		throw new IllegalArgumentException("Charge must be greater than zero");
	}else {
	this.standardCharge = standardCharge;
	}
}

public String getCode() {
	return this.code;
}

public String getName() {
	return this.name;
}

public VATRate getRate() {
	return this.rate;
}

public double getStandardCharge() {
	return this.standardCharge;
}


}
