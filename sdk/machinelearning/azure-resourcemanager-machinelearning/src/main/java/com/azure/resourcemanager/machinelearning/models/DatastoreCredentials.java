// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base definition for datastore credentials. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "credentialsType",
    defaultImpl = DatastoreCredentials.class)
@JsonTypeName("DatastoreCredentials")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AccountKey", value = AccountKeyDatastoreCredentials.class),
    @JsonSubTypes.Type(name = "Certificate", value = CertificateDatastoreCredentials.class),
    @JsonSubTypes.Type(name = "None", value = NoneDatastoreCredentials.class),
    @JsonSubTypes.Type(name = "Sas", value = SasDatastoreCredentials.class),
    @JsonSubTypes.Type(name = "ServicePrincipal", value = ServicePrincipalDatastoreCredentials.class)
})
@Immutable
public class DatastoreCredentials {
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
