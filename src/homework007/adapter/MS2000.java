package homework007.adapter;

public class MS2000 implements MeteoSensor{

    private int id;

    public MS2000(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getTemperature() {
        return 20;
    }

    @Override
    public double getHumidity() {
        return 11;
    }

    @Override
    public double getPressure() {
        return 1;
    }
}
