package com.coderscampus;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		UserService userService = new UserService();
		User user = new User();

//		String username = userService.input(scanner,"\n" + "Enter your email: " + "\n");
//		String password = userService.input(scanner,"\n" + "Enter your password: " + "\n");
		String data = userService.getData();
		
		String[] array = userService.parseText(data,"\\R");
		userService.split(array);
		
		user.setUsername(array[0]);
		System.out.println(user.getUsername());
		scanner.close();
	}

}
