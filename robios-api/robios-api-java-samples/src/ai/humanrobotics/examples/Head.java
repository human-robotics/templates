package ai.humanrobotics.examples;

import java.util.List;

import ai.humanrobotics.examples.utils.Constants;
import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;
import io.humanrobotics.api.RobiosConfig;

public class Head {
    public static void main(String[] args) throws Exception {
		RobiosConfig config = new RobiosConfig();
		config.setRobotAddress(Constants.ROBOT_ADDRESS);
		config.setRobotId(Constants.ROBOT_ID);

		Robios robios = RobiosApi.get(Constants.API_KEY, config);
		
		// Executes an Interal App (in the Robios Face) called "camera"
        robios.executeInternalAppOnHead("camera");

		// Executes a command (on the Robios Face) to swipe the face right (setting a new )
        robios.executeCommandOnHead("swipe_face_right");

		// Gets a list of available command in the Robios Face app
        List<String> commands = robios.getAllHeadCommands();

		// Gets a list of available internal apps in the Robios Face app
    	List<String> apps = robios.getAllHeadAppIds();

		robios.close();
	}
}
