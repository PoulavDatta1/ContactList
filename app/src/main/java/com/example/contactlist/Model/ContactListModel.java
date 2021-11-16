package com.example.contactlist.Model;

public class ContactListModel {
    private String contact_name,contact_number,contact_email,contact_type;

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getContact_type() {
        return contact_type;
    }

    public void setContact_type(String contact_type) {
        this.contact_type = contact_type;
    }

    public ContactListModel(String contact_name, String contact_number, String contact_email, String contact_type) {
        this.contact_name = contact_name;
        this.contact_number = contact_number;
        this.contact_email = contact_email;
        this.contact_type = contact_type;
    }
}
