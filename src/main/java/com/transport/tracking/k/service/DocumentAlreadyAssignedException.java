package com.transport.tracking.k.service;


public class DocumentAlreadyAssignedException extends RuntimeException {
    private final String docnum;
    private final String existingTripCode;

    public DocumentAlreadyAssignedException(String docnum, String existingTripCode) {
        super("Document already assigned to another trip: " + docnum + " (trip " + existingTripCode + ")");
        this.docnum = docnum;
        this.existingTripCode = existingTripCode;
    }

    public String getDocnum() { return docnum; }
    public String getExistingTripCode() { return existingTripCode; }
}