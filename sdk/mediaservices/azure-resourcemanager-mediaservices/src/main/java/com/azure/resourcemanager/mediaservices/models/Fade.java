// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** Describes the properties of a Fade effect applied to the input media. */
@Fluent
public final class Fade {
    /*
     * The Duration of the fade effect in the video. The value can be in ISO 8601 format (For example, PT05S to fade
     * In/Out a color during 5 seconds), or a frame count (For example, 10 to fade 10 frames from the start time), or a
     * relative value to stream duration (For example, 10% to fade 10% of stream duration)
     */
    @JsonProperty(value = "duration", required = true)
    private Duration duration;

    /*
     * The Color for the fade In/Out. it can be on the CSS Level1 colors
     * https://developer.mozilla.org/en-US/docs/Web/CSS/color_value/color_keywords or an RGB/hex value: e.g:
     * rgb(255,0,0), 0xFF0000 or #FF0000
     */
    @JsonProperty(value = "fadeColor", required = true)
    private String fadeColor;

    /*
     * The position in the input video from where to start fade. The value can be in ISO 8601 format (For example,
     * PT05S to start at 5 seconds), or a frame count (For example, 10 to start at the 10th frame), or a relative value
     * to stream duration (For example, 10% to start at 10% of stream duration). Default is 0
     */
    @JsonProperty(value = "start")
    private String start;

    /** Creates an instance of Fade class. */
    public Fade() {
    }

    /**
     * Get the duration property: The Duration of the fade effect in the video. The value can be in ISO 8601 format (For
     * example, PT05S to fade In/Out a color during 5 seconds), or a frame count (For example, 10 to fade 10 frames from
     * the start time), or a relative value to stream duration (For example, 10% to fade 10% of stream duration).
     *
     * @return the duration value.
     */
    public Duration duration() {
        return this.duration;
    }

    /**
     * Set the duration property: The Duration of the fade effect in the video. The value can be in ISO 8601 format (For
     * example, PT05S to fade In/Out a color during 5 seconds), or a frame count (For example, 10 to fade 10 frames from
     * the start time), or a relative value to stream duration (For example, 10% to fade 10% of stream duration).
     *
     * @param duration the duration value to set.
     * @return the Fade object itself.
     */
    public Fade withDuration(Duration duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the fadeColor property: The Color for the fade In/Out. it can be on the CSS Level1 colors
     * https://developer.mozilla.org/en-US/docs/Web/CSS/color_value/color_keywords or an RGB/hex value: e.g:
     * rgb(255,0,0), 0xFF0000 or #FF0000.
     *
     * @return the fadeColor value.
     */
    public String fadeColor() {
        return this.fadeColor;
    }

    /**
     * Set the fadeColor property: The Color for the fade In/Out. it can be on the CSS Level1 colors
     * https://developer.mozilla.org/en-US/docs/Web/CSS/color_value/color_keywords or an RGB/hex value: e.g:
     * rgb(255,0,0), 0xFF0000 or #FF0000.
     *
     * @param fadeColor the fadeColor value to set.
     * @return the Fade object itself.
     */
    public Fade withFadeColor(String fadeColor) {
        this.fadeColor = fadeColor;
        return this;
    }

    /**
     * Get the start property: The position in the input video from where to start fade. The value can be in ISO 8601
     * format (For example, PT05S to start at 5 seconds), or a frame count (For example, 10 to start at the 10th frame),
     * or a relative value to stream duration (For example, 10% to start at 10% of stream duration). Default is 0.
     *
     * @return the start value.
     */
    public String start() {
        return this.start;
    }

    /**
     * Set the start property: The position in the input video from where to start fade. The value can be in ISO 8601
     * format (For example, PT05S to start at 5 seconds), or a frame count (For example, 10 to start at the 10th frame),
     * or a relative value to stream duration (For example, 10% to start at 10% of stream duration). Default is 0.
     *
     * @param start the start value to set.
     * @return the Fade object itself.
     */
    public Fade withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (duration() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property duration in model Fade"));
        }
        if (fadeColor() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property fadeColor in model Fade"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Fade.class);
}
