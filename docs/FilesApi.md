# FilesApi

All URIs are relative to *https://bws.baokim.vn/cdn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filesUpload**](FilesApi.md#filesUpload) | **POST** /files/upload | Upload files to public/protected folder

<a name="filesUpload"></a>
# **filesUpload**
> InlineResponse200 filesUpload(folder, accessMode, files)

Upload files to public/protected folder

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FilesApi;


FilesApi apiInstance = new FilesApi();
String folder = "folder_example"; // String | 
String accessMode = "accessMode_example"; // String | 
File files = new File("/path/to/file"); // File | 
try {
    InlineResponse200 result = apiInstance.filesUpload(folder, accessMode, files);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#filesUpload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folder** | **String**|  | [optional]
 **accessMode** | **String**|  | [optional]
 **files** | [**File**](.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

