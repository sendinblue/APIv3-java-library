# InboundParsingApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInboundEmailAttachment**](InboundParsingApi.md#getInboundEmailAttachment) | **GET** /inbound/attachments/{downloadToken} | Retrieve inbound attachment with download token.
[**getInboundEmailEvents**](InboundParsingApi.md#getInboundEmailEvents) | **GET** /inbound/events | Get the list of all the events for the received emails.
[**getInboundEmailEventsByUuid**](InboundParsingApi.md#getInboundEmailEventsByUuid) | **GET** /inbound/events/{uuid} | Fetch all events history for one particular received email.


<a name="getInboundEmailAttachment"></a>
# **getInboundEmailAttachment**
> File getInboundEmailAttachment(downloadToken)

Retrieve inbound attachment with download token.

This endpoint will retrieve inbound attachment with download token.

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.InboundParsingApi;

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

InboundParsingApi apiInstance = new InboundParsingApi();
String downloadToken = "downloadToken_example"; // String | Token to fetch a particular attachment
try {
    File result = apiInstance.getInboundEmailAttachment(downloadToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundParsingApi#getInboundEmailAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **downloadToken** | **String**| Token to fetch a particular attachment |

### Return type

[**File**](File.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInboundEmailEvents"></a>
# **getInboundEmailEvents**
> GetInboundEmailEvents getInboundEmailEvents(sender, startDate, endDate, limit, offset, sort)

Get the list of all the events for the received emails.

This endpoint will show the list of all the events for the received emails.

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.InboundParsingApi;

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

InboundParsingApi apiInstance = new InboundParsingApi();
String sender = "sender_example"; // String | Email address of the sender.
LocalDate startDate = LocalDate.now(); // LocalDate | Mandatory if endDate is used. Starting date (YYYY-MM-DD) from which you want to fetch the list. Maximum time period that can be selected is one month.
LocalDate endDate = LocalDate.now(); // LocalDate | Mandatory if startDate is used. Ending date (YYYY-MM-DD) till which you want to fetch the list. Maximum time period that can be selected is one month.
Long limit = 100L; // Long | Number of documents returned per page
Long offset = 0L; // Long | Index of the first document on the page
String sort = "desc"; // String | Sort the results in the ascending/descending order of record creation
try {
    GetInboundEmailEvents result = apiInstance.getInboundEmailEvents(sender, startDate, endDate, limit, offset, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundParsingApi#getInboundEmailEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sender** | **String**| Email address of the sender. | [optional]
 **startDate** | **LocalDate**| Mandatory if endDate is used. Starting date (YYYY-MM-DD) from which you want to fetch the list. Maximum time period that can be selected is one month. | [optional]
 **endDate** | **LocalDate**| Mandatory if startDate is used. Ending date (YYYY-MM-DD) till which you want to fetch the list. Maximum time period that can be selected is one month. | [optional]
 **limit** | **Long**| Number of documents returned per page | [optional] [default to 100]
 **offset** | **Long**| Index of the first document on the page | [optional] [default to 0]
 **sort** | **String**| Sort the results in the ascending/descending order of record creation | [optional] [default to desc] [enum: asc, desc]

### Return type

[**GetInboundEmailEvents**](GetInboundEmailEvents.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInboundEmailEventsByUuid"></a>
# **getInboundEmailEventsByUuid**
> GetInboundEmailEventsByUuid getInboundEmailEventsByUuid(uuid)

Fetch all events history for one particular received email.

This endpoint will show the list of all events history for one particular received email.

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.InboundParsingApi;

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

InboundParsingApi apiInstance = new InboundParsingApi();
String uuid = "uuid_example"; // String | UUID to fetch events specific to recieved email
try {
    GetInboundEmailEventsByUuid result = apiInstance.getInboundEmailEventsByUuid(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundParsingApi#getInboundEmailEventsByUuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| UUID to fetch events specific to recieved email |

### Return type

[**GetInboundEmailEventsByUuid**](GetInboundEmailEventsByUuid.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

