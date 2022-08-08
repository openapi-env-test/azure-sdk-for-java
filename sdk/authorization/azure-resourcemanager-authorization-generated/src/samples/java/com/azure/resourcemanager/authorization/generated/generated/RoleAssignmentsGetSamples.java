// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.generated;

import com.azure.core.util.Context;

/** Samples for RoleAssignments Get. */
public final class RoleAssignmentsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-01-03/examples/GetRoleAssignmentByName.json
     */
    /**
     * Sample code: Get role assignment by name.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleAssignmentByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleAssignments().getWithResponse("scope", "roleAssignmentName", null, Context.NONE);
    }
}
