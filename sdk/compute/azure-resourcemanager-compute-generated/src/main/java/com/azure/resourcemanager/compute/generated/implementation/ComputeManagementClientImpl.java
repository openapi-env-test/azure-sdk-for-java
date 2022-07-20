// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.compute.generated.fluent.AvailabilitySetsClient;
import com.azure.resourcemanager.compute.generated.fluent.CapacityReservationGroupsClient;
import com.azure.resourcemanager.compute.generated.fluent.CapacityReservationsClient;
import com.azure.resourcemanager.compute.generated.fluent.CloudServiceOperatingSystemsClient;
import com.azure.resourcemanager.compute.generated.fluent.CloudServiceRoleInstancesClient;
import com.azure.resourcemanager.compute.generated.fluent.CloudServiceRolesClient;
import com.azure.resourcemanager.compute.generated.fluent.CloudServicesClient;
import com.azure.resourcemanager.compute.generated.fluent.CloudServicesUpdateDomainsClient;
import com.azure.resourcemanager.compute.generated.fluent.CommunityGalleriesClient;
import com.azure.resourcemanager.compute.generated.fluent.CommunityGalleryImageVersionsClient;
import com.azure.resourcemanager.compute.generated.fluent.CommunityGalleryImagesClient;
import com.azure.resourcemanager.compute.generated.fluent.ComputeManagementClient;
import com.azure.resourcemanager.compute.generated.fluent.DedicatedHostGroupsClient;
import com.azure.resourcemanager.compute.generated.fluent.DedicatedHostsClient;
import com.azure.resourcemanager.compute.generated.fluent.DiskAccessesClient;
import com.azure.resourcemanager.compute.generated.fluent.DiskEncryptionSetsClient;
import com.azure.resourcemanager.compute.generated.fluent.DiskRestorePointsClient;
import com.azure.resourcemanager.compute.generated.fluent.DisksClient;
import com.azure.resourcemanager.compute.generated.fluent.GalleriesClient;
import com.azure.resourcemanager.compute.generated.fluent.GalleryApplicationVersionsClient;
import com.azure.resourcemanager.compute.generated.fluent.GalleryApplicationsClient;
import com.azure.resourcemanager.compute.generated.fluent.GalleryImageVersionsClient;
import com.azure.resourcemanager.compute.generated.fluent.GalleryImagesClient;
import com.azure.resourcemanager.compute.generated.fluent.GallerySharingProfilesClient;
import com.azure.resourcemanager.compute.generated.fluent.ImagesClient;
import com.azure.resourcemanager.compute.generated.fluent.LogAnalyticsClient;
import com.azure.resourcemanager.compute.generated.fluent.OperationsClient;
import com.azure.resourcemanager.compute.generated.fluent.ProximityPlacementGroupsClient;
import com.azure.resourcemanager.compute.generated.fluent.ResourceSkusClient;
import com.azure.resourcemanager.compute.generated.fluent.RestorePointCollectionsClient;
import com.azure.resourcemanager.compute.generated.fluent.RestorePointsClient;
import com.azure.resourcemanager.compute.generated.fluent.SharedGalleriesClient;
import com.azure.resourcemanager.compute.generated.fluent.SharedGalleryImageVersionsClient;
import com.azure.resourcemanager.compute.generated.fluent.SharedGalleryImagesClient;
import com.azure.resourcemanager.compute.generated.fluent.SnapshotsClient;
import com.azure.resourcemanager.compute.generated.fluent.SshPublicKeysClient;
import com.azure.resourcemanager.compute.generated.fluent.UsagesClient;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineExtensionImagesClient;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineExtensionsClient;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineImagesClient;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineImagesEdgeZonesClient;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineRunCommandsClient;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineScaleSetExtensionsClient;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineScaleSetRollingUpgradesClient;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineScaleSetVMExtensionsClient;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineScaleSetVMRunCommandsClient;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineScaleSetVMsClient;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineScaleSetsClient;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineSizesClient;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachinesClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the ComputeManagementClientImpl type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class)
public final class ComputeManagementClientImpl implements ComputeManagementClient {
    /**
     * Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of
     * the URI for every service call.
     */
    private final String subscriptionId;

    /**
     * Gets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The UsagesClient object to access its operations. */
    private final UsagesClient usages;

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    public UsagesClient getUsages() {
        return this.usages;
    }

    /** The VirtualMachineSizesClient object to access its operations. */
    private final VirtualMachineSizesClient virtualMachineSizes;

    /**
     * Gets the VirtualMachineSizesClient object to access its operations.
     *
     * @return the VirtualMachineSizesClient object.
     */
    public VirtualMachineSizesClient getVirtualMachineSizes() {
        return this.virtualMachineSizes;
    }

    /** The VirtualMachineScaleSetsClient object to access its operations. */
    private final VirtualMachineScaleSetsClient virtualMachineScaleSets;

    /**
     * Gets the VirtualMachineScaleSetsClient object to access its operations.
     *
     * @return the VirtualMachineScaleSetsClient object.
     */
    public VirtualMachineScaleSetsClient getVirtualMachineScaleSets() {
        return this.virtualMachineScaleSets;
    }

    /** The VirtualMachineScaleSetExtensionsClient object to access its operations. */
    private final VirtualMachineScaleSetExtensionsClient virtualMachineScaleSetExtensions;

    /**
     * Gets the VirtualMachineScaleSetExtensionsClient object to access its operations.
     *
     * @return the VirtualMachineScaleSetExtensionsClient object.
     */
    public VirtualMachineScaleSetExtensionsClient getVirtualMachineScaleSetExtensions() {
        return this.virtualMachineScaleSetExtensions;
    }

    /** The VirtualMachineScaleSetRollingUpgradesClient object to access its operations. */
    private final VirtualMachineScaleSetRollingUpgradesClient virtualMachineScaleSetRollingUpgrades;

    /**
     * Gets the VirtualMachineScaleSetRollingUpgradesClient object to access its operations.
     *
     * @return the VirtualMachineScaleSetRollingUpgradesClient object.
     */
    public VirtualMachineScaleSetRollingUpgradesClient getVirtualMachineScaleSetRollingUpgrades() {
        return this.virtualMachineScaleSetRollingUpgrades;
    }

    /** The VirtualMachineScaleSetVMExtensionsClient object to access its operations. */
    private final VirtualMachineScaleSetVMExtensionsClient virtualMachineScaleSetVMExtensions;

    /**
     * Gets the VirtualMachineScaleSetVMExtensionsClient object to access its operations.
     *
     * @return the VirtualMachineScaleSetVMExtensionsClient object.
     */
    public VirtualMachineScaleSetVMExtensionsClient getVirtualMachineScaleSetVMExtensions() {
        return this.virtualMachineScaleSetVMExtensions;
    }

    /** The VirtualMachineScaleSetVMsClient object to access its operations. */
    private final VirtualMachineScaleSetVMsClient virtualMachineScaleSetVMs;

    /**
     * Gets the VirtualMachineScaleSetVMsClient object to access its operations.
     *
     * @return the VirtualMachineScaleSetVMsClient object.
     */
    public VirtualMachineScaleSetVMsClient getVirtualMachineScaleSetVMs() {
        return this.virtualMachineScaleSetVMs;
    }

    /** The VirtualMachineExtensionsClient object to access its operations. */
    private final VirtualMachineExtensionsClient virtualMachineExtensions;

    /**
     * Gets the VirtualMachineExtensionsClient object to access its operations.
     *
     * @return the VirtualMachineExtensionsClient object.
     */
    public VirtualMachineExtensionsClient getVirtualMachineExtensions() {
        return this.virtualMachineExtensions;
    }

    /** The VirtualMachinesClient object to access its operations. */
    private final VirtualMachinesClient virtualMachines;

    /**
     * Gets the VirtualMachinesClient object to access its operations.
     *
     * @return the VirtualMachinesClient object.
     */
    public VirtualMachinesClient getVirtualMachines() {
        return this.virtualMachines;
    }

    /** The VirtualMachineImagesClient object to access its operations. */
    private final VirtualMachineImagesClient virtualMachineImages;

    /**
     * Gets the VirtualMachineImagesClient object to access its operations.
     *
     * @return the VirtualMachineImagesClient object.
     */
    public VirtualMachineImagesClient getVirtualMachineImages() {
        return this.virtualMachineImages;
    }

    /** The VirtualMachineImagesEdgeZonesClient object to access its operations. */
    private final VirtualMachineImagesEdgeZonesClient virtualMachineImagesEdgeZones;

    /**
     * Gets the VirtualMachineImagesEdgeZonesClient object to access its operations.
     *
     * @return the VirtualMachineImagesEdgeZonesClient object.
     */
    public VirtualMachineImagesEdgeZonesClient getVirtualMachineImagesEdgeZones() {
        return this.virtualMachineImagesEdgeZones;
    }

    /** The VirtualMachineExtensionImagesClient object to access its operations. */
    private final VirtualMachineExtensionImagesClient virtualMachineExtensionImages;

    /**
     * Gets the VirtualMachineExtensionImagesClient object to access its operations.
     *
     * @return the VirtualMachineExtensionImagesClient object.
     */
    public VirtualMachineExtensionImagesClient getVirtualMachineExtensionImages() {
        return this.virtualMachineExtensionImages;
    }

    /** The AvailabilitySetsClient object to access its operations. */
    private final AvailabilitySetsClient availabilitySets;

    /**
     * Gets the AvailabilitySetsClient object to access its operations.
     *
     * @return the AvailabilitySetsClient object.
     */
    public AvailabilitySetsClient getAvailabilitySets() {
        return this.availabilitySets;
    }

    /** The ProximityPlacementGroupsClient object to access its operations. */
    private final ProximityPlacementGroupsClient proximityPlacementGroups;

    /**
     * Gets the ProximityPlacementGroupsClient object to access its operations.
     *
     * @return the ProximityPlacementGroupsClient object.
     */
    public ProximityPlacementGroupsClient getProximityPlacementGroups() {
        return this.proximityPlacementGroups;
    }

    /** The DedicatedHostGroupsClient object to access its operations. */
    private final DedicatedHostGroupsClient dedicatedHostGroups;

    /**
     * Gets the DedicatedHostGroupsClient object to access its operations.
     *
     * @return the DedicatedHostGroupsClient object.
     */
    public DedicatedHostGroupsClient getDedicatedHostGroups() {
        return this.dedicatedHostGroups;
    }

    /** The DedicatedHostsClient object to access its operations. */
    private final DedicatedHostsClient dedicatedHosts;

    /**
     * Gets the DedicatedHostsClient object to access its operations.
     *
     * @return the DedicatedHostsClient object.
     */
    public DedicatedHostsClient getDedicatedHosts() {
        return this.dedicatedHosts;
    }

    /** The SshPublicKeysClient object to access its operations. */
    private final SshPublicKeysClient sshPublicKeys;

    /**
     * Gets the SshPublicKeysClient object to access its operations.
     *
     * @return the SshPublicKeysClient object.
     */
    public SshPublicKeysClient getSshPublicKeys() {
        return this.sshPublicKeys;
    }

    /** The ImagesClient object to access its operations. */
    private final ImagesClient images;

    /**
     * Gets the ImagesClient object to access its operations.
     *
     * @return the ImagesClient object.
     */
    public ImagesClient getImages() {
        return this.images;
    }

    /** The RestorePointCollectionsClient object to access its operations. */
    private final RestorePointCollectionsClient restorePointCollections;

    /**
     * Gets the RestorePointCollectionsClient object to access its operations.
     *
     * @return the RestorePointCollectionsClient object.
     */
    public RestorePointCollectionsClient getRestorePointCollections() {
        return this.restorePointCollections;
    }

    /** The RestorePointsClient object to access its operations. */
    private final RestorePointsClient restorePoints;

    /**
     * Gets the RestorePointsClient object to access its operations.
     *
     * @return the RestorePointsClient object.
     */
    public RestorePointsClient getRestorePoints() {
        return this.restorePoints;
    }

    /** The CapacityReservationGroupsClient object to access its operations. */
    private final CapacityReservationGroupsClient capacityReservationGroups;

    /**
     * Gets the CapacityReservationGroupsClient object to access its operations.
     *
     * @return the CapacityReservationGroupsClient object.
     */
    public CapacityReservationGroupsClient getCapacityReservationGroups() {
        return this.capacityReservationGroups;
    }

    /** The CapacityReservationsClient object to access its operations. */
    private final CapacityReservationsClient capacityReservations;

    /**
     * Gets the CapacityReservationsClient object to access its operations.
     *
     * @return the CapacityReservationsClient object.
     */
    public CapacityReservationsClient getCapacityReservations() {
        return this.capacityReservations;
    }

    /** The LogAnalyticsClient object to access its operations. */
    private final LogAnalyticsClient logAnalytics;

    /**
     * Gets the LogAnalyticsClient object to access its operations.
     *
     * @return the LogAnalyticsClient object.
     */
    public LogAnalyticsClient getLogAnalytics() {
        return this.logAnalytics;
    }

    /** The VirtualMachineRunCommandsClient object to access its operations. */
    private final VirtualMachineRunCommandsClient virtualMachineRunCommands;

    /**
     * Gets the VirtualMachineRunCommandsClient object to access its operations.
     *
     * @return the VirtualMachineRunCommandsClient object.
     */
    public VirtualMachineRunCommandsClient getVirtualMachineRunCommands() {
        return this.virtualMachineRunCommands;
    }

    /** The VirtualMachineScaleSetVMRunCommandsClient object to access its operations. */
    private final VirtualMachineScaleSetVMRunCommandsClient virtualMachineScaleSetVMRunCommands;

    /**
     * Gets the VirtualMachineScaleSetVMRunCommandsClient object to access its operations.
     *
     * @return the VirtualMachineScaleSetVMRunCommandsClient object.
     */
    public VirtualMachineScaleSetVMRunCommandsClient getVirtualMachineScaleSetVMRunCommands() {
        return this.virtualMachineScaleSetVMRunCommands;
    }

    /** The DisksClient object to access its operations. */
    private final DisksClient disks;

    /**
     * Gets the DisksClient object to access its operations.
     *
     * @return the DisksClient object.
     */
    public DisksClient getDisks() {
        return this.disks;
    }

    /** The DiskAccessesClient object to access its operations. */
    private final DiskAccessesClient diskAccesses;

    /**
     * Gets the DiskAccessesClient object to access its operations.
     *
     * @return the DiskAccessesClient object.
     */
    public DiskAccessesClient getDiskAccesses() {
        return this.diskAccesses;
    }

    /** The DiskEncryptionSetsClient object to access its operations. */
    private final DiskEncryptionSetsClient diskEncryptionSets;

    /**
     * Gets the DiskEncryptionSetsClient object to access its operations.
     *
     * @return the DiskEncryptionSetsClient object.
     */
    public DiskEncryptionSetsClient getDiskEncryptionSets() {
        return this.diskEncryptionSets;
    }

    /** The DiskRestorePointsClient object to access its operations. */
    private final DiskRestorePointsClient diskRestorePoints;

    /**
     * Gets the DiskRestorePointsClient object to access its operations.
     *
     * @return the DiskRestorePointsClient object.
     */
    public DiskRestorePointsClient getDiskRestorePoints() {
        return this.diskRestorePoints;
    }

    /** The SnapshotsClient object to access its operations. */
    private final SnapshotsClient snapshots;

    /**
     * Gets the SnapshotsClient object to access its operations.
     *
     * @return the SnapshotsClient object.
     */
    public SnapshotsClient getSnapshots() {
        return this.snapshots;
    }

    /** The ResourceSkusClient object to access its operations. */
    private final ResourceSkusClient resourceSkus;

    /**
     * Gets the ResourceSkusClient object to access its operations.
     *
     * @return the ResourceSkusClient object.
     */
    public ResourceSkusClient getResourceSkus() {
        return this.resourceSkus;
    }

    /** The GalleriesClient object to access its operations. */
    private final GalleriesClient galleries;

    /**
     * Gets the GalleriesClient object to access its operations.
     *
     * @return the GalleriesClient object.
     */
    public GalleriesClient getGalleries() {
        return this.galleries;
    }

    /** The GalleryImagesClient object to access its operations. */
    private final GalleryImagesClient galleryImages;

    /**
     * Gets the GalleryImagesClient object to access its operations.
     *
     * @return the GalleryImagesClient object.
     */
    public GalleryImagesClient getGalleryImages() {
        return this.galleryImages;
    }

    /** The GalleryImageVersionsClient object to access its operations. */
    private final GalleryImageVersionsClient galleryImageVersions;

    /**
     * Gets the GalleryImageVersionsClient object to access its operations.
     *
     * @return the GalleryImageVersionsClient object.
     */
    public GalleryImageVersionsClient getGalleryImageVersions() {
        return this.galleryImageVersions;
    }

    /** The GalleryApplicationsClient object to access its operations. */
    private final GalleryApplicationsClient galleryApplications;

    /**
     * Gets the GalleryApplicationsClient object to access its operations.
     *
     * @return the GalleryApplicationsClient object.
     */
    public GalleryApplicationsClient getGalleryApplications() {
        return this.galleryApplications;
    }

    /** The GalleryApplicationVersionsClient object to access its operations. */
    private final GalleryApplicationVersionsClient galleryApplicationVersions;

    /**
     * Gets the GalleryApplicationVersionsClient object to access its operations.
     *
     * @return the GalleryApplicationVersionsClient object.
     */
    public GalleryApplicationVersionsClient getGalleryApplicationVersions() {
        return this.galleryApplicationVersions;
    }

    /** The GallerySharingProfilesClient object to access its operations. */
    private final GallerySharingProfilesClient gallerySharingProfiles;

    /**
     * Gets the GallerySharingProfilesClient object to access its operations.
     *
     * @return the GallerySharingProfilesClient object.
     */
    public GallerySharingProfilesClient getGallerySharingProfiles() {
        return this.gallerySharingProfiles;
    }

    /** The SharedGalleriesClient object to access its operations. */
    private final SharedGalleriesClient sharedGalleries;

    /**
     * Gets the SharedGalleriesClient object to access its operations.
     *
     * @return the SharedGalleriesClient object.
     */
    public SharedGalleriesClient getSharedGalleries() {
        return this.sharedGalleries;
    }

    /** The SharedGalleryImagesClient object to access its operations. */
    private final SharedGalleryImagesClient sharedGalleryImages;

    /**
     * Gets the SharedGalleryImagesClient object to access its operations.
     *
     * @return the SharedGalleryImagesClient object.
     */
    public SharedGalleryImagesClient getSharedGalleryImages() {
        return this.sharedGalleryImages;
    }

    /** The SharedGalleryImageVersionsClient object to access its operations. */
    private final SharedGalleryImageVersionsClient sharedGalleryImageVersions;

    /**
     * Gets the SharedGalleryImageVersionsClient object to access its operations.
     *
     * @return the SharedGalleryImageVersionsClient object.
     */
    public SharedGalleryImageVersionsClient getSharedGalleryImageVersions() {
        return this.sharedGalleryImageVersions;
    }

    /** The CommunityGalleriesClient object to access its operations. */
    private final CommunityGalleriesClient communityGalleries;

    /**
     * Gets the CommunityGalleriesClient object to access its operations.
     *
     * @return the CommunityGalleriesClient object.
     */
    public CommunityGalleriesClient getCommunityGalleries() {
        return this.communityGalleries;
    }

    /** The CommunityGalleryImagesClient object to access its operations. */
    private final CommunityGalleryImagesClient communityGalleryImages;

    /**
     * Gets the CommunityGalleryImagesClient object to access its operations.
     *
     * @return the CommunityGalleryImagesClient object.
     */
    public CommunityGalleryImagesClient getCommunityGalleryImages() {
        return this.communityGalleryImages;
    }

    /** The CommunityGalleryImageVersionsClient object to access its operations. */
    private final CommunityGalleryImageVersionsClient communityGalleryImageVersions;

    /**
     * Gets the CommunityGalleryImageVersionsClient object to access its operations.
     *
     * @return the CommunityGalleryImageVersionsClient object.
     */
    public CommunityGalleryImageVersionsClient getCommunityGalleryImageVersions() {
        return this.communityGalleryImageVersions;
    }

    /** The CloudServiceRoleInstancesClient object to access its operations. */
    private final CloudServiceRoleInstancesClient cloudServiceRoleInstances;

    /**
     * Gets the CloudServiceRoleInstancesClient object to access its operations.
     *
     * @return the CloudServiceRoleInstancesClient object.
     */
    public CloudServiceRoleInstancesClient getCloudServiceRoleInstances() {
        return this.cloudServiceRoleInstances;
    }

    /** The CloudServiceRolesClient object to access its operations. */
    private final CloudServiceRolesClient cloudServiceRoles;

    /**
     * Gets the CloudServiceRolesClient object to access its operations.
     *
     * @return the CloudServiceRolesClient object.
     */
    public CloudServiceRolesClient getCloudServiceRoles() {
        return this.cloudServiceRoles;
    }

    /** The CloudServicesClient object to access its operations. */
    private final CloudServicesClient cloudServices;

    /**
     * Gets the CloudServicesClient object to access its operations.
     *
     * @return the CloudServicesClient object.
     */
    public CloudServicesClient getCloudServices() {
        return this.cloudServices;
    }

    /** The CloudServicesUpdateDomainsClient object to access its operations. */
    private final CloudServicesUpdateDomainsClient cloudServicesUpdateDomains;

    /**
     * Gets the CloudServicesUpdateDomainsClient object to access its operations.
     *
     * @return the CloudServicesUpdateDomainsClient object.
     */
    public CloudServicesUpdateDomainsClient getCloudServicesUpdateDomains() {
        return this.cloudServicesUpdateDomains;
    }

    /** The CloudServiceOperatingSystemsClient object to access its operations. */
    private final CloudServiceOperatingSystemsClient cloudServiceOperatingSystems;

    /**
     * Gets the CloudServiceOperatingSystemsClient object to access its operations.
     *
     * @return the CloudServiceOperatingSystemsClient object.
     */
    public CloudServiceOperatingSystemsClient getCloudServiceOperatingSystems() {
        return this.cloudServiceOperatingSystems;
    }

    /**
     * Initializes an instance of ComputeManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId Subscription credentials which uniquely identify Microsoft Azure subscription. The
     *     subscription ID forms part of the URI for every service call.
     * @param endpoint server parameter.
     */
    ComputeManagementClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.operations = new OperationsClientImpl(this);
        this.usages = new UsagesClientImpl(this);
        this.virtualMachineSizes = new VirtualMachineSizesClientImpl(this);
        this.virtualMachineScaleSets = new VirtualMachineScaleSetsClientImpl(this);
        this.virtualMachineScaleSetExtensions = new VirtualMachineScaleSetExtensionsClientImpl(this);
        this.virtualMachineScaleSetRollingUpgrades = new VirtualMachineScaleSetRollingUpgradesClientImpl(this);
        this.virtualMachineScaleSetVMExtensions = new VirtualMachineScaleSetVMExtensionsClientImpl(this);
        this.virtualMachineScaleSetVMs = new VirtualMachineScaleSetVMsClientImpl(this);
        this.virtualMachineExtensions = new VirtualMachineExtensionsClientImpl(this);
        this.virtualMachines = new VirtualMachinesClientImpl(this);
        this.virtualMachineImages = new VirtualMachineImagesClientImpl(this);
        this.virtualMachineImagesEdgeZones = new VirtualMachineImagesEdgeZonesClientImpl(this);
        this.virtualMachineExtensionImages = new VirtualMachineExtensionImagesClientImpl(this);
        this.availabilitySets = new AvailabilitySetsClientImpl(this);
        this.proximityPlacementGroups = new ProximityPlacementGroupsClientImpl(this);
        this.dedicatedHostGroups = new DedicatedHostGroupsClientImpl(this);
        this.dedicatedHosts = new DedicatedHostsClientImpl(this);
        this.sshPublicKeys = new SshPublicKeysClientImpl(this);
        this.images = new ImagesClientImpl(this);
        this.restorePointCollections = new RestorePointCollectionsClientImpl(this);
        this.restorePoints = new RestorePointsClientImpl(this);
        this.capacityReservationGroups = new CapacityReservationGroupsClientImpl(this);
        this.capacityReservations = new CapacityReservationsClientImpl(this);
        this.logAnalytics = new LogAnalyticsClientImpl(this);
        this.virtualMachineRunCommands = new VirtualMachineRunCommandsClientImpl(this);
        this.virtualMachineScaleSetVMRunCommands = new VirtualMachineScaleSetVMRunCommandsClientImpl(this);
        this.disks = new DisksClientImpl(this);
        this.diskAccesses = new DiskAccessesClientImpl(this);
        this.diskEncryptionSets = new DiskEncryptionSetsClientImpl(this);
        this.diskRestorePoints = new DiskRestorePointsClientImpl(this);
        this.snapshots = new SnapshotsClientImpl(this);
        this.resourceSkus = new ResourceSkusClientImpl(this);
        this.galleries = new GalleriesClientImpl(this);
        this.galleryImages = new GalleryImagesClientImpl(this);
        this.galleryImageVersions = new GalleryImageVersionsClientImpl(this);
        this.galleryApplications = new GalleryApplicationsClientImpl(this);
        this.galleryApplicationVersions = new GalleryApplicationVersionsClientImpl(this);
        this.gallerySharingProfiles = new GallerySharingProfilesClientImpl(this);
        this.sharedGalleries = new SharedGalleriesClientImpl(this);
        this.sharedGalleryImages = new SharedGalleryImagesClientImpl(this);
        this.sharedGalleryImageVersions = new SharedGalleryImageVersionsClientImpl(this);
        this.communityGalleries = new CommunityGalleriesClientImpl(this);
        this.communityGalleryImages = new CommunityGalleryImagesClientImpl(this);
        this.communityGalleryImageVersions = new CommunityGalleryImageVersionsClientImpl(this);
        this.cloudServiceRoleInstances = new CloudServiceRoleInstancesClientImpl(this);
        this.cloudServiceRoles = new CloudServiceRolesClientImpl(this);
        this.cloudServices = new CloudServicesClientImpl(this);
        this.cloudServicesUpdateDomains = new CloudServicesUpdateDomainsClientImpl(this);
        this.cloudServiceOperatingSystems = new CloudServiceOperatingSystemsClientImpl(this);
    }

    /**
     * Gets default client context.
     *
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     *
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        return CoreUtils.mergeContexts(this.getContext(), context);
    }

    /**
     * Gets long running operation result.
     *
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(
        Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline,
        Type pollResultType,
        Type finalResultType,
        Context context) {
        return PollerFactory
            .create(
                serializerAdapter,
                httpPipeline,
                pollResultType,
                finalResultType,
                defaultPollInterval,
                activationResponse,
                context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     *
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse =
                    new HttpResponseImpl(
                        lroError.getResponseStatusCode(), lroError.getResponseHeaders(), lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError =
                            this
                                .getSerializerAdapter()
                                .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        LOGGER.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ComputeManagementClientImpl.class);
}
