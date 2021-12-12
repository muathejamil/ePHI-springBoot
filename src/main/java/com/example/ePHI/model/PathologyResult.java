package com.example.ePHI.model;

import java.util.Date;
import java.util.List;

public class PathologyResult extends TestResult {
    private String pathologyResult;

    public PathologyResult(
            String id, String testName,
            Date testDate, String testResult,
            String labName, List<String> testAttachments, String pathologyResult
    ) {
        super(id, testName, testDate, testResult, labName, testAttachments);
        this.pathologyResult = pathologyResult;
    }

    public String getPathologyResult() {
        return pathologyResult;
    }

    public void setPathologyResult(String pathologyResult) {
        this.pathologyResult = pathologyResult;
    }

    @Override
    public String toString() {
        return "PathologyResult{" +
                "pathologyResult='" + pathologyResult + '\'' +
                '}';
    }
}
