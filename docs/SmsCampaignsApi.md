# SmsCampaignsApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSmsCampaign**](SmsCampaignsApi.md#createSmsCampaign) | **POST** /smsCampaigns | Creates an SMS campaign
[**deleteSmsCampaign**](SmsCampaignsApi.md#deleteSmsCampaign) | **DELETE** /smsCampaigns/{campaignId} | Delete the SMS campaign
[**getSmsCampaign**](SmsCampaignsApi.md#getSmsCampaign) | **GET** /smsCampaigns/{campaignId} | Get an SMS campaign
[**getSmsCampaigns**](SmsCampaignsApi.md#getSmsCampaigns) | **GET** /smsCampaigns | Returns the informations for all your created SMS campaigns
[**requestSmsRecipientExport**](SmsCampaignsApi.md#requestSmsRecipientExport) | **POST** /smsCampaigns/{campaignId}/exportRecipients | Exports the recipients of the specified campaign.
[**sendSmsCampaignNow**](SmsCampaignsApi.md#sendSmsCampaignNow) | **POST** /smsCampaigns/{campaignId}/sendNow | Send your SMS campaign immediately
[**sendSmsReport**](SmsCampaignsApi.md#sendSmsReport) | **POST** /smsCampaigns/{campaignId}/sendReport | Send report of SMS campaigns
[**sendTestSms**](SmsCampaignsApi.md#sendTestSms) | **POST** /smsCampaigns/{campaignId}/sendTest | Send an SMS
[**updateSmsCampaign**](SmsCampaignsApi.md#updateSmsCampaign) | **PUT** /smsCampaigns/{campaignId} | Updates an SMS campaign
[**updateSmsCampaignStatus**](SmsCampaignsApi.md#updateSmsCampaignStatus) | **PUT** /smsCampaigns/{campaignId}/status | Update the campaign status


<a name="createSmsCampaign"></a>
# **createSmsCampaign**
> CreateModel createSmsCampaign(createSmsCampaign)

Creates an SMS campaign

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmsCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmsCampaignsApi apiInstance = new SmsCampaignsApi();
CreateSmsCampaign createSmsCampaign = new CreateSmsCampaign(); // CreateSmsCampaign | Values to create an SMS Campaign
try {
    CreateModel result = apiInstance.createSmsCampaign(createSmsCampaign);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#createSmsCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSmsCampaign** | [**CreateSmsCampaign**](CreateSmsCampaign.md)| Values to create an SMS Campaign |

### Return type

[**CreateModel**](CreateModel.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSmsCampaign"></a>
# **deleteSmsCampaign**
> deleteSmsCampaign(campaignId)

Delete the SMS campaign

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmsCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmsCampaignsApi apiInstance = new SmsCampaignsApi();
Long campaignId = 789L; // Long | id of the SMS campaign
try {
    apiInstance.deleteSmsCampaign(campaignId);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#deleteSmsCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| id of the SMS campaign |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSmsCampaign"></a>
# **getSmsCampaign**
> GetSmsCampaign getSmsCampaign(campaignId, getSmsCampaign)

Get an SMS campaign

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmsCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmsCampaignsApi apiInstance = new SmsCampaignsApi();
Long campaignId = 789L; // Long | id of the SMS campaign
GetSmsCampaign getSmsCampaign = new GetSmsCampaign(); // GetSmsCampaign | Values to update an SMS Campaign
try {
    GetSmsCampaign result = apiInstance.getSmsCampaign(campaignId, getSmsCampaign);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#getSmsCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| id of the SMS campaign |
 **getSmsCampaign** | [**GetSmsCampaign**](GetSmsCampaign.md)| Values to update an SMS Campaign |

### Return type

[**GetSmsCampaign**](GetSmsCampaign.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSmsCampaigns"></a>
# **getSmsCampaigns**
> GetSmsCampaigns getSmsCampaigns(status, limit, offset)

Returns the informations for all your created SMS campaigns

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmsCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmsCampaignsApi apiInstance = new SmsCampaignsApi();
String status = "status_example"; // String | Status of campaign.
Long limit = 500L; // Long | Number limitation for the result returned
Long offset = 0L; // Long | Beginning point in the list to retrieve from.
try {
    GetSmsCampaigns result = apiInstance.getSmsCampaigns(status, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#getSmsCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**| Status of campaign. | [optional] [enum: suspended, archived, sent, queued, draft, inProcess]
 **limit** | **Long**| Number limitation for the result returned | [optional] [default to 500]
 **offset** | **Long**| Beginning point in the list to retrieve from. | [optional] [default to 0]

### Return type

[**GetSmsCampaigns**](GetSmsCampaigns.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="requestSmsRecipientExport"></a>
# **requestSmsRecipientExport**
> CreatedProcessId requestSmsRecipientExport(campaignId, recipientExport)

Exports the recipients of the specified campaign.

It returns the background process ID which on completion calls the notify URL that you have set in the input.

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmsCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmsCampaignsApi apiInstance = new SmsCampaignsApi();
Long campaignId = 789L; // Long | id of the campaign
RequestSmsRecipientExport recipientExport = new RequestSmsRecipientExport(); // RequestSmsRecipientExport | Values to send for a recipient export request
try {
    CreatedProcessId result = apiInstance.requestSmsRecipientExport(campaignId, recipientExport);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#requestSmsRecipientExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| id of the campaign |
 **recipientExport** | [**RequestSmsRecipientExport**](RequestSmsRecipientExport.md)| Values to send for a recipient export request | [optional]

### Return type

[**CreatedProcessId**](CreatedProcessId.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendSmsCampaignNow"></a>
# **sendSmsCampaignNow**
> sendSmsCampaignNow(campaignId)

Send your SMS campaign immediately

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmsCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmsCampaignsApi apiInstance = new SmsCampaignsApi();
Long campaignId = 789L; // Long | id of the campaign
try {
    apiInstance.sendSmsCampaignNow(campaignId);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#sendSmsCampaignNow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| id of the campaign |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendSmsReport"></a>
# **sendSmsReport**
> sendSmsReport(campaignId, sendReport)

Send report of SMS campaigns

Send report of Sent and Archived campaign, to the specified email addresses, with respective data and a pdf attachment in detail.

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmsCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmsCampaignsApi apiInstance = new SmsCampaignsApi();
Long campaignId = 789L; // Long | id of the campaign
SendReport sendReport = new SendReport(); // SendReport | Values for send a report
try {
    apiInstance.sendSmsReport(campaignId, sendReport);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#sendSmsReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| id of the campaign |
 **sendReport** | [**SendReport**](SendReport.md)| Values for send a report |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendTestSms"></a>
# **sendTestSms**
> sendTestSms(campaignId, sendTestSms)

Send an SMS

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmsCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmsCampaignsApi apiInstance = new SmsCampaignsApi();
Long campaignId = 789L; // Long | Id of the SMS campaign
SendTestSms sendTestSms = new SendTestSms(); // SendTestSms | Mobile number to which send the test
try {
    apiInstance.sendTestSms(campaignId, sendTestSms);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#sendTestSms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| Id of the SMS campaign |
 **sendTestSms** | [**SendTestSms**](SendTestSms.md)| Mobile number to which send the test |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSmsCampaign"></a>
# **updateSmsCampaign**
> updateSmsCampaign(campaignId, updateSmsCampaign)

Updates an SMS campaign

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmsCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmsCampaignsApi apiInstance = new SmsCampaignsApi();
Long campaignId = 789L; // Long | id of the SMS campaign
UpdateSmsCampaign updateSmsCampaign = new UpdateSmsCampaign(); // UpdateSmsCampaign | Values to update an SMS Campaign
try {
    apiInstance.updateSmsCampaign(campaignId, updateSmsCampaign);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#updateSmsCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| id of the SMS campaign |
 **updateSmsCampaign** | [**UpdateSmsCampaign**](UpdateSmsCampaign.md)| Values to update an SMS Campaign |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSmsCampaignStatus"></a>
# **updateSmsCampaignStatus**
> updateSmsCampaignStatus(campaignId, status)

Update the campaign status

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmsCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmsCampaignsApi apiInstance = new SmsCampaignsApi();
Long campaignId = 789L; // Long | id of the campaign
UpdateCampaignStatus status = new UpdateCampaignStatus(); // UpdateCampaignStatus | Status of the campaign.
try {
    apiInstance.updateSmsCampaignStatus(campaignId, status);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#updateSmsCampaignStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| id of the campaign |
 **status** | [**UpdateCampaignStatus**](UpdateCampaignStatus.md)| Status of the campaign. |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

