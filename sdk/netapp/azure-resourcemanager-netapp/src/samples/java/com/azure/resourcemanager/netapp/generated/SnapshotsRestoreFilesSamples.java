// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.models.SnapshotRestoreFiles;
import java.util.Arrays;

/** Samples for Snapshots RestoreFiles. */
public final class SnapshotsRestoreFilesSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2022-03-01/examples/Snapshots_SingleFileRestore.json
     */
    /**
     * Sample code: Snapshots_SingleFileRestore.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void snapshotsSingleFileRestore(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager
            .snapshots()
            .restoreFiles(
                "myRG",
                "account1",
                "pool1",
                "volume1",
                "snapshot1",
                new SnapshotRestoreFiles().withFilePaths(Arrays.asList("/dir1/customer1.db", "/dir1/customer2.db")),
                Context.NONE);
    }
}
