# Java API Samples

This project contains a sample set of the Robios API for Java.

## Setup

- Add the **lib** folder on the classpath on the IDE of your choice.
- Change the constants in the `Constants.java` file, setting:
    - `API_KEY`: The token key to authenticate the API connection.
    - `ROBOT_ADDRESS`: The IP to access the robot. Default values sets the Human Robotics servers as the address.
    - `ROBOT_ID`: The ID of the robot to connect the API to.

## Samples

Each sample in this project starts a new connection to the robot and sends one or more commands exploring the features available for the Robios.

### Hello World

**`ai.humanrobotics.examples.HelloWorld`**

Hello World example. It sends a command to make the robot speaks a text through the Voice Synsthesis system.

### Expressions

**`ai.humanrobotics.examples.Expressions`**

Set expressions to the robot's face. This code sample loops to all robot expressions waiting a delay between each of then.

### Head commands

**`ai.humanrobotics.examples.Head`**

Execute commands in the robot's head. It starts an internal application (applications that run inside the Robios Face app) and commands, like changing the face skin or the background color

### Movements

**`ai.humanrobotics.examples.Movements`**

Move the robot's body and head. This sample move rotates the robot for some time, them move its head vertically.

### Scripts

**`ai.humanrobotics.examples.Scripts`**

Executes a script in the robot.

_The script must be present in the application the robot is currently running._

### Listen the User's voice

**`ai.humanrobotics.examples.voice.Listen`**

Start listening the User's voice trough the Voice Recognition system. It triggers an action in robot playing a beep sound and an animation on the robot's face UI, indicating the robot is listening the user.

The recognized text is them sent as and event that is received in the `VoiceRecognitionListener` implementation, present in the sample code.

### Ask a Question

**`ai.humanrobotics.examples.voice.Ask`**

This sample works just like the [Listen the User's voice](#listen-the-user's-voice), triggering a command to start listening the User's voice, but speak a text before the actual listen command.

It works just like sending a `speak` and `listen` commands respectively.

### Display Image

**`ai.humanrobotics.examples.multimedia.DisplayImage`**

Displays an image in the robot's face.

### Display Video

**`ai.humanrobotics.examples.multimedia.DisplayVideo`**

Displays vídeo in the robot's face.

### Events

#### Detected Faces

**`ai.humanrobotics.examples.events.FaceCallbacks`**

Sample that sets a listener to receive the information from the faces detected by the robot. Each detection the robot does on its vision system, is received in this event.

#### Alert Dialog results

**`ai.humanrobotics.examples.events.AlertDialogCallbacks`**

Sample that sets a listener to receive the results of all Alert Dialogs displayed in the robot's face.

#### Script callbacks

**`ai.humanrobotics.examples.events.ScriptCallbacks`**

Sample that sets a listener to receive events from the robot's Scripting system. It received information like, when an script has started or finished, and each command execution of a currently running script.

#### Messages

**`ai.humanrobotics.examples.events.MessageCallback`**

Sample that sets a listener to receive events of an specific message received in the robot. 