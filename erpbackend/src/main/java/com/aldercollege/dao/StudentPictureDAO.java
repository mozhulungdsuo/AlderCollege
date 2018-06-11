package com.aldercollege.dao;

import com.aldercollege.model.StudentPicture;

public interface StudentPictureDAO {
	public void save(StudentPicture picture);
	public StudentPicture getPicture(String id);
}
