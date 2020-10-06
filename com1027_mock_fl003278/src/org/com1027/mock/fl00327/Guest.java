package org.com1027.mock.fl00327;

import java.util.ArrayList;
import java.util.List;

public class Guest implements IGuest{
private String forename = null;
private String surname = null;
private String address = null;
private String telephone = null;
private List<Charge> charges = null;

public Guest(String forename, String surname, String address, String telephone) {
	super();
	this.forename = forename;
	this.surname = surname;
	this.address = address;
	this.telephone = telephone;
	this.charges = new ArrayList<Charge>();
}

@Override
public void addCharge(Service service, double charge) {	
	this.charges.add(new Charge(service,charge));
}

@Override
public double calculateTotalChargeWithoutVAT() {
double total = 0;
for(Charge i : this.charges) {
	total += i.getCharge();
}
return total;
}

@Override
public double calculateVATChargeAtRate(VATRate rate) {
double total = 0;
if(rate == VATRate.LOW) {
total = ((this.calculateTotalChargeWithoutVAT()*5)/100);
}else if(rate == VATRate.STANDARD) {
	total = ((this.calculateTotalChargeWithoutVAT()*17.5)/100);
}else {
	total = this.calculateTotalChargeWithoutVAT();
}
return total;
}
@Override
public String toString() {
	StringBuffer buffer = new StringBuffer();
	buffer.append(this.forename+this.surname+","+this.address+","+this.telephone);
	return buffer.toString();
}
}
