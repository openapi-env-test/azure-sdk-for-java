// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.resourcemanager.keyvault.generated.fluent.models.CheckMhsmNameAvailabilityResultInner;

/** An immutable client-side representation of CheckMhsmNameAvailabilityResult. */
public interface CheckMhsmNameAvailabilityResult {
    /**
     * Gets the nameAvailable property: A boolean value that indicates whether the name is available for you to use. If
     * true, the name is available. If false, the name has already been taken or is invalid and cannot be used.
     *
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * Gets the reason property: The reason that a managed hsm name could not be used. The reason element is only
     * returned if NameAvailable is false.
     *
     * @return the reason value.
     */
    Reason reason();

    /**
     * Gets the message property: An error message explaining the Reason value in more detail.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.keyvault.generated.fluent.models.CheckMhsmNameAvailabilityResultInner
     * object.
     *
     * @return the inner object.
     */
    CheckMhsmNameAvailabilityResultInner innerModel();
}
