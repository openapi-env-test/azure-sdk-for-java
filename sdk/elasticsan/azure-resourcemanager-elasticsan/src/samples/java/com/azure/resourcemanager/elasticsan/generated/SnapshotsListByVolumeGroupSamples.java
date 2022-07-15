// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.Context;

/** Samples for Snapshots ListByVolumeGroup. */
public final class SnapshotsListByVolumeGroupSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2022-06-15-preview/examples/Snapshots_ListByVolumeGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: Snapshots_ListByVolumeGroup_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void snapshotsListByVolumeGroupMaximumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .snapshots()
            .listByVolumeGroup("rgelasticsan", "wk_4t", "p1_37337_52a-35-91-BuR_1515", "aaaaaaaaaaaaaa", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2022-06-15-preview/examples/Snapshots_ListByVolumeGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: Snapshots_ListByVolumeGroup_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void snapshotsListByVolumeGroupMinimumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .snapshots()
            .listByVolumeGroup("rgelasticsan", "wk_4t", "p1_37337_52a-35-91-BuR_1515", null, Context.NONE);
    }
}
