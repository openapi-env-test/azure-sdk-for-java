// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.DdosCustomPolicyInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of DdosCustomPolicy. */
public interface DdosCustomPolicy {
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
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the id property: Resource ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the resourceGuid property: The resource GUID property of the DDoS custom policy resource. It uniquely
     * identifies the resource, even if the user changes its name or migrate the resource across subscriptions or
     * resource groups.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: The provisioning state of the DDoS custom policy resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the publicIpAddresses property: The list of public IPs associated with the DDoS custom policy resource. This
     * list is read-only.
     *
     * @return the publicIpAddresses value.
     */
    List<SubResource> publicIpAddresses();

    /**
     * Gets the protocolCustomSettings property: The protocol-specific DDoS policy customization parameters.
     *
     * @return the protocolCustomSettings value.
     */
    List<ProtocolCustomSettingsFormat> protocolCustomSettings();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.DdosCustomPolicyInner object.
     *
     * @return the inner object.
     */
    DdosCustomPolicyInner innerModel();

    /** The entirety of the DdosCustomPolicy definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The DdosCustomPolicy definition stages. */
    interface DefinitionStages {
        /** The first stage of the DdosCustomPolicy definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the DdosCustomPolicy definition allowing to specify location. */
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
        /** The stage of the DdosCustomPolicy definition allowing to specify parent resource. */
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
         * The stage of the DdosCustomPolicy definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithProtocolCustomSettings {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DdosCustomPolicy create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DdosCustomPolicy create(Context context);
        }
        /** The stage of the DdosCustomPolicy definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the DdosCustomPolicy definition allowing to specify protocolCustomSettings. */
        interface WithProtocolCustomSettings {
            /**
             * Specifies the protocolCustomSettings property: The protocol-specific DDoS policy customization
             * parameters..
             *
             * @param protocolCustomSettings The protocol-specific DDoS policy customization parameters.
             * @return the next definition stage.
             */
            WithCreate withProtocolCustomSettings(List<ProtocolCustomSettingsFormat> protocolCustomSettings);
        }
    }
    /**
     * Begins update for the DdosCustomPolicy resource.
     *
     * @return the stage of resource update.
     */
    DdosCustomPolicy.Update update();

    /** The template for DdosCustomPolicy update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DdosCustomPolicy apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DdosCustomPolicy apply(Context context);
    }
    /** The DdosCustomPolicy update stages. */
    interface UpdateStages {
        /** The stage of the DdosCustomPolicy update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DdosCustomPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DdosCustomPolicy refresh(Context context);
}
