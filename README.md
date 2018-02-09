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
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sendinblue:sib-api-v3-sdk:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
    mvn package
```

Then manually install the following JARs:

* target/sib-api-v3-sdk-1.0.0.jar
* target/lib/*.jar

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
*AccountApi* | [**getAccount**](docs/AccountApi.md#getAccount) | **GET** /account | Get your account informations, plans and credits details
*AttributesApi* | [**createAttribute**](docs/AttributesApi.md#createAttribute) | **POST** /contacts/attributes/{attributeCategory}/{attributeName} | Creates contact attribute
*AttributesApi* | [**deleteAttribute**](docs/AttributesApi.md#deleteAttribute) | **DELETE** /contacts/attributes/{attributeCategory}/{attributeName} | Deletes an attribute
*AttributesApi* | [**getAttributes**](docs/AttributesApi.md#getAttributes) | **GET** /contacts/attributes | Lists all attributes
*AttributesApi* | [**updateAttribute**](docs/AttributesApi.md#updateAttribute) | **PUT** /contacts/attributes/{attributeCategory}/{attributeName} | Updates contact attribute
*ContactsApi* | [**addContactToList**](docs/ContactsApi.md#addContactToList) | **POST** /contacts/lists/{listId}/contacts/add | Add existing contacts to a list
*ContactsApi* | [**createAttribute**](docs/ContactsApi.md#createAttribute) | **POST** /contacts/attributes/{attributeCategory}/{attributeName} | Creates contact attribute
*ContactsApi* | [**createContact**](docs/ContactsApi.md#createContact) | **POST** /contacts | Create a contact
*ContactsApi* | [**createFolder**](docs/ContactsApi.md#createFolder) | **POST** /contacts/folders | Create a folder
*ContactsApi* | [**createList**](docs/ContactsApi.md#createList) | **POST** /contacts/lists | Create a list
*ContactsApi* | [**deleteAttribute**](docs/ContactsApi.md#deleteAttribute) | **DELETE** /contacts/attributes/{attributeCategory}/{attributeName} | Deletes an attribute
*ContactsApi* | [**deleteFolder**](docs/ContactsApi.md#deleteFolder) | **DELETE** /contacts/folders/{folderId} | Delete a folder (and all its lists)
*ContactsApi* | [**deleteList**](docs/ContactsApi.md#deleteList) | **DELETE** /contacts/lists/{listId} | Delete a list
*ContactsApi* | [**getAttributes**](docs/ContactsApi.md#getAttributes) | **GET** /contacts/attributes | Lists all attributes
*ContactsApi* | [**getContactInfo**](docs/ContactsApi.md#getContactInfo) | **GET** /contacts/{email} | Retrieves contact informations
*ContactsApi* | [**getContactStats**](docs/ContactsApi.md#getContactStats) | **GET** /contacts/{email}/campaignStats | Get the campaigns statistics for a contact
*ContactsApi* | [**getContacts**](docs/ContactsApi.md#getContacts) | **GET** /contacts | Get all the contacts
*ContactsApi* | [**getContactsFromList**](docs/ContactsApi.md#getContactsFromList) | **GET** /contacts/lists/{listId}/contacts | Get the contacts in a list
*ContactsApi* | [**getFolder**](docs/ContactsApi.md#getFolder) | **GET** /contacts/folders/{folderId} | Returns folder details
*ContactsApi* | [**getFolderLists**](docs/ContactsApi.md#getFolderLists) | **GET** /contacts/folders/{folderId}/lists | Get the lists in a folder
*ContactsApi* | [**getFolders**](docs/ContactsApi.md#getFolders) | **GET** /contacts/folders | Get all the folders
*ContactsApi* | [**getList**](docs/ContactsApi.md#getList) | **GET** /contacts/lists/{listId} | Get the details of a list
*ContactsApi* | [**getLists**](docs/ContactsApi.md#getLists) | **GET** /contacts/lists | Get all the lists
*ContactsApi* | [**importContacts**](docs/ContactsApi.md#importContacts) | **POST** /contacts/import | Import contacts
*ContactsApi* | [**removeContactToList**](docs/ContactsApi.md#removeContactToList) | **POST** /contacts/lists/{listId}/contacts/remove | Remove existing contacts from a list
*ContactsApi* | [**requestContactExport**](docs/ContactsApi.md#requestContactExport) | **POST** /contacts/export | Export contacts
*ContactsApi* | [**updateAttribute**](docs/ContactsApi.md#updateAttribute) | **PUT** /contacts/attributes/{attributeCategory}/{attributeName} | Updates contact attribute
*ContactsApi* | [**updateContact**](docs/ContactsApi.md#updateContact) | **PUT** /contacts/{email} | Updates a contact
*ContactsApi* | [**updateFolder**](docs/ContactsApi.md#updateFolder) | **PUT** /contacts/folders/{folderId} | Update a contact folder
*ContactsApi* | [**updateList**](docs/ContactsApi.md#updateList) | **PUT** /contacts/lists/{listId} | Update a list
*EmailCampaignsApi* | [**createEmailCampaign**](docs/EmailCampaignsApi.md#createEmailCampaign) | **POST** /emailCampaigns | Create an email campaign
*EmailCampaignsApi* | [**deleteEmailCampaign**](docs/EmailCampaignsApi.md#deleteEmailCampaign) | **DELETE** /emailCampaigns/{campaignId} | Delete an email campaign
*EmailCampaignsApi* | [**emailExportRecipients**](docs/EmailCampaignsApi.md#emailExportRecipients) | **POST** /emailCampaigns/{campaignId}/exportRecipients | Export the recipients of a campaign
*EmailCampaignsApi* | [**getEmailCampaign**](docs/EmailCampaignsApi.md#getEmailCampaign) | **GET** /emailCampaigns/{campaignId} | Get campaign informations
*EmailCampaignsApi* | [**getEmailCampaigns**](docs/EmailCampaignsApi.md#getEmailCampaigns) | **GET** /emailCampaigns | Return all your created campaigns
*EmailCampaignsApi* | [**sendEmailCampaignNow**](docs/EmailCampaignsApi.md#sendEmailCampaignNow) | **POST** /emailCampaigns/{campaignId}/sendNow | Send an email campaign id of the campaign immediately
*EmailCampaignsApi* | [**sendReport**](docs/EmailCampaignsApi.md#sendReport) | **POST** /emailCampaigns/{campaignId}/sendReport | Send the report of a campaigns
*EmailCampaignsApi* | [**sendTestEmail**](docs/EmailCampaignsApi.md#sendTestEmail) | **POST** /emailCampaigns/{campaignId}/sendTest | Send an email campaign to your test list
*EmailCampaignsApi* | [**updateCampaignStatus**](docs/EmailCampaignsApi.md#updateCampaignStatus) | **PUT** /emailCampaigns/{campaignId}/status | Update a campaign status
*EmailCampaignsApi* | [**updateEmailCampaign**](docs/EmailCampaignsApi.md#updateEmailCampaign) | **PUT** /emailCampaigns/{campaignId} | Update a campaign
*FoldersApi* | [**createFolder**](docs/FoldersApi.md#createFolder) | **POST** /contacts/folders | Create a folder
*FoldersApi* | [**deleteFolder**](docs/FoldersApi.md#deleteFolder) | **DELETE** /contacts/folders/{folderId} | Delete a folder (and all its lists)
*FoldersApi* | [**getFolder**](docs/FoldersApi.md#getFolder) | **GET** /contacts/folders/{folderId} | Returns folder details
*FoldersApi* | [**getFolderLists**](docs/FoldersApi.md#getFolderLists) | **GET** /contacts/folders/{folderId}/lists | Get the lists in a folder
*FoldersApi* | [**getFolders**](docs/FoldersApi.md#getFolders) | **GET** /contacts/folders | Get all the folders
*FoldersApi* | [**updateFolder**](docs/FoldersApi.md#updateFolder) | **PUT** /contacts/folders/{folderId} | Update a contact folder
*ListsApi* | [**addContactToList**](docs/ListsApi.md#addContactToList) | **POST** /contacts/lists/{listId}/contacts/add | Add existing contacts to a list
*ListsApi* | [**createList**](docs/ListsApi.md#createList) | **POST** /contacts/lists | Create a list
*ListsApi* | [**deleteList**](docs/ListsApi.md#deleteList) | **DELETE** /contacts/lists/{listId} | Delete a list
*ListsApi* | [**getContactsFromList**](docs/ListsApi.md#getContactsFromList) | **GET** /contacts/lists/{listId}/contacts | Get the contacts in a list
*ListsApi* | [**getFolderLists**](docs/ListsApi.md#getFolderLists) | **GET** /contacts/folders/{folderId}/lists | Get the lists in a folder
*ListsApi* | [**getList**](docs/ListsApi.md#getList) | **GET** /contacts/lists/{listId} | Get the details of a list
*ListsApi* | [**getLists**](docs/ListsApi.md#getLists) | **GET** /contacts/lists | Get all the lists
*ListsApi* | [**removeContactToList**](docs/ListsApi.md#removeContactToList) | **POST** /contacts/lists/{listId}/contacts/remove | Remove existing contacts from a list
*ListsApi* | [**updateList**](docs/ListsApi.md#updateList) | **PUT** /contacts/lists/{listId} | Update a list
*ProcessApi* | [**getProcess**](docs/ProcessApi.md#getProcess) | **GET** /processes/{processId} | Return the informations for a process
*ProcessApi* | [**getProcesses**](docs/ProcessApi.md#getProcesses) | **GET** /processes | Return all the processes for your account
*ResellerApi* | [**addCredits**](docs/ResellerApi.md#addCredits) | **POST** /reseller/children/{childAuthKey}/credits/add | Add Email and/or SMS credits to a specific child account
*ResellerApi* | [**associateIpToChild**](docs/ResellerApi.md#associateIpToChild) | **POST** /reseller/children/{childAuthKey}/ips/associate | Associate a dedicated IP to the child
*ResellerApi* | [**createResellerChild**](docs/ResellerApi.md#createResellerChild) | **POST** /reseller/children | Creates a reseller child
*ResellerApi* | [**deleteResellerChild**](docs/ResellerApi.md#deleteResellerChild) | **DELETE** /reseller/children/{childAuthKey} | Deletes a single reseller child based on the childAuthKey supplied
*ResellerApi* | [**dissociateIpFromChild**](docs/ResellerApi.md#dissociateIpFromChild) | **POST** /reseller/children/{childAuthKey}/ips/dissociate | Dissociate a dedicated IP to the child
*ResellerApi* | [**getChildInfo**](docs/ResellerApi.md#getChildInfo) | **GET** /reseller/children/{childAuthKey} | Gets the info about a specific child account
*ResellerApi* | [**getResellerChilds**](docs/ResellerApi.md#getResellerChilds) | **GET** /reseller/children | Gets the list of all reseller&#39;s children accounts
*ResellerApi* | [**removeCredits**](docs/ResellerApi.md#removeCredits) | **POST** /reseller/children/{childAuthKey}/credits/remove | Remove Email and/or SMS credits from a specific child account
*ResellerApi* | [**updateResellerChild**](docs/ResellerApi.md#updateResellerChild) | **PUT** /reseller/children/{childAuthKey} | Updates infos of reseller&#39;s child based on the childAuthKey supplied
*SendersApi* | [**createSender**](docs/SendersApi.md#createSender) | **POST** /senders | Create a new sender
*SendersApi* | [**deleteSender**](docs/SendersApi.md#deleteSender) | **DELETE** /senders/{senderId} | Delete a sender
*SendersApi* | [**getIps**](docs/SendersApi.md#getIps) | **GET** /senders/ips | Return all the dedicated IPs for your account
*SendersApi* | [**getIpsFromSender**](docs/SendersApi.md#getIpsFromSender) | **GET** /senders/{senderId}/ips | Return all the dedicated IPs for a sender
*SendersApi* | [**getSenders**](docs/SendersApi.md#getSenders) | **GET** /senders | Get the list of all your senders
*SendersApi* | [**updateSender**](docs/SendersApi.md#updateSender) | **PUT** /senders/{senderId} | Update a sender
*SmsCampaignsApi* | [**createSmsCampaign**](docs/SmsCampaignsApi.md#createSmsCampaign) | **POST** /smsCampaigns | Creates an SMS campaign
*SmsCampaignsApi* | [**deleteSmsCampaign**](docs/SmsCampaignsApi.md#deleteSmsCampaign) | **DELETE** /smsCampaigns/{campaignId} | Delete the SMS campaign
*SmsCampaignsApi* | [**getSmsCampaign**](docs/SmsCampaignsApi.md#getSmsCampaign) | **GET** /smsCampaigns/{campaignId} | Get an SMS campaign
*SmsCampaignsApi* | [**getSmsCampaigns**](docs/SmsCampaignsApi.md#getSmsCampaigns) | **GET** /smsCampaigns | Returns the informations for all your created SMS campaigns
*SmsCampaignsApi* | [**requestSmsRecipientExport**](docs/SmsCampaignsApi.md#requestSmsRecipientExport) | **POST** /smsCampaigns/{campaignId}/exportRecipients | Exports the recipients of the specified campaign.
*SmsCampaignsApi* | [**sendSmsCampaignNow**](docs/SmsCampaignsApi.md#sendSmsCampaignNow) | **POST** /smsCampaigns/{campaignId}/sendNow | Send your SMS campaign immediately
*SmsCampaignsApi* | [**sendSmsReport**](docs/SmsCampaignsApi.md#sendSmsReport) | **POST** /smsCampaigns/{campaignId}/sendReport | Send report of SMS campaigns
*SmsCampaignsApi* | [**sendTestSms**](docs/SmsCampaignsApi.md#sendTestSms) | **POST** /smsCampaigns/{campaignId}/sendTest | Send an SMS
*SmsCampaignsApi* | [**updateSmsCampaign**](docs/SmsCampaignsApi.md#updateSmsCampaign) | **PUT** /smsCampaigns/{campaignId} | Updates an SMS campaign
*SmsCampaignsApi* | [**updateSmsCampaignStatus**](docs/SmsCampaignsApi.md#updateSmsCampaignStatus) | **PUT** /smsCampaigns/{campaignId}/status | Update the campaign status
*SmtpApi* | [**createSmtpTemplate**](docs/SmtpApi.md#createSmtpTemplate) | **POST** /smtp/templates | Create an smtp template
*SmtpApi* | [**deleteHardbounces**](docs/SmtpApi.md#deleteHardbounces) | **POST** /smtp/deleteHardbounces | Delete hardbounces
*SmtpApi* | [**deleteSmtpTemplate**](docs/SmtpApi.md#deleteSmtpTemplate) | **DELETE** /smtp/templates/{templateId} | Delete an inactive smtp template
*SmtpApi* | [**getAggregatedSmtpReport**](docs/SmtpApi.md#getAggregatedSmtpReport) | **GET** /smtp/statistics/aggregatedReport | Get your SMTP activity aggregated over a period of time
*SmtpApi* | [**getEmailEventReport**](docs/SmtpApi.md#getEmailEventReport) | **GET** /smtp/statistics/events | Get all your SMTP activity (unaggregated events)
*SmtpApi* | [**getSmtpReport**](docs/SmtpApi.md#getSmtpReport) | **GET** /smtp/statistics/reports | Get your SMTP activity aggregated per day
*SmtpApi* | [**getSmtpTemplate**](docs/SmtpApi.md#getSmtpTemplate) | **GET** /smtp/templates/{templateId} | Returns the template informations
*SmtpApi* | [**getSmtpTemplates**](docs/SmtpApi.md#getSmtpTemplates) | **GET** /smtp/templates | Get the list of SMTP templates
*SmtpApi* | [**sendTemplate**](docs/SmtpApi.md#sendTemplate) | **POST** /smtp/templates/{templateId}/send | Send a template
*SmtpApi* | [**sendTestTemplate**](docs/SmtpApi.md#sendTestTemplate) | **POST** /smtp/templates/{templateId}/sendTest | Send a template to your test list
*SmtpApi* | [**sendTransacEmail**](docs/SmtpApi.md#sendTransacEmail) | **POST** /smtp/email | Send a transactional email
*SmtpApi* | [**updateSmtpTemplate**](docs/SmtpApi.md#updateSmtpTemplate) | **PUT** /smtp/templates/{templateId} | Updates an smtp templates
*TransactionalSmsApi* | [**getSmsEvents**](docs/TransactionalSmsApi.md#getSmsEvents) | **GET** /transactionalSMS/statistics/events | Get all the SMS activity (unaggregated events)
*TransactionalSmsApi* | [**getTransacAggregatedSmsReport**](docs/TransactionalSmsApi.md#getTransacAggregatedSmsReport) | **GET** /transactionalSMS/statistics/aggregatedReport | Get your SMS activity aggregated over a period of time
*TransactionalSmsApi* | [**getTransacSmsReport**](docs/TransactionalSmsApi.md#getTransacSmsReport) | **GET** /transactionalSMS/statistics/reports | Get your SMS activity aggregated per day
*TransactionalSmsApi* | [**sendTransacSms**](docs/TransactionalSmsApi.md#sendTransacSms) | **POST** /transactionalSMS/sms | Send the SMS campaign to the specified mobile number
*WebhooksApi* | [**createWebhook**](docs/WebhooksApi.md#createWebhook) | **POST** /webhooks | Create a webhook
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deleteWebhook) | **DELETE** /webhooks/{webhookId} | Delete a webhook
*WebhooksApi* | [**getWebhook**](docs/WebhooksApi.md#getWebhook) | **GET** /webhooks/{webhookId} | Get a webhook details
*WebhooksApi* | [**getWebhooks**](docs/WebhooksApi.md#getWebhooks) | **GET** /webhooks | Get all webhooks
*WebhooksApi* | [**updateWebhook**](docs/WebhooksApi.md#updateWebhook) | **PUT** /webhooks/{webhookId} | Update a webhook


## Documentation for Models

 - [AddCredits](docs/AddCredits.md)
 - [AddRemoveContactToList](docs/AddRemoveContactToList.md)
 - [CreateAttribute](docs/CreateAttribute.md)
 - [CreateAttributeEnumeration](docs/CreateAttributeEnumeration.md)
 - [CreateChild](docs/CreateChild.md)
 - [CreateContact](docs/CreateContact.md)
 - [CreateEmailCampaign](docs/CreateEmailCampaign.md)
 - [CreateEmailCampaignRecipients](docs/CreateEmailCampaignRecipients.md)
 - [CreateEmailCampaignSender](docs/CreateEmailCampaignSender.md)
 - [CreateList](docs/CreateList.md)
 - [CreateModel](docs/CreateModel.md)
 - [CreateReseller](docs/CreateReseller.md)
 - [CreateSender](docs/CreateSender.md)
 - [CreateSenderIps](docs/CreateSenderIps.md)
 - [CreateSenderModel](docs/CreateSenderModel.md)
 - [CreateSmsCampaign](docs/CreateSmsCampaign.md)
 - [CreateSmsCampaignRecipients](docs/CreateSmsCampaignRecipients.md)
 - [CreateSmtpEmail](docs/CreateSmtpEmail.md)
 - [CreateSmtpTemplate](docs/CreateSmtpTemplate.md)
 - [CreateSmtpTemplateSender](docs/CreateSmtpTemplateSender.md)
 - [CreateUpdateFolder](docs/CreateUpdateFolder.md)
 - [CreateWebhook](docs/CreateWebhook.md)
 - [CreatedProcessId](docs/CreatedProcessId.md)
 - [DeleteHardbounces](docs/DeleteHardbounces.md)
 - [EmailExportRecipients](docs/EmailExportRecipients.md)
 - [ErrorModel](docs/ErrorModel.md)
 - [GetAccountMarketingAutomation](docs/GetAccountMarketingAutomation.md)
 - [GetAccountPlan](docs/GetAccountPlan.md)
 - [GetAccountRelay](docs/GetAccountRelay.md)
 - [GetAccountRelayData](docs/GetAccountRelayData.md)
 - [GetAggregatedReport](docs/GetAggregatedReport.md)
 - [GetAttributes](docs/GetAttributes.md)
 - [GetAttributesAttributes](docs/GetAttributesAttributes.md)
 - [GetAttributesEnumeration](docs/GetAttributesEnumeration.md)
 - [GetCampaignOverview](docs/GetCampaignOverview.md)
 - [GetCampaignRecipients](docs/GetCampaignRecipients.md)
 - [GetCampaignStats](docs/GetCampaignStats.md)
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
 - [GetEmailCampaigns](docs/GetEmailCampaigns.md)
 - [GetEmailEventReport](docs/GetEmailEventReport.md)
 - [GetEmailEventReportEvents](docs/GetEmailEventReportEvents.md)
 - [GetExtendedCampaignOverviewSender](docs/GetExtendedCampaignOverviewSender.md)
 - [GetExtendedCampaignStats](docs/GetExtendedCampaignStats.md)
 - [GetExtendedCampaignStatsLinksStats](docs/GetExtendedCampaignStatsLinksStats.md)
 - [GetExtendedClientAddress](docs/GetExtendedClientAddress.md)
 - [GetExtendedContactDetailsStatistics](docs/GetExtendedContactDetailsStatistics.md)
 - [GetExtendedContactDetailsStatisticsClicked](docs/GetExtendedContactDetailsStatisticsClicked.md)
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
 - [GetIp](docs/GetIp.md)
 - [GetIpFromSender](docs/GetIpFromSender.md)
 - [GetIps](docs/GetIps.md)
 - [GetIpsFromSender](docs/GetIpsFromSender.md)
 - [GetList](docs/GetList.md)
 - [GetLists](docs/GetLists.md)
 - [GetProcess](docs/GetProcess.md)
 - [GetProcesses](docs/GetProcesses.md)
 - [GetReports](docs/GetReports.md)
 - [GetReportsReports](docs/GetReportsReports.md)
 - [GetSendersList](docs/GetSendersList.md)
 - [GetSendersListIps](docs/GetSendersListIps.md)
 - [GetSendersListSenders](docs/GetSendersListSenders.md)
 - [GetSmsCampaignOverview](docs/GetSmsCampaignOverview.md)
 - [GetSmsCampaignStats](docs/GetSmsCampaignStats.md)
 - [GetSmsCampaigns](docs/GetSmsCampaigns.md)
 - [GetSmsEventReport](docs/GetSmsEventReport.md)
 - [GetSmsEventReportEvents](docs/GetSmsEventReportEvents.md)
 - [GetSmtpTemplateOverview](docs/GetSmtpTemplateOverview.md)
 - [GetSmtpTemplateOverviewSender](docs/GetSmtpTemplateOverviewSender.md)
 - [GetSmtpTemplates](docs/GetSmtpTemplates.md)
 - [GetStatsByDomain](docs/GetStatsByDomain.md)
 - [GetTransacAggregatedSmsReport](docs/GetTransacAggregatedSmsReport.md)
 - [GetTransacSmsReport](docs/GetTransacSmsReport.md)
 - [GetTransacSmsReportReports](docs/GetTransacSmsReportReports.md)
 - [GetWebhook](docs/GetWebhook.md)
 - [GetWebhooks](docs/GetWebhooks.md)
 - [ManageIp](docs/ManageIp.md)
 - [PostContactInfo](docs/PostContactInfo.md)
 - [PostContactInfoContacts](docs/PostContactInfoContacts.md)
 - [PostSendFailed](docs/PostSendFailed.md)
 - [PostSendSmsTestFailed](docs/PostSendSmsTestFailed.md)
 - [RemainingCreditModel](docs/RemainingCreditModel.md)
 - [RemainingCreditModelChild](docs/RemainingCreditModelChild.md)
 - [RemainingCreditModelReseller](docs/RemainingCreditModelReseller.md)
 - [RemoveCredits](docs/RemoveCredits.md)
 - [RequestContactExport](docs/RequestContactExport.md)
 - [RequestContactImport](docs/RequestContactImport.md)
 - [RequestContactImportNewList](docs/RequestContactImportNewList.md)
 - [RequestSmsRecipientExport](docs/RequestSmsRecipientExport.md)
 - [SendEmail](docs/SendEmail.md)
 - [SendEmailAttachment](docs/SendEmailAttachment.md)
 - [SendReport](docs/SendReport.md)
 - [SendReportEmail](docs/SendReportEmail.md)
 - [SendSms](docs/SendSms.md)
 - [SendSmtpEmail](docs/SendSmtpEmail.md)
 - [SendSmtpEmailAttachment](docs/SendSmtpEmailAttachment.md)
 - [SendSmtpEmailBcc](docs/SendSmtpEmailBcc.md)
 - [SendSmtpEmailCc](docs/SendSmtpEmailCc.md)
 - [SendSmtpEmailReplyTo](docs/SendSmtpEmailReplyTo.md)
 - [SendSmtpEmailSender](docs/SendSmtpEmailSender.md)
 - [SendSmtpEmailTo](docs/SendSmtpEmailTo.md)
 - [SendTemplateEmail](docs/SendTemplateEmail.md)
 - [SendTestEmail](docs/SendTestEmail.md)
 - [SendTestSms](docs/SendTestSms.md)
 - [SendTransacSms](docs/SendTransacSms.md)
 - [UpdateAttribute](docs/UpdateAttribute.md)
 - [UpdateAttributeEnumeration](docs/UpdateAttributeEnumeration.md)
 - [UpdateCampaignStatus](docs/UpdateCampaignStatus.md)
 - [UpdateChild](docs/UpdateChild.md)
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


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Support and Feedback

Be sure to visit the SendinBlue official [documentation website](https://sendinblue.readme.io/docs ) for additional information about our API.

If you find a bug, please post the issue on [Github](https://github.com/sendinblue/APIv3-java-library/issues).

As always, if you need additional assistance, drop us a note [here](https://account.sendinblue.com/support).