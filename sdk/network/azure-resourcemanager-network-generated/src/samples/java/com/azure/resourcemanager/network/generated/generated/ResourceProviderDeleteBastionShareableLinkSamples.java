// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.BastionShareableLinkInner;
import com.azure.resourcemanager.network.generated.models.BastionShareableLinkListRequest;
import com.azure.resourcemanager.network.generated.models.VM;
import java.util.Arrays;

/** Samples for ResourceProvider DeleteBastionShareableLink. */
public final class ResourceProviderDeleteBastionShareableLinkSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/BastionShareableLinkDelete.json
     */
    /**
     * Sample code: Delete Bastion Shareable Links for the request VMs.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteBastionShareableLinksForTheRequestVMs(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .resourceProviders()
            .deleteBastionShareableLink(
                "rg1",
                "bastionhosttenant",
                new BastionShareableLinkListRequest()
                    .withVms(
                        Arrays
                            .asList(
                                new BastionShareableLinkInner()
                                    .withVm(
                                        new VM()
                                            .withId(
                                                "/subscriptions/subid/resourceGroups/rgx/providers/Microsoft.Compute/virtualMachines/vm1")),
                                new BastionShareableLinkInner()
                                    .withVm(
                                        new VM()
                                            .withId(
                                                "/subscriptions/subid/resourceGroups/rgx/providers/Microsoft.Compute/virtualMachines/vm2")))),
                Context.NONE);
    }
}
