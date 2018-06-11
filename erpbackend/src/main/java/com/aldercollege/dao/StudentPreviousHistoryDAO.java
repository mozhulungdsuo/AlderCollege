package com.aldercollege.dao;


import com.aldercollege.model.StudentPreviousHistory;

public interface StudentPreviousHistoryDAO {
	public boolean addPreviousAcademicHistory (StudentPreviousHistory previous);
	public boolean deletePreviousAcademicHistory (StudentPreviousHistory previous);
	public boolean updatePreviousAcademicHistory (StudentPreviousHistory previous);
	public StudentPreviousHistory getPreviousAcademicHistory (String id);
}
