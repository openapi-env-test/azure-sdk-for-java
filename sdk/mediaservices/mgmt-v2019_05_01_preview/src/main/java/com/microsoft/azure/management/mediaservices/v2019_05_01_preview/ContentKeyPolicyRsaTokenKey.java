/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Specifies a RSA key for token validation.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = ContentKeyPolicyRsaTokenKey.class)
@JsonTypeName("#Microsoft.Media.ContentKeyPolicyRsaTokenKey")
public class ContentKeyPolicyRsaTokenKey extends ContentKeyPolicyRestrictionTokenKey {
    /**
     * The RSA Parameter exponent.
     */
    @JsonProperty(value = "exponent", required = true)
    private byte[] exponent;

    /**
     * The RSA Parameter modulus.
     */
    @JsonProperty(value = "modulus", required = true)
    private byte[] modulus;

    /**
     * Get the RSA Parameter exponent.
     *
     * @return the exponent value
     */
    public byte[] exponent() {
        return this.exponent;
    }

    /**
     * Set the RSA Parameter exponent.
     *
     * @param exponent the exponent value to set
     * @return the ContentKeyPolicyRsaTokenKey object itself.
     */
    public ContentKeyPolicyRsaTokenKey withExponent(byte[] exponent) {
        this.exponent = exponent;
        return this;
    }

    /**
     * Get the RSA Parameter modulus.
     *
     * @return the modulus value
     */
    public byte[] modulus() {
        return this.modulus;
    }

    /**
     * Set the RSA Parameter modulus.
     *
     * @param modulus the modulus value to set
     * @return the ContentKeyPolicyRsaTokenKey object itself.
     */
    public ContentKeyPolicyRsaTokenKey withModulus(byte[] modulus) {
        this.modulus = modulus;
        return this;
    }

}
