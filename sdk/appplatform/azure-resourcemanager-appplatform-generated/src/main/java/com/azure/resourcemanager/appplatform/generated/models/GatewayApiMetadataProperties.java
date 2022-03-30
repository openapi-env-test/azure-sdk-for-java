// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** API metadata property for Spring Cloud Gateway. */
@Fluent
public final class GatewayApiMetadataProperties {
    /*
     * Title describing the context of the APIs available on the Gateway
     * instance (default: `Spring Cloud Gateway for K8S`)
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * Detailed description of the APIs available on the Gateway instance
     * (default: `Generated OpenAPI 3 document that describes the API routes
     * configured.`)
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Location of additional documentation for the APIs available on the
     * Gateway instance
     */
    @JsonProperty(value = "documentation")
    private String documentation;

    /*
     * Version of APIs available on this Gateway instance (default:
     * `unspecified`).
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Base URL that API consumers will use to access APIs on the Gateway
     * instance.
     */
    @JsonProperty(value = "serverUrl")
    private String serverUrl;

    /**
     * Get the title property: Title describing the context of the APIs available on the Gateway instance (default:
     * `Spring Cloud Gateway for K8S`).
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: Title describing the context of the APIs available on the Gateway instance (default:
     * `Spring Cloud Gateway for K8S`).
     *
     * @param title the title value to set.
     * @return the GatewayApiMetadataProperties object itself.
     */
    public GatewayApiMetadataProperties withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the description property: Detailed description of the APIs available on the Gateway instance (default:
     * `Generated OpenAPI 3 document that describes the API routes configured.`).
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Detailed description of the APIs available on the Gateway instance (default:
     * `Generated OpenAPI 3 document that describes the API routes configured.`).
     *
     * @param description the description value to set.
     * @return the GatewayApiMetadataProperties object itself.
     */
    public GatewayApiMetadataProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the documentation property: Location of additional documentation for the APIs available on the Gateway
     * instance.
     *
     * @return the documentation value.
     */
    public String documentation() {
        return this.documentation;
    }

    /**
     * Set the documentation property: Location of additional documentation for the APIs available on the Gateway
     * instance.
     *
     * @param documentation the documentation value to set.
     * @return the GatewayApiMetadataProperties object itself.
     */
    public GatewayApiMetadataProperties withDocumentation(String documentation) {
        this.documentation = documentation;
        return this;
    }

    /**
     * Get the version property: Version of APIs available on this Gateway instance (default: `unspecified`).
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version of APIs available on this Gateway instance (default: `unspecified`).
     *
     * @param version the version value to set.
     * @return the GatewayApiMetadataProperties object itself.
     */
    public GatewayApiMetadataProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the serverUrl property: Base URL that API consumers will use to access APIs on the Gateway instance.
     *
     * @return the serverUrl value.
     */
    public String serverUrl() {
        return this.serverUrl;
    }

    /**
     * Set the serverUrl property: Base URL that API consumers will use to access APIs on the Gateway instance.
     *
     * @param serverUrl the serverUrl value to set.
     * @return the GatewayApiMetadataProperties object itself.
     */
    public GatewayApiMetadataProperties withServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
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
