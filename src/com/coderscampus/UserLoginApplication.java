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
		System.out.println(data);
		String line = userService.getDataLine();
		// System.out.println(line);
		String[] array = userService.parseText(data);
		System.out.println(Arrays.toString(array));
//		System.out.println(array[2]);
		String[] again = userService.parseText1(array[2]);
		System.out.println(Arrays.toString(again));
		System.out.println(again[0]);
		user.setUsername(array[0]);
		// System.out.println(user.getUsername());
		scanner.close();
	}

}
