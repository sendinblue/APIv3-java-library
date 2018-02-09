# SmtpApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSmtpTemplate**](SmtpApi.md#createSmtpTemplate) | **POST** /smtp/templates | Create an smtp template
[**deleteHardbounces**](SmtpApi.md#deleteHardbounces) | **POST** /smtp/deleteHardbounces | Delete hardbounces
[**deleteSmtpTemplate**](SmtpApi.md#deleteSmtpTemplate) | **DELETE** /smtp/templates/{templateId} | Delete an inactive smtp template
[**getAggregatedSmtpReport**](SmtpApi.md#getAggregatedSmtpReport) | **GET** /smtp/statistics/aggregatedReport | Get your SMTP activity aggregated over a period of time
[**getEmailEventReport**](SmtpApi.md#getEmailEventReport) | **GET** /smtp/statistics/events | Get all your SMTP activity (unaggregated events)
[**getSmtpReport**](SmtpApi.md#getSmtpReport) | **GET** /smtp/statistics/reports | Get your SMTP activity aggregated per day
[**getSmtpTemplate**](SmtpApi.md#getSmtpTemplate) | **GET** /smtp/templates/{templateId} | Returns the template informations
[**getSmtpTemplates**](SmtpApi.md#getSmtpTemplates) | **GET** /smtp/templates | Get the list of SMTP templates
[**sendTemplate**](SmtpApi.md#sendTemplate) | **POST** /smtp/templates/{templateId}/send | Send a template
[**sendTestTemplate**](SmtpApi.md#sendTestTemplate) | **POST** /smtp/templates/{templateId}/sendTest | Send a template to your test list
[**sendTransacEmail**](SmtpApi.md#sendTransacEmail) | **POST** /smtp/email | Send a transactional email
[**updateSmtpTemplate**](SmtpApi.md#updateSmtpTemplate) | **PUT** /smtp/templates/{templateId} | Updates an smtp templates


<a name="createSmtpTemplate"></a>
# **createSmtpTemplate**
> CreateModel createSmtpTemplate(smtpTemplate)

Create an smtp template

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmtpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmtpApi apiInstance = new SmtpApi();
CreateSmtpTemplate smtpTemplate = new CreateSmtpTemplate(); // CreateSmtpTemplate | values to update in smtp template
try {
    CreateModel result = apiInstance.createSmtpTemplate(smtpTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpApi#createSmtpTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smtpTemplate** | [**CreateSmtpTemplate**](CreateSmtpTemplate.md)| values to update in smtp template |

### Return type

[**CreateModel**](CreateModel.md)

### Authorization

[api-key](../README.md#api-key)

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
//import sibApi.SmtpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmtpApi apiInstance = new SmtpApi();
DeleteHardbounces deleteHardbounces = new DeleteHardbounces(); // DeleteHardbounces | values to delete hardbounces
try {
    apiInstance.deleteHardbounces(deleteHardbounces);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpApi#deleteHardbounces");
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

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSmtpTemplate"></a>
# **deleteSmtpTemplate**
> deleteSmtpTemplate(templateId)

Delete an inactive smtp template

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmtpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmtpApi apiInstance = new SmtpApi();
Long templateId = 789L; // Long | id of the template
try {
    apiInstance.deleteSmtpTemplate(templateId);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpApi#deleteSmtpTemplate");
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

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAggregatedSmtpReport"></a>
# **getAggregatedSmtpReport**
> GetAggregatedReport getAggregatedSmtpReport(startDate, endDate, days, tag)

Get your SMTP activity aggregated over a period of time

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmtpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmtpApi apiInstance = new SmtpApi();
LocalDate startDate = new LocalDate(); // LocalDate | Mandatory if endDate is used. Starting date of the report (YYYY-MM-DD). Must be lower than equal to endDate
LocalDate endDate = new LocalDate(); // LocalDate | Mandatory if startDate is used. Ending date of the report (YYYY-MM-DD). Must be greater than equal to startDate
Integer days = 56; // Integer | Number of days in the past including today (positive integer). Not compatible with 'startDate' and 'endDate'
String tag = "tag_example"; // String | Tag of the emails
try {
    GetAggregatedReport result = apiInstance.getAggregatedSmtpReport(startDate, endDate, days, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpApi#getAggregatedSmtpReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **LocalDate**| Mandatory if endDate is used. Starting date of the report (YYYY-MM-DD). Must be lower than equal to endDate | [optional]
 **endDate** | **LocalDate**| Mandatory if startDate is used. Ending date of the report (YYYY-MM-DD). Must be greater than equal to startDate | [optional]
 **days** | **Integer**| Number of days in the past including today (positive integer). Not compatible with &#39;startDate&#39; and &#39;endDate&#39; | [optional]
 **tag** | **String**| Tag of the emails | [optional]

### Return type

[**GetAggregatedReport**](GetAggregatedReport.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailEventReport"></a>
# **getEmailEventReport**
> GetEmailEventReport getEmailEventReport(limit, offset, startDate, endDate, days, email, event, tags, messageId, templateId)

Get all your SMTP activity (unaggregated events)

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmtpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmtpApi apiInstance = new SmtpApi();
Long limit = 50L; // Long | Number limitation for the result returned
Long offset = 0L; // Long | Beginning point in the list to retrieve from.
LocalDate startDate = new LocalDate(); // LocalDate | Mandatory if endDate is used. Starting date of the report (YYYY-MM-DD). Must be lower than equal to endDate
LocalDate endDate = new LocalDate(); // LocalDate | Mandatory if startDate is used. Ending date of the report (YYYY-MM-DD). Must be greater than equal to startDate
Integer days = 56; // Integer | Number of days in the past including today (positive integer). Not compatible with 'startDate' and 'endDate'
String email = "email_example"; // String | Filter the report for a specific email addresses
String event = "event_example"; // String | Filter the report for a specific event type
String tags = "tags_example"; // String | Filter the report for tags (serialized and urlencoded array)
String messageId = "messageId_example"; // String | Filter on a specific message id
Long templateId = 789L; // Long | Filter on a specific template id
try {
    GetEmailEventReport result = apiInstance.getEmailEventReport(limit, offset, startDate, endDate, days, email, event, tags, messageId, templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpApi#getEmailEventReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| Number limitation for the result returned | [optional] [default to 50]
 **offset** | **Long**| Beginning point in the list to retrieve from. | [optional] [default to 0]
 **startDate** | **LocalDate**| Mandatory if endDate is used. Starting date of the report (YYYY-MM-DD). Must be lower than equal to endDate | [optional]
 **endDate** | **LocalDate**| Mandatory if startDate is used. Ending date of the report (YYYY-MM-DD). Must be greater than equal to startDate | [optional]
 **days** | **Integer**| Number of days in the past including today (positive integer). Not compatible with &#39;startDate&#39; and &#39;endDate&#39; | [optional]
 **email** | **String**| Filter the report for a specific email addresses | [optional]
 **event** | **String**| Filter the report for a specific event type | [optional] [enum: bounces, hardBounces, softBounces, delivered, spam, requests, opened, clicks, invalid, deferred, blocked]
 **tags** | **String**| Filter the report for tags (serialized and urlencoded array) | [optional]
 **messageId** | **String**| Filter on a specific message id | [optional]
 **templateId** | **Long**| Filter on a specific template id | [optional]

### Return type

[**GetEmailEventReport**](GetEmailEventReport.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSmtpReport"></a>
# **getSmtpReport**
> GetReports getSmtpReport(limit, offset, startDate, endDate, days, tag)

Get your SMTP activity aggregated per day

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmtpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmtpApi apiInstance = new SmtpApi();
Long limit = 50L; // Long | Number of documents returned per page
Long offset = 0L; // Long | Index of the first document on the page
LocalDate startDate = new LocalDate(); // LocalDate | Mandatory if endDate is used. Starting date of the report (YYYY-MM-DD)
LocalDate endDate = new LocalDate(); // LocalDate | Mandatory if startDate is used. Ending date of the report (YYYY-MM-DD)
Integer days = 56; // Integer | Number of days in the past including today (positive integer). Not compatible with 'startDate' and 'endDate'
String tag = "tag_example"; // String | Tag of the emails
try {
    GetReports result = apiInstance.getSmtpReport(limit, offset, startDate, endDate, days, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpApi#getSmtpReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| Number of documents returned per page | [optional] [default to 50]
 **offset** | **Long**| Index of the first document on the page | [optional] [default to 0]
 **startDate** | **LocalDate**| Mandatory if endDate is used. Starting date of the report (YYYY-MM-DD) | [optional]
 **endDate** | **LocalDate**| Mandatory if startDate is used. Ending date of the report (YYYY-MM-DD) | [optional]
 **days** | **Integer**| Number of days in the past including today (positive integer). Not compatible with &#39;startDate&#39; and &#39;endDate&#39; | [optional]
 **tag** | **String**| Tag of the emails | [optional]

### Return type

[**GetReports**](GetReports.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSmtpTemplate"></a>
# **getSmtpTemplate**
> GetSmtpTemplateOverview getSmtpTemplate(templateId)

Returns the template informations

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmtpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmtpApi apiInstance = new SmtpApi();
Long templateId = 789L; // Long | id of the template
try {
    GetSmtpTemplateOverview result = apiInstance.getSmtpTemplate(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpApi#getSmtpTemplate");
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

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSmtpTemplates"></a>
# **getSmtpTemplates**
> GetSmtpTemplates getSmtpTemplates(templateStatus, limit, offset)

Get the list of SMTP templates

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmtpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmtpApi apiInstance = new SmtpApi();
Boolean templateStatus = true; // Boolean | Filter on the status of the template. Active = true, inactive = false
Long limit = 50L; // Long | Number of documents returned per page
Long offset = 0L; // Long | Index of the first document in the page
try {
    GetSmtpTemplates result = apiInstance.getSmtpTemplates(templateStatus, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpApi#getSmtpTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateStatus** | **Boolean**| Filter on the status of the template. Active &#x3D; true, inactive &#x3D; false | [optional]
 **limit** | **Long**| Number of documents returned per page | [optional] [default to 50]
 **offset** | **Long**| Index of the first document in the page | [optional] [default to 0]

### Return type

[**GetSmtpTemplates**](GetSmtpTemplates.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendTemplate"></a>
# **sendTemplate**
> SendTemplateEmail sendTemplate(templateId, sendEmail)

Send a template

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmtpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmtpApi apiInstance = new SmtpApi();
Long templateId = 789L; // Long | Id of the template
SendEmail sendEmail = new SendEmail(); // SendEmail | 
try {
    SendTemplateEmail result = apiInstance.sendTemplate(templateId, sendEmail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpApi#sendTemplate");
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

[api-key](../README.md#api-key)

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
//import sibApi.SmtpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmtpApi apiInstance = new SmtpApi();
Long templateId = 789L; // Long | Id of the template
SendTestEmail sendTestEmail = new SendTestEmail(); // SendTestEmail | 
try {
    apiInstance.sendTestTemplate(templateId, sendTestEmail);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpApi#sendTestTemplate");
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

[api-key](../README.md#api-key)

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
//import sibApi.SmtpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmtpApi apiInstance = new SmtpApi();
SendSmtpEmail sendSmtpEmail = new SendSmtpEmail(); // SendSmtpEmail | Values to send a transactional email
try {
    CreateSmtpEmail result = apiInstance.sendTransacEmail(sendSmtpEmail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpApi#sendTransacEmail");
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

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSmtpTemplate"></a>
# **updateSmtpTemplate**
> updateSmtpTemplate(templateId, smtpTemplate)

Updates an smtp templates

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.SmtpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SmtpApi apiInstance = new SmtpApi();
Long templateId = 789L; // Long | id of the template
UpdateSmtpTemplate smtpTemplate = new UpdateSmtpTemplate(); // UpdateSmtpTemplate | values to update in smtp template
try {
    apiInstance.updateSmtpTemplate(templateId, smtpTemplate);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpApi#updateSmtpTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Long**| id of the template |
 **smtpTemplate** | [**UpdateSmtpTemplate**](UpdateSmtpTemplate.md)| values to update in smtp template |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

