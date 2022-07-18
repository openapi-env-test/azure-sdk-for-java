// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datamigration.fluent.models.ProjectFileInner;
import com.azure.resourcemanager.datamigration.models.FileStorageInfo;
import com.azure.resourcemanager.datamigration.models.ProjectFile;
import com.azure.resourcemanager.datamigration.models.ProjectFileProperties;

public final class ProjectFileImpl implements ProjectFile, ProjectFile.Definition, ProjectFile.Update {
    private ProjectFileInner innerObject;

    private final com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public ProjectFileProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return groupName;
    }

    public ProjectFileInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datamigration.DataMigrationManager manager() {
        return this.serviceManager;
    }

    private String groupName;

    private String serviceName;

    private String projectName;

    private String fileName;

    public ProjectFileImpl withExistingProject(String groupName, String serviceName, String projectName) {
        this.groupName = groupName;
        this.serviceName = serviceName;
        this.projectName = projectName;
        return this;
    }

    public ProjectFile create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFiles()
                .createOrUpdateWithResponse(
                    groupName, serviceName, projectName, fileName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ProjectFile create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFiles()
                .createOrUpdateWithResponse(groupName, serviceName, projectName, fileName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ProjectFileImpl(String name, com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager) {
        this.innerObject = new ProjectFileInner();
        this.serviceManager = serviceManager;
        this.fileName = name;
    }

    public ProjectFileImpl update() {
        return this;
    }

    public ProjectFile apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFiles()
                .updateWithResponse(groupName, serviceName, projectName, fileName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ProjectFile apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFiles()
                .updateWithResponse(groupName, serviceName, projectName, fileName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ProjectFileImpl(
        ProjectFileInner innerObject, com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.groupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "services");
        this.projectName = Utils.getValueFromIdByName(innerObject.id(), "projects");
        this.fileName = Utils.getValueFromIdByName(innerObject.id(), "files");
    }

    public ProjectFile refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFiles()
                .getWithResponse(groupName, serviceName, projectName, fileName, Context.NONE)
                .getValue();
        return this;
    }

    public ProjectFile refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFiles()
                .getWithResponse(groupName, serviceName, projectName, fileName, context)
                .getValue();
        return this;
    }

    public FileStorageInfo read() {
        return serviceManager.files().read(groupName, serviceName, projectName, fileName);
    }

    public Response<FileStorageInfo> readWithResponse(Context context) {
        return serviceManager.files().readWithResponse(groupName, serviceName, projectName, fileName, context);
    }

    public FileStorageInfo readWrite() {
        return serviceManager.files().readWrite(groupName, serviceName, projectName, fileName);
    }

    public Response<FileStorageInfo> readWriteWithResponse(Context context) {
        return serviceManager.files().readWriteWithResponse(groupName, serviceName, projectName, fileName, context);
    }

    public ProjectFileImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public ProjectFileImpl withProperties(ProjectFileProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
