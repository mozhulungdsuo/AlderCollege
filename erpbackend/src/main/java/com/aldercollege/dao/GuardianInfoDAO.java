package com.aldercollege.dao;

import com.aldercollege.model.GuardianInfo;

public interface GuardianInfoDAO {
	public boolean addGuardian(GuardianInfo guardian);
	public boolean deleteGuardian(GuardianInfo guardian);
	public boolean updateGuardian(GuardianInfo guardian);
	public GuardianInfo  getGuardian(String id);

}
