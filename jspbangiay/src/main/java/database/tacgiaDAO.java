package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Hang;

public class tacgiaDAO implements Daointerface<Hang> {

	
	
	public ArrayList<Hang> data= new ArrayList<Hang>();
	@Override
	public ArrayList<Hang> selectALL() {
		// TODO Auto-generated method stub
		ArrayList<Hang> kq= new ArrayList<Hang>();
		
		
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = jdb1.getconnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM hang";

			PreparedStatement st = con.prepareStatement(sql);
			
			// Bước 3: thực thi câu lệnh SQL
			
			System.out.println(sql);
			ResultSet rs= st.executeQuery();
			// Bước 4:
			while(rs.next())
			{
				String tenhang=rs.getString("Tenhang");
				String mahang=rs.getString("Mahang");
				Date ngaythanhlap= rs.getDate("Ngaythanhlap");
				String tieusu=rs.getString("Mota");
				Hang hang = new Hang(tenhang,mahang,ngaythanhlap,tieusu);
				kq.add(hang);
					}		// Bước 5:
		jdb1.closeconntection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	}
		return kq;
	}

	
	
	
	
	@Override
	public Hang selectbyid(Hang t) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Hang kq=null;
		
		
		
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = jdb1.getconnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM hang WHERE mahang=?";

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMahang());
			
			// Bước 3: thực thi câu lệnh SQL
			
			System.out.println(sql);
			ResultSet rs= st.executeQuery();
			// Bước 4:
			while(rs.next())
			{
				String tenhang=rs.getString("Tenhang");
				String mahang=rs.getString("Mahang");
				Date ngaythanhlap= rs.getDate("Ngaythanhlap");
				String tieusu=rs.getString("Mota");
				kq = new Hang(tenhang,mahang,ngaythanhlap,tieusu);
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
	public int insert(Hang t) {
		// TODO Auto-generated method stub
	int kq=0;
	try {
		String sql = "INSERT INTO hang (Mahang, Tenhang, Ngaythanhlap, Mota) "+
				" VALUES (?,?,?,?)";
		Connection connection = jdb1.getconnection();
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1,t.getMahang());
		pst.setString(2,t.getTenhang());
		pst.setDate(3,t.getNgaythanhlap());
		pst.setString(4, t.getTieusu());
		kq=pst.executeUpdate();
	
	System.out.println("Ban da thuc thi sql"+sql);
	System.out.println("có"+kq+"dòng bị thay đổi");
	jdb1.closeconntection(connection);
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return kq;
	}

	
	
	
	
	@Override
	public int insertAll(ArrayList<Hang> arr) {
		// TODO Auto-generated method stub
	int dem=0;
	
	for (Hang hang : arr) {
		dem+=this.insert(hang);
	}
	return dem;
	}
	
	
	
	@Override
	public int delete(Hang t) {
		int kq=0;
		try {
			String sql = "DELETE FROM hang WHERE Mahang= ?";
			Connection connection = jdb1.getconnection();
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1,t.getMahang());
			kq=pst.executeUpdate();
		System.out.println("Ban da thuc thi sql"+sql);
		System.out.println("có"+kq+"dòng bị thay đổi");
		jdb1.closeconntection(connection);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return kq;
	}
	
	
	

	@Override
	public int deleatall(ArrayList<Hang> arr) {
		// TODO Auto-generated method stub		
			data.clear();
			return 1;
			
	}
		
	@Override
	public int update(Hang t) {
		int kq=0;
		try {
			Connection connection = jdb1.getconnection();
			String sql = "UPDATE hang "+
					 " SET " +
					 " Tenhang=?"+
					 " ,Ngaythanhlap"+
					 " ,Mota"+

					 
					 "WHERE Matacgia=?";
			PreparedStatement pst = connection.prepareStatement(sql);
			
			pst.setString(1,t.getTenhang());
			pst.setDate(2,t.getNgaythanhlap());
			pst.setString(3, t.getTieusu());
			pst.setString(4,t.getMahang());
			kq=pst.executeUpdate();

		
		System.out.println("Ban da thuc thi sql"+sql);
		System.out.println("có"+kq+"dòng bị thay đổi");
		jdb1.closeconntection(connection);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return kq;
		}
	
	public static void main(String[] args) {
		tacgiaDAO tgd= new tacgiaDAO();
		ArrayList<Hang> ar = new ArrayList<Hang>();
		
		ar=tgd.selectALL();
		for (Hang hang : ar) {
			System.out.println(hang.toString());
		}
		Hang hang1 = new Hang("01", "Puma", new Date(1965-1900,12,03), "Hãng giày đến từ Úc");
		Hang hang2 = new Hang("02", "Nike", new Date(1980-1900,12,03), "Hãng giày đến từ Mỹ");
		Hang hang3= new Hang("03", "Adidas", new Date(1942-1900,12,03), "Hãng giày đến từ Anh");
//ar.add(hang1);
//ar.add(hang2);
//ar.add(hang3);
//tgd.insertAll(ar);

tgd.delete(hang1);
		
	}
	

}
