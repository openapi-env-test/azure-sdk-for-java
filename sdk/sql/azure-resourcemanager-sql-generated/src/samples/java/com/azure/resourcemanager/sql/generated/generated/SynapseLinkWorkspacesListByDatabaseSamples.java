// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for SynapseLinkWorkspaces ListByDatabase. */
public final class SynapseLinkWorkspacesListByDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-05-01-preview/examples/SynapseLinkWorkspaceListByDatabase.json
     */
    /**
     * Sample code: List all synapselink workspaces for the given database.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void listAllSynapselinkWorkspacesForTheGivenDatabase(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .synapseLinkWorkspaces()
            .listByDatabase("Default-SQL-SouthEastAsia", "testsvr", "dbSynapse", Context.NONE);
    }
}
