// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterPoolUpgradeProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of available upgrades for compute pools. */
@Fluent
public final class ProvisionedClusterUpgradeProfileInner extends ProxyResource {
    /*
     * The properties of the upgrade profile.
     */
    @JsonProperty(value = "properties", required = true)
    private ProvisionedClusterUpgradeProfileProperties innerProperties =
        new ProvisionedClusterUpgradeProfileProperties();

    /** Creates an instance of ProvisionedClusterUpgradeProfileInner class. */
    public ProvisionedClusterUpgradeProfileInner() {
    }

    /**
     * Get the innerProperties property: The properties of the upgrade profile.
     *
     * @return the innerProperties value.
     */
    private ProvisionedClusterUpgradeProfileProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the controlPlaneProfile property: The list of available upgrade versions for the control plane.
     *
     * @return the controlPlaneProfile value.
     */
    public ProvisionedClusterPoolUpgradeProfile controlPlaneProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().controlPlaneProfile();
    }

    /**
     * Set the controlPlaneProfile property: The list of available upgrade versions for the control plane.
     *
     * @param controlPlaneProfile the controlPlaneProfile value to set.
     * @return the ProvisionedClusterUpgradeProfileInner object itself.
     */
    public ProvisionedClusterUpgradeProfileInner withControlPlaneProfile(
        ProvisionedClusterPoolUpgradeProfile controlPlaneProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProvisionedClusterUpgradeProfileProperties();
        }
        this.innerProperties().withControlPlaneProfile(controlPlaneProfile);
        return this;
    }

    /**
     * Get the agentPoolProfiles property: The list of available upgrade versions for agent pools.
     *
     * @return the agentPoolProfiles value.
     */
    public List<ProvisionedClusterPoolUpgradeProfile> agentPoolProfiles() {
        return this.innerProperties() == null ? null : this.innerProperties().agentPoolProfiles();
    }

    /**
     * Set the agentPoolProfiles property: The list of available upgrade versions for agent pools.
     *
     * @param agentPoolProfiles the agentPoolProfiles value to set.
     * @return the ProvisionedClusterUpgradeProfileInner object itself.
     */
    public ProvisionedClusterUpgradeProfileInner withAgentPoolProfiles(
        List<ProvisionedClusterPoolUpgradeProfile> agentPoolProfiles) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProvisionedClusterUpgradeProfileProperties();
        }
        this.innerProperties().withAgentPoolProfiles(agentPoolProfiles);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model ProvisionedClusterUpgradeProfileInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ProvisionedClusterUpgradeProfileInner.class);
}
