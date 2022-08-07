// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.InstancePoolInner;
import java.util.Map;

/** An immutable client-side representation of InstancePool. */
public interface InstancePool {
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
     * Gets the sku property: The name and tier of the SKU.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the subnetId property: Resource ID of the subnet to place this instance pool in.
     *
     * @return the subnetId value.
     */
    String subnetId();

    /**
     * Gets the vCores property: Count of vCores belonging to this instance pool.
     *
     * @return the vCores value.
     */
    int vCores();

    /**
     * Gets the licenseType property: The license type. Possible values are 'LicenseIncluded' (price for SQL license is
     * included) and 'BasePrice' (without SQL license price).
     *
     * @return the licenseType value.
     */
    InstancePoolLicenseType licenseType();

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
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.InstancePoolInner object.
     *
     * @return the inner object.
     */
    InstancePoolInner innerModel();

    /** The entirety of the InstancePool definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The InstancePool definition stages. */
    interface DefinitionStages {
        /** The first stage of the InstancePool definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the InstancePool definition allowing to specify location. */
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
        /** The stage of the InstancePool definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the InstancePool definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSku,
                DefinitionStages.WithSubnetId,
                DefinitionStages.WithVCores,
                DefinitionStages.WithLicenseType {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            InstancePool create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            InstancePool create(Context context);
        }
        /** The stage of the InstancePool definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the InstancePool definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The name and tier of the SKU..
             *
             * @param sku The name and tier of the SKU.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /** The stage of the InstancePool definition allowing to specify subnetId. */
        interface WithSubnetId {
            /**
             * Specifies the subnetId property: Resource ID of the subnet to place this instance pool in..
             *
             * @param subnetId Resource ID of the subnet to place this instance pool in.
             * @return the next definition stage.
             */
            WithCreate withSubnetId(String subnetId);
        }
        /** The stage of the InstancePool definition allowing to specify vCores. */
        interface WithVCores {
            /**
             * Specifies the vCores property: Count of vCores belonging to this instance pool..
             *
             * @param vCores Count of vCores belonging to this instance pool.
             * @return the next definition stage.
             */
            WithCreate withVCores(int vCores);
        }
        /** The stage of the InstancePool definition allowing to specify licenseType. */
        interface WithLicenseType {
            /**
             * Specifies the licenseType property: The license type. Possible values are 'LicenseIncluded' (price for
             * SQL license is included) and 'BasePrice' (without SQL license price)..
             *
             * @param licenseType The license type. Possible values are 'LicenseIncluded' (price for SQL license is
             *     included) and 'BasePrice' (without SQL license price).
             * @return the next definition stage.
             */
            WithCreate withLicenseType(InstancePoolLicenseType licenseType);
        }
    }
    /**
     * Begins update for the InstancePool resource.
     *
     * @return the stage of resource update.
     */
    InstancePool.Update update();

    /** The template for InstancePool update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        InstancePool apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        InstancePool apply(Context context);
    }
    /** The InstancePool update stages. */
    interface UpdateStages {
        /** The stage of the InstancePool update allowing to specify tags. */
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
    InstancePool refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    InstancePool refresh(Context context);
}
