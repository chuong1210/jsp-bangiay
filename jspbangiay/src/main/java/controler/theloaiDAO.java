package controler;

import java.util.ArrayList;

import model.theloaigiay;

public class theloaiDAO {
	private ArrayList<theloaigiay> data = new ArrayList<theloaigiay>();

	public ArrayList<theloaigiay> selectAll() {
		return data;
	}

	public theloaigiay selectById(String Id) {
		for (theloaigiay theLoai : data) {
			if (theLoai.getMatheloaigiay().compareTo(Id) == 0) {
				return theLoai;
			}
		}
		return null;
	}

	public int insert(theloaigiay theLoai) {
		theloaigiay check = this.selectById(theLoai.getMatheloaigiay());
		if (check == null) {
			data.add(theLoai);
			return 1;
		}
		return 0;
	}

	public int insertAll(ArrayList<theloaigiay> list) {
		int dem = 0;
		for (theloaigiay theLoai : list) {
			if (selectById(theLoai.getMatheloaigiay()) == null) {
				dem += this.insert(theLoai);
			}
		}
		return dem;
	}

	public int delete(theloaigiay theLoai) {
		theloaigiay check = this.selectById(theLoai.getMatheloaigiay());
		if (check != null) {
			data.remove(theLoai);
			return 1;
		}
		return 0;
	}

	public int deleteAll(ArrayList<theloaigiay> list) {
		int dem = 0;
		for (theloaigiay theLoai : list) {
			theloaigiay check = this.selectById(theLoai.getMatheloaigiay());
			if (check != null) {
				dem += this.delete(theLoai);
			}
		}
		return dem;
	}

	public int update(theloaigiay theLoai) {
		theloaigiay check = this.selectById(theLoai.getMatheloaigiay());
		if (check != null) {
			data.remove(check);
			data.add(theLoai);// add() not indexof()
			return 1;
		}
		return 0;
	}
}
