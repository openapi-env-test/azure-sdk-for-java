// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.ServiceResourceInner;

/** An immutable client-side representation of ServiceResource. */
public interface ServiceResource {
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
     * Gets the properties property: Services response resource.
     *
     * @return the properties value.
     */
    ServiceResourceProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.cosmos.generated.fluent.models.ServiceResourceInner object.
     *
     * @return the inner object.
     */
    ServiceResourceInner innerModel();

    /** The entirety of the ServiceResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ServiceResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the ServiceResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ServiceResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param accountName Cosmos DB database account name.
             * @return the next definition stage.
             */
            WithCreate withExistingDatabaseAccount(String resourceGroupName, String accountName);
        }
        /**
         * The stage of the ServiceResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithInstanceSize,
                DefinitionStages.WithInstanceCount,
                DefinitionStages.WithServiceType {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ServiceResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ServiceResource create(Context context);
        }
        /** The stage of the ServiceResource definition allowing to specify instanceSize. */
        interface WithInstanceSize {
            /**
             * Specifies the instanceSize property: Instance type for the service..
             *
             * @param instanceSize Instance type for the service.
             * @return the next definition stage.
             */
            WithCreate withInstanceSize(ServiceSize instanceSize);
        }
        /** The stage of the ServiceResource definition allowing to specify instanceCount. */
        interface WithInstanceCount {
            /**
             * Specifies the instanceCount property: Instance count for the service..
             *
             * @param instanceCount Instance count for the service.
             * @return the next definition stage.
             */
            WithCreate withInstanceCount(Integer instanceCount);
        }
        /** The stage of the ServiceResource definition allowing to specify serviceType. */
        interface WithServiceType {
            /**
             * Specifies the serviceType property: ServiceType for the service..
             *
             * @param serviceType ServiceType for the service.
             * @return the next definition stage.
             */
            WithCreate withServiceType(ServiceType serviceType);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ServiceResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ServiceResource refresh(Context context);
}
