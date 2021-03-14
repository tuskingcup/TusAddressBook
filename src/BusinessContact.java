/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CLinicIT
 */
public class BusinessContact extends Contact implements Comparable<BusinessContact> {

    private Company company;
    private String jobTitle;

    public BusinessContact(Address address, String email, String phone, ContactType type, Company company, String jobTitle) {
        super(address, email, phone, type);
        this.company = company;
        this.jobTitle = jobTitle;
    }

    public Company getCompany() {
        return company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public int compareTo(BusinessContact o) {
     
        return (this.getCompany().getName()).compareTo((o.getCompany().getName()));
    }

    @Override
    public String toString() {
        return "BusinessContact{" + "company=" + company + ", jobTitle=" + jobTitle + '}';
    }

}
