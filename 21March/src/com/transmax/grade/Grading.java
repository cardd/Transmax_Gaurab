package com.transmax.grade;

import java.io.IOException;
import java.util.ArrayList;

public class Grading {

	public static void main(String[] args) {

		// Read file from a path location
		ReadFile readFile = new ReadFile("c:/21March.txt");

		// Declaration and dataType to store data
		GradingImplementation gradeImpl = new GradingImplementation();
		ArrayList<Student> score_list = new ArrayList<>();

		try {
			// open the file, read the data; split and store in an object
			String[] data = readFile.openFile();
			String[] temp;
			for (int i = 0; i < data.length; i++) {
				temp = data[i].split(",");
				try {
					score_list.add(new Student(temp[0], temp[1], Integer
							.parseInt(temp[2])));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			// Call implementation class with objects of student
			gradeImpl.sort_score(score_list);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
