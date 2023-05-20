package model;

public class SanPham {
private String masanpham;
private String tensanpham;
private Hang store;
private int namsanxuat;
private double gianhap;
private double giagoc;
private double giabanra;
private int soluongconlai;
private theloaigiay theloaigiay;
private String noisanxuat;
private String mota;

public SanPham(String masanpham, String tensanpham, Hang store, int namsanxuat, double gianhap, double giagoc,
		double giabanra, int soluongconlai, theloaigiay theloaigiay, String noisanxuat, String mota) {
	this.masanpham = masanpham;
	this.tensanpham = tensanpham;
	this.store = store;
	this.namsanxuat = namsanxuat;
	this.gianhap = gianhap;
	this.giagoc = giagoc;
	this.giabanra = giabanra;
	this.soluongconlai = soluongconlai;
	this.theloaigiay = theloaigiay;
	this.noisanxuat = noisanxuat;
	this.mota = mota;
}
public SanPham() {
}
public String getMasanpham() {
	return masanpham;
}
public void setMasanpham(String masanpham) {
	this.masanpham = masanpham;
}
public String getTensanpham() {
	return tensanpham;
}
public void setTensanpham(String tensanpham) {
	this.tensanpham = tensanpham;
}
public Hang getStore() {
	return store;
}
public void setStore(Hang store) {
	this.store = store;
}
public int getNamsanxuat() {
	return namsanxuat;
}
public void setNamsanxuat(int namsanxuat) {
	this.namsanxuat = namsanxuat;
}
public double getGianhap() {
	return gianhap;
}
public void setGianhap(double gianhap) {
	this.gianhap = gianhap;
}
public double getGiagoc() {
	return giagoc;
}
public void setGiagoc(double giagoc) {
	this.giagoc = giagoc;
}
public double getGiabanra() {
	return giabanra;
}
public void setGiabanra(double giabanra) {
	this.giabanra = giabanra;
}
public double getSoluongconlai() {
	return soluongconlai;
}
public void setSoluongconlai(int soluongconlai) {
	this.soluongconlai = soluongconlai;
}
public theloaigiay getTheloaigiay() {
	return theloaigiay;
}
public void setTheloaigiay(theloaigiay theloaigiay) {
	this.theloaigiay = theloaigiay;
}

public String getNoisanxuat() {
	return noisanxuat;
}
public void setNoisanxuat(String noisanxuat) {
	this.noisanxuat = noisanxuat;
}
public String getMota() {
	return mota;
}
public void setMota(String mota) {
	this.mota = mota;
}







}
