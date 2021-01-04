// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.resourcemanager.appplatform.generated.fluent.models.ConfigServerSettingsValidateResultInner;
import java.util.List;

/** An immutable client-side representation of ConfigServerSettingsValidateResult. */
public interface ConfigServerSettingsValidateResult {
    /**
     * Gets the isValid property: Indicate if the config server settings are valid.
     *
     * @return the isValid value.
     */
    Boolean isValid();

    /**
     * Gets the details property: The detail validation results.
     *
     * @return the details value.
     */
    List<ConfigServerSettingsErrorRecord> details();

    /**
     * Gets the inner
     * com.azure.resourcemanager.appplatform.generated.fluent.models.ConfigServerSettingsValidateResultInner object.
     *
     * @return the inner object.
     */
    ConfigServerSettingsValidateResultInner innerModel();
}
