// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.generated;

/** Samples for Model CreateOrUpdate. */
public final class ModelCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/models/createorupdate.json
     */
    /**
     * Sample code: ModelCreateOrUpdate.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void modelCreateOrUpdate(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.models().define("mymodelName").withExistingAccount("myresourceGroupName", "myaccountName").create();
    }
}
