// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.resourcemanager.sql.generated.fluent.models.AdvisorListResultInner;
import java.util.List;

/** An immutable client-side representation of AdvisorListResult. */
public interface AdvisorListResult {
    /**
     * Gets the value property: The list of advisors.
     *
     * @return the value value.
     */
    List<Advisor> value();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.AdvisorListResultInner object.
     *
     * @return the inner object.
     */
    AdvisorListResultInner innerModel();
}
