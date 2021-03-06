/**
 * ICustomerManagementService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.customermanagement;

public interface ICustomerManagementService extends java.rmi.Remote {
    com.microsoft.bingads.v9.customermanagement.GetAccountsInfoResponse getAccountsInfo(com.microsoft.bingads.v9.customermanagement.GetAccountsInfoRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.FindAccountsResponse findAccounts(com.microsoft.bingads.v9.customermanagement.FindAccountsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.AddAccountResponse addAccount(com.microsoft.bingads.v9.customermanagement.AddAccountRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.UpdateAccountResponse updateAccount(com.microsoft.bingads.v9.customermanagement.UpdateAccountRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.GetCustomerResponse getCustomer(com.microsoft.bingads.v9.customermanagement.GetCustomerRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.UpdateCustomerResponse updateCustomer(com.microsoft.bingads.v9.customermanagement.UpdateCustomerRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.SignupCustomerResponse signupCustomer(com.microsoft.bingads.v9.customermanagement.SignupCustomerRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.GetAccountResponse getAccount(com.microsoft.bingads.v9.customermanagement.GetAccountRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.GetCustomersInfoResponse getCustomersInfo(com.microsoft.bingads.v9.customermanagement.GetCustomersInfoRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.DeleteAccountResponse deleteAccount(com.microsoft.bingads.v9.customermanagement.DeleteAccountRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.DeleteCustomerResponse deleteCustomer(com.microsoft.bingads.v9.customermanagement.DeleteCustomerRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.UpdateUserResponse updateUser(com.microsoft.bingads.v9.customermanagement.UpdateUserRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.UpdateUserRolesResponse updateUserRoles(com.microsoft.bingads.v9.customermanagement.UpdateUserRolesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.GetUserResponse getUser(com.microsoft.bingads.v9.customermanagement.GetUserRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.GetCurrentUserResponse getCurrentUser(com.microsoft.bingads.v9.customermanagement.GetCurrentUserRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.DeleteUserResponse deleteUser(com.microsoft.bingads.v9.customermanagement.DeleteUserRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.GetUsersInfoResponse getUsersInfo(com.microsoft.bingads.v9.customermanagement.GetUsersInfoRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.GetCustomerPilotFeaturesResponse getCustomerPilotFeatures(com.microsoft.bingads.v9.customermanagement.GetCustomerPilotFeaturesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.GetPilotFeaturesCountriesResponse getPilotFeaturesCountries(com.microsoft.bingads.v9.customermanagement.GetPilotFeaturesCountriesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.GetAccessibleCustomerResponse getAccessibleCustomer(com.microsoft.bingads.v9.customermanagement.GetAccessibleCustomerRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.FindAccountsOrCustomersInfoResponse findAccountsOrCustomersInfo(com.microsoft.bingads.v9.customermanagement.FindAccountsOrCustomersInfoRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.UpgradeCustomerToAgencyResponse upgradeCustomerToAgency(com.microsoft.bingads.v9.customermanagement.UpgradeCustomerToAgencyRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.AddPrepayAccountResponse addPrepayAccount(com.microsoft.bingads.v9.customermanagement.AddPrepayAccountRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.UpdatePrepayAccountResponse updatePrepayAccount(com.microsoft.bingads.v9.customermanagement.UpdatePrepayAccountRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.MapCustomerIdToExternalCustomerIdResponse mapCustomerIdToExternalCustomerId(com.microsoft.bingads.v9.customermanagement.MapCustomerIdToExternalCustomerIdRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.MapAccountIdToExternalAccountIdsResponse mapAccountIdToExternalAccountIds(com.microsoft.bingads.v9.customermanagement.MapAccountIdToExternalAccountIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.SearchCustomersResponse searchCustomers(com.microsoft.bingads.v9.customermanagement.SearchCustomersRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.AddClientLinksResponse addClientLinks(com.microsoft.bingads.v9.customermanagement.AddClientLinksRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.UpdateClientLinksResponse updateClientLinks(com.microsoft.bingads.v9.customermanagement.UpdateClientLinksRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.SearchClientLinksResponse searchClientLinks(com.microsoft.bingads.v9.customermanagement.SearchClientLinksRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.SearchAccountsResponse searchAccounts(com.microsoft.bingads.v9.customermanagement.SearchAccountsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.SendUserInvitationResponse sendUserInvitation(com.microsoft.bingads.v9.customermanagement.SendUserInvitationRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.customermanagement.SearchUserInvitationsResponse searchUserInvitations(com.microsoft.bingads.v9.customermanagement.SearchUserInvitationsRequest parameters) throws java.rmi.RemoteException;
}
