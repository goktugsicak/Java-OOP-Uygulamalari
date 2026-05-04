package aracSatis;

public class Insan 
{

	private String isim;
	private String soyisim;
	private int yas;
	
	public Insan(String isim, String soyisim, int yas)
	{
		this.isim = isim;
		this.soyisim = soyisim;
		this.yas = yas;
	}
	
	public String getIsim()
	{
		return isim;
	}
	
	public String getSoyisim()
	{
		return soyisim;
	}
	
	public int getYas()
	{
		return yas;
	}
	
}
