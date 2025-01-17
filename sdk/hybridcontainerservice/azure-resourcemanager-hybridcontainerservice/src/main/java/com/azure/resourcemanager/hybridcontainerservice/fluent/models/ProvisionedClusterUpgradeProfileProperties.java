// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterPoolUpgradeProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Control plane and agent pool upgrade profiles. */
@Fluent
public final class ProvisionedClusterUpgradeProfileProperties {
    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The list of available upgrade versions for the control plane.
     */
    @JsonProperty(value = "controlPlaneProfile", required = true)
    private ProvisionedClusterPoolUpgradeProfile controlPlaneProfile;

    /*
     * The list of available upgrade versions for agent pools.
     */
    @JsonProperty(value = "agentPoolProfiles", required = true)
    private List<ProvisionedClusterPoolUpgradeProfile> agentPoolProfiles;

    /** Creates an instance of ProvisionedClusterUpgradeProfileProperties class. */
    public ProvisionedClusterUpgradeProfileProperties() {
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the controlPlaneProfile property: The list of available upgrade versions for the control plane.
     *
     * @return the controlPlaneProfile value.
     */
    public ProvisionedClusterPoolUpgradeProfile controlPlaneProfile() {
        return this.controlPlaneProfile;
    }

    /**
     * Set the controlPlaneProfile property: The list of available upgrade versions for the control plane.
     *
     * @param controlPlaneProfile the controlPlaneProfile value to set.
     * @return the ProvisionedClusterUpgradeProfileProperties object itself.
     */
    public ProvisionedClusterUpgradeProfileProperties withControlPlaneProfile(
        ProvisionedClusterPoolUpgradeProfile controlPlaneProfile) {
        this.controlPlaneProfile = controlPlaneProfile;
        return this;
    }

    /**
     * Get the agentPoolProfiles property: The list of available upgrade versions for agent pools.
     *
     * @return the agentPoolProfiles value.
     */
    public List<ProvisionedClusterPoolUpgradeProfile> agentPoolProfiles() {
        return this.agentPoolProfiles;
    }

    /**
     * Set the agentPoolProfiles property: The list of available upgrade versions for agent pools.
     *
     * @param agentPoolProfiles the agentPoolProfiles value to set.
     * @return the ProvisionedClusterUpgradeProfileProperties object itself.
     */
    public ProvisionedClusterUpgradeProfileProperties withAgentPoolProfiles(
        List<ProvisionedClusterPoolUpgradeProfile> agentPoolProfiles) {
        this.agentPoolProfiles = agentPoolProfiles;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (controlPlaneProfile() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property controlPlaneProfile in model"
                            + " ProvisionedClusterUpgradeProfileProperties"));
        } else {
            controlPlaneProfile().validate();
        }
        if (agentPoolProfiles() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property agentPoolProfiles in model"
                            + " ProvisionedClusterUpgradeProfileProperties"));
        } else {
            agentPoolProfiles().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ProvisionedClusterUpgradeProfileProperties.class);
}
