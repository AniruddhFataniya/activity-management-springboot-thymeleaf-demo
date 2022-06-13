package com.rudraksh.springboot.web.dto;

import java.util.Date;

public interface IActivityWithUser {

	String getFirstName();
    String getLastName();
    String getActivityName();
    String getActivityDesc();
    Date getDeadlineDate();
}
