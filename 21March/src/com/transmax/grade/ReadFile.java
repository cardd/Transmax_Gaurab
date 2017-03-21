package com.transmax.grade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	private String path;

	public ReadFile(String fileLocation) {
		path = fileLocation;
	}

	public String[] openFile() throws IOException {
		int numberOFLines = countLines();
		BufferedReader br = new BufferedReader(new FileReader(path));

		// Create an array to store the lines of text
		String[] data = new String[numberOFLines];
		for (int i = 0; i < numberOFLines; i++) {
			data[i] = br.readLine();
		}
		br.close();
		return data;
	}

	private int countLines() throws IOException {
		int numberOFLines = 0;
		BufferedReader br = new BufferedReader(new FileReader(path));
		while (br.readLine() != null) {
			numberOFLines++;
		}
		br.close();
		return numberOFLines;
	}

}
