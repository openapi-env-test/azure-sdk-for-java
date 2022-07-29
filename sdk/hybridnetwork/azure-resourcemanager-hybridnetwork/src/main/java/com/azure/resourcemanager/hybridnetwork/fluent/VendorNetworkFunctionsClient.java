// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hybridnetwork.fluent.models.VendorNetworkFunctionInner;

/** An instance of this class provides access to all the operations defined in VendorNetworkFunctionsClient. */
public interface VendorNetworkFunctionsClient {
    /**
     * Gets information about the specified vendor network function.
     *
     * @param locationName The Azure region where the network function resource was created by the customer.
     * @param vendorName The name of the vendor.
     * @param serviceKey The GUID for the vendor network function.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified vendor network function.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VendorNetworkFunctionInner get(String locationName, String vendorName, String serviceKey);

    /**
     * Gets information about the specified vendor network function.
     *
     * @param locationName The Azure region where the network function resource was created by the customer.
     * @param vendorName The name of the vendor.
     * @param serviceKey The GUID for the vendor network function.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified vendor network function along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VendorNetworkFunctionInner> getWithResponse(
        String locationName, String vendorName, String serviceKey, Context context);

    /**
     * Creates or updates a vendor network function. This operation can take up to 6 hours to complete. This is expected
     * service behavior.
     *
     * @param locationName The Azure region where the network function resource was created by the customer.
     * @param vendorName The name of the vendor.
     * @param serviceKey The GUID for the vendor network function.
     * @param parameters Parameters supplied to the create or update vendor network function operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of vendor network function sub resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VendorNetworkFunctionInner>, VendorNetworkFunctionInner> beginCreateOrUpdate(
        String locationName, String vendorName, String serviceKey, VendorNetworkFunctionInner parameters);

    /**
     * Creates or updates a vendor network function. This operation can take up to 6 hours to complete. This is expected
     * service behavior.
     *
     * @param locationName The Azure region where the network function resource was created by the customer.
     * @param vendorName The name of the vendor.
     * @param serviceKey The GUID for the vendor network function.
     * @param parameters Parameters supplied to the create or update vendor network function operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of vendor network function sub resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VendorNetworkFunctionInner>, VendorNetworkFunctionInner> beginCreateOrUpdate(
        String locationName,
        String vendorName,
        String serviceKey,
        VendorNetworkFunctionInner parameters,
        Context context);

    /**
     * Creates or updates a vendor network function. This operation can take up to 6 hours to complete. This is expected
     * service behavior.
     *
     * @param locationName The Azure region where the network function resource was created by the customer.
     * @param vendorName The name of the vendor.
     * @param serviceKey The GUID for the vendor network function.
     * @param parameters Parameters supplied to the create or update vendor network function operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vendor network function sub resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VendorNetworkFunctionInner createOrUpdate(
        String locationName, String vendorName, String serviceKey, VendorNetworkFunctionInner parameters);

    /**
     * Creates or updates a vendor network function. This operation can take up to 6 hours to complete. This is expected
     * service behavior.
     *
     * @param locationName The Azure region where the network function resource was created by the customer.
     * @param vendorName The name of the vendor.
     * @param serviceKey The GUID for the vendor network function.
     * @param parameters Parameters supplied to the create or update vendor network function operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vendor network function sub resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VendorNetworkFunctionInner createOrUpdate(
        String locationName,
        String vendorName,
        String serviceKey,
        VendorNetworkFunctionInner parameters,
        Context context);

    /**
     * Lists all the vendor network function sub resources in an Azure region, filtered by skuType, skuName,
     * vendorProvisioningState.
     *
     * @param locationName The Azure region where the network function resource was created by the customer.
     * @param vendorName The name of the vendor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for vendors API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VendorNetworkFunctionInner> list(String locationName, String vendorName);

    /**
     * Lists all the vendor network function sub resources in an Azure region, filtered by skuType, skuName,
     * vendorProvisioningState.
     *
     * @param locationName The Azure region where the network function resource was created by the customer.
     * @param vendorName The name of the vendor.
     * @param filter The filter to apply on the operation. The properties you can use for eq (equals) are: skuType,
     *     skuName and vendorProvisioningState.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for vendors API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VendorNetworkFunctionInner> list(
        String locationName, String vendorName, String filter, Context context);
}
