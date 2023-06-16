package homework007.adapter;

public class ST5000Info implements SensorTemperature{
    private int id;

    public ST5000Info(int id) {
        this.id = id;
    }

    @Override
    public int identifier() {
        return id;
    }

    @Override
    public double temperature() {
        return -15;
    }
}
