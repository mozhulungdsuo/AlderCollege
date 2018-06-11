package com.aldercollege.dao;

import com.aldercollege.model.BAStudentSubjectCombination;


public interface BAStudentSubjectCombinationDAO {
	public boolean addBAStudentSubjectCombination(BAStudentSubjectCombination subjects);
	public boolean deleteBAStudentSubjectCombination(BAStudentSubjectCombination subjects);
	public boolean updateBAStudentSubjectCombinatione(BAStudentSubjectCombination subjects);
	public BAStudentSubjectCombination getBAStudentSubjectCombinationList(String id);
}
