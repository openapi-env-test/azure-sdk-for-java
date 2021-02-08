// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.SourceControlInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.UserInner;

/** Resource collection API of Providers. */
public interface Providers {
    /**
     * Gets the source controls available for Azure websites.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source controls available for Azure websites.
     */
    PagedIterable<SourceControl> getSourceControls();

    /**
     * Gets the source controls available for Azure websites.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source controls available for Azure websites.
     */
    PagedIterable<SourceControl> getSourceControls(Context context);

    /**
     * Gets source control token.
     *
     * @param sourceControlType Type of source control.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return source control token.
     */
    SourceControl getSourceControl(String sourceControlType);

    /**
     * Gets source control token.
     *
     * @param sourceControlType Type of source control.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return source control token.
     */
    Response<SourceControl> getSourceControlWithResponse(String sourceControlType, Context context);

    /**
     * Updates source control token.
     *
     * @param sourceControlType Type of source control.
     * @param requestMessage Source control token information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the Source Control OAuth Token.
     */
    SourceControl updateSourceControl(String sourceControlType, SourceControlInner requestMessage);

    /**
     * Updates source control token.
     *
     * @param sourceControlType Type of source control.
     * @param requestMessage Source control token information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the Source Control OAuth Token.
     */
    Response<SourceControl> updateSourceControlWithResponse(
        String sourceControlType, SourceControlInner requestMessage, Context context);

    /**
     * Gets publishing user.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publishing user.
     */
    User getPublishingUser();

    /**
     * Gets publishing user.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publishing user.
     */
    Response<User> getPublishingUserWithResponse(Context context);

    /**
     * Updates publishing user.
     *
     * @param requestMessage Details of publishing user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents user credentials used for publishing activity.
     */
    User updatePublishingUser(UserInner requestMessage);

    /**
     * Updates publishing user.
     *
     * @param requestMessage Details of publishing user.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents user credentials used for publishing activity.
     */
    Response<User> updatePublishingUserWithResponse(UserInner requestMessage, Context context);
}
