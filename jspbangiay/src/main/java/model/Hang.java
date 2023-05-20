package model;

import java.sql.Date;
import java.util.Objects;

public class Hang {
private String tenhang;
private String mahang;
private Date ngaythanhlap;
private String tieusu;
public Hang(String tenhang, String mahang, Date ngaythanhlap, String tieusu) {
	this.tenhang = tenhang;
	this.mahang = mahang;
	this.ngaythanhlap = ngaythanhlap;
	this.tieusu = tieusu;
}
public Hang() {
}
public String getTenhang() {
	return tenhang;
}
public void setTenhang(String tenhang) {
	this.tenhang = tenhang;
}
public String getMahang() {
	return mahang;
}
public void setMahang(String mahang) {
	this.mahang = mahang;
}
public Date getNgaythanhlap() {
	return ngaythanhlap;
}
public void setNgaythanhlap(Date ngaythanhlap) {
	this.ngaythanhlap = ngaythanhlap;
}
public String getTieusu() {
	return tieusu;
}
public void setTieusu(String tieusu) {
	this.tieusu = tieusu;
}
@Override
public int hashCode() {
	return Objects.hash(mahang, ngaythanhlap, tenhang, tieusu);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Hang other = (Hang) obj;
	return Objects.equals(mahang, other.mahang) && Objects.equals(ngaythanhlap, other.ngaythanhlap)
			&& Objects.equals(tenhang, other.tenhang) && Objects.equals(tieusu, other.tieusu);
}
@Override
public String toString() {
	return "Hang [tenhang=" + tenhang + ", mahang=" + mahang + ", ngaythanhlap=" + ngaythanhlap + ", tieusu=" + tieusu
			+ "]";
}







}
