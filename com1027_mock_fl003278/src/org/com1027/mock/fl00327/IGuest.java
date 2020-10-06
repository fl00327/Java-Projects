package org.com1027.mock.fl00327;

public interface IGuest {
public void addCharge(Service service,double charge);
public double calculateTotalChargeWithoutVAT();
public double calculateVATChargeAtRate(VATRate rate);
public String toString();

}
