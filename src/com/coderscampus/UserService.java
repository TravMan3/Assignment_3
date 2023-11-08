package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
	
	
	public String loginInput(String displayedMessage, Scanner scanner) {
		System.out.println(displayedMessage);
		String userInput = scanner.nextLine();
		return userInput;
	}
	
	public boolean compareUserName(User[] users, String userName, String password) {
		int i = 0;
		while (i < users.length) {
			if(userName.equals(users[i].getUsername()) && password.equals(users[i].getPassword())) {
				System.out.println("\n" + "Welcome: " + users[i].getName());
			return true;
			} 
		i++;		
		}
		return false;
	}
	
}
