<%@include file="fragment/head.jspf"%>
    <table class="table table-striped">

        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Location</th>
                <th>Start</th>
                <th>End</th>
            </tr>
        </thead>

        <tbody>

            <c:forEach var="event" items="${events}">


                <tr>
                    <td><c:out value="${event.id}"></c:out></td>
                    <td><c:out value="${event.name}"></c:out></td>
                    <td><c:out value="${event.location}"></c:out></td>
                    <td><c:out value="${event.startDateFormatted}"></c:out></td>
                    <td><c:out value="${event.endDateFormatted}"></c:out></td>
                    <td><a class="btn btn-primary" href="edit/<c:out value="${event.id}"></c:out>">Edit</a> </td>
                    <td><a class="btn btn-danger" onclick="return confirm('This will delete this event.');"
                           href="delete/<c:out value="${event.id}"></c:out>">Delete</a> </td>
                </tr>


            </c:forEach>

        </tbody>

    </table>
<%@include file="fragment/footer.jspf"%>
