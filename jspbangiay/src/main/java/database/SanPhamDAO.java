package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Hang;
import model.SanPham;
import model.theloaigiay;



public class SanPhamDAO implements Daointerface<SanPham>{
	
	
	private ArrayList<SanPham> data= new ArrayList<SanPham>();
	@Override
	public ArrayList<SanPham> selectALL() {
		// TODO Auto-generated method stub
	ArrayList<SanPham> kq= new ArrayList<SanPham>();
		
		
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = jdb1.getconnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM SanPham";

			PreparedStatement st = con.prepareStatement(sql);
			
			// Bước 3: thực thi câu lệnh SQL
			
			System.out.println(sql);
			ResultSet rs= st.executeQuery();
			// Bước 4:
			while(rs.next())
			{	
				String maSanPham=rs.getString("masanpham");
				String maHang=rs.getString("mahang");
				String tenSanPham=rs.getString("Tensanpham");
				int namsanxuat= rs.getInt("namsanxuat");
				Double gianhap= rs.getDouble("gianhap");
				Double giagoc= rs.getDouble("giagoc");
				Double giaban= rs.getDouble("giaban");
				String noiss=rs.getString("noisanxuat");
				int soluong= rs.getInt("soluong");
				String matheloaigiay=rs.getString("matheloaigiay");
				String mota=rs.getString("mota");
				Hang hg=new tacgiaDAO().selectbyid(new Hang(maHang, "", null, ""));
				theloaigiay tg=new theloaiDAO().selectbyid(new theloaigiay(matheloaigiay, "", "", -1));
				
				SanPham sp= new SanPham(maSanPham, tenSanPham, hg, namsanxuat, gianhap, giagoc, giaban, soluong, tg, noiss, mota);
				kq.add(sp);
				
				
				
			}
			
			// Bước 5:
		jdb1.closeconntection(con);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	}
		return kq;	
		}


	@Override
	public SanPham selectbyid(SanPham t) {
		SanPham kq=null;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = jdb1.getconnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM theloaigiay WHERE masanpham=?";

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMasanpham());
			
			// Bước 3: thực thi câu lệnh SQL
			
			System.out.println(sql);
			ResultSet rs= st.executeQuery();
			// Bước 4:
			while(rs.next())
			{
				String maSanPham=rs.getString("masanpham");
				String maHang=rs.getString("mahang");
				String tenSanPham=rs.getString("Tensanpham");
				int namsanxuat= rs.getInt("namsanxuat");
				Double gianhap= rs.getDouble("gianhap");
				Double giagoc= rs.getDouble("giagoc");
				Double giaban= rs.getDouble("giaban");
				String noiss=rs.getString("noisanxuat");
				int soluong= rs.getInt("soluong");
				String matheloaigiay=rs.getString("matheloaigiay");
				String mota=rs.getString("mota");
				Hang hg=new tacgiaDAO().selectbyid(new Hang(maHang, "", null, ""));
				theloaigiay tg=new theloaiDAO().selectbyid(new theloaigiay(matheloaigiay, "", "", -1));
				kq=new SanPham(maSanPham, tenSanPham, hg, namsanxuat, soluong, soluong, namsanxuat, soluong, tg, noiss, mota);
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
	public int insert(SanPham t) {
		// TODO Auto-generated method stub
	if(this.selectbyid(t)==null)
	{
		this.data.add(t);
		return 1;
	}

return 0;

	}

	@Override
	public int insertAll(ArrayList<SanPham> arr) {
		// TODO Auto-generated method stub
	int dem=0;
	
	
	for (SanPham SanPham : arr) {
		dem+=this.insert(SanPham);
	}
	return dem;
	}

	@Override
	public int delete(SanPham t) {
		// TODO Auto-generated method stub
if(this.selectbyid(t)!=null)
{
	data.remove(t);
	return 1;
}
return 0;
	}

	@Override
	public int deleatall(ArrayList<SanPham> arr) {
		// TODO Auto-generated method stub
		
			data.clear();
			return 1;
			
	}
		
	@Override
	public int update(SanPham t) {
		// TODO Auto-generated method stub
if(this.selectbyid(t)!=null)
{
	this.data.remove(t);
	this.data.add(t);
	return 1;
}
return 0;
	}
}