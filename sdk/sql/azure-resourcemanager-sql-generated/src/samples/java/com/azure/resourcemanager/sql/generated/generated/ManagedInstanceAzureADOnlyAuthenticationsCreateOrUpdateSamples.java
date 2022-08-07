// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.models.AuthenticationName;

/** Samples for ManagedInstanceAzureADOnlyAuthentications CreateOrUpdate. */
public final class ManagedInstanceAzureADOnlyAuthenticationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ManagedInstanceAzureADOnlyAuthCreateOrUpdate.json
     */
    /**
     * Sample code: Creates or updates Azure Active Directory only authentication object.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createsOrUpdatesAzureActiveDirectoryOnlyAuthenticationObject(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .managedInstanceAzureADOnlyAuthentications()
            .define(AuthenticationName.DEFAULT)
            .withExistingManagedInstance("Default-SQL-SouthEastAsia", "managedInstance")
            .withAzureADOnlyAuthentication(false)
            .create();
    }
}
