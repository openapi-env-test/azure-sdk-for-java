// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.AuthPlatform;
import com.azure.resourcemanager.appservice.generated.models.GlobalValidation;
import com.azure.resourcemanager.appservice.generated.models.HttpSettings;
import com.azure.resourcemanager.appservice.generated.models.IdentityProviders;
import com.azure.resourcemanager.appservice.generated.models.Login;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SiteAuthSettingsV2 resource specific properties. */
@Fluent
public final class SiteAuthSettingsV2Properties {
    /*
     * The configuration settings of the platform of App Service
     * Authentication/Authorization.
     */
    @JsonProperty(value = "platform")
    private AuthPlatform platform;

    /*
     * The configuration settings that determines the validation flow of users
     * using App Service Authentication/Authorization.
     */
    @JsonProperty(value = "globalValidation")
    private GlobalValidation globalValidation;

    /*
     * The configuration settings of each of the identity providers used to
     * configure App Service Authentication/Authorization.
     */
    @JsonProperty(value = "identityProviders")
    private IdentityProviders identityProviders;

    /*
     * The configuration settings of the login flow of users using App Service
     * Authentication/Authorization.
     */
    @JsonProperty(value = "login")
    private Login login;

    /*
     * The configuration settings of the HTTP requests for authentication and
     * authorization requests made against App Service
     * Authentication/Authorization.
     */
    @JsonProperty(value = "httpSettings")
    private HttpSettings httpSettings;

    /**
     * Get the platform property: The configuration settings of the platform of App Service
     * Authentication/Authorization.
     *
     * @return the platform value.
     */
    public AuthPlatform platform() {
        return this.platform;
    }

    /**
     * Set the platform property: The configuration settings of the platform of App Service
     * Authentication/Authorization.
     *
     * @param platform the platform value to set.
     * @return the SiteAuthSettingsV2Properties object itself.
     */
    public SiteAuthSettingsV2Properties withPlatform(AuthPlatform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the globalValidation property: The configuration settings that determines the validation flow of users using
     * App Service Authentication/Authorization.
     *
     * @return the globalValidation value.
     */
    public GlobalValidation globalValidation() {
        return this.globalValidation;
    }

    /**
     * Set the globalValidation property: The configuration settings that determines the validation flow of users using
     * App Service Authentication/Authorization.
     *
     * @param globalValidation the globalValidation value to set.
     * @return the SiteAuthSettingsV2Properties object itself.
     */
    public SiteAuthSettingsV2Properties withGlobalValidation(GlobalValidation globalValidation) {
        this.globalValidation = globalValidation;
        return this;
    }

    /**
     * Get the identityProviders property: The configuration settings of each of the identity providers used to
     * configure App Service Authentication/Authorization.
     *
     * @return the identityProviders value.
     */
    public IdentityProviders identityProviders() {
        return this.identityProviders;
    }

    /**
     * Set the identityProviders property: The configuration settings of each of the identity providers used to
     * configure App Service Authentication/Authorization.
     *
     * @param identityProviders the identityProviders value to set.
     * @return the SiteAuthSettingsV2Properties object itself.
     */
    public SiteAuthSettingsV2Properties withIdentityProviders(IdentityProviders identityProviders) {
        this.identityProviders = identityProviders;
        return this;
    }

    /**
     * Get the login property: The configuration settings of the login flow of users using App Service
     * Authentication/Authorization.
     *
     * @return the login value.
     */
    public Login login() {
        return this.login;
    }

    /**
     * Set the login property: The configuration settings of the login flow of users using App Service
     * Authentication/Authorization.
     *
     * @param login the login value to set.
     * @return the SiteAuthSettingsV2Properties object itself.
     */
    public SiteAuthSettingsV2Properties withLogin(Login login) {
        this.login = login;
        return this;
    }

    /**
     * Get the httpSettings property: The configuration settings of the HTTP requests for authentication and
     * authorization requests made against App Service Authentication/Authorization.
     *
     * @return the httpSettings value.
     */
    public HttpSettings httpSettings() {
        return this.httpSettings;
    }

    /**
     * Set the httpSettings property: The configuration settings of the HTTP requests for authentication and
     * authorization requests made against App Service Authentication/Authorization.
     *
     * @param httpSettings the httpSettings value to set.
     * @return the SiteAuthSettingsV2Properties object itself.
     */
    public SiteAuthSettingsV2Properties withHttpSettings(HttpSettings httpSettings) {
        this.httpSettings = httpSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (platform() != null) {
            platform().validate();
        }
        if (globalValidation() != null) {
            globalValidation().validate();
        }
        if (identityProviders() != null) {
            identityProviders().validate();
        }
        if (login() != null) {
            login().validate();
        }
        if (httpSettings() != null) {
            httpSettings().validate();
        }
    }
}
