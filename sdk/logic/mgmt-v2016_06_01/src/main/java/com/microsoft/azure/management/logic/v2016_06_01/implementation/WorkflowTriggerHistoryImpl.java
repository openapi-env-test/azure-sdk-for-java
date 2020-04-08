/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggerHistory;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.logic.v2016_06_01.Correlation;
import org.joda.time.DateTime;
import com.microsoft.azure.management.logic.v2016_06_01.ContentLink;
import com.microsoft.azure.management.logic.v2016_06_01.ResourceReference;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowStatus;

class WorkflowTriggerHistoryImpl extends IndexableRefreshableWrapperImpl<WorkflowTriggerHistory, WorkflowTriggerHistoryInner> implements WorkflowTriggerHistory {
    private final LogicManager manager;
    private String resourceGroupName;
    private String workflowName;
    private String triggerName;
    private String historyName;

    WorkflowTriggerHistoryImpl(WorkflowTriggerHistoryInner inner,  LogicManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workflowName = IdParsingUtils.getValueFromIdByName(inner.id(), "workflows");
        this.triggerName = IdParsingUtils.getValueFromIdByName(inner.id(), "triggers");
        this.historyName = IdParsingUtils.getValueFromIdByName(inner.id(), "histories");
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<WorkflowTriggerHistoryInner> getInnerAsync() {
        WorkflowTriggerHistoriesInner client = this.manager().inner().workflowTriggerHistories();
        return client.getAsync(this.resourceGroupName, this.workflowName, this.triggerName, this.historyName);
    }



    @Override
    public String code() {
        return this.inner().code();
    }

    @Override
    public Correlation correlation() {
        return this.inner().correlation();
    }

    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public Object error() {
        return this.inner().error();
    }

    @Override
    public Boolean fired() {
        return this.inner().fired();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public ContentLink inputsLink() {
        return this.inner().inputsLink();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ContentLink outputsLink() {
        return this.inner().outputsLink();
    }

    @Override
    public ResourceReference run() {
        return this.inner().run();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public WorkflowStatus status() {
        return this.inner().status();
    }

    @Override
    public String trackingId() {
        return this.inner().trackingId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
