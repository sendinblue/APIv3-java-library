# TransactionalEmailsApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**blockNewDomain**](TransactionalEmailsApi.md#blockNewDomain) | **POST** /smtp/blockedDomains | Add a new domain to the list of blocked domains
[**createSmtpTemplate**](TransactionalEmailsApi.md#createSmtpTemplate) | **POST** /smtp/templates | Create an email template
[**deleteBlockedDomain**](TransactionalEmailsApi.md#deleteBlockedDomain) | **DELETE** /smtp/blockedDomains/{domain} | Unblock an existing domain from the list of blocked domains
[**deleteHardbounces**](TransactionalEmailsApi.md#deleteHardbounces) | **POST** /smtp/deleteHardbounces | Delete hardbounces
[**deleteSmtpTemplate**](TransactionalEmailsApi.md#deleteSmtpTemplate) | **DELETE** /smtp/templates/{templateId} | Delete an inactive email template
[**getAggregatedSmtpReport**](TransactionalEmailsApi.md#getAggregatedSmtpReport) | **GET** /smtp/statistics/aggregatedReport | Get your transactional email activity aggregated over a period of time
[**getBlockedDomains**](TransactionalEmailsApi.md#getBlockedDomains) | **GET** /smtp/blockedDomains | Get the list of blocked domains
[**getEmailEventReport**](TransactionalEmailsApi.md#getEmailEventReport) | **GET** /smtp/statistics/events | Get all your transactional email activity (unaggregated events)
[**getSmtpReport**](TransactionalEmailsApi.md#getSmtpReport) | **GET** /smtp/statistics/reports | Get your transactional email activity aggregated per day
[**getSmtpTemplate**](TransactionalEmailsApi.md#getSmtpTemplate) | **GET** /smtp/templates/{templateId} | Returns the template information
[**getSmtpTemplates**](TransactionalEmailsApi.md#getSmtpTemplates) | **GET** /smtp/templates | Get the list of email templates
[**getTransacBlockedContacts**](TransactionalEmailsApi.md#getTransacBlockedContacts) | **GET** /smtp/blockedContacts | Get the list of blocked or unsubscribed transactional contacts
[**getTransacEmailContent**](TransactionalEmailsApi.md#getTransacEmailContent) | **GET** /smtp/emails/{uuid} | Get the personalized content of a sent transactional email
[**getTransacEmailsList**](TransactionalEmailsApi.md#getTransacEmailsList) | **GET** /smtp/emails | Get the list of transactional emails on the basis of allowed filters
[**sendTemplate**](TransactionalEmailsApi.md#sendTemplate) | **POST** /smtp/templates/{templateId}/send | Send a template
[**sendTestTemplate**](TransactionalEmailsApi.md#sendTestTemplate) | **POST** /smtp/templates/{templateId}/sendTest | Send a template to your test list
[**sendTransacEmail**](TransactionalEmailsApi.md#sendTransacEmail) | **POST** /smtp/email | Send a transactional email
[**smtpBlockedContactsEmailDelete**](TransactionalEmailsApi.md#smtpBlockedContactsEmailDelete) | **DELETE** /smtp/blockedContacts/{email} | Unblock or resubscribe a transactional contact
[**smtpLogMessageIdDelete**](TransactionalEmailsApi.md#smtpLogMessageIdDelete) | **DELETE** /smtp/log/{messageId} | Delete an SMTP transactional log
[**updateSmtpTemplate**](TransactionalEmailsApi.md#updateSmtpTemplate) | **PUT** /smtp/templates/{templateId} | Update an email template


<a name="blockNewDomain"></a>
# **blockNewDomain**
> blockNewDomain(blockDomain)

Add a new domain to the list of blocked domains

Blocks a new domain in order to avoid messages being sent to the same

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
BlockDomain blockDomain = new BlockDomain(); // BlockDomain | 
try {
    apiInstance.blockNewDomain(blockDomain);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#blockNewDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockDomain** | [**BlockDomain**](BlockDomain.md)|  |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSmtpTemplate"></a>
# **createSmtpTemplate**
> CreateModel createSmtpTemplate(smtpTemplate)

Create an email template

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
CreateSmtpTemplate smtpTemplate = new CreateSmtpTemplate(); // CreateSmtpTemplate | values to update in transactional email template
try {
    CreateModel result = apiInstance.createSmtpTemplate(smtpTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#createSmtpTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smtpTemplate** | [**CreateSmtpTemplate**](CreateSmtpTemplate.md)| values to update in transactional email template |

### Return type

[**CreateModel**](CreateModel.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBlockedDomain"></a>
# **deleteBlockedDomain**
> deleteBlockedDomain(domain)

Unblock an existing domain from the list of blocked domains

Unblocks an existing domain from the list of blocked domains

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
String domain = "domain_example"; // String | The name of the domain to be deleted
try {
    apiInstance.deleteBlockedDomain(domain);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#deleteBlockedDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**| The name of the domain to be deleted |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteHardbounces"></a>
# **deleteHardbounces**
> deleteHardbounces(deleteHardbounces)

Delete hardbounces

Delete hardbounces. To use carefully (e.g. in case of temporary ISP failures)

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
DeleteHardbounces deleteHardbounces = new DeleteHardbounces(); // DeleteHardbounces | values to delete hardbounces
try {
    apiInstance.deleteHardbounces(deleteHardbounces);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#deleteHardbounces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteHardbounces** | [**DeleteHardbounces**](DeleteHardbounces.md)| values to delete hardbounces | [optional]

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSmtpTemplate"></a>
# **deleteSmtpTemplate**
> deleteSmtpTemplate(templateId)

Delete an inactive email template

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
Long templateId = 789L; // Long | id of the template
try {
    apiInstance.deleteSmtpTemplate(templateId);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#deleteSmtpTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Long**| id of the template |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAggregatedSmtpReport"></a>
# **getAggregatedSmtpReport**
> GetAggregatedReport getAggregatedSmtpReport(startDate, endDate, days, tag)

Get your transactional email activity aggregated over a period of time

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
String startDate = "startDate_example"; // String | Mandatory if endDate is used. Starting date of the report (YYYY-MM-DD). Must be lower than equal to endDate
String endDate = "endDate_example"; // String | Mandatory if startDate is used. Ending date of the report (YYYY-MM-DD). Must be greater than equal to startDate
Integer days = 56; // Integer | Number of days in the past including today (positive integer). Not compatible with 'startDate' and 'endDate'
String tag = "tag_example"; // String | Tag of the emails
try {
    GetAggregatedReport result = apiInstance.getAggregatedSmtpReport(startDate, endDate, days, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#getAggregatedSmtpReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **String**| Mandatory if endDate is used. Starting date of the report (YYYY-MM-DD). Must be lower than equal to endDate | [optional]
 **endDate** | **String**| Mandatory if startDate is used. Ending date of the report (YYYY-MM-DD). Must be greater than equal to startDate | [optional]
 **days** | **Integer**| Number of days in the past including today (positive integer). Not compatible with &#39;startDate&#39; and &#39;endDate&#39; | [optional]
 **tag** | **String**| Tag of the emails | [optional]

### Return type

[**GetAggregatedReport**](GetAggregatedReport.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBlockedDomains"></a>
# **getBlockedDomains**
> GetBlockedDomains getBlockedDomains()

Get the list of blocked domains

Get the list of blocked domains

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
try {
    GetBlockedDomains result = apiInstance.getBlockedDomains();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#getBlockedDomains");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetBlockedDomains**](GetBlockedDomains.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailEventReport"></a>
# **getEmailEventReport**
> GetEmailEventReport getEmailEventReport(limit, offset, startDate, endDate, days, email, event, tags, messageId, templateId, sort)

Get all your transactional email activity (unaggregated events)

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
Long limit = 50L; // Long | Number limitation for the result returned
Long offset = 0L; // Long | Beginning point in the list to retrieve from.
String startDate = "startDate_example"; // String | Mandatory if endDate is used. Starting date of the report (YYYY-MM-DD). Must be lower than equal to endDate
String endDate = "endDate_example"; // String | Mandatory if startDate is used. Ending date of the report (YYYY-MM-DD). Must be greater than equal to startDate
Integer days = 56; // Integer | Number of days in the past including today (positive integer). Not compatible with 'startDate' and 'endDate'
String email = "email_example"; // String | Filter the report for a specific email addresses
String event = "event_example"; // String | Filter the report for a specific event type
String tags = "tags_example"; // String | Filter the report for tags (serialized and urlencoded array)
String messageId = "messageId_example"; // String | Filter on a specific message id
Long templateId = 789L; // Long | Filter on a specific template id
String sort = "desc"; // String | Sort the results in the ascending/descending order of record creation
try {
    GetEmailEventReport result = apiInstance.getEmailEventReport(limit, offset, startDate, endDate, days, email, event, tags, messageId, templateId, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#getEmailEventReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| Number limitation for the result returned | [optional] [default to 50]
 **offset** | **Long**| Beginning point in the list to retrieve from. | [optional] [default to 0]
 **startDate** | **String**| Mandatory if endDate is used. Starting date of the report (YYYY-MM-DD). Must be lower than equal to endDate | [optional]
 **endDate** | **String**| Mandatory if startDate is used. Ending date of the report (YYYY-MM-DD). Must be greater than equal to startDate | [optional]
 **days** | **Integer**| Number of days in the past including today (positive integer). Not compatible with &#39;startDate&#39; and &#39;endDate&#39; | [optional]
 **email** | **String**| Filter the report for a specific email addresses | [optional]
 **event** | **String**| Filter the report for a specific event type | [optional] [enum: bounces, hardBounces, softBounces, delivered, spam, requests, opened, clicks, invalid, deferred, blocked, unsubscribed, error]
 **tags** | **String**| Filter the report for tags (serialized and urlencoded array) | [optional]
 **messageId** | **String**| Filter on a specific message id | [optional]
 **templateId** | **Long**| Filter on a specific template id | [optional]
 **sort** | **String**| Sort the results in the ascending/descending order of record creation | [optional] [default to desc] [enum: asc, desc]

### Return type

[**GetEmailEventReport**](GetEmailEventReport.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSmtpReport"></a>
# **getSmtpReport**
> GetReports getSmtpReport(limit, offset, startDate, endDate, days, tag, sort)

Get your transactional email activity aggregated per day

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
Long limit = 10L; // Long | Number of documents returned per page
Long offset = 0L; // Long | Index of the first document on the page
String startDate = "startDate_example"; // String | Mandatory if endDate is used. Starting date of the report (YYYY-MM-DD)
String endDate = "endDate_example"; // String | Mandatory if startDate is used. Ending date of the report (YYYY-MM-DD)
Integer days = 56; // Integer | Number of days in the past including today (positive integer). Not compatible with 'startDate' and 'endDate'
String tag = "tag_example"; // String | Tag of the emails
String sort = "desc"; // String | Sort the results in the ascending/descending order of record creation
try {
    GetReports result = apiInstance.getSmtpReport(limit, offset, startDate, endDate, days, tag, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#getSmtpReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| Number of documents returned per page | [optional] [default to 10]
 **offset** | **Long**| Index of the first document on the page | [optional] [default to 0]
 **startDate** | **String**| Mandatory if endDate is used. Starting date of the report (YYYY-MM-DD) | [optional]
 **endDate** | **String**| Mandatory if startDate is used. Ending date of the report (YYYY-MM-DD) | [optional]
 **days** | **Integer**| Number of days in the past including today (positive integer). Not compatible with &#39;startDate&#39; and &#39;endDate&#39; | [optional]
 **tag** | **String**| Tag of the emails | [optional]
 **sort** | **String**| Sort the results in the ascending/descending order of record creation | [optional] [default to desc] [enum: asc, desc]

### Return type

[**GetReports**](GetReports.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSmtpTemplate"></a>
# **getSmtpTemplate**
> GetSmtpTemplateOverview getSmtpTemplate(templateId)

Returns the template information

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
Long templateId = 789L; // Long | id of the template
try {
    GetSmtpTemplateOverview result = apiInstance.getSmtpTemplate(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#getSmtpTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Long**| id of the template |

### Return type

[**GetSmtpTemplateOverview**](GetSmtpTemplateOverview.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSmtpTemplates"></a>
# **getSmtpTemplates**
> GetSmtpTemplates getSmtpTemplates(templateStatus, limit, offset, sort)

Get the list of email templates

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
Boolean templateStatus = true; // Boolean | Filter on the status of the template. Active = true, inactive = false
Long limit = 50L; // Long | Number of documents returned per page
Long offset = 0L; // Long | Index of the first document in the page
String sort = "desc"; // String | Sort the results in the ascending/descending order of record creation
try {
    GetSmtpTemplates result = apiInstance.getSmtpTemplates(templateStatus, limit, offset, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#getSmtpTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateStatus** | **Boolean**| Filter on the status of the template. Active &#x3D; true, inactive &#x3D; false | [optional]
 **limit** | **Long**| Number of documents returned per page | [optional] [default to 50]
 **offset** | **Long**| Index of the first document in the page | [optional] [default to 0]
 **sort** | **String**| Sort the results in the ascending/descending order of record creation | [optional] [default to desc] [enum: asc, desc]

### Return type

[**GetSmtpTemplates**](GetSmtpTemplates.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransacBlockedContacts"></a>
# **getTransacBlockedContacts**
> GetTransacBlockedContacts getTransacBlockedContacts(startDate, endDate, limit, offset, senders, sort)

Get the list of blocked or unsubscribed transactional contacts

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
String startDate = "startDate_example"; // String | Mandatory if endDate is used. Starting date (YYYY-MM-DD) from which you want to fetch the blocked or unsubscribed contacts
String endDate = "endDate_example"; // String | Mandatory if startDate is used. Ending date (YYYY-MM-DD) till which you want to fetch the blocked or unsubscribed contacts
Long limit = 50L; // Long | Number of documents returned per page
Long offset = 0L; // Long | Index of the first document on the page
List<String> senders = Arrays.asList("senders_example"); // List<String> | Comma separated list of emails of the senders from which contacts are blocked or unsubscribed
String sort = "desc"; // String | Sort the results in the ascending/descending order of record creation
try {
    GetTransacBlockedContacts result = apiInstance.getTransacBlockedContacts(startDate, endDate, limit, offset, senders, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#getTransacBlockedContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **String**| Mandatory if endDate is used. Starting date (YYYY-MM-DD) from which you want to fetch the blocked or unsubscribed contacts | [optional]
 **endDate** | **String**| Mandatory if startDate is used. Ending date (YYYY-MM-DD) till which you want to fetch the blocked or unsubscribed contacts | [optional]
 **limit** | **Long**| Number of documents returned per page | [optional] [default to 50]
 **offset** | **Long**| Index of the first document on the page | [optional] [default to 0]
 **senders** | [**List&lt;String&gt;**](String.md)| Comma separated list of emails of the senders from which contacts are blocked or unsubscribed | [optional]
 **sort** | **String**| Sort the results in the ascending/descending order of record creation | [optional] [default to desc] [enum: asc, desc]

### Return type

[**GetTransacBlockedContacts**](GetTransacBlockedContacts.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransacEmailContent"></a>
# **getTransacEmailContent**
> GetTransacEmailContent getTransacEmailContent(uuid)

Get the personalized content of a sent transactional email

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
String uuid = "uuid_example"; // String | Unique id of the transactional email that has been sent to a particular contact
try {
    GetTransacEmailContent result = apiInstance.getTransacEmailContent(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#getTransacEmailContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| Unique id of the transactional email that has been sent to a particular contact |

### Return type

[**GetTransacEmailContent**](GetTransacEmailContent.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransacEmailsList"></a>
# **getTransacEmailsList**
> GetTransacEmailsList getTransacEmailsList(email, templateId, messageId, startDate, endDate, sort)

Get the list of transactional emails on the basis of allowed filters

This endpoint will show the list of emails for past 30 days by default. To retrieve emails before that time, please pass startDate and endDate in query filters.

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
String email = "email_example"; // String | Mandatory if templateId and messageId are not passed in query filters. Email address to which transactional email has been sent.
Long templateId = 789L; // Long | Mandatory if email and messageId are not passed in query filters. Id of the template that was used to compose transactional email.
String messageId = "messageId_example"; // String | Mandatory if templateId and email are not passed in query filters. Message ID of the transactional email sent.
LocalDate startDate = LocalDate.now(); // LocalDate | Mandatory if endDate is used. Starting date (YYYY-MM-DD) from which you want to fetch the list. Maximum time period that can be selected is one month.
LocalDate endDate = LocalDate.now(); // LocalDate | Mandatory if startDate is used. Ending date (YYYY-MM-DD) till which you want to fetch the list. Maximum time period that can be selected is one month.
String sort = "desc"; // String | Sort the results in the ascending/descending order of record creation
try {
    GetTransacEmailsList result = apiInstance.getTransacEmailsList(email, templateId, messageId, startDate, endDate, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#getTransacEmailsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| Mandatory if templateId and messageId are not passed in query filters. Email address to which transactional email has been sent. | [optional]
 **templateId** | **Long**| Mandatory if email and messageId are not passed in query filters. Id of the template that was used to compose transactional email. | [optional]
 **messageId** | **String**| Mandatory if templateId and email are not passed in query filters. Message ID of the transactional email sent. | [optional]
 **startDate** | **LocalDate**| Mandatory if endDate is used. Starting date (YYYY-MM-DD) from which you want to fetch the list. Maximum time period that can be selected is one month. | [optional]
 **endDate** | **LocalDate**| Mandatory if startDate is used. Ending date (YYYY-MM-DD) till which you want to fetch the list. Maximum time period that can be selected is one month. | [optional]
 **sort** | **String**| Sort the results in the ascending/descending order of record creation | [optional] [default to desc] [enum: asc, desc]

### Return type

[**GetTransacEmailsList**](GetTransacEmailsList.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendTemplate"></a>
# **sendTemplate**
> SendTemplateEmail sendTemplate(templateId, sendEmail)

Send a template

This endpoint is deprecated. Prefer v3/smtp/email instead.

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
Long templateId = 789L; // Long | Id of the template
SendEmail sendEmail = new SendEmail(); // SendEmail | 
try {
    SendTemplateEmail result = apiInstance.sendTemplate(templateId, sendEmail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#sendTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Long**| Id of the template |
 **sendEmail** | [**SendEmail**](SendEmail.md)|  |

### Return type

[**SendTemplateEmail**](SendTemplateEmail.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendTestTemplate"></a>
# **sendTestTemplate**
> sendTestTemplate(templateId, sendTestEmail)

Send a template to your test list

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
Long templateId = 789L; // Long | Id of the template
SendTestEmail sendTestEmail = new SendTestEmail(); // SendTestEmail | 
try {
    apiInstance.sendTestTemplate(templateId, sendTestEmail);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#sendTestTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Long**| Id of the template |
 **sendTestEmail** | [**SendTestEmail**](SendTestEmail.md)|  |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendTransacEmail"></a>
# **sendTransacEmail**
> CreateSmtpEmail sendTransacEmail(sendSmtpEmail)

Send a transactional email

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
SendSmtpEmail sendSmtpEmail = new SendSmtpEmail(); // SendSmtpEmail | Values to send a transactional email
try {
    CreateSmtpEmail result = apiInstance.sendTransacEmail(sendSmtpEmail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#sendTransacEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendSmtpEmail** | [**SendSmtpEmail**](SendSmtpEmail.md)| Values to send a transactional email |

### Return type

[**CreateSmtpEmail**](CreateSmtpEmail.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smtpBlockedContactsEmailDelete"></a>
# **smtpBlockedContactsEmailDelete**
> smtpBlockedContactsEmailDelete(email)

Unblock or resubscribe a transactional contact

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
String email = "email_example"; // String | contact email (urlencoded) to unblock.
try {
    apiInstance.smtpBlockedContactsEmailDelete(email);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#smtpBlockedContactsEmailDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| contact email (urlencoded) to unblock. |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smtpLogMessageIdDelete"></a>
# **smtpLogMessageIdDelete**
> smtpLogMessageIdDelete(messageId)

Delete an SMTP transactional log

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
String messageId = "messageId_example"; // String | MessageId of the transactional log to delete
try {
    apiInstance.smtpLogMessageIdDelete(messageId);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#smtpLogMessageIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **String**| MessageId of the transactional log to delete |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSmtpTemplate"></a>
# **updateSmtpTemplate**
> updateSmtpTemplate(templateId, smtpTemplate)

Update an email template

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalEmailsApi;

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

TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
Long templateId = 789L; // Long | id of the template
UpdateSmtpTemplate smtpTemplate = new UpdateSmtpTemplate(); // UpdateSmtpTemplate | values to update in transactional email template
try {
    apiInstance.updateSmtpTemplate(templateId, smtpTemplate);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailsApi#updateSmtpTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Long**| id of the template |
 **smtpTemplate** | [**UpdateSmtpTemplate**](UpdateSmtpTemplate.md)| values to update in transactional email template |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

