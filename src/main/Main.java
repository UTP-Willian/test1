package main;

import java.lang.reflect.Field;

public class Main
{
	public static String forceAccessSecretKey(Persona persona) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		Field secretKeyField=Persona.class.getDeclaredField("dni");
		secretKeyField.setAccessible(true);
		return (String)secretKeyField.get(persona);
	}
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		Persona obj=new Persona("75617504", "Willian", "Condor");
		System.out.println("DNI: "+obj.getDni());
		System.out.println("DNI2:"+forceAccessSecretKey(obj));
	}
}
