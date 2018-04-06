package com.ashayking.coder.bridge.printer;

import java.util.List;

/**
 * 
 * @author Ashay S Patil
 *
 */
public interface Formatter {

	String format(String header, List<Detail> details);

}