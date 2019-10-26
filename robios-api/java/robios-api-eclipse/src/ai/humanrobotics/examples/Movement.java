package ai.humanrobotics.examples;

import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;

public class Movement {
	private static final String API_KEY = "9106b136-1424-4b2a-be0a-6e313dc2a80d";
	private static final String ROBOT_ADDRESS = "192.168.100.38";
	
	public static void main(String[] args) throws Exception {
		Robios robios = RobiosApi.get(API_KEY, ROBOT_ADDRESS);
		
		robios.move(0, 2);
		robios.delay(5000);
		robios.stop();
		robios.delay(5000);
		
		robios.moveHead(20, 0);
		robios.delay(2000);
		robios.moveHead(-40, 0);
		robios.delay(2000);
		robios.centerHead();
		
		robios.close();
	}
}
