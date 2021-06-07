<%@ page import="org.sonatype.teamcity.common.IQRunnerConstants" %>
<%@ taglib prefix="props" tagdir="/WEB-INF/tags/props" %>
<%@ taglib prefix="l" tagdir="/WEB-INF/tags/layout" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="bs" tagdir="/WEB-INF/tags" %>
<jsp:useBean id="propertiesBean" scope="request" type="jetbrains.buildServer.controllers.BasePropertiesBean"/>
<c:set var="iqclijarfile" value="<%=IQRunnerConstants.IQ_CLIJARFILE_KEY%>"/>
<c:set var="iqserver" value="<%=IQRunnerConstants.IQ_SERVER_KEY%>"/>
<c:set var="username" value="<%=IQRunnerConstants.IQ_USERNAME_KEY%>"/>
<c:set var="password" value="<%=IQRunnerConstants.IQ_PASSWORD_KEY%>"/>
<c:set var="applicationid" value="<%=IQRunnerConstants.IQ_APPLICATIONID_KEY%>"/>
<c:set var="stage" value="<%=IQRunnerConstants.IQ_STAGE_KEY%>"/>
<c:set var="scantarget" value="<%=IQRunnerConstants.IQ_SCANTARGET_KEY%>"/>
<l:settingsGroup title="Sonatype Scanner settings">
	<tr>
		<th>
			<label for="${iqclijarfile}">IQCLI.jar path: <l:star/>
			</label>
		</th>
		<td>
			<div class="posRel">
				<props:textProperty name="${iqclijarfile}" size="56" maxlength="200"/>
				<span class="error" id="error_${iqclijarfile}"/>
			</div>
		</td>
	</tr>
	<tr>
		<th>
			<label for="${iqserver}">IQServer URL: <l:star/>
			</label>
		</th>
		<td>
			<div class="posRel">
				<props:textProperty name="${iqserver}" size="56" maxlength="100"/>
				<span class="error" id="error_${iqserver}"/>
			</div>
		</td>
	</tr>
	<tr>
		<th>
			<label for="${username}">Username: <l:star/>
			</label>
		</th>
		<td>
			<div class="posRel">
				<props:textProperty name="${username}" size="56" maxlength="100"/>
				<span class="error" id="error_${username}"/>
			</div>
		</td>
	</tr>
	<tr>
		<th>
			<label for="${password}">Password: <l:star/>
			</label>
		</th>
		<td>
			<div class="posRel">
				<props:textProperty name="${password}" size="56" maxlength="100"/>
				<span class="error" id="error_${password}"/>
			</div>
		</td>
	</tr>
	<tr>
		<th>
			<label for="${applicationid}">ApplicationId: <l:star/>
			</label>
		</th>
		<td>
			<div class="posRel">
				<props:textProperty name="${applicationid}" size="56" maxlength="100"/>
				<span class="error" id="error_${applicationid}"/>
			</div>
		</td>
	</tr>
	<tr>
		<th>
			<label for="${stage}">Stage: <l:star/>
			</label>
		</th>
		<td>
			<div class="posRel">
				<props:textProperty name="${stage}" size="56" maxlength="100"/>
				<span class="error" id="error_${stage}"/>
			</div>
		</td>
	</tr>
	<tr>
		<th>
			<label for="${scantarget}">Scan target: <l:star/>
			</label>
		</th>
		<td>
			<div class="posRel">
				<props:textProperty name="${scantarget}" size="56" maxlength="100"/>
				<span class="error" id="error_${scantarget}"/>
			</div>
		</td>
	</tr>
</l:settingsGroup>