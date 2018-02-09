# TransactionalSmsApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSmsEvents**](TransactionalSmsApi.md#getSmsEvents) | **GET** /transactionalSMS/statistics/events | Get all the SMS activity (unaggregated events)
[**getTransacAggregatedSmsReport**](TransactionalSmsApi.md#getTransacAggregatedSmsReport) | **GET** /transactionalSMS/statistics/aggregatedReport | Get your SMS activity aggregated over a period of time
[**getTransacSmsReport**](TransactionalSmsApi.md#getTransacSmsReport) | **GET** /transactionalSMS/statistics/reports | Get your SMS activity aggregated per day
[**sendTransacSms**](TransactionalSmsApi.md#sendTransacSms) | **POST** /transactionalSMS/sms | Send the SMS campaign to the specified mobile number


<a name="getSmsEvents"></a>
# **getSmsEvents**
> GetSmsEventReport getSmsEvents(limit, startDate, endDate, offset, days, phoneNumber, event, tags)

Get all the SMS activity (unaggregated events)

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalSmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TransactionalSmsApi apiInstance = new TransactionalSmsApi();
Long limit = 50L; // Long | Number of documents per page
LocalDate startDate = new LocalDate(); // LocalDate | Mandatory if endDate is used. Starting date (YYYY-MM-DD) of the report
LocalDate endDate = new LocalDate(); // LocalDate | Mandatory if startDate is used. Ending date (YYYY-MM-DD) of the report
Long offset = 0L; // Long | Index of the first document of the page
Integer days = 56; // Integer | Number of days in the past including today (positive integer). Not compatible with 'startDate' and 'endDate'
String phoneNumber = "phoneNumber_example"; // String | Filter the report for a specific phone number
String event = "event_example"; // String | Filter the report for specific events
String tags = "tags_example"; // String | Filter the report for specific tags passed as a serialized urlencoded array
try {
    GetSmsEventReport result = apiInstance.getSmsEvents(limit, startDate, endDate, offset, days, phoneNumber, event, tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalSmsApi#getSmsEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| Number of documents per page | [optional] [default to 50]
 **startDate** | **LocalDate**| Mandatory if endDate is used. Starting date (YYYY-MM-DD) of the report | [optional]
 **endDate** | **LocalDate**| Mandatory if startDate is used. Ending date (YYYY-MM-DD) of the report | [optional]
 **offset** | **Long**| Index of the first document of the page | [optional] [default to 0]
 **days** | **Integer**| Number of days in the past including today (positive integer). Not compatible with &#39;startDate&#39; and &#39;endDate&#39; | [optional]
 **phoneNumber** | **String**| Filter the report for a specific phone number | [optional]
 **event** | **String**| Filter the report for specific events | [optional] [enum: bounces, hardBounces, softBounces, delivered, sent, accepted, unsubscription, replies, blocked]
 **tags** | **String**| Filter the report for specific tags passed as a serialized urlencoded array | [optional]

### Return type

[**GetSmsEventReport**](GetSmsEventReport.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransacAggregatedSmsReport"></a>
# **getTransacAggregatedSmsReport**
> GetTransacAggregatedSmsReport getTransacAggregatedSmsReport(startDate, endDate, days, tag)

Get your SMS activity aggregated over a period of time

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalSmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TransactionalSmsApi apiInstance = new TransactionalSmsApi();
LocalDate startDate = new LocalDate(); // LocalDate | Mandatory if endDate is used. Starting date (YYYY-MM-DD) of the report
LocalDate endDate = new LocalDate(); // LocalDate | Mandatory if startDate is used. Ending date (YYYY-MM-DD) of the report
Integer days = 56; // Integer | Number of days in the past including today (positive integer). Not compatible with startDate and endDate
String tag = "tag_example"; // String | Filter on a tag
try {
    GetTransacAggregatedSmsReport result = apiInstance.getTransacAggregatedSmsReport(startDate, endDate, days, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalSmsApi#getTransacAggregatedSmsReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **LocalDate**| Mandatory if endDate is used. Starting date (YYYY-MM-DD) of the report | [optional]
 **endDate** | **LocalDate**| Mandatory if startDate is used. Ending date (YYYY-MM-DD) of the report | [optional]
 **days** | **Integer**| Number of days in the past including today (positive integer). Not compatible with startDate and endDate | [optional]
 **tag** | **String**| Filter on a tag | [optional]

### Return type

[**GetTransacAggregatedSmsReport**](GetTransacAggregatedSmsReport.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransacSmsReport"></a>
# **getTransacSmsReport**
> GetTransacSmsReport getTransacSmsReport(startDate, endDate, days, tag)

Get your SMS activity aggregated per day

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalSmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TransactionalSmsApi apiInstance = new TransactionalSmsApi();
LocalDate startDate = new LocalDate(); // LocalDate | Mandatory if endDate is used. Starting date (YYYY-MM-DD) of the report
LocalDate endDate = new LocalDate(); // LocalDate | Mandatory if startDate is used. Ending date (YYYY-MM-DD) of the report
Integer days = 56; // Integer | Number of days in the past including today (positive integer). Not compatible with 'startDate' and 'endDate'
String tag = "tag_example"; // String | Filter on a tag
try {
    GetTransacSmsReport result = apiInstance.getTransacSmsReport(startDate, endDate, days, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalSmsApi#getTransacSmsReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **LocalDate**| Mandatory if endDate is used. Starting date (YYYY-MM-DD) of the report | [optional]
 **endDate** | **LocalDate**| Mandatory if startDate is used. Ending date (YYYY-MM-DD) of the report | [optional]
 **days** | **Integer**| Number of days in the past including today (positive integer). Not compatible with &#39;startDate&#39; and &#39;endDate&#39; | [optional]
 **tag** | **String**| Filter on a tag | [optional]

### Return type

[**GetTransacSmsReport**](GetTransacSmsReport.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendTransacSms"></a>
# **sendTransacSms**
> SendSms sendTransacSms(sendTransacSms)

Send the SMS campaign to the specified mobile number

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.TransactionalSmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TransactionalSmsApi apiInstance = new TransactionalSmsApi();
SendTransacSms sendTransacSms = new SendTransacSms(); // SendTransacSms | Values to send a transactional SMS
try {
    SendSms result = apiInstance.sendTransacSms(sendTransacSms);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalSmsApi#sendTransacSms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendTransacSms** | [**SendTransacSms**](SendTransacSms.md)| Values to send a transactional SMS |

### Return type

[**SendSms**](SendSms.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

