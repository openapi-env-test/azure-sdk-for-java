// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.ResourceMetricDefinitionInner;
import com.azure.resourcemanager.appservice.generated.models.ResourceMetricAvailability;
import com.azure.resourcemanager.appservice.generated.models.ResourceMetricDefinition;
import com.azure.resourcemanager.appservice.generated.models.ResourceMetricName;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ResourceMetricDefinitionImpl implements ResourceMetricDefinition {
    private ResourceMetricDefinitionInner innerObject;

    private final WebSiteManager serviceManager;

    ResourceMetricDefinitionImpl(ResourceMetricDefinitionInner innerObject, WebSiteManager serviceManager) {
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

    public ResourceMetricName namePropertiesName() {
        return this.innerModel().namePropertiesName();
    }

    public String unit() {
        return this.innerModel().unit();
    }

    public String primaryAggregationType() {
        return this.innerModel().primaryAggregationType();
    }

    public List<ResourceMetricAvailability> metricAvailabilities() {
        List<ResourceMetricAvailability> inner = this.innerModel().metricAvailabilities();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceUri() {
        return this.innerModel().resourceUri();
    }

    public String idPropertiesId() {
        return this.innerModel().idPropertiesId();
    }

    public Map<String, String> properties() {
        Map<String, String> inner = this.innerModel().properties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ResourceMetricDefinitionInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
