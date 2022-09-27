package numbersInStrings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class numbersInStrings {
	public static void main(String[] args) {
		BufferedReader reader;
		ArrayList<String> outputArray = new ArrayList<String>();
		try {
			reader = new BufferedReader(new FileReader("resources/input.txt"));
			String line = reader.readLine();
			while (line != null) {
				for (int i = 0; i < line.length() - 1; i++) {
					char currentChar = line.charAt(i);
					char nextChar = line.charAt(i + 1);
					if (currentChar != '0' && Character.isDigit(currentChar) && Character.isDigit(nextChar)) {
						outputArray.add(line);
						break;
					}
				}
				line = reader.readLine();
			}
			reader.close();
			for (int i = 0; i < outputArray.size(); i++) {
				System.out.println(outputArray.get(i));
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}