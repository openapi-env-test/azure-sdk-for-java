// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of MigrationConfigs. */
public interface MigrationConfigs {
    /**
     * Gets all migrationConfigurations.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all migrationConfigurations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MigrationConfigProperties> list(String resourceGroupName, String namespaceName);

    /**
     * Gets all migrationConfigurations.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all migrationConfigurations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MigrationConfigProperties> list(String resourceGroupName, String namespaceName, Context context);

    /**
     * Deletes a MigrationConfiguration.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param configName The configuration name. Should always be "$default".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String namespaceName, MigrationConfigurationName configName);

    /**
     * Deletes a MigrationConfiguration.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param configName The configuration name. Should always be "$default".
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String namespaceName, MigrationConfigurationName configName, Context context);

    /**
     * Retrieves Migration Config.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param configName The configuration name. Should always be "$default".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Migration Config operation.
     */
    MigrationConfigProperties get(
        String resourceGroupName, String namespaceName, MigrationConfigurationName configName);

    /**
     * Retrieves Migration Config.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param configName The configuration name. Should always be "$default".
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Migration Config operation along with {@link Response}.
     */
    Response<MigrationConfigProperties> getWithResponse(
        String resourceGroupName, String namespaceName, MigrationConfigurationName configName, Context context);

    /**
     * This operation Completes Migration of entities by pointing the connection strings to Premium namespace and any
     * entities created after the operation will be under Premium Namespace. CompleteMigration operation will fail when
     * entity migration is in-progress.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param configName The configuration name. Should always be "$default".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void completeMigration(String resourceGroupName, String namespaceName, MigrationConfigurationName configName);

    /**
     * This operation Completes Migration of entities by pointing the connection strings to Premium namespace and any
     * entities created after the operation will be under Premium Namespace. CompleteMigration operation will fail when
     * entity migration is in-progress.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param configName The configuration name. Should always be "$default".
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> completeMigrationWithResponse(
        String resourceGroupName, String namespaceName, MigrationConfigurationName configName, Context context);

    /**
     * This operation reverts Migration.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param configName The configuration name. Should always be "$default".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revert(String resourceGroupName, String namespaceName, MigrationConfigurationName configName);

    /**
     * This operation reverts Migration.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param configName The configuration name. Should always be "$default".
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> revertWithResponse(
        String resourceGroupName, String namespaceName, MigrationConfigurationName configName, Context context);

    /**
     * Retrieves Migration Config.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Migration Config operation along with {@link Response}.
     */
    MigrationConfigProperties getById(String id);

    /**
     * Retrieves Migration Config.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Migration Config operation along with {@link Response}.
     */
    Response<MigrationConfigProperties> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a MigrationConfiguration.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a MigrationConfiguration.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new MigrationConfigProperties resource.
     *
     * @param name resource name.
     * @return the first stage of the new MigrationConfigProperties definition.
     */
    MigrationConfigProperties.DefinitionStages.Blank define(MigrationConfigurationName name);
}
