// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSetParameters;
import com.azure.resourcemanager.compute.generated.models.ImageDataDisk;
import com.azure.resourcemanager.compute.generated.models.ImageOSDisk;
import com.azure.resourcemanager.compute.generated.models.ImageStorageProfile;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemStateTypes;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import java.util.Arrays;

/** Samples for Images CreateOrUpdate. */
public final class ImagesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/imageExamples/Image_CreateFromASnapshot.json
     */
    /**
     * Sample code: Create a virtual machine image from a snapshot.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVirtualMachineImageFromASnapshot(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .images()
            .define("myImage")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withStorageProfile(
                new ImageStorageProfile()
                    .withOsDisk(
                        new ImageOSDisk()
                            .withSnapshot(
                                new SubResource()
                                    .withId(
                                        "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot"))
                            .withOsType(OperatingSystemTypes.LINUX)
                            .withOsState(OperatingSystemStateTypes.GENERALIZED))
                    .withZoneResilient(false))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/imageExamples/Image_CreateFromAManagedDisk.json
     */
    /**
     * Sample code: Create a virtual machine image from a managed disk.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVirtualMachineImageFromAManagedDisk(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .images()
            .define("myImage")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withStorageProfile(
                new ImageStorageProfile()
                    .withOsDisk(
                        new ImageOSDisk()
                            .withManagedDisk(
                                new SubResource()
                                    .withId(
                                        "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/myManagedDisk"))
                            .withOsType(OperatingSystemTypes.LINUX)
                            .withOsState(OperatingSystemStateTypes.GENERALIZED))
                    .withZoneResilient(true))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/imageExamples/Image_CreateFromABlobWithDiskEncryptionSet.json
     */
    /**
     * Sample code: Create a virtual machine image from a blob with DiskEncryptionSet resource.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVirtualMachineImageFromABlobWithDiskEncryptionSetResource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .images()
            .define("myImage")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withStorageProfile(
                new ImageStorageProfile()
                    .withOsDisk(
                        new ImageOSDisk()
                            .withBlobUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd")
                            .withDiskEncryptionSet(
                                new DiskEncryptionSetParameters()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{existing-diskEncryptionSet-name}"))
                            .withOsType(OperatingSystemTypes.LINUX)
                            .withOsState(OperatingSystemStateTypes.GENERALIZED)))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/imageExamples/Image_CreateFromAManagedDiskWithDiskEncryptionSet.json
     */
    /**
     * Sample code: Create a virtual machine image from a managed disk with DiskEncryptionSet resource.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVirtualMachineImageFromAManagedDiskWithDiskEncryptionSetResource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .images()
            .define("myImage")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withStorageProfile(
                new ImageStorageProfile()
                    .withOsDisk(
                        new ImageOSDisk()
                            .withSnapshot(
                                new SubResource()
                                    .withId(
                                        "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot"))
                            .withDiskEncryptionSet(
                                new DiskEncryptionSetParameters()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{existing-diskEncryptionSet-name}"))
                            .withOsType(OperatingSystemTypes.LINUX)
                            .withOsState(OperatingSystemStateTypes.GENERALIZED)))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/imageExamples/Image_Create_DataDiskFromABlobIncluded.json
     */
    /**
     * Sample code: Create a virtual machine image that includes a data disk from a blob.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVirtualMachineImageThatIncludesADataDiskFromABlob(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .images()
            .define("myImage")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withStorageProfile(
                new ImageStorageProfile()
                    .withOsDisk(
                        new ImageOSDisk()
                            .withBlobUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd")
                            .withOsType(OperatingSystemTypes.LINUX)
                            .withOsState(OperatingSystemStateTypes.GENERALIZED))
                    .withDataDisks(
                        Arrays
                            .asList(
                                new ImageDataDisk()
                                    .withBlobUri(
                                        "https://mystorageaccount.blob.core.windows.net/dataimages/dataimage.vhd")
                                    .withLun(1)))
                    .withZoneResilient(false))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/imageExamples/Image_CreateFromASnapshotWithDiskEncryptionSet.json
     */
    /**
     * Sample code: Create a virtual machine image from a snapshot with DiskEncryptionSet resource.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVirtualMachineImageFromASnapshotWithDiskEncryptionSetResource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .images()
            .define("myImage")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withStorageProfile(
                new ImageStorageProfile()
                    .withOsDisk(
                        new ImageOSDisk()
                            .withManagedDisk(
                                new SubResource()
                                    .withId(
                                        "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/myManagedDisk"))
                            .withDiskEncryptionSet(
                                new DiskEncryptionSetParameters()
                                    .withId(
                                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{existing-diskEncryptionSet-name}"))
                            .withOsType(OperatingSystemTypes.LINUX)
                            .withOsState(OperatingSystemStateTypes.GENERALIZED)))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/imageExamples/Image_Create_DataDiskFromASnapshotIncluded.json
     */
    /**
     * Sample code: Create a virtual machine image that includes a data disk from a snapshot.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVirtualMachineImageThatIncludesADataDiskFromASnapshot(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .images()
            .define("myImage")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withStorageProfile(
                new ImageStorageProfile()
                    .withOsDisk(
                        new ImageOSDisk()
                            .withSnapshot(
                                new SubResource()
                                    .withId(
                                        "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot"))
                            .withOsType(OperatingSystemTypes.LINUX)
                            .withOsState(OperatingSystemStateTypes.GENERALIZED))
                    .withDataDisks(
                        Arrays
                            .asList(
                                new ImageDataDisk()
                                    .withSnapshot(
                                        new SubResource()
                                            .withId(
                                                "subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot2"))
                                    .withLun(1)))
                    .withZoneResilient(true))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/imageExamples/Image_CreateFromABlob.json
     */
    /**
     * Sample code: Create a virtual machine image from a blob.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVirtualMachineImageFromABlob(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .images()
            .define("myImage")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withStorageProfile(
                new ImageStorageProfile()
                    .withOsDisk(
                        new ImageOSDisk()
                            .withBlobUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd")
                            .withOsType(OperatingSystemTypes.LINUX)
                            .withOsState(OperatingSystemStateTypes.GENERALIZED))
                    .withZoneResilient(true))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/imageExamples/Image_CreateFromAVM.json
     */
    /**
     * Sample code: Create a virtual machine image from an existing virtual machine.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVirtualMachineImageFromAnExistingVirtualMachine(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .images()
            .define("myImage")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withSourceVirtualMachine(
                new SubResource()
                    .withId(
                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachines/myVM"))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/imageExamples/Image_Create_DataDiskFromAManagedDiskIncluded.json
     */
    /**
     * Sample code: Create a virtual machine image that includes a data disk from a managed disk.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createAVirtualMachineImageThatIncludesADataDiskFromAManagedDisk(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .images()
            .define("myImage")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withStorageProfile(
                new ImageStorageProfile()
                    .withOsDisk(
                        new ImageOSDisk()
                            .withManagedDisk(
                                new SubResource()
                                    .withId(
                                        "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/myManagedDisk"))
                            .withOsType(OperatingSystemTypes.LINUX)
                            .withOsState(OperatingSystemStateTypes.GENERALIZED))
                    .withDataDisks(
                        Arrays
                            .asList(
                                new ImageDataDisk()
                                    .withManagedDisk(
                                        new SubResource()
                                            .withId(
                                                "subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/myManagedDisk2"))
                                    .withLun(1)))
                    .withZoneResilient(false))
            .create();
    }
}
