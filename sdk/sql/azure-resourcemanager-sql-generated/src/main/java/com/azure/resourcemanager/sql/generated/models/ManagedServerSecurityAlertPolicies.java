// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ManagedServerSecurityAlertPolicies. */
public interface ManagedServerSecurityAlertPolicies {
    /**
     * Get a managed server's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed server's threat detection policy.
     */
    ManagedServerSecurityAlertPolicy get(
        String resourceGroupName, String managedInstanceName, SecurityAlertPolicyName securityAlertPolicyName);

    /**
     * Get a managed server's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed server's threat detection policy along with {@link Response}.
     */
    Response<ManagedServerSecurityAlertPolicy> getWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        SecurityAlertPolicyName securityAlertPolicyName,
        Context context);

    /**
     * Get the managed server's threat detection policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed server's threat detection policies as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ManagedServerSecurityAlertPolicy> listByInstance(
        String resourceGroupName, String managedInstanceName);

    /**
     * Get the managed server's threat detection policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed server's threat detection policies as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ManagedServerSecurityAlertPolicy> listByInstance(
        String resourceGroupName, String managedInstanceName, Context context);

    /**
     * Get a managed server's threat detection policy.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed server's threat detection policy along with {@link Response}.
     */
    ManagedServerSecurityAlertPolicy getById(String id);

    /**
     * Get a managed server's threat detection policy.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed server's threat detection policy along with {@link Response}.
     */
    Response<ManagedServerSecurityAlertPolicy> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ManagedServerSecurityAlertPolicy resource.
     *
     * @param name resource name.
     * @return the first stage of the new ManagedServerSecurityAlertPolicy definition.
     */
    ManagedServerSecurityAlertPolicy.DefinitionStages.Blank define(SecurityAlertPolicyName name);
}
