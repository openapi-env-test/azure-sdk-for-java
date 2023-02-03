// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.msi.generated.fluent.models.SystemAssignedIdentityInner;
import java.util.Map;
import java.util.UUID;

/** An immutable client-side representation of SystemAssignedIdentity. */
public interface SystemAssignedIdentity {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the tenantId property: The id of the tenant which the identity belongs to.
     *
     * @return the tenantId value.
     */
    UUID tenantId();

    /**
     * Gets the principalId property: The id of the service principal object associated with the created identity.
     *
     * @return the principalId value.
     */
    UUID principalId();

    /**
     * Gets the clientId property: The id of the app associated with the identity. This is a random generated UUID by
     * MSI.
     *
     * @return the clientId value.
     */
    UUID clientId();

    /**
     * Gets the clientSecretUrl property: The ManagedServiceIdentity DataPlane URL that can be queried to obtain the
     * identity credentials.
     *
     * @return the clientSecretUrl value.
     */
    String clientSecretUrl();

    /**
     * Gets the inner com.azure.resourcemanager.msi.generated.fluent.models.SystemAssignedIdentityInner object.
     *
     * @return the inner object.
     */
    SystemAssignedIdentityInner innerModel();
}
