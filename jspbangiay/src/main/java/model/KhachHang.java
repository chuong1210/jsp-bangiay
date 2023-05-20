package model;

import java.util.Date;

public class KhachHang {
private String makhachhang;
private String tendangnnhap;
private String diachi;
private String matkhau;
private String hovaten;
private String gioitinh;
private String diachinhanhhang;
private String diachimuahang;
private Date namsinh;
private String email;
private String sdt;
private boolean dknhanbangtin;
public KhachHang(String makhachhang, String tendangnnhap, String diachi, String matkhau, String hovaten,
		String gioitinh, String diachinhanhhang, String diachimuahang, Date namsinh, String email, String sdt,
		boolean dknhanbangtin) {
	super();
	this.makhachhang = makhachhang;
	this.tendangnnhap = tendangnnhap;
	this.diachi = diachi;
	this.matkhau = matkhau;
	this.hovaten = hovaten;
	this.gioitinh = gioitinh;
	this.diachinhanhhang = diachinhanhhang;
	this.diachimuahang = diachimuahang;
	this.namsinh = namsinh;
	this.email = email;
	this.sdt = sdt;
	this.dknhanbangtin = dknhanbangtin;
}
public KhachHang() {
	super();
}
public String getMakhachhang() {
	return makhachhang;
}
public void setMakhachhang(String makhachhang) {
	this.makhachhang = makhachhang;
}
public String getTendangnnhap() {
	return tendangnnhap;
}
public void setTendangnnhap(String tendangnnhap) {
	this.tendangnnhap = tendangnnhap;
}
public String getDiachi() {
	return diachi;
}
public void setDiachi(String diachi) {
	this.diachi = diachi;
}
public String getMatkhau() {
	return matkhau;
}
public void setMatkhau(String matkhau) {
	this.matkhau = matkhau;
}
public String getHovaten() {
	return hovaten;
}
public void setHovaten(String hovaten) {
	this.hovaten = hovaten;
}
public String getGioitinh() {
	return gioitinh;
}
public void setGioitinh(String gioitinh) {
	this.gioitinh = gioitinh;
}
public String getDiachinhanhhang() {
	return diachinhanhhang;
}
public void setDiachinhanhhang(String diachinhanhhang) {
	this.diachinhanhhang = diachinhanhhang;
}
public String getDiachimuahang() {
	return diachimuahang;
}
public void setDiachimuahang(String diachimuahang) {
	this.diachimuahang = diachimuahang;
}
public Date getNamsinh() {
	return namsinh;
}
public void setNamsinh(Date namsinh) {
	this.namsinh = namsinh;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSdt() {
	return sdt;
}
public void setSdt(String sdt) {
	this.sdt = sdt;
}
public boolean isDknhanbangtin() {
	return dknhanbangtin;
}
public void setDknhanbangtin(boolean dknhanbangtin) {
	this.dknhanbangtin = dknhanbangtin;
}

}