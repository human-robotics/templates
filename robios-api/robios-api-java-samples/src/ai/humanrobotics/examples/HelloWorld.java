package ai.humanrobotics.examples;

import ai.humanrobotics.examples.utils.Constants;
import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;
import io.humanrobotics.api.RobiosConfig;

public class HelloWorld {
	public static void main(String[] args) throws Exception {
		
		RobiosConfig config = new RobiosConfig();
		config.setRobotAddress(Constants.ROBOT_ADDRESS);
		config.setRobotId(Constants.ROBOT_ID);

		Robios robios = RobiosApi.get(Constants.API_KEY, config);
		
		robios.say("Olá Mundo!");
		
		robios.close();
	}
}
