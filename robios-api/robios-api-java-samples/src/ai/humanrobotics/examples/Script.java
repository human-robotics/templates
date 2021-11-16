package ai.humanrobotics.examples;

import ai.humanrobotics.examples.utils.Constants;
import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;
import io.humanrobotics.api.RobiosConfig;

public class Script {
    public static void main(String[] args) throws Exception {
		RobiosConfig config = new RobiosConfig();
		config.setRobotAddress(Constants.ROBOT_ADDRESS);
		config.setRobotId(Constants.ROBOT_ID);

		Robios robios = RobiosApi.get(Constants.API_KEY, config);
		
		robios.executeScript("script name");

        // Other scripts operations
        // robios.pauseScript();
        // robios.resumeScript();
        // robios.stopScript();
        // robios.clearScripts(true);        
		
		robios.close();
	}
}
