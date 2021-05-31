<%-- 
    Document   : agecalculator
    Created on : May 30, 2021, 2:09:34 PM
    Author     : Tosin Owobo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        
        <h1>Age Calculator</h1>
        <form method="post" action="ageCalc">
            <table>
                 <tr>
                    <th><label>Enter your age: </label></th>
                    <th><input type="text" name="age_input" value="${ageInput}"></th>
                 </tr>
                <br>
                <tr>
                  <th><input type="submit" value="Age next birthday"></th>
                </tr>
           
            </table>
           
        </form>
        <p>${message}</p>
        <a href="url">Arithmetic Calculator</a>
    </body>
</html>
