// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineScaleSetVMExtensionsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetVMExtensionInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetVMExtensionsListResultInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMExtension;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMExtensions;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMExtensionsListResult;

public final class VirtualMachineScaleSetVMExtensionsImpl implements VirtualMachineScaleSetVMExtensions {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineScaleSetVMExtensionsImpl.class);

    private final VirtualMachineScaleSetVMExtensionsClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public VirtualMachineScaleSetVMExtensionsImpl(
        VirtualMachineScaleSetVMExtensionsClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String vmScaleSetName, String instanceId, String vmExtensionName) {
        this.serviceClient().delete(resourceGroupName, vmScaleSetName, instanceId, vmExtensionName);
    }

    public void delete(
        String resourceGroupName, String vmScaleSetName, String instanceId, String vmExtensionName, Context context) {
        this.serviceClient().delete(resourceGroupName, vmScaleSetName, instanceId, vmExtensionName, context);
    }

    public VirtualMachineScaleSetVMExtension get(
        String resourceGroupName, String vmScaleSetName, String instanceId, String vmExtensionName) {
        VirtualMachineScaleSetVMExtensionInner inner =
            this.serviceClient().get(resourceGroupName, vmScaleSetName, instanceId, vmExtensionName);
        if (inner != null) {
            return new VirtualMachineScaleSetVMExtensionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineScaleSetVMExtension> getWithResponse(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        String vmExtensionName,
        String expand,
        Context context) {
        Response<VirtualMachineScaleSetVMExtensionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, vmScaleSetName, instanceId, vmExtensionName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineScaleSetVMExtensionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualMachineScaleSetVMExtensionsListResult list(
        String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMExtensionsListResultInner inner =
            this.serviceClient().list(resourceGroupName, vmScaleSetName, instanceId);
        if (inner != null) {
            return new VirtualMachineScaleSetVMExtensionsListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineScaleSetVMExtensionsListResult> listWithResponse(
        String resourceGroupName, String vmScaleSetName, String instanceId, String expand, Context context) {
        Response<VirtualMachineScaleSetVMExtensionsListResultInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, vmScaleSetName, instanceId, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineScaleSetVMExtensionsListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualMachineScaleSetVMExtension getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmScaleSetName = Utils.getValueFromIdByName(id, "virtualMachineScaleSets");
        if (vmScaleSetName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualMachineScaleSets'.",
                                id)));
        }
        String instanceId = Utils.getValueFromIdByName(id, "virtualMachines");
        if (instanceId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        String vmExtensionName = Utils.getValueFromIdByName(id, "extensions");
        if (vmExtensionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        String localExpand = null;
        return this
            .getWithResponse(resourceGroupName, vmScaleSetName, instanceId, vmExtensionName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<VirtualMachineScaleSetVMExtension> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmScaleSetName = Utils.getValueFromIdByName(id, "virtualMachineScaleSets");
        if (vmScaleSetName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualMachineScaleSets'.",
                                id)));
        }
        String instanceId = Utils.getValueFromIdByName(id, "virtualMachines");
        if (instanceId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        String vmExtensionName = Utils.getValueFromIdByName(id, "extensions");
        if (vmExtensionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, vmScaleSetName, instanceId, vmExtensionName, expand, context);
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
        String vmScaleSetName = Utils.getValueFromIdByName(id, "virtualMachineScaleSets");
        if (vmScaleSetName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualMachineScaleSets'.",
                                id)));
        }
        String instanceId = Utils.getValueFromIdByName(id, "virtualMachines");
        if (instanceId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        String vmExtensionName = Utils.getValueFromIdByName(id, "extensions");
        if (vmExtensionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        this.delete(resourceGroupName, vmScaleSetName, instanceId, vmExtensionName, Context.NONE);
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
        String vmScaleSetName = Utils.getValueFromIdByName(id, "virtualMachineScaleSets");
        if (vmScaleSetName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualMachineScaleSets'.",
                                id)));
        }
        String instanceId = Utils.getValueFromIdByName(id, "virtualMachines");
        if (instanceId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        String vmExtensionName = Utils.getValueFromIdByName(id, "extensions");
        if (vmExtensionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        this.delete(resourceGroupName, vmScaleSetName, instanceId, vmExtensionName, context);
    }

    private VirtualMachineScaleSetVMExtensionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    public VirtualMachineScaleSetVMExtensionImpl define(String name) {
        return new VirtualMachineScaleSetVMExtensionImpl(name, this.manager());
    }
}
