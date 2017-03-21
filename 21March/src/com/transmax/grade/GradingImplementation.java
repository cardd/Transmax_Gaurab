package com.transmax.grade;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GradingImplementation {

	private void sort(ArrayList<Student> score_list) {
		Collections.sort(score_list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getScore() != o2.getScore())
					return o2.getScore() - o1.getScore();
				int r = o1.getLastName().compareTo(o2.getLastName());
				if (r != 0)
					return r;
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
	}

	public void sort_score(ArrayList<Student> score_list) {

		sort(score_list);

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(
					"-graded.txt"));
			String rec;
			for (Student s : score_list) {

				System.out.println("....sorted... ");
				System.out.println(s.getFirstName());
				System.out.println(s.getLastName());
				System.out.println(s.getScore());
				rec = String.format("%s,%s, %d", s.getFirstName(),
						s.getLastName(), s.getScore());

				writer.write(rec);
				writer.newLine();
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}