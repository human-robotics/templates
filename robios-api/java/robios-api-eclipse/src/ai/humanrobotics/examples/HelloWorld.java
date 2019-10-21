package ai.humanrobotics.examples;

import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;

public class HelloWorld {
	private static final String API_KEY = "9106b136-1424-4b2a-be0a-6e313dc2a80d";
	private static final String ROBOT_ADDRESS = "192.168.15.27";
	
	public static void main(String[] args) throws Exception {
		Robios robios = RobiosApi.get(API_KEY, ROBOT_ADDRESS);
		
		robios.say("Olá Mundo!");
		
		robios.close();
	}
}
