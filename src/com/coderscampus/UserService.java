package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class UserService {
	
	public User[] readFile() throws IOException {
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			User[] user1 = new User[4];
			String line;
			int i = 0;
			while ((line = fileReader.readLine()) != null){
				String[] data = line.split(",");
				
				String userName = data[0];
				String password = data[1];
				String name = data[2];
				
				User user = new User();
				user.setUsername(userName);
				user.setPassword(password);
				user.setName(name);
				user1[i] = user;
				i++;
			}
				return user1;
			} finally {
				fileReader.close();
			
		}
	}
	
	
	public String loginInput(String displayedMessage) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(displayedMessage);
		String userInput = scanner.nextLine();
		return userInput;
	}
	
	public String compareUserName(User[] users, String userName, String password) {
		User user2 = users[1];
		System.out.println(user2);
		System.out.println(users[1].getUsername());
		System.out.println(users[1].getPassword());
		System.out.println(users[1].getName());
		return "";
	}
	
}
