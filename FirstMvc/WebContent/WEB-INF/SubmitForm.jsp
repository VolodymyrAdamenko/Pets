<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- Bellow we add library which corresponding for form resend in case of Client mistake -->
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Students subscription for GermanLingvo </h1>
<!-- Bellow we mention path on which exact kind of mistake can be arise -->

<form:errors path="sudent.*/">      </form:errors>

<!-- we should use full path name to reach the page -->

<form action = "/FirstMvc/SubmissionResponse.html" method = "post"> 

Student age: <input type="text" name="studentAge"> <br>
Student name: <input type="text" name="studentName"> <br>
<input type="submit" value="Hit for data processing">
</form>


</body>
</html>