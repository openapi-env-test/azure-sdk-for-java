// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.P2SVpnServerConfigurationInner;
import com.azure.resourcemanager.network.generated.models.IpsecPolicy;
import com.azure.resourcemanager.network.generated.models.P2SVpnServerConfigRadiusClientRootCertificate;
import com.azure.resourcemanager.network.generated.models.P2SVpnServerConfigRadiusServerRootCertificate;
import com.azure.resourcemanager.network.generated.models.P2SVpnServerConfigVpnClientRevokedCertificate;
import com.azure.resourcemanager.network.generated.models.P2SVpnServerConfigVpnClientRootCertificate;
import com.azure.resourcemanager.network.generated.models.P2SVpnServerConfiguration;
import com.azure.resourcemanager.network.generated.models.VpnGatewayTunnelingProtocol;
import java.util.Collections;
import java.util.List;

public final class P2SVpnServerConfigurationImpl implements P2SVpnServerConfiguration {
    private P2SVpnServerConfigurationInner innerObject;

    private final NetworkManager serviceManager;

    P2SVpnServerConfigurationImpl(P2SVpnServerConfigurationInner innerObject, NetworkManager serviceManager) {
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

    public String namePropertiesName() {
        return this.innerModel().namePropertiesName();
    }

    public List<VpnGatewayTunnelingProtocol> vpnProtocols() {
        List<VpnGatewayTunnelingProtocol> inner = this.innerModel().vpnProtocols();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<P2SVpnServerConfigVpnClientRootCertificate> p2SVpnServerConfigVpnClientRootCertificates() {
        List<P2SVpnServerConfigVpnClientRootCertificate> inner =
            this.innerModel().p2SVpnServerConfigVpnClientRootCertificates();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<P2SVpnServerConfigVpnClientRevokedCertificate> p2SVpnServerConfigVpnClientRevokedCertificates() {
        List<P2SVpnServerConfigVpnClientRevokedCertificate> inner =
            this.innerModel().p2SVpnServerConfigVpnClientRevokedCertificates();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<P2SVpnServerConfigRadiusServerRootCertificate> p2SVpnServerConfigRadiusServerRootCertificates() {
        List<P2SVpnServerConfigRadiusServerRootCertificate> inner =
            this.innerModel().p2SVpnServerConfigRadiusServerRootCertificates();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<P2SVpnServerConfigRadiusClientRootCertificate> p2SVpnServerConfigRadiusClientRootCertificates() {
        List<P2SVpnServerConfigRadiusClientRootCertificate> inner =
            this.innerModel().p2SVpnServerConfigRadiusClientRootCertificates();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<IpsecPolicy> vpnClientIpsecPolicies() {
        List<IpsecPolicy> inner = this.innerModel().vpnClientIpsecPolicies();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String radiusServerAddress() {
        return this.innerModel().radiusServerAddress();
    }

    public String radiusServerSecret() {
        return this.innerModel().radiusServerSecret();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<SubResource> p2SVpnGateways() {
        List<SubResource> inner = this.innerModel().p2SVpnGateways();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String etagPropertiesEtag() {
        return this.innerModel().etagPropertiesEtag();
    }

    public P2SVpnServerConfigurationInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
