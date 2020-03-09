/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationEvents;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.Event;

class ReplicationEventsImpl extends WrapperImpl<ReplicationEventsInner> implements ReplicationEvents {
    private final RecoveryServicesManager manager;

    ReplicationEventsImpl(RecoveryServicesManager manager) {
        super(manager.inner().replicationEvents());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private EventImpl wrapModel(EventInner inner) {
        return  new EventImpl(inner, manager());
    }

    @Override
    public Observable<Event> listAsync() {
        ReplicationEventsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<EventInner>, Iterable<EventInner>>() {
            @Override
            public Iterable<EventInner> call(Page<EventInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EventInner, Event>() {
            @Override
            public Event call(EventInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Event> getAsync(String eventName) {
        ReplicationEventsInner client = this.inner();
        return client.getAsync(eventName)
        .flatMap(new Func1<EventInner, Observable<Event>>() {
            @Override
            public Observable<Event> call(EventInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Event)wrapModel(inner));
                }
            }
       });
    }

}
