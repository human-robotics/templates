package ai.humanrobotics.examples;

import ai.humanrobotics.messaging.types.Telemetry;
import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;
import io.humanrobotics.api.listeners.TelemetryListener;
import io.humanrobotics.api.listeners.VoiceRecognitionListener;

public class VoiceCallback {
	private static final String API_KEY = "9106b136-1424-4b2a-be0a-6e313dc2a80d";
	private static final String ROBOT_ADDRESS = "192.168.100.38";
	
	public static void main(String[] args) throws Exception {
		Robios robios = RobiosApi.get(API_KEY, ROBOT_ADDRESS);
		
		robios.addVoiceRecognitionCallback(new VoiceRecognitionListener() {
			@Override
			public void onUserTextReceived(String userText) {
				System.out.println(userText);
			}
		});
		
		robios.addTelemetryCallback(new TelemetryListener() {
			@Override
			public void onTelemetryReceived(Telemetry telemetry) {
				System.out.println("" + telemetry.getOdometryPosition().getX());
			}
		});
	}
}