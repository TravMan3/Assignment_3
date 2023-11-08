package com.coderscampus;

import java.io.IOException;
import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		UserService userService = new UserService();
		User[] users = userService.readFile();
		
		int i = 0;
		boolean shouldContinue = true;
		while (i <= 4 && shouldContinue) {
			String userName = userService.loginInput("\n" + "Enter your email: " + "\n", scanner);
			String password = userService.loginInput("\n" + "Enter your password: " + "\n", scanner);
			shouldContinue = !userService.compareUserName(users, userName, password);
			if (i >= 4 && shouldContinue) {
				System.out.println("\n" + "Too many failed login attempts, you are now locked out.");
				break;
			}
			if (shouldContinue) {
				System.out.println("\n" + "Invalid login, please try again");
			}
			i++;
		}
		scanner.close();
	}

}
