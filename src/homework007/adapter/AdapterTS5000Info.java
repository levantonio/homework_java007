package homework007.adapter;

public class AdapterTS5000Info implements MeteoSensorSimple{
    private final SensorTemperature sensorTemperature;

    public AdapterTS5000Info(SensorTemperature sensorTemperature) {
        this.sensorTemperature = sensorTemperature;
    }

    @Override
    public int getId() {
        return sensorTemperature.identifier();
    }

    @Override
    public double getTemperature() {
        return sensorTemperature.temperature();
    }

}
