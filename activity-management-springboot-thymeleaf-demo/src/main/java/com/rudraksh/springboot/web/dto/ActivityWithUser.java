package com.rudraksh.springboot.web.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ActivityWithUser {

	@Override
	public String toString() {
		return "ActivityWithUser{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", activityName='" + activityName + '\'' +
				", activityDesc='" + activityDesc + '\'' +
				", deadlineDate=" + deadlineDate +
				'}';
	}

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String firstName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String lastName;

	public ActivityWithUser(){

	}

	public ActivityWithUser(String firstName, String lastName, String activityName, String activityDesc, Date deadlineDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.activityName = activityName;
		this.activityDesc = activityDesc;
		this.deadlineDate = deadlineDate;
	}

	private String activityName;
	private String activityDesc;

	private Date deadlineDate;


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityDesc() {
		return activityDesc;
	}

	public void setActivityDesc(String activityDesc) {
		this.activityDesc = activityDesc;
	}

	public Date getDeadlineDate() {
		return deadlineDate;
	}

	public void setDeadlineDate(Date deadlineDate) {
		this.deadlineDate = deadlineDate;
	}
}
