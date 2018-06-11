package com.aldercollege.dao;

import com.aldercollege.model.StudentProfile;

public interface StudentProfileDAO {
public boolean addStudent(StudentProfile student);
public boolean deleteStudent(StudentProfile student);
public boolean updateStudent(StudentProfile student);
public StudentProfile getStudent(String id);//id may change as per business requirement
}
