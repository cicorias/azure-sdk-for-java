// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Schema of the Data property of an EventGridEvent for a Microsoft.EventGrid.SubscriptionDeletedEvent event. */
@Immutable
public final class SubscriptionDeletedEventData {
    /*
     * The Azure resource ID of the deleted event subscription.
     */
    @JsonProperty(value = "eventSubscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String eventSubscriptionId;

    /** Creates an instance of SubscriptionDeletedEventData class. */
    public SubscriptionDeletedEventData() {}

    /**
     * Get the eventSubscriptionId property: The Azure resource ID of the deleted event subscription.
     *
     * @return the eventSubscriptionId value.
     */
    public String getEventSubscriptionId() {
        return this.eventSubscriptionId;
    }
}
