<%@ page import="org.sonatype.teamcity.common.IQRunnerConstants" %>
<%@ taglib prefix="props" tagdir="/WEB-INF/tags/props" %>
<c:set var="iqserver" value="<%=IQRunnerConstants.IQ_SERVER_KEY%>"/>
<c:set var="username" value="<%=IQRunnerConstants.IQ_USERNAME_KEY%>"/>
<c:set var="applicationid" value="<%=IQRunnerConstants.IQ_APPLICATIONID_KEY%>"/>
<c:set var="stage" value="<%=IQRunnerConstants.IQ_STAGE_KEY%>"/>
<c:set var="scantarget" value="<%=IQRunnerConstants.IQ_SCANTARGET_KEY%>"/>


<div class="parameter">
    iqserver: <props:displayValue name="${iqserver}" emptyValue=""/>
    username: <props:displayValue name="${username}" emptyValue=""/>
    applicationid: <props:displayValue name="${applicationid}" emptyValue=""/>
    stage: <props:displayValue name="${stage}" emptyValue=""/>
    scantarget: <props:displayValue name="${scantarget}" emptyValue=""/>
</div>