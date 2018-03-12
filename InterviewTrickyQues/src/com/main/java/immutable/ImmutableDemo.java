package com.main.java.immutable;

public class ImmutableDemo {
	public static void main(String[] args) {
		Immutable ob = new Immutable("INR", "India");
		//ob.someLogic();
	}
}

class Immutable {
	private final String currencyName;

	public String getCurrencyName() {
		return currencyName;
	}

	/*public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}*/
	
	private final String CountryName;

	public String getCountryName() {
		return CountryName;
	}

	/*public void setCountryName(String countryName) {
		CountryName = countryName;
	}*/
	
	public Immutable(String curr, String country) {
		this.currencyName = curr;
		this.CountryName = country;
	}
	
	/*public void someLogic(){
		CountryName = "Canada";
		currencyName = "Dollar";
	}*/
}
