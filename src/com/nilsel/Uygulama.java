package com.nilsel;

import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {

		Kitaplik kitaplik = new Kitaplik();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Yapmak istediğiniz işlemi seçin:");
			System.out.println("1. Kitap Ekle");
			System.out.println("2. Kitap Sil");
			System.out.println("3. Kitap Ara");
			System.out.println("4. Kitaplıktaki Tüm Kitapları Görüntüle");
			System.out.println("5. Çıkış");

			int secim = scanner.nextInt();

			scanner.nextLine();

			switch (secim) {

			case 1:
				System.out.print("Başlık: ");
				String baslik = scanner.nextLine();
				System.out.print("Yazar: ");
				String yazar = scanner.nextLine();
				System.out.print("ISBN: ");
				String isbn = scanner.nextLine();
				System.out.print("Yayın Yılı: ");
				int yayinYili = scanner.nextInt();
				scanner.nextLine();
				kitaplik.kitapEkle(new Kitap(baslik, yazar, isbn, yayinYili));
				break;
			case 2:
				System.out.print("Silinecek Kitap ISBN: ");
				String silinecekIsbn = scanner.nextLine();
				kitaplik.kitapSil(silinecekIsbn);
				break;
			case 3:
				System.out.println("Kitap Arama Kriterini Seçin:");
				System.out.println("1. Başlık");
				System.out.println("2. Yazar");
				System.out.println("3. ISBN");
				System.out.println("4. Yayın Yılı");
				int aramaSecim = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Arama Kriteri: ");
				String aramaKriteri = scanner.nextLine();
				kitaplik.kitapAra(aramaKriteri, aramaSecim);
				break;
			case 4:
				System.out.println("Kitaplar:");
				kitaplik.kitaplariGoruntule(new KonsolGoruntule());
				break;
			case 5:
				System.out.println("Çıkış yapılıyor...");
				scanner.close();
				return;
			default:
				System.out.println("Geçersiz seçim.");
				break;
			}
		}
	}
}
