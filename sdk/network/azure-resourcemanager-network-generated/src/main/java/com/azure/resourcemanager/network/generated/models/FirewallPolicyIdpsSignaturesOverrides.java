// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.SignaturesOverridesInner;

/** Resource collection API of FirewallPolicyIdpsSignaturesOverrides. */
public interface FirewallPolicyIdpsSignaturesOverrides {
    /**
     * Will update the status of policy's signature overrides for IDPS.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will contain all properties of the object to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS.
     */
    SignaturesOverrides patch(String resourceGroupName, String firewallPolicyName, SignaturesOverridesInner parameters);

    /**
     * Will update the status of policy's signature overrides for IDPS.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will contain all properties of the object to put.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS along with {@link Response}.
     */
    Response<SignaturesOverrides> patchWithResponse(
        String resourceGroupName, String firewallPolicyName, SignaturesOverridesInner parameters, Context context);

    /**
     * Will override/create a new signature overrides for the policy's IDPS.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will contain all properties of the object to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS.
     */
    SignaturesOverrides put(String resourceGroupName, String firewallPolicyName, SignaturesOverridesInner parameters);

    /**
     * Will override/create a new signature overrides for the policy's IDPS.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will contain all properties of the object to put.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS along with {@link Response}.
     */
    Response<SignaturesOverrides> putWithResponse(
        String resourceGroupName, String firewallPolicyName, SignaturesOverridesInner parameters, Context context);

    /**
     * Returns all signatures overrides for a specific policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS.
     */
    SignaturesOverrides get(String resourceGroupName, String firewallPolicyName);

    /**
     * Returns all signatures overrides for a specific policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS along with {@link Response}.
     */
    Response<SignaturesOverrides> getWithResponse(String resourceGroupName, String firewallPolicyName, Context context);

    /**
     * Returns all signatures overrides objects for a specific policy as a list containing a single value.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an object containing an array with a single item.
     */
    SignaturesOverridesList list(String resourceGroupName, String firewallPolicyName);

    /**
     * Returns all signatures overrides objects for a specific policy as a list containing a single value.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an object containing an array with a single item along with {@link Response}.
     */
    Response<SignaturesOverridesList> listWithResponse(
        String resourceGroupName, String firewallPolicyName, Context context);
}
