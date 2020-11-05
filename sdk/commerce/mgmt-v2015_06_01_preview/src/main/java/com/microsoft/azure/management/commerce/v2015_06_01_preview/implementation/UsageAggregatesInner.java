/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.commerce.v2015_06_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.commerce.v2015_06_01_preview.AggregationGranularity;
import com.microsoft.azure.management.commerce.v2015_06_01_preview.ErrorResponseException;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import rx.Observable;
import rx.functions.Func1;

/**
 * An instance of this class provides access to all the operations defined
 * in UsageAggregates.
 */
public class UsageAggregatesInner {
    /** The Retrofit service to perform REST calls. */
    private UsageAggregatesService service;
    /** The service client containing this operation class. */
    private UsageManagementClientImpl client;

    /**
     * Initializes an instance of UsageAggregatesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public UsageAggregatesInner(Retrofit retrofit, UsageManagementClientImpl client) {
        this.service = retrofit.create(UsageAggregatesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for UsageAggregates to be
     * used by Retrofit to perform actually REST calls.
     */
    interface UsageAggregatesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.commerce.v2015_06_01_preview.UsageAggregates list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Commerce/UsageAggregates")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("reportedStartTime") DateTime reportedStartTime, @Query("reportedEndTime") DateTime reportedEndTime, @Query("showDetails") Boolean showDetails, @Query("aggregationGranularity") AggregationGranularity aggregationGranularity, @Query("continuationToken") String continuationToken, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.commerce.v2015_06_01_preview.UsageAggregates listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Test Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;UsageAggregationInner&gt; object if successful.
     */
    public PagedList<UsageAggregationInner> list(final DateTime reportedStartTime, final DateTime reportedEndTime) {
        ServiceResponse<Page<UsageAggregationInner>> response = listSinglePageAsync(reportedStartTime, reportedEndTime).toBlocking().single();
        return new PagedList<UsageAggregationInner>(response.body()) {
            @Override
            public Page<UsageAggregationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Test Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<UsageAggregationInner>> listAsync(final DateTime reportedStartTime, final DateTime reportedEndTime, final ListOperationCallback<UsageAggregationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(reportedStartTime, reportedEndTime),
            new Func1<String, Observable<ServiceResponse<Page<UsageAggregationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageAggregationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Test Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;UsageAggregationInner&gt; object
     */
    public Observable<Page<UsageAggregationInner>> listAsync(final DateTime reportedStartTime, final DateTime reportedEndTime) {
        return listWithServiceResponseAsync(reportedStartTime, reportedEndTime)
            .map(new Func1<ServiceResponse<Page<UsageAggregationInner>>, Page<UsageAggregationInner>>() {
                @Override
                public Page<UsageAggregationInner> call(ServiceResponse<Page<UsageAggregationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Test Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;UsageAggregationInner&gt; object
     */
    public Observable<ServiceResponse<Page<UsageAggregationInner>>> listWithServiceResponseAsync(final DateTime reportedStartTime, final DateTime reportedEndTime) {
        return listSinglePageAsync(reportedStartTime, reportedEndTime)
            .concatMap(new Func1<ServiceResponse<Page<UsageAggregationInner>>, Observable<ServiceResponse<Page<UsageAggregationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageAggregationInner>>> call(ServiceResponse<Page<UsageAggregationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Test Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;UsageAggregationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<UsageAggregationInner>>> listSinglePageAsync(final DateTime reportedStartTime, final DateTime reportedEndTime) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (reportedStartTime == null) {
            throw new IllegalArgumentException("Parameter reportedStartTime is required and cannot be null.");
        }
        if (reportedEndTime == null) {
            throw new IllegalArgumentException("Parameter reportedEndTime is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final Boolean showDetails = null;
        final AggregationGranularity aggregationGranularity = null;
        final String continuationToken = null;
        return service.list(this.client.subscriptionId(), reportedStartTime, reportedEndTime, showDetails, aggregationGranularity, continuationToken, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<UsageAggregationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageAggregationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<UsageAggregationInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<UsageAggregationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Test Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @param showDetails `True` returns usage data in instance-level detail, `false` causes server-side aggregation with fewer details. For example, if you have 3 website instances, by default you will get 3 line items for website consumption. If you specify showDetails = false, the data will be aggregated as a single line item for website consumption within the time period (for the given subscriptionId, meterId, usageStartTime and usageEndTime).
     * @param aggregationGranularity `Daily` (default) returns the data in daily granularity, `Hourly` returns the data in hourly granularity. Possible values include: 'Daily', 'Hourly'
     * @param continuationToken Used when a continuation token string is provided in the response body of the previous call, enabling paging through a large result set. If not present, the data is retrieved from the beginning of the day/hour (based on the granularity) passed in.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;UsageAggregationInner&gt; object if successful.
     */
    public PagedList<UsageAggregationInner> list(final DateTime reportedStartTime, final DateTime reportedEndTime, final Boolean showDetails, final AggregationGranularity aggregationGranularity, final String continuationToken) {
        ServiceResponse<Page<UsageAggregationInner>> response = listSinglePageAsync(reportedStartTime, reportedEndTime, showDetails, aggregationGranularity, continuationToken).toBlocking().single();
        return new PagedList<UsageAggregationInner>(response.body()) {
            @Override
            public Page<UsageAggregationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Test Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @param showDetails `True` returns usage data in instance-level detail, `false` causes server-side aggregation with fewer details. For example, if you have 3 website instances, by default you will get 3 line items for website consumption. If you specify showDetails = false, the data will be aggregated as a single line item for website consumption within the time period (for the given subscriptionId, meterId, usageStartTime and usageEndTime).
     * @param aggregationGranularity `Daily` (default) returns the data in daily granularity, `Hourly` returns the data in hourly granularity. Possible values include: 'Daily', 'Hourly'
     * @param continuationToken Used when a continuation token string is provided in the response body of the previous call, enabling paging through a large result set. If not present, the data is retrieved from the beginning of the day/hour (based on the granularity) passed in.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<UsageAggregationInner>> listAsync(final DateTime reportedStartTime, final DateTime reportedEndTime, final Boolean showDetails, final AggregationGranularity aggregationGranularity, final String continuationToken, final ListOperationCallback<UsageAggregationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(reportedStartTime, reportedEndTime, showDetails, aggregationGranularity, continuationToken),
            new Func1<String, Observable<ServiceResponse<Page<UsageAggregationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageAggregationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Test Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @param showDetails `True` returns usage data in instance-level detail, `false` causes server-side aggregation with fewer details. For example, if you have 3 website instances, by default you will get 3 line items for website consumption. If you specify showDetails = false, the data will be aggregated as a single line item for website consumption within the time period (for the given subscriptionId, meterId, usageStartTime and usageEndTime).
     * @param aggregationGranularity `Daily` (default) returns the data in daily granularity, `Hourly` returns the data in hourly granularity. Possible values include: 'Daily', 'Hourly'
     * @param continuationToken Used when a continuation token string is provided in the response body of the previous call, enabling paging through a large result set. If not present, the data is retrieved from the beginning of the day/hour (based on the granularity) passed in.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;UsageAggregationInner&gt; object
     */
    public Observable<Page<UsageAggregationInner>> listAsync(final DateTime reportedStartTime, final DateTime reportedEndTime, final Boolean showDetails, final AggregationGranularity aggregationGranularity, final String continuationToken) {
        return listWithServiceResponseAsync(reportedStartTime, reportedEndTime, showDetails, aggregationGranularity, continuationToken)
            .map(new Func1<ServiceResponse<Page<UsageAggregationInner>>, Page<UsageAggregationInner>>() {
                @Override
                public Page<UsageAggregationInner> call(ServiceResponse<Page<UsageAggregationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Test Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @param showDetails `True` returns usage data in instance-level detail, `false` causes server-side aggregation with fewer details. For example, if you have 3 website instances, by default you will get 3 line items for website consumption. If you specify showDetails = false, the data will be aggregated as a single line item for website consumption within the time period (for the given subscriptionId, meterId, usageStartTime and usageEndTime).
     * @param aggregationGranularity `Daily` (default) returns the data in daily granularity, `Hourly` returns the data in hourly granularity. Possible values include: 'Daily', 'Hourly'
     * @param continuationToken Used when a continuation token string is provided in the response body of the previous call, enabling paging through a large result set. If not present, the data is retrieved from the beginning of the day/hour (based on the granularity) passed in.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;UsageAggregationInner&gt; object
     */
    public Observable<ServiceResponse<Page<UsageAggregationInner>>> listWithServiceResponseAsync(final DateTime reportedStartTime, final DateTime reportedEndTime, final Boolean showDetails, final AggregationGranularity aggregationGranularity, final String continuationToken) {
        return listSinglePageAsync(reportedStartTime, reportedEndTime, showDetails, aggregationGranularity, continuationToken)
            .concatMap(new Func1<ServiceResponse<Page<UsageAggregationInner>>, Observable<ServiceResponse<Page<UsageAggregationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageAggregationInner>>> call(ServiceResponse<Page<UsageAggregationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Test Query aggregated Azure subscription consumption data for a date range.
     *
    ServiceResponse<PageImpl<UsageAggregationInner>> * @param reportedStartTime The start of the time range to retrieve data for.
    ServiceResponse<PageImpl<UsageAggregationInner>> * @param reportedEndTime The end of the time range to retrieve data for.
    ServiceResponse<PageImpl<UsageAggregationInner>> * @param showDetails `True` returns usage data in instance-level detail, `false` causes server-side aggregation with fewer details. For example, if you have 3 website instances, by default you will get 3 line items for website consumption. If you specify showDetails = false, the data will be aggregated as a single line item for website consumption within the time period (for the given subscriptionId, meterId, usageStartTime and usageEndTime).
    ServiceResponse<PageImpl<UsageAggregationInner>> * @param aggregationGranularity `Daily` (default) returns the data in daily granularity, `Hourly` returns the data in hourly granularity. Possible values include: 'Daily', 'Hourly'
    ServiceResponse<PageImpl<UsageAggregationInner>> * @param continuationToken Used when a continuation token string is provided in the response body of the previous call, enabling paging through a large result set. If not present, the data is retrieved from the beginning of the day/hour (based on the granularity) passed in.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;UsageAggregationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<UsageAggregationInner>>> listSinglePageAsync(final DateTime reportedStartTime, final DateTime reportedEndTime, final Boolean showDetails, final AggregationGranularity aggregationGranularity, final String continuationToken) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (reportedStartTime == null) {
            throw new IllegalArgumentException("Parameter reportedStartTime is required and cannot be null.");
        }
        if (reportedEndTime == null) {
            throw new IllegalArgumentException("Parameter reportedEndTime is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), reportedStartTime, reportedEndTime, showDetails, aggregationGranularity, continuationToken, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<UsageAggregationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageAggregationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<UsageAggregationInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<UsageAggregationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<UsageAggregationInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<UsageAggregationInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<UsageAggregationInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Test Query aggregated Azure subscription consumption data for a date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;UsageAggregationInner&gt; object if successful.
     */
    public PagedList<UsageAggregationInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<UsageAggregationInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<UsageAggregationInner>(response.body()) {
            @Override
            public Page<UsageAggregationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Test Query aggregated Azure subscription consumption data for a date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<UsageAggregationInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<UsageAggregationInner>> serviceFuture, final ListOperationCallback<UsageAggregationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<UsageAggregationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageAggregationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Test Query aggregated Azure subscription consumption data for a date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;UsageAggregationInner&gt; object
     */
    public Observable<Page<UsageAggregationInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<UsageAggregationInner>>, Page<UsageAggregationInner>>() {
                @Override
                public Page<UsageAggregationInner> call(ServiceResponse<Page<UsageAggregationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Test Query aggregated Azure subscription consumption data for a date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;UsageAggregationInner&gt; object
     */
    public Observable<ServiceResponse<Page<UsageAggregationInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<UsageAggregationInner>>, Observable<ServiceResponse<Page<UsageAggregationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageAggregationInner>>> call(ServiceResponse<Page<UsageAggregationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Test Query aggregated Azure subscription consumption data for a date range.
     *
    ServiceResponse<PageImpl<UsageAggregationInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;UsageAggregationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<UsageAggregationInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<UsageAggregationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageAggregationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<UsageAggregationInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<UsageAggregationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<UsageAggregationInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<UsageAggregationInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<UsageAggregationInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
