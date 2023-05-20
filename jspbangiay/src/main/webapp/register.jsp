<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<style >

.red
{
color: red
}

.container
{
 background-color: #ff4e00;
background-image: linear-gradient(315deg, #ff4e00 0%, #ec9f05 74%);
 
 }

</style>
</head>
<body>
<div class=container>
<div class="text-center"><h1 >Đăng kí khách hàng</h1></div>
<form class="form"  action="dangki" method="get">
<div class="row">
<div class="col-md-6">
<h3>Tài khoản</h3>
  <div class="form-group mb-3">
    <label for="tendangnhap" class="form-label">Tên đăng nhập<span class="red">*</span></label>
    <input type="text" class="form-control" id="tendangnhap"  name="tendangnhap">
  </div>
    <div class="form-group mb-3">
    <label for="matkhau" class="form-label">Mật khẩu<span class="red">*</span></label>
    <input type="password" class="form-control" id="matkhau"  name="matkhau"> 
  </div>
  
    <div class="form-group mb-3">
    <label for="matkhaunhaplai" class="form-label">Nhập lại mật khẩu<span class="red">*</span><span id="msg" class="red"></span></label>
    <input type="password" class="form-control" id="matkhaunhaplai" required="required" onkeyup="kiemtramk()"  name="matkhaunhaplai">
  </div>
  
  <hr/>
  
  
  <h3>Thông tin khách hàng</h3>
  <div class="form-group mb-3">
    <label for="HoVaTen" class="form-label">Ho và tên</label>
    <input type="text" class="form-control" id="HoVaTen"  name="HoVaTen">
  </div>
    <div class="form-group mb-3">
    <label for="gioitinh" class="form-label">Giới tính</label>
    <select class="form-control" id="gioitinh"  name="gioitinh">
    <option value="Nam">Nam</option>
    <option value="Nữ">Nữ</option>
      </select>   
  </div>
  
   <div class="form-group mb-3">
    <label for="ngaysinh" class="form-label">Ngày sinh</label>
    <input type="date" class="form-control" id="ngaysinh"  name="ngaysinh">
  </div>
    <hr/>
  </div>
  
  <div class="col-md-6">
  <h3>Địa chỉ</h3>
   <div class="form-group mb-3">
    <label for="diachikhachhang" class="form-label">Địa chỉ khách hàng</label>
    <input type="text" class="form-control" id="diachikhachhang"  name="diachikhachhang">
  </div>
    <div class="form-group mb-3">
    <label for="diachimuahang" class="form-label">Địa chỉ khách hàng</label>
    <input type="text" class="form-control" id="diachimuahang"  name="diachimuahang">
  </div>
    <div class="form-group mb-3">
    <label for="diachinhanhang" class="form-label">Địa chỉ khách hàng</label>
    <input type="text" class="form-control" id="diachinhanhang"  name="diachinhanhang">
  </div>
  
   <div class="form-group mb-3">
    <label for="sdt" class="form-label">Số điện thoại</label>
    <input type="tel" class="form-control" id="sdt"  name="sdt">
  </div>
  
  <div class="form-group mb-3">
    <label for="email" class="form-label">Email</label>
    <input type="email" class="form-control" id="email"  name="email">
  </div>
  
  <div class="form-group mb-3">
    <label for="dongydk" class="form-label">Đồng ý với <a>điều khoản và chính sách của công ty</a></label>
    <input type="checkbox" class="form-check-input" id="dongydk" required="required" onchange="kiemtrady()" name="dongydk">
  </div>
  
    <div class="form-group mb-3">
    <label for="dongynhanemail" class="form-label">Đồng ý nhận email</label>
    <input type="checkbox" class="form-check-input" id="dongynhanemail"  name="dongynhanemail">
  </div>
  
  
  
  
  <hr/>

  <button type="submit" name="submit" id="submit" class="btn btn-primary form-control"
  style="display: none;">Đăng kí</button>
  </div>
      </div>
</form>
</div>
</body>

<script >

function kiemtramk()
{
	console.log("123");
	matkhau=	document.getElementById("matkhau").value;
	matkhaunhaplai=document.getElementById("matkhaunhaplai").value;
	if(matkhau!=matkhaunhaplai)
		{
		document.getElementById("msg").innerHTML="Mật khẩu đã nhập không khớp";
		return false;
		}
	else
		{
		document.getElementById("msg").innerHTML="";
		return true;
		}
	
	}
	
	function kiemtrady()
	{ 
		dongydk=document.getElementById("dongydk").checked;
		if(dongydk)
			{
		document.getElementById("submit").style.display="block";
			}
		
		else
			{
			document.getElementById("submit").style.display="none";
			}
		

	}

</script>
</html>