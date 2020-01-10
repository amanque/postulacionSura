package cl.sura.postulacion.model;

public class WeatherDesc {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "WeatherIconUrl [value=" + value + "]";
	}

}
