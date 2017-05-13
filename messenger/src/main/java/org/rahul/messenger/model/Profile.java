package org.rahul.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Profile
{
 private long id;
 public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}
private String profileName;
 private String firstName;
 private String lastName;   
 
public Profile()
{
	
}

public String getProfileName() {
	return profileName;
}

public void setProfileName(String profileName) {
	this.profileName = profileName;
}

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



public Profile(long id, String firstName, String lastName,String profileName) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.profileName=profileName;
}
 
}
