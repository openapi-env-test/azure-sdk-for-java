// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for ResourceProvider ListCustomHostnameSites. */
public final class ResourceProviderListCustomHostnameSitesSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/ListCustomSpecificHostNameSites.json
     */
    /**
     * Sample code: Get specific custom hostname under subscription.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void getSpecificCustomHostnameUnderSubscription(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.resourceProviders().listCustomHostnameSites("www.example.com", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/ListCustomHostNameSites.json
     */
    /**
     * Sample code: Get custom hostnames under subscription.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void getCustomHostnamesUnderSubscription(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.resourceProviders().listCustomHostnameSites(null, Context.NONE);
    }
}
