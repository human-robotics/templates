package ai.humanrobotics.examples.multimedia;

import ai.humanrobotics.examples.utils.Constants;
import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;
import io.humanrobotics.api.RobiosConfig;

public class DisplayVideo {	
	public static void main(String[] args) throws Exception {
		RobiosConfig config = new RobiosConfig();
		config.setRobotAddress(Constants.ROBOT_ADDRESS);
		config.setRobotId(Constants.ROBOT_ID);

		Robios robios = RobiosApi.get(Constants.API_KEY, config);
		
		robios.displayVideo("https://robots.humanrobotics.ai/cdn/get?fileName=cdn/0db0572a-1e46-44a1-a459-16a94c67f6c2/ada51405-67b7-46f9-8c78-96d9c75d0d22/f4d8f1fc-f442-4111-8dfb-48d61fa3ea16_Rupert_Holmes_-_Escape_The_Pina_Colada_Song_Guardians_of_the_Galaxy.mp4", 20, true, false);
		
		robios.close();
	}
}
