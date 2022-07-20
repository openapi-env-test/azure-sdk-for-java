// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.generated;

import com.azure.core.util.Context;

/** Samples for Model ListByAccount. */
public final class ModelListByAccountSamples {
    /*
     * x-ms-original-file: specification/singularity/resource-manager/Microsoft.Singularity/preview/2020-12-01-preview/examples/accounts/models/listbyaccount.json
     */
    /**
     * Sample code: ModelListByAccount.
     *
     * @param manager Entry point to SingularityManager.
     */
    public static void modelListByAccount(com.azure.resourcemanager.singularity.SingularityManager manager) {
        manager.models().listByAccount("myresourceGroupName", "myaccountName", "mycontinuationToken", Context.NONE);
    }
}
