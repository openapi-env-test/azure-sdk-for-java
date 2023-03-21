// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Build properties for the static site. */
@Fluent
public final class StaticSiteBuildProperties {
    /*
     * The path to the app code within the repository.
     */
    @JsonProperty(value = "appLocation")
    private String appLocation;

    /*
     * The path to the api code within the repository.
     */
    @JsonProperty(value = "apiLocation")
    private String apiLocation;

    /*
     * Deprecated: The path of the app artifacts after building (deprecated in favor of OutputLocation)
     */
    @JsonProperty(value = "appArtifactLocation")
    private String appArtifactLocation;

    /*
     * The output path of the app after building.
     */
    @JsonProperty(value = "outputLocation")
    private String outputLocation;

    /*
     * A custom command to run during deployment of the static content application.
     */
    @JsonProperty(value = "appBuildCommand")
    private String appBuildCommand;

    /*
     * A custom command to run during deployment of the Azure Functions API application.
     */
    @JsonProperty(value = "apiBuildCommand")
    private String apiBuildCommand;

    /*
     * Skip Github Action workflow generation.
     */
    @JsonProperty(value = "skipGithubActionWorkflowGeneration")
    private Boolean skipGithubActionWorkflowGeneration;

    /*
     * Github Action secret name override.
     */
    @JsonProperty(value = "githubActionSecretNameOverride")
    private String githubActionSecretNameOverride;

    /** Creates an instance of StaticSiteBuildProperties class. */
    public StaticSiteBuildProperties() {
    }

    /**
     * Get the appLocation property: The path to the app code within the repository.
     *
     * @return the appLocation value.
     */
    public String appLocation() {
        return this.appLocation;
    }

    /**
     * Set the appLocation property: The path to the app code within the repository.
     *
     * @param appLocation the appLocation value to set.
     * @return the StaticSiteBuildProperties object itself.
     */
    public StaticSiteBuildProperties withAppLocation(String appLocation) {
        this.appLocation = appLocation;
        return this;
    }

    /**
     * Get the apiLocation property: The path to the api code within the repository.
     *
     * @return the apiLocation value.
     */
    public String apiLocation() {
        return this.apiLocation;
    }

    /**
     * Set the apiLocation property: The path to the api code within the repository.
     *
     * @param apiLocation the apiLocation value to set.
     * @return the StaticSiteBuildProperties object itself.
     */
    public StaticSiteBuildProperties withApiLocation(String apiLocation) {
        this.apiLocation = apiLocation;
        return this;
    }

    /**
     * Get the appArtifactLocation property: Deprecated: The path of the app artifacts after building (deprecated in
     * favor of OutputLocation).
     *
     * @return the appArtifactLocation value.
     */
    public String appArtifactLocation() {
        return this.appArtifactLocation;
    }

    /**
     * Set the appArtifactLocation property: Deprecated: The path of the app artifacts after building (deprecated in
     * favor of OutputLocation).
     *
     * @param appArtifactLocation the appArtifactLocation value to set.
     * @return the StaticSiteBuildProperties object itself.
     */
    public StaticSiteBuildProperties withAppArtifactLocation(String appArtifactLocation) {
        this.appArtifactLocation = appArtifactLocation;
        return this;
    }

    /**
     * Get the outputLocation property: The output path of the app after building.
     *
     * @return the outputLocation value.
     */
    public String outputLocation() {
        return this.outputLocation;
    }

    /**
     * Set the outputLocation property: The output path of the app after building.
     *
     * @param outputLocation the outputLocation value to set.
     * @return the StaticSiteBuildProperties object itself.
     */
    public StaticSiteBuildProperties withOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
        return this;
    }

    /**
     * Get the appBuildCommand property: A custom command to run during deployment of the static content application.
     *
     * @return the appBuildCommand value.
     */
    public String appBuildCommand() {
        return this.appBuildCommand;
    }

    /**
     * Set the appBuildCommand property: A custom command to run during deployment of the static content application.
     *
     * @param appBuildCommand the appBuildCommand value to set.
     * @return the StaticSiteBuildProperties object itself.
     */
    public StaticSiteBuildProperties withAppBuildCommand(String appBuildCommand) {
        this.appBuildCommand = appBuildCommand;
        return this;
    }

    /**
     * Get the apiBuildCommand property: A custom command to run during deployment of the Azure Functions API
     * application.
     *
     * @return the apiBuildCommand value.
     */
    public String apiBuildCommand() {
        return this.apiBuildCommand;
    }

    /**
     * Set the apiBuildCommand property: A custom command to run during deployment of the Azure Functions API
     * application.
     *
     * @param apiBuildCommand the apiBuildCommand value to set.
     * @return the StaticSiteBuildProperties object itself.
     */
    public StaticSiteBuildProperties withApiBuildCommand(String apiBuildCommand) {
        this.apiBuildCommand = apiBuildCommand;
        return this;
    }

    /**
     * Get the skipGithubActionWorkflowGeneration property: Skip Github Action workflow generation.
     *
     * @return the skipGithubActionWorkflowGeneration value.
     */
    public Boolean skipGithubActionWorkflowGeneration() {
        return this.skipGithubActionWorkflowGeneration;
    }

    /**
     * Set the skipGithubActionWorkflowGeneration property: Skip Github Action workflow generation.
     *
     * @param skipGithubActionWorkflowGeneration the skipGithubActionWorkflowGeneration value to set.
     * @return the StaticSiteBuildProperties object itself.
     */
    public StaticSiteBuildProperties withSkipGithubActionWorkflowGeneration(
        Boolean skipGithubActionWorkflowGeneration) {
        this.skipGithubActionWorkflowGeneration = skipGithubActionWorkflowGeneration;
        return this;
    }

    /**
     * Get the githubActionSecretNameOverride property: Github Action secret name override.
     *
     * @return the githubActionSecretNameOverride value.
     */
    public String githubActionSecretNameOverride() {
        return this.githubActionSecretNameOverride;
    }

    /**
     * Set the githubActionSecretNameOverride property: Github Action secret name override.
     *
     * @param githubActionSecretNameOverride the githubActionSecretNameOverride value to set.
     * @return the StaticSiteBuildProperties object itself.
     */
    public StaticSiteBuildProperties withGithubActionSecretNameOverride(String githubActionSecretNameOverride) {
        this.githubActionSecretNameOverride = githubActionSecretNameOverride;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
