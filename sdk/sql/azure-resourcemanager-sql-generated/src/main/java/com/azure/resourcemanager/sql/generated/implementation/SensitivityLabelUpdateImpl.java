// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.SensitivityLabelInner;
import com.azure.resourcemanager.sql.generated.fluent.models.SensitivityLabelUpdateInner;
import com.azure.resourcemanager.sql.generated.models.SensitivityLabel;
import com.azure.resourcemanager.sql.generated.models.SensitivityLabelUpdate;
import com.azure.resourcemanager.sql.generated.models.SensitivityLabelUpdateKind;

public final class SensitivityLabelUpdateImpl implements SensitivityLabelUpdate {
    private SensitivityLabelUpdateInner innerObject;

    private final SqlManager serviceManager;

    SensitivityLabelUpdateImpl(SensitivityLabelUpdateInner innerObject, SqlManager serviceManager) {
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

    public SensitivityLabelUpdateKind op() {
        return this.innerModel().op();
    }

    public String schema() {
        return this.innerModel().schema();
    }

    public String table() {
        return this.innerModel().table();
    }

    public String column() {
        return this.innerModel().column();
    }

    public SensitivityLabel sensitivityLabel() {
        SensitivityLabelInner inner = this.innerModel().sensitivityLabel();
        if (inner != null) {
            return new SensitivityLabelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public SensitivityLabelUpdateInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
