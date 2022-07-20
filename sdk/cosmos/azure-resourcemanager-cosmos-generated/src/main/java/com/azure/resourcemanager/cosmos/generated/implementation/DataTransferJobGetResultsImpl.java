// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.DataTransferJobGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.DataTransferJobProperties;
import com.azure.resourcemanager.cosmos.generated.models.CreateJobRequest;
import com.azure.resourcemanager.cosmos.generated.models.DataTransferDataSourceSink;
import com.azure.resourcemanager.cosmos.generated.models.DataTransferJobGetResults;
import java.time.OffsetDateTime;

public final class DataTransferJobGetResultsImpl
    implements DataTransferJobGetResults, DataTransferJobGetResults.Definition {
    private DataTransferJobGetResultsInner innerObject;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    DataTransferJobGetResultsImpl(
        DataTransferJobGetResultsInner innerObject,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String jobName() {
        return this.innerModel().jobName();
    }

    public DataTransferDataSourceSink source() {
        return this.innerModel().source();
    }

    public DataTransferDataSourceSink destination() {
        return this.innerModel().destination();
    }

    public String status() {
        return this.innerModel().status();
    }

    public Long processedCount() {
        return this.innerModel().processedCount();
    }

    public Long totalCount() {
        return this.innerModel().totalCount();
    }

    public OffsetDateTime lastUpdatedUtcTime() {
        return this.innerModel().lastUpdatedUtcTime();
    }

    public Integer workerCount() {
        return this.innerModel().workerCount();
    }

    public ManagementError error() {
        return this.innerModel().error();
    }

    public DataTransferJobGetResultsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String jobName;

    private CreateJobRequest createJobCreateParameters;

    public DataTransferJobGetResultsImpl withExistingDatabaseAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public DataTransferJobGetResults create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataTransferJobs()
                .createWithResponse(resourceGroupName, accountName, jobName, createJobCreateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public DataTransferJobGetResults create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataTransferJobs()
                .createWithResponse(resourceGroupName, accountName, jobName, createJobCreateParameters, context)
                .getValue();
        return this;
    }

    DataTransferJobGetResultsImpl(
        String name, com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = new DataTransferJobGetResultsInner();
        this.serviceManager = serviceManager;
        this.jobName = name;
        this.createJobCreateParameters = new CreateJobRequest();
    }

    public DataTransferJobGetResults refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataTransferJobs()
                .getWithResponse(resourceGroupName, accountName, jobName, Context.NONE)
                .getValue();
        return this;
    }

    public DataTransferJobGetResults refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataTransferJobs()
                .getWithResponse(resourceGroupName, accountName, jobName, context)
                .getValue();
        return this;
    }

    public DataTransferJobGetResults pause() {
        return serviceManager.dataTransferJobs().pause(resourceGroupName, accountName, jobName);
    }

    public Response<DataTransferJobGetResults> pauseWithResponse(Context context) {
        return serviceManager.dataTransferJobs().pauseWithResponse(resourceGroupName, accountName, jobName, context);
    }

    public DataTransferJobGetResults resume() {
        return serviceManager.dataTransferJobs().resume(resourceGroupName, accountName, jobName);
    }

    public Response<DataTransferJobGetResults> resumeWithResponse(Context context) {
        return serviceManager.dataTransferJobs().resumeWithResponse(resourceGroupName, accountName, jobName, context);
    }

    public DataTransferJobGetResults cancel() {
        return serviceManager.dataTransferJobs().cancel(resourceGroupName, accountName, jobName);
    }

    public Response<DataTransferJobGetResults> cancelWithResponse(Context context) {
        return serviceManager.dataTransferJobs().cancelWithResponse(resourceGroupName, accountName, jobName, context);
    }

    public DataTransferJobGetResultsImpl withProperties(DataTransferJobProperties properties) {
        this.createJobCreateParameters.withProperties(properties);
        return this;
    }
}
