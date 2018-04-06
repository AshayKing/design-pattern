package com.ashayking.coder.bridge.printer;

import java.util.List;

/**
 * 
 * @author Ashay S Patil
 *
 */
public abstract class Printer {

	public String print(Formatter formatter) {
		return formatter.format(getHeader(), getDetails());
	}

	abstract protected List<Detail> getDetails();

	abstract protected String getHeader();

}