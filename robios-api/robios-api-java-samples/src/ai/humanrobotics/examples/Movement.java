package ai.humanrobotics.examples;

import ai.humanrobotics.examples.utils.Constants;
import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;
import io.humanrobotics.api.RobiosConfig;

public class Movement {	
	public static void main(String[] args) throws Exception {
		RobiosConfig config = new RobiosConfig();
		config.setRobotAddress(Constants.ROBOT_ADDRESS);
		config.setRobotId(Constants.ROBOT_ID);

		Robios robios = RobiosApi.get(Constants.API_KEY, config);
		
		// Rotate the robot for five seconds
		robios.move(0, 2);
		robios.delay(5000);
		robios.stop();
		robios.delay(5000);
		
		// Move the robot head up and down and, finally, centers the head.
		robios.moveHead(20, 0);
		robios.delay(2000);
		robios.moveHead(-40, 0);
		robios.delay(2000);
		robios.centerHead();
		
		robios.close();
	}
}
