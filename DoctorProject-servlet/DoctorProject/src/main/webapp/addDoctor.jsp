<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Doctor</title>
</head>
<body>
    <h1>Add Doctor</h1>
    <form action="addDoctorServlet" method="post">


       doctorNAme:  <input type="text" name="doctorName"><br>

        Speciality: <input type="text" name="speciality"><br>

       Fess:  <input type="number" name="fees"><br>

       Ratings:  <input type="number" name="ratings"><br>

       Experience:  <input type="number" name="experience"><br>
        <input type="submit" value="Add Doctor">
    </form>
</body>
</html>
