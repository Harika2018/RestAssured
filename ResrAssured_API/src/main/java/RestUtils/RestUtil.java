package RestUtils;

import java.util.LinkedHashMap;

import org.apache.commons.lang3.RandomStringUtils;

import net.minidev.json.JSONObject;

public class RestUtil {
	
	String randomString = RandomStringUtils.randomAlphabetic(6);
	public String name ;
	public String Job ;
	public static LinkedHashMap<String,String> postMap = new LinkedHashMap<String,String>();
	//public JSONObject jsonData ;
	public static JSONObject jsonData ;
	public String Name()
	{ 
		return randomString; 
	}
	
	public String Job()
	{ 
		return "Leader"+org.apache.commons.lang3.RandomUtils.nextInt(1, 99);
	}
	
	public RestUtil()
	{
		this.name = randomString;
		this.Job = "Leader"+org.apache.commons.lang3.RandomUtils.nextInt(1, 99);
	}
	//int randomNumber = org.apache.commons.lang3.RandomUtils.nextInt(1, 999);
	
	/*
	 * public int ID() { return randomNumber; } public String EMail() { return
	 * "Ha"+randomString+"@reqres.in"; }
	 * 
	 * public String FirstName() { return "Ha"+randomString; }
	 * 
	 * public String LastName() { return "Rap"+randomString; }
	 */
}
