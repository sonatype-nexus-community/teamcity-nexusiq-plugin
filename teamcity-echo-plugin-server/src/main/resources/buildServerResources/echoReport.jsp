<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>





<%--@elvariable id="text" type="java.lang.String"--%>
<%--@elvariable id="reportHTMLURL" type="java.lang.String"--%>
<%--@elvariable id="applicationId" type="java.lang.String"--%>
<%--@elvariable id="stage" type="java.lang.String"--%>
<%--@elvariable id="affectedComponentCount" type="java.lang.String"--%>
<%--@elvariable id="criticalComponentCount" type="java.lang.String"--%>
<%--@elvariable id="severeComponentCount" type="java.lang.String"--%>
<%--@elvariable id="moderateComponentCount" type="java.lang.String"--%>
<%--@elvariable id="criticalPolicyViolationCount" type="java.lang.String"--%>
<%--@elvariable id="severePolicyViolationCount" type="java.lang.String"--%>
<%--@elvariable id="grandfatheredPolicyViolationCount" type="java.lang.String"--%>
<%--@elvariable id="totalComponentCount" type="java.lang.String"--%>
<%--@elvariable id="totalViolationCount" type="java.lang.String"--%>


<%--@elvariable id="test" type="java.lang.String"--%>
<div>Sonatype logo</div>
<div>
	<table>
		<tr>
			<td>
				<b>Latest Nexus IQ Policy Evaluation <a target="_blank" href='<c:out value="${reportHTMLURL}" default="#"/>'>(View Report)</a>
				</b>
			</td>
		</tr>
		<tr>
			<td>
				<b>Application: </b><c:out value="${applicationId}" default="no content to display"/><br/>
</td>
		</tr>
		<tr>
			<td>
				<b>IQ Stage: </b><c:out value="${stage}" default="no content to display"/>
</td>
		</tr>
		<tr>
			<td>
				<b><c:out value="${totalViolationCount}" default="no content to display"/> Violations</b> affecting <c:out value="${affectedComponentCount}" default="no content to display"/> components
</td>
		</tr>
		<tr>
			<td width="47" style="border-radius: 2px;float:left;width:47px;margin:2;padding:2;background-color:red;color:white;text-align:center;">
				<b><c:out value="${criticalPolicyViolationCount}" default="no content to display"/></b>
			</td>
			<td width="47" style="border-radius: 2px;float:left;width:47px;margin:2;padding:2;background-color:orange;color:white;text-align:center;">
				<b><c:out value="${severePolicyViolationCount}" default="no content to display"/></b>
			</td>
			<td width="47" style="border-radius: 2px; float:left;width:47px;margin:2;padding:2;background-color:#fddf77;color:white;text-align:center;">
								<b><c:out value="${moderatePolicyViolationCount}" default="no content to display"/></b>
			</td>
		</tr
		<tr>
			<td>
<c:out value="${grandfatheredPolicyViolationCount}" default="no content to display"/> grandfathered
</td>
		</tr>
	</table>
</div>
<hr/>