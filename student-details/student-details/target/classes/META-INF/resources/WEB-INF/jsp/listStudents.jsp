<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
		<div class = "container">
			<h1>Students List</h1>
			<table class="table">
				<thead>
					<tr>
						<!--  th>Id</th>-->
						<th>Student Name</th>
						<th>qualification</th>
						<th>dueDate</th>
						<th>Is completed?</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>		
					<c:forEach items="${students}" var="student">
						<tr>
							<!--  td>${student.id}</td>-->
							<td>${student.studentName}</td>
							<td>${student.qualification}</td>
							<td>${student.dueDate}</td>
							<td>${student.completed}</td>
							<td> <a href="delete-student?id=${student.id}" class="btn btn-warning">Delete</a></td>
							<td> <a href="update-student?id=${student.id}" class="btn btn-success">Update</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="add-student" class="btn btn-success">Add Student</a>
		  </div>
      <%@ include file="common/footer.jspf" %>