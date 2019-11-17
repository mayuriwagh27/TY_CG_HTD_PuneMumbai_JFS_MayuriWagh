package com.capgrmini.currency;

import java.util.Currency;
import java.util.Set;

public class Currency_example {
	public static void main(String[] args) {
		Currency c = Currency.getInstance("INR");
		Currency c1 = Currency.getInstance("USD");          //getInstance will create object of currency

		String cSymbol = c.getSymbol();
		String c1Symbol = c1.getSymbol();
		System.out.println("Symbol for INR is: "+cSymbol);           //shows symbol of currency
		System.out.println("Symbol for INR is: "+c1Symbol);
		System.out.println("------------------------------");

		String cDisplayName = c.getDisplayName();
		String  c1DisplayName = c1.getDisplayName();
		System.out.println("Display Name for: "+cDisplayName);            //shows name of country  
		System.out.println("Display Name for: "+c1DisplayName);
		System.out.println("--------------------------------");

		Set<Currency> currencies = Currency.getAvailableCurrencies();     //shows all the currencies
		System.out.println(currencies);
		System.out.println("-----------------------------------");

		int cDefaultFraction = c.getDefaultFractionDigits();
		int c1DefaultFraction = c1.getDefaultFractionDigits();
		System.out.println("Default Fraction digits for INR is: "+cDefaultFraction);
		System.out.println("Default Fraction digits for USD is: "+cDefaultFraction);
		System.out.println("--------------------------------------------------------");












	}
}
