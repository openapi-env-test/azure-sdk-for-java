// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.resourcemanager.mediaservices.generated.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.ListPathsResponseInner;
import com.azure.resourcemanager.mediaservices.generated.models.ListPathsResponse;
import com.azure.resourcemanager.mediaservices.generated.models.StreamingPath;
import java.util.Collections;
import java.util.List;

public final class ListPathsResponseImpl implements ListPathsResponse {
    private ListPathsResponseInner innerObject;

    private final MediaservicesManager serviceManager;

    public ListPathsResponseImpl(ListPathsResponseInner innerObject, MediaservicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<StreamingPath> streamingPaths() {
        List<StreamingPath> inner = this.innerModel().streamingPaths();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> downloadPaths() {
        List<String> inner = this.innerModel().downloadPaths();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ListPathsResponseInner innerModel() {
        return this.innerObject;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }
}
