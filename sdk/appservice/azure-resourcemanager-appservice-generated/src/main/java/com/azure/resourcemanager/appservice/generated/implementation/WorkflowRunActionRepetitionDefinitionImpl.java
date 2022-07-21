// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.WorkflowRunActionRepetitionDefinitionInner;
import com.azure.resourcemanager.appservice.generated.models.ContentLink;
import com.azure.resourcemanager.appservice.generated.models.RepetitionIndex;
import com.azure.resourcemanager.appservice.generated.models.RetryHistory;
import com.azure.resourcemanager.appservice.generated.models.RunActionCorrelation;
import com.azure.resourcemanager.appservice.generated.models.WorkflowRunActionRepetitionDefinition;
import com.azure.resourcemanager.appservice.generated.models.WorkflowStatus;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class WorkflowRunActionRepetitionDefinitionImpl implements WorkflowRunActionRepetitionDefinition {
    private WorkflowRunActionRepetitionDefinitionInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    WorkflowRunActionRepetitionDefinitionImpl(
        WorkflowRunActionRepetitionDefinitionInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
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

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public List<RepetitionIndex> repetitionIndexes() {
        List<RepetitionIndex> inner = this.innerModel().repetitionIndexes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String trackingId() {
        return this.innerModel().trackingId();
    }

    public Object inputs() {
        return this.innerModel().inputs();
    }

    public ContentLink inputsLink() {
        return this.innerModel().inputsLink();
    }

    public Object outputs() {
        return this.innerModel().outputs();
    }

    public ContentLink outputsLink() {
        return this.innerModel().outputsLink();
    }

    public Object trackedProperties() {
        return this.innerModel().trackedProperties();
    }

    public List<RetryHistory> retryHistory() {
        List<RetryHistory> inner = this.innerModel().retryHistory();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Integer iterationCount() {
        return this.innerModel().iterationCount();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public RunActionCorrelation correlation() {
        return this.innerModel().correlation();
    }

    public WorkflowStatus status() {
        return this.innerModel().status();
    }

    public String code() {
        return this.innerModel().code();
    }

    public Object error() {
        return this.innerModel().error();
    }

    public WorkflowRunActionRepetitionDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
