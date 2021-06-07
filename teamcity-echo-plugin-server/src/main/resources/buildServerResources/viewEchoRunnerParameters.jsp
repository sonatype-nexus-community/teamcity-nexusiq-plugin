<%@ page import="jetbrains.teamcity.common.EchoRunnerConstants" %>
<%@ taglib prefix="props" tagdir="/WEB-INF/tags/props" %>
<c:set var="messageId" value="<%=EchoRunnerConstants.MESSAGE_KEY%>"/>
<c:set var="iqserver" value="<%=EchoRunnerConstants.IQ_SERVER_KEY%>"/>
<c:set var="username" value="<%=EchoRunnerConstants.IQ_USERNAME_KEY%>"/>
<c:set var="password" value="<%=EchoRunnerConstants.IQ_PASSWORD_KEY%>"/>
<c:set var="applicationid" value="<%=EchoRunnerConstants.IQ_APPLICATIONID_KEY%>"/>
<c:set var="stage" value="<%=EchoRunnerConstants.IQ_STAGE_KEY%>"/>
<c:set var="scantarget" value="<%=EchoRunnerConstants.IQ_SCANTARGET_KEY%>"/>


<div class="parameter">
    iqserver: <props:displayValue name="${iqserver}" emptyValue=""/>
    username: <props:displayValue name="${username}" emptyValue=""/>
    password: <props:displayValue name="${password}" emptyValue=""/>
    applicationid: <props:displayValue name="${applicationid}" emptyValue=""/>
    stage: <props:displayValue name="${stage}" emptyValue=""/>
    scantarget: <props:displayValue name="${scantarget}" emptyValue=""/>
</div>