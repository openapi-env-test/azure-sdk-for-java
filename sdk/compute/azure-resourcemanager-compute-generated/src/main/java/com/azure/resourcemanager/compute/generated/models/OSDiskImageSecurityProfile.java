// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains security profile for an OS disk image. */
@Fluent
public final class OSDiskImageSecurityProfile {
    /*
     * confidential VM encryption types
     */
    @JsonProperty(value = "confidentialVMEncryptionType")
    private ConfidentialVMEncryptionType confidentialVMEncryptionType;

    /*
     * secure VM disk encryption set id
     */
    @JsonProperty(value = "secureVMDiskEncryptionSetId")
    private String secureVMDiskEncryptionSetId;

    /** Creates an instance of OSDiskImageSecurityProfile class. */
    public OSDiskImageSecurityProfile() {
    }

    /**
     * Get the confidentialVMEncryptionType property: confidential VM encryption types.
     *
     * @return the confidentialVMEncryptionType value.
     */
    public ConfidentialVMEncryptionType confidentialVMEncryptionType() {
        return this.confidentialVMEncryptionType;
    }

    /**
     * Set the confidentialVMEncryptionType property: confidential VM encryption types.
     *
     * @param confidentialVMEncryptionType the confidentialVMEncryptionType value to set.
     * @return the OSDiskImageSecurityProfile object itself.
     */
    public OSDiskImageSecurityProfile withConfidentialVMEncryptionType(
        ConfidentialVMEncryptionType confidentialVMEncryptionType) {
        this.confidentialVMEncryptionType = confidentialVMEncryptionType;
        return this;
    }

    /**
     * Get the secureVMDiskEncryptionSetId property: secure VM disk encryption set id.
     *
     * @return the secureVMDiskEncryptionSetId value.
     */
    public String secureVMDiskEncryptionSetId() {
        return this.secureVMDiskEncryptionSetId;
    }

    /**
     * Set the secureVMDiskEncryptionSetId property: secure VM disk encryption set id.
     *
     * @param secureVMDiskEncryptionSetId the secureVMDiskEncryptionSetId value to set.
     * @return the OSDiskImageSecurityProfile object itself.
     */
    public OSDiskImageSecurityProfile withSecureVMDiskEncryptionSetId(String secureVMDiskEncryptionSetId) {
        this.secureVMDiskEncryptionSetId = secureVMDiskEncryptionSetId;
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
