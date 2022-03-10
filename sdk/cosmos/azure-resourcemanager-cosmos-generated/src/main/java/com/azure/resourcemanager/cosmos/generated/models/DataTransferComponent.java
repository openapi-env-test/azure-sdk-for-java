// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DataTransferComponent. */
public final class DataTransferComponent extends ExpandableStringEnum<DataTransferComponent> {
    /** Static value CosmosDBCassandra for DataTransferComponent. */
    public static final DataTransferComponent COSMOS_DBCASSANDRA = fromString("CosmosDBCassandra");

    /** Static value CosmosDBSql for DataTransferComponent. */
    public static final DataTransferComponent COSMOS_DBSQL = fromString("CosmosDBSql");

    /** Static value AzureBlobStorage for DataTransferComponent. */
    public static final DataTransferComponent AZURE_BLOB_STORAGE = fromString("AzureBlobStorage");

    /**
     * Creates or finds a DataTransferComponent from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DataTransferComponent.
     */
    @JsonCreator
    public static DataTransferComponent fromString(String name) {
        return fromString(name, DataTransferComponent.class);
    }

    /** @return known DataTransferComponent values. */
    public static Collection<DataTransferComponent> values() {
        return values(DataTransferComponent.class);
    }
}
