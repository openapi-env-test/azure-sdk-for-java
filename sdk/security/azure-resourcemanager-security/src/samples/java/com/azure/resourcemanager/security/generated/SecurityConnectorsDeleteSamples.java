// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for SecurityConnectors Delete. */
public final class SecurityConnectorsDeleteSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2022-05-01-preview/examples/SecurityConnectors/DeleteSecurityConnector_example.json
     */
    /**
     * Sample code: Delete a security connector.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void deleteASecurityConnector(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.securityConnectors().deleteWithResponse("myRg", "mySecurityConnectorName", Context.NONE);
    }
}
