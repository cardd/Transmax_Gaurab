package com.transmax.test;

import java.util.ArrayList;

public class GradeTest {
		
	ArrayList<Student> score_list = new ArrayList<>();
	Student student = new Student("TERESSA", "BUNKY", 88);
	score_list.add(student);
	Student student = new Student("ALLAN", "SMITH", 70);
	score_list.add(student);
	Student student = new Student("MADISON", "KING", 88);
	score_list.add(student);
	Student student = new Student("FRANCIS", "SMITH", 85);
	score_list.add(student);
	
	ArrayList<Student> score_listOutput = new ArrayList<>();
	Student student = new Student("MADISON", "KING", 88);
	score_listOutput.add(student);
	Student student = new Student("TERESSA", "BUNKY", 88);
	score_listOutput.add(student);
	Student student = new Student("FRANCIS", "SMITH", 85);
	score_listOutput.add(student);
	Student student = new Student("ALLAN", "SMITH", 70);
	score_list.add(student);
	
	@Test
		GradingImplementation gradeImpl = new GradingImplementation();
		Assert.assertEquals(gradeImpl.sort_score(score_list), score_listOutput);

		
	}
}