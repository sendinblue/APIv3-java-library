# CompaniesApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesAttributesGet**](CompaniesApi.md#companiesAttributesGet) | **GET** /companies/attributes | Get company attributes
[**companiesGet**](CompaniesApi.md#companiesGet) | **GET** /companies | Get all companies
[**companiesIdDelete**](CompaniesApi.md#companiesIdDelete) | **DELETE** /companies/{id} | Delete a company
[**companiesIdGet**](CompaniesApi.md#companiesIdGet) | **GET** /companies/{id} | Get a company
[**companiesIdPatch**](CompaniesApi.md#companiesIdPatch) | **PATCH** /companies/{id} | Update a company
[**companiesLinkUnlinkIdPatch**](CompaniesApi.md#companiesLinkUnlinkIdPatch) | **PATCH** /companies/link-unlink/{id} | Link and Unlink company with contacts and deals
[**companiesPost**](CompaniesApi.md#companiesPost) | **POST** /companies | Create a company


<a name="companiesAttributesGet"></a>
# **companiesAttributesGet**
> CompanyAttributes companiesAttributesGet()

Get company attributes

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.CompaniesApi;

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

CompaniesApi apiInstance = new CompaniesApi();
try {
    CompanyAttributes result = apiInstance.companiesAttributesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompaniesApi#companiesAttributesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CompanyAttributes**](CompanyAttributes.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesGet"></a>
# **companiesGet**
> CompaniesList companiesGet(filters, linkedContactsIds, linkedDealsIds, page, limit, sort, sortBy)

Get all companies

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.CompaniesApi;

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

CompaniesApi apiInstance = new CompaniesApi();
String filters = "filters_example"; // String | Filter by attrbutes. If you have filter for owner on your side please send it as {\"attributes.owner\":\"5b1a17d914b73d35a76ca0c7\"}
Long linkedContactsIds = 789L; // Long | Filter by linked contacts ids
String linkedDealsIds = "linkedDealsIds_example"; // String | Filter by linked deals ids
Long page = 789L; // Long | Index of the first document of the page
Long limit = 50L; // Long | Number of documents per page
String sort = "sort_example"; // String | Sort the results in the ascending/descending order. Default order is **descending** by creation if `sort` is not passed
String sortBy = "sortBy_example"; // String | The field used to sort field names.
try {
    CompaniesList result = apiInstance.companiesGet(filters, linkedContactsIds, linkedDealsIds, page, limit, sort, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompaniesApi#companiesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**| Filter by attrbutes. If you have filter for owner on your side please send it as {&quot;attributes.owner&quot;:&quot;5b1a17d914b73d35a76ca0c7&quot;} | [optional]
 **linkedContactsIds** | **Long**| Filter by linked contacts ids | [optional]
 **linkedDealsIds** | **String**| Filter by linked deals ids | [optional]
 **page** | **Long**| Index of the first document of the page | [optional]
 **limit** | **Long**| Number of documents per page | [optional] [default to 50]
 **sort** | **String**| Sort the results in the ascending/descending order. Default order is **descending** by creation if &#x60;sort&#x60; is not passed | [optional] [enum: asc, desc]
 **sortBy** | **String**| The field used to sort field names. | [optional]

### Return type

[**CompaniesList**](CompaniesList.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesIdDelete"></a>
# **companiesIdDelete**
> companiesIdDelete(id)

Delete a company

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.CompaniesApi;

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

CompaniesApi apiInstance = new CompaniesApi();
String id = "id_example"; // String | 
try {
    apiInstance.companiesIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CompaniesApi#companiesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesIdGet"></a>
# **companiesIdGet**
> Company companiesIdGet(id)

Get a company

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.CompaniesApi;

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

CompaniesApi apiInstance = new CompaniesApi();
String id = "id_example"; // String | 
try {
    Company result = apiInstance.companiesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompaniesApi#companiesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Company**](Company.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesIdPatch"></a>
# **companiesIdPatch**
> Company companiesIdPatch(id, body)

Update a company

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.CompaniesApi;

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

CompaniesApi apiInstance = new CompaniesApi();
String id = "id_example"; // String | 
Body1 body = new Body1(); // Body1 | Updated company details.
try {
    Company result = apiInstance.companiesIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompaniesApi#companiesIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**Body1**](Body1.md)| Updated company details. |

### Return type

[**Company**](Company.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesLinkUnlinkIdPatch"></a>
# **companiesLinkUnlinkIdPatch**
> companiesLinkUnlinkIdPatch(id, body)

Link and Unlink company with contacts and deals

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.CompaniesApi;

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

CompaniesApi apiInstance = new CompaniesApi();
String id = "id_example"; // String | 
Body2 body = new Body2(); // Body2 | Linked / Unlinked contacts and deals ids.
try {
    apiInstance.companiesLinkUnlinkIdPatch(id, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CompaniesApi#companiesLinkUnlinkIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**Body2**](Body2.md)| Linked / Unlinked contacts and deals ids. |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesPost"></a>
# **companiesPost**
> InlineResponse200 companiesPost(body)

Create a company

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.CompaniesApi;

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

CompaniesApi apiInstance = new CompaniesApi();
Body body = new Body(); // Body | Company create data.
try {
    InlineResponse200 result = apiInstance.companiesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompaniesApi#companiesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)| Company create data. |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[api-key](../README.md#api-key), [partner-key](../README.md#partner-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

