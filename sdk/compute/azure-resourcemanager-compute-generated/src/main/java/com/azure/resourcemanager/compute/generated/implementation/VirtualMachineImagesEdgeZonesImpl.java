// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineImagesEdgeZonesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineImageInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineImageResourceInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineImage;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineImageResource;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineImagesEdgeZones;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class VirtualMachineImagesEdgeZonesImpl implements VirtualMachineImagesEdgeZones {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineImagesEdgeZonesImpl.class);

    private final VirtualMachineImagesEdgeZonesClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public VirtualMachineImagesEdgeZonesImpl(
        VirtualMachineImagesEdgeZonesClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public VirtualMachineImage get(
        String location, String edgeZone, String publisherName, String offer, String skus, String version) {
        VirtualMachineImageInner inner =
            this.serviceClient().get(location, edgeZone, publisherName, offer, skus, version);
        if (inner != null) {
            return new VirtualMachineImageImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineImage> getWithResponse(
        String location,
        String edgeZone,
        String publisherName,
        String offer,
        String skus,
        String version,
        Context context) {
        Response<VirtualMachineImageInner> inner =
            this.serviceClient().getWithResponse(location, edgeZone, publisherName, offer, skus, version, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineImageImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public List<VirtualMachineImageResource> list(
        String location, String edgeZone, String publisherName, String offer, String skus) {
        List<VirtualMachineImageResourceInner> inner =
            this.serviceClient().list(location, edgeZone, publisherName, offer, skus);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VirtualMachineImageResourceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<VirtualMachineImageResource>> listWithResponse(
        String location,
        String edgeZone,
        String publisherName,
        String offer,
        String skus,
        String expand,
        Integer top,
        String orderby,
        Context context) {
        Response<List<VirtualMachineImageResourceInner>> inner =
            this
                .serviceClient()
                .listWithResponse(location, edgeZone, publisherName, offer, skus, expand, top, orderby, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new VirtualMachineImageResourceImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public List<VirtualMachineImageResource> listOffers(String location, String edgeZone, String publisherName) {
        List<VirtualMachineImageResourceInner> inner =
            this.serviceClient().listOffers(location, edgeZone, publisherName);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VirtualMachineImageResourceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<VirtualMachineImageResource>> listOffersWithResponse(
        String location, String edgeZone, String publisherName, Context context) {
        Response<List<VirtualMachineImageResourceInner>> inner =
            this.serviceClient().listOffersWithResponse(location, edgeZone, publisherName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new VirtualMachineImageResourceImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public List<VirtualMachineImageResource> listPublishers(String location, String edgeZone) {
        List<VirtualMachineImageResourceInner> inner = this.serviceClient().listPublishers(location, edgeZone);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VirtualMachineImageResourceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<VirtualMachineImageResource>> listPublishersWithResponse(
        String location, String edgeZone, Context context) {
        Response<List<VirtualMachineImageResourceInner>> inner =
            this.serviceClient().listPublishersWithResponse(location, edgeZone, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new VirtualMachineImageResourceImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public List<VirtualMachineImageResource> listSkus(
        String location, String edgeZone, String publisherName, String offer) {
        List<VirtualMachineImageResourceInner> inner =
            this.serviceClient().listSkus(location, edgeZone, publisherName, offer);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VirtualMachineImageResourceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<VirtualMachineImageResource>> listSkusWithResponse(
        String location, String edgeZone, String publisherName, String offer, Context context) {
        Response<List<VirtualMachineImageResourceInner>> inner =
            this.serviceClient().listSkusWithResponse(location, edgeZone, publisherName, offer, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new VirtualMachineImageResourceImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    private VirtualMachineImagesEdgeZonesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
