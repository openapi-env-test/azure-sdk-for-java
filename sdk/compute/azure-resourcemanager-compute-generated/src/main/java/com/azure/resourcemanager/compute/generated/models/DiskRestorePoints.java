// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DiskRestorePoints. */
public interface DiskRestorePoints {
    /**
     * Get disk restorePoint resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs.
     * @param diskRestorePointName The name of the disk restore point created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk restorePoint resource.
     */
    DiskRestorePoint get(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName);

    /**
     * Get disk restorePoint resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs.
     * @param diskRestorePointName The name of the disk restore point created.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk restorePoint resource.
     */
    Response<DiskRestorePoint> getWithResponse(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName,
        Context context);

    /**
     * Lists diskRestorePoints under a vmRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Disk Restore Points operation response.
     */
    PagedIterable<DiskRestorePoint> listByRestorePoint(
        String resourceGroupName, String restorePointCollectionName, String vmRestorePointName);

    /**
     * Lists diskRestorePoints under a vmRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Disk Restore Points operation response.
     */
    PagedIterable<DiskRestorePoint> listByRestorePoint(
        String resourceGroupName, String restorePointCollectionName, String vmRestorePointName, Context context);

    /**
     * Grants access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs.
     * @param diskRestorePointName The name of the disk restore point created.
     * @param grantAccessData Access data object supplied in the body of the get disk access operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    AccessUri grantAccess(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName,
        GrantAccessData grantAccessData);

    /**
     * Grants access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs.
     * @param diskRestorePointName The name of the disk restore point created.
     * @param grantAccessData Access data object supplied in the body of the get disk access operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    AccessUri grantAccess(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName,
        GrantAccessData grantAccessData,
        Context context);

    /**
     * Revokes access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs.
     * @param diskRestorePointName The name of the disk restore point created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revokeAccess(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName);

    /**
     * Revokes access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs.
     * @param diskRestorePointName The name of the disk restore point created.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revokeAccess(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName,
        Context context);
}
