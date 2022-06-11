// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The KerberosCredentials model. */
@Fluent
public class KerberosCredentials {
    /*
     * [Required] IP Address or DNS HostName.
     */
    @JsonProperty(value = "kerberosKdcAddress", required = true)
    private String kerberosKdcAddress;

    /*
     * [Required] Kerberos Username
     */
    @JsonProperty(value = "kerberosPrincipal", required = true)
    private String kerberosPrincipal;

    /*
     * [Required] Domain over which a Kerberos authentication server has the
     * authority to authenticate a user, host or service.
     */
    @JsonProperty(value = "kerberosRealm", required = true)
    private String kerberosRealm;

    /**
     * Get the kerberosKdcAddress property: [Required] IP Address or DNS HostName.
     *
     * @return the kerberosKdcAddress value.
     */
    public String kerberosKdcAddress() {
        return this.kerberosKdcAddress;
    }

    /**
     * Set the kerberosKdcAddress property: [Required] IP Address or DNS HostName.
     *
     * @param kerberosKdcAddress the kerberosKdcAddress value to set.
     * @return the KerberosCredentials object itself.
     */
    public KerberosCredentials withKerberosKdcAddress(String kerberosKdcAddress) {
        this.kerberosKdcAddress = kerberosKdcAddress;
        return this;
    }

    /**
     * Get the kerberosPrincipal property: [Required] Kerberos Username.
     *
     * @return the kerberosPrincipal value.
     */
    public String kerberosPrincipal() {
        return this.kerberosPrincipal;
    }

    /**
     * Set the kerberosPrincipal property: [Required] Kerberos Username.
     *
     * @param kerberosPrincipal the kerberosPrincipal value to set.
     * @return the KerberosCredentials object itself.
     */
    public KerberosCredentials withKerberosPrincipal(String kerberosPrincipal) {
        this.kerberosPrincipal = kerberosPrincipal;
        return this;
    }

    /**
     * Get the kerberosRealm property: [Required] Domain over which a Kerberos authentication server has the authority
     * to authenticate a user, host or service.
     *
     * @return the kerberosRealm value.
     */
    public String kerberosRealm() {
        return this.kerberosRealm;
    }

    /**
     * Set the kerberosRealm property: [Required] Domain over which a Kerberos authentication server has the authority
     * to authenticate a user, host or service.
     *
     * @param kerberosRealm the kerberosRealm value to set.
     * @return the KerberosCredentials object itself.
     */
    public KerberosCredentials withKerberosRealm(String kerberosRealm) {
        this.kerberosRealm = kerberosRealm;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (kerberosKdcAddress() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property kerberosKdcAddress in model KerberosCredentials"));
        }
        if (kerberosPrincipal() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property kerberosPrincipal in model KerberosCredentials"));
        }
        if (kerberosRealm() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property kerberosRealm in model KerberosCredentials"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KerberosCredentials.class);
}