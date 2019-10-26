package ai.humanrobotics.examples;

import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;

public class Multimedia {
	private static final String API_KEY = "9106b136-1424-4b2a-be0a-6e313dc2a80d";
	private static final String ROBOT_ADDRESS = "192.168.100.38";
	
	public static void main(String[] args) throws Exception {
		Robios robios = RobiosApi.get(API_KEY, ROBOT_ADDRESS);
		
//		robios.displayImage("http://www.humanrobotics.ai/data/humanrobotics/all-robots-with-colors.png", 10);
		
//		robios.displayVideo("http://www.humanrobotics.ai/data/humanrobotics/marketing/macaco-sexta-feira2.mp4", 20, true, false);
		
		robios.close();
	}
}
