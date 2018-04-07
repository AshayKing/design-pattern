package com.ashayking.coder.chainofresponsibility;

/**
 * 
 * @author Ashay S Patil
 *
 */
public abstract class Handler {

	protected Handler succesor;

	public void setSuccesor(Handler succesor) {
		this.succesor = succesor;
	}
	
	public abstract void handleRequest(Request request);
}
