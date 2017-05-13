package org.rahul.messenger.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rahul.messenger.database.DatabaseC1;

public class profileService {
	DatabaseC1 c1 = new DatabaseC1();
	private Map<String,Profile> profiles = c1.getAllProfiles();
	
	public profileService()
	{
		profiles.put("rahul", new Profile(1L,"Virat","kohli","Vikohli"));
		profiles.put("karan", new Profile(2L,"MS nitin","Dhoni","MSDhoni"));
		
	}
	public List<Profile> getAllprofiles()
	{
		return new ArrayList<Profile>(profiles.values());
	}
	public Profile addProfile(Profile profile)
	{
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	public Profile getProfile(String profileName)
	{
		return profiles.get(profileName);
	}
public Profile updateProfile(Profile profile)
{
	if(profile.getProfileName().isEmpty())
	{
		return null;
	}
	profiles.put(profile.getProfileName(), profile);
	return profile;
}
public Profile removeProfile(String profileName)
{
	 return profiles.remove(profileName);
	
}


	
	

}
