# NotesApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**crmNotesGet**](NotesApi.md#crmNotesGet) | **GET** /crm/notes | Get all notes
[**crmNotesIdDelete**](NotesApi.md#crmNotesIdDelete) | **DELETE** /crm/notes/{id} | Delete a note
[**crmNotesIdGet**](NotesApi.md#crmNotesIdGet) | **GET** /crm/notes/{id} | Get a note
[**crmNotesIdPatch**](NotesApi.md#crmNotesIdPatch) | **PATCH** /crm/notes/{id} | Update a note
[**crmNotesPost**](NotesApi.md#crmNotesPost) | **POST** /crm/notes | Create a note


<a name="crmNotesGet"></a>
# **crmNotesGet**
> NoteList crmNotesGet(entity, entityIds, dateFrom, dateTo, offset, limit, sort)

Get all notes

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.NotesApi;

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

NotesApi apiInstance = new NotesApi();
String entity = "entity_example"; // String | Filter by note entity type
String entityIds = "entityIds_example"; // String | Filter by note entity IDs
Integer dateFrom = 56; // Integer | dateFrom to date range filter type (timestamp in milliseconds)
Integer dateTo = 56; // Integer | dateTo to date range filter type (timestamp in milliseconds)
Long offset = 789L; // Long | Index of the first document of the page
Long limit = 50L; // Long | Number of documents per page
String sort = "sort_example"; // String | Sort the results in the ascending/descending order. Default order is **descending** by creation if `sort` is not passed
try {
    NoteList result = apiInstance.crmNotesGet(entity, entityIds, dateFrom, dateTo, offset, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotesApi#crmNotesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**| Filter by note entity type | [optional] [enum: companies, deals, contacts]
 **entityIds** | **String**| Filter by note entity IDs | [optional]
 **dateFrom** | **Integer**| dateFrom to date range filter type (timestamp in milliseconds) | [optional]
 **dateTo** | **Integer**| dateTo to date range filter type (timestamp in milliseconds) | [optional]
 **offset** | **Long**| Index of the first document of the page | [optional]
 **limit** | **Long**| Number of documents per page | [optional] [default to 50]
 **sort** | **String**| Sort the results in the ascending/descending order. Default order is **descending** by creation if &#x60;sort&#x60; is not passed | [optional] [enum: asc, desc]

### Return type

[**NoteList**](NoteList.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmNotesIdDelete"></a>
# **crmNotesIdDelete**
> crmNotesIdDelete(id)

Delete a note

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.NotesApi;

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

NotesApi apiInstance = new NotesApi();
String id = "id_example"; // String | Note ID to delete
try {
    apiInstance.crmNotesIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling NotesApi#crmNotesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Note ID to delete |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmNotesIdGet"></a>
# **crmNotesIdGet**
> Note crmNotesIdGet(id)

Get a note

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.NotesApi;

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

NotesApi apiInstance = new NotesApi();
String id = "id_example"; // String | Note ID to get
try {
    Note result = apiInstance.crmNotesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotesApi#crmNotesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Note ID to get |

### Return type

[**Note**](Note.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmNotesIdPatch"></a>
# **crmNotesIdPatch**
> crmNotesIdPatch(id, body)

Update a note

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.NotesApi;

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

NotesApi apiInstance = new NotesApi();
String id = "id_example"; // String | Note ID to update
NoteData body = new NoteData(); // NoteData | Note data to update a note
try {
    apiInstance.crmNotesIdPatch(id, body);
} catch (ApiException e) {
    System.err.println("Exception when calling NotesApi#crmNotesIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Note ID to update |
 **body** | [**NoteData**](NoteData.md)| Note data to update a note |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmNotesPost"></a>
# **crmNotesPost**
> NoteId crmNotesPost(body)

Create a note

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.NotesApi;

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

NotesApi apiInstance = new NotesApi();
NoteData body = new NoteData(); // NoteData | Note data to create a note.
try {
    NoteId result = apiInstance.crmNotesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotesApi#crmNotesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NoteData**](NoteData.md)| Note data to create a note. |

### Return type

[**NoteId**](NoteId.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

