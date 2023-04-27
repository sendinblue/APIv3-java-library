# SendinBlue's API v3 Java Library

SendinBlue's API exposes the entire SendinBlue features via a standardized programmatic interface. Please refer to the full [documentation](https://developers.sendinblue.com) to learn more.

This is the wrapper for the API. It implements all the features of the API v3.

SendinBlue's API matches the [OpenAPI v2 definition](https://www.openapis.org/). The specification can be downloaded [here](https://api.sendinblue.com/v3/swagger_definition.yml).

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.sendinblue</groupId>
  <artifactId>sib-api-v3-sdk</artifactId>
  <version>7.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sendinblue:sib-api-v3-sdk:7.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/sib-api-v3-sdk-7.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import sendinblue.*;
import sendinblue.auth.*;
import sibModel.*;
import sibApi.AccountApi;

import java.io.File;
import java.util.*;

public class AccountApiExample {

    public static void main(String[] args) {
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

        AccountApi apiInstance = new AccountApi();
        try {
            GetAccount result = apiInstance.getAccount();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#getAccount");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.sendinblue.com/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**getAccount**](docs/AccountApi.md#getAccount) | **GET** /account | Get your account information, plan and credits details
*CompaniesApi* | [**companiesAttributesGet**](docs/CompaniesApi.md#companiesAttributesGet) | **GET** /companies/attributes | Get company attributes
*CompaniesApi* | [**companiesGet**](docs/CompaniesApi.md#companiesGet) | **GET** /companies | Get all companies
*CompaniesApi* | [**companiesIdDelete**](docs/CompaniesApi.md#companiesIdDelete) | **DELETE** /companies/{id} | Delete a company
*CompaniesApi* | [**companiesIdGet**](docs/CompaniesApi.md#companiesIdGet) | **GET** /companies/{id} | Get a company
*CompaniesApi* | [**companiesIdPatch**](docs/CompaniesApi.md#companiesIdPatch) | **PATCH** /companies/{id} | Update a company
*CompaniesApi* | [**companiesLinkUnlinkIdPatch**](docs/CompaniesApi.md#companiesLinkUnlinkIdPatch) | **PATCH** /companies/link-unlink/{id} | Link and Unlink company with contacts and deals
*CompaniesApi* | [**companiesPost**](docs/CompaniesApi.md#companiesPost) | **POST** /companies | Create a company
*ContactsApi* | [**addContactToList**](docs/ContactsApi.md#addContactToList) | **POST** /contacts/lists/{listId}/contacts/add | Add existing contacts to a list
*ContactsApi* | [**createAttribute**](docs/ContactsApi.md#createAttribute) | **POST** /contacts/attributes/{attributeCategory}/{attributeName} | Create contact attribute
*ContactsApi* | [**createContact**](docs/ContactsApi.md#createContact) | **POST** /contacts | Create a contact
*ContactsApi* | [**createDoiContact**](docs/ContactsApi.md#createDoiContact) | **POST** /contacts/doubleOptinConfirmation | Create Contact via DOI (Double-Opt-In) Flow
*ContactsApi* | [**createFolder**](docs/ContactsApi.md#createFolder) | **POST** /contacts/folders | Create a folder
*ContactsApi* | [**createList**](docs/ContactsApi.md#createList) | **POST** /contacts/lists | Create a list
*ContactsApi* | [**deleteAttribute**](docs/ContactsApi.md#deleteAttribute) | **DELETE** /contacts/attributes/{attributeCategory}/{attributeName} | Delete an attribute
*ContactsApi* | [**deleteContact**](docs/ContactsApi.md#deleteContact) | **DELETE** /contacts/{identifier} | Delete a contact
*ContactsApi* | [**deleteFolder**](docs/ContactsApi.md#deleteFolder) | **DELETE** /contacts/folders/{folderId} | Delete a folder (and all its lists)
*ContactsApi* | [**deleteList**](docs/ContactsApi.md#deleteList) | **DELETE** /contacts/lists/{listId} | Delete a list
*ContactsApi* | [**getAttributes**](docs/ContactsApi.md#getAttributes) | **GET** /contacts/attributes | List all attributes
*ContactsApi* | [**getContactInfo**](docs/ContactsApi.md#getContactInfo) | **GET** /contacts/{identifier} | Get a contact&#39;s details
*ContactsApi* | [**getContactStats**](docs/ContactsApi.md#getContactStats) | **GET** /contacts/{identifier}/campaignStats | Get email campaigns&#39; statistics for a contact
*ContactsApi* | [**getContacts**](docs/ContactsApi.md#getContacts) | **GET** /contacts | Get all the contacts
*ContactsApi* | [**getContactsFromList**](docs/ContactsApi.md#getContactsFromList) | **GET** /contacts/lists/{listId}/contacts | Get contacts in a list
*ContactsApi* | [**getFolder**](docs/ContactsApi.md#getFolder) | **GET** /contacts/folders/{folderId} | Returns a folder&#39;s details
*ContactsApi* | [**getFolderLists**](docs/ContactsApi.md#getFolderLists) | **GET** /contacts/folders/{folderId}/lists | Get lists in a folder
*ContactsApi* | [**getFolders**](docs/ContactsApi.md#getFolders) | **GET** /contacts/folders | Get all folders
*ContactsApi* | [**getList**](docs/ContactsApi.md#getList) | **GET** /contacts/lists/{listId} | Get a list&#39;s details
*ContactsApi* | [**getLists**](docs/ContactsApi.md#getLists) | **GET** /contacts/lists | Get all the lists
*ContactsApi* | [**importContacts**](docs/ContactsApi.md#importContacts) | **POST** /contacts/import | Import contacts
*ContactsApi* | [**removeContactFromList**](docs/ContactsApi.md#removeContactFromList) | **POST** /contacts/lists/{listId}/contacts/remove | Delete a contact from a list
*ContactsApi* | [**requestContactExport**](docs/ContactsApi.md#requestContactExport) | **POST** /contacts/export | Export contacts
*ContactsApi* | [**updateAttribute**](docs/ContactsApi.md#updateAttribute) | **PUT** /contacts/attributes/{attributeCategory}/{attributeName} | Update contact attribute
*ContactsApi* | [**updateBatchContacts**](docs/ContactsApi.md#updateBatchContacts) | **POST** /contacts/batch | Update multiple contacts
*ContactsApi* | [**updateContact**](docs/ContactsApi.md#updateContact) | **PUT** /contacts/{identifier} | Update a contact
*ContactsApi* | [**updateFolder**](docs/ContactsApi.md#updateFolder) | **PUT** /contacts/folders/{folderId} | Update a folder
*ContactsApi* | [**updateList**](docs/ContactsApi.md#updateList) | **PUT** /contacts/lists/{listId} | Update a list
*ConversationsApi* | [**conversationsAgentOnlinePingPost**](docs/ConversationsApi.md#conversationsAgentOnlinePingPost) | **POST** /conversations/agentOnlinePing | Sets agent’s status to online for 2-3 minutes
*ConversationsApi* | [**conversationsMessagesIdDelete**](docs/ConversationsApi.md#conversationsMessagesIdDelete) | **DELETE** /conversations/messages/{id} | Delete a message sent by an agent
*ConversationsApi* | [**conversationsMessagesIdGet**](docs/ConversationsApi.md#conversationsMessagesIdGet) | **GET** /conversations/messages/{id} | Get a message
*ConversationsApi* | [**conversationsMessagesIdPut**](docs/ConversationsApi.md#conversationsMessagesIdPut) | **PUT** /conversations/messages/{id} | Update a message sent by an agent
*ConversationsApi* | [**conversationsMessagesPost**](docs/ConversationsApi.md#conversationsMessagesPost) | **POST** /conversations/messages | Send a message as an agent
*ConversationsApi* | [**conversationsPushedMessagesIdDelete**](docs/ConversationsApi.md#conversationsPushedMessagesIdDelete) | **DELETE** /conversations/pushedMessages/{id} | Delete an automated message
*ConversationsApi* | [**conversationsPushedMessagesIdGet**](docs/ConversationsApi.md#conversationsPushedMessagesIdGet) | **GET** /conversations/pushedMessages/{id} | Get an automated message
*ConversationsApi* | [**conversationsPushedMessagesIdPut**](docs/ConversationsApi.md#conversationsPushedMessagesIdPut) | **PUT** /conversations/pushedMessages/{id} | Update an automated message
*ConversationsApi* | [**conversationsPushedMessagesPost**](docs/ConversationsApi.md#conversationsPushedMessagesPost) | **POST** /conversations/pushedMessages | Send an automated message to a visitor
*DealsApi* | [**crmAttributesDealsGet**](docs/DealsApi.md#crmAttributesDealsGet) | **GET** /crm/attributes/deals | Get deal attributes
*DealsApi* | [**crmDealsGet**](docs/DealsApi.md#crmDealsGet) | **GET** /crm/deals | Get all deals
*DealsApi* | [**crmDealsIdDelete**](docs/DealsApi.md#crmDealsIdDelete) | **DELETE** /crm/deals/{id} | Delete a deal
*DealsApi* | [**crmDealsIdGet**](docs/DealsApi.md#crmDealsIdGet) | **GET** /crm/deals/{id} | Get a deal
*DealsApi* | [**crmDealsIdPatch**](docs/DealsApi.md#crmDealsIdPatch) | **PATCH** /crm/deals/{id} | Update a deal
*DealsApi* | [**crmDealsLinkUnlinkIdPatch**](docs/DealsApi.md#crmDealsLinkUnlinkIdPatch) | **PATCH** /crm/deals/link-unlink/{id} | Link and Unlink a deal with contacts and companies
*DealsApi* | [**crmDealsPost**](docs/DealsApi.md#crmDealsPost) | **POST** /crm/deals | Create a deal
*DealsApi* | [**crmPipelineDetailsGet**](docs/DealsApi.md#crmPipelineDetailsGet) | **GET** /crm/pipeline/details | Get pipeline stages
*EcommerceApi* | [**createBatchOrder**](docs/EcommerceApi.md#createBatchOrder) | **POST** /orders/status/batch | Create orders in batch
*EcommerceApi* | [**createOrder**](docs/EcommerceApi.md#createOrder) | **POST** /orders/status | Managing the status of the order
*EcommerceApi* | [**createUpdateBatchCategory**](docs/EcommerceApi.md#createUpdateBatchCategory) | **POST** /categories/batch | Create categories in batch
*EcommerceApi* | [**createUpdateBatchProducts**](docs/EcommerceApi.md#createUpdateBatchProducts) | **POST** /products/batch | Create products in batch
*EcommerceApi* | [**createUpdateCategory**](docs/EcommerceApi.md#createUpdateCategory) | **POST** /categories | Create/Update a category
*EcommerceApi* | [**createUpdateProduct**](docs/EcommerceApi.md#createUpdateProduct) | **POST** /products | Create/Update a product
*EcommerceApi* | [**ecommerceActivatePost**](docs/EcommerceApi.md#ecommerceActivatePost) | **POST** /ecommerce/activate | Activate the eCommerce app
*EcommerceApi* | [**getCategories**](docs/EcommerceApi.md#getCategories) | **GET** /categories | Return all your categories
*EcommerceApi* | [**getCategoryInfo**](docs/EcommerceApi.md#getCategoryInfo) | **GET** /categories/{id} | Get a category details
*EcommerceApi* | [**getProductInfo**](docs/EcommerceApi.md#getProductInfo) | **GET** /products/{id} | Get a product&#39;s details
*EcommerceApi* | [**getProducts**](docs/EcommerceApi.md#getProducts) | **GET** /products | Return all your products
*EmailCampaignsApi* | [**createEmailCampaign**](docs/EmailCampaignsApi.md#createEmailCampaign) | **POST** /emailCampaigns | Create an email campaign
*EmailCampaignsApi* | [**deleteEmailCampaign**](docs/EmailCampaignsApi.md#deleteEmailCampaign) | **DELETE** /emailCampaigns/{campaignId} | Delete an email campaign
*EmailCampaignsApi* | [**emailExportRecipients**](docs/EmailCampaignsApi.md#emailExportRecipients) | **POST** /emailCampaigns/{campaignId}/exportRecipients | Export the recipients of an email campaign
*EmailCampaignsApi* | [**getAbTestCampaignResult**](docs/EmailCampaignsApi.md#getAbTestCampaignResult) | **GET** /emailCampaigns/{campaignId}/abTestCampaignResult | Get an A/B test email campaign results
*EmailCampaignsApi* | [**getEmailCampaign**](docs/EmailCampaignsApi.md#getEmailCampaign) | **GET** /emailCampaigns/{campaignId} | Get an email campaign report
*EmailCampaignsApi* | [**getEmailCampaigns**](docs/EmailCampaignsApi.md#getEmailCampaigns) | **GET** /emailCampaigns | Return all your created email campaigns
*EmailCampaignsApi* | [**getSharedTemplateUrl**](docs/EmailCampaignsApi.md#getSharedTemplateUrl) | **GET** /emailCampaigns/{campaignId}/sharedUrl | Get a shared template url
*EmailCampaignsApi* | [**sendEmailCampaignNow**](docs/EmailCampaignsApi.md#sendEmailCampaignNow) | **POST** /emailCampaigns/{campaignId}/sendNow | Send an email campaign immediately, based on campaignId
*EmailCampaignsApi* | [**sendReport**](docs/EmailCampaignsApi.md#sendReport) | **POST** /emailCampaigns/{campaignId}/sendReport | Send the report of a campaign
*EmailCampaignsApi* | [**sendTestEmail**](docs/EmailCampaignsApi.md#sendTestEmail) | **POST** /emailCampaigns/{campaignId}/sendTest | Send an email campaign to your test list
*EmailCampaignsApi* | [**updateCampaignStatus**](docs/EmailCampaignsApi.md#updateCampaignStatus) | **PUT** /emailCampaigns/{campaignId}/status | Update an email campaign status
*EmailCampaignsApi* | [**updateEmailCampaign**](docs/EmailCampaignsApi.md#updateEmailCampaign) | **PUT** /emailCampaigns/{campaignId} | Update an email campaign
*EmailCampaignsApi* | [**uploadImageToGallery**](docs/EmailCampaignsApi.md#uploadImageToGallery) | **POST** /emailCampaigns/images | Upload an image to your account&#39;s image gallery
*FilesApi* | [**crmFilesGet**](docs/FilesApi.md#crmFilesGet) | **GET** /crm/files | Get all files
*FilesApi* | [**crmFilesIdDataGet**](docs/FilesApi.md#crmFilesIdDataGet) | **GET** /crm/files/{id}/data | Get file details
*FilesApi* | [**crmFilesIdDelete**](docs/FilesApi.md#crmFilesIdDelete) | **DELETE** /crm/files/{id} | Delete a file
*FilesApi* | [**crmFilesIdGet**](docs/FilesApi.md#crmFilesIdGet) | **GET** /crm/files/{id} | Download a file
*FilesApi* | [**crmFilesPost**](docs/FilesApi.md#crmFilesPost) | **POST** /crm/files | Upload a file
*InboundParsingApi* | [**getInboundEmailAttachment**](docs/InboundParsingApi.md#getInboundEmailAttachment) | **GET** /inbound/attachments/{downloadToken} | Retrieve inbound attachment with download token.
*InboundParsingApi* | [**getInboundEmailEvents**](docs/InboundParsingApi.md#getInboundEmailEvents) | **GET** /inbound/events | Get the list of all the events for the received emails.
*InboundParsingApi* | [**getInboundEmailEventsByUuid**](docs/InboundParsingApi.md#getInboundEmailEventsByUuid) | **GET** /inbound/events/{uuid} | Fetch all events history for one particular received email.
*MasterAccountApi* | [**corporateMasterAccountGet**](docs/MasterAccountApi.md#corporateMasterAccountGet) | **GET** /corporate/masterAccount | Get the details of requested master account
*MasterAccountApi* | [**corporateSubAccountGet**](docs/MasterAccountApi.md#corporateSubAccountGet) | **GET** /corporate/subAccount | Get the list of all the sub-accounts of the master account.
*MasterAccountApi* | [**corporateSubAccountIdDelete**](docs/MasterAccountApi.md#corporateSubAccountIdDelete) | **DELETE** /corporate/subAccount/{id} | Delete a sub-account
*MasterAccountApi* | [**corporateSubAccountIdGet**](docs/MasterAccountApi.md#corporateSubAccountIdGet) | **GET** /corporate/subAccount/{id} | Get sub-account details
*MasterAccountApi* | [**corporateSubAccountIdPlanPut**](docs/MasterAccountApi.md#corporateSubAccountIdPlanPut) | **PUT** /corporate/subAccount/{id}/plan | Update sub-account plan
*MasterAccountApi* | [**corporateSubAccountKeyPost**](docs/MasterAccountApi.md#corporateSubAccountKeyPost) | **POST** /corporate/subAccount/key | Create an API key for a sub-account
*MasterAccountApi* | [**corporateSubAccountPost**](docs/MasterAccountApi.md#corporateSubAccountPost) | **POST** /corporate/subAccount | Create a new sub-account under a master account.
*MasterAccountApi* | [**corporateSubAccountSsoTokenPost**](docs/MasterAccountApi.md#corporateSubAccountSsoTokenPost) | **POST** /corporate/subAccount/ssoToken | Generate SSO token to access Sendinblue
*NotesApi* | [**crmNotesGet**](docs/NotesApi.md#crmNotesGet) | **GET** /crm/notes | Get all notes
*NotesApi* | [**crmNotesIdDelete**](docs/NotesApi.md#crmNotesIdDelete) | **DELETE** /crm/notes/{id} | Delete a note
*NotesApi* | [**crmNotesIdGet**](docs/NotesApi.md#crmNotesIdGet) | **GET** /crm/notes/{id} | Get a note
*NotesApi* | [**crmNotesIdPatch**](docs/NotesApi.md#crmNotesIdPatch) | **PATCH** /crm/notes/{id} | Update a note
*NotesApi* | [**crmNotesPost**](docs/NotesApi.md#crmNotesPost) | **POST** /crm/notes | Create a note
*ProcessApi* | [**getProcess**](docs/ProcessApi.md#getProcess) | **GET** /processes/{processId} | Return the informations for a process
*ProcessApi* | [**getProcesses**](docs/ProcessApi.md#getProcesses) | **GET** /processes | Return all the processes for your account
*ResellerApi* | [**addCredits**](docs/ResellerApi.md#addCredits) | **POST** /reseller/children/{childIdentifier}/credits/add | Add Email and/or SMS credits to a specific child account
*ResellerApi* | [**associateIpToChild**](docs/ResellerApi.md#associateIpToChild) | **POST** /reseller/children/{childIdentifier}/ips/associate | Associate a dedicated IP to the child
*ResellerApi* | [**createChildDomain**](docs/ResellerApi.md#createChildDomain) | **POST** /reseller/children/{childIdentifier}/domains | Create a domain for a child account
*ResellerApi* | [**createResellerChild**](docs/ResellerApi.md#createResellerChild) | **POST** /reseller/children | Creates a reseller child
*ResellerApi* | [**deleteChildDomain**](docs/ResellerApi.md#deleteChildDomain) | **DELETE** /reseller/children/{childIdentifier}/domains/{domainName} | Delete the sender domain of the reseller child based on the childIdentifier and domainName passed
*ResellerApi* | [**deleteResellerChild**](docs/ResellerApi.md#deleteResellerChild) | **DELETE** /reseller/children/{childIdentifier} | Delete a single reseller child based on the child identifier supplied
*ResellerApi* | [**dissociateIpFromChild**](docs/ResellerApi.md#dissociateIpFromChild) | **POST** /reseller/children/{childIdentifier}/ips/dissociate | Dissociate a dedicated IP to the child
*ResellerApi* | [**getChildAccountCreationStatus**](docs/ResellerApi.md#getChildAccountCreationStatus) | **GET** /reseller/children/{childIdentifier}/accountCreationStatus | Get the status of a reseller&#39;s child account creation, whether it is successfully created (exists) or not based on the identifier supplied
*ResellerApi* | [**getChildDomains**](docs/ResellerApi.md#getChildDomains) | **GET** /reseller/children/{childIdentifier}/domains | Get all sender domains for a specific child account
*ResellerApi* | [**getChildInfo**](docs/ResellerApi.md#getChildInfo) | **GET** /reseller/children/{childIdentifier} | Get a child account&#39;s details
*ResellerApi* | [**getResellerChilds**](docs/ResellerApi.md#getResellerChilds) | **GET** /reseller/children | Get the list of all children accounts
*ResellerApi* | [**getSsoToken**](docs/ResellerApi.md#getSsoToken) | **GET** /reseller/children/{childIdentifier}/auth | Get session token to access Sendinblue (SSO)
*ResellerApi* | [**removeCredits**](docs/ResellerApi.md#removeCredits) | **POST** /reseller/children/{childIdentifier}/credits/remove | Remove Email and/or SMS credits from a specific child account
*ResellerApi* | [**updateChildAccountStatus**](docs/ResellerApi.md#updateChildAccountStatus) | **PUT** /reseller/children/{childIdentifier}/accountStatus | Update info of reseller&#39;s child account status based on the childIdentifier supplied
*ResellerApi* | [**updateChildDomain**](docs/ResellerApi.md#updateChildDomain) | **PUT** /reseller/children/{childIdentifier}/domains/{domainName} | Update the sender domain of reseller&#39;s child based on the childIdentifier and domainName passed
*ResellerApi* | [**updateResellerChild**](docs/ResellerApi.md#updateResellerChild) | **PUT** /reseller/children/{childIdentifier} | Update info of reseller&#39;s child based on the child identifier supplied
*SendersApi* | [**createSender**](docs/SendersApi.md#createSender) | **POST** /senders | Create a new sender
*SendersApi* | [**deleteSender**](docs/SendersApi.md#deleteSender) | **DELETE** /senders/{senderId} | Delete a sender
*SendersApi* | [**getIps**](docs/SendersApi.md#getIps) | **GET** /senders/ips | Get all the dedicated IPs for your account
*SendersApi* | [**getIpsFromSender**](docs/SendersApi.md#getIpsFromSender) | **GET** /senders/{senderId}/ips | Get all the dedicated IPs for a sender
*SendersApi* | [**getSenders**](docs/SendersApi.md#getSenders) | **GET** /senders | Get the list of all your senders
*SendersApi* | [**updateSender**](docs/SendersApi.md#updateSender) | **PUT** /senders/{senderId} | Update a sender
*SmsCampaignsApi* | [**createSmsCampaign**](docs/SmsCampaignsApi.md#createSmsCampaign) | **POST** /smsCampaigns | Creates an SMS campaign
*SmsCampaignsApi* | [**deleteSmsCampaign**](docs/SmsCampaignsApi.md#deleteSmsCampaign) | **DELETE** /smsCampaigns/{campaignId} | Delete an SMS campaign
*SmsCampaignsApi* | [**getSmsCampaign**](docs/SmsCampaignsApi.md#getSmsCampaign) | **GET** /smsCampaigns/{campaignId} | Get an SMS campaign
*SmsCampaignsApi* | [**getSmsCampaigns**](docs/SmsCampaignsApi.md#getSmsCampaigns) | **GET** /smsCampaigns | Returns the information for all your created SMS campaigns
*SmsCampaignsApi* | [**requestSmsRecipientExport**](docs/SmsCampaignsApi.md#requestSmsRecipientExport) | **POST** /smsCampaigns/{campaignId}/exportRecipients | Export an SMS campaign&#39;s recipients
*SmsCampaignsApi* | [**sendSmsCampaignNow**](docs/SmsCampaignsApi.md#sendSmsCampaignNow) | **POST** /smsCampaigns/{campaignId}/sendNow | Send your SMS campaign immediately
*SmsCampaignsApi* | [**sendSmsReport**](docs/SmsCampaignsApi.md#sendSmsReport) | **POST** /smsCampaigns/{campaignId}/sendReport | Send an SMS campaign&#39;s report
*SmsCampaignsApi* | [**sendTestSms**](docs/SmsCampaignsApi.md#sendTestSms) | **POST** /smsCampaigns/{campaignId}/sendTest | Send a test SMS campaign
*SmsCampaignsApi* | [**updateSmsCampaign**](docs/SmsCampaignsApi.md#updateSmsCampaign) | **PUT** /smsCampaigns/{campaignId} | Update an SMS campaign
*SmsCampaignsApi* | [**updateSmsCampaignStatus**](docs/SmsCampaignsApi.md#updateSmsCampaignStatus) | **PUT** /smsCampaigns/{campaignId}/status | Update a campaign&#39;s status
*TasksApi* | [**crmTasksGet**](docs/TasksApi.md#crmTasksGet) | **GET** /crm/tasks | Get all tasks
*TasksApi* | [**crmTasksIdDelete**](docs/TasksApi.md#crmTasksIdDelete) | **DELETE** /crm/tasks/{id} | Delete a task
*TasksApi* | [**crmTasksIdGet**](docs/TasksApi.md#crmTasksIdGet) | **GET** /crm/tasks/{id} | Get a task
*TasksApi* | [**crmTasksIdPatch**](docs/TasksApi.md#crmTasksIdPatch) | **PATCH** /crm/tasks/{id} | Update a task
*TasksApi* | [**crmTasksPost**](docs/TasksApi.md#crmTasksPost) | **POST** /crm/tasks | Create a task
*TasksApi* | [**crmTasktypesGet**](docs/TasksApi.md#crmTasktypesGet) | **GET** /crm/tasktypes | Get all task types
*TransactionalEmailsApi* | [**blockNewDomain**](docs/TransactionalEmailsApi.md#blockNewDomain) | **POST** /smtp/blockedDomains | Add a new domain to the list of blocked domains
*TransactionalEmailsApi* | [**createSmtpTemplate**](docs/TransactionalEmailsApi.md#createSmtpTemplate) | **POST** /smtp/templates | Create an email template
*TransactionalEmailsApi* | [**deleteBlockedDomain**](docs/TransactionalEmailsApi.md#deleteBlockedDomain) | **DELETE** /smtp/blockedDomains/{domain} | Unblock an existing domain from the list of blocked domains
*TransactionalEmailsApi* | [**deleteHardbounces**](docs/TransactionalEmailsApi.md#deleteHardbounces) | **POST** /smtp/deleteHardbounces | Delete hardbounces
*TransactionalEmailsApi* | [**deleteScheduledEmailById**](docs/TransactionalEmailsApi.md#deleteScheduledEmailById) | **DELETE** /smtp/email/{identifier} | Delete scheduled emails by batchId or messageId
*TransactionalEmailsApi* | [**deleteSmtpTemplate**](docs/TransactionalEmailsApi.md#deleteSmtpTemplate) | **DELETE** /smtp/templates/{templateId} | Delete an inactive email template
*TransactionalEmailsApi* | [**getAggregatedSmtpReport**](docs/TransactionalEmailsApi.md#getAggregatedSmtpReport) | **GET** /smtp/statistics/aggregatedReport | Get your transactional email activity aggregated over a period of time
*TransactionalEmailsApi* | [**getBlockedDomains**](docs/TransactionalEmailsApi.md#getBlockedDomains) | **GET** /smtp/blockedDomains | Get the list of blocked domains
*TransactionalEmailsApi* | [**getEmailEventReport**](docs/TransactionalEmailsApi.md#getEmailEventReport) | **GET** /smtp/statistics/events | Get all your transactional email activity (unaggregated events)
*TransactionalEmailsApi* | [**getScheduledEmailByBatchId**](docs/TransactionalEmailsApi.md#getScheduledEmailByBatchId) | **GET** /smtp/emailStatus/{batchId} | Fetch scheduled emails by batchId
*TransactionalEmailsApi* | [**getScheduledEmailByMessageId**](docs/TransactionalEmailsApi.md#getScheduledEmailByMessageId) | **GET** /smtp/emailStatus/{messageId} | Fetch scheduled email by messageId
*TransactionalEmailsApi* | [**getSmtpReport**](docs/TransactionalEmailsApi.md#getSmtpReport) | **GET** /smtp/statistics/reports | Get your transactional email activity aggregated per day
*TransactionalEmailsApi* | [**getSmtpTemplate**](docs/TransactionalEmailsApi.md#getSmtpTemplate) | **GET** /smtp/templates/{templateId} | Returns the template information
*TransactionalEmailsApi* | [**getSmtpTemplates**](docs/TransactionalEmailsApi.md#getSmtpTemplates) | **GET** /smtp/templates | Get the list of email templates
*TransactionalEmailsApi* | [**getTransacBlockedContacts**](docs/TransactionalEmailsApi.md#getTransacBlockedContacts) | **GET** /smtp/blockedContacts | Get the list of blocked or unsubscribed transactional contacts
*TransactionalEmailsApi* | [**getTransacEmailContent**](docs/TransactionalEmailsApi.md#getTransacEmailContent) | **GET** /smtp/emails/{uuid} | Get the personalized content of a sent transactional email
*TransactionalEmailsApi* | [**getTransacEmailsList**](docs/TransactionalEmailsApi.md#getTransacEmailsList) | **GET** /smtp/emails | Get the list of transactional emails on the basis of allowed filters
*TransactionalEmailsApi* | [**sendTestTemplate**](docs/TransactionalEmailsApi.md#sendTestTemplate) | **POST** /smtp/templates/{templateId}/sendTest | Send a template to your test list
*TransactionalEmailsApi* | [**sendTransacEmail**](docs/TransactionalEmailsApi.md#sendTransacEmail) | **POST** /smtp/email | Send a transactional email
*TransactionalEmailsApi* | [**smtpBlockedContactsEmailDelete**](docs/TransactionalEmailsApi.md#smtpBlockedContactsEmailDelete) | **DELETE** /smtp/blockedContacts/{email} | Unblock or resubscribe a transactional contact
*TransactionalEmailsApi* | [**smtpLogMessageIdDelete**](docs/TransactionalEmailsApi.md#smtpLogMessageIdDelete) | **DELETE** /smtp/log/{messageId} | Delete an SMTP transactional log
*TransactionalEmailsApi* | [**updateSmtpTemplate**](docs/TransactionalEmailsApi.md#updateSmtpTemplate) | **PUT** /smtp/templates/{templateId} | Update an email template
*TransactionalSmsApi* | [**getSmsEvents**](docs/TransactionalSmsApi.md#getSmsEvents) | **GET** /transactionalSMS/statistics/events | Get all your SMS activity (unaggregated events)
*TransactionalSmsApi* | [**getTransacAggregatedSmsReport**](docs/TransactionalSmsApi.md#getTransacAggregatedSmsReport) | **GET** /transactionalSMS/statistics/aggregatedReport | Get your SMS activity aggregated over a period of time
*TransactionalSmsApi* | [**getTransacSmsReport**](docs/TransactionalSmsApi.md#getTransacSmsReport) | **GET** /transactionalSMS/statistics/reports | Get your SMS activity aggregated per day
*TransactionalSmsApi* | [**sendTransacSms**](docs/TransactionalSmsApi.md#sendTransacSms) | **POST** /transactionalSMS/sms | Send SMS message to a mobile number
*WebhooksApi* | [**createWebhook**](docs/WebhooksApi.md#createWebhook) | **POST** /webhooks | Create a webhook
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deleteWebhook) | **DELETE** /webhooks/{webhookId} | Delete a webhook
*WebhooksApi* | [**getWebhook**](docs/WebhooksApi.md#getWebhook) | **GET** /webhooks/{webhookId} | Get a webhook details
*WebhooksApi* | [**getWebhooks**](docs/WebhooksApi.md#getWebhooks) | **GET** /webhooks | Get all webhooks
*WebhooksApi* | [**updateWebhook**](docs/WebhooksApi.md#updateWebhook) | **PUT** /webhooks/{webhookId} | Update a webhook
*WhatsappCampaignsApi* | [**deleteWhatsappCampaign**](docs/WhatsappCampaignsApi.md#deleteWhatsappCampaign) | **DELETE** /whatsappCampaigns/{campaignId} | Delete a whatsapp campaign
*WhatsappCampaignsApi* | [**getWhatsappCampaign**](docs/WhatsappCampaignsApi.md#getWhatsappCampaign) | **GET** /whatsappCampaigns/{campaignId} | Get Whatsapp campaign Overview


## Documentation for Models

 - [AbTestCampaignResult](docs/AbTestCampaignResult.md)
 - [AbTestCampaignResultClickedLinks](docs/AbTestCampaignResultClickedLinks.md)
 - [AbTestCampaignResultStatistics](docs/AbTestCampaignResultStatistics.md)
 - [AbTestVersionClicks](docs/AbTestVersionClicks.md)
 - [AbTestVersionClicksInner](docs/AbTestVersionClicksInner.md)
 - [AbTestVersionStats](docs/AbTestVersionStats.md)
 - [AddChildDomain](docs/AddChildDomain.md)
 - [AddContactToList](docs/AddContactToList.md)
 - [AddCredits](docs/AddCredits.md)
 - [BlockDomain](docs/BlockDomain.md)
 - [Body](docs/Body.md)
 - [Body1](docs/Body1.md)
 - [Body10](docs/Body10.md)
 - [Body11](docs/Body11.md)
 - [Body12](docs/Body12.md)
 - [Body2](docs/Body2.md)
 - [Body3](docs/Body3.md)
 - [Body4](docs/Body4.md)
 - [Body5](docs/Body5.md)
 - [Body6](docs/Body6.md)
 - [Body7](docs/Body7.md)
 - [Body8](docs/Body8.md)
 - [Body9](docs/Body9.md)
 - [BodyVariablesItems](docs/BodyVariablesItems.md)
 - [CompaniesList](docs/CompaniesList.md)
 - [Company](docs/Company.md)
 - [CompanyAttributes](docs/CompanyAttributes.md)
 - [CompanyAttributesInner](docs/CompanyAttributesInner.md)
 - [ComponentItems](docs/ComponentItems.md)
 - [ConversationsMessage](docs/ConversationsMessage.md)
 - [ConversationsMessageFile](docs/ConversationsMessageFile.md)
 - [ConversationsMessageFileImageInfo](docs/ConversationsMessageFileImageInfo.md)
 - [CreateApiKeyRequest](docs/CreateApiKeyRequest.md)
 - [CreateApiKeyResponse](docs/CreateApiKeyResponse.md)
 - [CreateAttribute](docs/CreateAttribute.md)
 - [CreateAttributeEnumeration](docs/CreateAttributeEnumeration.md)
 - [CreateCategoryModel](docs/CreateCategoryModel.md)
 - [CreateChild](docs/CreateChild.md)
 - [CreateContact](docs/CreateContact.md)
 - [CreateDoiContact](docs/CreateDoiContact.md)
 - [CreateEmailCampaign](docs/CreateEmailCampaign.md)
 - [CreateEmailCampaignRecipients](docs/CreateEmailCampaignRecipients.md)
 - [CreateEmailCampaignSender](docs/CreateEmailCampaignSender.md)
 - [CreateList](docs/CreateList.md)
 - [CreateModel](docs/CreateModel.md)
 - [CreateProductModel](docs/CreateProductModel.md)
 - [CreateReseller](docs/CreateReseller.md)
 - [CreateSender](docs/CreateSender.md)
 - [CreateSenderIps](docs/CreateSenderIps.md)
 - [CreateSenderModel](docs/CreateSenderModel.md)
 - [CreateSmsCampaign](docs/CreateSmsCampaign.md)
 - [CreateSmsCampaignRecipients](docs/CreateSmsCampaignRecipients.md)
 - [CreateSmtpEmail](docs/CreateSmtpEmail.md)
 - [CreateSmtpTemplate](docs/CreateSmtpTemplate.md)
 - [CreateSmtpTemplateSender](docs/CreateSmtpTemplateSender.md)
 - [CreateSubAccount](docs/CreateSubAccount.md)
 - [CreateSubAccountResponse](docs/CreateSubAccountResponse.md)
 - [CreateUpdateBatchCategory](docs/CreateUpdateBatchCategory.md)
 - [CreateUpdateBatchCategoryModel](docs/CreateUpdateBatchCategoryModel.md)
 - [CreateUpdateBatchProducts](docs/CreateUpdateBatchProducts.md)
 - [CreateUpdateBatchProductsModel](docs/CreateUpdateBatchProductsModel.md)
 - [CreateUpdateCategories](docs/CreateUpdateCategories.md)
 - [CreateUpdateCategory](docs/CreateUpdateCategory.md)
 - [CreateUpdateContactModel](docs/CreateUpdateContactModel.md)
 - [CreateUpdateFolder](docs/CreateUpdateFolder.md)
 - [CreateUpdateProduct](docs/CreateUpdateProduct.md)
 - [CreateUpdateProducts](docs/CreateUpdateProducts.md)
 - [CreateWebhook](docs/CreateWebhook.md)
 - [CreatedBatchId](docs/CreatedBatchId.md)
 - [CreatedProcessId](docs/CreatedProcessId.md)
 - [Deal](docs/Deal.md)
 - [DealAttributes](docs/DealAttributes.md)
 - [DealAttributesInner](docs/DealAttributesInner.md)
 - [DealsList](docs/DealsList.md)
 - [DeleteHardbounces](docs/DeleteHardbounces.md)
 - [EmailExportRecipients](docs/EmailExportRecipients.md)
 - [ErrorModel](docs/ErrorModel.md)
 - [FileData](docs/FileData.md)
 - [FileDownloadableLink](docs/FileDownloadableLink.md)
 - [FileList](docs/FileList.md)
 - [GetAccountMarketingAutomation](docs/GetAccountMarketingAutomation.md)
 - [GetAccountPlan](docs/GetAccountPlan.md)
 - [GetAccountRelay](docs/GetAccountRelay.md)
 - [GetAccountRelayData](docs/GetAccountRelayData.md)
 - [GetAggregatedReport](docs/GetAggregatedReport.md)
 - [GetAttributes](docs/GetAttributes.md)
 - [GetAttributesAttributes](docs/GetAttributesAttributes.md)
 - [GetAttributesEnumeration](docs/GetAttributesEnumeration.md)
 - [GetBlockedDomains](docs/GetBlockedDomains.md)
 - [GetCampaignOverview](docs/GetCampaignOverview.md)
 - [GetCampaignRecipients](docs/GetCampaignRecipients.md)
 - [GetCampaignStats](docs/GetCampaignStats.md)
 - [GetCategories](docs/GetCategories.md)
 - [GetCategoryDetails](docs/GetCategoryDetails.md)
 - [GetChildAccountCreationStatus](docs/GetChildAccountCreationStatus.md)
 - [GetChildDomain](docs/GetChildDomain.md)
 - [GetChildDomains](docs/GetChildDomains.md)
 - [GetChildInfoApiKeys](docs/GetChildInfoApiKeys.md)
 - [GetChildInfoApiKeysV2](docs/GetChildInfoApiKeysV2.md)
 - [GetChildInfoApiKeysV3](docs/GetChildInfoApiKeysV3.md)
 - [GetChildInfoCredits](docs/GetChildInfoCredits.md)
 - [GetChildInfoStatistics](docs/GetChildInfoStatistics.md)
 - [GetChildrenList](docs/GetChildrenList.md)
 - [GetClient](docs/GetClient.md)
 - [GetContactCampaignStats](docs/GetContactCampaignStats.md)
 - [GetContactCampaignStatsClicked](docs/GetContactCampaignStatsClicked.md)
 - [GetContactCampaignStatsOpened](docs/GetContactCampaignStatsOpened.md)
 - [GetContactCampaignStatsTransacAttributes](docs/GetContactCampaignStatsTransacAttributes.md)
 - [GetContactCampaignStatsUnsubscriptions](docs/GetContactCampaignStatsUnsubscriptions.md)
 - [GetContactDetails](docs/GetContactDetails.md)
 - [GetContacts](docs/GetContacts.md)
 - [GetDeviceBrowserStats](docs/GetDeviceBrowserStats.md)
 - [GetEmailCampaigns](docs/GetEmailCampaigns.md)
 - [GetEmailEventReport](docs/GetEmailEventReport.md)
 - [GetEmailEventReportEvents](docs/GetEmailEventReportEvents.md)
 - [GetExtendedCampaignOverviewSender](docs/GetExtendedCampaignOverviewSender.md)
 - [GetExtendedCampaignStats](docs/GetExtendedCampaignStats.md)
 - [GetExtendedClientAddress](docs/GetExtendedClientAddress.md)
 - [GetExtendedContactDetailsStatistics](docs/GetExtendedContactDetailsStatistics.md)
 - [GetExtendedContactDetailsStatisticsClicked](docs/GetExtendedContactDetailsStatisticsClicked.md)
 - [GetExtendedContactDetailsStatisticsDelivered](docs/GetExtendedContactDetailsStatisticsDelivered.md)
 - [GetExtendedContactDetailsStatisticsLinks](docs/GetExtendedContactDetailsStatisticsLinks.md)
 - [GetExtendedContactDetailsStatisticsMessagesSent](docs/GetExtendedContactDetailsStatisticsMessagesSent.md)
 - [GetExtendedContactDetailsStatisticsOpened](docs/GetExtendedContactDetailsStatisticsOpened.md)
 - [GetExtendedContactDetailsStatisticsUnsubscriptions](docs/GetExtendedContactDetailsStatisticsUnsubscriptions.md)
 - [GetExtendedContactDetailsStatisticsUnsubscriptionsAdminUnsubscription](docs/GetExtendedContactDetailsStatisticsUnsubscriptionsAdminUnsubscription.md)
 - [GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription](docs/GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription.md)
 - [GetExtendedListCampaignStats](docs/GetExtendedListCampaignStats.md)
 - [GetFolder](docs/GetFolder.md)
 - [GetFolderLists](docs/GetFolderLists.md)
 - [GetFolders](docs/GetFolders.md)
 - [GetInboundEmailEvents](docs/GetInboundEmailEvents.md)
 - [GetInboundEmailEventsByUuid](docs/GetInboundEmailEventsByUuid.md)
 - [GetInboundEmailEventsByUuidAttachments](docs/GetInboundEmailEventsByUuidAttachments.md)
 - [GetInboundEmailEventsByUuidLogs](docs/GetInboundEmailEventsByUuidLogs.md)
 - [GetInboundEmailEventsEvents](docs/GetInboundEmailEventsEvents.md)
 - [GetIp](docs/GetIp.md)
 - [GetIpFromSender](docs/GetIpFromSender.md)
 - [GetIps](docs/GetIps.md)
 - [GetIpsFromSender](docs/GetIpsFromSender.md)
 - [GetList](docs/GetList.md)
 - [GetLists](docs/GetLists.md)
 - [GetProcess](docs/GetProcess.md)
 - [GetProcesses](docs/GetProcesses.md)
 - [GetProductDetails](docs/GetProductDetails.md)
 - [GetProducts](docs/GetProducts.md)
 - [GetReports](docs/GetReports.md)
 - [GetReportsReports](docs/GetReportsReports.md)
 - [GetScheduledEmailByBatchId](docs/GetScheduledEmailByBatchId.md)
 - [GetScheduledEmailByBatchIdBatches](docs/GetScheduledEmailByBatchIdBatches.md)
 - [GetScheduledEmailByMessageId](docs/GetScheduledEmailByMessageId.md)
 - [GetSendersList](docs/GetSendersList.md)
 - [GetSendersListIps](docs/GetSendersListIps.md)
 - [GetSendersListSenders](docs/GetSendersListSenders.md)
 - [GetSharedTemplateUrl](docs/GetSharedTemplateUrl.md)
 - [GetSmsCampaignOverview](docs/GetSmsCampaignOverview.md)
 - [GetSmsCampaignStats](docs/GetSmsCampaignStats.md)
 - [GetSmsCampaigns](docs/GetSmsCampaigns.md)
 - [GetSmsEventReport](docs/GetSmsEventReport.md)
 - [GetSmsEventReportEvents](docs/GetSmsEventReportEvents.md)
 - [GetSmtpTemplateOverview](docs/GetSmtpTemplateOverview.md)
 - [GetSmtpTemplateOverviewSender](docs/GetSmtpTemplateOverviewSender.md)
 - [GetSmtpTemplates](docs/GetSmtpTemplates.md)
 - [GetSsoToken](docs/GetSsoToken.md)
 - [GetStatsByBrowser](docs/GetStatsByBrowser.md)
 - [GetStatsByDevice](docs/GetStatsByDevice.md)
 - [GetStatsByDomain](docs/GetStatsByDomain.md)
 - [GetTransacAggregatedSmsReport](docs/GetTransacAggregatedSmsReport.md)
 - [GetTransacBlockedContacts](docs/GetTransacBlockedContacts.md)
 - [GetTransacBlockedContactsContacts](docs/GetTransacBlockedContactsContacts.md)
 - [GetTransacBlockedContactsReason](docs/GetTransacBlockedContactsReason.md)
 - [GetTransacEmailContent](docs/GetTransacEmailContent.md)
 - [GetTransacEmailContentEvents](docs/GetTransacEmailContentEvents.md)
 - [GetTransacEmailsList](docs/GetTransacEmailsList.md)
 - [GetTransacEmailsListTransactionalEmails](docs/GetTransacEmailsListTransactionalEmails.md)
 - [GetTransacSmsReport](docs/GetTransacSmsReport.md)
 - [GetTransacSmsReportReports](docs/GetTransacSmsReportReports.md)
 - [GetWebhook](docs/GetWebhook.md)
 - [GetWebhooks](docs/GetWebhooks.md)
 - [GetWhatsappCampaignOverview](docs/GetWhatsappCampaignOverview.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse201](docs/InlineResponse201.md)
 - [InlineResponse2011](docs/InlineResponse2011.md)
 - [ManageIp](docs/ManageIp.md)
 - [MasterDetailsResponse](docs/MasterDetailsResponse.md)
 - [MasterDetailsResponseBillingInfo](docs/MasterDetailsResponseBillingInfo.md)
 - [MasterDetailsResponseBillingInfoAddress](docs/MasterDetailsResponseBillingInfoAddress.md)
 - [MasterDetailsResponseBillingInfoName](docs/MasterDetailsResponseBillingInfoName.md)
 - [MasterDetailsResponsePlanInfo](docs/MasterDetailsResponsePlanInfo.md)
 - [MasterDetailsResponsePlanInfoFeatures](docs/MasterDetailsResponsePlanInfoFeatures.md)
 - [Note](docs/Note.md)
 - [NoteData](docs/NoteData.md)
 - [NoteId](docs/NoteId.md)
 - [NoteList](docs/NoteList.md)
 - [Order](docs/Order.md)
 - [OrderBatch](docs/OrderBatch.md)
 - [OrderBilling](docs/OrderBilling.md)
 - [OrderProducts](docs/OrderProducts.md)
 - [Pipeline](docs/Pipeline.md)
 - [PipelineStage](docs/PipelineStage.md)
 - [PostContactInfo](docs/PostContactInfo.md)
 - [PostContactInfoContacts](docs/PostContactInfoContacts.md)
 - [PostSendFailed](docs/PostSendFailed.md)
 - [PostSendSmsTestFailed](docs/PostSendSmsTestFailed.md)
 - [RemainingCreditModel](docs/RemainingCreditModel.md)
 - [RemainingCreditModelChild](docs/RemainingCreditModelChild.md)
 - [RemainingCreditModelReseller](docs/RemainingCreditModelReseller.md)
 - [RemoveContactFromList](docs/RemoveContactFromList.md)
 - [RemoveCredits](docs/RemoveCredits.md)
 - [RequestContactExport](docs/RequestContactExport.md)
 - [RequestContactExportCustomContactFilter](docs/RequestContactExportCustomContactFilter.md)
 - [RequestContactImport](docs/RequestContactImport.md)
 - [RequestContactImportNewList](docs/RequestContactImportNewList.md)
 - [RequestSmsRecipientExport](docs/RequestSmsRecipientExport.md)
 - [ScheduleSmtpEmail](docs/ScheduleSmtpEmail.md)
 - [SendReport](docs/SendReport.md)
 - [SendReportEmail](docs/SendReportEmail.md)
 - [SendSms](docs/SendSms.md)
 - [SendSmtpEmail](docs/SendSmtpEmail.md)
 - [SendSmtpEmailAttachment](docs/SendSmtpEmailAttachment.md)
 - [SendSmtpEmailBcc](docs/SendSmtpEmailBcc.md)
 - [SendSmtpEmailCc](docs/SendSmtpEmailCc.md)
 - [SendSmtpEmailMessageVersions](docs/SendSmtpEmailMessageVersions.md)
 - [SendSmtpEmailReplyTo](docs/SendSmtpEmailReplyTo.md)
 - [SendSmtpEmailReplyTo1](docs/SendSmtpEmailReplyTo1.md)
 - [SendSmtpEmailSender](docs/SendSmtpEmailSender.md)
 - [SendSmtpEmailTo](docs/SendSmtpEmailTo.md)
 - [SendSmtpEmailTo1](docs/SendSmtpEmailTo1.md)
 - [SendTestEmail](docs/SendTestEmail.md)
 - [SendTestSms](docs/SendTestSms.md)
 - [SendTransacSms](docs/SendTransacSms.md)
 - [SsoTokenRequest](docs/SsoTokenRequest.md)
 - [SubAccountDetailsResponse](docs/SubAccountDetailsResponse.md)
 - [SubAccountDetailsResponsePlanInfo](docs/SubAccountDetailsResponsePlanInfo.md)
 - [SubAccountDetailsResponsePlanInfoCredits](docs/SubAccountDetailsResponsePlanInfoCredits.md)
 - [SubAccountDetailsResponsePlanInfoCreditsEmails](docs/SubAccountDetailsResponsePlanInfoCreditsEmails.md)
 - [SubAccountDetailsResponsePlanInfoFeatures](docs/SubAccountDetailsResponsePlanInfoFeatures.md)
 - [SubAccountDetailsResponsePlanInfoFeaturesInbox](docs/SubAccountDetailsResponsePlanInfoFeaturesInbox.md)
 - [SubAccountDetailsResponsePlanInfoFeaturesLandingPage](docs/SubAccountDetailsResponsePlanInfoFeaturesLandingPage.md)
 - [SubAccountDetailsResponsePlanInfoFeaturesUsers](docs/SubAccountDetailsResponsePlanInfoFeaturesUsers.md)
 - [SubAccountUpdatePlanRequest](docs/SubAccountUpdatePlanRequest.md)
 - [SubAccountUpdatePlanRequestCredits](docs/SubAccountUpdatePlanRequestCredits.md)
 - [SubAccountUpdatePlanRequestFeatures](docs/SubAccountUpdatePlanRequestFeatures.md)
 - [SubAccountsResponse](docs/SubAccountsResponse.md)
 - [SubAccountsResponseSubAccounts](docs/SubAccountsResponseSubAccounts.md)
 - [Task](docs/Task.md)
 - [TaskList](docs/TaskList.md)
 - [TaskReminder](docs/TaskReminder.md)
 - [TaskTypes](docs/TaskTypes.md)
 - [UpdateAttribute](docs/UpdateAttribute.md)
 - [UpdateAttributeEnumeration](docs/UpdateAttributeEnumeration.md)
 - [UpdateBatchContacts](docs/UpdateBatchContacts.md)
 - [UpdateBatchContactsContacts](docs/UpdateBatchContactsContacts.md)
 - [UpdateBatchContactsModel](docs/UpdateBatchContactsModel.md)
 - [UpdateCampaignStatus](docs/UpdateCampaignStatus.md)
 - [UpdateChild](docs/UpdateChild.md)
 - [UpdateChildAccountStatus](docs/UpdateChildAccountStatus.md)
 - [UpdateChildDomain](docs/UpdateChildDomain.md)
 - [UpdateContact](docs/UpdateContact.md)
 - [UpdateEmailCampaign](docs/UpdateEmailCampaign.md)
 - [UpdateEmailCampaignRecipients](docs/UpdateEmailCampaignRecipients.md)
 - [UpdateEmailCampaignSender](docs/UpdateEmailCampaignSender.md)
 - [UpdateList](docs/UpdateList.md)
 - [UpdateSender](docs/UpdateSender.md)
 - [UpdateSmsCampaign](docs/UpdateSmsCampaign.md)
 - [UpdateSmtpTemplate](docs/UpdateSmtpTemplate.md)
 - [UpdateSmtpTemplateSender](docs/UpdateSmtpTemplateSender.md)
 - [UpdateWebhook](docs/UpdateWebhook.md)
 - [UploadImageModel](docs/UploadImageModel.md)
 - [UploadImageToGallery](docs/UploadImageToGallery.md)
 - [VariablesItems](docs/VariablesItems.md)
 - [WhatsappCampStats](docs/WhatsappCampStats.md)
 - [WhatsappCampTemplate](docs/WhatsappCampTemplate.md)
 - [GetChildInfo](docs/GetChildInfo.md)
 - [GetExtendedCampaignOverview](docs/GetExtendedCampaignOverview.md)
 - [GetExtendedClient](docs/GetExtendedClient.md)
 - [GetExtendedContactDetails](docs/GetExtendedContactDetails.md)
 - [GetExtendedList](docs/GetExtendedList.md)
 - [GetSmsCampaign](docs/GetSmsCampaign.md)
 - [GetAccount](docs/GetAccount.md)
 - [GetEmailCampaign](docs/GetEmailCampaign.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api-key

- **Type**: API key
- **API key parameter name**: api-key
- **Location**: HTTP header

### partner-key

- **Type**: API key
- **API key parameter name**: partner-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Support and Feedback

Be sure to visit the SendinBlue official [documentation website](https://sendinblue.readme.io/docs ) for additional information about our API.

If you find a bug, please post the issue on [Github](https://github.com/sendinblue/APIv3-java-library/issues).

As always, if you need additional assistance, drop us a note [here](https://account.sendinblue.com/support).
