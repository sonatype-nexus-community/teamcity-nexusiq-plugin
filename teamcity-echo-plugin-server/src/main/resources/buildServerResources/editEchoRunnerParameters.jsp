<%@ page import="jetbrains.teamcity.EchoRunnerConstants" %>
<%@ taglib prefix="props" tagdir="/WEB-INF/tags/props" %>
<%@ taglib prefix="l" tagdir="/WEB-INF/tags/layout" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="bs" tagdir="/WEB-INF/tags" %>
<jsp:useBean id="propertiesBean" scope="request" type="jetbrains.buildServer.controllers.BasePropertiesBean"/>
<c:set var="messageId" value="<%=EchoRunnerConstants.MESSAGE_KEY%>"/>
<c:set var="iqserver" value="<%=EchoRunnerConstants.IQ_SERVER_KEY%>"/>
<c:set var="username" value="<%=EchoRunnerConstants.IQ_USERNAME_KEY%>"/>
<c:set var="password" value="<%=EchoRunnerConstants.IQ_PASSWORD_KEY%>"/>
<c:set var="applicationid" value="<%=EchoRunnerConstants.IQ_APPLICATIONID_KEY%>"/>
<c:set var="stage" value="<%=EchoRunnerConstants.IQ_STAGE_KEY%>"/>
<c:set var="scantarget" value="<%=EchoRunnerConstants.IQ_SCANTARGET_KEY%>"/>




<l:settingsGroup title="Sonatype Scanner settings">
    <tr>
        <th><label for="${messageId}">Metadata tag: <l:star/></label></th>
        <td>
            <div class="posRel">
                <props:textProperty name="${messageId}" size="56" maxlength="100"/>
                <span class="error" id="error_${messageId}"></span>
            </div>
        </td>
    </tr>
    <tr>
            <th><label for="${iqserver}">IQServer URL: <l:star/></label></th>
            <td>
                <div class="posRel">
                    <props:textProperty name="${iqserver}" size="56" maxlength="100"/>
                    <span class="error" id="error_${iqserver}"></span>
                </div>
            </td>
        </tr>
    <tr>
            <th><label for="${username}">Username: <l:star/></label></th>
            <td>
                <div class="posRel">
                    <props:textProperty name="${username}" size="56" maxlength="100"/>
                    <span class="error" id="error_${username}"></span>
                </div>
            </td>
        </tr>
        <tr>
                    <th><label for="${password}">Password: <l:star/></label></th>
                    <td>
                        <div class="posRel">
                            <props:textProperty name="${password}" size="56" maxlength="100" />
                            <span class="error" id="error_${password}"></span>
                        </div>
                    </td>
                </tr>
                <tr>
                            <th><label for="${applicationid}">ApplicationId: <l:star/></label></th>
                            <td>
                                <div class="posRel">
                                    <props:textProperty name="${applicationid}" size="56" maxlength="100"/>
                                    <span class="error" id="error_${applicationid}"></span>
                                </div>
                            </td>
                        </tr>

                        <tr>
                                                    <th><label for="${stage}">Stage: <l:star/></label></th>
                                                    <td>
                                                        <div class="posRel">
                                                            <props:textProperty name="${stage}" size="56" maxlength="100"/>
                                                            <span class="error" id="error_${stage}"></span>
                                                        </div>
                                                    </td>
                                                </tr>

                        <tr>
                                                    <th><label for="${scantarget}">Scan target: <l:star/></label></th>
                                                    <td>
                                                        <div class="posRel">
                                                            <props:textProperty name="${scantarget}" size="56" maxlength="100"/>
                                                            <span class="error" id="error_${scantarget}"></span>
                                                        </div>
                                                    </td>
                                                </tr>

</l:settingsGroup>