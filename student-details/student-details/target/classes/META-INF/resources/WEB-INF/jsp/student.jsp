<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
		<div class="container">
			<h1>Enter Student Details</h1>
			<form:form method="post" modelAttribute="student">
			<fieldset class="mb-3">
			<form:label path="studentName">Student Name</form:label>
		    <form:input type="text" path="studentName" required="required"/>
		    <form:errors  path="studentName" cssClass="text-warning"/>
		    </fieldset>
		    <fieldset class="mb-3">
		    <form:label path="qualification">Qualification</form:label>
			<form:input type="text" path="qualification" required="required"/>
			<form:errors path="qualification" cssClass="text-warning"/>
			</fieldset>
			<fieldset class="mb-3">				
			<form:label path="dueDate">Due Date</form:label>
			<form:input type="text" path="dueDate" required="required"/>
			<form:errors path="dueDate" cssClass="text-warning"/>
            </fieldset>
				<form:input type="hidden" path="id"/>
				<form:input type="hidden" path="completed"/>
				<input type="submit" class="btn btn-success"/>
			</form:form>
			
		</div>
		<%@ include file="common/footer.jspf" %>
    <script type="text/javascript">
    $('#dueDate').datepicker({
        format: 'yyyy-mm-dd',
    });
    </script>	
