// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elasticsan.fluent.VolumesClient;
import com.azure.resourcemanager.elasticsan.fluent.models.VolumeInner;
import com.azure.resourcemanager.elasticsan.models.Volume;
import com.azure.resourcemanager.elasticsan.models.Volumes;

public final class VolumesImpl implements Volumes {
    private static final ClientLogger LOGGER = new ClientLogger(VolumesImpl.class);

    private final VolumesClient innerClient;

    private final com.azure.resourcemanager.elasticsan.ElasticSanManager serviceManager;

    public VolumesImpl(
        VolumesClient innerClient, com.azure.resourcemanager.elasticsan.ElasticSanManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(
        String resourceGroupName,
        String elasticSanName,
        String volumeGroupName,
        String volumeName,
        Boolean forceDeleteSnapshots) {
        this
            .serviceClient()
            .delete(resourceGroupName, elasticSanName, volumeGroupName, volumeName, forceDeleteSnapshots);
    }

    public void delete(String resourceGroupName, String elasticSanName, String volumeGroupName, String volumeName) {
        this.serviceClient().delete(resourceGroupName, elasticSanName, volumeGroupName, volumeName);
    }

    public void delete(
        String resourceGroupName,
        String elasticSanName,
        String volumeGroupName,
        String volumeName,
        Boolean forceDeleteSnapshots,
        Context context) {
        this
            .serviceClient()
            .delete(resourceGroupName, elasticSanName, volumeGroupName, volumeName, forceDeleteSnapshots, context);
    }

    public Volume get(String resourceGroupName, String elasticSanName, String volumeGroupName, String volumeName) {
        VolumeInner inner = this.serviceClient().get(resourceGroupName, elasticSanName, volumeGroupName, volumeName);
        if (inner != null) {
            return new VolumeImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Volume> getWithResponse(
        String resourceGroupName, String elasticSanName, String volumeGroupName, String volumeName, Context context) {
        Response<VolumeInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, elasticSanName, volumeGroupName, volumeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VolumeImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Volume> listByVolumeGroup(
        String resourceGroupName, String elasticSanName, String volumeGroupName) {
        PagedIterable<VolumeInner> inner =
            this.serviceClient().listByVolumeGroup(resourceGroupName, elasticSanName, volumeGroupName);
        return Utils.mapPage(inner, inner1 -> new VolumeImpl(inner1, this.manager()));
    }

    public PagedIterable<Volume> listByVolumeGroup(
        String resourceGroupName, String elasticSanName, String volumeGroupName, Context context) {
        PagedIterable<VolumeInner> inner =
            this.serviceClient().listByVolumeGroup(resourceGroupName, elasticSanName, volumeGroupName, context);
        return Utils.mapPage(inner, inner1 -> new VolumeImpl(inner1, this.manager()));
    }

    public Volume getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String elasticSanName = Utils.getValueFromIdByName(id, "elasticSans");
        if (elasticSanName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'elasticSans'.", id)));
        }
        String volumeGroupName = Utils.getValueFromIdByName(id, "volumegroups");
        if (volumeGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumegroups'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, elasticSanName, volumeGroupName, volumeName, Context.NONE)
            .getValue();
    }

    public Response<Volume> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String elasticSanName = Utils.getValueFromIdByName(id, "elasticSans");
        if (elasticSanName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'elasticSans'.", id)));
        }
        String volumeGroupName = Utils.getValueFromIdByName(id, "volumegroups");
        if (volumeGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumegroups'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, elasticSanName, volumeGroupName, volumeName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String elasticSanName = Utils.getValueFromIdByName(id, "elasticSans");
        if (elasticSanName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'elasticSans'.", id)));
        }
        String volumeGroupName = Utils.getValueFromIdByName(id, "volumegroups");
        if (volumeGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumegroups'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        Boolean localForceDeleteSnapshots = null;
        this
            .delete(
                resourceGroupName,
                elasticSanName,
                volumeGroupName,
                volumeName,
                localForceDeleteSnapshots,
                Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Boolean forceDeleteSnapshots, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String elasticSanName = Utils.getValueFromIdByName(id, "elasticSans");
        if (elasticSanName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'elasticSans'.", id)));
        }
        String volumeGroupName = Utils.getValueFromIdByName(id, "volumegroups");
        if (volumeGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumegroups'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        this.delete(resourceGroupName, elasticSanName, volumeGroupName, volumeName, forceDeleteSnapshots, context);
    }

    private VolumesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.elasticsan.ElasticSanManager manager() {
        return this.serviceManager;
    }

    public VolumeImpl define(String name) {
        return new VolumeImpl(name, this.manager());
    }
}
