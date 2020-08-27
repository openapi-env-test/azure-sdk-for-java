/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2019_08_09_preview;

import com.microsoft.azure.management.avs.v20190809preview.models.ApiErrorException;
import com.microsoft.azure.management.avs.v20190809preview.models.VMWareDatastoreBacking;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in VMWareDatastoreBackings.
 */
public interface VMWareDatastoreBackings {
    /**
     * Create a datastore backing for the private cloud.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription
     * @param privateCloudName Name of the private cloud
     * @param clusterName Name of the cluster in the private cloud
     * @param vmwareDatastoreBackingName Name of the datastore backing (eg. remote NFS/iSCSI volumes) which is used for datastores in the private cloud
     * @param backingType The type or protocol of the datastore backing, like NFSv3 or iSCSI
     * @param readBlockSize Block size for data read
     * @param writeBlockSize Block size for data write
     * @param storageIP IP address of device hosting storage
     * @param storageFilePath A unique file path for the volume. Used when creating mount targets
     * @param storageVolumeName Volume name of remote storage
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ApiErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VMWareDatastoreBacking object if successful.
     */
    VMWareDatastoreBacking create(String resourceGroupName, String privateCloudName, String clusterName, String vmwareDatastoreBackingName, String backingType, long readBlockSize, long writeBlockSize, String storageIP, String storageFilePath, String storageVolumeName);

    /**
     * Create a datastore backing for the private cloud.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription
     * @param privateCloudName Name of the private cloud
     * @param clusterName Name of the cluster in the private cloud
     * @param vmwareDatastoreBackingName Name of the datastore backing (eg. remote NFS/iSCSI volumes) which is used for datastores in the private cloud
     * @param backingType The type or protocol of the datastore backing, like NFSv3 or iSCSI
     * @param readBlockSize Block size for data read
     * @param writeBlockSize Block size for data write
     * @param storageIP IP address of device hosting storage
     * @param storageFilePath A unique file path for the volume. Used when creating mount targets
     * @param storageVolumeName Volume name of remote storage
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VMWareDatastoreBacking> createAsync(String resourceGroupName, String privateCloudName, String clusterName, String vmwareDatastoreBackingName, String backingType, long readBlockSize, long writeBlockSize, String storageIP, String storageFilePath, String storageVolumeName, final ServiceCallback<VMWareDatastoreBacking> serviceCallback);

    /**
     * Create a datastore backing for the private cloud.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription
     * @param privateCloudName Name of the private cloud
     * @param clusterName Name of the cluster in the private cloud
     * @param vmwareDatastoreBackingName Name of the datastore backing (eg. remote NFS/iSCSI volumes) which is used for datastores in the private cloud
     * @param backingType The type or protocol of the datastore backing, like NFSv3 or iSCSI
     * @param readBlockSize Block size for data read
     * @param writeBlockSize Block size for data write
     * @param storageIP IP address of device hosting storage
     * @param storageFilePath A unique file path for the volume. Used when creating mount targets
     * @param storageVolumeName Volume name of remote storage
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VMWareDatastoreBacking object
     */
    Observable<VMWareDatastoreBacking> createAsync(String resourceGroupName, String privateCloudName, String clusterName, String vmwareDatastoreBackingName, String backingType, long readBlockSize, long writeBlockSize, String storageIP, String storageFilePath, String storageVolumeName);

    /**
     * Create a datastore backing for the private cloud.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription
     * @param privateCloudName Name of the private cloud
     * @param clusterName Name of the cluster in the private cloud
     * @param vmwareDatastoreBackingName Name of the datastore backing (eg. remote NFS/iSCSI volumes) which is used for datastores in the private cloud
     * @param backingType The type or protocol of the datastore backing, like NFSv3 or iSCSI
     * @param readBlockSize Block size for data read
     * @param writeBlockSize Block size for data write
     * @param storageIP IP address of device hosting storage
     * @param storageFilePath A unique file path for the volume. Used when creating mount targets
     * @param storageVolumeName Volume name of remote storage
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VMWareDatastoreBacking object
     */
    Observable<ServiceResponse<VMWareDatastoreBacking>> createWithServiceResponseAsync(String resourceGroupName, String privateCloudName, String clusterName, String vmwareDatastoreBackingName, String backingType, long readBlockSize, long writeBlockSize, String storageIP, String storageFilePath, String storageVolumeName);

    /**
     * Create a datastore backing for the private cloud.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription
     * @param privateCloudName Name of the private cloud
     * @param clusterName Name of the cluster in the private cloud
     * @param vmwareDatastoreBackingName Name of the datastore backing (eg. remote NFS/iSCSI volumes) which is used for datastores in the private cloud
     * @param backingType The type or protocol of the datastore backing, like NFSv3 or iSCSI
     * @param readBlockSize Block size for data read
     * @param writeBlockSize Block size for data write
     * @param storageIP IP address of device hosting storage
     * @param storageFilePath A unique file path for the volume. Used when creating mount targets
     * @param storageVolumeName Volume name of remote storage
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ApiErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VMWareDatastoreBacking object if successful.
     */
    VMWareDatastoreBacking beginCreate(String resourceGroupName, String privateCloudName, String clusterName, String vmwareDatastoreBackingName, String backingType, long readBlockSize, long writeBlockSize, String storageIP, String storageFilePath, String storageVolumeName);

    /**
     * Create a datastore backing for the private cloud.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription
     * @param privateCloudName Name of the private cloud
     * @param clusterName Name of the cluster in the private cloud
     * @param vmwareDatastoreBackingName Name of the datastore backing (eg. remote NFS/iSCSI volumes) which is used for datastores in the private cloud
     * @param backingType The type or protocol of the datastore backing, like NFSv3 or iSCSI
     * @param readBlockSize Block size for data read
     * @param writeBlockSize Block size for data write
     * @param storageIP IP address of device hosting storage
     * @param storageFilePath A unique file path for the volume. Used when creating mount targets
     * @param storageVolumeName Volume name of remote storage
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VMWareDatastoreBacking> beginCreateAsync(String resourceGroupName, String privateCloudName, String clusterName, String vmwareDatastoreBackingName, String backingType, long readBlockSize, long writeBlockSize, String storageIP, String storageFilePath, String storageVolumeName, final ServiceCallback<VMWareDatastoreBacking> serviceCallback);

    /**
     * Create a datastore backing for the private cloud.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription
     * @param privateCloudName Name of the private cloud
     * @param clusterName Name of the cluster in the private cloud
     * @param vmwareDatastoreBackingName Name of the datastore backing (eg. remote NFS/iSCSI volumes) which is used for datastores in the private cloud
     * @param backingType The type or protocol of the datastore backing, like NFSv3 or iSCSI
     * @param readBlockSize Block size for data read
     * @param writeBlockSize Block size for data write
     * @param storageIP IP address of device hosting storage
     * @param storageFilePath A unique file path for the volume. Used when creating mount targets
     * @param storageVolumeName Volume name of remote storage
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VMWareDatastoreBacking object
     */
    Observable<VMWareDatastoreBacking> beginCreateAsync(String resourceGroupName, String privateCloudName, String clusterName, String vmwareDatastoreBackingName, String backingType, long readBlockSize, long writeBlockSize, String storageIP, String storageFilePath, String storageVolumeName);

    /**
     * Create a datastore backing for the private cloud.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription
     * @param privateCloudName Name of the private cloud
     * @param clusterName Name of the cluster in the private cloud
     * @param vmwareDatastoreBackingName Name of the datastore backing (eg. remote NFS/iSCSI volumes) which is used for datastores in the private cloud
     * @param backingType The type or protocol of the datastore backing, like NFSv3 or iSCSI
     * @param readBlockSize Block size for data read
     * @param writeBlockSize Block size for data write
     * @param storageIP IP address of device hosting storage
     * @param storageFilePath A unique file path for the volume. Used when creating mount targets
     * @param storageVolumeName Volume name of remote storage
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VMWareDatastoreBacking object
     */
    Observable<ServiceResponse<VMWareDatastoreBacking>> beginCreateWithServiceResponseAsync(String resourceGroupName, String privateCloudName, String clusterName, String vmwareDatastoreBackingName, String backingType, long readBlockSize, long writeBlockSize, String storageIP, String storageFilePath, String storageVolumeName);

}
