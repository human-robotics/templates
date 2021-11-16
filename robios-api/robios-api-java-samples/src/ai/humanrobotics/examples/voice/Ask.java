package ai.humanrobotics.examples.voice;

import ai.humanrobotics.examples.utils.Constants;
import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;
import io.humanrobotics.api.RobiosConfig;

public class Ask {
	public static void main(String[] args) throws Exception {
		RobiosConfig config = new RobiosConfig();
		config.setRobotAddress(Constants.ROBOT_ADDRESS);
		config.setRobotId(Constants.ROBOT_ID);

		Robios robios = RobiosApi.get(Constants.API_KEY, config);

		// Add the callback received the result of the recognition
		robios.addVoiceRecognitionCallback(Ask::onUserTextReceived);
		
		// Ask and listen the user
		robios.ask("Qual é o seu nome?");		

		// Close after some time
        robios.delay(10000).close();
	}

	public static void onUserTextReceived(String userText) {
        System.out.println(userText);
    }
}
