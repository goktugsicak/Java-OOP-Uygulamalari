package Kalitim;

import java.util.Scanner;

public class Akademisyen extends Calisan
{

	String bolum;
	String dersler[] = {"Introduction to Software Engineering", "Object Oriented Programming", "Mantıksal Tasarım"};

	Scanner input = new Scanner(System.in);
	
	
	public Akademisyen(String adSoyad, String eposta, String telefon, String meslek, String bolum)
	{
		super(adSoyad, eposta, telefon, meslek);
		this.bolum = bolum;
	}
	
	public void giris()
	{
		System.out.println("Lütfen bölümünüzü girin. (Sayısal - Sözel)");
		bolum = input.nextLine();
		
		while(!bolum.equalsIgnoreCase("Sayısal") && !bolum.equalsIgnoreCase("Sözel"))
		{
			System.out.println("Tekrar deneyiniz.");
			bolum = input.nextLine();
		}
		
		if(bolum.equalsIgnoreCase("Sayısal"))
		{
			System.out.println();
			System.out.println("----------------------------------------------------");
			System.out.println("Başarıyla giriş yapıldı!");
			System.out.println("Hoşgeldiniz Prof. "+ adSoyad.toUpperCase());
			System.out.println();
			System.out.println("İsminiz ve soyisminiz: "+ adSoyad.toUpperCase());
			System.out.println("E-posta: "+ eposta.toLowerCase());
			System.out.println("Telefon numaranız: "+ telefon);
			System.out.println("Mesleğiniz: "+ meslek.toUpperCase());
			System.out.println("Bölümünüz: "+ bolum.toUpperCase());
			System.out.println("Gireceğiniz Dersler:");
			
			for(int i=0; i<2; i++)
			{
			System.out.println((i+1)+ "."+ dersler[i]);
			}
		}
		
		else if(bolum.equalsIgnoreCase("Sözel"))
		{
			System.out.println();
			System.out.println("----------------------------------------------------");
			System.out.println("Başarıyla giriş yapıldı!");
			System.out.println("Hoşgeldiniz Prof. "+ adSoyad.toUpperCase());
			System.out.println();
			System.out.println("İsminiz ve soyisminiz: "+ adSoyad.toUpperCase());
			System.out.println("E-posta: "+ eposta.toLowerCase());
			System.out.println("Telefon numaranız: "+ telefon);
			System.out.println("Mesleğiniz: "+ meslek.toUpperCase());
			System.out.println("Bölümünüz: "+ bolum.toUpperCase());
			System.out.println("Gireceğiniz Ders: "+ dersler[2]);
		}
	}
}
