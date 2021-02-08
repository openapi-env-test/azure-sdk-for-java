// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.SiteSourceControlInner;
import com.azure.resourcemanager.appservice.generated.models.SiteSourceControl;
import java.util.Collections;
import java.util.Map;

public final class SiteSourceControlImpl implements SiteSourceControl {
    private SiteSourceControlInner innerObject;

    private final WebSiteManager serviceManager;

    SiteSourceControlImpl(SiteSourceControlInner innerObject, WebSiteManager serviceManager) {
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

    public String repoUrl() {
        return this.innerModel().repoUrl();
    }

    public String branch() {
        return this.innerModel().branch();
    }

    public Boolean isManualIntegration() {
        return this.innerModel().isManualIntegration();
    }

    public Boolean deploymentRollbackEnabled() {
        return this.innerModel().deploymentRollbackEnabled();
    }

    public Boolean isMercurial() {
        return this.innerModel().isMercurial();
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

    public SiteSourceControlInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
