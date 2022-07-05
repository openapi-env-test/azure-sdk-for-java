// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dataprotection.fluent.RecoveryPointsClient;
import com.azure.resourcemanager.dataprotection.fluent.models.AzureBackupRecoveryPointResourceInner;
import com.azure.resourcemanager.dataprotection.models.AzureBackupRecoveryPointResource;
import com.azure.resourcemanager.dataprotection.models.RecoveryPoints;

public final class RecoveryPointsImpl implements RecoveryPoints {
    private static final ClientLogger LOGGER = new ClientLogger(RecoveryPointsImpl.class);

    private final RecoveryPointsClient innerClient;

    private final com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager;

    public RecoveryPointsImpl(
        RecoveryPointsClient innerClient,
        com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AzureBackupRecoveryPointResource> list(
        String resourceGroupName, String vaultName, String backupInstanceName) {
        PagedIterable<AzureBackupRecoveryPointResourceInner> inner =
            this.serviceClient().list(resourceGroupName, vaultName, backupInstanceName);
        return Utils.mapPage(inner, inner1 -> new AzureBackupRecoveryPointResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureBackupRecoveryPointResource> list(
        String resourceGroupName,
        String vaultName,
        String backupInstanceName,
        String filter,
        String skipToken,
        Context context) {
        PagedIterable<AzureBackupRecoveryPointResourceInner> inner =
            this.serviceClient().list(resourceGroupName, vaultName, backupInstanceName, filter, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new AzureBackupRecoveryPointResourceImpl(inner1, this.manager()));
    }

    public AzureBackupRecoveryPointResource get(
        String resourceGroupName, String vaultName, String backupInstanceName, String recoveryPointId) {
        AzureBackupRecoveryPointResourceInner inner =
            this.serviceClient().get(resourceGroupName, vaultName, backupInstanceName, recoveryPointId);
        if (inner != null) {
            return new AzureBackupRecoveryPointResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AzureBackupRecoveryPointResource> getWithResponse(
        String resourceGroupName,
        String vaultName,
        String backupInstanceName,
        String recoveryPointId,
        Context context) {
        Response<AzureBackupRecoveryPointResourceInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, vaultName, backupInstanceName, recoveryPointId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AzureBackupRecoveryPointResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private RecoveryPointsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.dataprotection.DataProtectionManager manager() {
        return this.serviceManager;
    }
}
