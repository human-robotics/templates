package ai.humanrobotics.examples;

import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;

public class More {
	private static final String API_KEY = "9106b136-1424-4b2a-be0a-6e313dc2a80d";
	private static final String ROBOT_ADDRESS = "192.168.100.38";
	
	public static void main(String[] args) throws Exception {
		Robios robios = RobiosApi.get(API_KEY, ROBOT_ADDRESS);
		
//		robios.executeScript("zm_ny_espacos");
		
//		robios.navigation().goTo("cozinha");
//		robios.navigation().goTo(1, 2, 0, 90);
	
//		robios.ask("Qual é o seu nome?");
		
//		robios.simulateUserSpeaking("ultimas notícias");
		
		robios.close();
	}
}
