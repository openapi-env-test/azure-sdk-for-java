/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2019_01_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.consumption.v2019_01_01.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PriceSheets.
 */
public class PriceSheetsInner {
    /** The Retrofit service to perform REST calls. */
    private PriceSheetsService service;
    /** The service client containing this operation class. */
    private ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of PriceSheetsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PriceSheetsInner(Retrofit retrofit, ConsumptionManagementClientImpl client) {
        this.service = retrofit.create(PriceSheetsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PriceSheets to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PriceSheetsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.consumption.v2019_01_01.PriceSheets get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Consumption/pricesheets/default")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Query("$expand") String expand, @Query("$skiptoken") String skiptoken, @Query("$top") Integer top, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.consumption.v2019_01_01.PriceSheets getByBillingPeriod" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}/providers/Microsoft.Consumption/pricesheets/default")
        Observable<Response<ResponseBody>> getByBillingPeriod(@Path("subscriptionId") String subscriptionId, @Path("billingPeriodName") String billingPeriodName, @Query("$expand") String expand, @Query("$skiptoken") String skiptoken, @Query("$top") Integer top, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PriceSheetResultInner object if successful.
     */
    public PriceSheetResultInner get() {
        return getWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PriceSheetResultInner> getAsync(final ServiceCallback<PriceSheetResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResultInner object
     */
    public Observable<PriceSheetResultInner> getAsync() {
        return getWithServiceResponseAsync().map(new Func1<ServiceResponse<PriceSheetResultInner>, PriceSheetResultInner>() {
            @Override
            public PriceSheetResultInner call(ServiceResponse<PriceSheetResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResultInner object
     */
    public Observable<ServiceResponse<PriceSheetResultInner>> getWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        final String skiptoken = null;
        final Integer top = null;
        return service.get(this.client.subscriptionId(), expand, skiptoken, top, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PriceSheetResultInner>>>() {
                @Override
                public Observable<ServiceResponse<PriceSheetResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PriceSheetResultInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PriceSheetResultInner object if successful.
     */
    public PriceSheetResultInner get(String expand, String skiptoken, Integer top) {
        return getWithServiceResponseAsync(expand, skiptoken, top).toBlocking().single().body();
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PriceSheetResultInner> getAsync(String expand, String skiptoken, Integer top, final ServiceCallback<PriceSheetResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(expand, skiptoken, top), serviceCallback);
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResultInner object
     */
    public Observable<PriceSheetResultInner> getAsync(String expand, String skiptoken, Integer top) {
        return getWithServiceResponseAsync(expand, skiptoken, top).map(new Func1<ServiceResponse<PriceSheetResultInner>, PriceSheetResultInner>() {
            @Override
            public PriceSheetResultInner call(ServiceResponse<PriceSheetResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResultInner object
     */
    public Observable<ServiceResponse<PriceSheetResultInner>> getWithServiceResponseAsync(String expand, String skiptoken, Integer top) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), expand, skiptoken, top, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PriceSheetResultInner>>>() {
                @Override
                public Observable<ServiceResponse<PriceSheetResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PriceSheetResultInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PriceSheetResultInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PriceSheetResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PriceSheetResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PriceSheetResultInner object if successful.
     */
    public PriceSheetResultInner getByBillingPeriod(String billingPeriodName) {
        return getByBillingPeriodWithServiceResponseAsync(billingPeriodName).toBlocking().single().body();
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PriceSheetResultInner> getByBillingPeriodAsync(String billingPeriodName, final ServiceCallback<PriceSheetResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByBillingPeriodWithServiceResponseAsync(billingPeriodName), serviceCallback);
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResultInner object
     */
    public Observable<PriceSheetResultInner> getByBillingPeriodAsync(String billingPeriodName) {
        return getByBillingPeriodWithServiceResponseAsync(billingPeriodName).map(new Func1<ServiceResponse<PriceSheetResultInner>, PriceSheetResultInner>() {
            @Override
            public PriceSheetResultInner call(ServiceResponse<PriceSheetResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResultInner object
     */
    public Observable<ServiceResponse<PriceSheetResultInner>> getByBillingPeriodWithServiceResponseAsync(String billingPeriodName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (billingPeriodName == null) {
            throw new IllegalArgumentException("Parameter billingPeriodName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        final String skiptoken = null;
        final Integer top = null;
        return service.getByBillingPeriod(this.client.subscriptionId(), billingPeriodName, expand, skiptoken, top, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PriceSheetResultInner>>>() {
                @Override
                public Observable<ServiceResponse<PriceSheetResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PriceSheetResultInner> clientResponse = getByBillingPeriodDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PriceSheetResultInner object if successful.
     */
    public PriceSheetResultInner getByBillingPeriod(String billingPeriodName, String expand, String skiptoken, Integer top) {
        return getByBillingPeriodWithServiceResponseAsync(billingPeriodName, expand, skiptoken, top).toBlocking().single().body();
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PriceSheetResultInner> getByBillingPeriodAsync(String billingPeriodName, String expand, String skiptoken, Integer top, final ServiceCallback<PriceSheetResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByBillingPeriodWithServiceResponseAsync(billingPeriodName, expand, skiptoken, top), serviceCallback);
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResultInner object
     */
    public Observable<PriceSheetResultInner> getByBillingPeriodAsync(String billingPeriodName, String expand, String skiptoken, Integer top) {
        return getByBillingPeriodWithServiceResponseAsync(billingPeriodName, expand, skiptoken, top).map(new Func1<ServiceResponse<PriceSheetResultInner>, PriceSheetResultInner>() {
            @Override
            public PriceSheetResultInner call(ServiceResponse<PriceSheetResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResultInner object
     */
    public Observable<ServiceResponse<PriceSheetResultInner>> getByBillingPeriodWithServiceResponseAsync(String billingPeriodName, String expand, String skiptoken, Integer top) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (billingPeriodName == null) {
            throw new IllegalArgumentException("Parameter billingPeriodName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getByBillingPeriod(this.client.subscriptionId(), billingPeriodName, expand, skiptoken, top, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PriceSheetResultInner>>>() {
                @Override
                public Observable<ServiceResponse<PriceSheetResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PriceSheetResultInner> clientResponse = getByBillingPeriodDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PriceSheetResultInner> getByBillingPeriodDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PriceSheetResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PriceSheetResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
