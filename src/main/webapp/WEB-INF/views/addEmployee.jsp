<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 
<html>
<head>
    <title>City NAmes</title> 
    <style>
    .error
    {
        color: #ff0000;
        font-weight: bold;
    }
    </style>
</head>
 
<body>
    <h2><spring:message code="lbl.page" text="City Names" /></h2>
    <br/>
    <form:form method="post" modelAttribute="employee">
        <%-- <form:errors path="*" cssClass="error" /> --%>
        <table>
            <tr>
                <td><spring:message code="lbl.city" text="City" /></td>
                <td><form:input path="city" /></td>
                <td><form:errors path="city" cssClass="error" /></td>
            </tr>
            <tr>
                <td colspan="3"><form:input type="submit" path="action" value="Add Employee"/></td>
            </tr>
        </table>
    </form:form>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
$('input[type=submit]').click(function(e) {

      var city = $.trim($('#city').val());

    // Check if empty of not
    if (city  === '') {
        alert('city is empty.');
        return false;
    }
});
</script>
</html>