// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Update power cycle input properties. */
@Fluent
public final class UpdatePowerCycleProperties {
    /*
     * Primary or Secondary power end.
     */
    @JsonProperty(value = "powerEnd", required = true)
    private PowerEnd powerEnd;

    /*
     * On or Off toggle state.
     */
    @JsonProperty(value = "state", required = true)
    private State state;

    /** Creates an instance of UpdatePowerCycleProperties class. */
    public UpdatePowerCycleProperties() {
    }

    /**
     * Get the powerEnd property: Primary or Secondary power end.
     *
     * @return the powerEnd value.
     */
    public PowerEnd powerEnd() {
        return this.powerEnd;
    }

    /**
     * Set the powerEnd property: Primary or Secondary power end.
     *
     * @param powerEnd the powerEnd value to set.
     * @return the UpdatePowerCycleProperties object itself.
     */
    public UpdatePowerCycleProperties withPowerEnd(PowerEnd powerEnd) {
        this.powerEnd = powerEnd;
        return this;
    }

    /**
     * Get the state property: On or Off toggle state.
     *
     * @return the state value.
     */
    public State state() {
        return this.state;
    }

    /**
     * Set the state property: On or Off toggle state.
     *
     * @param state the state value to set.
     * @return the UpdatePowerCycleProperties object itself.
     */
    public UpdatePowerCycleProperties withState(State state) {
        this.state = state;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (powerEnd() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property powerEnd in model UpdatePowerCycleProperties"));
        }
        if (state() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property state in model UpdatePowerCycleProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UpdatePowerCycleProperties.class);
}
