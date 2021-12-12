package com.example.ePHI.model;

import java.util.List;

public class SurgicalHistory extends MedicalHistory{
    private List<OperationDates> operationDates;
    private List<Report> reports;

    public SurgicalHistory(
            String id, Habits habits,
            List<Medication> medications,
            List<OperationDates> operationDates,
            List<Report> reports) {
        super(id, habits, medications);
        this.operationDates = operationDates;
        this.reports = reports;
    }

    public List<OperationDates> getOperationDates() {
        return operationDates;
    }

    public void setOperationDates(List<OperationDates> operationDates) {
        this.operationDates = operationDates;
    }

    public List<Report> getReports() {
        return reports;
    }

    public void setReports(List<Report> reports) {
        this.reports = reports;
    }

    @Override
    public String toString() {
        return "SurgicalHistory{" +
                "operationDates=" + operationDates +
                ", reports=" + reports +
                '}';
    }
}
