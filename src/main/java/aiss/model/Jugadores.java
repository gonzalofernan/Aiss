package aiss.model;



public class Jugadores {
	private String nombre;
	private String id;
	private Integer numeroDorsal;
	private String posicion;
	private String nacionalidad;
	private String fechaNacimiento;
	private Videos video;
	
	

	public Jugadores()
	{}

	public Jugadores(String nombre, String id, Integer numeroDorsal, String posicion, String nacionalidad,
			String fechaNacimiento, Videos video) 
	{
		this.nombre = nombre;
		this.id = id;
		this.numeroDorsal = numeroDorsal;
		this.posicion = posicion;
		this.nacionalidad = nacionalidad;
		this.fechaNacimiento = fechaNacimiento;
		this.video=video;
	}

	public Jugadores(String nombre, Integer numeroDorsal, String posicion, String nacionalidad,
			String fechaNacimiento, Videos video)
			{
		
		this.nombre = nombre;
		this.numeroDorsal = numeroDorsal;
		this.posicion = posicion;
		this.nacionalidad = nacionalidad;
		this.fechaNacimiento = fechaNacimiento;
		this.video=video;
	}

	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getNumeroDorsal() {
		return numeroDorsal;
	}

	public void setNumeroDorsal(Integer numeroDorsal) {
		this.numeroDorsal = numeroDorsal;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Videos getVideo() {
		return video;
	}

	public void setVideo(Videos video) {
		this.video = video;
	}

	
		
	
	 

}
