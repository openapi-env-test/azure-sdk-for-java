/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Properties of subscription permission to create job validation response.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "validationType", defaultImpl = SubscriptionIsAllowedToCreateJobValidationResponseProperties.class)
@JsonTypeName("ValidateSubscriptionIsAllowedToCreateJob")
public class SubscriptionIsAllowedToCreateJobValidationResponseProperties extends ValidationInputResponse {
    /**
     * Validation status of subscription permission to create job. Possible
     * values include: 'Valid', 'Invalid', 'Skipped'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ValidationStatus status;

    /**
     * Get validation status of subscription permission to create job. Possible values include: 'Valid', 'Invalid', 'Skipped'.
     *
     * @return the status value
     */
    public ValidationStatus status() {
        return this.status;
    }

}
