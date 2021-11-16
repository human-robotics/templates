package ai.humanrobotics.examples;

import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;
import io.humanrobotics.api.RobiosConfig;

public class More {
	private static final String API_KEY = "a7ec43fe-0922-46ad-bb10-91599e6a131f";
	private static final String ROBOT_ADDRESS = "robots.humanrobotics.ai";
	private static final String ROBOT_ID = "3941da72-bb0c-49a3-9c11-00fc7a8a210b";
	
	public static void main(String[] args) throws Exception {
		RobiosConfig config = new RobiosConfig();
		config.setRobotAddress(ROBOT_ADDRESS);
		config.setRobotId(ROBOT_ID);

		Robios robios = RobiosApi.get(API_KEY, config);
		
//		robios.executeScript("zm_ny_espacos");
		
//		robios.navigation().goTo("cozinha");
//		robios.navigation().goTo(1, 2, 0, 90);
	
//		robios.ask("Qual � o seu nome?");
		
//		robios.simulateUserSpeaking("ultimas not�cias");
		
		robios.close();
	}
}
