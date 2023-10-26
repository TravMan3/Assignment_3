package com.coderscampus;

import java.io.IOException;

public class UserLoginApplication {

	public static void main(String[] args) throws IOException  {

		UserService user = new UserService();
		System.out.println(user.readFile());
		String userName = user.loginInput("Enter your email: ");
		String password = user.loginInput("Enter your password: ");
		System.out.println(userName);
		System.out.println(password);
	}

}
