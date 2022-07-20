// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.ApplicationGroupInner;
import java.util.List;

/** An immutable client-side representation of ApplicationGroup. */
public interface ApplicationGroup {
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
     * Gets the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the isEnabled property: Determines if Application Group is allowed to create connection with namespace or
     * not. Once the isEnabled is set to false, all the existing connections of application group gets dropped and no
     * new connections will be allowed.
     *
     * @return the isEnabled value.
     */
    Boolean isEnabled();

    /**
     * Gets the clientAppGroupIdentifier property: The Unique identifier for application group.Supports
     * SAS(SASKeyName=KeyName) or AAD(AADAppID=Guid).
     *
     * @return the clientAppGroupIdentifier value.
     */
    String clientAppGroupIdentifier();

    /**
     * Gets the policies property: List of group policies that define the behavior of application group. The policies
     * can support resource governance scenarios such as limiting ingress or egress traffic.
     *
     * @return the policies value.
     */
    List<ApplicationGroupPolicy> policies();

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
     * Gets the inner com.azure.resourcemanager.eventhubs.generated.fluent.models.ApplicationGroupInner object.
     *
     * @return the inner object.
     */
    ApplicationGroupInner innerModel();

    /** The entirety of the ApplicationGroup definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ApplicationGroup definition stages. */
    interface DefinitionStages {
        /** The first stage of the ApplicationGroup definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ApplicationGroup definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, namespaceName.
             *
             * @param resourceGroupName Name of the resource group within the azure subscription.
             * @param namespaceName The Namespace name.
             * @return the next definition stage.
             */
            WithCreate withExistingNamespace(String resourceGroupName, String namespaceName);
        }
        /**
         * The stage of the ApplicationGroup definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithIsEnabled,
                DefinitionStages.WithClientAppGroupIdentifier,
                DefinitionStages.WithPolicies {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ApplicationGroup create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ApplicationGroup create(Context context);
        }
        /** The stage of the ApplicationGroup definition allowing to specify isEnabled. */
        interface WithIsEnabled {
            /**
             * Specifies the isEnabled property: Determines if Application Group is allowed to create connection with
             * namespace or not. Once the isEnabled is set to false, all the existing connections of application group
             * gets dropped and no new connections will be allowed.
             *
             * @param isEnabled Determines if Application Group is allowed to create connection with namespace or not.
             *     Once the isEnabled is set to false, all the existing connections of application group gets dropped
             *     and no new connections will be allowed.
             * @return the next definition stage.
             */
            WithCreate withIsEnabled(Boolean isEnabled);
        }
        /** The stage of the ApplicationGroup definition allowing to specify clientAppGroupIdentifier. */
        interface WithClientAppGroupIdentifier {
            /**
             * Specifies the clientAppGroupIdentifier property: The Unique identifier for application group.Supports
             * SAS(SASKeyName=KeyName) or AAD(AADAppID=Guid).
             *
             * @param clientAppGroupIdentifier The Unique identifier for application group.Supports
             *     SAS(SASKeyName=KeyName) or AAD(AADAppID=Guid).
             * @return the next definition stage.
             */
            WithCreate withClientAppGroupIdentifier(String clientAppGroupIdentifier);
        }
        /** The stage of the ApplicationGroup definition allowing to specify policies. */
        interface WithPolicies {
            /**
             * Specifies the policies property: List of group policies that define the behavior of application group.
             * The policies can support resource governance scenarios such as limiting ingress or egress traffic..
             *
             * @param policies List of group policies that define the behavior of application group. The policies can
             *     support resource governance scenarios such as limiting ingress or egress traffic.
             * @return the next definition stage.
             */
            WithCreate withPolicies(List<ApplicationGroupPolicy> policies);
        }
    }
    /**
     * Begins update for the ApplicationGroup resource.
     *
     * @return the stage of resource update.
     */
    ApplicationGroup.Update update();

    /** The template for ApplicationGroup update. */
    interface Update
        extends UpdateStages.WithIsEnabled, UpdateStages.WithClientAppGroupIdentifier, UpdateStages.WithPolicies {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ApplicationGroup apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ApplicationGroup apply(Context context);
    }
    /** The ApplicationGroup update stages. */
    interface UpdateStages {
        /** The stage of the ApplicationGroup update allowing to specify isEnabled. */
        interface WithIsEnabled {
            /**
             * Specifies the isEnabled property: Determines if Application Group is allowed to create connection with
             * namespace or not. Once the isEnabled is set to false, all the existing connections of application group
             * gets dropped and no new connections will be allowed.
             *
             * @param isEnabled Determines if Application Group is allowed to create connection with namespace or not.
             *     Once the isEnabled is set to false, all the existing connections of application group gets dropped
             *     and no new connections will be allowed.
             * @return the next definition stage.
             */
            Update withIsEnabled(Boolean isEnabled);
        }
        /** The stage of the ApplicationGroup update allowing to specify clientAppGroupIdentifier. */
        interface WithClientAppGroupIdentifier {
            /**
             * Specifies the clientAppGroupIdentifier property: The Unique identifier for application group.Supports
             * SAS(SASKeyName=KeyName) or AAD(AADAppID=Guid).
             *
             * @param clientAppGroupIdentifier The Unique identifier for application group.Supports
             *     SAS(SASKeyName=KeyName) or AAD(AADAppID=Guid).
             * @return the next definition stage.
             */
            Update withClientAppGroupIdentifier(String clientAppGroupIdentifier);
        }
        /** The stage of the ApplicationGroup update allowing to specify policies. */
        interface WithPolicies {
            /**
             * Specifies the policies property: List of group policies that define the behavior of application group.
             * The policies can support resource governance scenarios such as limiting ingress or egress traffic..
             *
             * @param policies List of group policies that define the behavior of application group. The policies can
             *     support resource governance scenarios such as limiting ingress or egress traffic.
             * @return the next definition stage.
             */
            Update withPolicies(List<ApplicationGroupPolicy> policies);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ApplicationGroup refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ApplicationGroup refresh(Context context);
}
