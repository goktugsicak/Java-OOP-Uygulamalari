package Kalitim;


public class Main 
{

	public static void main(String[] args) 
	{

		Calisan c = new Calisan(null, null, null, null);
		
		c.giris();
		
		if(c.meslek.equalsIgnoreCase("Akademisyen"))
		{
			Akademisyen a = new Akademisyen(c.adSoyad, c.eposta, c.telefon, c.meslek, null);
			a.giris();
		}
		
		else if(c.meslek.equalsIgnoreCase("Memur"))
		{
			Memur m = new Memur(c.adSoyad, c.eposta, c.telefon, c.meslek, null, null);
			m.giris();
		}
	
		System.out.println();
		
		Asistan a1 = new Asistan("Mehmet", "gmail1", "532", "Asistan", "Fotokopi");
		Asistan a2 = new Asistan("Ahmet", "gmail2", "532", "Asistan", "Lab Görevlisi");
		Asistan a3 = new Asistan("Veli", "gmail3", "532", "Asistan", "Danışma");
	
		Profesor p1 = new Profesor("Ahmet", "gmail4", "532", "Profesör", "Öğretmen");

		Asistan asistan[] = new Asistan[3];
		
		asistan[0] = a1;
		asistan[1] = a2;
		asistan[2] = a3;
		
		p1.setMakale("El Kitabı");
		p1.setAsistan(asistan);
		
		a1.setProfesor(p1);
		a2.setProfesor(p1);
		a3.setProfesor(p1);
		
		System.out.println("Makaleniz: "+ p1.getMakale());
		System.out.println();
		System.out.println("Asistanlarınız");
		System.out.println();
		
		for(int i=0; i<asistan.length; i++)
		{
		
		System.out.println
		(p1.getAsistan()[i].adSoyad);
		System.out.println("Görevi: "+ p1.getAsistan()[i].bolum);
		
		System.out.println();
		}
	}

}