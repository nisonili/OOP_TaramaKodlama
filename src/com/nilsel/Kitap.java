package com.nilsel;

public class Kitap {

	private String baslik;

	public String getBaslik() {
		return baslik;
	}

	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getYayinYili() {
		return yayinYili;
	}

	public void setYayinYili(int yayinYili) {
		this.yayinYili = yayinYili;
	}

	private String yazar;
	private String isbn;
	private int yayinYili;

	public Kitap(String baslik, String yazar, String isbn, int yayinYili) {
		this.baslik = baslik;
		this.yazar = yazar;
		this.isbn = isbn;
		this.yayinYili = yayinYili;

	}
}
