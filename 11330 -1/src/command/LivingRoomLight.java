package command;

public class LivingRoomLight implements Light {
    private int brightness;

    public LivingRoomLight() {
        this.brightness = 0;
    }

    @Override
    public void on() {
        brightness = 100;
        System.out.println("Living Room Light is ON at full brightness: " + brightness);
    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println("Living Room Light is OFF");
    }

    @Override
    public void dim(int level) {
        brightness = level;
        System.out.println("Living Room Light is dimmed to brightness: " + brightness);
    }

    @Override
    public int getBrightness() {
        return brightness;
    }
}