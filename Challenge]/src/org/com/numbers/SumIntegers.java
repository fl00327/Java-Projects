package org.com.numbers;

public class SumIntegers {

private int maximum = 0;
public SumIntegers(int maximum) throws IllegalArgumentException {
	super();
	if (maximum > 10) {
		throw new IllegalArgumentException("your Number should be in b/w 1-10");
	}
	this.maximum = maximum;
	
	
}
public int getMaximum() {
	return maximum;
}
public void setMaximum(int maximum) {
	this.maximum = maximum;
}

public int calculateSum() {
int sum = 0;
for(int number = 1; number <= this.maximum; number++){
 sum = sum + number;

 
 }
return sum;
}


}


