// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.AutoApprovedPrivateLinkServiceInner;

/** An immutable client-side representation of AutoApprovedPrivateLinkService. */
public interface AutoApprovedPrivateLinkService {
    /**
     * Gets the privateLinkService property: The id of the private link service resource.
     *
     * @return the privateLinkService value.
     */
    String privateLinkService();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.AutoApprovedPrivateLinkServiceInner
     * object.
     *
     * @return the inner object.
     */
    AutoApprovedPrivateLinkServiceInner innerModel();
}
