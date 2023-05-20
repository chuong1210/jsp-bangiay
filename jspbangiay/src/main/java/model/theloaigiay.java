package model;

public class theloaigiay {
	private String matheloaigiay;
	private String formgiay;
	private String mausac;
	private int sizegiay;

	
	public theloaigiay(String matheloaigiay, String formgiay, String mausac, int sizegiay) {
		this.matheloaigiay = matheloaigiay;
		this.formgiay = formgiay;
		this.mausac = mausac;
		this.sizegiay = sizegiay;
	}
	public theloaigiay() {
	}
	public String getFormgiay() {
		return formgiay;
	}
	public void setFormgiay(String formgiay) {
		this.formgiay = formgiay;
	}
	public String getMausac() {
		return mausac;
	}
	public void setMausac(String mausac) {
		this.mausac = mausac;
	}
	public int getSizegiay() {
		return sizegiay;
	}
	public void setSizegiay(int sizegiay) {
		this.sizegiay = sizegiay;
	}
	public String getMatheloaigiay() {
		return matheloaigiay;
	}
	public void setMatheloaigiay(String matheloaigiay) {
		this.matheloaigiay = matheloaigiay;
	}
	

	
}
