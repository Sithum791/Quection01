package command;

public class KitchenRoomLight implements Light {
    private int brightness;

    public KitchenRoomLight() {
        this.brightness = 0;
    }

    @Override
    public void on() {
        brightness = 100;
        System.out.println("Kitchen Room Light is ON at full brightness: " + brightness);
    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println("Kitchen Room Light is OFF");
    }

    @Override
    public void dim(int level) {
        brightness = level;
        System.out.println("Kitchen Room Light is dimmed to brightness: " + brightness);
    }

    @Override
    public int getBrightness() {
        return brightness;
    }
}