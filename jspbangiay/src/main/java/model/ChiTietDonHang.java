package model;

public class ChiTietDonHang {

	private String machitietdonhang;
	private DonHang donhang;
	private SanPham sanpham;
	private Double soluong;
	private Double giagoc;
	private Double giamgia;
	private Double thuevat;
	private Double giaban;
	private Double tongtien;
	public ChiTietDonHang(String machitietdonhang, model.DonHang donhang, SanPham sanpham, Double soluong,
			Double giagoc, Double giamgia, Double thuevat, Double giaban, Double tongtien) {
		this.machitietdonhang = machitietdonhang;
		this.donhang = donhang;
		this.sanpham = sanpham;
		this.soluong = soluong;
		this.giagoc = giagoc;
		this.giamgia = giamgia;
		this.thuevat = thuevat;
		this.giaban = giaban;
		this.tongtien = tongtien;
	}
	
	public ChiTietDonHang() {
	}

	public String getMachitietdonhang() {
		return machitietdonhang;
	}
	public void setMachitietdonhang(String machitietdonhang) {
		this.machitietdonhang = machitietdonhang;
	}
	public DonHang getDonhang() {
		return donhang;
	}
	public void setDonhang(DonHang donhang) {
		this.donhang = donhang;
	}
	public SanPham getSanpham() {
		return sanpham;
	}
	public void setSanpham(SanPham sanpham) {
		this.sanpham = sanpham;
	}
	public Double getSoluong() {
		return soluong;
	}
	public void setSoluong(Double soluong) {
		this.soluong = soluong;
	}
	public Double getGiagoc() {
		return giagoc;
	}
	public void setGiagoc(Double giagoc) {
		this.giagoc = giagoc;
	}
	public Double getGiamgia() {
		return giamgia;
	}
	public void setGiamgia(Double giamgia) {
		this.giamgia = giamgia;
	}
	public Double getThuevat() {
		return thuevat;
	}
	public void setThuevat(Double thuevat) {
		this.thuevat = thuevat;
	}
	public Double getGiaban() {
		return giaban;
	}
	public void setGiaban(Double giaban) {
		this.giaban = giaban;
	}
	public Double getTongtien() {
		return tongtien;
	}
	public void setTongtien(Double tongtien) {
		this.tongtien = tongtien;
	}
	
	
	

	
}
