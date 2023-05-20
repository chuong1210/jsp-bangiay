package model;

import java.sql.Date;
import java.util.Objects;

public class DonHang {
private String madonhang;
private String diachimuahang;
private String diachinhanhang;
private KhachHang khachhang;
private String trangthai;
private String hinhthucthanhtoan;
private String trangthaithanhtoan;
private Double sotiendathanhtoan;
private Double sotienconthieu;
private Date ngaydathang;
private Date ngaygiaohang;
public DonHang(String madonhang, String diachimuahang, String diachinhanhang, model.KhachHang khachhang,
		String trangthai, String hinhthucthanhtoan, String trangthaithanhtoan, Double sotiendathanhtoan,
		Double sotienconthieu, Date ngaydathang, Date ngaygiaohang) {
	this.madonhang = madonhang;
	this.diachimuahang = diachimuahang;
	this.diachinhanhang = diachinhanhang;
	this.khachhang = khachhang;
	this.trangthai = trangthai;
	this.hinhthucthanhtoan = hinhthucthanhtoan;
	this.trangthaithanhtoan = trangthaithanhtoan;
	this.sotiendathanhtoan = sotiendathanhtoan;
	this.sotienconthieu = sotienconthieu;
	this.ngaydathang = ngaydathang;
	this.ngaygiaohang = ngaygiaohang;
}
public DonHang() {
}
public String getMadonhang() {
	return madonhang;
}
public void setMadonhang(String madonhang) {
	this.madonhang = madonhang;
}
public String getDiachimuahang() {
	return diachimuahang;
}
public void setDiachimuahang(String diachimuahang) {
	this.diachimuahang = diachimuahang;
}
public String getDiachinhanhang() {
	return diachinhanhang;
}
public void setDiachinhanhang(String diachinhanhang) {
	this.diachinhanhang = diachinhanhang;
}
public KhachHang getKhachhang() {
	return khachhang;
}
public void setKhachhang(KhachHang khachhang) {
	this.khachhang = khachhang;
}
public String getTrangthai() {
	return trangthai;
}
public void setTrangthai(String trangthai) {
	this.trangthai = trangthai;
}
public String getHinhthucthanhtoan() {
	return hinhthucthanhtoan;
}
public void setHinhthucthanhtoan(String hinhthucthanhtoan) {
	this.hinhthucthanhtoan = hinhthucthanhtoan;
}
public String getTrangthaithanhtoan() {
	return trangthaithanhtoan;
}
public void setTrangthaithanhtoan(String trangthaithanhtoan) {
	this.trangthaithanhtoan = trangthaithanhtoan;
}
public Double getSotiendathanhtoan() {
	return sotiendathanhtoan;
}
public void setSotiendathanhtoan(Double sotiendathanhtoan) {
	this.sotiendathanhtoan = sotiendathanhtoan;
}
public Double getSotienconthieu() {
	return sotienconthieu;
}
public void setSotienconthieu(Double sotienconthieu) {
	this.sotienconthieu = sotienconthieu;
}
public Date getNgaydathang() {
	return ngaydathang;
}
public void setNgaydathang(Date ngaydathang) {
	this.ngaydathang = ngaydathang;
}
public Date getNgaygiaohang() {
	return ngaygiaohang;
}
public void setNgaygiaohang(Date ngaygiaohang) {
	this.ngaygiaohang = ngaygiaohang;
}
@Override
public int hashCode() {
	return Objects.hash(madonhang);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	DonHang other = (DonHang) obj;
	return Objects.equals(madonhang, other.madonhang);
}




}
