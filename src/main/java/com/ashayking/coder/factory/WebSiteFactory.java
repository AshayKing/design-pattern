package com.ashayking.coder.factory;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class WebSiteFactory {

	public enum WebSiteType {
		BLOG, SHOP;
	}

	public static WebSite getWebSite(WebSiteType type) {
		switch (type) {
		case BLOG:
			return new BlogWebSite();
		case SHOP:
			return new ShopWebSite();
		default:
			return null;
		}
	}
}
