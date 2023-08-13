package com.nilsel;

class KonsolGoruntule implements IGoruntule {

	@Override

	public void goruntule(Kitap kitap) {

		System.out.println("Başlık: " + kitap.getBaslik());
		System.out.println("Yazar: " + kitap.getYazar());
		System.out.println("ISBN: " + kitap.getIsbn());
		System.out.println("Yayın Yılı: " + kitap.getYayinYili());
		System.out.println("--------------------");

	}
}