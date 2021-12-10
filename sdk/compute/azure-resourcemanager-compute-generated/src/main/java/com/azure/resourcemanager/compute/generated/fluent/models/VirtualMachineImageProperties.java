// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.models.AutomaticOSUpgradeProperties;
import com.azure.resourcemanager.compute.generated.models.DataDiskImage;
import com.azure.resourcemanager.compute.generated.models.DisallowedConfiguration;
import com.azure.resourcemanager.compute.generated.models.HyperVGenerationTypes;
import com.azure.resourcemanager.compute.generated.models.OSDiskImage;
import com.azure.resourcemanager.compute.generated.models.PurchasePlan;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineImageFeature;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the properties of a Virtual Machine Image. */
@Fluent
public final class VirtualMachineImageProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineImageProperties.class);

    /*
     * Used for establishing the purchase context of any 3rd Party artifact
     * through MarketPlace.
     */
    @JsonProperty(value = "plan")
    private PurchasePlan plan;

    /*
     * Contains the os disk image information.
     */
    @JsonProperty(value = "osDiskImage")
    private OSDiskImage osDiskImage;

    /*
     * The dataDiskImages property.
     */
    @JsonProperty(value = "dataDiskImages")
    private List<DataDiskImage> dataDiskImages;

    /*
     * Describes automatic OS upgrade properties on the image.
     */
    @JsonProperty(value = "automaticOSUpgradeProperties")
    private AutomaticOSUpgradeProperties automaticOSUpgradeProperties;

    /*
     * Specifies the HyperVGeneration Type
     */
    @JsonProperty(value = "hyperVGeneration")
    private HyperVGenerationTypes hyperVGeneration;

    /*
     * Specifies disallowed configuration for the VirtualMachine created from
     * the image
     */
    @JsonProperty(value = "disallowed")
    private DisallowedConfiguration disallowed;

    /*
     * The features property.
     */
    @JsonProperty(value = "features")
    private List<VirtualMachineImageFeature> features;

    /**
     * Get the plan property: Used for establishing the purchase context of any 3rd Party artifact through MarketPlace.
     *
     * @return the plan value.
     */
    public PurchasePlan plan() {
        return this.plan;
    }

    /**
     * Set the plan property: Used for establishing the purchase context of any 3rd Party artifact through MarketPlace.
     *
     * @param plan the plan value to set.
     * @return the VirtualMachineImageProperties object itself.
     */
    public VirtualMachineImageProperties withPlan(PurchasePlan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the osDiskImage property: Contains the os disk image information.
     *
     * @return the osDiskImage value.
     */
    public OSDiskImage osDiskImage() {
        return this.osDiskImage;
    }

    /**
     * Set the osDiskImage property: Contains the os disk image information.
     *
     * @param osDiskImage the osDiskImage value to set.
     * @return the VirtualMachineImageProperties object itself.
     */
    public VirtualMachineImageProperties withOsDiskImage(OSDiskImage osDiskImage) {
        this.osDiskImage = osDiskImage;
        return this;
    }

    /**
     * Get the dataDiskImages property: The dataDiskImages property.
     *
     * @return the dataDiskImages value.
     */
    public List<DataDiskImage> dataDiskImages() {
        return this.dataDiskImages;
    }

    /**
     * Set the dataDiskImages property: The dataDiskImages property.
     *
     * @param dataDiskImages the dataDiskImages value to set.
     * @return the VirtualMachineImageProperties object itself.
     */
    public VirtualMachineImageProperties withDataDiskImages(List<DataDiskImage> dataDiskImages) {
        this.dataDiskImages = dataDiskImages;
        return this;
    }

    /**
     * Get the automaticOSUpgradeProperties property: Describes automatic OS upgrade properties on the image.
     *
     * @return the automaticOSUpgradeProperties value.
     */
    public AutomaticOSUpgradeProperties automaticOSUpgradeProperties() {
        return this.automaticOSUpgradeProperties;
    }

    /**
     * Set the automaticOSUpgradeProperties property: Describes automatic OS upgrade properties on the image.
     *
     * @param automaticOSUpgradeProperties the automaticOSUpgradeProperties value to set.
     * @return the VirtualMachineImageProperties object itself.
     */
    public VirtualMachineImageProperties withAutomaticOSUpgradeProperties(
        AutomaticOSUpgradeProperties automaticOSUpgradeProperties) {
        this.automaticOSUpgradeProperties = automaticOSUpgradeProperties;
        return this;
    }

    /**
     * Get the hyperVGeneration property: Specifies the HyperVGeneration Type.
     *
     * @return the hyperVGeneration value.
     */
    public HyperVGenerationTypes hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hyperVGeneration property: Specifies the HyperVGeneration Type.
     *
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the VirtualMachineImageProperties object itself.
     */
    public VirtualMachineImageProperties withHyperVGeneration(HyperVGenerationTypes hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Get the disallowed property: Specifies disallowed configuration for the VirtualMachine created from the image.
     *
     * @return the disallowed value.
     */
    public DisallowedConfiguration disallowed() {
        return this.disallowed;
    }

    /**
     * Set the disallowed property: Specifies disallowed configuration for the VirtualMachine created from the image.
     *
     * @param disallowed the disallowed value to set.
     * @return the VirtualMachineImageProperties object itself.
     */
    public VirtualMachineImageProperties withDisallowed(DisallowedConfiguration disallowed) {
        this.disallowed = disallowed;
        return this;
    }

    /**
     * Get the features property: The features property.
     *
     * @return the features value.
     */
    public List<VirtualMachineImageFeature> features() {
        return this.features;
    }

    /**
     * Set the features property: The features property.
     *
     * @param features the features value to set.
     * @return the VirtualMachineImageProperties object itself.
     */
    public VirtualMachineImageProperties withFeatures(List<VirtualMachineImageFeature> features) {
        this.features = features;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (plan() != null) {
            plan().validate();
        }
        if (osDiskImage() != null) {
            osDiskImage().validate();
        }
        if (dataDiskImages() != null) {
            dataDiskImages().forEach(e -> e.validate());
        }
        if (automaticOSUpgradeProperties() != null) {
            automaticOSUpgradeProperties().validate();
        }
        if (disallowed() != null) {
            disallowed().validate();
        }
        if (features() != null) {
            features().forEach(e -> e.validate());
        }
    }
}
