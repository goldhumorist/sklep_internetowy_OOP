package com.company.Client;

public class CorporateClient extends Client{

    private String sizeOfDiscount;

    public CorporateClient(String name, String surname, String address, String sizeOfDiscount) {
        super(name, surname, address);
        this.sizeOfDiscount = sizeOfDiscount;
    }

    public CorporateClient(String sizeOfDiscount) {
        this.sizeOfDiscount = sizeOfDiscount;
    }

    public CorporateClient(String name, String surname, String address) {
        super(name, surname, address);
    }
    public CorporateClient() {
    }

    public String getSizeOfDiscount() {
        return sizeOfDiscount;
    }

    public void setSizeOfDiscount(String sizeOfDiscount) {
        this.sizeOfDiscount = sizeOfDiscount;
    }
}
