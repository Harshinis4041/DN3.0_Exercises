package Command_Pattern_Example;

public class Test {
    public static void main(String[] args) {
        
        Light livingRoomLight = new Light();

       
        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOff = new LightOffCommand(livingRoomLight);

       
        RemoteControl remote = new RemoteControl();

     
        remote.setCommand(lightOn);
        remote.pressButton();  

        remote.setCommand(lightOff);
        remote.pressButton();  
    }
}
