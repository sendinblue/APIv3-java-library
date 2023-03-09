# WhatsappCampaignsApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteWhatsappCampaign**](WhatsappCampaignsApi.md#deleteWhatsappCampaign) | **DELETE** /whatsappCampaigns/{campaignId} | Delete a whatsapp campaign
[**getWhatsappCampaign**](WhatsappCampaignsApi.md#getWhatsappCampaign) | **GET** /whatsappCampaigns/{campaignId} | Get Whatsapp campaign Overview


<a name="deleteWhatsappCampaign"></a>
# **deleteWhatsappCampaign**
> deleteWhatsappCampaign(campaignId)

Delete a whatsapp campaign

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.WhatsappCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

WhatsappCampaignsApi apiInstance = new WhatsappCampaignsApi();
Object campaignId = null; // Object | id of the campaign
try {
    apiInstance.deleteWhatsappCampaign(campaignId);
} catch (ApiException e) {
    System.err.println("Exception when calling WhatsappCampaignsApi#deleteWhatsappCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | [**Object**](.md)| id of the campaign |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWhatsappCampaign"></a>
# **getWhatsappCampaign**
> GetWhatsappCampaignOverview getWhatsappCampaign(campaignId)

Get Whatsapp campaign Overview

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.WhatsappCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: partner-key
ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
partnerKey.setApiKey("YOUR PARTNER KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//partnerKey.setApiKeyPrefix("Token");

WhatsappCampaignsApi apiInstance = new WhatsappCampaignsApi();
Object campaignId = null; // Object | Id of the campaign
try {
    GetWhatsappCampaignOverview result = apiInstance.getWhatsappCampaign(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhatsappCampaignsApi#getWhatsappCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | [**Object**](.md)| Id of the campaign |

### Return type

[**GetWhatsappCampaignOverview**](GetWhatsappCampaignOverview.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

