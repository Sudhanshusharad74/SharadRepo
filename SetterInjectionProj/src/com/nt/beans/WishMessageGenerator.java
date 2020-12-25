package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
private Date date;

public void setDate(Date date) {
	this.date = date;
}


public String WishMessage(String user)
{
	int hours=0;
	hours=date.getHours();//Give 24hours format
	if(hours<12)
	return "Good Morning"+user;
	else if(hours<15)
		return "Good AfterNoon"+user;
	else
		return "Good Night:";
}

}
