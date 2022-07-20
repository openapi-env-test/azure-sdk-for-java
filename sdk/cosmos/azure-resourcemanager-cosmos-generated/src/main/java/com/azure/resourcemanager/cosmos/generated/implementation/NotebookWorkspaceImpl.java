// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.NotebookWorkspaceInner;
import com.azure.resourcemanager.cosmos.generated.models.NotebookWorkspace;
import com.azure.resourcemanager.cosmos.generated.models.NotebookWorkspaceConnectionInfoResult;
import com.azure.resourcemanager.cosmos.generated.models.NotebookWorkspaceCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.generated.models.NotebookWorkspaceName;

public final class NotebookWorkspaceImpl
    implements NotebookWorkspace, NotebookWorkspace.Definition, NotebookWorkspace.Update {
    private NotebookWorkspaceInner innerObject;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String notebookServerEndpoint() {
        return this.innerModel().notebookServerEndpoint();
    }

    public String status() {
        return this.innerModel().status();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public NotebookWorkspaceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private NotebookWorkspaceName notebookWorkspaceName;

    private NotebookWorkspaceCreateUpdateParameters createNotebookCreateUpdateParameters;

    private NotebookWorkspaceCreateUpdateParameters updateNotebookCreateUpdateParameters;

    public NotebookWorkspaceImpl withExistingDatabaseAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public NotebookWorkspace create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNotebookWorkspaces()
                .createOrUpdate(
                    resourceGroupName,
                    accountName,
                    notebookWorkspaceName,
                    createNotebookCreateUpdateParameters,
                    Context.NONE);
        return this;
    }

    public NotebookWorkspace create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNotebookWorkspaces()
                .createOrUpdate(
                    resourceGroupName,
                    accountName,
                    notebookWorkspaceName,
                    createNotebookCreateUpdateParameters,
                    context);
        return this;
    }

    NotebookWorkspaceImpl(
        NotebookWorkspaceName name, com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = new NotebookWorkspaceInner();
        this.serviceManager = serviceManager;
        this.notebookWorkspaceName = name;
        this.createNotebookCreateUpdateParameters = new NotebookWorkspaceCreateUpdateParameters();
    }

    public NotebookWorkspaceImpl update() {
        this.updateNotebookCreateUpdateParameters = new NotebookWorkspaceCreateUpdateParameters();
        return this;
    }

    public NotebookWorkspace apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNotebookWorkspaces()
                .createOrUpdate(
                    resourceGroupName,
                    accountName,
                    notebookWorkspaceName,
                    updateNotebookCreateUpdateParameters,
                    Context.NONE);
        return this;
    }

    public NotebookWorkspace apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNotebookWorkspaces()
                .createOrUpdate(
                    resourceGroupName,
                    accountName,
                    notebookWorkspaceName,
                    updateNotebookCreateUpdateParameters,
                    context);
        return this;
    }

    NotebookWorkspaceImpl(
        NotebookWorkspaceInner innerObject, com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "databaseAccounts");
        this.notebookWorkspaceName =
            NotebookWorkspaceName.fromString(Utils.getValueFromIdByName(innerObject.id(), "notebookWorkspaces"));
    }

    public NotebookWorkspace refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNotebookWorkspaces()
                .getWithResponse(resourceGroupName, accountName, notebookWorkspaceName, Context.NONE)
                .getValue();
        return this;
    }

    public NotebookWorkspace refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNotebookWorkspaces()
                .getWithResponse(resourceGroupName, accountName, notebookWorkspaceName, context)
                .getValue();
        return this;
    }

    public NotebookWorkspaceConnectionInfoResult listConnectionInfo() {
        return serviceManager
            .notebookWorkspaces()
            .listConnectionInfo(resourceGroupName, accountName, notebookWorkspaceName);
    }

    public Response<NotebookWorkspaceConnectionInfoResult> listConnectionInfoWithResponse(Context context) {
        return serviceManager
            .notebookWorkspaces()
            .listConnectionInfoWithResponse(resourceGroupName, accountName, notebookWorkspaceName, context);
    }

    public void regenerateAuthToken() {
        serviceManager.notebookWorkspaces().regenerateAuthToken(resourceGroupName, accountName, notebookWorkspaceName);
    }

    public void regenerateAuthToken(Context context) {
        serviceManager
            .notebookWorkspaces()
            .regenerateAuthToken(resourceGroupName, accountName, notebookWorkspaceName, context);
    }

    public void start() {
        serviceManager.notebookWorkspaces().start(resourceGroupName, accountName, notebookWorkspaceName);
    }

    public void start(Context context) {
        serviceManager.notebookWorkspaces().start(resourceGroupName, accountName, notebookWorkspaceName, context);
    }
}
