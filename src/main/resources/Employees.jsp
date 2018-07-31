<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Employee" %>
<%@ page import="service.Employeeservice"%>
<%@ page import="impl.EmployeeServiceImpl"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Employees</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<style>
div{
margin : 3cm 4cm 8cm 15cm;
}
</style>
</head>
<body>
<div class="col-sm-4" name="center">
<table class="table table-bordered" align="center" height="250" width="200">
<tr>
<th>Name</th>
<th>Department</th>
<th>----</th>
<th>----</th>
<% 
Employeeservice empService=new EmployeeServiceImpl();
List<Employee> empList=new ArrayList<Employee>();

empList=empService.listEmployee();

for (Employee emp : empList)
{
out.println("<tr>");	
out.println("<td >"+emp.getName()+"</td>");
out.println("<td>"+emp.getDepartment()+"</td>");
out.println("<td><a href='deleteEmp.jsp'>Delete</a></td>");
out.println("<td><a href='updateEmp.jsp'>Update</a></td>");
out.println("</tr>");
}
%>

</table>
</div>


</body>
</html>
