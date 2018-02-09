# AttributesApi

All URIs are relative to *https://api.sendinblue.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAttribute**](AttributesApi.md#createAttribute) | **POST** /contacts/attributes/{attributeCategory}/{attributeName} | Creates contact attribute
[**deleteAttribute**](AttributesApi.md#deleteAttribute) | **DELETE** /contacts/attributes/{attributeCategory}/{attributeName} | Deletes an attribute
[**getAttributes**](AttributesApi.md#getAttributes) | **GET** /contacts/attributes | Lists all attributes
[**updateAttribute**](AttributesApi.md#updateAttribute) | **PUT** /contacts/attributes/{attributeCategory}/{attributeName} | Updates contact attribute


<a name="createAttribute"></a>
# **createAttribute**
> createAttribute(attributeCategory, attributeName, createAttribute)

Creates contact attribute

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.AttributesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

AttributesApi apiInstance = new AttributesApi();
String attributeCategory = "attributeCategory_example"; // String | Category of the attribute
String attributeName = "attributeName_example"; // String | Name of the attribute
CreateAttribute createAttribute = new CreateAttribute(); // CreateAttribute | Values to create an attribute
try {
    apiInstance.createAttribute(attributeCategory, attributeName, createAttribute);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributesApi#createAttribute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeCategory** | **String**| Category of the attribute | [enum: normal, transactional, category, calculated, global]
 **attributeName** | **String**| Name of the attribute |
 **createAttribute** | [**CreateAttribute**](CreateAttribute.md)| Values to create an attribute |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAttribute"></a>
# **deleteAttribute**
> deleteAttribute(attributeCategory, attributeName)

Deletes an attribute

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.AttributesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

AttributesApi apiInstance = new AttributesApi();
String attributeCategory = "attributeCategory_example"; // String | Category of the attribute
String attributeName = "attributeName_example"; // String | Name of the existing attribute
try {
    apiInstance.deleteAttribute(attributeCategory, attributeName);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributesApi#deleteAttribute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeCategory** | **String**| Category of the attribute | [enum: normal, transactional, category, calculated, global]
 **attributeName** | **String**| Name of the existing attribute |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAttributes"></a>
# **getAttributes**
> GetAttributes getAttributes()

Lists all attributes

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.AttributesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

AttributesApi apiInstance = new AttributesApi();
try {
    GetAttributes result = apiInstance.getAttributes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributesApi#getAttributes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAttributes**](GetAttributes.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAttribute"></a>
# **updateAttribute**
> updateAttribute(attributeCategory, attributeName, updateAttribute)

Updates contact attribute

### Example
```java
// Import classes:
//import sendinblue.ApiClient;
//import sendinblue.ApiException;
//import sendinblue.Configuration;
//import sendinblue.auth.*;
//import sibApi.AttributesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api-key
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

AttributesApi apiInstance = new AttributesApi();
String attributeCategory = "attributeCategory_example"; // String | Category of the attribute
String attributeName = "attributeName_example"; // String | Name of the existing attribute
UpdateAttribute updateAttribute = new UpdateAttribute(); // UpdateAttribute | Values to update an attribute
try {
    apiInstance.updateAttribute(attributeCategory, attributeName, updateAttribute);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributesApi#updateAttribute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeCategory** | **String**| Category of the attribute | [enum: category, calculated, global]
 **attributeName** | **String**| Name of the existing attribute |
 **updateAttribute** | [**UpdateAttribute**](UpdateAttribute.md)| Values to update an attribute |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

