package ai.humanrobotics.examples;

import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;

public class Expressions {
	private static final String API_KEY = "9106b136-1424-4b2a-be0a-6e313dc2a80d";
	private static final String ROBOT_ADDRESS = "192.168.100.38";
	
	public static void main(String[] args) throws Exception {
		Robios robios = RobiosApi.get(API_KEY, ROBOT_ADDRESS);
		
		robios.setExpression("happy").say("Eu posso ficar feliz!");
		robios.delay(5000);
		robios.setExpression("scared").say("Também posso ficar assustado!");
		robios.delay(5000);
		
		robios.say("E também essas outras expressões");
		for (String expression : robios.getAllFaceExpressions()) {
			robios.setExpression(expression);
			robios.delay(2000);
		}
		
		robios.close();
	}
}
