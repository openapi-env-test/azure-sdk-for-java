// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineExtensionImagesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionImageInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtensionImage;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtensionImages;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class VirtualMachineExtensionImagesImpl implements VirtualMachineExtensionImages {
    private final VirtualMachineExtensionImagesClient innerClient;

    private final ComputeManager serviceManager;

    public VirtualMachineExtensionImagesImpl(
        VirtualMachineExtensionImagesClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public VirtualMachineExtensionImage get(String location, String publisherName, String type, String version) {
        VirtualMachineExtensionImageInner inner = this.serviceClient().get(location, publisherName, type, version);
        if (inner != null) {
            return new VirtualMachineExtensionImageImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineExtensionImage> getWithResponse(
        String location, String publisherName, String type, String version, Context context) {
        Response<VirtualMachineExtensionImageInner> inner =
            this.serviceClient().getWithResponse(location, publisherName, type, version, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineExtensionImageImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public List<VirtualMachineExtensionImage> listTypes(String location, String publisherName) {
        List<VirtualMachineExtensionImageInner> inner = this.serviceClient().listTypes(location, publisherName);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VirtualMachineExtensionImageImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public Response<List<VirtualMachineExtensionImage>> listTypesWithResponse(
        String location, String publisherName, Context context) {
        Response<List<VirtualMachineExtensionImageInner>> inner =
            this.serviceClient().listTypesWithResponse(location, publisherName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new VirtualMachineExtensionImageImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public List<VirtualMachineExtensionImage> listVersions(String location, String publisherName, String type) {
        List<VirtualMachineExtensionImageInner> inner =
            this.serviceClient().listVersions(location, publisherName, type);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VirtualMachineExtensionImageImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public Response<List<VirtualMachineExtensionImage>> listVersionsWithResponse(
        String location,
        String publisherName,
        String type,
        String filter,
        Integer top,
        String orderby,
        Context context) {
        Response<List<VirtualMachineExtensionImageInner>> inner =
            this.serviceClient().listVersionsWithResponse(location, publisherName, type, filter, top, orderby, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new VirtualMachineExtensionImageImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    private VirtualMachineExtensionImagesClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
