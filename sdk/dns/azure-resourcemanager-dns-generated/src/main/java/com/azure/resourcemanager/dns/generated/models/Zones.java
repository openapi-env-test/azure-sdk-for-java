// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Zones. */
public interface Zones {
    /**
     * Deletes a DNS zone. WARNING: All DNS records in the zone will also be deleted. This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param ifMatch The etag of the DNS zone. Omit this value to always delete the current zone. Specify the last-seen
     *     etag value to prevent accidentally deleting any concurrent changes.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String zoneName, String ifMatch);

    /**
     * Deletes a DNS zone. WARNING: All DNS records in the zone will also be deleted. This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String zoneName);

    /**
     * Deletes a DNS zone. WARNING: All DNS records in the zone will also be deleted. This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param ifMatch The etag of the DNS zone. Omit this value to always delete the current zone. Specify the last-seen
     *     etag value to prevent accidentally deleting any concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String zoneName, String ifMatch, Context context);

    /**
     * Gets a DNS zone. Retrieves the zone properties, but not the record sets within the zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DNS zone.
     */
    Zone getByResourceGroup(String resourceGroupName, String zoneName);

    /**
     * Gets a DNS zone. Retrieves the zone properties, but not the record sets within the zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DNS zone.
     */
    Response<Zone> getByResourceGroupWithResponse(String resourceGroupName, String zoneName, Context context);

    /**
     * Lists the DNS zones within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a Zone List or ListAll operation.
     */
    PagedIterable<Zone> listByResourceGroup(String resourceGroupName);

    /**
     * Lists the DNS zones within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param top The maximum number of record sets to return. If not specified, returns up to 100 record sets.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a Zone List or ListAll operation.
     */
    PagedIterable<Zone> listByResourceGroup(String resourceGroupName, Integer top, Context context);

    /**
     * Lists the DNS zones in all resource groups in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a Zone List or ListAll operation.
     */
    PagedIterable<Zone> list();

    /**
     * Lists the DNS zones in all resource groups in a subscription.
     *
     * @param top The maximum number of DNS zones to return. If not specified, returns up to 100 zones.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a Zone List or ListAll operation.
     */
    PagedIterable<Zone> list(Integer top, Context context);

    /**
     * Gets a DNS zone. Retrieves the zone properties, but not the record sets within the zone.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DNS zone.
     */
    Zone getById(String id);

    /**
     * Gets a DNS zone. Retrieves the zone properties, but not the record sets within the zone.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DNS zone.
     */
    Response<Zone> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a DNS zone. WARNING: All DNS records in the zone will also be deleted. This operation cannot be undone.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a DNS zone. WARNING: All DNS records in the zone will also be deleted. This operation cannot be undone.
     *
     * @param id the resource ID.
     * @param ifMatch The etag of the DNS zone. Omit this value to always delete the current zone. Specify the last-seen
     *     etag value to prevent accidentally deleting any concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, String ifMatch, Context context);

    /**
     * Begins definition for a new Zone resource.
     *
     * @param name resource name.
     * @return the first stage of the new Zone definition.
     */
    Zone.DefinitionStages.Blank define(String name);
}
