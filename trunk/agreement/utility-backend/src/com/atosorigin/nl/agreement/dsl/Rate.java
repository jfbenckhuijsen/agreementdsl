package com.atosorigin.nl.agreement.dsl;

import com.atosorigin.nl.dsl.agreement.Amount;
import com.atosorigin.nl.dsl.agreement.ValueDecl;


public class Rate {

	private Amount amount;

	public Rate (ValueDecl valueDecl) {
		this.amount = valueDecl.getAmount();
	}

	public Amount getAmount() {
		return amount;
	}

}

