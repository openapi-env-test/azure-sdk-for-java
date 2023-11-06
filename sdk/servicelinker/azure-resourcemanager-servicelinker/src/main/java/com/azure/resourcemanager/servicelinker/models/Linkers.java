// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Linkers. */
public interface Linkers {
    /**
     * list source configurations for a linker.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param linkerName The name Linker resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configurations for source resource, include appSettings, connectionString and serviceBindings along with
     *     {@link Response}.
     */
    Response<SourceConfigurationResult> listConfigurationsWithResponse(
        String resourceUri, String linkerName, Context context);

    /**
     * list source configurations for a linker.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param linkerName The name Linker resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configurations for source resource, include appSettings, connectionString and serviceBindings.
     */
    SourceConfigurationResult listConfigurations(String resourceUri, String linkerName);
}
