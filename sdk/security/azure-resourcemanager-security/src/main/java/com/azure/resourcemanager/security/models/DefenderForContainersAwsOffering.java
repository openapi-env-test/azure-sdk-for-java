// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The Defender for Containers AWS offering. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "offeringType")
@JsonTypeName("DefenderForContainersAws")
@Fluent
public final class DefenderForContainersAwsOffering extends CloudOffering {
    /*
     * The kubernetes service connection configuration
     */
    @JsonProperty(value = "kubernetesService")
    private DefenderForContainersAwsOfferingKubernetesService kubernetesService;

    /*
     * The kubernetes to scuba connection configuration
     */
    @JsonProperty(value = "kubernetesScubaReader")
    private DefenderForContainersAwsOfferingKubernetesScubaReader kubernetesScubaReader;

    /*
     * The cloudwatch to kinesis connection configuration
     */
    @JsonProperty(value = "cloudWatchToKinesis")
    private DefenderForContainersAwsOfferingCloudWatchToKinesis cloudWatchToKinesis;

    /*
     * The kinesis to s3 connection configuration
     */
    @JsonProperty(value = "kinesisToS3")
    private DefenderForContainersAwsOfferingKinesisToS3 kinesisToS3;

    /*
     * The container vulnerability assessment configuration
     */
    @JsonProperty(value = "containerVulnerabilityAssessment")
    private DefenderForContainersAwsOfferingContainerVulnerabilityAssessment containerVulnerabilityAssessment;

    /*
     * The container vulnerability assessment task configuration
     */
    @JsonProperty(value = "containerVulnerabilityAssessmentTask")
    private DefenderForContainersAwsOfferingContainerVulnerabilityAssessmentTask containerVulnerabilityAssessmentTask;

    /*
     * Enable container vulnerability assessment feature
     */
    @JsonProperty(value = "enableContainerVulnerabilityAssessment")
    private Boolean enableContainerVulnerabilityAssessment;

    /*
     * Is audit logs pipeline auto provisioning enabled
     */
    @JsonProperty(value = "autoProvisioning")
    private Boolean autoProvisioning;

    /*
     * The retention time in days of kube audit logs set on the CloudWatch log
     * group
     */
    @JsonProperty(value = "kubeAuditRetentionTime")
    private Long kubeAuditRetentionTime;

    /*
     * The externalId used by the data reader to prevent the confused deputy
     * attack
     */
    @JsonProperty(value = "scubaExternalId")
    private String scubaExternalId;

    /**
     * Get the kubernetesService property: The kubernetes service connection configuration.
     *
     * @return the kubernetesService value.
     */
    public DefenderForContainersAwsOfferingKubernetesService kubernetesService() {
        return this.kubernetesService;
    }

    /**
     * Set the kubernetesService property: The kubernetes service connection configuration.
     *
     * @param kubernetesService the kubernetesService value to set.
     * @return the DefenderForContainersAwsOffering object itself.
     */
    public DefenderForContainersAwsOffering withKubernetesService(
        DefenderForContainersAwsOfferingKubernetesService kubernetesService) {
        this.kubernetesService = kubernetesService;
        return this;
    }

    /**
     * Get the kubernetesScubaReader property: The kubernetes to scuba connection configuration.
     *
     * @return the kubernetesScubaReader value.
     */
    public DefenderForContainersAwsOfferingKubernetesScubaReader kubernetesScubaReader() {
        return this.kubernetesScubaReader;
    }

    /**
     * Set the kubernetesScubaReader property: The kubernetes to scuba connection configuration.
     *
     * @param kubernetesScubaReader the kubernetesScubaReader value to set.
     * @return the DefenderForContainersAwsOffering object itself.
     */
    public DefenderForContainersAwsOffering withKubernetesScubaReader(
        DefenderForContainersAwsOfferingKubernetesScubaReader kubernetesScubaReader) {
        this.kubernetesScubaReader = kubernetesScubaReader;
        return this;
    }

    /**
     * Get the cloudWatchToKinesis property: The cloudwatch to kinesis connection configuration.
     *
     * @return the cloudWatchToKinesis value.
     */
    public DefenderForContainersAwsOfferingCloudWatchToKinesis cloudWatchToKinesis() {
        return this.cloudWatchToKinesis;
    }

    /**
     * Set the cloudWatchToKinesis property: The cloudwatch to kinesis connection configuration.
     *
     * @param cloudWatchToKinesis the cloudWatchToKinesis value to set.
     * @return the DefenderForContainersAwsOffering object itself.
     */
    public DefenderForContainersAwsOffering withCloudWatchToKinesis(
        DefenderForContainersAwsOfferingCloudWatchToKinesis cloudWatchToKinesis) {
        this.cloudWatchToKinesis = cloudWatchToKinesis;
        return this;
    }

    /**
     * Get the kinesisToS3 property: The kinesis to s3 connection configuration.
     *
     * @return the kinesisToS3 value.
     */
    public DefenderForContainersAwsOfferingKinesisToS3 kinesisToS3() {
        return this.kinesisToS3;
    }

    /**
     * Set the kinesisToS3 property: The kinesis to s3 connection configuration.
     *
     * @param kinesisToS3 the kinesisToS3 value to set.
     * @return the DefenderForContainersAwsOffering object itself.
     */
    public DefenderForContainersAwsOffering withKinesisToS3(DefenderForContainersAwsOfferingKinesisToS3 kinesisToS3) {
        this.kinesisToS3 = kinesisToS3;
        return this;
    }

    /**
     * Get the containerVulnerabilityAssessment property: The container vulnerability assessment configuration.
     *
     * @return the containerVulnerabilityAssessment value.
     */
    public DefenderForContainersAwsOfferingContainerVulnerabilityAssessment containerVulnerabilityAssessment() {
        return this.containerVulnerabilityAssessment;
    }

    /**
     * Set the containerVulnerabilityAssessment property: The container vulnerability assessment configuration.
     *
     * @param containerVulnerabilityAssessment the containerVulnerabilityAssessment value to set.
     * @return the DefenderForContainersAwsOffering object itself.
     */
    public DefenderForContainersAwsOffering withContainerVulnerabilityAssessment(
        DefenderForContainersAwsOfferingContainerVulnerabilityAssessment containerVulnerabilityAssessment) {
        this.containerVulnerabilityAssessment = containerVulnerabilityAssessment;
        return this;
    }

    /**
     * Get the containerVulnerabilityAssessmentTask property: The container vulnerability assessment task configuration.
     *
     * @return the containerVulnerabilityAssessmentTask value.
     */
    public DefenderForContainersAwsOfferingContainerVulnerabilityAssessmentTask containerVulnerabilityAssessmentTask() {
        return this.containerVulnerabilityAssessmentTask;
    }

    /**
     * Set the containerVulnerabilityAssessmentTask property: The container vulnerability assessment task configuration.
     *
     * @param containerVulnerabilityAssessmentTask the containerVulnerabilityAssessmentTask value to set.
     * @return the DefenderForContainersAwsOffering object itself.
     */
    public DefenderForContainersAwsOffering withContainerVulnerabilityAssessmentTask(
        DefenderForContainersAwsOfferingContainerVulnerabilityAssessmentTask containerVulnerabilityAssessmentTask) {
        this.containerVulnerabilityAssessmentTask = containerVulnerabilityAssessmentTask;
        return this;
    }

    /**
     * Get the enableContainerVulnerabilityAssessment property: Enable container vulnerability assessment feature.
     *
     * @return the enableContainerVulnerabilityAssessment value.
     */
    public Boolean enableContainerVulnerabilityAssessment() {
        return this.enableContainerVulnerabilityAssessment;
    }

    /**
     * Set the enableContainerVulnerabilityAssessment property: Enable container vulnerability assessment feature.
     *
     * @param enableContainerVulnerabilityAssessment the enableContainerVulnerabilityAssessment value to set.
     * @return the DefenderForContainersAwsOffering object itself.
     */
    public DefenderForContainersAwsOffering withEnableContainerVulnerabilityAssessment(
        Boolean enableContainerVulnerabilityAssessment) {
        this.enableContainerVulnerabilityAssessment = enableContainerVulnerabilityAssessment;
        return this;
    }

    /**
     * Get the autoProvisioning property: Is audit logs pipeline auto provisioning enabled.
     *
     * @return the autoProvisioning value.
     */
    public Boolean autoProvisioning() {
        return this.autoProvisioning;
    }

    /**
     * Set the autoProvisioning property: Is audit logs pipeline auto provisioning enabled.
     *
     * @param autoProvisioning the autoProvisioning value to set.
     * @return the DefenderForContainersAwsOffering object itself.
     */
    public DefenderForContainersAwsOffering withAutoProvisioning(Boolean autoProvisioning) {
        this.autoProvisioning = autoProvisioning;
        return this;
    }

    /**
     * Get the kubeAuditRetentionTime property: The retention time in days of kube audit logs set on the CloudWatch log
     * group.
     *
     * @return the kubeAuditRetentionTime value.
     */
    public Long kubeAuditRetentionTime() {
        return this.kubeAuditRetentionTime;
    }

    /**
     * Set the kubeAuditRetentionTime property: The retention time in days of kube audit logs set on the CloudWatch log
     * group.
     *
     * @param kubeAuditRetentionTime the kubeAuditRetentionTime value to set.
     * @return the DefenderForContainersAwsOffering object itself.
     */
    public DefenderForContainersAwsOffering withKubeAuditRetentionTime(Long kubeAuditRetentionTime) {
        this.kubeAuditRetentionTime = kubeAuditRetentionTime;
        return this;
    }

    /**
     * Get the scubaExternalId property: The externalId used by the data reader to prevent the confused deputy attack.
     *
     * @return the scubaExternalId value.
     */
    public String scubaExternalId() {
        return this.scubaExternalId;
    }

    /**
     * Set the scubaExternalId property: The externalId used by the data reader to prevent the confused deputy attack.
     *
     * @param scubaExternalId the scubaExternalId value to set.
     * @return the DefenderForContainersAwsOffering object itself.
     */
    public DefenderForContainersAwsOffering withScubaExternalId(String scubaExternalId) {
        this.scubaExternalId = scubaExternalId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (kubernetesService() != null) {
            kubernetesService().validate();
        }
        if (kubernetesScubaReader() != null) {
            kubernetesScubaReader().validate();
        }
        if (cloudWatchToKinesis() != null) {
            cloudWatchToKinesis().validate();
        }
        if (kinesisToS3() != null) {
            kinesisToS3().validate();
        }
        if (containerVulnerabilityAssessment() != null) {
            containerVulnerabilityAssessment().validate();
        }
        if (containerVulnerabilityAssessmentTask() != null) {
            containerVulnerabilityAssessmentTask().validate();
        }
    }
}
