// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contact information for domain registration. If 'Domain Privacy' option is not selected then the contact information
 * will be made publicly available through the Whois directories as per ICANN requirements.
 */
@Fluent
public final class Contact {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Contact.class);

    /*
     * Mailing address
     */
    @JsonProperty(value = "addressMailing")
    private Address addressMailing;

    /*
     * Email address
     */
    @JsonProperty(value = "email")
    private String email;

    /*
     * Fax number
     */
    @JsonProperty(value = "fax")
    private String fax;

    /*
     * Job title
     */
    @JsonProperty(value = "jobTitle")
    private String jobTitle;

    /*
     * First name
     */
    @JsonProperty(value = "nameFirst")
    private String nameFirst;

    /*
     * Last name
     */
    @JsonProperty(value = "nameLast")
    private String nameLast;

    /*
     * Middle name
     */
    @JsonProperty(value = "nameMiddle")
    private String nameMiddle;

    /*
     * Organization
     */
    @JsonProperty(value = "organization")
    private String organization;

    /*
     * Phone number
     */
    @JsonProperty(value = "phone")
    private String phone;

    /**
     * Get the addressMailing property: Mailing address.
     *
     * @return the addressMailing value.
     */
    public Address addressMailing() {
        return this.addressMailing;
    }

    /**
     * Set the addressMailing property: Mailing address.
     *
     * @param addressMailing the addressMailing value to set.
     * @return the Contact object itself.
     */
    public Contact withAddressMailing(Address addressMailing) {
        this.addressMailing = addressMailing;
        return this;
    }

    /**
     * Get the email property: Email address.
     *
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: Email address.
     *
     * @param email the email value to set.
     * @return the Contact object itself.
     */
    public Contact withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the fax property: Fax number.
     *
     * @return the fax value.
     */
    public String fax() {
        return this.fax;
    }

    /**
     * Set the fax property: Fax number.
     *
     * @param fax the fax value to set.
     * @return the Contact object itself.
     */
    public Contact withFax(String fax) {
        this.fax = fax;
        return this;
    }

    /**
     * Get the jobTitle property: Job title.
     *
     * @return the jobTitle value.
     */
    public String jobTitle() {
        return this.jobTitle;
    }

    /**
     * Set the jobTitle property: Job title.
     *
     * @param jobTitle the jobTitle value to set.
     * @return the Contact object itself.
     */
    public Contact withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Get the nameFirst property: First name.
     *
     * @return the nameFirst value.
     */
    public String nameFirst() {
        return this.nameFirst;
    }

    /**
     * Set the nameFirst property: First name.
     *
     * @param nameFirst the nameFirst value to set.
     * @return the Contact object itself.
     */
    public Contact withNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
        return this;
    }

    /**
     * Get the nameLast property: Last name.
     *
     * @return the nameLast value.
     */
    public String nameLast() {
        return this.nameLast;
    }

    /**
     * Set the nameLast property: Last name.
     *
     * @param nameLast the nameLast value to set.
     * @return the Contact object itself.
     */
    public Contact withNameLast(String nameLast) {
        this.nameLast = nameLast;
        return this;
    }

    /**
     * Get the nameMiddle property: Middle name.
     *
     * @return the nameMiddle value.
     */
    public String nameMiddle() {
        return this.nameMiddle;
    }

    /**
     * Set the nameMiddle property: Middle name.
     *
     * @param nameMiddle the nameMiddle value to set.
     * @return the Contact object itself.
     */
    public Contact withNameMiddle(String nameMiddle) {
        this.nameMiddle = nameMiddle;
        return this;
    }

    /**
     * Get the organization property: Organization.
     *
     * @return the organization value.
     */
    public String organization() {
        return this.organization;
    }

    /**
     * Set the organization property: Organization.
     *
     * @param organization the organization value to set.
     * @return the Contact object itself.
     */
    public Contact withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the phone property: Phone number.
     *
     * @return the phone value.
     */
    public String phone() {
        return this.phone;
    }

    /**
     * Set the phone property: Phone number.
     *
     * @param phone the phone value to set.
     * @return the Contact object itself.
     */
    public Contact withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (addressMailing() != null) {
            addressMailing().validate();
        }
    }
}
