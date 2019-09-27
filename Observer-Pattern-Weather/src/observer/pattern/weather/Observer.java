package observer.pattern.weather;

public interface Observer {
	public void update(int temperature, int windSpeed, int pressure);
}
