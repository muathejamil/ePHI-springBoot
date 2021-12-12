package com.example.ePHI.model;

import java.util.Date;
import java.util.List;

public class ImagingResult extends TestResult{
    private String imageUrl;

    public ImagingResult(
            String id, String testName,
            Date testDate, String testResult,
            String labName, List<String> testAttachments, String imageUrl
    ) {
        super(id, testName, testDate, testResult, labName, testAttachments);
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "ImagingResult{" +
                "imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
