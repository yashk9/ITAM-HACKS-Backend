package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="computer_info")
public class Computer_Info_Table {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String WindowsBuildLabEx;                                       
	private String WindowsCurrentVersion;                                  
	private String WindowsEditionId;                                        
	private String WindowsInstallationType;                                 
	private String WindowsInstallDateFromRegistry;                        
	private String WindowsProductId ;                                       
	private String WindowsProductName ;                                     
	private String WindowsRegisteredOrganization;                        
	private String WindowsRegisteredOwner;                       
	private String WindowsSystemRoot;                      
	private String WindowsVersion;                     
	private String BiosCharacteristics;                    
	private String BiosBIOSVersion;                   
	private String BiosBuildNumber;                  
	private String BiosCaption;                 
	private String BiosCodeSet 											   ;                
	private String BiosCurrentLanguage  								   ;               
	private String BiosDescription										   ;              
	private String BiosEmbeddedControllerMajorVersion 					   ;             
	private String BiosEmbeddedControllerMinorVersion					   ;           
	private String BiosFirmwareType										   ;            
	private String BiosIdentificationCode                                  ;
	private String BiosInstallableLanguages                                ;
	private String BiosInstallDate                                         ;
	private String BiosLanguageEdition                                     ;
	private String BiosListOfLanguages                                     ;
	private String BiosManufacturer                                        ;
	private String BiosName                                                ;
	private String BiosOtherTargetOS                                       ;
	private String BiosPrimaryBIOS                                         ;
	private String BiosReleaseDate                                         ;
	private String biosSeralNumber                                         ;
	private String BiosSMBIOSBIOSVersion                                   ;
	private String BiosSMBIOSMajorVersion                                  ;
	private String BiosSMBIOSMinorVersion                                  ;
	private String BiosSMBIOSPresent                                       ;
	private String BiosSoftwareElementState                                ;
	private String BiosStatus                                              ;
	private String BiosSystemBiosMajorVersion                              ;
	private String BiosSystemBiosMinorVersion                              ;
	private String BiosTargetOperatingSystem                               ;
	private String BiosVersion                                             ;
	private String CsAdminPasswordStatus                                   ;
	private String CsAutomaticManagedPagefile                              ;
	private String CsAutomaticResetBootOption                              ;
	private String CsAutomaticResetCapability                              ;
	private String CsBootOptionOnLimit                                     ;
	private String CsBootOptionOnWatchDog                                  ;
	private String CsBootROMSupported                                      ;
	private String CsBootStatus                                            ;
	private String CsBootupState                                           ;
	private String CsCaption                                               ;
	private String CsChassisBootupState                                    ;
	private String CsChassisSKUNumber                                      ;
	private String CsCurrentTimeZone                                       ;
	private String CsDaylightInEffect                                      ;
	private String CsDescription                                           ;
	private String CsDNSHostName                                           ;
	private String CsDomain                                                ;
	private String CsDomainRole                                            ;
	private String CsEnableDaylightSavingsTime                             ;
	private String CsFrontPanelResetStatus                                 ;
	private String CsHypervisorPresent                                     ;
	private String CsInfraredSupported                                     ;
	private String CsInitialLoadInfo                                       ;
	private String CsInstallDate                                           ;
	private String CsKeyboardPasswordStatus                                ;
	private String CsLastLoadInfo                                          ;
	private String CsManufacturer                                          ;
	private String CsModel                                                 ;
	private String CsName                                                  ;
	private String CsNetworkAdapters                                       ;
	private String CsNetworkServerModeEnabled                              ;
	private String CsNumberOfLogicalProcessors                             ;
	private String CsNumberOfProcessors                                    ;
	private String CsProcessors                                            ;
	private String CsOEMStringArray                                        ;
	private String CsPartOfDomain                                          ;
	private String CsPauseAfterReset                                       ;
	private String CsPCSystemType                                          ;
	private String CsPCSystemTypeEx                                        ;
	private String CsPowerManagementCapabilities                           ;
	private String CsPowerManagementSupported                              ;
	private String CsPowerOnPasswordStatus                                 ;
	private String CsPowerState                                            ;
	private String CsPowerSupplyState                                      ;
	private String CsPrimaryOwnerContact                                   ;
	private String CsPrimaryOwnerName                                      ;
	private String CsResetCapability                                       ;
	private String CsResetCount                                            ;
	private String CsResetLimit                                            ;
	private String CsRoles                                                 ;
	private String CsStatus                                                ;
	private String CsSupportContactDescription                             ;
	private String CsSystemFamily                                          ;
	private String CsSystemSKUNumber                                       ;
	private String CsSystemType                                            ;
	private String CsThermalState                                          ;
	private String CsTotalPhysicalMemory                                   ;
	private String CsPhyicallyInstalledMemory                              ;
	private String CsUserName                                              ;
	private String CsWakeUpType                                            ;
	private String CsWorkgroup                                             ;
	private String OsName                                                  ;
	private String OsType                                                  ;
	private String OsOperatingSystemSKU                                    ;
	private String OsVersion                                               ;
	private String OsCSDVersion                                            ;
	private String OsBuildNumber                                           ;
	private String OsHotFixes                                              ;
	private String OsBootDevice                                            ;
	private String OsSystemDevice                                          ;
	private String OsSystemDirectory                                       ;
	private String OsSystemDrive                                           ;
	private String OsWindowsDirectory                                      ;
	private String OsCountryCode                                           ;
	private String OsCurrentTimeZone                                       ;
	private String OsLocaleID                                              ;
	private String OsLocale                                                ;
	private String OsLocalDateTime                                         ;
	private String OsLastBootUpTime                                        ;
	private String OsUptime                                                ;
	private String OsBuildType                                             ;
	private String OsCodeSet                                               ;
	private String OsDataExecutionPreventionAvailable                      ;
	private String OsDataExecutionPrevention32BitApplications              ;
	private String OsDataExecutionPreventionDrivers                        ;
	private String OsDataExecutionPreventionSupportPolicy                  ;
	private String OsDebug                                                 ;
	private String OsDistributed                                           ;
	private String OsEncryptionLevel                                       ;
	private String OsForegroundApplicationBoost                            ;
	private String OsTotalVisibleMemorySize                                ;
	private String OsFreePhysicalMemory                                    ;
	private String OsTotalVirtualMemorySize                                ;
	private String OsFreeVirtualMemory                                     ;
	private String OsInUseVirtualMemory                                    ;
	private String OsTotalSwapSpaceSize                                    ;
	private String OsSizeStoredInPagingFiles                               ;
	private String OsFreeSpaceInPagingFiles                                ;
	private String OsPagingFiles                                           ;
	private String OsHardwareAbstractionLayer                              ;
	private String OsInstallDate                                           ;
	private String OsManufacturer                                          ;
	private String OsMaxNumberOfProcesses                                  ;
	private String OsMaxProcessMemorySize                                  ;
	private String OsMuiLanguages                                          ;
	private String OsNumberOfLicensedUsers                                 ;
	private String OsNumberOfProcesses                                     ;
	private String OsNumberOfUsers                                         ;
	private String OsOrganization                                          ;
	private String OsArchitecture                                          ;
	private String OsLanguage                                              ;
	private String OsProductSuites                                         ;
	private String OsOtherTypeDescription                                  ;
	private String OsPAEEnabled                                            ;
	private String OsPortableOperatingSystem                               ;
	private String OsPrimary                                               ;
	private String OsProductType                                           ;
	private String OsRegisteredUser                                        ;
	private String OsSerialNumber                                          ;
	private String OsServicePackMajorVersion                               ;
	private String OsServicePackMinorVersion                               ;
	private String OsStatus                                                ;
	private String OsSuites                                                ;
	private String OsServerLevel                                           ;
	private String KeyboardLayout                                          ;
	private String TimeZone                                                ;
	private String LogonServer                                             ;
	private String PowerPlatformRole                                       ;
	private String HyperVisorPresent                                       ;
	private String HyperVRequirementDataExecutionPreventionAvailable       ;
	private String HyperVRequirementSecondLevelAddressTranslation          ;
	private String HyperVRequirementVirtualizationFirmwareEnabled          ;
	private String HyperVRequirementVMMonitorModeExtensions                ;
	private String DeviceGuardSmartStatus                                  ;
	private String DeviceGuardRequiredSecurityProperties                   ;
	private String DeviceGuardAvailableSecurityProperties                  ;
	private String DeviceGuardSecurityServicesConfigured                   ;
	private String DeviceGuardSecurityServicesRunning                      ;
	private String DeviceGuardCodeIntegrityPolicyEnforcementStatus         ;
	private String DeviceGuardUserModeCodeIntegrityPolicyEnforcementStatus ;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getWindowsBuildLabEx() {
		return WindowsBuildLabEx;
	}
	public void setWindowsBuildLabEx(String windowsBuildLabEx) {
		WindowsBuildLabEx = windowsBuildLabEx;
	}
	public String getWindowsCurrentVersion() {
		return WindowsCurrentVersion;
	}
	public void setWindowsCurrentVersion(String windowsCurrentVersion) {
		WindowsCurrentVersion = windowsCurrentVersion;
	}
	public String getWindowsEditionId() {
		return WindowsEditionId;
	}
	public void setWindowsEditionId(String windowsEditionId) {
		WindowsEditionId = windowsEditionId;
	}
	public String getWindowsInstallationType() {
		return WindowsInstallationType;
	}
	public void setWindowsInstallationType(String windowsInstallationType) {
		WindowsInstallationType = windowsInstallationType;
	}
	public String getWindowsInstallDateFromRegistry() {
		return WindowsInstallDateFromRegistry;
	}
	public void setWindowsInstallDateFromRegistry(String windowsInstallDateFromRegistry) {
		WindowsInstallDateFromRegistry = windowsInstallDateFromRegistry;
	}
	public String getWindowsProductId() {
		return WindowsProductId;
	}
	public void setWindowsProductId(String windowsProductId) {
		WindowsProductId = windowsProductId;
	}
	public String getWindowsProductName() {
		return WindowsProductName;
	}
	public void setWindowsProductName(String windowsProductName) {
		WindowsProductName = windowsProductName;
	}
	public String getWindowsRegisteredOrganization() {
		return WindowsRegisteredOrganization;
	}
	public void setWindowsRegisteredOrganization(String windowsRegisteredOrganization) {
		WindowsRegisteredOrganization = windowsRegisteredOrganization;
	}
	public String getWindowsRegisteredOwner() {
		return WindowsRegisteredOwner;
	}
	public void setWindowsRegisteredOwner(String windowsRegisteredOwner) {
		WindowsRegisteredOwner = windowsRegisteredOwner;
	}
	public String getWindowsSystemRoot() {
		return WindowsSystemRoot;
	}
	public void setWindowsSystemRoot(String windowsSystemRoot) {
		WindowsSystemRoot = windowsSystemRoot;
	}
	public String getWindowsVersion() {
		return WindowsVersion;
	}
	public void setWindowsVersion(String windowsVersion) {
		WindowsVersion = windowsVersion;
	}
	public String getBiosCharacteristics() {
		return BiosCharacteristics;
	}
	public void setBiosCharacteristics(String biosCharacteristics) {
		BiosCharacteristics = biosCharacteristics;
	}
	public String getBiosBIOSVersion() {
		return BiosBIOSVersion;
	}
	public void setBiosBIOSVersion(String biosBIOSVersion) {
		BiosBIOSVersion = biosBIOSVersion;
	}
	public String getBiosBuildNumber() {
		return BiosBuildNumber;
	}
	public void setBiosBuildNumber(String biosBuildNumber) {
		BiosBuildNumber = biosBuildNumber;
	}
	public String getBiosCaption() {
		return BiosCaption;
	}
	public void setBiosCaption(String biosCaption) {
		BiosCaption = biosCaption;
	}
	public String getBiosCodeSet() {
		return BiosCodeSet;
	}
	public void setBiosCodeSet(String biosCodeSet) {
		BiosCodeSet = biosCodeSet;
	}
	public String getBiosCurrentLanguage() {
		return BiosCurrentLanguage;
	}
	public void setBiosCurrentLanguage(String biosCurrentLanguage) {
		BiosCurrentLanguage = biosCurrentLanguage;
	}
	public String getBiosDescription() {
		return BiosDescription;
	}
	public void setBiosDescription(String biosDescription) {
		BiosDescription = biosDescription;
	}
	public String getBiosEmbeddedControllerMajorVersion() {
		return BiosEmbeddedControllerMajorVersion;
	}
	public void setBiosEmbeddedControllerMajorVersion(String biosEmbeddedControllerMajorVersion) {
		BiosEmbeddedControllerMajorVersion = biosEmbeddedControllerMajorVersion;
	}
	public String getBiosEmbeddedControllerMinorVersion() {
		return BiosEmbeddedControllerMinorVersion;
	}
	public void setBiosEmbeddedControllerMinorVersion(String biosEmbeddedControllerMinorVersion) {
		BiosEmbeddedControllerMinorVersion = biosEmbeddedControllerMinorVersion;
	}
	public String getBiosFirmwareType() {
		return BiosFirmwareType;
	}
	public void setBiosFirmwareType(String biosFirmwareType) {
		BiosFirmwareType = biosFirmwareType;
	}
	public String getBiosIdentificationCode() {
		return BiosIdentificationCode;
	}
	public void setBiosIdentificationCode(String biosIdentificationCode) {
		BiosIdentificationCode = biosIdentificationCode;
	}
	public String getBiosInstallableLanguages() {
		return BiosInstallableLanguages;
	}
	public void setBiosInstallableLanguages(String biosInstallableLanguages) {
		BiosInstallableLanguages = biosInstallableLanguages;
	}
	public String getBiosInstallDate() {
		return BiosInstallDate;
	}
	public void setBiosInstallDate(String biosInstallDate) {
		BiosInstallDate = biosInstallDate;
	}
	public String getBiosLanguageEdition() {
		return BiosLanguageEdition;
	}
	public void setBiosLanguageEdition(String biosLanguageEdition) {
		BiosLanguageEdition = biosLanguageEdition;
	}
	public String getBiosListOfLanguages() {
		return BiosListOfLanguages;
	}
	public void setBiosListOfLanguages(String biosListOfLanguages) {
		BiosListOfLanguages = biosListOfLanguages;
	}
	public String getBiosManufacturer() {
		return BiosManufacturer;
	}
	public void setBiosManufacturer(String biosManufacturer) {
		BiosManufacturer = biosManufacturer;
	}
	public String getBiosName() {
		return BiosName;
	}
	public void setBiosName(String biosName) {
		BiosName = biosName;
	}
	public String getBiosOtherTargetOS() {
		return BiosOtherTargetOS;
	}
	public void setBiosOtherTargetOS(String biosOtherTargetOS) {
		BiosOtherTargetOS = biosOtherTargetOS;
	}
	public String getBiosPrimaryBIOS() {
		return BiosPrimaryBIOS;
	}
	public void setBiosPrimaryBIOS(String biosPrimaryBIOS) {
		BiosPrimaryBIOS = biosPrimaryBIOS;
	}
	public String getBiosReleaseDate() {
		return BiosReleaseDate;
	}
	public void setBiosReleaseDate(String biosReleaseDate) {
		BiosReleaseDate = biosReleaseDate;
	}
	
	public String getBiosSMBIOSBIOSVersion() {
		return BiosSMBIOSBIOSVersion;
	}
	public void setBiosSMBIOSBIOSVersion(String biosSMBIOSBIOSVersion) {
		BiosSMBIOSBIOSVersion = biosSMBIOSBIOSVersion;
	}
	public String getBiosSMBIOSMajorVersion() {
		return BiosSMBIOSMajorVersion;
	}
	public void setBiosSMBIOSMajorVersion(String biosSMBIOSMajorVersion) {
		BiosSMBIOSMajorVersion = biosSMBIOSMajorVersion;
	}
	public String getBiosSMBIOSMinorVersion() {
		return BiosSMBIOSMinorVersion;
	}
	public void setBiosSMBIOSMinorVersion(String biosSMBIOSMinorVersion) {
		BiosSMBIOSMinorVersion = biosSMBIOSMinorVersion;
	}
	public String getBiosSMBIOSPresent() {
		return BiosSMBIOSPresent;
	}
	public void setBiosSMBIOSPresent(String biosSMBIOSPresent) {
		BiosSMBIOSPresent = biosSMBIOSPresent;
	}
	public String getBiosSoftwareElementState() {
		return BiosSoftwareElementState;
	}
	public void setBiosSoftwareElementState(String biosSoftwareElementState) {
		BiosSoftwareElementState = biosSoftwareElementState;
	}
	public String getBiosStatus() {
		return BiosStatus;
	}
	public void setBiosStatus(String biosStatus) {
		BiosStatus = biosStatus;
	}
	public String getBiosSystemBiosMajorVersion() {
		return BiosSystemBiosMajorVersion;
	}
	public void setBiosSystemBiosMajorVersion(String biosSystemBiosMajorVersion) {
		BiosSystemBiosMajorVersion = biosSystemBiosMajorVersion;
	}
	public String getBiosSystemBiosMinorVersion() {
		return BiosSystemBiosMinorVersion;
	}
	public void setBiosSystemBiosMinorVersion(String biosSystemBiosMinorVersion) {
		BiosSystemBiosMinorVersion = biosSystemBiosMinorVersion;
	}
	public String getBiosTargetOperatingSystem() {
		return BiosTargetOperatingSystem;
	}
	public void setBiosTargetOperatingSystem(String biosTargetOperatingSystem) {
		BiosTargetOperatingSystem = biosTargetOperatingSystem;
	}
	public String getBiosVersion() {
		return BiosVersion;
	}
	public void setBiosVersion(String biosVersion) {
		BiosVersion = biosVersion;
	}
	public String getCsAdminPasswordStatus() {
		return CsAdminPasswordStatus;
	}
	public void setCsAdminPasswordStatus(String csAdminPasswordStatus) {
		CsAdminPasswordStatus = csAdminPasswordStatus;
	}
	public String getCsAutomaticManagedPagefile() {
		return CsAutomaticManagedPagefile;
	}
	public void setCsAutomaticManagedPagefile(String csAutomaticManagedPagefile) {
		CsAutomaticManagedPagefile = csAutomaticManagedPagefile;
	}
	public String getCsAutomaticResetBootOption() {
		return CsAutomaticResetBootOption;
	}
	public void setCsAutomaticResetBootOption(String csAutomaticResetBootOption) {
		CsAutomaticResetBootOption = csAutomaticResetBootOption;
	}
	public String getCsAutomaticResetCapability() {
		return CsAutomaticResetCapability;
	}
	public void setCsAutomaticResetCapability(String csAutomaticResetCapability) {
		CsAutomaticResetCapability = csAutomaticResetCapability;
	}
	public String getCsBootOptionOnLimit() {
		return CsBootOptionOnLimit;
	}
	public void setCsBootOptionOnLimit(String csBootOptionOnLimit) {
		CsBootOptionOnLimit = csBootOptionOnLimit;
	}
	public String getCsBootOptionOnWatchDog() {
		return CsBootOptionOnWatchDog;
	}
	public void setCsBootOptionOnWatchDog(String csBootOptionOnWatchDog) {
		CsBootOptionOnWatchDog = csBootOptionOnWatchDog;
	}
	public String getCsBootROMSupported() {
		return CsBootROMSupported;
	}
	public void setCsBootROMSupported(String csBootROMSupported) {
		CsBootROMSupported = csBootROMSupported;
	}
	public String getCsBootStatus() {
		return CsBootStatus;
	}
	public void setCsBootStatus(String csBootStatus) {
		CsBootStatus = csBootStatus;
	}
	public String getCsBootupState() {
		return CsBootupState;
	}
	public void setCsBootupState(String csBootupState) {
		CsBootupState = csBootupState;
	}
	public String getCsCaption() {
		return CsCaption;
	}
	public void setCsCaption(String csCaption) {
		CsCaption = csCaption;
	}
	public String getCsChassisBootupState() {
		return CsChassisBootupState;
	}
	public void setCsChassisBootupState(String csChassisBootupState) {
		CsChassisBootupState = csChassisBootupState;
	}
	public String getCsChassisSKUNumber() {
		return CsChassisSKUNumber;
	}
	public void setCsChassisSKUNumber(String csChassisSKUNumber) {
		CsChassisSKUNumber = csChassisSKUNumber;
	}
	public String getCsCurrentTimeZone() {
		return CsCurrentTimeZone;
	}
	public void setCsCurrentTimeZone(String csCurrentTimeZone) {
		CsCurrentTimeZone = csCurrentTimeZone;
	}
	public String getCsDaylightInEffect() {
		return CsDaylightInEffect;
	}
	public void setCsDaylightInEffect(String csDaylightInEffect) {
		CsDaylightInEffect = csDaylightInEffect;
	}
	public String getCsDescription() {
		return CsDescription;
	}
	public void setCsDescription(String csDescription) {
		CsDescription = csDescription;
	}
	public String getCsDNSHostName() {
		return CsDNSHostName;
	}
	public void setCsDNSHostName(String csDNSHostName) {
		CsDNSHostName = csDNSHostName;
	}
	public String getCsDomain() {
		return CsDomain;
	}
	public void setCsDomain(String csDomain) {
		CsDomain = csDomain;
	}
	public String getCsDomainRole() {
		return CsDomainRole;
	}
	public void setCsDomainRole(String csDomainRole) {
		CsDomainRole = csDomainRole;
	}
	public String getCsEnableDaylightSavingsTime() {
		return CsEnableDaylightSavingsTime;
	}
	public void setCsEnableDaylightSavingsTime(String csEnableDaylightSavingsTime) {
		CsEnableDaylightSavingsTime = csEnableDaylightSavingsTime;
	}
	public String getCsFrontPanelResetStatus() {
		return CsFrontPanelResetStatus;
	}
	public void setCsFrontPanelResetStatus(String csFrontPanelResetStatus) {
		CsFrontPanelResetStatus = csFrontPanelResetStatus;
	}
	public String getCsHypervisorPresent() {
		return CsHypervisorPresent;
	}
	public void setCsHypervisorPresent(String csHypervisorPresent) {
		CsHypervisorPresent = csHypervisorPresent;
	}
	public String getCsInfraredSupported() {
		return CsInfraredSupported;
	}
	public void setCsInfraredSupported(String csInfraredSupported) {
		CsInfraredSupported = csInfraredSupported;
	}
	public String getCsInitialLoadInfo() {
		return CsInitialLoadInfo;
	}
	public void setCsInitialLoadInfo(String csInitialLoadInfo) {
		CsInitialLoadInfo = csInitialLoadInfo;
	}
	public String getCsInstallDate() {
		return CsInstallDate;
	}
	public void setCsInstallDate(String csInstallDate) {
		CsInstallDate = csInstallDate;
	}
	public String getCsKeyboardPasswordStatus() {
		return CsKeyboardPasswordStatus;
	}
	public void setCsKeyboardPasswordStatus(String csKeyboardPasswordStatus) {
		CsKeyboardPasswordStatus = csKeyboardPasswordStatus;
	}
	public String getCsLastLoadInfo() {
		return CsLastLoadInfo;
	}
	public void setCsLastLoadInfo(String csLastLoadInfo) {
		CsLastLoadInfo = csLastLoadInfo;
	}
	public String getCsManufacturer() {
		return CsManufacturer;
	}
	public void setCsManufacturer(String csManufacturer) {
		CsManufacturer = csManufacturer;
	}
	public String getCsModel() {
		return CsModel;
	}
	public void setCsModel(String csModel) {
		CsModel = csModel;
	}
	public String getCsName() {
		return CsName;
	}
	public void setCsName(String csName) {
		CsName = csName;
	}
	public String getCsNetworkAdapters() {
		return CsNetworkAdapters;
	}
	public void setCsNetworkAdapters(String csNetworkAdapters) {
		CsNetworkAdapters = csNetworkAdapters;
	}
	public String getCsNetworkServerModeEnabled() {
		return CsNetworkServerModeEnabled;
	}
	public void setCsNetworkServerModeEnabled(String csNetworkServerModeEnabled) {
		CsNetworkServerModeEnabled = csNetworkServerModeEnabled;
	}
	public String getCsNumberOfLogicalProcessors() {
		return CsNumberOfLogicalProcessors;
	}
	public void setCsNumberOfLogicalProcessors(String csNumberOfLogicalProcessors) {
		CsNumberOfLogicalProcessors = csNumberOfLogicalProcessors;
	}
	public String getCsNumberOfProcessors() {
		return CsNumberOfProcessors;
	}
	public void setCsNumberOfProcessors(String csNumberOfProcessors) {
		CsNumberOfProcessors = csNumberOfProcessors;
	}
	public String getCsProcessors() {
		return CsProcessors;
	}
	public void setCsProcessors(String csProcessors) {
		CsProcessors = csProcessors;
	}
	public String getCsOEMStringArray() {
		return CsOEMStringArray;
	}
	public void setCsOEMStringArray(String csOEMStringArray) {
		CsOEMStringArray = csOEMStringArray;
	}
	public String getCsPartOfDomain() {
		return CsPartOfDomain;
	}
	public void setCsPartOfDomain(String csPartOfDomain) {
		CsPartOfDomain = csPartOfDomain;
	}
	public String getCsPauseAfterReset() {
		return CsPauseAfterReset;
	}
	public void setCsPauseAfterReset(String csPauseAfterReset) {
		CsPauseAfterReset = csPauseAfterReset;
	}
	public String getCsPCSystemType() {
		return CsPCSystemType;
	}
	public void setCsPCSystemType(String csPCSystemType) {
		CsPCSystemType = csPCSystemType;
	}
	public String getCsPCSystemTypeEx() {
		return CsPCSystemTypeEx;
	}
	public void setCsPCSystemTypeEx(String csPCSystemTypeEx) {
		CsPCSystemTypeEx = csPCSystemTypeEx;
	}
	public String getCsPowerManagementCapabilities() {
		return CsPowerManagementCapabilities;
	}
	public void setCsPowerManagementCapabilities(String csPowerManagementCapabilities) {
		CsPowerManagementCapabilities = csPowerManagementCapabilities;
	}
	public String getCsPowerManagementSupported() {
		return CsPowerManagementSupported;
	}
	public void setCsPowerManagementSupported(String csPowerManagementSupported) {
		CsPowerManagementSupported = csPowerManagementSupported;
	}
	public String getCsPowerOnPasswordStatus() {
		return CsPowerOnPasswordStatus;
	}
	public void setCsPowerOnPasswordStatus(String csPowerOnPasswordStatus) {
		CsPowerOnPasswordStatus = csPowerOnPasswordStatus;
	}
	public String getCsPowerState() {
		return CsPowerState;
	}
	public void setCsPowerState(String csPowerState) {
		CsPowerState = csPowerState;
	}
	public String getCsPowerSupplyState() {
		return CsPowerSupplyState;
	}
	public void setCsPowerSupplyState(String csPowerSupplyState) {
		CsPowerSupplyState = csPowerSupplyState;
	}
	public String getCsPrimaryOwnerContact() {
		return CsPrimaryOwnerContact;
	}
	public void setCsPrimaryOwnerContact(String csPrimaryOwnerContact) {
		CsPrimaryOwnerContact = csPrimaryOwnerContact;
	}
	public String getCsPrimaryOwnerName() {
		return CsPrimaryOwnerName;
	}
	public void setCsPrimaryOwnerName(String csPrimaryOwnerName) {
		CsPrimaryOwnerName = csPrimaryOwnerName;
	}
	public String getCsResetCapability() {
		return CsResetCapability;
	}
	public void setCsResetCapability(String csResetCapability) {
		CsResetCapability = csResetCapability;
	}
	public String getCsResetCount() {
		return CsResetCount;
	}
	public void setCsResetCount(String csResetCount) {
		CsResetCount = csResetCount;
	}
	public String getCsResetLimit() {
		return CsResetLimit;
	}
	public void setCsResetLimit(String csResetLimit) {
		CsResetLimit = csResetLimit;
	}
	public String getCsRoles() {
		return CsRoles;
	}
	public void setCsRoles(String csRoles) {
		CsRoles = csRoles;
	}
	public String getCsStatus() {
		return CsStatus;
	}
	public void setCsStatus(String csStatus) {
		CsStatus = csStatus;
	}
	public String getCsSupportContactDescription() {
		return CsSupportContactDescription;
	}
	public void setCsSupportContactDescription(String csSupportContactDescription) {
		CsSupportContactDescription = csSupportContactDescription;
	}
	public String getCsSystemFamily() {
		return CsSystemFamily;
	}
	public void setCsSystemFamily(String csSystemFamily) {
		CsSystemFamily = csSystemFamily;
	}
	public String getCsSystemSKUNumber() {
		return CsSystemSKUNumber;
	}
	public void setCsSystemSKUNumber(String csSystemSKUNumber) {
		CsSystemSKUNumber = csSystemSKUNumber;
	}
	public String getCsSystemType() {
		return CsSystemType;
	}
	public void setCsSystemType(String csSystemType) {
		CsSystemType = csSystemType;
	}
	public String getCsThermalState() {
		return CsThermalState;
	}
	public void setCsThermalState(String csThermalState) {
		CsThermalState = csThermalState;
	}
	public String getCsTotalPhysicalMemory() {
		return CsTotalPhysicalMemory;
	}
	public void setCsTotalPhysicalMemory(String csTotalPhysicalMemory) {
		CsTotalPhysicalMemory = csTotalPhysicalMemory;
	}
	public String getCsPhyicallyInstalledMemory() {
		return CsPhyicallyInstalledMemory;
	}
	public void setCsPhyicallyInstalledMemory(String csPhyicallyInstalledMemory) {
		CsPhyicallyInstalledMemory = csPhyicallyInstalledMemory;
	}
	public String getCsUserName() {
		return CsUserName;
	}
	public void setCsUserName(String csUserName) {
		CsUserName = csUserName;
	}
	public String getCsWakeUpType() {
		return CsWakeUpType;
	}
	public void setCsWakeUpType(String csWakeUpType) {
		CsWakeUpType = csWakeUpType;
	}
	public String getCsWorkgroup() {
		return CsWorkgroup;
	}
	public void setCsWorkgroup(String csWorkgroup) {
		CsWorkgroup = csWorkgroup;
	}
	public String getOsName() {
		return OsName;
	}
	public void setOsName(String osName) {
		OsName = osName;
	}
	public String getOsType() {
		return OsType;
	}
	public void setOsType(String osType) {
		OsType = osType;
	}
	public String getOsOperatingSystemSKU() {
		return OsOperatingSystemSKU;
	}
	public void setOsOperatingSystemSKU(String osOperatingSystemSKU) {
		OsOperatingSystemSKU = osOperatingSystemSKU;
	}
	public String getOsVersion() {
		return OsVersion;
	}
	public void setOsVersion(String osVersion) {
		OsVersion = osVersion;
	}
	public String getOsCSDVersion() {
		return OsCSDVersion;
	}
	public void setOsCSDVersion(String osCSDVersion) {
		OsCSDVersion = osCSDVersion;
	}
	public String getOsBuildNumber() {
		return OsBuildNumber;
	}
	public void setOsBuildNumber(String osBuildNumber) {
		OsBuildNumber = osBuildNumber;
	}
	public String getOsHotFixes() {
		return OsHotFixes;
	}
	public void setOsHotFixes(String osHotFixes) {
		OsHotFixes = osHotFixes;
	}
	public String getOsBootDevice() {
		return OsBootDevice;
	}
	public void setOsBootDevice(String osBootDevice) {
		OsBootDevice = osBootDevice;
	}
	public String getOsSystemDevice() {
		return OsSystemDevice;
	}
	public void setOsSystemDevice(String osSystemDevice) {
		OsSystemDevice = osSystemDevice;
	}
	public String getOsSystemDirectory() {
		return OsSystemDirectory;
	}
	public void setOsSystemDirectory(String osSystemDirectory) {
		OsSystemDirectory = osSystemDirectory;
	}
	public String getOsSystemDrive() {
		return OsSystemDrive;
	}
	public void setOsSystemDrive(String osSystemDrive) {
		OsSystemDrive = osSystemDrive;
	}
	public String getOsWindowsDirectory() {
		return OsWindowsDirectory;
	}
	public void setOsWindowsDirectory(String osWindowsDirectory) {
		OsWindowsDirectory = osWindowsDirectory;
	}
	public String getOsCountryCode() {
		return OsCountryCode;
	}
	public void setOsCountryCode(String osCountryCode) {
		OsCountryCode = osCountryCode;
	}
	public String getOsCurrentTimeZone() {
		return OsCurrentTimeZone;
	}
	public void setOsCurrentTimeZone(String osCurrentTimeZone) {
		OsCurrentTimeZone = osCurrentTimeZone;
	}
	public String getOsLocaleID() {
		return OsLocaleID;
	}
	public void setOsLocaleID(String osLocaleID) {
		OsLocaleID = osLocaleID;
	}
	public String getOsLocale() {
		return OsLocale;
	}
	public void setOsLocale(String osLocale) {
		OsLocale = osLocale;
	}
	public String getOsLocalDateTime() {
		return OsLocalDateTime;
	}
	public void setOsLocalDateTime(String osLocalDateTime) {
		OsLocalDateTime = osLocalDateTime;
	}
	public String getOsLastBootUpTime() {
		return OsLastBootUpTime;
	}
	public void setOsLastBootUpTime(String osLastBootUpTime) {
		OsLastBootUpTime = osLastBootUpTime;
	}
	public String getOsUptime() {
		return OsUptime;
	}
	public void setOsUptime(String osUptime) {
		OsUptime = osUptime;
	}
	public String getOsBuildType() {
		return OsBuildType;
	}
	public void setOsBuildType(String osBuildType) {
		OsBuildType = osBuildType;
	}
	public String getOsCodeSet() {
		return OsCodeSet;
	}
	public void setOsCodeSet(String osCodeSet) {
		OsCodeSet = osCodeSet;
	}
	public String getOsDataExecutionPreventionAvailable() {
		return OsDataExecutionPreventionAvailable;
	}
	public void setOsDataExecutionPreventionAvailable(String osDataExecutionPreventionAvailable) {
		OsDataExecutionPreventionAvailable = osDataExecutionPreventionAvailable;
	}
	public String getOsDataExecutionPrevention32BitApplications() {
		return OsDataExecutionPrevention32BitApplications;
	}
	public void setOsDataExecutionPrevention32BitApplications(String osDataExecutionPrevention32BitApplications) {
		OsDataExecutionPrevention32BitApplications = osDataExecutionPrevention32BitApplications;
	}
	public String getOsDataExecutionPreventionDrivers() {
		return OsDataExecutionPreventionDrivers;
	}
	public void setOsDataExecutionPreventionDrivers(String osDataExecutionPreventionDrivers) {
		OsDataExecutionPreventionDrivers = osDataExecutionPreventionDrivers;
	}
	public String getOsDataExecutionPreventionSupportPolicy() {
		return OsDataExecutionPreventionSupportPolicy;
	}
	public void setOsDataExecutionPreventionSupportPolicy(String osDataExecutionPreventionSupportPolicy) {
		OsDataExecutionPreventionSupportPolicy = osDataExecutionPreventionSupportPolicy;
	}
	public String getOsDebug() {
		return OsDebug;
	}
	public void setOsDebug(String osDebug) {
		OsDebug = osDebug;
	}
	public String getOsDistributed() {
		return OsDistributed;
	}
	public void setOsDistributed(String osDistributed) {
		OsDistributed = osDistributed;
	}
	public String getOsEncryptionLevel() {
		return OsEncryptionLevel;
	}
	public void setOsEncryptionLevel(String osEncryptionLevel) {
		OsEncryptionLevel = osEncryptionLevel;
	}
	public String getOsForegroundApplicationBoost() {
		return OsForegroundApplicationBoost;
	}
	public void setOsForegroundApplicationBoost(String osForegroundApplicationBoost) {
		OsForegroundApplicationBoost = osForegroundApplicationBoost;
	}
	public String getOsTotalVisibleMemorySize() {
		return OsTotalVisibleMemorySize;
	}
	public void setOsTotalVisibleMemorySize(String osTotalVisibleMemorySize) {
		OsTotalVisibleMemorySize = osTotalVisibleMemorySize;
	}
	public String getOsFreePhysicalMemory() {
		return OsFreePhysicalMemory;
	}
	public void setOsFreePhysicalMemory(String osFreePhysicalMemory) {
		OsFreePhysicalMemory = osFreePhysicalMemory;
	}
	public String getOsTotalVirtualMemorySize() {
		return OsTotalVirtualMemorySize;
	}
	public void setOsTotalVirtualMemorySize(String osTotalVirtualMemorySize) {
		OsTotalVirtualMemorySize = osTotalVirtualMemorySize;
	}
	public String getOsFreeVirtualMemory() {
		return OsFreeVirtualMemory;
	}
	public void setOsFreeVirtualMemory(String osFreeVirtualMemory) {
		OsFreeVirtualMemory = osFreeVirtualMemory;
	}
	public String getOsInUseVirtualMemory() {
		return OsInUseVirtualMemory;
	}
	public void setOsInUseVirtualMemory(String osInUseVirtualMemory) {
		OsInUseVirtualMemory = osInUseVirtualMemory;
	}
	public String getOsTotalSwapSpaceSize() {
		return OsTotalSwapSpaceSize;
	}
	public void setOsTotalSwapSpaceSize(String osTotalSwapSpaceSize) {
		OsTotalSwapSpaceSize = osTotalSwapSpaceSize;
	}
	public String getOsSizeStoredInPagingFiles() {
		return OsSizeStoredInPagingFiles;
	}
	public void setOsSizeStoredInPagingFiles(String osSizeStoredInPagingFiles) {
		OsSizeStoredInPagingFiles = osSizeStoredInPagingFiles;
	}
	public String getOsFreeSpaceInPagingFiles() {
		return OsFreeSpaceInPagingFiles;
	}
	public void setOsFreeSpaceInPagingFiles(String osFreeSpaceInPagingFiles) {
		OsFreeSpaceInPagingFiles = osFreeSpaceInPagingFiles;
	}
	public String getOsPagingFiles() {
		return OsPagingFiles;
	}
	public void setOsPagingFiles(String osPagingFiles) {
		OsPagingFiles = osPagingFiles;
	}
	public String getOsHardwareAbstractionLayer() {
		return OsHardwareAbstractionLayer;
	}
	public void setOsHardwareAbstractionLayer(String osHardwareAbstractionLayer) {
		OsHardwareAbstractionLayer = osHardwareAbstractionLayer;
	}
	public String getOsInstallDate() {
		return OsInstallDate;
	}
	public void setOsInstallDate(String osInstallDate) {
		OsInstallDate = osInstallDate;
	}
	public String getOsManufacturer() {
		return OsManufacturer;
	}
	public void setOsManufacturer(String osManufacturer) {
		OsManufacturer = osManufacturer;
	}
	public String getOsMaxNumberOfProcesses() {
		return OsMaxNumberOfProcesses;
	}
	public void setOsMaxNumberOfProcesses(String osMaxNumberOfProcesses) {
		OsMaxNumberOfProcesses = osMaxNumberOfProcesses;
	}
	public String getOsMaxProcessMemorySize() {
		return OsMaxProcessMemorySize;
	}
	public void setOsMaxProcessMemorySize(String osMaxProcessMemorySize) {
		OsMaxProcessMemorySize = osMaxProcessMemorySize;
	}
	public String getOsMuiLanguages() {
		return OsMuiLanguages;
	}
	public void setOsMuiLanguages(String osMuiLanguages) {
		OsMuiLanguages = osMuiLanguages;
	}
	public String getOsNumberOfLicensedUsers() {
		return OsNumberOfLicensedUsers;
	}
	public void setOsNumberOfLicensedUsers(String osNumberOfLicensedUsers) {
		OsNumberOfLicensedUsers = osNumberOfLicensedUsers;
	}
	public String getOsNumberOfProcesses() {
		return OsNumberOfProcesses;
	}
	public void setOsNumberOfProcesses(String osNumberOfProcesses) {
		OsNumberOfProcesses = osNumberOfProcesses;
	}
	public String getOsNumberOfUsers() {
		return OsNumberOfUsers;
	}
	public void setOsNumberOfUsers(String osNumberOfUsers) {
		OsNumberOfUsers = osNumberOfUsers;
	}
	public String getOsOrganization() {
		return OsOrganization;
	}
	public void setOsOrganization(String osOrganization) {
		OsOrganization = osOrganization;
	}
	public String getOsArchitecture() {
		return OsArchitecture;
	}
	public void setOsArchitecture(String osArchitecture) {
		OsArchitecture = osArchitecture;
	}
	public String getOsLanguage() {
		return OsLanguage;
	}
	public void setOsLanguage(String osLanguage) {
		OsLanguage = osLanguage;
	}
	public String getOsProductSuites() {
		return OsProductSuites;
	}
	public void setOsProductSuites(String osProductSuites) {
		OsProductSuites = osProductSuites;
	}
	public String getOsOtherTypeDescription() {
		return OsOtherTypeDescription;
	}
	public void setOsOtherTypeDescription(String osOtherTypeDescription) {
		OsOtherTypeDescription = osOtherTypeDescription;
	}
	public String getOsPAEEnabled() {
		return OsPAEEnabled;
	}
	public void setOsPAEEnabled(String osPAEEnabled) {
		OsPAEEnabled = osPAEEnabled;
	}
	public String getOsPortableOperatingSystem() {
		return OsPortableOperatingSystem;
	}
	public void setOsPortableOperatingSystem(String osPortableOperatingSystem) {
		OsPortableOperatingSystem = osPortableOperatingSystem;
	}
	public String getOsPrimary() {
		return OsPrimary;
	}
	public void setOsPrimary(String osPrimary) {
		OsPrimary = osPrimary;
	}
	public String getOsProductType() {
		return OsProductType;
	}
	public void setOsProductType(String osProductType) {
		OsProductType = osProductType;
	}
	public String getOsRegisteredUser() {
		return OsRegisteredUser;
	}
	public void setOsRegisteredUser(String osRegisteredUser) {
		OsRegisteredUser = osRegisteredUser;
	}
	public String getOsSerialNumber() {
		return OsSerialNumber;
	}
	public void setOsSerialNumber(String osSerialNumber) {
		OsSerialNumber = osSerialNumber;
	}
	public String getOsServicePackMajorVersion() {
		return OsServicePackMajorVersion;
	}
	public void setOsServicePackMajorVersion(String osServicePackMajorVersion) {
		OsServicePackMajorVersion = osServicePackMajorVersion;
	}
	public String getOsServicePackMinorVersion() {
		return OsServicePackMinorVersion;
	}
	public void setOsServicePackMinorVersion(String osServicePackMinorVersion) {
		OsServicePackMinorVersion = osServicePackMinorVersion;
	}
	public String getOsStatus() {
		return OsStatus;
	}
	public void setOsStatus(String osStatus) {
		OsStatus = osStatus;
	}
	public String getOsSuites() {
		return OsSuites;
	}
	public void setOsSuites(String osSuites) {
		OsSuites = osSuites;
	}
	public String getOsServerLevel() {
		return OsServerLevel;
	}
	public void setOsServerLevel(String osServerLevel) {
		OsServerLevel = osServerLevel;
	}
	public String getKeyboardLayout() {
		return KeyboardLayout;
	}
	public void setKeyboardLayout(String keyboardLayout) {
		KeyboardLayout = keyboardLayout;
	}
	public String getTimeZone() {
		return TimeZone;
	}
	public void setTimeZone(String timeZone) {
		TimeZone = timeZone;
	}
	public String getLogonServer() {
		return LogonServer;
	}
	public void setLogonServer(String logonServer) {
		LogonServer = logonServer;
	}
	public String getPowerPlatformRole() {
		return PowerPlatformRole;
	}
	public void setPowerPlatformRole(String powerPlatformRole) {
		PowerPlatformRole = powerPlatformRole;
	}
	public String getHyperVisorPresent() {
		return HyperVisorPresent;
	}
	public void setHyperVisorPresent(String hyperVisorPresent) {
		HyperVisorPresent = hyperVisorPresent;
	}
	public String getHyperVRequirementDataExecutionPreventionAvailable() {
		return HyperVRequirementDataExecutionPreventionAvailable;
	}
	public void setHyperVRequirementDataExecutionPreventionAvailable(
			String hyperVRequirementDataExecutionPreventionAvailable) {
		HyperVRequirementDataExecutionPreventionAvailable = hyperVRequirementDataExecutionPreventionAvailable;
	}
	public String getHyperVRequirementSecondLevelAddressTranslation() {
		return HyperVRequirementSecondLevelAddressTranslation;
	}
	public void setHyperVRequirementSecondLevelAddressTranslation(String hyperVRequirementSecondLevelAddressTranslation) {
		HyperVRequirementSecondLevelAddressTranslation = hyperVRequirementSecondLevelAddressTranslation;
	}
	public String getHyperVRequirementVirtualizationFirmwareEnabled() {
		return HyperVRequirementVirtualizationFirmwareEnabled;
	}
	public void setHyperVRequirementVirtualizationFirmwareEnabled(String hyperVRequirementVirtualizationFirmwareEnabled) {
		HyperVRequirementVirtualizationFirmwareEnabled = hyperVRequirementVirtualizationFirmwareEnabled;
	}
	public String getHyperVRequirementVMMonitorModeExtensions() {
		return HyperVRequirementVMMonitorModeExtensions;
	}
	public void setHyperVRequirementVMMonitorModeExtensions(String hyperVRequirementVMMonitorModeExtensions) {
		HyperVRequirementVMMonitorModeExtensions = hyperVRequirementVMMonitorModeExtensions;
	}
	public String getDeviceGuardSmartStatus() {
		return DeviceGuardSmartStatus;
	}
	public void setDeviceGuardSmartStatus(String deviceGuardSmartStatus) {
		DeviceGuardSmartStatus = deviceGuardSmartStatus;
	}
	public String getDeviceGuardRequiredSecurityProperties() {
		return DeviceGuardRequiredSecurityProperties;
	}
	public void setDeviceGuardRequiredSecurityProperties(String deviceGuardRequiredSecurityProperties) {
		DeviceGuardRequiredSecurityProperties = deviceGuardRequiredSecurityProperties;
	}
	public String getDeviceGuardAvailableSecurityProperties() {
		return DeviceGuardAvailableSecurityProperties;
	}
	public void setDeviceGuardAvailableSecurityProperties(String deviceGuardAvailableSecurityProperties) {
		DeviceGuardAvailableSecurityProperties = deviceGuardAvailableSecurityProperties;
	}
	public String getDeviceGuardSecurityServicesConfigured() {
		return DeviceGuardSecurityServicesConfigured;
	}
	public void setDeviceGuardSecurityServicesConfigured(String deviceGuardSecurityServicesConfigured) {
		DeviceGuardSecurityServicesConfigured = deviceGuardSecurityServicesConfigured;
	}
	public String getDeviceGuardSecurityServicesRunning() {
		return DeviceGuardSecurityServicesRunning;
	}
	public void setDeviceGuardSecurityServicesRunning(String deviceGuardSecurityServicesRunning) {
		DeviceGuardSecurityServicesRunning = deviceGuardSecurityServicesRunning;
	}
	public String getDeviceGuardCodeIntegrityPolicyEnforcementStatus() {
		return DeviceGuardCodeIntegrityPolicyEnforcementStatus;
	}
	public void setDeviceGuardCodeIntegrityPolicyEnforcementStatus(String deviceGuardCodeIntegrityPolicyEnforcementStatus) {
		DeviceGuardCodeIntegrityPolicyEnforcementStatus = deviceGuardCodeIntegrityPolicyEnforcementStatus;
	}
	public String getDeviceGuardUserModeCodeIntegrityPolicyEnforcementStatus() {
		return DeviceGuardUserModeCodeIntegrityPolicyEnforcementStatus;
	}
	public void setDeviceGuardUserModeCodeIntegrityPolicyEnforcementStatus(
			String deviceGuardUserModeCodeIntegrityPolicyEnforcementStatus) {
		DeviceGuardUserModeCodeIntegrityPolicyEnforcementStatus = deviceGuardUserModeCodeIntegrityPolicyEnforcementStatus;
	}
	public String getBiosSeralNumber() {
		return biosSeralNumber;
	}
	public void setBiosSeralNumber(String biosSeralNumber) {
		this.biosSeralNumber = biosSeralNumber;
	}

	
}
