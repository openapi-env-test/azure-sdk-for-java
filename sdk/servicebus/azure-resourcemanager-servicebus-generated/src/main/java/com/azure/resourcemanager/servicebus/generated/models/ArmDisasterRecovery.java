// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.servicebus.generated.fluent.models.ArmDisasterRecoveryInner;

/** An immutable client-side representation of ArmDisasterRecovery. */
public interface ArmDisasterRecovery {
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
     * Gets the provisioningState property: Provisioning state of the Alias(Disaster Recovery configuration) - possible
     * values 'Accepted' or 'Succeeded' or 'Failed'.
     *
     * @return the provisioningState value.
     */
    ProvisioningStateDR provisioningState();

    /**
     * Gets the pendingReplicationOperationsCount property: Number of entities pending to be replicated.
     *
     * @return the pendingReplicationOperationsCount value.
     */
    Long pendingReplicationOperationsCount();

    /**
     * Gets the partnerNamespace property: ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO
     * DR pairing.
     *
     * @return the partnerNamespace value.
     */
    String partnerNamespace();

    /**
     * Gets the alternateName property: Primary/Secondary eventhub namespace name, which is part of GEO DR pairing.
     *
     * @return the alternateName value.
     */
    String alternateName();

    /**
     * Gets the role property: role of namespace in GEO DR - possible values 'Primary' or 'PrimaryNotReplicating' or
     * 'Secondary'.
     *
     * @return the role value.
     */
    RoleDisasterRecovery role();

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
     * Gets the inner com.azure.resourcemanager.servicebus.generated.fluent.models.ArmDisasterRecoveryInner object.
     *
     * @return the inner object.
     */
    ArmDisasterRecoveryInner innerModel();

    /** The entirety of the ArmDisasterRecovery definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ArmDisasterRecovery definition stages. */
    interface DefinitionStages {
        /** The first stage of the ArmDisasterRecovery definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ArmDisasterRecovery definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, namespaceName.
             *
             * @param resourceGroupName Name of the Resource group within the Azure subscription.
             * @param namespaceName The namespace name.
             * @return the next definition stage.
             */
            WithCreate withExistingNamespace(String resourceGroupName, String namespaceName);
        }
        /**
         * The stage of the ArmDisasterRecovery definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithPartnerNamespace, DefinitionStages.WithAlternateName {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ArmDisasterRecovery create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ArmDisasterRecovery create(Context context);
        }
        /** The stage of the ArmDisasterRecovery definition allowing to specify partnerNamespace. */
        interface WithPartnerNamespace {
            /**
             * Specifies the partnerNamespace property: ARM Id of the Primary/Secondary eventhub namespace name, which
             * is part of GEO DR pairing.
             *
             * @param partnerNamespace ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR
             *     pairing.
             * @return the next definition stage.
             */
            WithCreate withPartnerNamespace(String partnerNamespace);
        }
        /** The stage of the ArmDisasterRecovery definition allowing to specify alternateName. */
        interface WithAlternateName {
            /**
             * Specifies the alternateName property: Primary/Secondary eventhub namespace name, which is part of GEO DR
             * pairing.
             *
             * @param alternateName Primary/Secondary eventhub namespace name, which is part of GEO DR pairing.
             * @return the next definition stage.
             */
            WithCreate withAlternateName(String alternateName);
        }
    }
    /**
     * Begins update for the ArmDisasterRecovery resource.
     *
     * @return the stage of resource update.
     */
    ArmDisasterRecovery.Update update();

    /** The template for ArmDisasterRecovery update. */
    interface Update extends UpdateStages.WithPartnerNamespace, UpdateStages.WithAlternateName {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ArmDisasterRecovery apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ArmDisasterRecovery apply(Context context);
    }
    /** The ArmDisasterRecovery update stages. */
    interface UpdateStages {
        /** The stage of the ArmDisasterRecovery update allowing to specify partnerNamespace. */
        interface WithPartnerNamespace {
            /**
             * Specifies the partnerNamespace property: ARM Id of the Primary/Secondary eventhub namespace name, which
             * is part of GEO DR pairing.
             *
             * @param partnerNamespace ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR
             *     pairing.
             * @return the next definition stage.
             */
            Update withPartnerNamespace(String partnerNamespace);
        }
        /** The stage of the ArmDisasterRecovery update allowing to specify alternateName. */
        interface WithAlternateName {
            /**
             * Specifies the alternateName property: Primary/Secondary eventhub namespace name, which is part of GEO DR
             * pairing.
             *
             * @param alternateName Primary/Secondary eventhub namespace name, which is part of GEO DR pairing.
             * @return the next definition stage.
             */
            Update withAlternateName(String alternateName);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ArmDisasterRecovery refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ArmDisasterRecovery refresh(Context context);

    /**
     * This operation disables the Disaster Recovery and stops replicating changes from primary to secondary namespaces.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> breakPairingWithResponse(Context context);

    /**
     * This operation disables the Disaster Recovery and stops replicating changes from primary to secondary namespaces.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void breakPairing();

    /**
     * Invokes GEO DR failover and reconfigure the alias to point to the secondary namespace.
     *
     * @param parameters Parameters required to create an Alias(Disaster Recovery configuration).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> failOverWithResponse(FailoverProperties parameters, Context context);

    /**
     * Invokes GEO DR failover and reconfigure the alias to point to the secondary namespace.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void failOver();
}
