package cl.sura.postulacion.service.impl;

import java.text.Normalizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.sura.postulacion.config.Constants;
import cl.sura.postulacion.error.ServiceException;
import cl.sura.postulacion.model.ResponseData;
import cl.sura.postulacion.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Value("${api.key}")
	private String key;

	@Value("${api.url}")
	private String url;

	@Value("${api.days}")
	private int days;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public ResponseData getWeatherCiudadChile(String ciudad) throws Exception{
		ciudad = normalizarText(ciudad);
		ResponseData json = restTemplate.getForObject(
				this.url + this.key + "&q=" + ciudad + ", " + Constants.PAIS + "&format=json&num_of_days=" + this.days, ResponseData.class);
		try {
			if(!json.getData().getRequest().get(0).getQuery().contains(Constants.PAIS) && json.getData().getRequest().get(0).getType().equals("City"))
				throw new ServiceException(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE.value(), Constants.MSG_ERROR_2 + json.getData().getRequest().get(0).getQuery(), 2);
			else if(json.getData().getRequest() == null || !json.getData().getRequest().get(0).getQuery().toUpperCase().contains(ciudad.toUpperCase()))
				throw new ServiceException(HttpStatus.BAD_REQUEST.value(), Constants.MSG_ERROR_1, 1);
			else if(!json.getData().getRequest().get(0).getType().equals(Constants.CITY))
				throw new ServiceException(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE.value(), Constants.MSG_ERROR_3, 3);
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
		return json;
	}

	private String normalizarText(String ciudad) {
		String cadenaNormalize = Normalizer.normalize(ciudad, Normalizer.Form.NFD);   
		return  cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
	}
}

