package com.ashayking.coder.factory;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class ShopWebSite extends WebSite {

	@Override
	public void createWebSite() {
		pages.add(new CartPage());
		pages.add(new SearchPage());
		pages.add(new ItemPage());
	}

}
