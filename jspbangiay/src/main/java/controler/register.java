package controler;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.KhachHang;

import java.io.IOException;
import java.sql.Date;
import java.util.Random;

import database.KhachHangDAO;

/**
 * Servlet implementation class register
 */
@WebServlet("/dang-ki.jsp")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String url="";
		String tendangnhap=request.getParameter("tendangnhap");
		String mk=request.getParameter("matkhau");
		String matkhaunhaplai=request.getParameter("matkhaunhaplai");
		String hovaten=request.getParameter("HoVaTen");
		String gioitinh=request.getParameter("gioitinh");
		String ngaysinh=request.getParameter("ngaysinh");
		String diachikh=request.getParameter("diachikhachhang");
		String diachimuahang=request.getParameter("diachimuahang");
		String diachinhanhang=request.getParameter("diachinhanhang");
		String dienthoai=request.getParameter("sdt");
		String email=request.getParameter("email");
		String dongynhanmail=request.getParameter("dongynhanemail");
		String baoloi="";
		KhachHangDAO khd=new KhachHangDAO();
		request.setAttribute("tendangnhap", tendangnhap);
		request.setAttribute("hovaten", hovaten);
		request.setAttribute("gioitinh", gioitinh);
		request.setAttribute("ngaysinh", ngaysinh);
		request.setAttribute("diachikh", diachikh);
		request.setAttribute("diachimuahang", diachimuahang);
		request.setAttribute("diachinhanhang", diachinhanhang);

		request.setAttribute("dienthoai", dienthoai);
		request.setAttribute("email", email);
		request.setAttribute("dongynhanmail", dongynhanmail);
		
		if(khd.selectbytendn(tendangnhap))
		{
			baoloi="Tên đăng nhập đã tồn tại";
		}

		if(!mk.equals(matkhaunhaplai))
		{
			baoloi="Mật khẩu nhập lại không chính xác";
		}
		
		if(baoloi.length()>0)
		{
			url="/register.jsp";
		}

		else
		{

			Random rd= new Random();
			String makhachhang=System.currentTimeMillis()+rd.nextInt(100)+"";
			KhachHang kh = new KhachHang(makhachhang, tendangnhap, diachikh, mk, hovaten, gioitinh, diachinhanhang, diachimuahang, Date.valueOf(ngaysinh), email, dienthoai, dongynhanmail!=null);
			khd.insert(kh);
			url="/thanhcong.jsp";
		}
		
		RequestDispatcher rp= getServletContext().getNamedDispatcher(url);
		rp.forward(request, response);
		

		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
