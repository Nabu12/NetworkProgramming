<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
    <style>
        td {
            padding: 10px;
        }
        div {
            width: 50%;
            border: 1px solid black;
            border-radius: 5px;
            margin: 20px auto;
            padding: 20px;
        }
    </style>
</head>
<body>
    <center>  
        <h1>Student Details</h1>
    </center>
    <center>
        <div>
            <form action="StudentServlet" method="POST"> <!-- Corrected the form action -->
                <table>
                    <tr>
                        <td>Student Name:</td>
                        <td><input type="text" class="form-control" name="studentName" placeholder="Student name" required></td>
                    </tr>
                    <tr>
                        <td>Student Roll No:</td>
                        <td><input type="text" class="form-control" name="rollNo" placeholder="Student Roll" required></td>
                    </tr>
                    <tr>
                        <td>Course:</td>
                        <td><input type="text" class="form-control" name="course" placeholder="Course" required></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" class="form-control" name="password" placeholder="Password" required></td>
                    </tr>
                    <tr>
                        <td colspan="2" style="text-align:center">
                            <input type="submit" class="btn btn-success" value="Submit">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </center>
</body>
</html>
