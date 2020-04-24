/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Custom domain of app resource payload.
 */
public class CustomDomainProperties {
    /**
     * The thumbprint of bound certificate.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /**
     * The app name of domain.
     */
    @JsonProperty(value = "appName")
    private String appName;

    /**
     * The bound certificate name of domain.
     */
    @JsonProperty(value = "certName")
    private String certName;

    /**
     * Get the thumbprint of bound certificate.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint of bound certificate.
     *
     * @param thumbprint the thumbprint value to set
     * @return the CustomDomainProperties object itself.
     */
    public CustomDomainProperties withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the app name of domain.
     *
     * @return the appName value
     */
    public String appName() {
        return this.appName;
    }

    /**
     * Set the app name of domain.
     *
     * @param appName the appName value to set
     * @return the CustomDomainProperties object itself.
     */
    public CustomDomainProperties withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * Get the bound certificate name of domain.
     *
     * @return the certName value
     */
    public String certName() {
        return this.certName;
    }

    /**
     * Set the bound certificate name of domain.
     *
     * @param certName the certName value to set
     * @return the CustomDomainProperties object itself.
     */
    public CustomDomainProperties withCertName(String certName) {
        this.certName = certName;
        return this;
    }

}
