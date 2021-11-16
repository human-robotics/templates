package ai.humanrobotics.examples.events;

import ai.humanrobotics.examples.utils.Constants;
import io.humanrobotics.api.Robios;
import io.humanrobotics.api.RobiosApi;
import io.humanrobotics.api.RobiosConfig;
import io.humanrobotics.api.listeners.ScriptListener;

public class ScriptCallbacks {	
	public static void main(String[] args) throws Exception {
		RobiosConfig config = new RobiosConfig();
		config.setRobotAddress(Constants.ROBOT_ADDRESS);
		config.setRobotId(Constants.ROBOT_ID);

		Robios robios = RobiosApi.get(Constants.API_KEY, config);

		robios.addScriptCallback(new ScriptListener() {
			@Override
			public void onExecuteCommand(String command, String script) {
				System.out.println("Script command just ran: " + command);				
			}

			@Override
			public void onScriptEnd(String script) {
				System.out.println("Script '" + script + "' just finished.");
			}

			@Override
			public void onScriptPause(String script, int commandsLeft) {
				System.out.println("Script '" + script + "' has been paused.");
			}

			@Override
			public void onScriptResume(String script) {
				System.out.println("Script '" + script + "' has been resumed!");
			}

			@Override
			public void onScriptStart(String script) {
				System.out.println("Script '" + script + "' just started!");
			}			
		});

		// Close after some time
		robios.delay(30000).close();
	}
}
