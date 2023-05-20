package controler;

import java.util.ArrayList;

import model.Hang;

public class tacgiaDAO  {

	private ArrayList<Hang> data= new ArrayList<Hang>();
	
	
	
	public ArrayList<Hang> seleall()
	{
		return data;
	}
	public Hang selectbyid(String id)
	{
		Hang tim= new Hang();
		tim.setMahang(id);
		
		for(Hang hang:data)
		{
			if(hang.equals(tim))
			{
				return hang;
			}
		}
		return null;
	}
	
	public int insert(Hang hang)
	{
		Hang kiemtratontai=this.selectbyid(hang.getMahang());
		if(kiemtratontai==null)
		{
			data.add(hang);
			return 1;
		}
		else
		{
		return 0;
		}
	}
	
	public int insertAll(ArrayList<Hang> list)
	{
		int dem=0;
		for (Hang hang : list) {
			dem+=this.insert(hang);
		}
		return dem;
	}
	
	public int delete(Hang hang)
	{
		Hang kiemtratontai=this.selectbyid(hang.getMahang());
		if(kiemtratontai!=null)
		{
			data.remove(hang);
			return 1;
		}
		else
		{
		return 0;
		}
	}
	public void deletetAll(ArrayList<Hang> list) {
		list.clear();
	}
	
	public int update(Hang hang)
	{
		Hang kiemtratontai=this.selectbyid(hang.getMahang());
		if(kiemtratontai!=null)
		{
			data.remove(kiemtratontai);
			data.add(hang);
			return 1;
		}
		else
		{
		return 0;
		}
	}
	
	
	
}
