// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.resourcemanager.appplatform.generated.fluent.models.ConfigurationServiceSettingsValidateResultInner;

/** An immutable client-side representation of ConfigurationServiceSettingsValidateResult. */
public interface ConfigurationServiceSettingsValidateResult {
    /**
     * Gets the gitPropertyValidationResult property: Validation result for configuration service settings.
     *
     * @return the gitPropertyValidationResult value.
     */
    ConfigurationServiceGitPropertyValidateResult gitPropertyValidationResult();

    /**
     * Gets the inner
     * com.azure.resourcemanager.appplatform.generated.fluent.models.ConfigurationServiceSettingsValidateResultInner
     * object.
     *
     * @return the inner object.
     */
    ConfigurationServiceSettingsValidateResultInner innerModel();
}
