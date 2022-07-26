// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.monitor.generated.fluent.BaselinesClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.SingleMetricBaselineInner;
import com.azure.resourcemanager.monitor.generated.models.MetricBaselinesResponse;
import com.azure.resourcemanager.monitor.generated.models.ResultType;
import java.time.Duration;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in BaselinesClient. */
public final class BaselinesClientImpl implements BaselinesClient {
    /** The proxy service used to perform REST calls. */
    private final BaselinesService service;

    /** The service client containing this operation class. */
    private final MonitorClientImpl client;

    /**
     * Initializes an instance of BaselinesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    BaselinesClientImpl(MonitorClientImpl client) {
        this.service =
            RestProxy.create(BaselinesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientBaselines to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientBaselin")
    private interface BaselinesService {
        @Headers({"Content-Type: application/json"})
        @Get("/{resourceUri}/providers/Microsoft.Insights/metricBaselines")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MetricBaselinesResponse>> list(
            @HostParam("$host") String endpoint,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @QueryParam("metricnames") String metricnames,
            @QueryParam("metricnamespace") String metricnamespace,
            @QueryParam("timespan") String timespan,
            @QueryParam("interval") Duration interval,
            @QueryParam("aggregation") String aggregation,
            @QueryParam("sensitivities") String sensitivities,
            @QueryParam("$filter") String filter,
            @QueryParam("resultType") ResultType resultType,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * **Lists the metric baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param metricnames The names of the metrics (comma separated) to retrieve. Special case: If a metricname itself
     *     has a comma in it then use %2 to indicate it. Eg: 'Metric,Name1' should be **'Metric%2Name1'**.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param filter The **$filter** is used to reduce the set of metric data returned. Example: Metric contains
     *     metadata A, B and C. - Return all time series of C where A = a1 and B = b1 or b2 **$filter=A eq 'a1' and B eq
     *     'b1' or B eq 'b2' and C eq '*'** - Invalid variant: **$filter=A eq 'a1' and B eq 'b1' and C eq '*' or B =
     *     'b2'** This is invalid because the logical or operator cannot separate two different metadata names. - Return
     *     all time series where A = a1, B = b1 and C = c1: **$filter=A eq 'a1' and B eq 'b1' and C eq 'c1'** - Return
     *     all time series where A = a1 **$filter=A eq 'a1' and B eq '*' and C eq '*'**. Special case: When dimension
     *     name or dimension value uses round brackets. Eg: When dimension name is **dim (test) 1** Instead of using
     *     $filter= "dim (test) 1 eq '*' " use **$filter= "dim %2528test%2529 1 eq '*' "** When dimension name is **dim
     *     (test) 3** and dimension value is **dim3 (test) val** Instead of using $filter= "dim (test) 3 eq 'dim3 (test)
     *     val' " use **$filter= "dim %2528test%2529 3 eq 'dim3 %2528test%2529 val' "**.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of metric baselines along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SingleMetricBaselineInner>> listSinglePageAsync(
        String resourceUri,
        String metricnames,
        String metricnamespace,
        String timespan,
        Duration interval,
        String aggregation,
        String sensitivities,
        String filter,
        ResultType resultType) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String apiVersion = "2019-03-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            resourceUri,
                            metricnames,
                            metricnamespace,
                            timespan,
                            interval,
                            aggregation,
                            sensitivities,
                            filter,
                            resultType,
                            apiVersion,
                            accept,
                            context))
            .<PagedResponse<SingleMetricBaselineInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * **Lists the metric baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param metricnames The names of the metrics (comma separated) to retrieve. Special case: If a metricname itself
     *     has a comma in it then use %2 to indicate it. Eg: 'Metric,Name1' should be **'Metric%2Name1'**.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param filter The **$filter** is used to reduce the set of metric data returned. Example: Metric contains
     *     metadata A, B and C. - Return all time series of C where A = a1 and B = b1 or b2 **$filter=A eq 'a1' and B eq
     *     'b1' or B eq 'b2' and C eq '*'** - Invalid variant: **$filter=A eq 'a1' and B eq 'b1' and C eq '*' or B =
     *     'b2'** This is invalid because the logical or operator cannot separate two different metadata names. - Return
     *     all time series where A = a1, B = b1 and C = c1: **$filter=A eq 'a1' and B eq 'b1' and C eq 'c1'** - Return
     *     all time series where A = a1 **$filter=A eq 'a1' and B eq '*' and C eq '*'**. Special case: When dimension
     *     name or dimension value uses round brackets. Eg: When dimension name is **dim (test) 1** Instead of using
     *     $filter= "dim (test) 1 eq '*' " use **$filter= "dim %2528test%2529 1 eq '*' "** When dimension name is **dim
     *     (test) 3** and dimension value is **dim3 (test) val** Instead of using $filter= "dim (test) 3 eq 'dim3 (test)
     *     val' " use **$filter= "dim %2528test%2529 3 eq 'dim3 %2528test%2529 val' "**.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of metric baselines along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SingleMetricBaselineInner>> listSinglePageAsync(
        String resourceUri,
        String metricnames,
        String metricnamespace,
        String timespan,
        Duration interval,
        String aggregation,
        String sensitivities,
        String filter,
        ResultType resultType,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String apiVersion = "2019-03-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                resourceUri,
                metricnames,
                metricnamespace,
                timespan,
                interval,
                aggregation,
                sensitivities,
                filter,
                resultType,
                apiVersion,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * **Lists the metric baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param metricnames The names of the metrics (comma separated) to retrieve. Special case: If a metricname itself
     *     has a comma in it then use %2 to indicate it. Eg: 'Metric,Name1' should be **'Metric%2Name1'**.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param filter The **$filter** is used to reduce the set of metric data returned. Example: Metric contains
     *     metadata A, B and C. - Return all time series of C where A = a1 and B = b1 or b2 **$filter=A eq 'a1' and B eq
     *     'b1' or B eq 'b2' and C eq '*'** - Invalid variant: **$filter=A eq 'a1' and B eq 'b1' and C eq '*' or B =
     *     'b2'** This is invalid because the logical or operator cannot separate two different metadata names. - Return
     *     all time series where A = a1, B = b1 and C = c1: **$filter=A eq 'a1' and B eq 'b1' and C eq 'c1'** - Return
     *     all time series where A = a1 **$filter=A eq 'a1' and B eq '*' and C eq '*'**. Special case: When dimension
     *     name or dimension value uses round brackets. Eg: When dimension name is **dim (test) 1** Instead of using
     *     $filter= "dim (test) 1 eq '*' " use **$filter= "dim %2528test%2529 1 eq '*' "** When dimension name is **dim
     *     (test) 3** and dimension value is **dim3 (test) val** Instead of using $filter= "dim (test) 3 eq 'dim3 (test)
     *     val' " use **$filter= "dim %2528test%2529 3 eq 'dim3 %2528test%2529 val' "**.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of metric baselines as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SingleMetricBaselineInner> listAsync(
        String resourceUri,
        String metricnames,
        String metricnamespace,
        String timespan,
        Duration interval,
        String aggregation,
        String sensitivities,
        String filter,
        ResultType resultType) {
        return new PagedFlux<>(
            () ->
                listSinglePageAsync(
                    resourceUri,
                    metricnames,
                    metricnamespace,
                    timespan,
                    interval,
                    aggregation,
                    sensitivities,
                    filter,
                    resultType));
    }

    /**
     * **Lists the metric baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of metric baselines as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SingleMetricBaselineInner> listAsync(String resourceUri) {
        final String metricnames = null;
        final String metricnamespace = null;
        final String timespan = null;
        final Duration interval = null;
        final String aggregation = null;
        final String sensitivities = null;
        final String filter = null;
        final ResultType resultType = null;
        return new PagedFlux<>(
            () ->
                listSinglePageAsync(
                    resourceUri,
                    metricnames,
                    metricnamespace,
                    timespan,
                    interval,
                    aggregation,
                    sensitivities,
                    filter,
                    resultType));
    }

    /**
     * **Lists the metric baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param metricnames The names of the metrics (comma separated) to retrieve. Special case: If a metricname itself
     *     has a comma in it then use %2 to indicate it. Eg: 'Metric,Name1' should be **'Metric%2Name1'**.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param filter The **$filter** is used to reduce the set of metric data returned. Example: Metric contains
     *     metadata A, B and C. - Return all time series of C where A = a1 and B = b1 or b2 **$filter=A eq 'a1' and B eq
     *     'b1' or B eq 'b2' and C eq '*'** - Invalid variant: **$filter=A eq 'a1' and B eq 'b1' and C eq '*' or B =
     *     'b2'** This is invalid because the logical or operator cannot separate two different metadata names. - Return
     *     all time series where A = a1, B = b1 and C = c1: **$filter=A eq 'a1' and B eq 'b1' and C eq 'c1'** - Return
     *     all time series where A = a1 **$filter=A eq 'a1' and B eq '*' and C eq '*'**. Special case: When dimension
     *     name or dimension value uses round brackets. Eg: When dimension name is **dim (test) 1** Instead of using
     *     $filter= "dim (test) 1 eq '*' " use **$filter= "dim %2528test%2529 1 eq '*' "** When dimension name is **dim
     *     (test) 3** and dimension value is **dim3 (test) val** Instead of using $filter= "dim (test) 3 eq 'dim3 (test)
     *     val' " use **$filter= "dim %2528test%2529 3 eq 'dim3 %2528test%2529 val' "**.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of metric baselines as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SingleMetricBaselineInner> listAsync(
        String resourceUri,
        String metricnames,
        String metricnamespace,
        String timespan,
        Duration interval,
        String aggregation,
        String sensitivities,
        String filter,
        ResultType resultType,
        Context context) {
        return new PagedFlux<>(
            () ->
                listSinglePageAsync(
                    resourceUri,
                    metricnames,
                    metricnamespace,
                    timespan,
                    interval,
                    aggregation,
                    sensitivities,
                    filter,
                    resultType,
                    context));
    }

    /**
     * **Lists the metric baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of metric baselines as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SingleMetricBaselineInner> list(String resourceUri) {
        final String metricnames = null;
        final String metricnamespace = null;
        final String timespan = null;
        final Duration interval = null;
        final String aggregation = null;
        final String sensitivities = null;
        final String filter = null;
        final ResultType resultType = null;
        return new PagedIterable<>(
            listAsync(
                resourceUri,
                metricnames,
                metricnamespace,
                timespan,
                interval,
                aggregation,
                sensitivities,
                filter,
                resultType));
    }

    /**
     * **Lists the metric baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param metricnames The names of the metrics (comma separated) to retrieve. Special case: If a metricname itself
     *     has a comma in it then use %2 to indicate it. Eg: 'Metric,Name1' should be **'Metric%2Name1'**.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param filter The **$filter** is used to reduce the set of metric data returned. Example: Metric contains
     *     metadata A, B and C. - Return all time series of C where A = a1 and B = b1 or b2 **$filter=A eq 'a1' and B eq
     *     'b1' or B eq 'b2' and C eq '*'** - Invalid variant: **$filter=A eq 'a1' and B eq 'b1' and C eq '*' or B =
     *     'b2'** This is invalid because the logical or operator cannot separate two different metadata names. - Return
     *     all time series where A = a1, B = b1 and C = c1: **$filter=A eq 'a1' and B eq 'b1' and C eq 'c1'** - Return
     *     all time series where A = a1 **$filter=A eq 'a1' and B eq '*' and C eq '*'**. Special case: When dimension
     *     name or dimension value uses round brackets. Eg: When dimension name is **dim (test) 1** Instead of using
     *     $filter= "dim (test) 1 eq '*' " use **$filter= "dim %2528test%2529 1 eq '*' "** When dimension name is **dim
     *     (test) 3** and dimension value is **dim3 (test) val** Instead of using $filter= "dim (test) 3 eq 'dim3 (test)
     *     val' " use **$filter= "dim %2528test%2529 3 eq 'dim3 %2528test%2529 val' "**.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of metric baselines as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SingleMetricBaselineInner> list(
        String resourceUri,
        String metricnames,
        String metricnamespace,
        String timespan,
        Duration interval,
        String aggregation,
        String sensitivities,
        String filter,
        ResultType resultType,
        Context context) {
        return new PagedIterable<>(
            listAsync(
                resourceUri,
                metricnames,
                metricnamespace,
                timespan,
                interval,
                aggregation,
                sensitivities,
                filter,
                resultType,
                context));
    }
}
