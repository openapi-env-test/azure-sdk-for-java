/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines how to identify a parameter for a specific purpose e.g. expires.
 */
public class UrlSigningParamIdentifier {
    /**
     * Indicates the purpose of the parameter. Possible values include:
     * 'Expires', 'KeyId', 'Signature'.
     */
    @JsonProperty(value = "paramIndicator", required = true)
    private ParamIndicator paramIndicator;

    /**
     * Parameter name.
     */
    @JsonProperty(value = "paramName", required = true)
    private String paramName;

    /**
     * Get indicates the purpose of the parameter. Possible values include: 'Expires', 'KeyId', 'Signature'.
     *
     * @return the paramIndicator value
     */
    public ParamIndicator paramIndicator() {
        return this.paramIndicator;
    }

    /**
     * Set indicates the purpose of the parameter. Possible values include: 'Expires', 'KeyId', 'Signature'.
     *
     * @param paramIndicator the paramIndicator value to set
     * @return the UrlSigningParamIdentifier object itself.
     */
    public UrlSigningParamIdentifier withParamIndicator(ParamIndicator paramIndicator) {
        this.paramIndicator = paramIndicator;
        return this;
    }

    /**
     * Get parameter name.
     *
     * @return the paramName value
     */
    public String paramName() {
        return this.paramName;
    }

    /**
     * Set parameter name.
     *
     * @param paramName the paramName value to set
     * @return the UrlSigningParamIdentifier object itself.
     */
    public UrlSigningParamIdentifier withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }

}
