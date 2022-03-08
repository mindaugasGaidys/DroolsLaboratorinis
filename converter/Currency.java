package org.drools.examples.converter;

public class Currency {

    private String nameOfCurrency;
	private double valueInDollars;
	private boolean isChosen;
	private double amount= 0;

	public Currency() {
	}
	public Currency(String name, double value, boolean isChosen) {
		this.nameOfCurrency = name;
        this.isChosen = isChosen;
		this.valueInDollars = value;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setNameOfCurrency(String nameOfCurrency) {
		this.nameOfCurrency = nameOfCurrency;
	}
	public double getValueInDollars() {
		return valueInDollars;
	}
	
	public void setValueInDollars(double valueInDollars) {
		this.valueInDollars = valueInDollars;
	}
	
	public String getNameOfCurrency() {
		return nameOfCurrency;
	}
	public boolean isChosen() {
		return isChosen;
	}
	public void setChosen(boolean isChosen) {
		this.isChosen = isChosen;
	}
    
}
