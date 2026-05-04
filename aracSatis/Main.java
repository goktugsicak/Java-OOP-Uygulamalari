package aracSatis;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		String isim, soyisim;
		String marka[] = new String[10];
		String model[] = new String[10];
		int yas, sayi;
		int yil[] = new int[10];
		String km[] = new String[10];
		int beygir[] = new int[10];
		int fiyat[] = new int[10];
		
		Scanner input = new Scanner(System.in);

		
		System.out.println("Isminizi giriniz: ");
		isim = input.nextLine();
		
		System.out.println("Soyisminizi giriniz: ");
		soyisim = input.nextLine();
		
		System.out.println("Yasinizi giriniz: ");
		yas = input.nextInt();
		
		System.out.println("Satmak istediğiniz araç sayisini girin: ");
		sayi = input.nextInt();
				input.nextLine();
		
		
		Insan insan1 = new Insan(isim, soyisim, yas);
		
		Arac arac1[] = new Arac[sayi];
		
		  for(int i=0; i<sayi; i++)
		  {
			  System.out.println("Aracinizin markasini girin: ");
			  marka[i] = input.nextLine();
			  
			  System.out.println("Aracinizin modelini girin: ");
			  model[i] = input.nextLine();
			  
			  System.out.println("Araciniz kac model: ");
			  yil[i] = input.nextInt();
			  
			  System.out.println("Araciniz kac km:");
			  km[i] = input.next();
			  
			  System.out.println("Aracinizin beygirini girin: ");
			  beygir[i] = input.nextInt();
			  
			  System.out.println("Aracinizi satmak icin belirlediginiz fiyati girin: ");
			  fiyat[i] = input.nextInt();
				 
			  System.out.println();
			  System.out.println("-----------------------------------------------");
			  System.out.println();
			  
			  input.nextLine();
			  
			  arac1[i] = new Arac(marka[i], model[i], yil[i], km[i], beygir[i], fiyat[i]);
			  
		  }
		  
		  System.out.println(insan1.getIsim()+" "+insan1.getSoyisim());
		  
		  System.out.println();
		  
		  System.out.println(insan1.getYas() + " Yaşında");
		  
		  System.out.println();
		  
		  System.out.println("İlandaki Araçları");
		  
		  System.out.println();
		  
		 for(int i=0; i<sayi; i++)
		 {
			 System.out.println((i+1)+". Arac");
			 System.out.println("Marka: "+arac1[i].getMarka());
			 System.out.println("Model: "+arac1[i].getModel());
			 System.out.println("Yil: "+arac1[i].getYil());
			 System.out.println("KM: "+arac1[i].getKm());
			 System.out.println("Beygir: "+arac1[i].getBeygir());
			 System.out.println("Fiyat: "+arac1[i].getFiyat());
			 System.out.println();
		 }

		 input.close();
	}

}
