// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.PublicIpAddressInner;
import java.util.Map;

/** An immutable client-side representation of PublicIpAddress. */
public interface PublicIpAddress {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the publicIpAllocationMethod property: Gets or sets PublicIP allocation method (Static/Dynamic).
     *
     * @return the publicIpAllocationMethod value.
     */
    IpAllocationMethod publicIpAllocationMethod();

    /**
     * Gets the ipConfiguration property: Gets a reference to the network interface IP configurations using this public
     * IP address.
     *
     * @return the ipConfiguration value.
     */
    SubResource ipConfiguration();

    /**
     * Gets the dnsSettings property: Gets or sets FQDN of the DNS record associated with the public IP address.
     *
     * @return the dnsSettings value.
     */
    PublicIpAddressDnsSettings dnsSettings();

    /**
     * Gets the ipAddress property: Gets the assigned public IP address.
     *
     * @return the ipAddress value.
     */
    String ipAddress();

    /**
     * Gets the idleTimeoutInMinutes property: Gets or sets the idle timeout of the public IP address.
     *
     * @return the idleTimeoutInMinutes value.
     */
    Integer idleTimeoutInMinutes();

    /**
     * Gets the resourceGuid property: Gets or sets resource guid property of the PublicIP resource.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.PublicIpAddressInner object.
     *
     * @return the inner object.
     */
    PublicIpAddressInner innerModel();

    /** The entirety of the PublicIpAddress definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The PublicIpAddress definition stages. */
    interface DefinitionStages {
        /** The first stage of the PublicIpAddress definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the PublicIpAddress definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the PublicIpAddress definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the PublicIpAddress definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithEtag,
                DefinitionStages.WithPublicIpAllocationMethod,
                DefinitionStages.WithIpConfiguration,
                DefinitionStages.WithDnsSettings,
                DefinitionStages.WithIpAddress,
                DefinitionStages.WithIdleTimeoutInMinutes,
                DefinitionStages.WithResourceGuid,
                DefinitionStages.WithProvisioningState {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PublicIpAddress create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PublicIpAddress create(Context context);
        }
        /** The stage of the PublicIpAddress definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the PublicIpAddress definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: Gets a unique read-only string that changes whenever the resource is
             * updated.
             *
             * @param etag Gets a unique read-only string that changes whenever the resource is updated.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the PublicIpAddress definition allowing to specify publicIpAllocationMethod. */
        interface WithPublicIpAllocationMethod {
            /**
             * Specifies the publicIpAllocationMethod property: Gets or sets PublicIP allocation method
             * (Static/Dynamic).
             *
             * @param publicIpAllocationMethod Gets or sets PublicIP allocation method (Static/Dynamic).
             * @return the next definition stage.
             */
            WithCreate withPublicIpAllocationMethod(IpAllocationMethod publicIpAllocationMethod);
        }
        /** The stage of the PublicIpAddress definition allowing to specify ipConfiguration. */
        interface WithIpConfiguration {
            /**
             * Specifies the ipConfiguration property: Gets a reference to the network interface IP configurations using
             * this public IP address.
             *
             * @param ipConfiguration Gets a reference to the network interface IP configurations using this public IP
             *     address.
             * @return the next definition stage.
             */
            WithCreate withIpConfiguration(SubResource ipConfiguration);
        }
        /** The stage of the PublicIpAddress definition allowing to specify dnsSettings. */
        interface WithDnsSettings {
            /**
             * Specifies the dnsSettings property: Gets or sets FQDN of the DNS record associated with the public IP
             * address.
             *
             * @param dnsSettings Gets or sets FQDN of the DNS record associated with the public IP address.
             * @return the next definition stage.
             */
            WithCreate withDnsSettings(PublicIpAddressDnsSettings dnsSettings);
        }
        /** The stage of the PublicIpAddress definition allowing to specify ipAddress. */
        interface WithIpAddress {
            /**
             * Specifies the ipAddress property: Gets the assigned public IP address.
             *
             * @param ipAddress Gets the assigned public IP address.
             * @return the next definition stage.
             */
            WithCreate withIpAddress(String ipAddress);
        }
        /** The stage of the PublicIpAddress definition allowing to specify idleTimeoutInMinutes. */
        interface WithIdleTimeoutInMinutes {
            /**
             * Specifies the idleTimeoutInMinutes property: Gets or sets the idle timeout of the public IP address.
             *
             * @param idleTimeoutInMinutes Gets or sets the idle timeout of the public IP address.
             * @return the next definition stage.
             */
            WithCreate withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes);
        }
        /** The stage of the PublicIpAddress definition allowing to specify resourceGuid. */
        interface WithResourceGuid {
            /**
             * Specifies the resourceGuid property: Gets or sets resource guid property of the PublicIP resource.
             *
             * @param resourceGuid Gets or sets resource guid property of the PublicIP resource.
             * @return the next definition stage.
             */
            WithCreate withResourceGuid(String resourceGuid);
        }
        /** The stage of the PublicIpAddress definition allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: Gets or sets Provisioning state of the PublicIP resource
             * Updating/Deleting/Failed.
             *
             * @param provisioningState Gets or sets Provisioning state of the PublicIP resource
             *     Updating/Deleting/Failed.
             * @return the next definition stage.
             */
            WithCreate withProvisioningState(String provisioningState);
        }
    }
    /**
     * Begins update for the PublicIpAddress resource.
     *
     * @return the stage of resource update.
     */
    PublicIpAddress.Update update();

    /** The template for PublicIpAddress update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithEtag,
            UpdateStages.WithPublicIpAllocationMethod,
            UpdateStages.WithIpConfiguration,
            UpdateStages.WithDnsSettings,
            UpdateStages.WithIpAddress,
            UpdateStages.WithIdleTimeoutInMinutes,
            UpdateStages.WithResourceGuid,
            UpdateStages.WithProvisioningState {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PublicIpAddress apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PublicIpAddress apply(Context context);
    }
    /** The PublicIpAddress update stages. */
    interface UpdateStages {
        /** The stage of the PublicIpAddress update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the PublicIpAddress update allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: Gets a unique read-only string that changes whenever the resource is
             * updated.
             *
             * @param etag Gets a unique read-only string that changes whenever the resource is updated.
             * @return the next definition stage.
             */
            Update withEtag(String etag);
        }
        /** The stage of the PublicIpAddress update allowing to specify publicIpAllocationMethod. */
        interface WithPublicIpAllocationMethod {
            /**
             * Specifies the publicIpAllocationMethod property: Gets or sets PublicIP allocation method
             * (Static/Dynamic).
             *
             * @param publicIpAllocationMethod Gets or sets PublicIP allocation method (Static/Dynamic).
             * @return the next definition stage.
             */
            Update withPublicIpAllocationMethod(IpAllocationMethod publicIpAllocationMethod);
        }
        /** The stage of the PublicIpAddress update allowing to specify ipConfiguration. */
        interface WithIpConfiguration {
            /**
             * Specifies the ipConfiguration property: Gets a reference to the network interface IP configurations using
             * this public IP address.
             *
             * @param ipConfiguration Gets a reference to the network interface IP configurations using this public IP
             *     address.
             * @return the next definition stage.
             */
            Update withIpConfiguration(SubResource ipConfiguration);
        }
        /** The stage of the PublicIpAddress update allowing to specify dnsSettings. */
        interface WithDnsSettings {
            /**
             * Specifies the dnsSettings property: Gets or sets FQDN of the DNS record associated with the public IP
             * address.
             *
             * @param dnsSettings Gets or sets FQDN of the DNS record associated with the public IP address.
             * @return the next definition stage.
             */
            Update withDnsSettings(PublicIpAddressDnsSettings dnsSettings);
        }
        /** The stage of the PublicIpAddress update allowing to specify ipAddress. */
        interface WithIpAddress {
            /**
             * Specifies the ipAddress property: Gets the assigned public IP address.
             *
             * @param ipAddress Gets the assigned public IP address.
             * @return the next definition stage.
             */
            Update withIpAddress(String ipAddress);
        }
        /** The stage of the PublicIpAddress update allowing to specify idleTimeoutInMinutes. */
        interface WithIdleTimeoutInMinutes {
            /**
             * Specifies the idleTimeoutInMinutes property: Gets or sets the idle timeout of the public IP address.
             *
             * @param idleTimeoutInMinutes Gets or sets the idle timeout of the public IP address.
             * @return the next definition stage.
             */
            Update withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes);
        }
        /** The stage of the PublicIpAddress update allowing to specify resourceGuid. */
        interface WithResourceGuid {
            /**
             * Specifies the resourceGuid property: Gets or sets resource guid property of the PublicIP resource.
             *
             * @param resourceGuid Gets or sets resource guid property of the PublicIP resource.
             * @return the next definition stage.
             */
            Update withResourceGuid(String resourceGuid);
        }
        /** The stage of the PublicIpAddress update allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: Gets or sets Provisioning state of the PublicIP resource
             * Updating/Deleting/Failed.
             *
             * @param provisioningState Gets or sets Provisioning state of the PublicIP resource
             *     Updating/Deleting/Failed.
             * @return the next definition stage.
             */
            Update withProvisioningState(String provisioningState);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PublicIpAddress refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PublicIpAddress refresh(Context context);
}
