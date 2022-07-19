// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TextAnnotationType. */
public final class TextAnnotationType extends ExpandableStringEnum<TextAnnotationType> {
    /** Static value Classification for TextAnnotationType. */
    public static final TextAnnotationType CLASSIFICATION = fromString("Classification");

    /** Static value NamedEntityRecognition for TextAnnotationType. */
    public static final TextAnnotationType NAMED_ENTITY_RECOGNITION = fromString("NamedEntityRecognition");

    /**
     * Creates or finds a TextAnnotationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TextAnnotationType.
     */
    @JsonCreator
    public static TextAnnotationType fromString(String name) {
        return fromString(name, TextAnnotationType.class);
    }

    /**
     * Gets known TextAnnotationType values.
     *
     * @return known TextAnnotationType values.
     */
    public static Collection<TextAnnotationType> values() {
        return values(TextAnnotationType.class);
    }
}
