package apiCongfigs;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfigs {

	public Map<String, String> defaultHeader() {

		Map<String, String> defaultHeaders = new HashMap<String, String>();
		defaultHeaders.put("Content-Type", "application/json");

		return defaultHeaders;
	}

	public Map<String, String> headerWithToken() {

		Map<String, String> defaultHeaders = new HashMap<String, String>();
		defaultHeaders.put("Content-Type", "application/json");
		defaultHeaders.put("Access_Token", "sjdkujwe747747");
		defaultHeaders.put("jwtToken", "sjdkusd349734jwe747747");
		
		return defaultHeaders;
	}
	
	public static void main(String[] args) {
		HeaderConfigs head =new HeaderConfigs();
		System.out.println(head.defaultHeader());
		System.out.println(head.headerWithToken());
	}
	
}
