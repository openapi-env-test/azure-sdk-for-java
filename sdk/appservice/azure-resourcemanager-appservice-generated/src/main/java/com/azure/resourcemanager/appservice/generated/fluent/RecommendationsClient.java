// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.RecommendationInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.RecommendationRuleInner;

/** An instance of this class provides access to all the operations defined in RecommendationsClient. */
public interface RecommendationsClient {
    /**
     * Description for List all recommendations for a subscription.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecommendationInner> list();

    /**
     * Description for List all recommendations for a subscription.
     *
     * @param featured Specify &lt;code&gt;true&lt;/code&gt; to return only the most critical recommendations. The
     *     default is &lt;code&gt;false&lt;/code&gt;, which returns all recommendations.
     * @param filter Filter is specified by using OData syntax. Example: $filter=channel eq 'Api' or channel eq
     *     'Notification' and startTime eq 2014-01-01T00:00:00Z and endTime eq 2014-12-31T23:59:59Z and timeGrain eq
     *     duration'[PT1H|PT1M|P1D].
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecommendationInner> list(Boolean featured, String filter, Context context);

    /**
     * Description for Reset all recommendation opt-out settings for a subscription.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void resetAllFilters();

    /**
     * Description for Reset all recommendation opt-out settings for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> resetAllFiltersWithResponse(Context context);

    /**
     * Description for Disables the specified rule so it will not apply to a subscription in the future.
     *
     * @param name Rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableRecommendationForSubscription(String name);

    /**
     * Description for Disables the specified rule so it will not apply to a subscription in the future.
     *
     * @param name Rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> disableRecommendationForSubscriptionWithResponse(String name, Context context);

    /**
     * Description for Get past recommendations for an app, optionally specified by the time range.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param hostingEnvironmentName Name of the hosting environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecommendationInner> listHistoryForHostingEnvironment(
        String resourceGroupName, String hostingEnvironmentName);

    /**
     * Description for Get past recommendations for an app, optionally specified by the time range.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param hostingEnvironmentName Name of the hosting environment.
     * @param expiredOnly Specify &lt;code&gt;false&lt;/code&gt; to return all recommendations. The default is
     *     &lt;code&gt;true&lt;/code&gt;, which returns only expired recommendations.
     * @param filter Filter is specified by using OData syntax. Example: $filter=channel eq 'Api' or channel eq
     *     'Notification' and startTime eq 2014-01-01T00:00:00Z and endTime eq 2014-12-31T23:59:59Z and timeGrain eq
     *     duration'[PT1H|PT1M|P1D].
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecommendationInner> listHistoryForHostingEnvironment(
        String resourceGroupName, String hostingEnvironmentName, Boolean expiredOnly, String filter, Context context);

    /**
     * Description for Get all recommendations for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param hostingEnvironmentName Name of the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecommendationInner> listRecommendedRulesForHostingEnvironment(
        String resourceGroupName, String hostingEnvironmentName);

    /**
     * Description for Get all recommendations for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param hostingEnvironmentName Name of the app.
     * @param featured Specify &lt;code&gt;true&lt;/code&gt; to return only the most critical recommendations. The
     *     default is &lt;code&gt;false&lt;/code&gt;, which returns all recommendations.
     * @param filter Return only channels specified in the filter. Filter is specified by using OData syntax. Example:
     *     $filter=channel eq 'Api' or channel eq 'Notification'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecommendationInner> listRecommendedRulesForHostingEnvironment(
        String resourceGroupName, String hostingEnvironmentName, Boolean featured, String filter, Context context);

    /**
     * Description for Disable all recommendations for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param environmentName Name of the app.
     * @param hostingEnvironmentName The hostingEnvironmentName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableAllForHostingEnvironment(
        String resourceGroupName, String environmentName, String hostingEnvironmentName);

    /**
     * Description for Disable all recommendations for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param environmentName Name of the app.
     * @param hostingEnvironmentName The hostingEnvironmentName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> disableAllForHostingEnvironmentWithResponse(
        String resourceGroupName, String environmentName, String hostingEnvironmentName, Context context);

    /**
     * Description for Reset all recommendation opt-out settings for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param environmentName Name of the app.
     * @param hostingEnvironmentName The hostingEnvironmentName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void resetAllFiltersForHostingEnvironment(
        String resourceGroupName, String environmentName, String hostingEnvironmentName);

    /**
     * Description for Reset all recommendation opt-out settings for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param environmentName Name of the app.
     * @param hostingEnvironmentName The hostingEnvironmentName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> resetAllFiltersForHostingEnvironmentWithResponse(
        String resourceGroupName, String environmentName, String hostingEnvironmentName, Context context);

    /**
     * Description for Get a recommendation rule for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param hostingEnvironmentName Name of the hosting environment.
     * @param name Name of the recommendation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a recommendation rule that the recommendation engine can perform.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RecommendationRuleInner getRuleDetailsByHostingEnvironment(
        String resourceGroupName, String hostingEnvironmentName, String name);

    /**
     * Description for Get a recommendation rule for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param hostingEnvironmentName Name of the hosting environment.
     * @param name Name of the recommendation.
     * @param updateSeen Specify &lt;code&gt;true&lt;/code&gt; to update the last-seen timestamp of the recommendation
     *     object.
     * @param recommendationId The GUID of the recommendation object if you query an expired one. You don't need to
     *     specify it to query an active entry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a recommendation rule that the recommendation engine can perform.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RecommendationRuleInner> getRuleDetailsByHostingEnvironmentWithResponse(
        String resourceGroupName,
        String hostingEnvironmentName,
        String name,
        Boolean updateSeen,
        String recommendationId,
        Context context);

    /**
     * Description for Disables the specific rule for a web site permanently.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param environmentName Site name.
     * @param name Rule name.
     * @param hostingEnvironmentName The hostingEnvironmentName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableRecommendationForHostingEnvironment(
        String resourceGroupName, String environmentName, String name, String hostingEnvironmentName);

    /**
     * Description for Disables the specific rule for a web site permanently.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param environmentName Site name.
     * @param name Rule name.
     * @param hostingEnvironmentName The hostingEnvironmentName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> disableRecommendationForHostingEnvironmentWithResponse(
        String resourceGroupName, String environmentName, String name, String hostingEnvironmentName, Context context);

    /**
     * Description for Get past recommendations for an app, optionally specified by the time range.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Name of the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecommendationInner> listHistoryForWebApp(String resourceGroupName, String siteName);

    /**
     * Description for Get past recommendations for an app, optionally specified by the time range.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Name of the app.
     * @param expiredOnly Specify &lt;code&gt;false&lt;/code&gt; to return all recommendations. The default is
     *     &lt;code&gt;true&lt;/code&gt;, which returns only expired recommendations.
     * @param filter Filter is specified by using OData syntax. Example: $filter=channel eq 'Api' or channel eq
     *     'Notification' and startTime eq 2014-01-01T00:00:00Z and endTime eq 2014-12-31T23:59:59Z and timeGrain eq
     *     duration'[PT1H|PT1M|P1D].
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecommendationInner> listHistoryForWebApp(
        String resourceGroupName, String siteName, Boolean expiredOnly, String filter, Context context);

    /**
     * Description for Get all recommendations for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Name of the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecommendationInner> listRecommendedRulesForWebApp(String resourceGroupName, String siteName);

    /**
     * Description for Get all recommendations for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Name of the app.
     * @param featured Specify &lt;code&gt;true&lt;/code&gt; to return only the most critical recommendations. The
     *     default is &lt;code&gt;false&lt;/code&gt;, which returns all recommendations.
     * @param filter Return only channels specified in the filter. Filter is specified by using OData syntax. Example:
     *     $filter=channel eq 'Api' or channel eq 'Notification'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecommendationInner> listRecommendedRulesForWebApp(
        String resourceGroupName, String siteName, Boolean featured, String filter, Context context);

    /**
     * Description for Disable all recommendations for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Name of the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableAllForWebApp(String resourceGroupName, String siteName);

    /**
     * Description for Disable all recommendations for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Name of the app.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> disableAllForWebAppWithResponse(String resourceGroupName, String siteName, Context context);

    /**
     * Description for Reset all recommendation opt-out settings for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Name of the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void resetAllFiltersForWebApp(String resourceGroupName, String siteName);

    /**
     * Description for Reset all recommendation opt-out settings for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Name of the app.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> resetAllFiltersForWebAppWithResponse(String resourceGroupName, String siteName, Context context);

    /**
     * Description for Get a recommendation rule for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Name of the app.
     * @param name Name of the recommendation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a recommendation rule that the recommendation engine can perform.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RecommendationRuleInner getRuleDetailsByWebApp(String resourceGroupName, String siteName, String name);

    /**
     * Description for Get a recommendation rule for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Name of the app.
     * @param name Name of the recommendation.
     * @param updateSeen Specify &lt;code&gt;true&lt;/code&gt; to update the last-seen timestamp of the recommendation
     *     object.
     * @param recommendationId The GUID of the recommendation object if you query an expired one. You don't need to
     *     specify it to query an active entry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a recommendation rule that the recommendation engine can perform.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RecommendationRuleInner> getRuleDetailsByWebAppWithResponse(
        String resourceGroupName,
        String siteName,
        String name,
        Boolean updateSeen,
        String recommendationId,
        Context context);

    /**
     * Description for Disables the specific rule for a web site permanently.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site name.
     * @param name Rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableRecommendationForSite(String resourceGroupName, String siteName, String name);

    /**
     * Description for Disables the specific rule for a web site permanently.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site name.
     * @param name Rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> disableRecommendationForSiteWithResponse(
        String resourceGroupName, String siteName, String name, Context context);
}
