package aracSatis;

public class Arac 
{
	
	private String marka;
	private String model;
	private int yil;
	private String km;
	private int beygir;
	private int fiyat;
	
	public Arac(String marka, String model, int yil, String km, int beygir, int fiyat)
	{
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.km = km;
		this.beygir = beygir;
		this.fiyat = fiyat;
	}
	
	public String getMarka()
	{
		return marka;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public int getYil()
	{
		return yil;
	}
	
	public String getKm()
	{
		return km;
	}
	
	public int getBeygir()
	{
		return beygir;
	}
	
	public int getFiyat()
	{
		return fiyat;
	}
}
