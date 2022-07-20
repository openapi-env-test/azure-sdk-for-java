// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.containerservice.generated.models.ContainerServiceLinuxProfile;
import com.azure.resourcemanager.containerservice.generated.models.ContainerServiceNetworkProfile;
import com.azure.resourcemanager.containerservice.generated.models.CreationData;
import com.azure.resourcemanager.containerservice.generated.models.ExtendedLocation;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterAadProfile;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterAddonProfile;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterAgentPoolProfile;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterApiServerAccessProfile;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterAutoUpgradeProfile;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterHttpProxyConfig;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterIdentity;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterIngressProfile;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterOidcIssuerProfile;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterPodIdentityProfile;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterPropertiesAutoScalerProfile;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterSecurityProfile;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterServicePrincipalProfile;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterSku;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterStorageProfile;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterWindowsProfile;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterWorkloadAutoScalerProfile;
import com.azure.resourcemanager.containerservice.generated.models.PowerState;
import com.azure.resourcemanager.containerservice.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.containerservice.generated.models.UserAssignedIdentity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Managed cluster. */
@Fluent
public final class ManagedClusterInner extends Resource {
    /*
     * The managed cluster SKU.
     */
    @JsonProperty(value = "sku")
    private ManagedClusterSku sku;

    /*
     * The extended location of the Virtual Machine.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * The identity of the managed cluster, if configured.
     */
    @JsonProperty(value = "identity")
    private ManagedClusterIdentity identity;

    /*
     * Properties of a managed cluster.
     */
    @JsonProperty(value = "properties")
    private ManagedClusterProperties innerProperties;

    /**
     * Get the sku property: The managed cluster SKU.
     *
     * @return the sku value.
     */
    public ManagedClusterSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The managed cluster SKU.
     *
     * @param sku the sku value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withSku(ManagedClusterSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the extendedLocation property: The extended location of the Virtual Machine.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location of the Virtual Machine.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the identity property: The identity of the managed cluster, if configured.
     *
     * @return the identity value.
     */
    public ManagedClusterIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the managed cluster, if configured.
     *
     * @param identity the identity value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withIdentity(ManagedClusterIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of a managed cluster.
     *
     * @return the innerProperties value.
     */
    private ManagedClusterProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The current provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the powerState property: The Power State of the cluster.
     *
     * @return the powerState value.
     */
    public PowerState powerState() {
        return this.innerProperties() == null ? null : this.innerProperties().powerState();
    }

    /**
     * Get the creationData property: CreationData to be used to specify the source Snapshot ID if the cluster will be
     * created/upgraded using a snapshot.
     *
     * @return the creationData value.
     */
    public CreationData creationData() {
        return this.innerProperties() == null ? null : this.innerProperties().creationData();
    }

    /**
     * Set the creationData property: CreationData to be used to specify the source Snapshot ID if the cluster will be
     * created/upgraded using a snapshot.
     *
     * @param creationData the creationData value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withCreationData(CreationData creationData) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withCreationData(creationData);
        return this;
    }

    /**
     * Get the maxAgentPools property: The max number of agent pools for the managed cluster.
     *
     * @return the maxAgentPools value.
     */
    public Integer maxAgentPools() {
        return this.innerProperties() == null ? null : this.innerProperties().maxAgentPools();
    }

    /**
     * Get the kubernetesVersion property: The version of Kubernetes the Managed Cluster is requested to run. When you
     * upgrade a supported AKS cluster, Kubernetes minor versions cannot be skipped. All upgrades must be performed
     * sequentially by major version number. For example, upgrades between 1.14.x -&gt; 1.15.x or 1.15.x -&gt; 1.16.x
     * are allowed, however 1.14.x -&gt; 1.16.x is not allowed. See [upgrading an AKS
     * cluster](https://docs.microsoft.com/azure/aks/upgrade-cluster) for more details.
     *
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().kubernetesVersion();
    }

    /**
     * Set the kubernetesVersion property: The version of Kubernetes the Managed Cluster is requested to run. When you
     * upgrade a supported AKS cluster, Kubernetes minor versions cannot be skipped. All upgrades must be performed
     * sequentially by major version number. For example, upgrades between 1.14.x -&gt; 1.15.x or 1.15.x -&gt; 1.16.x
     * are allowed, however 1.14.x -&gt; 1.16.x is not allowed. See [upgrading an AKS
     * cluster](https://docs.microsoft.com/azure/aks/upgrade-cluster) for more details.
     *
     * @param kubernetesVersion the kubernetesVersion value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withKubernetesVersion(String kubernetesVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withKubernetesVersion(kubernetesVersion);
        return this;
    }

    /**
     * Get the currentKubernetesVersion property: The version of Kubernetes the Managed Cluster is running.
     *
     * @return the currentKubernetesVersion value.
     */
    public String currentKubernetesVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().currentKubernetesVersion();
    }

    /**
     * Get the dnsPrefix property: The DNS prefix of the Managed Cluster. This cannot be updated once the Managed
     * Cluster has been created.
     *
     * @return the dnsPrefix value.
     */
    public String dnsPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsPrefix();
    }

    /**
     * Set the dnsPrefix property: The DNS prefix of the Managed Cluster. This cannot be updated once the Managed
     * Cluster has been created.
     *
     * @param dnsPrefix the dnsPrefix value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withDnsPrefix(String dnsPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withDnsPrefix(dnsPrefix);
        return this;
    }

    /**
     * Get the fqdnSubdomain property: The FQDN subdomain of the private cluster with custom private dns zone. This
     * cannot be updated once the Managed Cluster has been created.
     *
     * @return the fqdnSubdomain value.
     */
    public String fqdnSubdomain() {
        return this.innerProperties() == null ? null : this.innerProperties().fqdnSubdomain();
    }

    /**
     * Set the fqdnSubdomain property: The FQDN subdomain of the private cluster with custom private dns zone. This
     * cannot be updated once the Managed Cluster has been created.
     *
     * @param fqdnSubdomain the fqdnSubdomain value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withFqdnSubdomain(String fqdnSubdomain) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withFqdnSubdomain(fqdnSubdomain);
        return this;
    }

    /**
     * Get the fqdn property: The FQDN of the master pool.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.innerProperties() == null ? null : this.innerProperties().fqdn();
    }

    /**
     * Get the privateFqdn property: The FQDN of private cluster.
     *
     * @return the privateFqdn value.
     */
    public String privateFqdn() {
        return this.innerProperties() == null ? null : this.innerProperties().privateFqdn();
    }

    /**
     * Get the azurePortalFqdn property: The special FQDN used by the Azure Portal to access the Managed Cluster. This
     * FQDN is for use only by the Azure Portal and should not be used by other clients. The Azure Portal requires
     * certain Cross-Origin Resource Sharing (CORS) headers to be sent in some responses, which Kubernetes APIServer
     * doesn't handle by default. This special FQDN supports CORS, allowing the Azure Portal to function properly.
     *
     * @return the azurePortalFqdn value.
     */
    public String azurePortalFqdn() {
        return this.innerProperties() == null ? null : this.innerProperties().azurePortalFqdn();
    }

    /**
     * Get the agentPoolProfiles property: The agent pool properties.
     *
     * @return the agentPoolProfiles value.
     */
    public List<ManagedClusterAgentPoolProfile> agentPoolProfiles() {
        return this.innerProperties() == null ? null : this.innerProperties().agentPoolProfiles();
    }

    /**
     * Set the agentPoolProfiles property: The agent pool properties.
     *
     * @param agentPoolProfiles the agentPoolProfiles value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withAgentPoolProfiles(List<ManagedClusterAgentPoolProfile> agentPoolProfiles) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withAgentPoolProfiles(agentPoolProfiles);
        return this;
    }

    /**
     * Get the linuxProfile property: The profile for Linux VMs in the Managed Cluster.
     *
     * @return the linuxProfile value.
     */
    public ContainerServiceLinuxProfile linuxProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().linuxProfile();
    }

    /**
     * Set the linuxProfile property: The profile for Linux VMs in the Managed Cluster.
     *
     * @param linuxProfile the linuxProfile value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withLinuxProfile(ContainerServiceLinuxProfile linuxProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withLinuxProfile(linuxProfile);
        return this;
    }

    /**
     * Get the windowsProfile property: The profile for Windows VMs in the Managed Cluster.
     *
     * @return the windowsProfile value.
     */
    public ManagedClusterWindowsProfile windowsProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().windowsProfile();
    }

    /**
     * Set the windowsProfile property: The profile for Windows VMs in the Managed Cluster.
     *
     * @param windowsProfile the windowsProfile value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withWindowsProfile(ManagedClusterWindowsProfile windowsProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withWindowsProfile(windowsProfile);
        return this;
    }

    /**
     * Get the servicePrincipalProfile property: Information about a service principal identity for the cluster to use
     * for manipulating Azure APIs.
     *
     * @return the servicePrincipalProfile value.
     */
    public ManagedClusterServicePrincipalProfile servicePrincipalProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().servicePrincipalProfile();
    }

    /**
     * Set the servicePrincipalProfile property: Information about a service principal identity for the cluster to use
     * for manipulating Azure APIs.
     *
     * @param servicePrincipalProfile the servicePrincipalProfile value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withServicePrincipalProfile(
        ManagedClusterServicePrincipalProfile servicePrincipalProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withServicePrincipalProfile(servicePrincipalProfile);
        return this;
    }

    /**
     * Get the addonProfiles property: The profile of managed cluster add-on.
     *
     * @return the addonProfiles value.
     */
    public Map<String, ManagedClusterAddonProfile> addonProfiles() {
        return this.innerProperties() == null ? null : this.innerProperties().addonProfiles();
    }

    /**
     * Set the addonProfiles property: The profile of managed cluster add-on.
     *
     * @param addonProfiles the addonProfiles value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withAddonProfiles(Map<String, ManagedClusterAddonProfile> addonProfiles) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withAddonProfiles(addonProfiles);
        return this;
    }

    /**
     * Get the podIdentityProfile property: The pod identity profile of the Managed Cluster. See [use AAD pod
     * identity](https://docs.microsoft.com/azure/aks/use-azure-ad-pod-identity) for more details on AAD pod identity
     * integration.
     *
     * @return the podIdentityProfile value.
     */
    public ManagedClusterPodIdentityProfile podIdentityProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().podIdentityProfile();
    }

    /**
     * Set the podIdentityProfile property: The pod identity profile of the Managed Cluster. See [use AAD pod
     * identity](https://docs.microsoft.com/azure/aks/use-azure-ad-pod-identity) for more details on AAD pod identity
     * integration.
     *
     * @param podIdentityProfile the podIdentityProfile value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withPodIdentityProfile(ManagedClusterPodIdentityProfile podIdentityProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withPodIdentityProfile(podIdentityProfile);
        return this;
    }

    /**
     * Get the oidcIssuerProfile property: The OIDC issuer profile of the Managed Cluster.
     *
     * @return the oidcIssuerProfile value.
     */
    public ManagedClusterOidcIssuerProfile oidcIssuerProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().oidcIssuerProfile();
    }

    /**
     * Set the oidcIssuerProfile property: The OIDC issuer profile of the Managed Cluster.
     *
     * @param oidcIssuerProfile the oidcIssuerProfile value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withOidcIssuerProfile(ManagedClusterOidcIssuerProfile oidcIssuerProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withOidcIssuerProfile(oidcIssuerProfile);
        return this;
    }

    /**
     * Get the nodeResourceGroup property: The name of the resource group containing agent pool nodes.
     *
     * @return the nodeResourceGroup value.
     */
    public String nodeResourceGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeResourceGroup();
    }

    /**
     * Set the nodeResourceGroup property: The name of the resource group containing agent pool nodes.
     *
     * @param nodeResourceGroup the nodeResourceGroup value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withNodeResourceGroup(String nodeResourceGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withNodeResourceGroup(nodeResourceGroup);
        return this;
    }

    /**
     * Get the enableRbac property: Whether to enable Kubernetes Role-Based Access Control.
     *
     * @return the enableRbac value.
     */
    public Boolean enableRbac() {
        return this.innerProperties() == null ? null : this.innerProperties().enableRbac();
    }

    /**
     * Set the enableRbac property: Whether to enable Kubernetes Role-Based Access Control.
     *
     * @param enableRbac the enableRbac value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withEnableRbac(Boolean enableRbac) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withEnableRbac(enableRbac);
        return this;
    }

    /**
     * Get the enablePodSecurityPolicy property: (DEPRECATING) Whether to enable Kubernetes pod security policy
     * (preview). This feature is set for removal on October 15th, 2020. Learn more at aka.ms/aks/azpodpolicy.
     *
     * @return the enablePodSecurityPolicy value.
     */
    public Boolean enablePodSecurityPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().enablePodSecurityPolicy();
    }

    /**
     * Set the enablePodSecurityPolicy property: (DEPRECATING) Whether to enable Kubernetes pod security policy
     * (preview). This feature is set for removal on October 15th, 2020. Learn more at aka.ms/aks/azpodpolicy.
     *
     * @param enablePodSecurityPolicy the enablePodSecurityPolicy value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withEnablePodSecurityPolicy(Boolean enablePodSecurityPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withEnablePodSecurityPolicy(enablePodSecurityPolicy);
        return this;
    }

    /**
     * Get the enableNamespaceResources property: Enable namespace as Azure resource. The default value is false. It can
     * be enabled/disabled on creation and updation of the managed cluster. See
     * [https://aka.ms/NamespaceARMResource](https://aka.ms/NamespaceARMResource) for more details on Namespace as a ARM
     * Resource.
     *
     * @return the enableNamespaceResources value.
     */
    public Boolean enableNamespaceResources() {
        return this.innerProperties() == null ? null : this.innerProperties().enableNamespaceResources();
    }

    /**
     * Set the enableNamespaceResources property: Enable namespace as Azure resource. The default value is false. It can
     * be enabled/disabled on creation and updation of the managed cluster. See
     * [https://aka.ms/NamespaceARMResource](https://aka.ms/NamespaceARMResource) for more details on Namespace as a ARM
     * Resource.
     *
     * @param enableNamespaceResources the enableNamespaceResources value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withEnableNamespaceResources(Boolean enableNamespaceResources) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withEnableNamespaceResources(enableNamespaceResources);
        return this;
    }

    /**
     * Get the networkProfile property: The network configuration profile.
     *
     * @return the networkProfile value.
     */
    public ContainerServiceNetworkProfile networkProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().networkProfile();
    }

    /**
     * Set the networkProfile property: The network configuration profile.
     *
     * @param networkProfile the networkProfile value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withNetworkProfile(ContainerServiceNetworkProfile networkProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withNetworkProfile(networkProfile);
        return this;
    }

    /**
     * Get the aadProfile property: AADProfile specifies attributes for Azure Active Directory integration. The Azure
     * Active Directory configuration.
     *
     * @return the aadProfile value.
     */
    public ManagedClusterAadProfile aadProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().aadProfile();
    }

    /**
     * Set the aadProfile property: AADProfile specifies attributes for Azure Active Directory integration. The Azure
     * Active Directory configuration.
     *
     * @param aadProfile the aadProfile value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withAadProfile(ManagedClusterAadProfile aadProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withAadProfile(aadProfile);
        return this;
    }

    /**
     * Get the autoUpgradeProfile property: The auto upgrade configuration.
     *
     * @return the autoUpgradeProfile value.
     */
    public ManagedClusterAutoUpgradeProfile autoUpgradeProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().autoUpgradeProfile();
    }

    /**
     * Set the autoUpgradeProfile property: The auto upgrade configuration.
     *
     * @param autoUpgradeProfile the autoUpgradeProfile value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withAutoUpgradeProfile(ManagedClusterAutoUpgradeProfile autoUpgradeProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withAutoUpgradeProfile(autoUpgradeProfile);
        return this;
    }

    /**
     * Get the autoScalerProfile property: Parameters to be applied to the cluster-autoscaler when enabled.
     *
     * @return the autoScalerProfile value.
     */
    public ManagedClusterPropertiesAutoScalerProfile autoScalerProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().autoScalerProfile();
    }

    /**
     * Set the autoScalerProfile property: Parameters to be applied to the cluster-autoscaler when enabled.
     *
     * @param autoScalerProfile the autoScalerProfile value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withAutoScalerProfile(ManagedClusterPropertiesAutoScalerProfile autoScalerProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withAutoScalerProfile(autoScalerProfile);
        return this;
    }

    /**
     * Get the apiServerAccessProfile property: The access profile for managed cluster API server.
     *
     * @return the apiServerAccessProfile value.
     */
    public ManagedClusterApiServerAccessProfile apiServerAccessProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().apiServerAccessProfile();
    }

    /**
     * Set the apiServerAccessProfile property: The access profile for managed cluster API server.
     *
     * @param apiServerAccessProfile the apiServerAccessProfile value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withApiServerAccessProfile(ManagedClusterApiServerAccessProfile apiServerAccessProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withApiServerAccessProfile(apiServerAccessProfile);
        return this;
    }

    /**
     * Get the diskEncryptionSetId property: The Resource ID of the disk encryption set to use for enabling encryption
     * at rest. This is of the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/diskEncryptionSets/{encryptionSetName}'.
     *
     * @return the diskEncryptionSetId value.
     */
    public String diskEncryptionSetId() {
        return this.innerProperties() == null ? null : this.innerProperties().diskEncryptionSetId();
    }

    /**
     * Set the diskEncryptionSetId property: The Resource ID of the disk encryption set to use for enabling encryption
     * at rest. This is of the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/diskEncryptionSets/{encryptionSetName}'.
     *
     * @param diskEncryptionSetId the diskEncryptionSetId value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withDiskEncryptionSetId(String diskEncryptionSetId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withDiskEncryptionSetId(diskEncryptionSetId);
        return this;
    }

    /**
     * Get the identityProfile property: Identities associated with the cluster.
     *
     * @return the identityProfile value.
     */
    public Map<String, UserAssignedIdentity> identityProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().identityProfile();
    }

    /**
     * Set the identityProfile property: Identities associated with the cluster.
     *
     * @param identityProfile the identityProfile value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withIdentityProfile(Map<String, UserAssignedIdentity> identityProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withIdentityProfile(identityProfile);
        return this;
    }

    /**
     * Get the privateLinkResources property: Private link resources associated with the cluster.
     *
     * @return the privateLinkResources value.
     */
    public List<PrivateLinkResourceInner> privateLinkResources() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkResources();
    }

    /**
     * Set the privateLinkResources property: Private link resources associated with the cluster.
     *
     * @param privateLinkResources the privateLinkResources value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withPrivateLinkResources(List<PrivateLinkResourceInner> privateLinkResources) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withPrivateLinkResources(privateLinkResources);
        return this;
    }

    /**
     * Get the disableLocalAccounts property: If local accounts should be disabled on the Managed Cluster. If set to
     * true, getting static credentials will be disabled for this cluster. This must only be used on Managed Clusters
     * that are AAD enabled. For more details see [disable local
     * accounts](https://docs.microsoft.com/azure/aks/managed-aad#disable-local-accounts-preview).
     *
     * @return the disableLocalAccounts value.
     */
    public Boolean disableLocalAccounts() {
        return this.innerProperties() == null ? null : this.innerProperties().disableLocalAccounts();
    }

    /**
     * Set the disableLocalAccounts property: If local accounts should be disabled on the Managed Cluster. If set to
     * true, getting static credentials will be disabled for this cluster. This must only be used on Managed Clusters
     * that are AAD enabled. For more details see [disable local
     * accounts](https://docs.microsoft.com/azure/aks/managed-aad#disable-local-accounts-preview).
     *
     * @param disableLocalAccounts the disableLocalAccounts value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withDisableLocalAccounts(Boolean disableLocalAccounts) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withDisableLocalAccounts(disableLocalAccounts);
        return this;
    }

    /**
     * Get the httpProxyConfig property: Configurations for provisioning the cluster with HTTP proxy servers.
     *
     * @return the httpProxyConfig value.
     */
    public ManagedClusterHttpProxyConfig httpProxyConfig() {
        return this.innerProperties() == null ? null : this.innerProperties().httpProxyConfig();
    }

    /**
     * Set the httpProxyConfig property: Configurations for provisioning the cluster with HTTP proxy servers.
     *
     * @param httpProxyConfig the httpProxyConfig value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withHttpProxyConfig(ManagedClusterHttpProxyConfig httpProxyConfig) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withHttpProxyConfig(httpProxyConfig);
        return this;
    }

    /**
     * Get the securityProfile property: Security profile for the managed cluster.
     *
     * @return the securityProfile value.
     */
    public ManagedClusterSecurityProfile securityProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().securityProfile();
    }

    /**
     * Set the securityProfile property: Security profile for the managed cluster.
     *
     * @param securityProfile the securityProfile value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withSecurityProfile(ManagedClusterSecurityProfile securityProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withSecurityProfile(securityProfile);
        return this;
    }

    /**
     * Get the storageProfile property: Storage profile for the managed cluster.
     *
     * @return the storageProfile value.
     */
    public ManagedClusterStorageProfile storageProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().storageProfile();
    }

    /**
     * Set the storageProfile property: Storage profile for the managed cluster.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withStorageProfile(ManagedClusterStorageProfile storageProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withStorageProfile(storageProfile);
        return this;
    }

    /**
     * Get the ingressProfile property: Ingress profile for the managed cluster.
     *
     * @return the ingressProfile value.
     */
    public ManagedClusterIngressProfile ingressProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().ingressProfile();
    }

    /**
     * Set the ingressProfile property: Ingress profile for the managed cluster.
     *
     * @param ingressProfile the ingressProfile value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withIngressProfile(ManagedClusterIngressProfile ingressProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withIngressProfile(ingressProfile);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: PublicNetworkAccess of the managedCluster Allow or deny public network
     * access for AKS.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: PublicNetworkAccess of the managedCluster Allow or deny public network
     * access for AKS.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the workloadAutoScalerProfile property: Workload Auto-scaler profile for the container service cluster.
     *
     * @return the workloadAutoScalerProfile value.
     */
    public ManagedClusterWorkloadAutoScalerProfile workloadAutoScalerProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().workloadAutoScalerProfile();
    }

    /**
     * Set the workloadAutoScalerProfile property: Workload Auto-scaler profile for the container service cluster.
     *
     * @param workloadAutoScalerProfile the workloadAutoScalerProfile value to set.
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withWorkloadAutoScalerProfile(
        ManagedClusterWorkloadAutoScalerProfile workloadAutoScalerProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterProperties();
        }
        this.innerProperties().withWorkloadAutoScalerProfile(workloadAutoScalerProfile);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
