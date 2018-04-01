package com.ashayking.coder.factory;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class BlogWebSite extends WebSite {

	@Override
	public void createWebSite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
