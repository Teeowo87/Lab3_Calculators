<%-- 
    Document   : arithmeticcalculator
    Created on : May 30, 2021, 10:48:50 PM
    Author     : 848925
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
      <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <table>
                 <tr>
                    <th><label>First: </label></th>
                    <th><input type="text" name="first_input" value="${firstInput}"></th>
                 </tr>
                <br>
                <tr>
                    <th><label>Second: </label></th>
                    <th><input type="text" name="second_input" value="${secondInput}"></th>
                 </tr>
                 <br>
                </table>
                 <table>       
                    <th><input type="submit" value="+" name="add">
                    <input type="submit" value="-" name="sub">
                    <input type="submit" value="*" name="mul">
                    <input type="submit" value="%" name="mod">
                    </th> 
                 </table>
                 
        </form>
        <p>Result: ${message2}</p>
        <a href="ageCalc">Age Calculator</a>
    </body>
</html>
