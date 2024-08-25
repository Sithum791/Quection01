package command;
public class Test {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        KitchenRoomLight kitchenLight = new KitchenRoomLight();
        LivingRoomLight livingRoomLight = new LivingRoomLight();

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightDimCommand kitchenLightDim = new LightDimCommand(kitchenLight, 50);

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightDimCommand livingRoomLightDim = new LightDimCommand(livingRoomLight, 30);

        // Set commands for Kitchen Light
        remoteControl.setCommand(0, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);

        // Test Kitchen Light
        System.out.println("--- Testing Kitchen Light ---");
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();
        remoteControl.onButtonWasPressed(0);
        kitchenLightDim.execute();
        kitchenLightDim.undo();

        // Test Living Room Light
        System.out.println("--- Testing Living Room Light ---");
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.undoButtonWasPressed();
        remoteControl.onButtonWasPressed(1);
        livingRoomLightDim.execute();
        livingRoomLightDim.undo();
    }
}