package ai.humanrobotics.examples.events;

import ai.humanrobotics.examples.utils.Constants;
import ai.humanrobotics.messaging.types.AlertDialogResult;
import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;
import io.humanrobotics.api.RobiosConfig;
import io.humanrobotics.api.listeners.AlertDialogListener;

public class AlertDialogCallbacks {
    public static void main(String[] args) throws Exception {
		RobiosConfig config = new RobiosConfig();
		config.setRobotAddress(Constants.ROBOT_ADDRESS);
		config.setRobotId(Constants.ROBOT_ID);

		Robios robios = RobiosApi.get(Constants.API_KEY, config);

		robios.addAlertDialogCallback(new AlertDialogListener() {
            @Override
            public void onResultReceived(AlertDialogResult result) {
                System.out.println(
                    "Result: \n" +
                    "\t ID: " + result.getId() +
                    "\t Result: " + result.getResult()
                );
            }
        });

		// Close after some time
		robios.delay(30000).close();
	}
}
