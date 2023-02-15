// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Match Variable. */
public final class WebApplicationFirewallMatchVariable
    extends ExpandableStringEnum<WebApplicationFirewallMatchVariable> {
    /** Static value RemoteAddr for WebApplicationFirewallMatchVariable. */
    public static final WebApplicationFirewallMatchVariable REMOTE_ADDR = fromString("RemoteAddr");

    /** Static value RequestMethod for WebApplicationFirewallMatchVariable. */
    public static final WebApplicationFirewallMatchVariable REQUEST_METHOD = fromString("RequestMethod");

    /** Static value QueryString for WebApplicationFirewallMatchVariable. */
    public static final WebApplicationFirewallMatchVariable QUERY_STRING = fromString("QueryString");

    /** Static value PostArgs for WebApplicationFirewallMatchVariable. */
    public static final WebApplicationFirewallMatchVariable POST_ARGS = fromString("PostArgs");

    /** Static value RequestUri for WebApplicationFirewallMatchVariable. */
    public static final WebApplicationFirewallMatchVariable REQUEST_URI = fromString("RequestUri");

    /** Static value RequestHeaders for WebApplicationFirewallMatchVariable. */
    public static final WebApplicationFirewallMatchVariable REQUEST_HEADERS = fromString("RequestHeaders");

    /** Static value RequestBody for WebApplicationFirewallMatchVariable. */
    public static final WebApplicationFirewallMatchVariable REQUEST_BODY = fromString("RequestBody");

    /** Static value RequestCookies for WebApplicationFirewallMatchVariable. */
    public static final WebApplicationFirewallMatchVariable REQUEST_COOKIES = fromString("RequestCookies");

    /**
     * Creates a new instance of WebApplicationFirewallMatchVariable value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public WebApplicationFirewallMatchVariable() {
    }

    /**
     * Creates or finds a WebApplicationFirewallMatchVariable from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WebApplicationFirewallMatchVariable.
     */
    @JsonCreator
    public static WebApplicationFirewallMatchVariable fromString(String name) {
        return fromString(name, WebApplicationFirewallMatchVariable.class);
    }

    /**
     * Gets known WebApplicationFirewallMatchVariable values.
     *
     * @return known WebApplicationFirewallMatchVariable values.
     */
    public static Collection<WebApplicationFirewallMatchVariable> values() {
        return values(WebApplicationFirewallMatchVariable.class);
    }
}
