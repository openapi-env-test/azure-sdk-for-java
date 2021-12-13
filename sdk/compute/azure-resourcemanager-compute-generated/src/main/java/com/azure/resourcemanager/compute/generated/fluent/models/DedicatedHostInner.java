// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.models.DedicatedHostInstanceView;
import com.azure.resourcemanager.compute.generated.models.DedicatedHostLicenseTypes;
import com.azure.resourcemanager.compute.generated.models.Sku;
import com.azure.resourcemanager.compute.generated.models.SubResourceReadOnly;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Specifies information about the Dedicated host. */
@Fluent
public final class DedicatedHostInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DedicatedHostInner.class);

    /*
     * Properties of the dedicated host.
     */
    @JsonProperty(value = "properties")
    private DedicatedHostProperties innerProperties;

    /*
     * SKU of the dedicated host for Hardware Generation and VM family. Only
     * name is required to be set. List Microsoft.Compute SKUs for a list of
     * possible values.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /**
     * Get the innerProperties property: Properties of the dedicated host.
     *
     * @return the innerProperties value.
     */
    private DedicatedHostProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: SKU of the dedicated host for Hardware Generation and VM family. Only name is required to
     * be set. List Microsoft.Compute SKUs for a list of possible values.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU of the dedicated host for Hardware Generation and VM family. Only name is required to
     * be set. List Microsoft.Compute SKUs for a list of possible values.
     *
     * @param sku the sku value to set.
     * @return the DedicatedHostInner object itself.
     */
    public DedicatedHostInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DedicatedHostInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DedicatedHostInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the platformFaultDomain property: Fault domain of the dedicated host within a dedicated host group.
     *
     * @return the platformFaultDomain value.
     */
    public Integer platformFaultDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().platformFaultDomain();
    }

    /**
     * Set the platformFaultDomain property: Fault domain of the dedicated host within a dedicated host group.
     *
     * @param platformFaultDomain the platformFaultDomain value to set.
     * @return the DedicatedHostInner object itself.
     */
    public DedicatedHostInner withPlatformFaultDomain(Integer platformFaultDomain) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DedicatedHostProperties();
        }
        this.innerProperties().withPlatformFaultDomain(platformFaultDomain);
        return this;
    }

    /**
     * Get the autoReplaceOnFailure property: Specifies whether the dedicated host should be replaced automatically in
     * case of a failure. The value is defaulted to 'true' when not provided.
     *
     * @return the autoReplaceOnFailure value.
     */
    public Boolean autoReplaceOnFailure() {
        return this.innerProperties() == null ? null : this.innerProperties().autoReplaceOnFailure();
    }

    /**
     * Set the autoReplaceOnFailure property: Specifies whether the dedicated host should be replaced automatically in
     * case of a failure. The value is defaulted to 'true' when not provided.
     *
     * @param autoReplaceOnFailure the autoReplaceOnFailure value to set.
     * @return the DedicatedHostInner object itself.
     */
    public DedicatedHostInner withAutoReplaceOnFailure(Boolean autoReplaceOnFailure) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DedicatedHostProperties();
        }
        this.innerProperties().withAutoReplaceOnFailure(autoReplaceOnFailure);
        return this;
    }

    /**
     * Get the hostId property: A unique id generated and assigned to the dedicated host by the platform.
     * &lt;br&gt;&lt;br&gt; Does not change throughout the lifetime of the host.
     *
     * @return the hostId value.
     */
    public String hostId() {
        return this.innerProperties() == null ? null : this.innerProperties().hostId();
    }

    /**
     * Get the virtualMachines property: A list of references to all virtual machines in the Dedicated Host.
     *
     * @return the virtualMachines value.
     */
    public List<SubResourceReadOnly> virtualMachines() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachines();
    }

    /**
     * Get the licenseType property: Specifies the software license type that will be applied to the VMs deployed on the
     * dedicated host. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt;
     * **Windows_Server_Hybrid** &lt;br&gt;&lt;br&gt; **Windows_Server_Perpetual** &lt;br&gt;&lt;br&gt; Default:
     * **None**.
     *
     * @return the licenseType value.
     */
    public DedicatedHostLicenseTypes licenseType() {
        return this.innerProperties() == null ? null : this.innerProperties().licenseType();
    }

    /**
     * Set the licenseType property: Specifies the software license type that will be applied to the VMs deployed on the
     * dedicated host. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt;
     * **Windows_Server_Hybrid** &lt;br&gt;&lt;br&gt; **Windows_Server_Perpetual** &lt;br&gt;&lt;br&gt; Default:
     * **None**.
     *
     * @param licenseType the licenseType value to set.
     * @return the DedicatedHostInner object itself.
     */
    public DedicatedHostInner withLicenseType(DedicatedHostLicenseTypes licenseType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DedicatedHostProperties();
        }
        this.innerProperties().withLicenseType(licenseType);
        return this;
    }

    /**
     * Get the provisioningTime property: The date when the host was first provisioned.
     *
     * @return the provisioningTime value.
     */
    public OffsetDateTime provisioningTime() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningTime();
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the instanceView property: The dedicated host instance view.
     *
     * @return the instanceView value.
     */
    public DedicatedHostInstanceView instanceView() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceView();
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
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model DedicatedHostInner"));
        } else {
            sku().validate();
        }
    }
}
