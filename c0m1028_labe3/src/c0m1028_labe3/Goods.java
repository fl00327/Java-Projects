package c0m1028_labe3;

public class Goods {
	
private String barcode = null;
private String name = null;
private double currentPrice = 0.0;
private double reducedPrice = 0.0;

public Goods(String barcode, String name, double currentPrice, double reducedPrice) {
	super();
	this.barcode = barcode;
	this.name = name;
	this.currentPrice = currentPrice;
	this.reducedPrice = reducedPrice;
}

public String getBarcode() {
	return this.barcode;
}

public String getName() {
	return this.name;
}

public double getCurrentPrice() {
	return this.currentPrice;
}

public double getReducedPrice() {
	return this.reducedPrice;
}

}
