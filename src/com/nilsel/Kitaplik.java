package com.nilsel;

public class Kitaplik {

	private static final int MAX_KITAP_SAYISI = 100;
	private Kitap[] kitaplar;
	private int kitapSayisi;

	public Kitaplik() {
		kitaplar = new Kitap[MAX_KITAP_SAYISI];
		kitapSayisi = 0;
	}

	public void kitapEkle(Kitap kitap) {
		if (kitapSayisi < MAX_KITAP_SAYISI) {
			kitaplar[kitapSayisi] = kitap;
			kitapSayisi++;
			System.out.println("Kitabınız kitaplığa eklendi!");
		} else {
			System.out.println("Kitaplık dolu, daha fazla kitap eklenemez.");
		}
	}

	public void kitapSil(String isbn) {
		for (int i = 0; i < kitapSayisi; i++) {
			if (kitaplar[i] != null && kitaplar[i].getIsbn().equals(isbn)) {
				kitaplar[i] = null;
				System.out.println("Kitap silindi.");
				return;
			}
		}
		System.out.println("Kitap bulunamadı.");
	}

	public void kitapAra(String aramaKriteri, int secim) {
		IGoruntule konsolGoruntuleme = new KonsolGoruntule();
		System.out.println("Aranan Kitaplar:");
		for (int i = 0; i < kitapSayisi; i++) {
			if (kitaplar[i] != null) {
				String kriter = "";
				switch (secim) {
				case 1:
					kriter = kitaplar[i].getBaslik();
					break;
				case 2:
					kriter = kitaplar[i].getYazar();
					break;
				case 3:
					kriter = kitaplar[i].getIsbn();
					break;
				case 4:
					kriter = String.valueOf(kitaplar[i].getYayinYili());
					break;
				}
				if (kriter.toLowerCase().contains(aramaKriteri.toLowerCase())) {
					konsolGoruntuleme.goruntule(kitaplar[i]);
				}
			}
		}
	}

	public void kitaplariGoruntule(IGoruntule goruntuleme) {
		for (int i = 0; i < kitapSayisi; i++) {
			if (kitaplar[i] != null) {
				goruntuleme.goruntule(kitaplar[i]);
			}
		}

	}
}
