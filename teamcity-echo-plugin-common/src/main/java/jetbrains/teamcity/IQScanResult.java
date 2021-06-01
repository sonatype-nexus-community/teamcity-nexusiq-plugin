// IQScanResult.java

package jetbrains.teamcity;

public class IQScanResult {
    private String applicationID;
    private String scanID;
    private String reportHTMLURL;
    private String reportPDFURL;
    private String reportDataURL;
    private String policyAction;
    private PolicyEvaluationResult policyEvaluationResult;

    public String getApplicationID() { return applicationID; }
    public void setApplicationID(String value) { this.applicationID = value; }

    public String getScanID() { return scanID; }
    public void setScanID(String value) { this.scanID = value; }

    public String getReportHTMLURL() { return reportHTMLURL; }
    public void setReportHTMLURL(String value) { this.reportHTMLURL = value; }

    public String getReportPDFURL() { return reportPDFURL; }
    public void setReportPDFURL(String value) { this.reportPDFURL = value; }

    public String getReportDataURL() { return reportDataURL; }
    public void setReportDataURL(String value) { this.reportDataURL = value; }

    public String getPolicyAction() { return policyAction; }
    public void setPolicyAction(String value) { this.policyAction = value; }

    public PolicyEvaluationResult getPolicyEvaluationResult() { return policyEvaluationResult; }
    public void setPolicyEvaluationResult(PolicyEvaluationResult value) { this.policyEvaluationResult = value; }
}



