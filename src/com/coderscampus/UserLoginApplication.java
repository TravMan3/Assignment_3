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
		String[] array = userService.parseText(data);
		System.out.println(Arrays.toString(array));
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(user.getUsername());
		user.setUsername(array[1]);
		System.out.println(user.getUsername());
		scanner.close();
	}
	
}
