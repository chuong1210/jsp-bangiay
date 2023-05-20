package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Hang;
import model.theloaigiay;

public class theloaiDAO implements Daointerface<theloaigiay> {

	private ArrayList<theloaigiay> data= new ArrayList<theloaigiay>();
	@Override
	public ArrayList<theloaigiay> selectALL() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ArrayList<theloaigiay> kq= new ArrayList<theloaigiay>();
		
		
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = jdb1.getconnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM theloaigiay";

			PreparedStatement st = con.prepareStatement(sql);
			
			// Bước 3: thực thi câu lệnh SQL
			
			System.out.println(sql);
			ResultSet rs= st.executeQuery();
			// Bước 4:
			while(rs.next())
			{
				String matheloaigiay=rs.getString("matheloaigiay");
				String formgiay=rs.getString("formgiay");
				String mausac= rs.getString("mausac");
				int sizegiay=rs.getInt("sizegiay");
				theloaigiay tg= new theloaigiay(matheloaigiay, formgiay, mausac, sizegiay);
				kq.add(tg);
					}		// Bước 5:
		jdb1.closeconntection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	}
		return kq;	}

	@Override
	public theloaigiay selectbyid(theloaigiay t) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		theloaigiay kq=null;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = jdb1.getconnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM theloaigiay WHERE matheloaigiay=?";

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMatheloaigiay());
			
			// Bước 3: thực thi câu lệnh SQL
			
			System.out.println(sql);
			ResultSet rs= st.executeQuery();
			// Bước 4:
			while(rs.next())
			{

				String matheloaigiay=rs.getString("matheloaigiay");
				String formgiay=rs.getString("formgiay");
				String mausac= rs.getString("mausac");
				int sizegiay=rs.getInt("sizegiay");
kq=new theloaigiay(matheloaigiay, formgiay, mausac, sizegiay);
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
	public int insert(theloaigiay t) {
		int kq=0;
		try {
			String sql = "INSERT INTO hang (matheloaigiay, formgiay, mausac, sizegiay) "+
					" VALUES (?,?,?,?)";
			Connection connection = jdb1.getconnection();
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1,t.getMatheloaigiay());
			pst.setString(2,t.getFormgiay());
			pst.setString(3,t.getMausac());
			pst.setInt(4, t.getSizegiay());
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
	public int insertAll(ArrayList<theloaigiay> arr) {
		// TODO Auto-generated method stub
	int dem=0;
	
	
	for (theloaigiay hang : arr) {
		dem+=this.insert(hang);
	}
	return dem;
	}

	@Override
	public int delete(theloaigiay t) {
		// TODO Auto-generated method stub
if(this.selectbyid(t)!=null)
{
	data.remove(t);
	return 1;
}
return 0;
	}

	@Override
	public int deleatall(ArrayList<theloaigiay> arr) {
		// TODO Auto-generated method stub
		
			data.clear();
			return 1;
			
	}
		
	@Override
	public int update(theloaigiay t) {
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
