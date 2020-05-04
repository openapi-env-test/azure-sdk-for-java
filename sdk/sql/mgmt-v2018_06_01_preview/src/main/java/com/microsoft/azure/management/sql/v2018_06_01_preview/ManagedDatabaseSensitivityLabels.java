/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2018_06_01_preview;

import rx.Observable;
import rx.Completable;
import com.microsoft.azure.management.sql.v2018_06_01_preview.CurrentSensitivityLabels;
import com.microsoft.azure.management.sql.v2018_06_01_preview.RecommendedSensitivityLabels;

/**
 * Type representing ManagedDatabaseSensitivityLabels.
 */
public interface ManagedDatabaseSensitivityLabels {
    /**
     * Begins definition for a new SensitivityLabel resource.
     * @param name resource name.
     * @return the first stage of the new SensitivityLabel definition.
     */
    SensitivityLabels.DefinitionStages.Blank defineSensitivityLabel(String name);

    /**
     * Gets the sensitivity label of a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param sensitivityLabelSource The source of the sensitivity label. Possible values include: 'current', 'recommended'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SensitivityLabels> getAsync(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName, SensitivityLabelSource sensitivityLabelSource);

    /**
     * Deletes the sensitivity label of a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName);

    /**
     * Disables sensitivity recommendations on a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable disableRecommendationAsync(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName);

    /**
     * Enables sensitivity recommendations on a given column (recommendations are enabled by default on all columns).
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable enableRecommendationAsync(String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String tableName, String columnName);

    /**
     * Gets the sensitivity labels of a given database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CurrentSensitivityLabels> listCurrentByDatabaseAsync(final String resourceGroupName, final String managedInstanceName, final String databaseName);

    /**
     * Gets the sensitivity labels of a given database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecommendedSensitivityLabels> listRecommendedByDatabaseAsync(final String resourceGroupName, final String managedInstanceName, final String databaseName);

}
