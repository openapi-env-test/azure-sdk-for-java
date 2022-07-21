// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CertificateOrderContact model. */
@Fluent
public final class CertificateOrderContact {
    /*
     * The email property.
     */
    @JsonProperty(value = "email")
    private String email;

    /*
     * The nameFirst property.
     */
    @JsonProperty(value = "nameFirst")
    private String nameFirst;

    /*
     * The nameLast property.
     */
    @JsonProperty(value = "nameLast")
    private String nameLast;

    /*
     * The phone property.
     */
    @JsonProperty(value = "phone")
    private String phone;

    /**
     * Get the email property: The email property.
     *
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: The email property.
     *
     * @param email the email value to set.
     * @return the CertificateOrderContact object itself.
     */
    public CertificateOrderContact withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the nameFirst property: The nameFirst property.
     *
     * @return the nameFirst value.
     */
    public String nameFirst() {
        return this.nameFirst;
    }

    /**
     * Set the nameFirst property: The nameFirst property.
     *
     * @param nameFirst the nameFirst value to set.
     * @return the CertificateOrderContact object itself.
     */
    public CertificateOrderContact withNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
        return this;
    }

    /**
     * Get the nameLast property: The nameLast property.
     *
     * @return the nameLast value.
     */
    public String nameLast() {
        return this.nameLast;
    }

    /**
     * Set the nameLast property: The nameLast property.
     *
     * @param nameLast the nameLast value to set.
     * @return the CertificateOrderContact object itself.
     */
    public CertificateOrderContact withNameLast(String nameLast) {
        this.nameLast = nameLast;
        return this;
    }

    /**
     * Get the phone property: The phone property.
     *
     * @return the phone value.
     */
    public String phone() {
        return this.phone;
    }

    /**
     * Set the phone property: The phone property.
     *
     * @param phone the phone value to set.
     * @return the CertificateOrderContact object itself.
     */
    public CertificateOrderContact withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
