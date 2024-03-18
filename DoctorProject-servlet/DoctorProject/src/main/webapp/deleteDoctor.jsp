<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Doctor</title>
</head>
<body>
    <h1>Delete Doctor</h1>
    <form action="deleteDoctorServlet" method="post">
        Doctor ID  <input type="number" name="doctorId"><br>
        <input type="submit" value="Delete Doctor">
    </form>
</body>
</html>
