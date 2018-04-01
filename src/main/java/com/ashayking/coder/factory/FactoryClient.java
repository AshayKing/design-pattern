package com.ashayking.coder.factory;

import com.ashayking.coder.factory.WebSiteFactory.WebSiteType;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class FactoryClient {

	public static void main(String[] args) {
		WebSite shop = WebSiteFactory.getWebSite(WebSiteType.SHOP);
		System.out.println(shop.getPages());
		
		WebSite blog = WebSiteFactory.getWebSite(WebSiteType.BLOG);
		System.out.println(blog.getPages());
	}
}
