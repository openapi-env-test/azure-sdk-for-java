/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.billing.v2020_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2020_05_01.EnrollmentAccounts;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.billing.v2020_05_01.EnrollmentAccount;

class EnrollmentAccountsImpl extends WrapperImpl<EnrollmentAccountsInner> implements EnrollmentAccounts {
    private final BillingManager manager;

    EnrollmentAccountsImpl(BillingManager manager) {
        super(manager.inner().enrollmentAccounts());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private EnrollmentAccountImpl wrapModel(EnrollmentAccountInner inner) {
        return  new EnrollmentAccountImpl(inner, manager());
    }

    @Override
    public Observable<EnrollmentAccount> listByBillingAccountNameAsync(final String billingAccountName) {
        EnrollmentAccountsInner client = this.inner();
        return client.listByBillingAccountNameAsync(billingAccountName)
        .flatMapIterable(new Func1<Page<EnrollmentAccountInner>, Iterable<EnrollmentAccountInner>>() {
            @Override
            public Iterable<EnrollmentAccountInner> call(Page<EnrollmentAccountInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EnrollmentAccountInner, EnrollmentAccount>() {
            @Override
            public EnrollmentAccount call(EnrollmentAccountInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<EnrollmentAccount> getAsync(String billingAccountName, String enrollmentAccountName) {
        EnrollmentAccountsInner client = this.inner();
        return client.getAsync(billingAccountName, enrollmentAccountName)
        .flatMap(new Func1<EnrollmentAccountInner, Observable<EnrollmentAccount>>() {
            @Override
            public Observable<EnrollmentAccount> call(EnrollmentAccountInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((EnrollmentAccount)wrapModel(inner));
                }
            }
       });
    }

}
