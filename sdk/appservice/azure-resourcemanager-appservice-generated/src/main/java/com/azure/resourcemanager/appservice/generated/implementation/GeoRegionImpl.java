// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.GeoRegionInner;
import com.azure.resourcemanager.appservice.generated.models.GeoRegion;
import java.util.Collections;
import java.util.Map;

public final class GeoRegionImpl implements GeoRegion {
    private GeoRegionInner innerObject;

    private final WebSiteManager serviceManager;

    GeoRegionImpl(GeoRegionInner innerObject, WebSiteManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
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

    public String namePropertiesName() {
        return this.innerModel().namePropertiesName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String kind() {
        return this.innerModel().kind();
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

    public GeoRegionInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
