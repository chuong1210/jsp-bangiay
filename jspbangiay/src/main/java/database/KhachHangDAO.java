package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Hang;
import model.KhachHang;
import model.SanPham;
import model.theloaigiay;

public class KhachHangDAO implements Daointerface<KhachHang> {

	
	private ArrayList<KhachHang> data= new ArrayList<KhachHang>();
	@Override
	public ArrayList<KhachHang> selectALL() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	ArrayList<KhachHang> kq= new ArrayList<KhachHang>();
		
		
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = jdb1.getconnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM khachhang";

			PreparedStatement st = con.prepareStatement(sql);
			
			// Bước 3: thực thi câu lệnh SQL
			
			System.out.println(sql);
			ResultSet rs= st.executeQuery();
			// Bước 4:
			while(rs.next())
			{	
				String makhachhang=rs.getString("makhachhang");
				String tendangnhap=rs.getString("tendangnhap");
				String diachi=rs.getString("diachi");
				String matkhau=rs.getString("matkhau");
				String hovaten=rs.getString("hovaten");
				String gioitinh=rs.getString("gioitinh");
				String diachimuahang=rs.getString("diachimuahang");
				String diachinhanhang=rs.getString("diachinhanhang");
				Date ngaysinh=rs.getDate("ngaysinh");
				String sdt=rs.getString("sdt");
				String emaill=rs.getString("email");
			Boolean dongynhanmail=rs.getBoolean("dangkinhanbangtin");
			KhachHang kh= new KhachHang(makhachhang, tendangnhap, diachi, matkhau, hovaten, gioitinh, diachinhanhang, diachimuahang, ngaysinh, emaill, sdt, dongynhanmail);
				kq.add(kh);
				
				
				
			}
			
			// Bước 5:
		jdb1.closeconntection(con);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	}
		return kq;		}

	@Override
	public KhachHang selectbyid(KhachHang t) {
		KhachHang kq=null;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = jdb1.getconnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM khachhang WHERE makhachhang=?";

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMakhachhang());
			
			// Bước 3: thực thi câu lệnh SQL
			
			System.out.println(sql);
			ResultSet rs= st.executeQuery();
			// Bước 4:
			while(rs.next())
			{
				String makhachhang=rs.getString("makhachhang");
				String tendangnhap=rs.getString("tendangnhap");
				String diachi=rs.getString("diachi");
				String matkhau=rs.getString("matkhau");
				String hovaten=rs.getString("hovaten");
				String gioitinh=rs.getString("gioitinh");
				String diachimuahang=rs.getString("diachimuahang");
				String diachinhanhang=rs.getString("diachinhanhang");
				Date ngaysinh=rs.getDate("ngaysinh");
				String sdt=rs.getString("sdt");
			Boolean dongynhanmail=rs.getBoolean("dangkinhanbangtin");
			 kq= new KhachHang(makhachhang, tendangnhap, diachi, matkhau, hovaten, gioitinh, diachinhanhang, diachimuahang, ngaysinh, diachimuahang, sdt, dongynhanmail);
				break;	
				}
				// Bước 5:
		jdb1.closeconntection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	}
		return kq;
	
}

	@Override
	public int insert(KhachHang t) {
		int kq=0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = jdb1.getconnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "INSERT INTO khachhang (makhachhang, tendangnhap, diachi, matkhau,hovaten,gioitinh,diachinhanhang,diachimuahang,ngaysinh,email,sdt,dangkinhanbangtin) "+
					" VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMakhachhang());
			st.setString(2, t.getTendangnnhap());
			st.setString(3, t.getDiachi());
			st.setString(4, t.getMatkhau());
			st.setString(5, t.getHovaten());
			st.setString(6, t.getGioitinh());
			st.setString(7, t.getDiachinhanhhang());
			st.setString(8, t.getDiachimuahang());
			st.setDate(9,  (Date) t.getNamsinh());
			st.setString(10, t.getEmail());
			st.setString(11, t.getSdt());
			st.setBoolean(12, t.isDknhanbangtin());

			// Bước 3: thực thi câu lệnh SQL
			
			System.out.println(sql);
			kq=st.executeUpdate();			// Bước 4:

			System.out.println("Ban da thuc thi sql"+sql);
			System.out.println("có"+kq+"dòng bị thay đổi");
				// Bước 5:
		jdb1.closeconntection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
			}
		return kq;
	}

	@Override
	public int insertAll(ArrayList<KhachHang> arr) {
		// TODO Auto-generated method stub
	int dem=0;
	
	
	for (KhachHang KhachHang : arr) {
		dem+=this.insert(KhachHang);
	}
	return dem;
	}

	@Override
	public int delete(KhachHang t) {
		// TODO Auto-generated method stub
if(this.selectbyid(t)!=null)
{
	data.remove(t);
	return 1;
}
return 0;
	}

	@Override
	public int deleatall(ArrayList<KhachHang> arr) {
		// TODO Auto-generated method stub
		
			data.clear();
			return 1;
			
	}
		
	@Override
	public int update(KhachHang t) {
		// TODO Auto-generated method stub
if(this.selectbyid(t)!=null)
{
	this.data.remove(t);
	this.data.add(t);
	return 1;
}
return 0;
	}




public Boolean selectbytendn(String tdn) {
	Boolean kq=false;
	try {
		// Bước 1: tạo kết nối đến CSDL
		Connection con = jdb1.getconnection();
		
		// Bước 2: tạo ra đối tượng statement
		String sql = "SELECT * FROM khachhang WHERE tendangnhap=?";

		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, tdn);
		
		// Bước 3: thực thi câu lệnh SQL
		
		System.out.println(sql);
		ResultSet rs= st.executeQuery();
		// Bước 4:
		while(rs.next())
		{
			
			kq=true;
			}
			// Bước 5:
	jdb1.closeconntection(con);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();	}
	return kq;
}
}

