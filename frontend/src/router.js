
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReservationPlatformDevelopmentUserManager from "./components/listers/ReservationPlatformDevelopmentUserCards"
import ReservationPlatformDevelopmentUserDetail from "./components/listers/ReservationPlatformDevelopmentUserDetail"
import ReservationPlatformDevelopmentHotelManager from "./components/listers/ReservationPlatformDevelopmentHotelCards"
import ReservationPlatformDevelopmentHotelDetail from "./components/listers/ReservationPlatformDevelopmentHotelDetail"
import ReservationPlatformDevelopmentReservationManager from "./components/listers/ReservationPlatformDevelopmentReservationCards"
import ReservationPlatformDevelopmentReservationDetail from "./components/listers/ReservationPlatformDevelopmentReservationDetail"

import PartnershipManagementHotelPartnerManager from "./components/listers/PartnershipManagementHotelPartnerCards"
import PartnershipManagementHotelPartnerDetail from "./components/listers/PartnershipManagementHotelPartnerDetail"
import PartnershipManagementTravelAgencyManager from "./components/listers/PartnershipManagementTravelAgencyCards"
import PartnershipManagementTravelAgencyDetail from "./components/listers/PartnershipManagementTravelAgencyDetail"

import MarketingAndAdvertisingMarketingCampaignManager from "./components/listers/MarketingAndAdvertisingMarketingCampaignCards"
import MarketingAndAdvertisingMarketingCampaignDetail from "./components/listers/MarketingAndAdvertisingMarketingCampaignDetail"

import CustomerSupportAndAssistanceCustomerSupportTicketManager from "./components/listers/CustomerSupportAndAssistanceCustomerSupportTicketCards"
import CustomerSupportAndAssistanceCustomerSupportTicketDetail from "./components/listers/CustomerSupportAndAssistanceCustomerSupportTicketDetail"

import FinancialManagementFinancialReportManager from "./components/listers/FinancialManagementFinancialReportCards"
import FinancialManagementFinancialReportDetail from "./components/listers/FinancialManagementFinancialReportDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reservationPlatformDevelopments/users',
                name: 'ReservationPlatformDevelopmentUserManager',
                component: ReservationPlatformDevelopmentUserManager
            },
            {
                path: '/reservationPlatformDevelopments/users/:id',
                name: 'ReservationPlatformDevelopmentUserDetail',
                component: ReservationPlatformDevelopmentUserDetail
            },
            {
                path: '/reservationPlatformDevelopments/hotels',
                name: 'ReservationPlatformDevelopmentHotelManager',
                component: ReservationPlatformDevelopmentHotelManager
            },
            {
                path: '/reservationPlatformDevelopments/hotels/:id',
                name: 'ReservationPlatformDevelopmentHotelDetail',
                component: ReservationPlatformDevelopmentHotelDetail
            },
            {
                path: '/reservationPlatformDevelopments/reservations',
                name: 'ReservationPlatformDevelopmentReservationManager',
                component: ReservationPlatformDevelopmentReservationManager
            },
            {
                path: '/reservationPlatformDevelopments/reservations/:id',
                name: 'ReservationPlatformDevelopmentReservationDetail',
                component: ReservationPlatformDevelopmentReservationDetail
            },

            {
                path: '/partnershipManagements/hotelPartners',
                name: 'PartnershipManagementHotelPartnerManager',
                component: PartnershipManagementHotelPartnerManager
            },
            {
                path: '/partnershipManagements/hotelPartners/:id',
                name: 'PartnershipManagementHotelPartnerDetail',
                component: PartnershipManagementHotelPartnerDetail
            },
            {
                path: '/partnershipManagements/travelAgencies',
                name: 'PartnershipManagementTravelAgencyManager',
                component: PartnershipManagementTravelAgencyManager
            },
            {
                path: '/partnershipManagements/travelAgencies/:id',
                name: 'PartnershipManagementTravelAgencyDetail',
                component: PartnershipManagementTravelAgencyDetail
            },

            {
                path: '/marketingAndAdvertisings/marketingCampaigns',
                name: 'MarketingAndAdvertisingMarketingCampaignManager',
                component: MarketingAndAdvertisingMarketingCampaignManager
            },
            {
                path: '/marketingAndAdvertisings/marketingCampaigns/:id',
                name: 'MarketingAndAdvertisingMarketingCampaignDetail',
                component: MarketingAndAdvertisingMarketingCampaignDetail
            },

            {
                path: '/customerSupportAndAssistances/customerSupportTickets',
                name: 'CustomerSupportAndAssistanceCustomerSupportTicketManager',
                component: CustomerSupportAndAssistanceCustomerSupportTicketManager
            },
            {
                path: '/customerSupportAndAssistances/customerSupportTickets/:id',
                name: 'CustomerSupportAndAssistanceCustomerSupportTicketDetail',
                component: CustomerSupportAndAssistanceCustomerSupportTicketDetail
            },

            {
                path: '/financialManagements/financialReports',
                name: 'FinancialManagementFinancialReportManager',
                component: FinancialManagementFinancialReportManager
            },
            {
                path: '/financialManagements/financialReports/:id',
                name: 'FinancialManagementFinancialReportDetail',
                component: FinancialManagementFinancialReportDetail
            },



    ]
})
