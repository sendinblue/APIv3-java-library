/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  |   | 406  | Error. Not Acceptable  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibApi;

import okhttp3.Call;
import sendinblue.ApiCallback;
import sendinblue.ApiClient;
import sendinblue.ApiException;
import sendinblue.ApiResponse;
import sendinblue.Configuration;
import sendinblue.Pair;
import sendinblue.ProgressRequestBody;
import sendinblue.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import sibModel.ErrorModel;
import java.io.File;
import sibModel.FileData;
import sibModel.FileDownloadableLink;
import sibModel.FileList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilesApi {
    private ApiClient apiClient;

    public FilesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FilesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for crmFilesGet
     * @param entity Filter by file entity type (optional)
     * @param entityIds Filter by file entity IDs (optional)
     * @param dateFrom dateFrom to date range filter type (timestamp in milliseconds) (optional)
     * @param dateTo dateTo to date range filter type (timestamp in milliseconds) (optional)
     * @param offset Index of the first document of the page (optional)
     * @param limit Number of documents per page (optional, default to 50)
     * @param sort Sort the results in the ascending/descending order. Default order is **descending** by creation if &#x60;sort&#x60; is not passed (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call crmFilesGetCall(String entity, String entityIds, Integer dateFrom, Integer dateTo, Long offset, Long limit, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crm/files";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (entity != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("entity", entity));
        if (entityIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("entityIds", entityIds));
        if (dateFrom != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dateFrom", dateFrom));
        if (dateTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dateTo", dateTo));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort", sort));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api-key", "partner-key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call crmFilesGetValidateBeforeCall(String entity, String entityIds, Integer dateFrom, Integer dateTo, Long offset, Long limit, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        Call call = crmFilesGetCall(entity, entityIds, dateFrom, dateTo, offset, limit, sort, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all files
     * 
     * @param entity Filter by file entity type (optional)
     * @param entityIds Filter by file entity IDs (optional)
     * @param dateFrom dateFrom to date range filter type (timestamp in milliseconds) (optional)
     * @param dateTo dateTo to date range filter type (timestamp in milliseconds) (optional)
     * @param offset Index of the first document of the page (optional)
     * @param limit Number of documents per page (optional, default to 50)
     * @param sort Sort the results in the ascending/descending order. Default order is **descending** by creation if &#x60;sort&#x60; is not passed (optional)
     * @return FileList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FileList crmFilesGet(String entity, String entityIds, Integer dateFrom, Integer dateTo, Long offset, Long limit, String sort) throws ApiException {
        ApiResponse<FileList> resp = crmFilesGetWithHttpInfo(entity, entityIds, dateFrom, dateTo, offset, limit, sort);
        return resp.getData();
    }

    /**
     * Get all files
     * 
     * @param entity Filter by file entity type (optional)
     * @param entityIds Filter by file entity IDs (optional)
     * @param dateFrom dateFrom to date range filter type (timestamp in milliseconds) (optional)
     * @param dateTo dateTo to date range filter type (timestamp in milliseconds) (optional)
     * @param offset Index of the first document of the page (optional)
     * @param limit Number of documents per page (optional, default to 50)
     * @param sort Sort the results in the ascending/descending order. Default order is **descending** by creation if &#x60;sort&#x60; is not passed (optional)
     * @return ApiResponse&lt;FileList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FileList> crmFilesGetWithHttpInfo(String entity, String entityIds, Integer dateFrom, Integer dateTo, Long offset, Long limit, String sort) throws ApiException {
        Call call = crmFilesGetValidateBeforeCall(entity, entityIds, dateFrom, dateTo, offset, limit, sort, null, null);
        Type localVarReturnType = new TypeToken<FileList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all files (asynchronously)
     * 
     * @param entity Filter by file entity type (optional)
     * @param entityIds Filter by file entity IDs (optional)
     * @param dateFrom dateFrom to date range filter type (timestamp in milliseconds) (optional)
     * @param dateTo dateTo to date range filter type (timestamp in milliseconds) (optional)
     * @param offset Index of the first document of the page (optional)
     * @param limit Number of documents per page (optional, default to 50)
     * @param sort Sort the results in the ascending/descending order. Default order is **descending** by creation if &#x60;sort&#x60; is not passed (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call crmFilesGetAsync(String entity, String entityIds, Integer dateFrom, Integer dateTo, Long offset, Long limit, String sort, final ApiCallback<FileList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = crmFilesGetValidateBeforeCall(entity, entityIds, dateFrom, dateTo, offset, limit, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for crmFilesIdDataGet
     * @param id File id to get file data. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call crmFilesIdDataGetCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crm/files/{id}/data"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api-key", "partner-key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call crmFilesIdDataGetValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling crmFilesIdDataGet(Async)");
        }
        

        Call call = crmFilesIdDataGetCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get file details
     * 
     * @param id File id to get file data. (required)
     * @return FileData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FileData crmFilesIdDataGet(String id) throws ApiException {
        ApiResponse<FileData> resp = crmFilesIdDataGetWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get file details
     * 
     * @param id File id to get file data. (required)
     * @return ApiResponse&lt;FileData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FileData> crmFilesIdDataGetWithHttpInfo(String id) throws ApiException {
        Call call = crmFilesIdDataGetValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<FileData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get file details (asynchronously)
     * 
     * @param id File id to get file data. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call crmFilesIdDataGetAsync(String id, final ApiCallback<FileData> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = crmFilesIdDataGetValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for crmFilesIdDelete
     * @param id File id to delete. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call crmFilesIdDeleteCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crm/files/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api-key", "partner-key" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call crmFilesIdDeleteValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling crmFilesIdDelete(Async)");
        }
        

        Call call = crmFilesIdDeleteCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a file
     * 
     * @param id File id to delete. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void crmFilesIdDelete(String id) throws ApiException {
        crmFilesIdDeleteWithHttpInfo(id);
    }

    /**
     * Delete a file
     * 
     * @param id File id to delete. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> crmFilesIdDeleteWithHttpInfo(String id) throws ApiException {
        Call call = crmFilesIdDeleteValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a file (asynchronously)
     * 
     * @param id File id to delete. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call crmFilesIdDeleteAsync(String id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = crmFilesIdDeleteValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for crmFilesIdGet
     * @param id File id to download. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call crmFilesIdGetCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crm/files/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api-key", "partner-key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call crmFilesIdGetValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling crmFilesIdGet(Async)");
        }
        

        Call call = crmFilesIdGetCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Download a file
     * 
     * @param id File id to download. (required)
     * @return FileDownloadableLink
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FileDownloadableLink crmFilesIdGet(String id) throws ApiException {
        ApiResponse<FileDownloadableLink> resp = crmFilesIdGetWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Download a file
     * 
     * @param id File id to download. (required)
     * @return ApiResponse&lt;FileDownloadableLink&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FileDownloadableLink> crmFilesIdGetWithHttpInfo(String id) throws ApiException {
        Call call = crmFilesIdGetValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<FileDownloadableLink>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Download a file (asynchronously)
     * 
     * @param id File id to download. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call crmFilesIdGetAsync(String id, final ApiCallback<FileDownloadableLink> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = crmFilesIdGetValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileDownloadableLink>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for crmFilesPost
     * @param file File data to create a file. (required)
     * @param dealId Deal id linked to a file (optional)
     * @param contactId Contact id linked to a file (optional)
     * @param companyId Company id linked to a file (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call crmFilesPostCall(File file, String dealId, Long contactId, String companyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crm/files";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null)
        localVarFormParams.put("file", file);
        if (dealId != null)
        localVarFormParams.put("dealId", dealId);
        if (contactId != null)
        localVarFormParams.put("contactId", contactId);
        if (companyId != null)
        localVarFormParams.put("companyId", companyId);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api-key", "partner-key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call crmFilesPostValidateBeforeCall(File file, String dealId, Long contactId, String companyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling crmFilesPost(Async)");
        }
        

        Call call = crmFilesPostCall(file, dealId, contactId, companyId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Upload a file
     * 
     * @param file File data to create a file. (required)
     * @param dealId Deal id linked to a file (optional)
     * @param contactId Contact id linked to a file (optional)
     * @param companyId Company id linked to a file (optional)
     * @return FileData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FileData crmFilesPost(File file, String dealId, Long contactId, String companyId) throws ApiException {
        ApiResponse<FileData> resp = crmFilesPostWithHttpInfo(file, dealId, contactId, companyId);
        return resp.getData();
    }

    /**
     * Upload a file
     * 
     * @param file File data to create a file. (required)
     * @param dealId Deal id linked to a file (optional)
     * @param contactId Contact id linked to a file (optional)
     * @param companyId Company id linked to a file (optional)
     * @return ApiResponse&lt;FileData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FileData> crmFilesPostWithHttpInfo(File file, String dealId, Long contactId, String companyId) throws ApiException {
        Call call = crmFilesPostValidateBeforeCall(file, dealId, contactId, companyId, null, null);
        Type localVarReturnType = new TypeToken<FileData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upload a file (asynchronously)
     * 
     * @param file File data to create a file. (required)
     * @param dealId Deal id linked to a file (optional)
     * @param contactId Contact id linked to a file (optional)
     * @param companyId Company id linked to a file (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call crmFilesPostAsync(File file, String dealId, Long contactId, String companyId, final ApiCallback<FileData> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = crmFilesPostValidateBeforeCall(file, dealId, contactId, companyId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}