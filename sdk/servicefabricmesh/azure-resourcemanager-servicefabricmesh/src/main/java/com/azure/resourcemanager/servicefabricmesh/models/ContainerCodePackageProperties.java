// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a container and its runtime properties. */
@Fluent
public final class ContainerCodePackageProperties {
    /*
     * The name of the code package.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The Container image to use.
     */
    @JsonProperty(value = "image", required = true)
    private String image;

    /*
     * Image registry credential.
     */
    @JsonProperty(value = "imageRegistryCredential")
    private ImageRegistryCredential imageRegistryCredential;

    /*
     * Override for the default entry point in the container.
     */
    @JsonProperty(value = "entrypoint")
    private String entrypoint;

    /*
     * Command array to execute within the container in exec form.
     */
    @JsonProperty(value = "commands")
    private List<String> commands;

    /*
     * The environment variables to set in this container
     */
    @JsonProperty(value = "environmentVariables")
    private List<EnvironmentVariable> environmentVariables;

    /*
     * The settings to set in this container. The setting file path can be fetched from environment variable
     * "Fabric_SettingPath". The path for Windows container is "C:\\secrets". The path for Linux container is
     * "/var/secrets".
     */
    @JsonProperty(value = "settings")
    private List<Setting> settings;

    /*
     * The labels to set in this container.
     */
    @JsonProperty(value = "labels")
    private List<ContainerLabel> labels;

    /*
     * The endpoints exposed by this container.
     */
    @JsonProperty(value = "endpoints")
    private List<EndpointProperties> endpoints;

    /*
     * The resources required by this container.
     */
    @JsonProperty(value = "resources", required = true)
    private ResourceRequirements resources;

    /*
     * Volumes to be attached to the container. The lifetime of these volumes is independent of the application's
     * lifetime.
     */
    @JsonProperty(value = "volumeRefs")
    private List<VolumeReference> volumeRefs;

    /*
     * Volumes to be attached to the container. The lifetime of these volumes is scoped to the application's lifetime.
     */
    @JsonProperty(value = "volumes")
    private List<ApplicationScopedVolume> volumes;

    /*
     * Reference to sinks in DiagnosticsDescription.
     */
    @JsonProperty(value = "diagnostics")
    private DiagnosticsRef diagnostics;

    /*
     * A list of ReliableCollection resources used by this particular code package. Please refer to
     * ReliableCollectionsRef for more details.
     */
    @JsonProperty(value = "reliableCollectionsRefs")
    private List<ReliableCollectionsRef> reliableCollectionsRefs;

    /*
     * Runtime information of a container instance.
     */
    @JsonProperty(value = "instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private ContainerInstanceView instanceView;

    /** Creates an instance of ContainerCodePackageProperties class. */
    public ContainerCodePackageProperties() {
    }

    /**
     * Get the name property: The name of the code package.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the code package.
     *
     * @param name the name value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the image property: The Container image to use.
     *
     * @return the image value.
     */
    public String image() {
        return this.image;
    }

    /**
     * Set the image property: The Container image to use.
     *
     * @param image the image value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * Get the imageRegistryCredential property: Image registry credential.
     *
     * @return the imageRegistryCredential value.
     */
    public ImageRegistryCredential imageRegistryCredential() {
        return this.imageRegistryCredential;
    }

    /**
     * Set the imageRegistryCredential property: Image registry credential.
     *
     * @param imageRegistryCredential the imageRegistryCredential value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties withImageRegistryCredential(ImageRegistryCredential imageRegistryCredential) {
        this.imageRegistryCredential = imageRegistryCredential;
        return this;
    }

    /**
     * Get the entrypoint property: Override for the default entry point in the container.
     *
     * @return the entrypoint value.
     */
    public String entrypoint() {
        return this.entrypoint;
    }

    /**
     * Set the entrypoint property: Override for the default entry point in the container.
     *
     * @param entrypoint the entrypoint value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties withEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
        return this;
    }

    /**
     * Get the commands property: Command array to execute within the container in exec form.
     *
     * @return the commands value.
     */
    public List<String> commands() {
        return this.commands;
    }

    /**
     * Set the commands property: Command array to execute within the container in exec form.
     *
     * @param commands the commands value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties withCommands(List<String> commands) {
        this.commands = commands;
        return this;
    }

    /**
     * Get the environmentVariables property: The environment variables to set in this container.
     *
     * @return the environmentVariables value.
     */
    public List<EnvironmentVariable> environmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set the environmentVariables property: The environment variables to set in this container.
     *
     * @param environmentVariables the environmentVariables value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties withEnvironmentVariables(List<EnvironmentVariable> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get the settings property: The settings to set in this container. The setting file path can be fetched from
     * environment variable "Fabric_SettingPath". The path for Windows container is "C:\\secrets". The path for Linux
     * container is "/var/secrets".
     *
     * @return the settings value.
     */
    public List<Setting> settings() {
        return this.settings;
    }

    /**
     * Set the settings property: The settings to set in this container. The setting file path can be fetched from
     * environment variable "Fabric_SettingPath". The path for Windows container is "C:\\secrets". The path for Linux
     * container is "/var/secrets".
     *
     * @param settings the settings value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties withSettings(List<Setting> settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the labels property: The labels to set in this container.
     *
     * @return the labels value.
     */
    public List<ContainerLabel> labels() {
        return this.labels;
    }

    /**
     * Set the labels property: The labels to set in this container.
     *
     * @param labels the labels value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties withLabels(List<ContainerLabel> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the endpoints property: The endpoints exposed by this container.
     *
     * @return the endpoints value.
     */
    public List<EndpointProperties> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The endpoints exposed by this container.
     *
     * @param endpoints the endpoints value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties withEndpoints(List<EndpointProperties> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the resources property: The resources required by this container.
     *
     * @return the resources value.
     */
    public ResourceRequirements resources() {
        return this.resources;
    }

    /**
     * Set the resources property: The resources required by this container.
     *
     * @param resources the resources value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties withResources(ResourceRequirements resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the volumeRefs property: Volumes to be attached to the container. The lifetime of these volumes is
     * independent of the application's lifetime.
     *
     * @return the volumeRefs value.
     */
    public List<VolumeReference> volumeRefs() {
        return this.volumeRefs;
    }

    /**
     * Set the volumeRefs property: Volumes to be attached to the container. The lifetime of these volumes is
     * independent of the application's lifetime.
     *
     * @param volumeRefs the volumeRefs value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties withVolumeRefs(List<VolumeReference> volumeRefs) {
        this.volumeRefs = volumeRefs;
        return this;
    }

    /**
     * Get the volumes property: Volumes to be attached to the container. The lifetime of these volumes is scoped to the
     * application's lifetime.
     *
     * @return the volumes value.
     */
    public List<ApplicationScopedVolume> volumes() {
        return this.volumes;
    }

    /**
     * Set the volumes property: Volumes to be attached to the container. The lifetime of these volumes is scoped to the
     * application's lifetime.
     *
     * @param volumes the volumes value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties withVolumes(List<ApplicationScopedVolume> volumes) {
        this.volumes = volumes;
        return this;
    }

    /**
     * Get the diagnostics property: Reference to sinks in DiagnosticsDescription.
     *
     * @return the diagnostics value.
     */
    public DiagnosticsRef diagnostics() {
        return this.diagnostics;
    }

    /**
     * Set the diagnostics property: Reference to sinks in DiagnosticsDescription.
     *
     * @param diagnostics the diagnostics value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties withDiagnostics(DiagnosticsRef diagnostics) {
        this.diagnostics = diagnostics;
        return this;
    }

    /**
     * Get the reliableCollectionsRefs property: A list of ReliableCollection resources used by this particular code
     * package. Please refer to ReliableCollectionsRef for more details.
     *
     * @return the reliableCollectionsRefs value.
     */
    public List<ReliableCollectionsRef> reliableCollectionsRefs() {
        return this.reliableCollectionsRefs;
    }

    /**
     * Set the reliableCollectionsRefs property: A list of ReliableCollection resources used by this particular code
     * package. Please refer to ReliableCollectionsRef for more details.
     *
     * @param reliableCollectionsRefs the reliableCollectionsRefs value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties withReliableCollectionsRefs(
        List<ReliableCollectionsRef> reliableCollectionsRefs) {
        this.reliableCollectionsRefs = reliableCollectionsRefs;
        return this;
    }

    /**
     * Get the instanceView property: Runtime information of a container instance.
     *
     * @return the instanceView value.
     */
    public ContainerInstanceView instanceView() {
        return this.instanceView;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model ContainerCodePackageProperties"));
        }
        if (image() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property image in model ContainerCodePackageProperties"));
        }
        if (imageRegistryCredential() != null) {
            imageRegistryCredential().validate();
        }
        if (environmentVariables() != null) {
            environmentVariables().forEach(e -> e.validate());
        }
        if (settings() != null) {
            settings().forEach(e -> e.validate());
        }
        if (labels() != null) {
            labels().forEach(e -> e.validate());
        }
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
        if (resources() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resources in model ContainerCodePackageProperties"));
        } else {
            resources().validate();
        }
        if (volumeRefs() != null) {
            volumeRefs().forEach(e -> e.validate());
        }
        if (volumes() != null) {
            volumes().forEach(e -> e.validate());
        }
        if (diagnostics() != null) {
            diagnostics().validate();
        }
        if (reliableCollectionsRefs() != null) {
            reliableCollectionsRefs().forEach(e -> e.validate());
        }
        if (instanceView() != null) {
            instanceView().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContainerCodePackageProperties.class);
}
