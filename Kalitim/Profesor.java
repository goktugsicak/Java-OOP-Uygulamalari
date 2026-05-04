package Kalitim;

public class Profesor extends Akademisyen 
{
	String makale;
	Asistan asistan[];
	
	public Profesor(String adSoyad, String eposta, String telefon, String meslek, String bolum)
	{
		super(adSoyad, eposta, telefon, meslek, bolum);
	}
	public void setMakale(String makale)
	{
		this.makale = makale;
	}
	public String getMakale()
	{
		return makale;
	}
	
	public void setAsistan(Asistan asistan[])
	{
		this.asistan = asistan;
	}
	
	public Asistan[] getAsistan()
	{
		return asistan;
	}
}
