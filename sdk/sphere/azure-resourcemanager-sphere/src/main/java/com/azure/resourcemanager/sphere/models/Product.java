// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sphere.fluent.models.ProductInner;

/** An immutable client-side representation of Product. */
public interface Product {
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
     * Gets the description property: Description of the product.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the provisioningState property: The status of the last operation.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.sphere.fluent.models.ProductInner object.
     *
     * @return the inner object.
     */
    ProductInner innerModel();

    /** The entirety of the Product definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The Product definition stages. */
    interface DefinitionStages {
        /** The first stage of the Product definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the Product definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, catalogName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param catalogName Name of catalog.
             * @return the next definition stage.
             */
            WithCreate withExistingCatalog(String resourceGroupName, String catalogName);
        }

        /**
         * The stage of the Product definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithDescription {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Product create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Product create(Context context);
        }

        /** The stage of the Product definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Description of the product.
             *
             * @param description Description of the product.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
    }

    /**
     * Begins update for the Product resource.
     *
     * @return the stage of resource update.
     */
    Product.Update update();

    /** The template for Product update. */
    interface Update extends UpdateStages.WithDescription {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Product apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Product apply(Context context);
    }

    /** The Product update stages. */
    interface UpdateStages {
        /** The stage of the Product update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Description of the product.
             *
             * @param description Description of the product.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Product refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Product refresh(Context context);

    /**
     * Counts devices in product. '.default' and '.unassigned' are system defined values and cannot be used for product
     * name.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to the action call for count devices in a catalog along with {@link Response}.
     */
    Response<CountDeviceResponse> countDevicesWithResponse(Context context);

    /**
     * Counts devices in product. '.default' and '.unassigned' are system defined values and cannot be used for product
     * name.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to the action call for count devices in a catalog.
     */
    CountDeviceResponse countDevices();

    /**
     * Generates default device groups for the product. '.default' and '.unassigned' are system defined values and
     * cannot be used for product name.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DeviceGroup list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DeviceGroup> generateDefaultDeviceGroups();

    /**
     * Generates default device groups for the product. '.default' and '.unassigned' are system defined values and
     * cannot be used for product name.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DeviceGroup list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DeviceGroup> generateDefaultDeviceGroups(Context context);
}
