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
  <version>5.3.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sendinblue:sib-api-v3-sdk:5.3.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn package
```

Then manually install the following JARs:

* `target/sib-api-v3-sdk-5.3.0.jar`
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
*AttributesApi* | [**createAttribute**](docs/AttributesApi.md#createAttribute) | **POST** /contacts/attributes/{attributeCategory}/{attributeName} | Create contact attribute
*AttributesApi* | [**deleteAttribute**](docs/AttributesApi.md#deleteAttribute) | **DELETE** /contacts/attributes/{attributeCategory}/{attributeName} | Delete an attribute
*AttributesApi* | [**getAttributes**](docs/AttributesApi.md#getAttributes) | **GET** /contacts/attributes | List all attributes
*AttributesApi* | [**updateAttribute**](docs/AttributesApi.md#updateAttribute) | **PUT** /contacts/attributes/{attributeCategory}/{attributeName} | Update contact attribute
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
*ContactsApi* | [**updateContact**](docs/ContactsApi.md#updateContact) | **PUT** /contacts/{identifier} | Update a contact
*ContactsApi* | [**updateFolder**](docs/ContactsApi.md#updateFolder) | **PUT** /contacts/folders/{folderId} | Update a folder
*ContactsApi* | [**updateList**](docs/ContactsApi.md#updateList) | **PUT** /contacts/lists/{listId} | Update a list
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
*FoldersApi* | [**createFolder**](docs/FoldersApi.md#createFolder) | **POST** /contacts/folders | Create a folder
*FoldersApi* | [**deleteFolder**](docs/FoldersApi.md#deleteFolder) | **DELETE** /contacts/folders/{folderId} | Delete a folder (and all its lists)
*FoldersApi* | [**getFolder**](docs/FoldersApi.md#getFolder) | **GET** /contacts/folders/{folderId} | Returns a folder&#39;s details
*FoldersApi* | [**getFolderLists**](docs/FoldersApi.md#getFolderLists) | **GET** /contacts/folders/{folderId}/lists | Get lists in a folder
*FoldersApi* | [**getFolders**](docs/FoldersApi.md#getFolders) | **GET** /contacts/folders | Get all folders
*FoldersApi* | [**updateFolder**](docs/FoldersApi.md#updateFolder) | **PUT** /contacts/folders/{folderId} | Update a folder
*ListsApi* | [**addContactToList**](docs/ListsApi.md#addContactToList) | **POST** /contacts/lists/{listId}/contacts/add | Add existing contacts to a list
*ListsApi* | [**createList**](docs/ListsApi.md#createList) | **POST** /contacts/lists | Create a list
*ListsApi* | [**deleteList**](docs/ListsApi.md#deleteList) | **DELETE** /contacts/lists/{listId} | Delete a list
*ListsApi* | [**getContactsFromList**](docs/ListsApi.md#getContactsFromList) | **GET** /contacts/lists/{listId}/contacts | Get contacts in a list
*ListsApi* | [**getFolderLists**](docs/ListsApi.md#getFolderLists) | **GET** /contacts/folders/{folderId}/lists | Get lists in a folder
*ListsApi* | [**getList**](docs/ListsApi.md#getList) | **GET** /contacts/lists/{listId} | Get a list&#39;s details
*ListsApi* | [**getLists**](docs/ListsApi.md#getLists) | **GET** /contacts/lists | Get all the lists
*ListsApi* | [**removeContactFromList**](docs/ListsApi.md#removeContactFromList) | **POST** /contacts/lists/{listId}/contacts/remove | Delete a contact from a list
*ListsApi* | [**updateList**](docs/ListsApi.md#updateList) | **PUT** /contacts/lists/{listId} | Update a list
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
*TransactionalEmailsApi* | [**blockNewDomain**](docs/TransactionalEmailsApi.md#blockNewDomain) | **POST** /smtp/blockedDomains | Add a new domain to the list of blocked domains
*TransactionalEmailsApi* | [**createSmtpTemplate**](docs/TransactionalEmailsApi.md#createSmtpTemplate) | **POST** /smtp/templates | Create an email template
*TransactionalEmailsApi* | [**deleteBlockedDomain**](docs/TransactionalEmailsApi.md#deleteBlockedDomain) | **DELETE** /smtp/blockedDomains/{domain} | Unblock an existing domain from the list of blocked domains
*TransactionalEmailsApi* | [**deleteHardbounces**](docs/TransactionalEmailsApi.md#deleteHardbounces) | **POST** /smtp/deleteHardbounces | Delete hardbounces
*TransactionalEmailsApi* | [**deleteSmtpTemplate**](docs/TransactionalEmailsApi.md#deleteSmtpTemplate) | **DELETE** /smtp/templates/{templateId} | Delete an inactive email template
*TransactionalEmailsApi* | [**getAggregatedSmtpReport**](docs/TransactionalEmailsApi.md#getAggregatedSmtpReport) | **GET** /smtp/statistics/aggregatedReport | Get your transactional email activity aggregated over a period of time
*TransactionalEmailsApi* | [**getBlockedDomains**](docs/TransactionalEmailsApi.md#getBlockedDomains) | **GET** /smtp/blockedDomains | Get the list of blocked domains
*TransactionalEmailsApi* | [**getEmailEventReport**](docs/TransactionalEmailsApi.md#getEmailEventReport) | **GET** /smtp/statistics/events | Get all your transactional email activity (unaggregated events)
*TransactionalEmailsApi* | [**getSmtpReport**](docs/TransactionalEmailsApi.md#getSmtpReport) | **GET** /smtp/statistics/reports | Get your transactional email activity aggregated per day
*TransactionalEmailsApi* | [**getSmtpTemplate**](docs/TransactionalEmailsApi.md#getSmtpTemplate) | **GET** /smtp/templates/{templateId} | Returns the template information
*TransactionalEmailsApi* | [**getSmtpTemplates**](docs/TransactionalEmailsApi.md#getSmtpTemplates) | **GET** /smtp/templates | Get the list of email templates
*TransactionalEmailsApi* | [**getTransacBlockedContacts**](docs/TransactionalEmailsApi.md#getTransacBlockedContacts) | **GET** /smtp/blockedContacts | Get the list of blocked or unsubscribed transactional contacts
*TransactionalEmailsApi* | [**getTransacEmailContent**](docs/TransactionalEmailsApi.md#getTransacEmailContent) | **GET** /smtp/emails/{uuid} | Get the personalized content of a sent transactional email
*TransactionalEmailsApi* | [**getTransacEmailsList**](docs/TransactionalEmailsApi.md#getTransacEmailsList) | **GET** /smtp/emails | Get the list of transactional emails on the basis of allowed filters
*TransactionalEmailsApi* | [**sendTemplate**](docs/TransactionalEmailsApi.md#sendTemplate) | **POST** /smtp/templates/{templateId}/send | Send a template
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
 - [CreateAttribute](docs/CreateAttribute.md)
 - [CreateAttributeEnumeration](docs/CreateAttributeEnumeration.md)
 - [CreateChild](docs/CreateChild.md)
 - [CreateContact](docs/CreateContact.md)
 - [CreateDoiContact](docs/CreateDoiContact.md)
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
 - [CreateUpdateContactModel](docs/CreateUpdateContactModel.md)
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
 - [GetBlockedDomains](docs/GetBlockedDomains.md)
 - [GetCampaignOverview](docs/GetCampaignOverview.md)
 - [GetCampaignRecipients](docs/GetCampaignRecipients.md)
 - [GetCampaignStats](docs/GetCampaignStats.md)
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
 - [ManageIp](docs/ManageIp.md)
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
 - [SendEmail](docs/SendEmail.md)
 - [SendEmailAttachment](docs/SendEmailAttachment.md)
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
 - [SendTemplateEmail](docs/SendTemplateEmail.md)
 - [SendTestEmail](docs/SendTestEmail.md)
 - [SendTestSms](docs/SendTestSms.md)
 - [SendTransacSms](docs/SendTransacSms.md)
 - [UpdateAttribute](docs/UpdateAttribute.md)
 - [UpdateAttributeEnumeration](docs/UpdateAttributeEnumeration.md)
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
 - [UploadImageToGallery](docs/UploadImageToGallery.md)
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
