package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserService {

	public String inputLogin(Scanner scanner, String displayedMessage) {
		System.out.println(displayedMessage);
		String userInput = scanner.nextLine();
		return userInput;
	}

	public String getData() throws IOException {
		StringBuilder result = new StringBuilder();
		BufferedReader fileReader = null;
		String line;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));

			while ((line = fileReader.readLine()) != null) {
				result.append(line + "\n");

			}

		} finally {
			fileReader.close();
		}
		return result.toString();
	}

	public String[] parseText(String input) {
		return input.split("\\R");
	}
	public String[] parseText1(String input) {
		return input.split(",");
	}
	public String getDataLine() throws IOException {
		BufferedReader fileReader = null;
		fileReader = new BufferedReader(new FileReader("data.txt"));
		String line = fileReader.readLine();
			
		fileReader.close();
		return line.toString();
	}
}
