// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.InstanceFailoverGroupsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.InstanceFailoverGroupInner;
import com.azure.resourcemanager.sql.generated.models.InstanceFailoverGroup;
import com.azure.resourcemanager.sql.generated.models.InstanceFailoverGroups;

public final class InstanceFailoverGroupsImpl implements InstanceFailoverGroups {
    private static final ClientLogger LOGGER = new ClientLogger(InstanceFailoverGroupsImpl.class);

    private final InstanceFailoverGroupsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public InstanceFailoverGroupsImpl(
        InstanceFailoverGroupsClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<InstanceFailoverGroup> listByLocation(String resourceGroupName, String locationName) {
        PagedIterable<InstanceFailoverGroupInner> inner =
            this.serviceClient().listByLocation(resourceGroupName, locationName);
        return Utils.mapPage(inner, inner1 -> new InstanceFailoverGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<InstanceFailoverGroup> listByLocation(
        String resourceGroupName, String locationName, Context context) {
        PagedIterable<InstanceFailoverGroupInner> inner =
            this.serviceClient().listByLocation(resourceGroupName, locationName, context);
        return Utils.mapPage(inner, inner1 -> new InstanceFailoverGroupImpl(inner1, this.manager()));
    }

    public Response<InstanceFailoverGroup> getWithResponse(
        String resourceGroupName, String locationName, String failoverGroupName, Context context) {
        Response<InstanceFailoverGroupInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, locationName, failoverGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new InstanceFailoverGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public InstanceFailoverGroup get(String resourceGroupName, String locationName, String failoverGroupName) {
        InstanceFailoverGroupInner inner = this.serviceClient().get(resourceGroupName, locationName, failoverGroupName);
        if (inner != null) {
            return new InstanceFailoverGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String locationName, String failoverGroupName) {
        this.serviceClient().delete(resourceGroupName, locationName, failoverGroupName);
    }

    public void delete(String resourceGroupName, String locationName, String failoverGroupName, Context context) {
        this.serviceClient().delete(resourceGroupName, locationName, failoverGroupName, context);
    }

    public InstanceFailoverGroup failover(String resourceGroupName, String locationName, String failoverGroupName) {
        InstanceFailoverGroupInner inner =
            this.serviceClient().failover(resourceGroupName, locationName, failoverGroupName);
        if (inner != null) {
            return new InstanceFailoverGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public InstanceFailoverGroup failover(
        String resourceGroupName, String locationName, String failoverGroupName, Context context) {
        InstanceFailoverGroupInner inner =
            this.serviceClient().failover(resourceGroupName, locationName, failoverGroupName, context);
        if (inner != null) {
            return new InstanceFailoverGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public InstanceFailoverGroup forceFailoverAllowDataLoss(
        String resourceGroupName, String locationName, String failoverGroupName) {
        InstanceFailoverGroupInner inner =
            this.serviceClient().forceFailoverAllowDataLoss(resourceGroupName, locationName, failoverGroupName);
        if (inner != null) {
            return new InstanceFailoverGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public InstanceFailoverGroup forceFailoverAllowDataLoss(
        String resourceGroupName, String locationName, String failoverGroupName, Context context) {
        InstanceFailoverGroupInner inner =
            this
                .serviceClient()
                .forceFailoverAllowDataLoss(resourceGroupName, locationName, failoverGroupName, context);
        if (inner != null) {
            return new InstanceFailoverGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public InstanceFailoverGroup getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String locationName = Utils.getValueFromIdByName(id, "locations");
        if (locationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'locations'.", id)));
        }
        String failoverGroupName = Utils.getValueFromIdByName(id, "instanceFailoverGroups");
        if (failoverGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'instanceFailoverGroups'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, locationName, failoverGroupName, Context.NONE).getValue();
    }

    public Response<InstanceFailoverGroup> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String locationName = Utils.getValueFromIdByName(id, "locations");
        if (locationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'locations'.", id)));
        }
        String failoverGroupName = Utils.getValueFromIdByName(id, "instanceFailoverGroups");
        if (failoverGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'instanceFailoverGroups'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, locationName, failoverGroupName, context);
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
        String locationName = Utils.getValueFromIdByName(id, "locations");
        if (locationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'locations'.", id)));
        }
        String failoverGroupName = Utils.getValueFromIdByName(id, "instanceFailoverGroups");
        if (failoverGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'instanceFailoverGroups'.",
                                id)));
        }
        this.delete(resourceGroupName, locationName, failoverGroupName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String locationName = Utils.getValueFromIdByName(id, "locations");
        if (locationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'locations'.", id)));
        }
        String failoverGroupName = Utils.getValueFromIdByName(id, "instanceFailoverGroups");
        if (failoverGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'instanceFailoverGroups'.",
                                id)));
        }
        this.delete(resourceGroupName, locationName, failoverGroupName, context);
    }

    private InstanceFailoverGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public InstanceFailoverGroupImpl define(String name) {
        return new InstanceFailoverGroupImpl(name, this.manager());
    }
}
