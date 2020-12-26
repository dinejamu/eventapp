<!DOCTYPE HTML>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="de">
<head>
    <title>View Events</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
<h2>List of Events</h2>
<table>
    <tr>
        <th>Event id</th>
        <th>Name</th>
        <th>Phone number</th>
        <th>Email id</th>
        <th>Event name</th>
        <th>Date</th>
        <th>Place</th>
    </tr>

    <c:forEach items="${elist}" var="testItem">
        <tr>
            <td><c:out value="${testItem.eventid}"/></td>
            <td><c:out value="${testItem.name}"/></td>
            <td><c:out value="${testItem.pnumber}"/></td>
            <td><c:out value="${testItem.emailid}"/></td>
            <td><c:out value="${testItem.eventname}"/></td>
            <td><c:out value="${testItem.eventdate}"/></td>
            <td><c:out value="${testItem.eventlocation}"/></td>
        </tr>
    </c:forEach>
</table>
</body>