// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The authentication info. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "authType",
    defaultImpl = AuthInfoBase.class)
@JsonTypeName("AuthInfoBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "secret", value = SecretAuthInfo.class),
    @JsonSubTypes.Type(name = "userAssignedIdentity", value = UserAssignedIdentityAuthInfo.class),
    @JsonSubTypes.Type(name = "systemAssignedIdentity", value = SystemAssignedIdentityAuthInfo.class),
    @JsonSubTypes.Type(name = "servicePrincipalSecret", value = ServicePrincipalSecretAuthInfo.class),
    @JsonSubTypes.Type(name = "servicePrincipalCertificate", value = ServicePrincipalCertificateAuthInfo.class)
})
@Immutable
public class AuthInfoBase {
    /** Creates an instance of AuthInfoBase class. */
    public AuthInfoBase() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
