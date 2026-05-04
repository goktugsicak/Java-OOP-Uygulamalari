package Kalitim;

public class Asistan extends Akademisyen
{

	Profesor profesor;
	
	public Asistan(String adSoyad, String eposta, String telefon, String meslek , String bolum)
	{
		super(adSoyad, eposta, telefon, meslek, bolum);
	}
	
	public void setProfesor(Profesor profesor)
	{
		this.profesor = profesor;
	}
}
