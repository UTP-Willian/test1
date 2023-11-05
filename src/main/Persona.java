package main;

public class Persona
{
	private String dni;
	private String nombre;
	private String apellido;
	public Persona(String dni, String nombre, String apellido)
	{
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
	}
	public String getDni()
	{
		return dni;
	}
	public String getNombre()
	{
		return nombre;
	}
	public String apellido()
	{
		return apellido;
	}
}
