package com.rudraksh.springboot.mapper;

import java.util.List;

import com.rudraksh.springboot.web.dto.ActivityWithUser;
import com.rudraksh.springboot.web.dto.IActivityWithUser;

public interface CustomMapper {

	List<ActivityWithUser> iActivityWithUsertoActivityWithUser(List<IActivityWithUser> l);
}
