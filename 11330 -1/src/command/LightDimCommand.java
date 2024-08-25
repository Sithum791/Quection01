package command;
public class LightDimCommand implements Command {
    private Light light;
    private int prevBrightness;
    private int level;

    public LightDimCommand(Light light, int level) {
        this.light = light;
        this.level = level;
    }

    @Override
    public void execute() {
        prevBrightness = light.getBrightness();
        light.dim(level);
    }

    @Override
    public void undo() {
        light.dim(prevBrightness);
    }
}