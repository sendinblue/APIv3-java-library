# EmailCampaignsApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmailCampaign**](EmailCampaignsApi.md#createEmailCampaign) | **POST** /emailCampaigns | Create an email campaign
[**deleteEmailCampaign**](EmailCampaignsApi.md#deleteEmailCampaign) | **DELETE** /emailCampaigns/{campaignId} | Delete an email campaign
[**emailExportRecipients**](EmailCampaignsApi.md#emailExportRecipients) | **POST** /emailCampaigns/{campaignId}/exportRecipients | Export the recipients of a campaign
[**getEmailCampaign**](EmailCampaignsApi.md#getEmailCampaign) | **GET** /emailCampaigns/{campaignId} | Get campaign informations
[**getEmailCampaigns**](EmailCampaignsApi.md#getEmailCampaigns) | **GET** /emailCampaigns | Return all your created campaigns
[**sendEmailCampaignNow**](EmailCampaignsApi.md#sendEmailCampaignNow) | **POST** /emailCampaigns/{campaignId}/sendNow | Send an email campaign id of the campaign immediately
[**sendReport**](EmailCampaignsApi.md#sendReport) | **POST** /emailCampaigns/{campaignId}/sendReport | Send the report of a campaigns
[**sendTestEmail**](EmailCampaignsApi.md#sendTestEmail) | **POST** /emailCampaigns/{campaignId}/sendTest | Send an email campaign to your test list
[**updateCampaignStatus**](EmailCampaignsApi.md#updateCampaignStatus) | **PUT** /emailCampaigns/{campaignId}/status | Update a campaign status
[**updateEmailCampaign**](EmailCampaignsApi.md#updateEmailCampaign) | **PUT** /emailCampaigns/{campaignId} | Update a campaign


<a name="createEmailCampaign"></a>
# **createEmailCampaign**
> CreateModel createEmailCampaign(emailCampaigns)

Create an email campaign

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.EmailCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EmailCampaignsApi apiInstance = new EmailCampaignsApi();
CreateEmailCampaign emailCampaigns = new CreateEmailCampaign(); // CreateEmailCampaign | Values to create a campaign
try {
    CreateModel result = apiInstance.createEmailCampaign(emailCampaigns);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailCampaignsApi#createEmailCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailCampaigns** | [**CreateEmailCampaign**](CreateEmailCampaign.md)| Values to create a campaign |

### Return type

[**CreateModel**](CreateModel.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEmailCampaign"></a>
# **deleteEmailCampaign**
> deleteEmailCampaign(campaignId)

Delete an email campaign

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.EmailCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EmailCampaignsApi apiInstance = new EmailCampaignsApi();
Long campaignId = 789L; // Long | id of the campaign
try {
    apiInstance.deleteEmailCampaign(campaignId);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailCampaignsApi#deleteEmailCampaign");
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

<a name="emailExportRecipients"></a>
# **emailExportRecipients**
> CreatedProcessId emailExportRecipients(campaignId, recipientExport)

Export the recipients of a campaign

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.EmailCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EmailCampaignsApi apiInstance = new EmailCampaignsApi();
Long campaignId = 789L; // Long | Id of the campaign
EmailExportRecipients recipientExport = new EmailExportRecipients(); // EmailExportRecipients | Values to send for a recipient export request
try {
    CreatedProcessId result = apiInstance.emailExportRecipients(campaignId, recipientExport);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailCampaignsApi#emailExportRecipients");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| Id of the campaign |
 **recipientExport** | [**EmailExportRecipients**](EmailExportRecipients.md)| Values to send for a recipient export request | [optional]

### Return type

[**CreatedProcessId**](CreatedProcessId.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailCampaign"></a>
# **getEmailCampaign**
> GetEmailCampaign getEmailCampaign(campaignId)

Get campaign informations

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.EmailCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EmailCampaignsApi apiInstance = new EmailCampaignsApi();
Long campaignId = 789L; // Long | Id of the campaign
try {
    GetEmailCampaign result = apiInstance.getEmailCampaign(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailCampaignsApi#getEmailCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| Id of the campaign |

### Return type

[**GetEmailCampaign**](GetEmailCampaign.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailCampaigns"></a>
# **getEmailCampaigns**
> GetEmailCampaigns getEmailCampaigns(type, status, limit, offset)

Return all your created campaigns

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.EmailCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EmailCampaignsApi apiInstance = new EmailCampaignsApi();
String type = "type_example"; // String | Filter on the type of the campaigns
String status = "status_example"; // String | Filter on the status of the campaign
Long limit = 500L; // Long | Number of documents per page
Long offset = 0L; // Long | Index of the first document in the page
try {
    GetEmailCampaigns result = apiInstance.getEmailCampaigns(type, status, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailCampaignsApi#getEmailCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Filter on the type of the campaigns | [optional] [enum: classic, trigger]
 **status** | **String**| Filter on the status of the campaign | [optional] [enum: suspended, archive, sent, queued, draft, inProcess]
 **limit** | **Long**| Number of documents per page | [optional] [default to 500]
 **offset** | **Long**| Index of the first document in the page | [optional] [default to 0]

### Return type

[**GetEmailCampaigns**](GetEmailCampaigns.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendEmailCampaignNow"></a>
# **sendEmailCampaignNow**
> sendEmailCampaignNow(campaignId)

Send an email campaign id of the campaign immediately

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.EmailCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EmailCampaignsApi apiInstance = new EmailCampaignsApi();
Long campaignId = 789L; // Long | Id of the campaign
try {
    apiInstance.sendEmailCampaignNow(campaignId);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailCampaignsApi#sendEmailCampaignNow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| Id of the campaign |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendReport"></a>
# **sendReport**
> sendReport(campaignId, sendReport)

Send the report of a campaigns

A PDF will be sent to the specified email addresses

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.EmailCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EmailCampaignsApi apiInstance = new EmailCampaignsApi();
Long campaignId = 789L; // Long | Id of the campaign
SendReport sendReport = new SendReport(); // SendReport | Values for send a report
try {
    apiInstance.sendReport(campaignId, sendReport);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailCampaignsApi#sendReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| Id of the campaign |
 **sendReport** | [**SendReport**](SendReport.md)| Values for send a report |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendTestEmail"></a>
# **sendTestEmail**
> sendTestEmail(campaignId, emailTo)

Send an email campaign to your test list

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.EmailCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EmailCampaignsApi apiInstance = new EmailCampaignsApi();
Long campaignId = 789L; // Long | Id of the campaign
SendTestEmail emailTo = new SendTestEmail(); // SendTestEmail | 
try {
    apiInstance.sendTestEmail(campaignId, emailTo);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailCampaignsApi#sendTestEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| Id of the campaign |
 **emailTo** | [**SendTestEmail**](SendTestEmail.md)|  |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCampaignStatus"></a>
# **updateCampaignStatus**
> updateCampaignStatus(campaignId, status)

Update a campaign status

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.EmailCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EmailCampaignsApi apiInstance = new EmailCampaignsApi();
Long campaignId = 789L; // Long | Id of the campaign
UpdateCampaignStatus status = new UpdateCampaignStatus(); // UpdateCampaignStatus | Status of the campaign
try {
    apiInstance.updateCampaignStatus(campaignId, status);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailCampaignsApi#updateCampaignStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| Id of the campaign |
 **status** | [**UpdateCampaignStatus**](UpdateCampaignStatus.md)| Status of the campaign |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEmailCampaign"></a>
# **updateEmailCampaign**
> updateEmailCampaign(campaignId, emailCampaign)

Update a campaign

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.EmailCampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EmailCampaignsApi apiInstance = new EmailCampaignsApi();
Long campaignId = 789L; // Long | Id of the campaign
UpdateEmailCampaign emailCampaign = new UpdateEmailCampaign(); // UpdateEmailCampaign | Values to update a campaign
try {
    apiInstance.updateEmailCampaign(campaignId, emailCampaign);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailCampaignsApi#updateEmailCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| Id of the campaign |
 **emailCampaign** | [**UpdateEmailCampaign**](UpdateEmailCampaign.md)| Values to update a campaign |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

