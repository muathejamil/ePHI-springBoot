package com.example.ePHI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document
public class EPHI {
    @Id
    private String id;
    @Field
    private Patient patient;
    @Field
    private MedicalHistory medicalHistory;
    @Field
    private Visit visit;
    @Field
    private String chiefComplaint;
    @Field
    private String historyOfPresentIllness;
    @Field
    private PhysicalExamination physicalExamination;
    @Field
    private AssessmentAndPlan assessmentAndPlan;
    @Field
    private Medication currentIllnessMedication;
    @Field
    private String progressNotes;
    @Field
    private List<TestResult> testResults;
    @Field
    private Insurance insurance;

    public EPHI(
            String id, Patient patient,
            MedicalHistory medicalHistory,
            Visit visit, String chiefComplaint, String historyOfPresentIllness,
            PhysicalExamination physicalExamination, AssessmentAndPlan assessmentAndPlan,
            Medication currentIllnessMedication, String progressNotes, List<TestResult> testResults,
            Insurance insurance
    ) {
        this.id = id;
        this.patient = patient;
        this.medicalHistory = medicalHistory;
        this.visit = visit;
        this.chiefComplaint = chiefComplaint;
        this.historyOfPresentIllness = historyOfPresentIllness;
        this.physicalExamination = physicalExamination;
        this.assessmentAndPlan = assessmentAndPlan;
        this.currentIllnessMedication = currentIllnessMedication;
        this.progressNotes = progressNotes;
        this.testResults = testResults;
        this.insurance = insurance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public MedicalHistory getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(MedicalHistory medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    public String getHistoryOfPresentIllness() {
        return historyOfPresentIllness;
    }

    public void setHistoryOfPresentIllness(String historyOfPresentIllness) {
        this.historyOfPresentIllness = historyOfPresentIllness;
    }

    public PhysicalExamination getPhysicalExamination() {
        return physicalExamination;
    }

    public void setPhysicalExamination(PhysicalExamination physicalExamination) {
        this.physicalExamination = physicalExamination;
    }

    public AssessmentAndPlan getAssessmentAndPlan() {
        return assessmentAndPlan;
    }

    public void setAssessmentAndPlan(AssessmentAndPlan assessmentAndPlan) {
        this.assessmentAndPlan = assessmentAndPlan;
    }

    public Medication getCurrentIllnessMedication() {
        return currentIllnessMedication;
    }

    public void setCurrentIllnessMedication(Medication currentIllnessMedication) {
        this.currentIllnessMedication = currentIllnessMedication;
    }

    public String getProgressNotes() {
        return progressNotes;
    }

    public void setProgressNotes(String progressNotes) {
        progressNotes = progressNotes;
    }

    public List<TestResult> getTestResults() {
        return testResults;
    }

    public void setTestResults(List<TestResult> testResults) {
        this.testResults = testResults;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "EPHI{" +
                "id='" + id + '\'' +
                ", patient=" + patient +
                ", medicalHistory=" + medicalHistory +
                ", visit=" + visit +
                ", chiefComplaint='" + chiefComplaint + '\'' +
                ", historyOfPresentIllness='" + historyOfPresentIllness + '\'' +
                ", physicalExamination=" + physicalExamination +
                ", assessmentAndPlan=" + assessmentAndPlan +
                ", currentIllnessMedication=" + currentIllnessMedication +
                ", ProgressNotes='" + progressNotes + '\'' +
                ", testResults=" + testResults +
                ", insurance=" + insurance +
                '}';
    }
}
