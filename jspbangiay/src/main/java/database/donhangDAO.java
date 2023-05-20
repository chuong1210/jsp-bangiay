package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.DonHang;
import model.Hang;

public class donhangDAO  implements Daointerface<DonHang>{
	
	private ArrayList<DonHang> data= new ArrayList<DonHang>();
	@Override
	public ArrayList<DonHang> selectALL() {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			ArrayList<DonHang> kq= new ArrayList<DonHang>();
			
			
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
					DonHang dh = new DonHang(tenhang,mahang,ngaythanhlap,tieusu);
					kq.add(dh);
					
					
					
				}
				
				// Bước 5:
			jdb1.closeconntection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	}
			return kq;
		}	}

	@Override
	public DonHang selectbyid(DonHang t) {
		// TODO Auto-generated method stub
for (DonHang DonHang : data) {
	if(data.equals(t))
	{
			return DonHang;
	}
	
}
return null;
}

	@Override
	public int insert(DonHang t) {
		// TODO Auto-generated method stub
	if(this.selectbyid(t)==null)
	{
		this.data.add(t);
		return 1;
	}

return 0;

	}

	@Override
	public int insertAll(ArrayList<DonHang> arr) {
		// TODO Auto-generated method stub
	int dem=0;
	
	
	for (DonHang DonHang : arr) {
		dem+=this.insert(DonHang);
	}
	return dem;
	}

	@Override
	public int delete(DonHang t) {
		// TODO Auto-generated method stub
if(this.selectbyid(t)!=null)
{
	chitietdonhangDAO ctdh = new chitietdonhangDAO();
	ctdh.deleteAll(t);
	data.remove(t);
	return 1;
}
return 0;
	}

	@Override
	public int deleatall(ArrayList<DonHang> arr) {
		// TODO Auto-generated method stub
		
			int dem=0;
			for (DonHang donHang : arr) {
				dem+=this.delete(donHang);
			}
		return dem;	
	}
		
	@Override
	public int update(DonHang t) {
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

