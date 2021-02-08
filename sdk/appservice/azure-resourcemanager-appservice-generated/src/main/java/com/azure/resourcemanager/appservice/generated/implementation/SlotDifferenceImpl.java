// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.SlotDifferenceInner;
import com.azure.resourcemanager.appservice.generated.models.SlotDifference;

public final class SlotDifferenceImpl implements SlotDifference {
    private SlotDifferenceInner innerObject;

    private final WebSiteManager serviceManager;

    SlotDifferenceImpl(SlotDifferenceInner innerObject, WebSiteManager serviceManager) {
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

    public String level() {
        return this.innerModel().level();
    }

    public String settingType() {
        return this.innerModel().settingType();
    }

    public String diffRule() {
        return this.innerModel().diffRule();
    }

    public String settingName() {
        return this.innerModel().settingName();
    }

    public String valueInCurrentSlot() {
        return this.innerModel().valueInCurrentSlot();
    }

    public String valueInTargetSlot() {
        return this.innerModel().valueInTargetSlot();
    }

    public String description() {
        return this.innerModel().description();
    }

    public SlotDifferenceInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
