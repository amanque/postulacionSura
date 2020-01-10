package cl.sura.postulacion.model;

import java.util.List;

public class Hourly {
	private int time;
	private int tempC;
	private int tempF;
	private int windspeedMiles;
	private int windspeedKmph;
	private int winddirDegree;
	private String winddir16Point;
	private int weatherCode;
	private List<WeatherIconUrl> weatherIconUrl;
	private List<WeatherDesc> weatherDesc;
	private String precipMM;
	private String precipInches;
	private int humidity;
	private int visibility;
	private int visibilityMiles;
	private int pressure;
	private int pressureInches;
	private int cloudcover;
	private int HeatIndexC;
	private int HeatIndexF;
	private int DewPointC;
	private int DewPointF;
	private int WindChillC;
	private int WindChillF;
	private int WindGustMiles;
	private int WindGustKmph;
	private int FeelsLikeC;
	private int FeelsLikeF;
	private int chanceofrain;
	private int chanceofremdry;
	private int chanceofwindy;
	private int chanceofovercast;
	private int chanceofsunshine;
	private int chanceoffrost;
	private int chanceofhightemp;
	private int chanceoffog;
	private int chanceofsnow;
	private int chanceofthunder;
	private int uvIndex;

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getTempC() {
		return tempC;
	}

	public void setTempC(int tempC) {
		this.tempC = tempC;
	}

	public int getTempF() {
		return tempF;
	}

	public void setTempF(int tempF) {
		this.tempF = tempF;
	}

	public int getWindspeedMiles() {
		return windspeedMiles;
	}

	public void setWindspeedMiles(int windspeedMiles) {
		this.windspeedMiles = windspeedMiles;
	}

	public int getWindspeedKmph() {
		return windspeedKmph;
	}

	public void setWindspeedKmph(int windspeedKmph) {
		this.windspeedKmph = windspeedKmph;
	}

	public int getWinddirDegree() {
		return winddirDegree;
	}

	public void setWinddirDegree(int winddirDegree) {
		this.winddirDegree = winddirDegree;
	}

	public String getWinddir16Point() {
		return winddir16Point;
	}

	public void setWinddir16Point(String winddir16Point) {
		this.winddir16Point = winddir16Point;
	}

	public int getWeatherCode() {
		return weatherCode;
	}

	public void setWeatherCode(int weatherCode) {
		this.weatherCode = weatherCode;
	}

	public List<WeatherIconUrl> getWeatherIconUrl() {
		return weatherIconUrl;
	}

	public void setWeatherIconUrl(List<WeatherIconUrl> weatherIconUrl) {
		this.weatherIconUrl = weatherIconUrl;
	}

	public List<WeatherDesc> getWeatherDesc() {
		return weatherDesc;
	}

	public void setWeatherDesc(List<WeatherDesc> weatherDesc) {
		this.weatherDesc = weatherDesc;
	}

	public String getPrecipMM() {
		return precipMM;
	}

	public void setPrecipMM(String precipMM) {
		this.precipMM = precipMM;
	}

	public String getPrecipInches() {
		return precipInches;
	}

	public void setPrecipInches(String precipInches) {
		this.precipInches = precipInches;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getVisibility() {
		return visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	public int getVisibilityMiles() {
		return visibilityMiles;
	}

	public void setVisibilityMiles(int visibilityMiles) {
		this.visibilityMiles = visibilityMiles;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public int getPressureInches() {
		return pressureInches;
	}

	public void setPressureInches(int pressureInches) {
		this.pressureInches = pressureInches;
	}

	public int getCloudcover() {
		return cloudcover;
	}

	public void setCloudcover(int cloudcover) {
		this.cloudcover = cloudcover;
	}

	public int getHeatIndexC() {
		return HeatIndexC;
	}

	public void setHeatIndexC(int heatIndexC) {
		HeatIndexC = heatIndexC;
	}

	public int getHeatIndexF() {
		return HeatIndexF;
	}

	public void setHeatIndexF(int heatIndexF) {
		HeatIndexF = heatIndexF;
	}

	public int getDewPointC() {
		return DewPointC;
	}

	public void setDewPointC(int dewPointC) {
		DewPointC = dewPointC;
	}

	public int getDewPointF() {
		return DewPointF;
	}

	public void setDewPointF(int dewPointF) {
		DewPointF = dewPointF;
	}

	public int getWindChillC() {
		return WindChillC;
	}

	public void setWindChillC(int windChillC) {
		WindChillC = windChillC;
	}

	public int getWindChillF() {
		return WindChillF;
	}

	public void setWindChillF(int windChillF) {
		WindChillF = windChillF;
	}

	public int getWindGustMiles() {
		return WindGustMiles;
	}

	public void setWindGustMiles(int windGustMiles) {
		WindGustMiles = windGustMiles;
	}

	public int getWindGustKmph() {
		return WindGustKmph;
	}

	public void setWindGustKmph(int windGustKmph) {
		WindGustKmph = windGustKmph;
	}

	public int getFeelsLikeC() {
		return FeelsLikeC;
	}

	public void setFeelsLikeC(int feelsLikeC) {
		FeelsLikeC = feelsLikeC;
	}

	public int getFeelsLikeF() {
		return FeelsLikeF;
	}

	public void setFeelsLikeF(int feelsLikeF) {
		FeelsLikeF = feelsLikeF;
	}

	public int getChanceofrain() {
		return chanceofrain;
	}

	public void setChanceofrain(int chanceofrain) {
		this.chanceofrain = chanceofrain;
	}

	public int getChanceofremdry() {
		return chanceofremdry;
	}

	public void setChanceofremdry(int chanceofremdry) {
		this.chanceofremdry = chanceofremdry;
	}

	public int getChanceofwindy() {
		return chanceofwindy;
	}

	public void setChanceofwindy(int chanceofwindy) {
		this.chanceofwindy = chanceofwindy;
	}

	public int getChanceofovercast() {
		return chanceofovercast;
	}

	public void setChanceofovercast(int chanceofovercast) {
		this.chanceofovercast = chanceofovercast;
	}

	public int getChanceofsunshine() {
		return chanceofsunshine;
	}

	public void setChanceofsunshine(int chanceofsunshine) {
		this.chanceofsunshine = chanceofsunshine;
	}

	public int getChanceoffrost() {
		return chanceoffrost;
	}

	public void setChanceoffrost(int chanceoffrost) {
		this.chanceoffrost = chanceoffrost;
	}

	public int getChanceofhightemp() {
		return chanceofhightemp;
	}

	public void setChanceofhightemp(int chanceofhightemp) {
		this.chanceofhightemp = chanceofhightemp;
	}

	public int getChanceoffog() {
		return chanceoffog;
	}

	public void setChanceoffog(int chanceoffog) {
		this.chanceoffog = chanceoffog;
	}

	public int getChanceofsnow() {
		return chanceofsnow;
	}

	public void setChanceofsnow(int chanceofsnow) {
		this.chanceofsnow = chanceofsnow;
	}

	public int getChanceofthunder() {
		return chanceofthunder;
	}

	public void setChanceofthunder(int chanceofthunder) {
		this.chanceofthunder = chanceofthunder;
	}

	public int getUvIndex() {
		return uvIndex;
	}

	public void setUvIndex(int uvIndex) {
		this.uvIndex = uvIndex;
	}

}
