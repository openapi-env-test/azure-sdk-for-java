// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devops.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CodeRepositoryType. */
public final class CodeRepositoryType extends ExpandableStringEnum<CodeRepositoryType> {
    /** Static value gitHub for CodeRepositoryType. */
    public static final CodeRepositoryType GIT_HUB = fromString("gitHub");

    /** Static value vstsGit for CodeRepositoryType. */
    public static final CodeRepositoryType VSTS_GIT = fromString("vstsGit");

    /**
     * Creates or finds a CodeRepositoryType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CodeRepositoryType.
     */
    @JsonCreator
    public static CodeRepositoryType fromString(String name) {
        return fromString(name, CodeRepositoryType.class);
    }

    /** @return known CodeRepositoryType values. */
    public static Collection<CodeRepositoryType> values() {
        return values(CodeRepositoryType.class);
    }
}
