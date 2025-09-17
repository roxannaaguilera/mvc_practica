package modelo;

public class Alimento {
	
	private String nombre;
	private int calorias;
	private int cantidad;
	private double precio;
	private String descripcion;
	
	public Alimento() {
		super();
	}

	public Alimento(String nombre, int calorias, int cantidad, double precio, String descripcion) {
		super();
		this.nombre = nombre;
		this.calorias = calorias;
		this.cantidad = cantidad;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Alimento [nombre=" + nombre + ", calorias=" + calorias + ", cantidad=" + cantidad + ", precio=" + precio
				+ ", descripcion=" + descripcion + "]";
	}

}
