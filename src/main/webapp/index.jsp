<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:bundle basename="i18n.messages">
    <html>
    <link rel="stylesheet" href="style/style.css" type="text/css">
    <head>
        <title><fmt:message key="title.index"></fmt:message></title>
    </head>
    <body>
    <div align="center">
        <p>
        <h3><fmt:message key="sax.parser"/>:</h3>
        <textarea name="text" rows="30" cols="100">${saxParser}</textarea>
        <br><br><br>

        <h3><fmt:message key="stax.parser"/>:</h3>
        <textarea name="text" rows="30" cols="100">${domParser}</textarea>
        <br><br><br>

        <h3><fmt:message key="dom.parser"/>:</h3>
        <textarea name="text" rows="30" cols="100">${domParser}</textarea>
        </p>
    </div>
    </body>
    </html>
</fmt:bundle>