// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.DetectorDefinition;
import com.azure.resourcemanager.appservice.generated.fluent.models.DiagnosticDetectorResponseInner;
import com.azure.resourcemanager.appservice.generated.models.DetectorAbnormalTimePeriod;
import com.azure.resourcemanager.appservice.generated.models.DiagnosticDetectorResponse;
import com.azure.resourcemanager.appservice.generated.models.DiagnosticMetricSet;
import com.azure.resourcemanager.appservice.generated.models.NameValuePair;
import com.azure.resourcemanager.appservice.generated.models.ResponseMetadata;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class DiagnosticDetectorResponseImpl implements DiagnosticDetectorResponse {
    private DiagnosticDetectorResponseInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    DiagnosticDetectorResponseImpl(
        DiagnosticDetectorResponseInner innerObject,
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

    public String kind() {
        return this.innerModel().kind();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public Boolean issueDetected() {
        return this.innerModel().issueDetected();
    }

    public DetectorDefinition detectorDefinition() {
        return this.innerModel().detectorDefinition();
    }

    public List<DiagnosticMetricSet> metrics() {
        List<DiagnosticMetricSet> inner = this.innerModel().metrics();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<DetectorAbnormalTimePeriod> abnormalTimePeriods() {
        List<DetectorAbnormalTimePeriod> inner = this.innerModel().abnormalTimePeriods();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<List<NameValuePair>> data() {
        List<List<NameValuePair>> inner = this.innerModel().data();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ResponseMetadata responseMetadata() {
        return this.innerModel().responseMetadata();
    }

    public DiagnosticDetectorResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
