<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.sql.*" %> 
 <% Class.forName("com.mysql.cj.jdbc.Driver"); %>
<HTML lang="en">
       <HEAD>
      <meta charset="utf-8" />
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
      <meta name="description" content="" />
      <meta name="author" content="" />
      <title>ADMIN</title>
      <!-- Favicon-->
      <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
      <!-- Font Awesome icons (free version)-->
      <script src="https://use.fontawesome.com/releases/v5.15.4/js/all.js" crossorigin="anonymous"></script>
      <!-- Google fonts-->
      <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	  rel="stylesheet" type="text/css" />
      <link
	   href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"
	   rel="stylesheet" type="text/css" />
      <!-- Core theme CSS (includes Bootstrap)-->
      <link href="css/index-styles.css" rel="stylesheet" />
       </HEAD>
       <BODY id="page-top">
       <% 
       Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/billing?useSSL=false","root","root");
       Statement statement = connection.createStatement() ;
       
       String id=request.getParameter("id");
       PreparedStatement pst = connection.prepareStatement("delete from users where id=?");
       pst.setString(1,id);
       int res = pst.executeUpdate();
       
       ResultSet resultset = statement.executeQuery("select * from users ");
       
       %>
       <nav
		class="navbar navbar-expand-lg bg-secondary text-uppercase "
		id="mainNav">
		<div class="container">
			<a class="navbar-brand" href="#page-top">Billing</a>
			<button
				class="navbar-toggler text-uppercase font-weight-bold bg-primary text-white rounded"
				type="button" data-bs-toggle="collapse"
				data-bs-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				Menu <i class="fas fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ms-auto">
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="index.jsp">Home</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="index.jsp">About</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="index.jsp">Contact</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="product.jsp">Products</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="users.jsp">Users</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="login.jsp">Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>
      <div class="container-fluid bg-1 ">	
       <H1 class="page-section-heading text-center text-uppercase text-secondary mb-0 ">Admin Users List</H1>
       </header>
       <hr>  
      <table class="table table-striped masthead bg-primary text-black text-center">
      <thead class="thead-dark ">
      <tr>
      <TH scope="col">Edit</TH>
      <TH scope="col">Id</TH>
      <TH scope="col">UserName</TH>
      <TH scope="col">Password</TH>
      <TH scope="col">Email</TH>
      <TH scope="col">Mobile</TH>
      </TR>
      </thead>
      <tbody>
      <% while(resultset.next()){ %>
      <TR>
       <th scope="row"> 
        <form action="users.jsp" method="post">
        <input type="hidden" name="id" value="<%=resultset.getLong("id")%>" />
        <input type="submit" value="Delete"/>
        </form>
         </th>
       <th scope="row"> <%= resultset.getString(1) %></th>
       <TD> <%= resultset.getString(2) %></TD>
       <TD> <%= resultset.getString(3) %></TD>
       <TD> <%= resultset.getString(4) %></TD>
       <TD> <%= resultset.getString(5) %></TD>
      </TR>
      <% } %>
      </tbody>
     </TABLE>
     </div>
     </BODY>
</HTML>