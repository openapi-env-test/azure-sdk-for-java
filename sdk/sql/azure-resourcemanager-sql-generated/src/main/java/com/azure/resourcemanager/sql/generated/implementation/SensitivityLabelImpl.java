// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.SensitivityLabelInner;
import com.azure.resourcemanager.sql.generated.models.SensitivityLabel;
import com.azure.resourcemanager.sql.generated.models.SensitivityLabelRank;

public final class SensitivityLabelImpl
    implements SensitivityLabel, SensitivityLabel.Definition, SensitivityLabel.Update {
    private SensitivityLabelInner innerObject;

    private final SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String labelName() {
        return this.innerModel().labelName();
    }

    public String labelId() {
        return this.innerModel().labelId();
    }

    public String informationType() {
        return this.innerModel().informationType();
    }

    public String informationTypeId() {
        return this.innerModel().informationTypeId();
    }

    public Boolean isDisabled() {
        return this.innerModel().isDisabled();
    }

    public SensitivityLabelRank rank() {
        return this.innerModel().rank();
    }

    public SensitivityLabelInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String databaseName;

    private String schemaName;

    private String tableName;

    private String columnName;

    public SensitivityLabelImpl withExistingColumn(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.databaseName = databaseName;
        this.schemaName = schemaName;
        this.tableName = tableName;
        this.columnName = columnName;
        return this;
    }

    public SensitivityLabel create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSensitivityLabels()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    serverName,
                    databaseName,
                    schemaName,
                    tableName,
                    columnName,
                    this.innerModel(),
                    Context.NONE)
                .getValue();
        return this;
    }

    public SensitivityLabel create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSensitivityLabels()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    serverName,
                    databaseName,
                    schemaName,
                    tableName,
                    columnName,
                    this.innerModel(),
                    context)
                .getValue();
        return this;
    }

    SensitivityLabelImpl(SqlManager serviceManager) {
        this.innerObject = new SensitivityLabelInner();
        this.serviceManager = serviceManager;
    }

    public SensitivityLabelImpl update() {
        return this;
    }

    public SensitivityLabel apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSensitivityLabels()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    serverName,
                    databaseName,
                    schemaName,
                    tableName,
                    columnName,
                    this.innerModel(),
                    Context.NONE)
                .getValue();
        return this;
    }

    public SensitivityLabel apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSensitivityLabels()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    serverName,
                    databaseName,
                    schemaName,
                    tableName,
                    columnName,
                    this.innerModel(),
                    context)
                .getValue();
        return this;
    }

    SensitivityLabelImpl(SensitivityLabelInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
        this.schemaName = Utils.getValueFromIdByName(innerObject.id(), "schemas");
        this.tableName = Utils.getValueFromIdByName(innerObject.id(), "tables");
        this.columnName = Utils.getValueFromIdByName(innerObject.id(), "columns");
    }

    public SensitivityLabelImpl withLabelName(String labelName) {
        this.innerModel().withLabelName(labelName);
        return this;
    }

    public SensitivityLabelImpl withLabelId(String labelId) {
        this.innerModel().withLabelId(labelId);
        return this;
    }

    public SensitivityLabelImpl withInformationType(String informationType) {
        this.innerModel().withInformationType(informationType);
        return this;
    }

    public SensitivityLabelImpl withInformationTypeId(String informationTypeId) {
        this.innerModel().withInformationTypeId(informationTypeId);
        return this;
    }

    public SensitivityLabelImpl withRank(SensitivityLabelRank rank) {
        this.innerModel().withRank(rank);
        return this;
    }
}
