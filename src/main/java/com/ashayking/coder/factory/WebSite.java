package com.ashayking.coder.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ashay S Patil
 *
 */
public abstract class WebSite {

	protected List<Page> pages = new ArrayList<>();

	public List<Page> getPages() {
		return pages;
	}

	public WebSite() {
		this.createWebSite();
	}

	public abstract void createWebSite();

}
