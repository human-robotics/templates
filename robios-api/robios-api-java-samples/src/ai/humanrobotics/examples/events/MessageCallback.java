package ai.humanrobotics.examples.events;

import ai.humanrobotics.examples.utils.Constants;
import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;
import io.humanrobotics.api.RobiosConfig;
import io.humanrobotics.api.listeners.MessageListener;

public class MessageCallback {
    public static void main(String[] args) throws Exception {
		RobiosConfig config = new RobiosConfig();
		config.setRobotAddress(Constants.ROBOT_ADDRESS);
		config.setRobotId(Constants.ROBOT_ID);

		Robios robios = RobiosApi.get(Constants.API_KEY, config);

		robios.addMessageCallback("robot/module/command", new MessageListener() {
            @Override
            public void onMessageReceived(String context, String data) {
                System.out.println("Received '" + data + "' at context '" + context + "'");
            }
        });

		// Close after some time
		robios.delay(30000).close();
	}
}
