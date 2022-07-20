// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.RecoverableManagedDatabaseInner;

/** An instance of this class provides access to all the operations defined in RecoverableManagedDatabasesClient. */
public interface RecoverableManagedDatabasesClient {
    /**
     * Gets a list of recoverable managed databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recoverable managed databases as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecoverableManagedDatabaseInner> listByInstance(String resourceGroupName, String managedInstanceName);

    /**
     * Gets a list of recoverable managed databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recoverable managed databases as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecoverableManagedDatabaseInner> listByInstance(
        String resourceGroupName, String managedInstanceName, Context context);

    /**
     * Gets a recoverable managed database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param recoverableDatabaseName The recoverableDatabaseName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recoverable managed database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RecoverableManagedDatabaseInner get(
        String resourceGroupName, String managedInstanceName, String recoverableDatabaseName);

    /**
     * Gets a recoverable managed database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param recoverableDatabaseName The recoverableDatabaseName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recoverable managed database along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RecoverableManagedDatabaseInner> getWithResponse(
        String resourceGroupName, String managedInstanceName, String recoverableDatabaseName, Context context);
}
