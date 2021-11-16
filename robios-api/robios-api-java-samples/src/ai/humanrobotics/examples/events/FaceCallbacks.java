package ai.humanrobotics.examples.events;

import ai.humanrobotics.examples.utils.Constants;
import ai.humanrobotics.messaging.types.DetectedObject;
import ai.humanrobotics.messaging.types.DetectedObjectArray;
import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;
import io.humanrobotics.api.RobiosConfig;
import io.humanrobotics.api.listeners.FaceDetectectionListener;

public class FaceCallbacks {	
	public static void main(String[] args) throws Exception {
		RobiosConfig config = new RobiosConfig();
		config.setRobotAddress(Constants.ROBOT_ADDRESS);
		config.setRobotId(Constants.ROBOT_ID);

		Robios robios = RobiosApi.get(Constants.API_KEY, config);

		robios.addFaceDetectionCallback(new FaceDetectectionListener() {
			@Override
			public void onFaceDetected(DetectedObjectArray faces) {
				DetectedObject face = faces.getObjects()[0];
				System.out.println("Detected: (" + face.getGeometry().getPosition().getX() + ", " + face.getGeometry().getPosition().getY() + ")");
			}
		});
	}
}
