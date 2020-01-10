# Ejecución microservicio  

Abrir el proyecto con ide de desarrollo (spring boot) para poder levantar y ejecutar el web application que tiene spring boot.

Al estar disponible el proyecto, iniciar el servidor Abrir navegador web y ejecutar la siguiente ruta: http://<host:port>/postulacionSura/weather/

Agregar el nombre de la ciudad de Chile: http://<host:port>/postulacionSura/weather/<nombre de ciudad>Ejecutar la consulta y retornará la información.

Ejemplo: http://localhost:8080/postulacionSura/weather/punta arenas

# Funcionamiento microservicio

En el microservicio se define en la clase principal (main) un Bean "RestTemplate" para que se pueda emplear automáticamente, para utilizar los métodos HTTP disponibles, en este caso en particular obtener datos desde una url respuesta restful.

El microservicio tiene como entrada un Controller con un mapping tipo GET, el path es weather/  con un parámetro String de entrada llamado "ciudad" que corresponde al nombre de la ciudad del cual se desea saber la temperatura por 7 días.

Se definen POJOs con sus respectivos getter y setter en carpeta model con la estructura de datos de la respuesta.

Se define una interfaz WeatherService con la declaración del método que obtiene la temperatura por 7 días de la ciudad que viene como parámetro y retorno un objeto ResponseData

En el el servicio de implementación WeatherServiceImpl se define:
  La lógica que utiliza el bean RestTamplate instanciado con un Autowired.
  Se obtiene desde archivo de configuración archivo application.yml algunas valores necesarios para obtener los datos, la url, key (token asociado a la cuenta creada en sitio de donde se obtiene los datos) y la cantidad de días, para este caso 7 (también se pudo implementar que la cantidad de días haya sido un parámetro de entrada cuando se invoca el servicio creado, así como el String ciudad o en una clase donde se define como una constante con la cantidad de dias).
  Se ejecuta método que normalizarText se envía  String ciudad y se quita ñ y tildes.
  Se utiliza método getForObject de objeto restTemplate para obtener las temperaturas por 7 días de la ciudad ingresada, y devuelve la información en el objeto ResponseData.
  Al tener una respuesta exitosa, se válida que: exista la ciudad, sean solo las ciudades de Chile y sean tipo ciudad, si se cumple las condiciones se retorna el objeto ResponseData con la información de las temperatura de la ciudad ingresada por 7 días.
  En caso contrario que las condiciones no cumplan se genera un error indicando cual es el problema.

Al ser respuesta correcta retorna un objeto JSON y el elemento weather contiene un array con 7 posiciones, y en cada posición del array contiene los campos:
	"mintempC":14, // temperatura mínima Celcius
	"maxtempC":29, // temperatura máxima Celcius
	"mintempF":58, // temperatura mínima Fahrenheit
	"maxtempF":85  // temperatura máxima Fahrenheit

Además de otros datos importantes. 

Url de la api utilizada: https://www.worldweatheronline.com/
