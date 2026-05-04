package Kalitim;

import java.util.Scanner;

public class Calisan 
{

		String adSoyad, eposta, meslek, telefon;		

		Scanner input = new Scanner(System.in);
		
		public Calisan(String adSoyad, String eposta, String telefon, String meslek)
		{
			this.adSoyad = adSoyad;
			this.eposta = eposta;
			this.telefon = telefon;
			this.meslek = meslek;
		}
		
		public void giris()
		{
			System.out.println("İsminizi ve soyisminizi girin.");
			adSoyad = input.nextLine();
			
			System.out.println("E-posta'nızı girin.");
			eposta = input.nextLine();
			
			System.out.println("Telefon numaranızı girin.");
			telefon = input.nextLine();
			
			System.out.println("Mesleğinizi girin.(Akademisyen - Memur)");
			meslek = input.nextLine();
			
			while(!meslek.equalsIgnoreCase("Akademisyen") && !meslek.equalsIgnoreCase("Memur"))
			{
				System.out.println("Tekrar deneyiniz.");
				meslek = input.nextLine();
			}
			
		}
		
}
