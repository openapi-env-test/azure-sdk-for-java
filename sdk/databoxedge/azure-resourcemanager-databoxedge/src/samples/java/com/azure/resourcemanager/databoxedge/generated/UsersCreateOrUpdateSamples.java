// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.resourcemanager.databoxedge.models.AsymmetricEncryptedSecret;
import com.azure.resourcemanager.databoxedge.models.EncryptionAlgorithm;
import com.azure.resourcemanager.databoxedge.models.UserType;

/** Samples for Users CreateOrUpdate. */
public final class UsersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/databoxedge/resource-manager/Microsoft.DataBoxEdge/stable/2022-03-01/examples/UserPut.json
     */
    /**
     * Sample code: UserPut.
     *
     * @param manager Entry point to DataBoxEdgeManager.
     */
    public static void userPut(com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager) {
        manager
            .users()
            .define("user1")
            .withExistingDataBoxEdgeDevice("testedgedevice", "GroupForEdgeAutomation")
            .withUserType(UserType.SHARE)
            .withEncryptedPassword(
                new AsymmetricEncryptedSecret()
                    .withValue("<value>")
                    .withEncryptionCertThumbprint("blah")
                    .withEncryptionAlgorithm(EncryptionAlgorithm.NONE))
            .create();
    }
}
