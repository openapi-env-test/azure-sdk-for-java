// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.implementation;

import com.azure.resourcemanager.relay.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.relay.fluent.models.PrivateLinkResourcesListResultInner;
import com.azure.resourcemanager.relay.models.PrivateLinkResource;
import com.azure.resourcemanager.relay.models.PrivateLinkResourcesListResult;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class PrivateLinkResourcesListResultImpl implements PrivateLinkResourcesListResult {
    private PrivateLinkResourcesListResultInner innerObject;

    private final com.azure.resourcemanager.relay.RelayManager serviceManager;

    PrivateLinkResourcesListResultImpl(
        PrivateLinkResourcesListResultInner innerObject, com.azure.resourcemanager.relay.RelayManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<PrivateLinkResource> value() {
        List<PrivateLinkResourceInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public PrivateLinkResourcesListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.relay.RelayManager manager() {
        return this.serviceManager;
    }
}
