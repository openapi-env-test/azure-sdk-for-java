// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.resourcemanager.machinelearning.fluent.models.WorkspacePropertiesInner;
import java.util.List;

/** An immutable client-side representation of WorkspaceProperties. */
public interface WorkspaceProperties {
    /**
     * Gets the workspaceId property: The immutable id associated with this workspace.
     *
     * @return the workspaceId value.
     */
    String workspaceId();

    /**
     * Gets the description property: The description of this workspace.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the friendlyName property: The friendly name for this workspace. This name in mutable.
     *
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * Gets the keyVault property: ARM id of the key vault associated with this workspace. This cannot be changed once
     * the workspace has been created.
     *
     * @return the keyVault value.
     */
    String keyVault();

    /**
     * Gets the applicationInsights property: ARM id of the application insights associated with this workspace.
     *
     * @return the applicationInsights value.
     */
    String applicationInsights();

    /**
     * Gets the containerRegistry property: ARM id of the container registry associated with this workspace.
     *
     * @return the containerRegistry value.
     */
    String containerRegistry();

    /**
     * Gets the storageAccount property: ARM id of the storage account associated with this workspace. This cannot be
     * changed once the workspace has been created.
     *
     * @return the storageAccount value.
     */
    String storageAccount();

    /**
     * Gets the discoveryUrl property: Url for the discovery service to identify regional endpoints for machine learning
     * experimentation services.
     *
     * @return the discoveryUrl value.
     */
    String discoveryUrl();

    /**
     * Gets the provisioningState property: The current deployment state of workspace resource. The provisioningState is
     * to indicate states for resource provisioning.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the encryption property: The encryption settings of Azure ML workspace.
     *
     * @return the encryption value.
     */
    EncryptionProperty encryption();

    /**
     * Gets the hbiWorkspace property: The flag to signal HBI data in the workspace and reduce diagnostic data collected
     * by the service.
     *
     * @return the hbiWorkspace value.
     */
    Boolean hbiWorkspace();

    /**
     * Gets the serviceProvisionedResourceGroup property: The name of the managed resource group created by workspace RP
     * in customer subscription if the workspace is CMK workspace.
     *
     * @return the serviceProvisionedResourceGroup value.
     */
    String serviceProvisionedResourceGroup();

    /**
     * Gets the privateLinkCount property: Count of private connections in the workspace.
     *
     * @return the privateLinkCount value.
     */
    Integer privateLinkCount();

    /**
     * Gets the imageBuildCompute property: The compute name for image build.
     *
     * @return the imageBuildCompute value.
     */
    String imageBuildCompute();

    /**
     * Gets the allowPublicAccessWhenBehindVnet property: The flag to indicate whether to allow public access when
     * behind VNet.
     *
     * @return the allowPublicAccessWhenBehindVnet value.
     */
    Boolean allowPublicAccessWhenBehindVnet();

    /**
     * Gets the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * Gets the privateEndpointConnections property: The list of private endpoint connections in the workspace.
     *
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the sharedPrivateLinkResources property: The list of shared private link resources in this workspace.
     *
     * @return the sharedPrivateLinkResources value.
     */
    List<SharedPrivateLinkResource> sharedPrivateLinkResources();

    /**
     * Gets the notebookInfo property: The notebook info of Azure ML workspace.
     *
     * @return the notebookInfo value.
     */
    NotebookResourceInfo notebookInfo();

    /**
     * Gets the serviceManagedResourcesSettings property: The service managed resource settings.
     *
     * @return the serviceManagedResourcesSettings value.
     */
    ServiceManagedResourcesSettings serviceManagedResourcesSettings();

    /**
     * Gets the primaryUserAssignedIdentity property: The user assigned identity resource id that represents the
     * workspace identity.
     *
     * @return the primaryUserAssignedIdentity value.
     */
    String primaryUserAssignedIdentity();

    /**
     * Gets the tenantId property: The tenant id associated with this workspace.
     *
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * Gets the storageHnsEnabled property: If the storage associated with the workspace has hierarchical namespace(HNS)
     * enabled.
     *
     * @return the storageHnsEnabled value.
     */
    Boolean storageHnsEnabled();

    /**
     * Gets the mlFlowTrackingUri property: The URI associated with this workspace that machine learning flow must point
     * at to set up tracking.
     *
     * @return the mlFlowTrackingUri value.
     */
    String mlFlowTrackingUri();

    /**
     * Gets the v1LegacyMode property: Enabling v1_legacy_mode may prevent you from using features provided by the v2
     * API.
     *
     * @return the v1LegacyMode value.
     */
    Boolean v1LegacyMode();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearning.fluent.models.WorkspacePropertiesInner object.
     *
     * @return the inner object.
     */
    WorkspacePropertiesInner innerModel();
}
