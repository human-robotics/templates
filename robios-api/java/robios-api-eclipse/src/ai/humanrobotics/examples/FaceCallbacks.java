package ai.humanrobotics.examples;

import ai.humanrobotics.messaging.types.DetectedObject;
import ai.humanrobotics.messaging.types.DetectedObjectArray;
import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;
import io.humanrobotics.api.listeners.FaceDetectectionListener;

public class FaceCallbacks {
	private static final String API_KEY = "9106b136-1424-4b2a-be0a-6e313dc2a80d";
	private static final String ROBOT_ADDRESS = "192.168.100.38";

	public static void main(String[] args) throws Exception {
		Robios robios = RobiosApi.get(API_KEY, ROBOT_ADDRESS);

		robios.addFaceDetectionCallback(new FaceDetectectionListener() {

			@Override
			public void onFaceDetected(DetectedObjectArray faces) {
				DetectedObject face = faces.getObjects()[0];
				System.out.println("Detected: " + face.getName());
			}
		});
	}
}
