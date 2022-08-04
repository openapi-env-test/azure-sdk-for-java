// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.generated;

import com.azure.resourcemanager.authorization.generated.models.PrincipalType;

/** Samples for RoleAssignments Create. */
public final class RoleAssignmentsCreateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-01-03/examples/PutRoleAssignment.json
     */
    /**
     * Sample code: Create role assignment.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void createRoleAssignment(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignments()
            .define("roleAssignmentName")
            .withExistingScope("scope")
            .withRoleDefinitionId(
                "/subscriptions/4004a9fd-d58e-48dc-aeb2-4a4aec58606f/providers/Microsoft.Authorization/roleDefinitions/de139f84-1756-47ae-9be6-808fbbe84772")
            .withPrincipalId("d93a38bc-d029-4160-bfb0-fbda779ac214")
            .withPrincipalType(PrincipalType.USER)
            .withCanDelegate(false)
            .withDescription("Grants UserFoo role assignment bar in scope baz")
            .withCondition(
                "@Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]"
                    + " StringEqualsIgnoreCase 'foo_storage_container'")
            .withConditionVersion("1.0")
            .create();
    }
}
