package org.rahul.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.rahul.messenger.model.Message;
import org.rahul.messenger.model.Profile;

public class DatabaseC1
{

	public static String ram;
	 public static  Map<Long,Message> messages = new HashMap<Long, Message>();
	private static Map<String,Profile> profile = new HashMap<String, Profile>();
	 
	 public static Map<Long,Message> getAllMessage()
	 {
		 return messages;
	 }
	 
	 public static Map<String,Profile> getAllProfiles()
	 {
		 return profile;
	 }
	 
}
