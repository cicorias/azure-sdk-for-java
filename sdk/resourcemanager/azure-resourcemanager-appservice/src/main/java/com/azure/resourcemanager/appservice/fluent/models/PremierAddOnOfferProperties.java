// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.AppServicePlanRestrictions;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PremierAddOnOffer resource specific properties. */
@Fluent
public final class PremierAddOnOfferProperties {
    /*
     * Premier add on SKU.
     */
    @JsonProperty(value = "sku")
    private String sku;

    /*
     * Premier add on offer Product.
     */
    @JsonProperty(value = "product")
    private String product;

    /*
     * Premier add on offer Vendor.
     */
    @JsonProperty(value = "vendor")
    private String vendor;

    /*
     * <code>true</code> if promotion code is required; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "promoCodeRequired")
    private Boolean promoCodeRequired;

    /*
     * Premier add on offer Quota.
     */
    @JsonProperty(value = "quota")
    private Integer quota;

    /*
     * App Service plans this offer is restricted to.
     */
    @JsonProperty(value = "webHostingPlanRestrictions")
    private AppServicePlanRestrictions webHostingPlanRestrictions;

    /*
     * Privacy policy URL.
     */
    @JsonProperty(value = "privacyPolicyUrl")
    private String privacyPolicyUrl;

    /*
     * Legal terms URL.
     */
    @JsonProperty(value = "legalTermsUrl")
    private String legalTermsUrl;

    /*
     * Marketplace publisher.
     */
    @JsonProperty(value = "marketplacePublisher")
    private String marketplacePublisher;

    /*
     * Marketplace offer.
     */
    @JsonProperty(value = "marketplaceOffer")
    private String marketplaceOffer;

    /** Creates an instance of PremierAddOnOfferProperties class. */
    public PremierAddOnOfferProperties() {
    }

    /**
     * Get the sku property: Premier add on SKU.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Premier add on SKU.
     *
     * @param sku the sku value to set.
     * @return the PremierAddOnOfferProperties object itself.
     */
    public PremierAddOnOfferProperties withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the product property: Premier add on offer Product.
     *
     * @return the product value.
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the product property: Premier add on offer Product.
     *
     * @param product the product value to set.
     * @return the PremierAddOnOfferProperties object itself.
     */
    public PremierAddOnOfferProperties withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get the vendor property: Premier add on offer Vendor.
     *
     * @return the vendor value.
     */
    public String vendor() {
        return this.vendor;
    }

    /**
     * Set the vendor property: Premier add on offer Vendor.
     *
     * @param vendor the vendor value to set.
     * @return the PremierAddOnOfferProperties object itself.
     */
    public PremierAddOnOfferProperties withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Get the promoCodeRequired property: &lt;code&gt;true&lt;/code&gt; if promotion code is required; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the promoCodeRequired value.
     */
    public Boolean promoCodeRequired() {
        return this.promoCodeRequired;
    }

    /**
     * Set the promoCodeRequired property: &lt;code&gt;true&lt;/code&gt; if promotion code is required; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @param promoCodeRequired the promoCodeRequired value to set.
     * @return the PremierAddOnOfferProperties object itself.
     */
    public PremierAddOnOfferProperties withPromoCodeRequired(Boolean promoCodeRequired) {
        this.promoCodeRequired = promoCodeRequired;
        return this;
    }

    /**
     * Get the quota property: Premier add on offer Quota.
     *
     * @return the quota value.
     */
    public Integer quota() {
        return this.quota;
    }

    /**
     * Set the quota property: Premier add on offer Quota.
     *
     * @param quota the quota value to set.
     * @return the PremierAddOnOfferProperties object itself.
     */
    public PremierAddOnOfferProperties withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * Get the webHostingPlanRestrictions property: App Service plans this offer is restricted to.
     *
     * @return the webHostingPlanRestrictions value.
     */
    public AppServicePlanRestrictions webHostingPlanRestrictions() {
        return this.webHostingPlanRestrictions;
    }

    /**
     * Set the webHostingPlanRestrictions property: App Service plans this offer is restricted to.
     *
     * @param webHostingPlanRestrictions the webHostingPlanRestrictions value to set.
     * @return the PremierAddOnOfferProperties object itself.
     */
    public PremierAddOnOfferProperties withWebHostingPlanRestrictions(
        AppServicePlanRestrictions webHostingPlanRestrictions) {
        this.webHostingPlanRestrictions = webHostingPlanRestrictions;
        return this;
    }

    /**
     * Get the privacyPolicyUrl property: Privacy policy URL.
     *
     * @return the privacyPolicyUrl value.
     */
    public String privacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    /**
     * Set the privacyPolicyUrl property: Privacy policy URL.
     *
     * @param privacyPolicyUrl the privacyPolicyUrl value to set.
     * @return the PremierAddOnOfferProperties object itself.
     */
    public PremierAddOnOfferProperties withPrivacyPolicyUrl(String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
        return this;
    }

    /**
     * Get the legalTermsUrl property: Legal terms URL.
     *
     * @return the legalTermsUrl value.
     */
    public String legalTermsUrl() {
        return this.legalTermsUrl;
    }

    /**
     * Set the legalTermsUrl property: Legal terms URL.
     *
     * @param legalTermsUrl the legalTermsUrl value to set.
     * @return the PremierAddOnOfferProperties object itself.
     */
    public PremierAddOnOfferProperties withLegalTermsUrl(String legalTermsUrl) {
        this.legalTermsUrl = legalTermsUrl;
        return this;
    }

    /**
     * Get the marketplacePublisher property: Marketplace publisher.
     *
     * @return the marketplacePublisher value.
     */
    public String marketplacePublisher() {
        return this.marketplacePublisher;
    }

    /**
     * Set the marketplacePublisher property: Marketplace publisher.
     *
     * @param marketplacePublisher the marketplacePublisher value to set.
     * @return the PremierAddOnOfferProperties object itself.
     */
    public PremierAddOnOfferProperties withMarketplacePublisher(String marketplacePublisher) {
        this.marketplacePublisher = marketplacePublisher;
        return this;
    }

    /**
     * Get the marketplaceOffer property: Marketplace offer.
     *
     * @return the marketplaceOffer value.
     */
    public String marketplaceOffer() {
        return this.marketplaceOffer;
    }

    /**
     * Set the marketplaceOffer property: Marketplace offer.
     *
     * @param marketplaceOffer the marketplaceOffer value to set.
     * @return the PremierAddOnOfferProperties object itself.
     */
    public PremierAddOnOfferProperties withMarketplaceOffer(String marketplaceOffer) {
        this.marketplaceOffer = marketplaceOffer;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
