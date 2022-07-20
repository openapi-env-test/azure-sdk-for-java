// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated.generated;

import com.azure.core.util.Context;

/** Samples for RecordSets ListByDnsZone. */
public final class RecordSetsListByDnsZoneSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/ListRecordSetsByZone.json
     */
    /**
     * Sample code: List recordsets by zone.
     *
     * @param manager Entry point to DnsManager.
     */
    public static void listRecordsetsByZone(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().listByDnsZone("rg1", "zone1", null, null, Context.NONE);
    }
}
