package Kalitim;

import java.util.Scanner;

public class Memur extends Calisan 
{

	String departman;
	String mesai;
	
	Scanner input = new Scanner(System.in);
	
	public Memur(String adSoyad, String eposta, String telefon, String meslek, String mesai, String departman)
	{
		super(adSoyad, eposta, telefon, meslek);
		this.departman = departman;
		this.mesai = mesai;
	}
	
	public void giris()
	{
		System.out.println("Çalıştığınız departmanı girin. (Bilgi İşlem - Güvenlik)");
		departman = input.nextLine();
		
		while(!departman.equalsIgnoreCase("Bilgi İşlem") && !departman.equalsIgnoreCase("Güvenlik"))
		{
			System.out.println("Tekrar deneyiniz.");
			departman = input.nextLine();
		}
		
		if(departman.equalsIgnoreCase("Bilgi İşlem"))
		{
			mesai = "Yarı zamanlı";
		}
		
		else if(departman.equalsIgnoreCase("Güvenlik"))
		{
			mesai = "Tam zamanlı";
		}
		
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println("Başarıyla giriş yapıldı!");
		System.out.println();
		System.out.println("İsminiz ve soyisminiz: "+ adSoyad.toUpperCase());
		System.out.println("E-posta: "+ eposta.toLowerCase());
		System.out.println("Telefon numaranız: "+ telefon);
		System.out.println("Mesleğiniz: "+ meslek.toUpperCase());
		System.out.println("Departmanınız: "+ departman.toUpperCase());
		System.out.println("Mesai durumu: "+ mesai.toUpperCase());
	}
	
	
	
}
