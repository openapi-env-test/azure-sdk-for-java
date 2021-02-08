// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.FrontendIpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.PublicIpAddressInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.models.FrontendIpConfiguration;
import com.azure.resourcemanager.network.generated.models.IpAllocationMethod;
import com.azure.resourcemanager.network.generated.models.PublicIpAddress;
import com.azure.resourcemanager.network.generated.models.Subnet;
import java.util.Collections;
import java.util.List;

public final class FrontendIpConfigurationImpl implements FrontendIpConfiguration {
    private FrontendIpConfigurationInner innerObject;

    private final NetworkManager serviceManager;

    FrontendIpConfigurationImpl(FrontendIpConfigurationInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> inboundNatRules() {
        List<SubResource> inner = this.innerModel().inboundNatRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> inboundNatPools() {
        List<SubResource> inner = this.innerModel().inboundNatPools();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> outboundRules() {
        List<SubResource> inner = this.innerModel().outboundRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> loadBalancingRules() {
        List<SubResource> inner = this.innerModel().loadBalancingRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String privateIpAddress() {
        return this.innerModel().privateIpAddress();
    }

    public IpAllocationMethod privateIpAllocationMethod() {
        return this.innerModel().privateIpAllocationMethod();
    }

    public Subnet subnet() {
        SubnetInner inner = this.innerModel().subnet();
        if (inner != null) {
            return new SubnetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PublicIpAddress publicIpAddress() {
        PublicIpAddressInner inner = this.innerModel().publicIpAddress();
        if (inner != null) {
            return new PublicIpAddressImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public SubResource publicIpPrefix() {
        return this.innerModel().publicIpPrefix();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public FrontendIpConfigurationInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
