// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybriddatamanager.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybriddatamanager.fluent.models.DataStoreTypeInner;

/** An instance of this class provides access to all the operations defined in DataStoreTypesClient. */
public interface DataStoreTypesClient {
    /**
     * Gets all the data store/repository types that the resource supports.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the data store/repository types that the resource supports as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataStoreTypeInner> listByDataManager(String resourceGroupName, String dataManagerName);

    /**
     * Gets all the data store/repository types that the resource supports.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the data store/repository types that the resource supports as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataStoreTypeInner> listByDataManager(
        String resourceGroupName, String dataManagerName, Context context);

    /**
     * Gets the data store/repository type given its name.
     *
     * @param dataStoreTypeName The data store/repository type name for which details are needed.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the data store/repository type given its name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataStoreTypeInner get(String dataStoreTypeName, String resourceGroupName, String dataManagerName);

    /**
     * Gets the data store/repository type given its name.
     *
     * @param dataStoreTypeName The data store/repository type name for which details are needed.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the data store/repository type given its name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataStoreTypeInner> getWithResponse(
        String dataStoreTypeName, String resourceGroupName, String dataManagerName, Context context);
}
