// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.DisasterRecoveryConfigurationsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.DisasterRecoveryConfigurationInner;
import com.azure.resourcemanager.sql.generated.models.DisasterRecoveryConfiguration;
import com.azure.resourcemanager.sql.generated.models.DisasterRecoveryConfigurations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DisasterRecoveryConfigurationsImpl implements DisasterRecoveryConfigurations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DisasterRecoveryConfigurationsImpl.class);

    private final DisasterRecoveryConfigurationsClient innerClient;

    private final SqlManager serviceManager;

    public DisasterRecoveryConfigurationsImpl(
        DisasterRecoveryConfigurationsClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DisasterRecoveryConfiguration> list(String resourceGroupName, String serverName) {
        PagedIterable<DisasterRecoveryConfigurationInner> inner =
            this.serviceClient().list(resourceGroupName, serverName);
        return inner.mapPage(inner1 -> new DisasterRecoveryConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<DisasterRecoveryConfiguration> list(
        String resourceGroupName, String serverName, Context context) {
        PagedIterable<DisasterRecoveryConfigurationInner> inner =
            this.serviceClient().list(resourceGroupName, serverName, context);
        return inner.mapPage(inner1 -> new DisasterRecoveryConfigurationImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String serverName, String disasterRecoveryConfigurationName) {
        this.serviceClient().delete(resourceGroupName, serverName, disasterRecoveryConfigurationName);
    }

    public void delete(
        String resourceGroupName, String serverName, String disasterRecoveryConfigurationName, Context context) {
        this.serviceClient().delete(resourceGroupName, serverName, disasterRecoveryConfigurationName, context);
    }

    public DisasterRecoveryConfiguration createOrUpdate(
        String resourceGroupName, String serverName, String disasterRecoveryConfigurationName) {
        DisasterRecoveryConfigurationInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, serverName, disasterRecoveryConfigurationName);
        if (inner != null) {
            return new DisasterRecoveryConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DisasterRecoveryConfiguration createOrUpdate(
        String resourceGroupName, String serverName, String disasterRecoveryConfigurationName, Context context) {
        DisasterRecoveryConfigurationInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, serverName, disasterRecoveryConfigurationName, context);
        if (inner != null) {
            return new DisasterRecoveryConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DisasterRecoveryConfiguration get(
        String resourceGroupName, String serverName, String disasterRecoveryConfigurationName) {
        DisasterRecoveryConfigurationInner inner =
            this.serviceClient().get(resourceGroupName, serverName, disasterRecoveryConfigurationName);
        if (inner != null) {
            return new DisasterRecoveryConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DisasterRecoveryConfiguration> getWithResponse(
        String resourceGroupName, String serverName, String disasterRecoveryConfigurationName, Context context) {
        Response<DisasterRecoveryConfigurationInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, serverName, disasterRecoveryConfigurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DisasterRecoveryConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void failover(String resourceGroupName, String serverName, String disasterRecoveryConfigurationName) {
        this.serviceClient().failover(resourceGroupName, serverName, disasterRecoveryConfigurationName);
    }

    public void failover(
        String resourceGroupName, String serverName, String disasterRecoveryConfigurationName, Context context) {
        this.serviceClient().failover(resourceGroupName, serverName, disasterRecoveryConfigurationName, context);
    }

    public void failoverAllowDataLoss(
        String resourceGroupName, String serverName, String disasterRecoveryConfigurationName) {
        this.serviceClient().failoverAllowDataLoss(resourceGroupName, serverName, disasterRecoveryConfigurationName);
    }

    public void failoverAllowDataLoss(
        String resourceGroupName, String serverName, String disasterRecoveryConfigurationName, Context context) {
        this
            .serviceClient()
            .failoverAllowDataLoss(resourceGroupName, serverName, disasterRecoveryConfigurationName, context);
    }

    private DisasterRecoveryConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
