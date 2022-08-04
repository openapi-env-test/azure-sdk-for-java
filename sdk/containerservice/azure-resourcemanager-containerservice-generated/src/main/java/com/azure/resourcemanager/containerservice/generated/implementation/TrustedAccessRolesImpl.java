// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.generated.fluent.TrustedAccessRolesClient;
import com.azure.resourcemanager.containerservice.generated.fluent.models.TrustedAccessRoleInner;
import com.azure.resourcemanager.containerservice.generated.models.TrustedAccessRole;
import com.azure.resourcemanager.containerservice.generated.models.TrustedAccessRoles;

public final class TrustedAccessRolesImpl implements TrustedAccessRoles {
    private static final ClientLogger LOGGER = new ClientLogger(TrustedAccessRolesImpl.class);

    private final TrustedAccessRolesClient innerClient;

    private final com.azure.resourcemanager.containerservice.generated.ContainerServiceManager serviceManager;

    public TrustedAccessRolesImpl(
        TrustedAccessRolesClient innerClient,
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<TrustedAccessRole> list(String location) {
        PagedIterable<TrustedAccessRoleInner> inner = this.serviceClient().list(location);
        return Utils.mapPage(inner, inner1 -> new TrustedAccessRoleImpl(inner1, this.manager()));
    }

    public PagedIterable<TrustedAccessRole> list(String location, Context context) {
        PagedIterable<TrustedAccessRoleInner> inner = this.serviceClient().list(location, context);
        return Utils.mapPage(inner, inner1 -> new TrustedAccessRoleImpl(inner1, this.manager()));
    }

    private TrustedAccessRolesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager() {
        return this.serviceManager;
    }
}
