// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.EncryptionType;
import com.azure.resourcemanager.devtestlabs.models.EnvironmentPermission;
import com.azure.resourcemanager.devtestlabs.models.ManagedIdentityType;
import com.azure.resourcemanager.devtestlabs.models.PremiumDataDisk;
import com.azure.resourcemanager.devtestlabs.models.StorageType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** A lab. */
@Fluent
public final class LabInner extends Resource {
    /*
     * The properties of the resource.
     */
    @JsonProperty(value = "properties")
    private LabProperties innerProperties;

    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private IdentityProperties innerIdentity;

    /*
     * The system metadata relating to this resource
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: The properties of the resource.
     *
     * @return the innerProperties value.
     */
    private LabProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the innerIdentity property: The identity of the resource.
     *
     * @return the innerIdentity value.
     */
    private IdentityProperties innerIdentity() {
        return this.innerIdentity;
    }

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public LabInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LabInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the defaultStorageAccount property: The lab's default storage account.
     *
     * @return the defaultStorageAccount value.
     */
    public String defaultStorageAccount() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultStorageAccount();
    }

    /**
     * Get the defaultPremiumStorageAccount property: The lab's default premium storage account.
     *
     * @return the defaultPremiumStorageAccount value.
     */
    public String defaultPremiumStorageAccount() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultPremiumStorageAccount();
    }

    /**
     * Get the artifactsStorageAccount property: The lab's artifact storage account.
     *
     * @return the artifactsStorageAccount value.
     */
    public String artifactsStorageAccount() {
        return this.innerProperties() == null ? null : this.innerProperties().artifactsStorageAccount();
    }

    /**
     * Get the premiumDataDiskStorageAccount property: The lab's premium data disk storage account.
     *
     * @return the premiumDataDiskStorageAccount value.
     */
    public String premiumDataDiskStorageAccount() {
        return this.innerProperties() == null ? null : this.innerProperties().premiumDataDiskStorageAccount();
    }

    /**
     * Get the vaultName property: The lab's Key vault.
     *
     * @return the vaultName value.
     */
    public String vaultName() {
        return this.innerProperties() == null ? null : this.innerProperties().vaultName();
    }

    /**
     * Get the labStorageType property: Type of storage used by the lab. It can be either Premium or Standard. Default
     * is Premium.
     *
     * @return the labStorageType value.
     */
    public StorageType labStorageType() {
        return this.innerProperties() == null ? null : this.innerProperties().labStorageType();
    }

    /**
     * Set the labStorageType property: Type of storage used by the lab. It can be either Premium or Standard. Default
     * is Premium.
     *
     * @param labStorageType the labStorageType value to set.
     * @return the LabInner object itself.
     */
    public LabInner withLabStorageType(StorageType labStorageType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withLabStorageType(labStorageType);
        return this;
    }

    /**
     * Get the mandatoryArtifactsResourceIdsLinux property: The ordered list of artifact resource IDs that should be
     * applied on all Linux VM creations by default, prior to the artifacts specified by the user.
     *
     * @return the mandatoryArtifactsResourceIdsLinux value.
     */
    public List<String> mandatoryArtifactsResourceIdsLinux() {
        return this.innerProperties() == null ? null : this.innerProperties().mandatoryArtifactsResourceIdsLinux();
    }

    /**
     * Set the mandatoryArtifactsResourceIdsLinux property: The ordered list of artifact resource IDs that should be
     * applied on all Linux VM creations by default, prior to the artifacts specified by the user.
     *
     * @param mandatoryArtifactsResourceIdsLinux the mandatoryArtifactsResourceIdsLinux value to set.
     * @return the LabInner object itself.
     */
    public LabInner withMandatoryArtifactsResourceIdsLinux(List<String> mandatoryArtifactsResourceIdsLinux) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withMandatoryArtifactsResourceIdsLinux(mandatoryArtifactsResourceIdsLinux);
        return this;
    }

    /**
     * Get the mandatoryArtifactsResourceIdsWindows property: The ordered list of artifact resource IDs that should be
     * applied on all Windows VM creations by default, prior to the artifacts specified by the user.
     *
     * @return the mandatoryArtifactsResourceIdsWindows value.
     */
    public List<String> mandatoryArtifactsResourceIdsWindows() {
        return this.innerProperties() == null ? null : this.innerProperties().mandatoryArtifactsResourceIdsWindows();
    }

    /**
     * Set the mandatoryArtifactsResourceIdsWindows property: The ordered list of artifact resource IDs that should be
     * applied on all Windows VM creations by default, prior to the artifacts specified by the user.
     *
     * @param mandatoryArtifactsResourceIdsWindows the mandatoryArtifactsResourceIdsWindows value to set.
     * @return the LabInner object itself.
     */
    public LabInner withMandatoryArtifactsResourceIdsWindows(List<String> mandatoryArtifactsResourceIdsWindows) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withMandatoryArtifactsResourceIdsWindows(mandatoryArtifactsResourceIdsWindows);
        return this;
    }

    /**
     * Get the createdDate property: The creation date of the lab.
     *
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDate();
    }

    /**
     * Get the premiumDataDisks property: The setting to enable usage of premium data disks. When its value is
     * 'Enabled', creation of standard or premium data disks is allowed. When its value is 'Disabled', only creation of
     * standard data disks is allowed.
     *
     * @return the premiumDataDisks value.
     */
    public PremiumDataDisk premiumDataDisks() {
        return this.innerProperties() == null ? null : this.innerProperties().premiumDataDisks();
    }

    /**
     * Set the premiumDataDisks property: The setting to enable usage of premium data disks. When its value is
     * 'Enabled', creation of standard or premium data disks is allowed. When its value is 'Disabled', only creation of
     * standard data disks is allowed.
     *
     * @param premiumDataDisks the premiumDataDisks value to set.
     * @return the LabInner object itself.
     */
    public LabInner withPremiumDataDisks(PremiumDataDisk premiumDataDisks) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withPremiumDataDisks(premiumDataDisks);
        return this;
    }

    /**
     * Get the environmentPermission property: The access rights to be granted to the user when provisioning an
     * environment.
     *
     * @return the environmentPermission value.
     */
    public EnvironmentPermission environmentPermission() {
        return this.innerProperties() == null ? null : this.innerProperties().environmentPermission();
    }

    /**
     * Set the environmentPermission property: The access rights to be granted to the user when provisioning an
     * environment.
     *
     * @param environmentPermission the environmentPermission value to set.
     * @return the LabInner object itself.
     */
    public LabInner withEnvironmentPermission(EnvironmentPermission environmentPermission) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withEnvironmentPermission(environmentPermission);
        return this;
    }

    /**
     * Get the vmCreationResourceGroup property: The resource group ID in which all new lab virtual machines will be
     * created. Ex: /subscriptions/subId/resourceGroups/rgName To let DevTest Labs manage resource group creation, set
     * this value to null.
     *
     * @return the vmCreationResourceGroup value.
     */
    public String vmCreationResourceGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().vmCreationResourceGroup();
    }

    /**
     * Get the publicIpId property: The public IP address for the lab's load balancer.
     *
     * @return the publicIpId value.
     */
    public String publicIpId() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpId();
    }

    /**
     * Get the loadBalancerId property: The load balancer used to for lab VMs that use shared IP address.
     *
     * @return the loadBalancerId value.
     */
    public String loadBalancerId() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancerId();
    }

    /**
     * Get the networkSecurityGroupId property: The Network Security Group attached to the lab VMs Network interfaces to
     * restrict open ports.
     *
     * @return the networkSecurityGroupId value.
     */
    public String networkSecurityGroupId() {
        return this.innerProperties() == null ? null : this.innerProperties().networkSecurityGroupId();
    }

    /**
     * Get the extendedProperties property: Extended properties of the lab used for experimental features.
     *
     * @return the extendedProperties value.
     */
    public Map<String, String> extendedProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().extendedProperties();
    }

    /**
     * Set the extendedProperties property: Extended properties of the lab used for experimental features.
     *
     * @param extendedProperties the extendedProperties value to set.
     * @return the LabInner object itself.
     */
    public LabInner withExtendedProperties(Map<String, String> extendedProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withExtendedProperties(extendedProperties);
        return this;
    }

    /**
     * Get the browserConnect property: Is browser connect enabled for the lab.
     *
     * @return the browserConnect value.
     */
    public EnableStatus browserConnect() {
        return this.innerProperties() == null ? null : this.innerProperties().browserConnect();
    }

    /**
     * Set the browserConnect property: Is browser connect enabled for the lab.
     *
     * @param browserConnect the browserConnect value to set.
     * @return the LabInner object itself.
     */
    public LabInner withBrowserConnect(EnableStatus browserConnect) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withBrowserConnect(browserConnect);
        return this;
    }

    /**
     * Get the disableAutoUpgradeCseMinorVersion property: Is auto upgrade of CSE disabled for the lab?.
     *
     * @return the disableAutoUpgradeCseMinorVersion value.
     */
    public Boolean disableAutoUpgradeCseMinorVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().disableAutoUpgradeCseMinorVersion();
    }

    /**
     * Set the disableAutoUpgradeCseMinorVersion property: Is auto upgrade of CSE disabled for the lab?.
     *
     * @param disableAutoUpgradeCseMinorVersion the disableAutoUpgradeCseMinorVersion value to set.
     * @return the LabInner object itself.
     */
    public LabInner withDisableAutoUpgradeCseMinorVersion(Boolean disableAutoUpgradeCseMinorVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withDisableAutoUpgradeCseMinorVersion(disableAutoUpgradeCseMinorVersion);
        return this;
    }

    /**
     * Get the managementIdentities property: List of identities which can be used for management of resources.
     *
     * @return the managementIdentities value.
     */
    public Map<String, Object> managementIdentities() {
        return this.innerProperties() == null ? null : this.innerProperties().managementIdentities();
    }

    /**
     * Set the managementIdentities property: List of identities which can be used for management of resources.
     *
     * @param managementIdentities the managementIdentities value to set.
     * @return the LabInner object itself.
     */
    public LabInner withManagementIdentities(Map<String, Object> managementIdentities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withManagementIdentities(managementIdentities);
        return this;
    }

    /**
     * Get the isolateLabResources property: Indicates whether to create Lab resources (e.g. Storage accounts and Key
     * Vaults) in network isolation.
     *
     * @return the isolateLabResources value.
     */
    public EnableStatus isolateLabResources() {
        return this.innerProperties() == null ? null : this.innerProperties().isolateLabResources();
    }

    /**
     * Set the isolateLabResources property: Indicates whether to create Lab resources (e.g. Storage accounts and Key
     * Vaults) in network isolation.
     *
     * @param isolateLabResources the isolateLabResources value to set.
     * @return the LabInner object itself.
     */
    public LabInner withIsolateLabResources(EnableStatus isolateLabResources) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withIsolateLabResources(isolateLabResources);
        return this;
    }

    /**
     * Get the defaultSecretName property: Default secret for creating virtual machines.
     *
     * @return the defaultSecretName value.
     */
    public String defaultSecretName() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultSecretName();
    }

    /**
     * Set the defaultSecretName property: Default secret for creating virtual machines.
     *
     * @param defaultSecretName the defaultSecretName value to set.
     * @return the LabInner object itself.
     */
    public LabInner withDefaultSecretName(String defaultSecretName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withDefaultSecretName(defaultSecretName);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    public String uniqueIdentifier() {
        return this.innerProperties() == null ? null : this.innerProperties().uniqueIdentifier();
    }

    /**
     * Get the title property: The plain text title for the lab announcement.
     *
     * @return the title value.
     */
    public String title() {
        return this.innerProperties() == null ? null : this.innerProperties().title();
    }

    /**
     * Set the title property: The plain text title for the lab announcement.
     *
     * @param title the title value to set.
     * @return the LabInner object itself.
     */
    public LabInner withTitle(String title) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withTitle(title);
        return this;
    }

    /**
     * Get the markdown property: The markdown text (if any) that this lab displays in the UI. If left empty/null,
     * nothing will be shown.
     *
     * @return the markdown value.
     */
    public String markdown() {
        return this.innerProperties() == null ? null : this.innerProperties().markdown();
    }

    /**
     * Set the markdown property: The markdown text (if any) that this lab displays in the UI. If left empty/null,
     * nothing will be shown.
     *
     * @param markdown the markdown value to set.
     * @return the LabInner object itself.
     */
    public LabInner withMarkdown(String markdown) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withMarkdown(markdown);
        return this;
    }

    /**
     * Get the enabled property: Is the lab announcement active/enabled at this time?.
     *
     * @return the enabled value.
     */
    public EnableStatus enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Is the lab announcement active/enabled at this time?.
     *
     * @param enabled the enabled value to set.
     * @return the LabInner object itself.
     */
    public LabInner withEnabled(EnableStatus enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the expirationDate property: The time at which the announcement expires (null for never).
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationDate();
    }

    /**
     * Set the expirationDate property: The time at which the announcement expires (null for never).
     *
     * @param expirationDate the expirationDate value to set.
     * @return the LabInner object itself.
     */
    public LabInner withExpirationDate(OffsetDateTime expirationDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withExpirationDate(expirationDate);
        return this;
    }

    /**
     * Get the expired property: Has this announcement expired?.
     *
     * @return the expired value.
     */
    public Boolean expired() {
        return this.innerProperties() == null ? null : this.innerProperties().expired();
    }

    /**
     * Set the expired property: Has this announcement expired?.
     *
     * @param expired the expired value to set.
     * @return the LabInner object itself.
     */
    public LabInner withExpired(Boolean expired) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withExpired(expired);
        return this;
    }

    /**
     * Get the provisioningStateAnnouncementProvisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningStateAnnouncementProvisioningState value.
     */
    public String provisioningStateAnnouncementProvisioningState() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().provisioningStateAnnouncementProvisioningState();
    }

    /**
     * Get the uniqueIdentifierAnnouncementUniqueIdentifier property: The unique immutable identifier of a resource
     * (Guid).
     *
     * @return the uniqueIdentifierAnnouncementUniqueIdentifier value.
     */
    public String uniqueIdentifierAnnouncementUniqueIdentifier() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().uniqueIdentifierAnnouncementUniqueIdentifier();
    }

    /**
     * Get the enabledSupportEnabled property: Is the lab support banner active/enabled at this time?.
     *
     * @return the enabledSupportEnabled value.
     */
    public EnableStatus enabledSupportEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabledSupportEnabled();
    }

    /**
     * Set the enabledSupportEnabled property: Is the lab support banner active/enabled at this time?.
     *
     * @param enabledSupportEnabled the enabledSupportEnabled value to set.
     * @return the LabInner object itself.
     */
    public LabInner withEnabledSupportEnabled(EnableStatus enabledSupportEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withEnabledSupportEnabled(enabledSupportEnabled);
        return this;
    }

    /**
     * Get the markdownSupportMarkdown property: The markdown text (if any) that this lab displays in the UI. If left
     * empty/null, nothing will be shown.
     *
     * @return the markdownSupportMarkdown value.
     */
    public String markdownSupportMarkdown() {
        return this.innerProperties() == null ? null : this.innerProperties().markdownSupportMarkdown();
    }

    /**
     * Set the markdownSupportMarkdown property: The markdown text (if any) that this lab displays in the UI. If left
     * empty/null, nothing will be shown.
     *
     * @param markdownSupportMarkdown the markdownSupportMarkdown value to set.
     * @return the LabInner object itself.
     */
    public LabInner withMarkdownSupportMarkdown(String markdownSupportMarkdown) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withMarkdownSupportMarkdown(markdownSupportMarkdown);
        return this;
    }

    /**
     * Get the diskEncryptionSetId property: Gets or sets resourceId of the disk encryption set to use for enabling
     * encryption at rest.
     *
     * @return the diskEncryptionSetId value.
     */
    public String diskEncryptionSetId() {
        return this.innerProperties() == null ? null : this.innerProperties().diskEncryptionSetId();
    }

    /**
     * Set the diskEncryptionSetId property: Gets or sets resourceId of the disk encryption set to use for enabling
     * encryption at rest.
     *
     * @param diskEncryptionSetId the diskEncryptionSetId value to set.
     * @return the LabInner object itself.
     */
    public LabInner withDiskEncryptionSetId(String diskEncryptionSetId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withDiskEncryptionSetId(diskEncryptionSetId);
        return this;
    }

    /**
     * Get the type property: Gets or sets the type of key used to encrypt the data of the disk. Possible values
     * include: 'EncryptionAtRestWithPlatformKey', 'EncryptionAtRestWithCustomerKey'.
     *
     * @return the type value.
     */
    public EncryptionType typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: Gets or sets the type of key used to encrypt the data of the disk. Possible values
     * include: 'EncryptionAtRestWithPlatformKey', 'EncryptionAtRestWithCustomerKey'.
     *
     * @param type the type value to set.
     * @return the LabInner object itself.
     */
    public LabInner withTypePropertiesType(EncryptionType type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the type property: Type of identity (SystemAssigned, UserAssigned, None).
     *
     * @return the type value.
     */
    public ManagedIdentityType typeIdentityType() {
        return this.innerIdentity() == null ? null : this.innerIdentity().type();
    }

    /**
     * Set the type property: Type of identity (SystemAssigned, UserAssigned, None).
     *
     * @param type the type value to set.
     * @return the LabInner object itself.
     */
    public LabInner withTypeIdentityType(ManagedIdentityType type) {
        if (this.innerIdentity() == null) {
            this.innerIdentity = new IdentityProperties();
        }
        this.innerIdentity().withType(type);
        return this;
    }

    /**
     * Get the principalId property: The principal id of resource identity.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.innerIdentity() == null ? null : this.innerIdentity().principalId();
    }

    /**
     * Set the principalId property: The principal id of resource identity.
     *
     * @param principalId the principalId value to set.
     * @return the LabInner object itself.
     */
    public LabInner withPrincipalId(String principalId) {
        if (this.innerIdentity() == null) {
            this.innerIdentity = new IdentityProperties();
        }
        this.innerIdentity().withPrincipalId(principalId);
        return this;
    }

    /**
     * Get the tenantId property: The tenant identifier of resource.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerIdentity() == null ? null : this.innerIdentity().tenantId();
    }

    /**
     * Set the tenantId property: The tenant identifier of resource.
     *
     * @param tenantId the tenantId value to set.
     * @return the LabInner object itself.
     */
    public LabInner withTenantId(String tenantId) {
        if (this.innerIdentity() == null) {
            this.innerIdentity = new IdentityProperties();
        }
        this.innerIdentity().withTenantId(tenantId);
        return this;
    }

    /**
     * Get the clientSecretUrl property: The client secret URL of the identity.
     *
     * @return the clientSecretUrl value.
     */
    public String clientSecretUrl() {
        return this.innerIdentity() == null ? null : this.innerIdentity().clientSecretUrl();
    }

    /**
     * Set the clientSecretUrl property: The client secret URL of the identity.
     *
     * @param clientSecretUrl the clientSecretUrl value to set.
     * @return the LabInner object itself.
     */
    public LabInner withClientSecretUrl(String clientSecretUrl) {
        if (this.innerIdentity() == null) {
            this.innerIdentity = new IdentityProperties();
        }
        this.innerIdentity().withClientSecretUrl(clientSecretUrl);
        return this;
    }

    /**
     * Get the userAssignedIdentities property: If Type is 'UserAssigned': List of user assigned identities.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, Object> userAssignedIdentities() {
        return this.innerIdentity() == null ? null : this.innerIdentity().userAssignedIdentities();
    }

    /**
     * Set the userAssignedIdentities property: If Type is 'UserAssigned': List of user assigned identities.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the LabInner object itself.
     */
    public LabInner withUserAssignedIdentities(Map<String, Object> userAssignedIdentities) {
        if (this.innerIdentity() == null) {
            this.innerIdentity = new IdentityProperties();
        }
        this.innerIdentity().withUserAssignedIdentities(userAssignedIdentities);
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
        if (innerIdentity() != null) {
            innerIdentity().validate();
        }
    }
}
