package com.coderscampus;

import java.io.IOException;

public class UserLoginApplication {

	public static void main(String[] args) throws IOException {

		UserService userService = new UserService();
		User[] users = userService.readFile();
		User user2 = users[1];
		System.out.println(user2);
		System.out.println(users[1].getUsername());
		System.out.println(users[1].getPassword());
		System.out.println(users[1].getName());
		String userName = userService.loginInput("Enter your email: ");
		String password = userService.loginInput("Enter your password: ");
		String compared = userService.compareUserName(users, userName, password);
		System.out.println(userName);
		System.out.println(password);
	}

}
