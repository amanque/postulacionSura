package cl.sura.postulacion.model;

import java.util.List;

public class Weather {
	private String date;
	List<Astronomy> astronomy;
	private int mintempC;
	private int maxtempC;
	private int mintempF;
	private int maxtempF;
	private int avgtempC;
	private int avgtempF;
	private String totalSnow_cm;
	private String sunHour;
	private int uvIndex;
	private List<Hourly> hourly;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<Astronomy> getAstronomy() {
		return astronomy;
	}

	public void setAstronomy(List<Astronomy> astronomy) {
		this.astronomy = astronomy;
	}

	public int getMintempC() {
		return mintempC;
	}

	public void setMintempC(int mintempC) {
		this.mintempC = mintempC;
	}

	public int getMaxtempC() {
		return maxtempC;
	}

	public void setMaxtempC(int maxtempC) {
		this.maxtempC = maxtempC;
	}

	public int getMintempF() {
		return mintempF;
	}

	public void setMintempF(int mintempF) {
		this.mintempF = mintempF;
	}

	public int getMaxtempF() {
		return maxtempF;
	}

	public void setMaxtempF(int maxtempF) {
		this.maxtempF = maxtempF;
	}

	public int getAvgtempC() {
		return avgtempC;
	}

	public void setAvgtempC(int avgtempC) {
		this.avgtempC = avgtempC;
	}

	public int getAvgtempF() {
		return avgtempF;
	}

	public void setAvgtempF(int avgtempF) {
		this.avgtempF = avgtempF;
	}

	public String getTotalSnow_cm() {
		return totalSnow_cm;
	}

	public void setTotalSnow_cm(String totalSnow_cm) {
		this.totalSnow_cm = totalSnow_cm;
	}

	public String getSunHour() {
		return sunHour;
	}

	public void setSunHour(String sunHour) {
		this.sunHour = sunHour;
	}

	public int getUvIndex() {
		return uvIndex;
	}

	public void setUvIndex(int uvIndex) {
		this.uvIndex = uvIndex;
	}

	public List<Hourly> getHourly() {
		return hourly;
	}

	public void setHourly(List<Hourly> hourly) {
		this.hourly = hourly;
	}

}
