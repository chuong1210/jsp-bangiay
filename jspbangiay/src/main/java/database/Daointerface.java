package database;

import java.util.ArrayList;

public interface Daointerface<T> {
	
	public ArrayList<T> selectALL();
	public T selectbyid(T t);
	public int insert(T t);
	public int insertAll(ArrayList<T> arr);
	public int delete(T t);
	public int deleatall(ArrayList<T> arr);
	public int update(T t);
	

}
