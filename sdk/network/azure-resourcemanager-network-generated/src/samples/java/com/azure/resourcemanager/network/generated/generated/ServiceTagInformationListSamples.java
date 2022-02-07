// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ServiceTagInformation List. */
public final class ServiceTagInformationListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/ServiceTagInformationListResultWithNoAddressPrefixes.json
     */
    /**
     * Sample code: Get list of service tags with no address prefixes.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getListOfServiceTagsWithNoAddressPrefixes(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.serviceTagInformations().list("westeurope", true, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/ServiceTagInformationListResult.json
     */
    /**
     * Sample code: Get list of service tags.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getListOfServiceTags(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.serviceTagInformations().list("westeurope", null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/ServiceTagInformationListResultWithTagname.json
     */
    /**
     * Sample code: Get list of service tags with tag name.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getListOfServiceTagsWithTagName(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.serviceTagInformations().list("westeurope", null, "ApiManagement", Context.NONE);
    }
}
