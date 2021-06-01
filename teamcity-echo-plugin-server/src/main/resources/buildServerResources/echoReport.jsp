<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--@elvariable id="text" type="java.lang.String"--%>
<%--@elvariable id="iqserverreport" type="java.lang.String"--%>
<%--@elvariable id="applicationid" type="java.lang.String"--%>
<%--@elvariable id="test" type="java.lang.String"--%>
<div>Sonatype logo</div>
<div>
	<table>
		<tr>
			<td>
				<b>Latest Nexus IQ Policy Evaluation <a target="_blank" href='<c:out value="${iqserverreport}" default="no content to display"/>'>(View Report)</a>
				</b>
			</td>
		</tr>
		<tr>
			<td>
				<b>Application: </b><c:out value="${applicationid}" default="no content to display"/><br/>
</td>
		</tr>
		<tr>
			<td>
				<b>IQ Stage: </b>build
</td>
		</tr>
		<tr>
			<td>
				<b>31 Violations</b> affecting 11 components
</td>
		</tr>
		<tr>
			<td width="47" style="border-radius: 2px;float:left;width:47px;margin:2;padding:2;background-color:red;color:white;text-align:center;">
				<b>4</b>
			</td>
			<td width="47" style="border-radius: 2px;float:left;width:47px;margin:2;padding:2;background-color:orange;color:white;text-align:center;">
				<b>26</b>
			</td>
			<td width="47" style="border-radius: 2px; float:left;width:47px;margin:2;padding:2;background-color:#fddf77;color:white;text-align:center;">
				<b>1</b>
			</td>
		</tr>
		<tr>
			<td>
0 grandfathered
</td>
		</tr>
	</table>
</div>
<hr/>

<c:out value="${text}" default="no content to display"/><br/>


<c:out value="${test}" default="no content to display"/><br/>