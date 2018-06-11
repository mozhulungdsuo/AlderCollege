package com.aldercollege.dao;

import com.aldercollege.model.BASubjectCombo;


public interface BASubjectComboDAO {
	public boolean addBAStudentSubjectCombination(BASubjectCombo subjects);
	public boolean deleteBAStudentSubjectCombination(BASubjectCombo subjects);
	public boolean updateBAStudentSubjectCombinatione(BASubjectCombo subjects);
	public BASubjectCombo getBAStudentSubjectCombinationList(String id);
}
