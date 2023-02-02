// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.DelegationProperties;
import com.azure.resourcemanager.network.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.network.generated.models.PartnerManagedResourceProperties;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VirtualApplianceNicProperties;
import com.azure.resourcemanager.network.generated.models.VirtualApplianceSkuProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** NetworkVirtualAppliance Resource. */
@Fluent
public final class NetworkVirtualApplianceInner extends Resource {
    /*
     * Properties of the Network Virtual Appliance.
     */
    @JsonProperty(value = "properties")
    private NetworkVirtualAppliancePropertiesFormat innerProperties;

    /*
     * The service principal that has read access to cloud-init and config blob.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /** Creates an instance of NetworkVirtualApplianceInner class. */
    public NetworkVirtualApplianceInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Network Virtual Appliance.
     *
     * @return the innerProperties value.
     */
    private NetworkVirtualAppliancePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The service principal that has read access to cloud-init and config blob.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The service principal that has read access to cloud-init and config blob.
     *
     * @param identity the identity value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkVirtualApplianceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkVirtualApplianceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the nvaSku property: Network Virtual Appliance SKU.
     *
     * @return the nvaSku value.
     */
    public VirtualApplianceSkuProperties nvaSku() {
        return this.innerProperties() == null ? null : this.innerProperties().nvaSku();
    }

    /**
     * Set the nvaSku property: Network Virtual Appliance SKU.
     *
     * @param nvaSku the nvaSku value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withNvaSku(VirtualApplianceSkuProperties nvaSku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkVirtualAppliancePropertiesFormat();
        }
        this.innerProperties().withNvaSku(nvaSku);
        return this;
    }

    /**
     * Get the addressPrefix property: Address Prefix.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().addressPrefix();
    }

    /**
     * Get the bootStrapConfigurationBlobs property: BootStrapConfigurationBlobs storage URLs.
     *
     * @return the bootStrapConfigurationBlobs value.
     */
    public List<String> bootStrapConfigurationBlobs() {
        return this.innerProperties() == null ? null : this.innerProperties().bootStrapConfigurationBlobs();
    }

    /**
     * Set the bootStrapConfigurationBlobs property: BootStrapConfigurationBlobs storage URLs.
     *
     * @param bootStrapConfigurationBlobs the bootStrapConfigurationBlobs value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withBootStrapConfigurationBlobs(List<String> bootStrapConfigurationBlobs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkVirtualAppliancePropertiesFormat();
        }
        this.innerProperties().withBootStrapConfigurationBlobs(bootStrapConfigurationBlobs);
        return this;
    }

    /**
     * Get the virtualHub property: The Virtual Hub where Network Virtual Appliance is being deployed.
     *
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualHub();
    }

    /**
     * Set the virtualHub property: The Virtual Hub where Network Virtual Appliance is being deployed.
     *
     * @param virtualHub the virtualHub value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withVirtualHub(SubResource virtualHub) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkVirtualAppliancePropertiesFormat();
        }
        this.innerProperties().withVirtualHub(virtualHub);
        return this;
    }

    /**
     * Get the cloudInitConfigurationBlobs property: CloudInitConfigurationBlob storage URLs.
     *
     * @return the cloudInitConfigurationBlobs value.
     */
    public List<String> cloudInitConfigurationBlobs() {
        return this.innerProperties() == null ? null : this.innerProperties().cloudInitConfigurationBlobs();
    }

    /**
     * Set the cloudInitConfigurationBlobs property: CloudInitConfigurationBlob storage URLs.
     *
     * @param cloudInitConfigurationBlobs the cloudInitConfigurationBlobs value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withCloudInitConfigurationBlobs(List<String> cloudInitConfigurationBlobs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkVirtualAppliancePropertiesFormat();
        }
        this.innerProperties().withCloudInitConfigurationBlobs(cloudInitConfigurationBlobs);
        return this;
    }

    /**
     * Get the cloudInitConfiguration property: CloudInitConfiguration string in plain text.
     *
     * @return the cloudInitConfiguration value.
     */
    public String cloudInitConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().cloudInitConfiguration();
    }

    /**
     * Set the cloudInitConfiguration property: CloudInitConfiguration string in plain text.
     *
     * @param cloudInitConfiguration the cloudInitConfiguration value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withCloudInitConfiguration(String cloudInitConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkVirtualAppliancePropertiesFormat();
        }
        this.innerProperties().withCloudInitConfiguration(cloudInitConfiguration);
        return this;
    }

    /**
     * Get the virtualApplianceAsn property: VirtualAppliance ASN. Microsoft private, public and IANA reserved ASN are
     * not supported.
     *
     * @return the virtualApplianceAsn value.
     */
    public Long virtualApplianceAsn() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualApplianceAsn();
    }

    /**
     * Set the virtualApplianceAsn property: VirtualAppliance ASN. Microsoft private, public and IANA reserved ASN are
     * not supported.
     *
     * @param virtualApplianceAsn the virtualApplianceAsn value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withVirtualApplianceAsn(Long virtualApplianceAsn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkVirtualAppliancePropertiesFormat();
        }
        this.innerProperties().withVirtualApplianceAsn(virtualApplianceAsn);
        return this;
    }

    /**
     * Get the sshPublicKey property: Public key for SSH login.
     *
     * @return the sshPublicKey value.
     */
    public String sshPublicKey() {
        return this.innerProperties() == null ? null : this.innerProperties().sshPublicKey();
    }

    /**
     * Set the sshPublicKey property: Public key for SSH login.
     *
     * @param sshPublicKey the sshPublicKey value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withSshPublicKey(String sshPublicKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkVirtualAppliancePropertiesFormat();
        }
        this.innerProperties().withSshPublicKey(sshPublicKey);
        return this;
    }

    /**
     * Get the virtualApplianceNics property: List of Virtual Appliance Network Interfaces.
     *
     * @return the virtualApplianceNics value.
     */
    public List<VirtualApplianceNicProperties> virtualApplianceNics() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualApplianceNics();
    }

    /**
     * Get the virtualApplianceSites property: List of references to VirtualApplianceSite.
     *
     * @return the virtualApplianceSites value.
     */
    public List<SubResource> virtualApplianceSites() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualApplianceSites();
    }

    /**
     * Get the inboundSecurityRules property: List of references to InboundSecurityRules.
     *
     * @return the inboundSecurityRules value.
     */
    public List<SubResource> inboundSecurityRules() {
        return this.innerProperties() == null ? null : this.innerProperties().inboundSecurityRules();
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the deploymentType property: The deployment type. PartnerManaged for the SaaS NVA.
     *
     * @return the deploymentType value.
     */
    public String deploymentType() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentType();
    }

    /**
     * Get the delegation property: The delegation for the Virtual Appliance.
     *
     * @return the delegation value.
     */
    public DelegationProperties delegation() {
        return this.innerProperties() == null ? null : this.innerProperties().delegation();
    }

    /**
     * Set the delegation property: The delegation for the Virtual Appliance.
     *
     * @param delegation the delegation value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withDelegation(DelegationProperties delegation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkVirtualAppliancePropertiesFormat();
        }
        this.innerProperties().withDelegation(delegation);
        return this;
    }

    /**
     * Get the partnerManagedResource property: The delegation for the Virtual Appliance.
     *
     * @return the partnerManagedResource value.
     */
    public PartnerManagedResourceProperties partnerManagedResource() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerManagedResource();
    }

    /**
     * Set the partnerManagedResource property: The delegation for the Virtual Appliance.
     *
     * @param partnerManagedResource the partnerManagedResource value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withPartnerManagedResource(
        PartnerManagedResourceProperties partnerManagedResource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkVirtualAppliancePropertiesFormat();
        }
        this.innerProperties().withPartnerManagedResource(partnerManagedResource);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
