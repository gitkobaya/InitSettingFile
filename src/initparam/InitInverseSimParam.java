package initparam;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

import initsettingfile.InitSettingFileRead;

public class InitInverseSimParam extends InitSettingFileRead
{
	private int iConsultationRoomNumMax;					// 診察室数の最大値
	private int iConsultationRoomNumMin;					// 診察室数の最小値
	private int iConsultationRoomTotalDoctorNumMax;			// 診察室に所属する医師の総数の最大値
	private int iConsultationRoomTotalDoctorNumMin;			// 診察室に所属する医師の総数の最小値
	private int iConsultationRoomDoctorNumMax;				// 1診察室に所属する医師の最大値
	private int iConsultationRoomDoctorNumMin;				// 1診察室に所属する医師の最小値
	private int iConsultationRoomTotalNurseNumMax;			// 診察室に所属する看護師の総数の最大値
	private int iConsultationRoomTotalNurseNumMin;			// 診察室に所属する看護師の総数の最小値
	private int iConsultationRoomNurseNumMax;				// 1診察室に所属する看護師の最大値
	private int iConsultationRoomNurseNumMin;				// 1診察室に所属する看護師の最小値

	private int iOperationRoomNumMax;						// 手術室数の最大値
	private int iOperationRoomNumMin;						// 手術室数の最小値
	private int iOperationRoomTotalDoctorNumMax;			// 手術室に所属する医師の総数の最大値
	private int iOperationRoomTotalDoctorNumMin;			// 手術室に所属する医師の総数の最小値
	private int iOperationRoomDoctorNumMax;					// 1手術室に所属する医師の最大値
	private int iOperationRoomDoctorNumMin;					// 1手術室に所属する医師の最小値
	private int iOperationRoomTotalNurseNumMax;				// 1手術室に所属する看護師の総数の最大値
	private int iOperationRoomTotalNurseNumMin;				// 1手術室に所属する看護師の総数の最小値
	private int iOperationRoomNurseNumMax;					// 1手術室に所属する看護師の最大値
	private int iOperationRoomNurseNumMin;					// 1手術室に所属する看護師の最小値

	private int iEmergencyRoomNumMax;						// 初療室数の最大値
	private int iEmergencyRoomNumMin;						// 初療室数の最小値
	private int iEmergencyRoomTotalDoctorNumMax;			// 初療室に所属する医師の総数の最大値
	private int iEmergencyRoomTotalDoctorNumMin;			// 初療室に所属する医師の総数の最小値
	private int iEmergencyRoomDoctorNumMax;					// 1初療室に所属する医師の最大値
	private int iEmergencyRoomDoctorNumMin;					// 1初療室に所属する医師の最小値
	private int iEmergencyRoomTotalNurseNumMax;				// 初療室に所属する看護師の総数の最大値
	private int iEmergencyRoomTotalNurseNumMin;				// 初療室に所属する看護師の総数の最小値
	private int iEmergencyRoomNurseNumMax;					// 1初療室に所属する看護師の最大値
	private int iEmergencyRoomNurseNumMin;					// 1初療室に所属する看護師の最小値
	private int iEmergencyRoomTotalClinicalEngineerNumMax;	// 初療室に所属する医療技師の総数の最大値
	private int iEmergencyRoomTotalClinicalEngineerNumMin;	// 初療室に所属する医療技師の総数の最小値
	private int iEmergencyRoomClinicalEngineerNumMax;		// 1初療室に所属する医療技師の最大値
	private int iEmergencyRoomClinicalEngineerNumMin;		// 1初療室に所属する医療技師の最小値

	private int iObservationRoomNumMax;						// 観察室数の最大値
	private int iObservationRoomNumMin;						// 観察室数の最小値
	private int iObservationRoomTotalNurseNumMax;			// 観察室に所属する看護師の総数の最大値
	private int iObservationRoomTotalNurseNumMin;			// 観察室に所属する看護師の総数の最小値
	private int iObservationRoomNurseNumMax;				// 1観察室に所属する看護師の最大値
	private int iObservationRoomNurseNumMin;				// 1観察室に所属する看護師の最小値

	private int iInjurySevereObservationRoomNumMax;			// 重症観察室数の最大値
	private int iInjurySevereObservationRoomNumMin;			// 重症観察室数の最小値
	private int iInjurySevereObservationRoomTotalNurseNumMax;// 重症観察室に所属する看護師の総数の最大値
	private int iInjurySevereObservationRoomTotalNurseNumMin;// 重症観察室に所属する看護師の総数の最小値
	private int iInjurySevereObservationRoomNurseNumMax;	// 1重症観察室に所属する看護師の最大値
	private int iInjurySevereObservationRoomNurseNumMin;	// 1重症観察室に所属する看護師の最小値

	private int iIntensiveCareUnitNumMax;				// 集中治療室数の最大値
	private int iIntensiveCareUnitNumMin;				// 集中治療室数の最小値
	private int iIntensiveCareUnitTotalDoctorNumMax;	// 集中治療室に所属する医師の総数の最大値
	private int iIntensiveCareUnitTotalDoctorNumMin;	// 集中治療室に所属する医師の総数の最小値
	private int iIntensiveCareUnitDoctorNumMax;			// 1集中治療室に所属する医師の最大値
	private int iIntensiveCareUnitDoctorNumMin;			// 1集中治療室に所属する医師の最小値
	private int iIntensiveCareUnitTotalNurseNumMax;		// 集中治療室に所属する看護師の総数の最大値
	private int iIntensiveCareUnitTotalNurseNumMin;		// 集中治療室に所属する看護師の総数の最小値
	private int iIntensiveCareUnitNurseNumMax;			// 1集中治療室に所属する看護師の最大値
	private int iIntensiveCareUnitNurseNumMin;			// 1集中治療室に所属する看護師の最小値

	private int iHighCareUnitNumMax;					// HCU数の最大値
	private int iHighCareUnitNumMin;					// HCU数の最小値
	private int iHighCareUnitTotalDoctorNumMax;			// HCUに所属する医師の総数の最大値
	private int iHighCareUnitTotalDoctorNumMin;			// HCUに所属する医師の総数の最小値
	private int iHighCareUnitDoctorNumMax;				// 1HCUに所属する医師の最大値
	private int iHighCareUnitDoctorNumMin;				// 1HCUに所属する医師の最小値
	private int iHighCareUnitTotalNurseNumMax;			// HCUに所属する看護師の総数の最大値
	private int iHighCareUnitTotalNurseNumMin;			// HCUに所属する看護師の総数の最小値
	private int iHighCareUnitNurseNumMax;				// 1HCUに所属する看護師の最大値
	private int iHighCareUnitNurseNumMin;				// 1HCUに所属する看護師の最小値

	private int iGeneralWardNumMax;						// 一般病棟数の最大値
	private int iGeneralWardNumMin;						// 一般病棟数の最小値
	private int iGeneralWardTotalDoctorNumMax;			// 一般病棟に所属する医師の総数の最大値
	private int iGeneralWardTotalDoctorNumMin;			// 一般病棟に所属する医師の総数の最小値
	private int iGeneralWardDoctorNumMax;				// 1一般病棟に所属する医師の最大値
	private int iGeneralWardDoctorNumMin;				// 1一般病棟に所属する医師の最小値
	private int iGeneralWardTotalNurseNumMax;			// 一般病棟に所属する看護師の総数の最大値
	private int iGeneralWardTotalNurseNumMin;			// 一般病棟に所属する看護師の総数の最小値
	private int iGeneralWardNurseNumMax;				// 1一般病棟に所属する看護師の最大値
	private int iGeneralWardNurseNumMin;				// 1一般病棟に所属する看護師の最小値

	private int iWaitingRoomNumMax;						// 待合室数の最大値
	private int iWaitingRoomNumMin;						// 待合室数の最小値
	private int iWaitingRoomTotalNurseNumMax;			// 待合室に所属する看護師の総数の最大値
	private int iWaitingRoomTotalNurseNumMin;			// 待合室に所属する看護師の総数の最小値
	private int iWaitingRoomNurseNumMax;				// 1待合室に所属する看護師の最大値
	private int iWaitingRoomNurseNumMin;				// 1待合室に所属する看護師の最小値

	private int iXRayRoomNumMax;							// X線室数の最大値
	private int iXRayRoomNumMin;							// X線室数の最小値
	private int iXRayRoomTotalClinicalEngineerNumMax;		// X線室に所属する医療技師の総数の最大値
	private int iXRayRoomTotalClinicalEngineerNumMin;		// X線室に所属する医療技師の総数の最小値
	private int iXRayRoomClinicalEngineerNumMax;			// 1X線室に所属する医療技師の最大値
	private int iXRayRoomClinicalEngineerNumMin;			// 1X線室に所属する医療技師の最小値

	private int iCTRoomNumMax;								// CT室数の最大値
	private int iCTRoomNumMin;								// CT室数の最小値
	private int iCTRoomTotalClinicalEngineerNumMax;			// CT室に所属する医療技師の総数の最大値
	private int iCTRoomTotalClinicalEngineerNumMin;			// CT室に所属する医療技師の総数の最小値
	private int iCTRoomClinicalEngineerNumMax;				// 1CT室に所属する医療技師の最大値
	private int iCTRoomClinicalEngineerNumMin;				// 1CT室に所属する医療技師の最小値

	private int iMRIRoomNumMax;								// MRI室数の最大値
	private int iMRIRoomNumMin;								// MRI室数の最小値
	private int iMRIRoomTotalClinicalEngineerNumMax;		// MRI室に所属する医療技師の総数の最大値
	private int iMRIRoomTotalClinicalEngineerNumMin;		// MRI室に所属する医療技師の総数の最小値
	private int iMRIRoomClinicalEngineerNumMax;				// 1MRI室に所属する医療技師の最大値
	private int iMRIRoomClinicalEngineerNumMin;				// 1MRI室に所属する医療技師の最小値

	private int iAngiographyRoomNumMax;						// 血管造影室数の最大値
	private int iAngiographyRoomNumMin;						// 血管造影室数の最小値
	private int iAngiographyRoomTotalClinicalEngineerNumMax;// 血管造影室に所属する医療技師の総数の最大値
	private int iAngiographyRoomTotalClinicalEngineerNumMin;// 血管造影室に所属する医療技師の総数の最小値
	private int iAngiographyRoomClinicalEngineerNumMax;		// 1血管造影室に所属する医療技師の最大値
	private int iAngiographyRoomClinicalEngineerNumMin;		// 1血管造影室に所属する医療技師の最小値

	private int iFastRoomNumMax;							// FAST室数の最大値
	private int iFastRoomNumMin;							// FAST室数の最小値
	private int iFastRoomTotalClinicalEngineerNumMax;		// FAST室に所属する医療技師の総数の最大値
	private int iFastRoomTotalClinicalEngineerNumMin;		// FAST室に所属する医療技師の総数の最小値
	private int iFastRoomClinicalEngineerNumMax;			// 1FAST室に所属する医療技師の最大値
	private int iFastRoomClinicalEngineerNumMin;			// 1FAST室に所属する医療技師の最小値

	@Override
	public void readInitSettingFile() throws IllegalArgumentException, IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		String func_name				= "GetEnvParameter";
		int i = 0;
		String strIniFullPath;
		String strIniFileName								= "erInvSim.ini";
		String strConsultationRoomSectionName				= "ConsultationRoom";
		String strOperationRoomSectionName					= "OperationRoom";
		String strEmergencyRoomSectionName					= "EmergencyRoom";
		String strObservationRoomSectionName				= "ObservationRoom";
		String strInjurySevereObservationRoomSectionName	= "InjurySevereObservationRoom";
		String strIntensiveCareUnitSectionName				= "ICU";
		String strHighCareUnitSectionName					= "HCU";
		String strGeneralWardSectionName					= "GeneralWard";
		String strWaitingRoomSectionName					= "WaitingRoom";
		String strXRayRoomSectionName						= "XRayRoom";
		String strCTRoomSectionName							= "CTRoom";
		String strMRIRoomSectionName						= "MRIRoom";
		String strAngiographyRoomSectionName				= "AngiographyRoom";
		String strFastRoomSectionName						= "FastRoom";
		String strParam;

		long lRet = 0L;
		File file;

		file = new File( strIniFileName );

	// 制約条件設定

		strIniFullPath = file.getAbsolutePath( );

		// 診察室数の最小値を取得します。
		iConsultationRoomNumMin = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomMin", -1, strIniFullPath );
		if( 0 > iConsultationRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of consultation room number is out of range"));
		}
		// 診察室数の最大値を取得します。
		iConsultationRoomNumMax = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomMax", -1, strIniFullPath );
		if( 0 > iConsultationRoomNumMin || iConsultationRoomNumMax < iConsultationRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of consultation room number is out of range"));
		}
		// 診察室の医師の総数の最小値を取得します。
		iConsultationRoomTotalDoctorNumMin = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomTotalDoctorMin", -1, strIniFullPath );
		if( 0 > iConsultationRoomTotalDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total doctor in the consultation room number is out of range"));
		}
		// 診察室の医師の総数の最大値を取得します。
		iConsultationRoomTotalDoctorNumMax = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomTotalDoctorMax", -1, strIniFullPath );
		if( 0 > iConsultationRoomTotalDoctorNumMax || iConsultationRoomTotalDoctorNumMax < iConsultationRoomTotalDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total doctor in the consultation room number is out of range"));
		}
		// 1診察室の医師の最小値を取得します。
		iConsultationRoomDoctorNumMin = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomDoctorMin", -1, strIniFullPath );
		if( 0 > iConsultationRoomDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of doctor in the consultation room number is out of range"));
		}
		// 1診察室の医師の最大値を取得します。
		iConsultationRoomDoctorNumMax = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomDoctorMax", -1, strIniFullPath );
		if( 0 > iConsultationRoomDoctorNumMax || iConsultationRoomDoctorNumMax < iConsultationRoomDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of doctor in the consultation room is out of range"));
		}
		// 診察室の看護師の総数の最小値を取得します。
		iConsultationRoomTotalNurseNumMin = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomTotalNurseMin", -1, strIniFullPath );
		if( 0 > iConsultationRoomTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total nurse in the consultation room number is out of range"));
		}
		// 診察室の看護師の総数の最大値を取得します。
		iConsultationRoomTotalNurseNumMax = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomTotalNurseMax", -1, strIniFullPath );
		if( 0 > iConsultationRoomTotalNurseNumMax || iConsultationRoomTotalNurseNumMax < iConsultationRoomTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total nurse in the consultation room number is out of range"));
		}
		// 1診察室の看護師の最小値を取得します。
		iConsultationRoomNurseNumMin = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomNurseMin", -1, strIniFullPath );
		if( 0 > iConsultationRoomNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of nurse in the consultation room number is out of range"));
		}
		// 1診察室の看護師の最大値を取得します。
		iConsultationRoomNurseNumMax = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomNurseMax", -1, strIniFullPath );
		if( 0 > iConsultationRoomNurseNumMax || iConsultationRoomNurseNumMax < iConsultationRoomNurseNumMin)
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of nurse in the consultation room is out of range"));
		}

		// 手術室数の最小値を取得します。
		iOperationRoomNumMin = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomMin", -1, strIniFullPath );
		if( 0 > iOperationRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of operation room number is out of range"));
		}
		// 手術室数の最大値を取得します。
		iOperationRoomNumMax = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomMax", -1, strIniFullPath );
		if( 0 > iOperationRoomNumMin || iOperationRoomNumMax < iOperationRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of operation room number is out of range"));
		}
		// 手術室の医師の総数の最小値を取得します。
		iOperationRoomTotalDoctorNumMin = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomTotalDoctorMin", -1, strIniFullPath );
		if( 0 > iOperationRoomTotalDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total doctor in the operation room number is out of range"));
		}
		// 手術室の医師の総数の最大値を取得します。
		iOperationRoomTotalDoctorNumMax = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomTotalDoctorMax", -1, strIniFullPath );
		if( 0 > iOperationRoomTotalDoctorNumMax || iOperationRoomTotalDoctorNumMax < iOperationRoomTotalDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total doctor in the operation room number is out of range"));
		}
		// 1手術室の医師の最小値を取得します。
		iOperationRoomDoctorNumMin = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomDoctorMin", -1, strIniFullPath );
		if( 0 > iOperationRoomDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of doctor in the operation room number is out of range"));
		}
		// 1手術室の医師の最大値を取得します。
		iOperationRoomDoctorNumMax = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomDoctorMax", -1, strIniFullPath );
		if( 0 > iOperationRoomDoctorNumMax || iOperationRoomDoctorNumMax < iOperationRoomDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of doctor in the operation room is out of range"));
		}
		// 手術室の看護師の総数の最小値を取得します。
		iOperationRoomTotalNurseNumMin = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomTotalNurseMin", -1, strIniFullPath );
		if( 0 > iOperationRoomTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total nurse in the operation room number is out of range"));
		}
		// 手術室の看護師の総数の最大値を取得します。
		iOperationRoomTotalNurseNumMax = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomTotalNurseMax", -1, strIniFullPath );
		if( 0 > iOperationRoomTotalNurseNumMax || iOperationRoomTotalNurseNumMax < iOperationRoomTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total nurse in the operation room number is out of range"));
		}
		// 1手術室の看護師の最小値を取得します。
		iOperationRoomNurseNumMin = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomNurseMin", -1, strIniFullPath );
		if( 0 > iOperationRoomNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of nurse in the operation room number is out of range"));
		}
		// 1手術室の看護師の最大値を取得します。
		iOperationRoomNurseNumMax = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomNurseMax", -1, strIniFullPath );
		if( 0 > iOperationRoomNurseNumMax || iOperationRoomNurseNumMax < iOperationRoomNurseNumMin)
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of nurse in the operation room is out of range"));
		}

		// 初療室数の最小値を取得します。
		iEmergencyRoomNumMin = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomMin", -1, strIniFullPath );
		if( 0 > iEmergencyRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of emergency room number is out of range"));
		}
		// 初療室数の最大値を取得します。
		iEmergencyRoomNumMax = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomMax", -1, strIniFullPath );
		if( 0 > iEmergencyRoomNumMin || iEmergencyRoomNumMax < iEmergencyRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of emergency room number is out of range"));
		}
		// 初療室の医師の総数の最小値を取得します。
		iEmergencyRoomTotalDoctorNumMin = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomTotalDoctorMin", -1, strIniFullPath );
		if( 0 > iEmergencyRoomTotalDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total doctor in the emergency room number is out of range"));
		}
		// 初療室の医師の総数の最大値を取得します。
		iEmergencyRoomTotalDoctorNumMax = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomTotalDoctorMax", -1, strIniFullPath );
		if( 0 > iEmergencyRoomTotalDoctorNumMax || iEmergencyRoomTotalDoctorNumMax < iEmergencyRoomTotalDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total doctor in the emergency room number is out of range"));
		}
		// 1初療室の医師の最小値を取得します。
		iEmergencyRoomDoctorNumMin = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomDoctorMin", -1, strIniFullPath );
		if( 0 > iEmergencyRoomDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of doctor in the emergency room number is out of range"));
		}
		// 1初療室の医師の最大値を取得します。
		iEmergencyRoomDoctorNumMax = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomDoctorMax", -1, strIniFullPath );
		if( 0 > iEmergencyRoomDoctorNumMax || iEmergencyRoomDoctorNumMax < iEmergencyRoomDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of doctor in the emergency room is out of range"));
		}
		// 初療室の看護師の総数の最小値を取得します。
		iEmergencyRoomTotalNurseNumMin = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomTotalNurseMin", -1, strIniFullPath );
		if( 0 > iEmergencyRoomTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total nurse in the emergency room number is out of range"));
		}
		// 初療室の看護師の総数の最大値を取得します。
		iEmergencyRoomTotalNurseNumMax = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomTotalNurseMax", -1, strIniFullPath );
		if( 0 > iEmergencyRoomTotalNurseNumMax || iEmergencyRoomTotalNurseNumMax < iEmergencyRoomTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total nurse in the emergency room number is out of range"));
		}
		// 1初療室の看護師の最小値を取得します。
		iEmergencyRoomNurseNumMin = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomNurseMin", -1, strIniFullPath );
		if( 0 > iEmergencyRoomNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of nurse in the emergency room number is out of range"));
		}
		// 1初療室の看護師の最大値を取得します。
		iEmergencyRoomNurseNumMax = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomNurseMax", -1, strIniFullPath );
		if( 0 > iEmergencyRoomNurseNumMax || iEmergencyRoomNurseNumMax < iEmergencyRoomNurseNumMin)
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of nurse in the emergency room is out of range"));
		}

		// 観察室数の最小値を取得します。
		iObservationRoomNumMin = (int)GetInitDataInt( strObservationRoomSectionName, "ObservationRoomMin", -1, strIniFullPath );
		if( 0 > iObservationRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of observation room number is out of range"));
		}
		// 観察室数の最大値を取得します。
		iObservationRoomNumMax = (int)GetInitDataInt( strObservationRoomSectionName, "ObservationRoomMax", -1, strIniFullPath );
		if( 0 > iObservationRoomNumMin || iObservationRoomNumMax < iObservationRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of observation room number is out of range"));
		}
		// 観察室の看護師の総数の最小値を取得します。
		iObservationRoomTotalNurseNumMin = (int)GetInitDataInt( strObservationRoomSectionName, "ObservationRoomTotalNurseMin", -1, strIniFullPath );
		if( 0 > iObservationRoomTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total nurse in the observation room number is out of range"));
		}
		// 観察室の看護師の総数の最大値を取得します。
		iObservationRoomTotalNurseNumMax = (int)GetInitDataInt( strObservationRoomSectionName, "ObservationRoomTotalNurseMax", -1, strIniFullPath );
		if( 0 > iObservationRoomTotalNurseNumMax || iObservationRoomTotalNurseNumMax < iObservationRoomTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total nurse in the observation room number is out of range"));
		}
		// 1観察室の看護師の最小値を取得します。
		iObservationRoomNurseNumMin = (int)GetInitDataInt( strObservationRoomSectionName, "ObservationRoomNurseMin", -1, strIniFullPath );
		if( 0 > iObservationRoomNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of nurse in the observation room number is out of range"));
		}
		// 1観察室の看護師の最大値を取得します。
		iObservationRoomNurseNumMax = (int)GetInitDataInt( strObservationRoomSectionName, "ObservationRoomNurseMax", -1, strIniFullPath );
		if( 0 > iObservationRoomNurseNumMax || iObservationRoomNurseNumMax < iObservationRoomNurseNumMin)
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of nurse in the observation room is out of range"));
		}

		// 重症観察室数の最小値を取得します。
		iInjurySevereObservationRoomNumMin = (int)GetInitDataInt( strInjurySevereObservationRoomSectionName, "InjurySevereObservationRoomMin", -1, strIniFullPath );
		if( 0 > iInjurySevereObservationRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of injury severe observation room number is out of range"));
		}
		// 重症観察室数の最大値を取得します。
		iInjurySevereObservationRoomNumMax = (int)GetInitDataInt( strInjurySevereObservationRoomSectionName, "InjurySevereObservationRoomMax", -1, strIniFullPath );
		if( 0 > iInjurySevereObservationRoomNumMin || iInjurySevereObservationRoomNumMax < iInjurySevereObservationRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of injury severe observation room number is out of range"));
		}
		// 重症観察室の看護師の総数の最小値を取得します。
		iInjurySevereObservationRoomTotalNurseNumMin = (int)GetInitDataInt( strInjurySevereObservationRoomSectionName, "InjurySevereObservationRoomTotalNurseMin", -1, strIniFullPath );
		if( 0 > iInjurySevereObservationRoomTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total nurse in the injury severe observation room number is out of range"));
		}
		// 重症観察室の看護師の総数の最大値を取得します。
		iInjurySevereObservationRoomTotalNurseNumMax = (int)GetInitDataInt( strInjurySevereObservationRoomSectionName, "InjurySevereObservationRoomTotalNurseMax", -1, strIniFullPath );
		if( 0 > iInjurySevereObservationRoomTotalNurseNumMax || iInjurySevereObservationRoomTotalNurseNumMax < iInjurySevereObservationRoomTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total nurse in the injury severe observation room number is out of range"));
		}
		// 1重症観察室の看護師の最小値を取得します。
		iInjurySevereObservationRoomNurseNumMin = (int)GetInitDataInt( strInjurySevereObservationRoomSectionName, "InjurySevereObservationRoomNurseMin", -1, strIniFullPath );
		if( 0 > iInjurySevereObservationRoomNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of nurse in the injury severe observation room number is out of range"));
		}
		// 1重症観察室の看護師の最大値を取得します。
		iInjurySevereObservationRoomNurseNumMax = (int)GetInitDataInt( strInjurySevereObservationRoomSectionName, "InjurySevereObservationRoomNurseMax", -1, strIniFullPath );
		if( 0 > iInjurySevereObservationRoomNurseNumMax || iInjurySevereObservationRoomNurseNumMax < iInjurySevereObservationRoomNurseNumMin)
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of nurse in the injury severe observation room is out of range"));
		}

		// ICU数の最小値を取得します。
		iIntensiveCareUnitNumMin = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitMin", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of consultation room number is out of range"));
		}
		// ICU数の最大値を取得します。
		iIntensiveCareUnitNumMax = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitMax", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitNumMin || iIntensiveCareUnitNumMax < iIntensiveCareUnitNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of intensive care unit number is out of range"));
		}
		// ICUの医師の総数の最小値を取得します。
		iIntensiveCareUnitTotalDoctorNumMin = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitTotalDoctorMin", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitTotalDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total doctor in the intensive care unit number is out of range"));
		}
		// ICUの医師の総数の最大値を取得します。
		iIntensiveCareUnitTotalDoctorNumMax = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitTotalDoctorMax", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitTotalDoctorNumMax || iIntensiveCareUnitTotalDoctorNumMax < iIntensiveCareUnitTotalDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total doctor in the intensive care unit number is out of range"));
		}
		// 1ICUの医師の最小値を取得します。
		iIntensiveCareUnitDoctorNumMin = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitDoctorMin", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of doctor in the intensive care unit number is out of range"));
		}
		// 1ICUの医師の最大値を取得します。
		iIntensiveCareUnitDoctorNumMax = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitDoctorMax", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitDoctorNumMax || iIntensiveCareUnitDoctorNumMax < iIntensiveCareUnitDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of doctor in the intensive care unit is out of range"));
		}
		// ICUの看護師の総数の最小値を取得します。
		iIntensiveCareUnitTotalNurseNumMin = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitTotalNurseMin", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total nurse in the intensive care unit number is out of range"));
		}
		// ICUの看護師の総数の最大値を取得します。
		iIntensiveCareUnitTotalNurseNumMax = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitTotalNurseMax", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitTotalNurseNumMax || iIntensiveCareUnitTotalNurseNumMax < iIntensiveCareUnitTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total nurse in the intensive care unit number is out of range"));
		}
		// 1ICUの看護師の最小値を取得します。
		iIntensiveCareUnitNurseNumMin = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitNurseMin", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of nurse in the intensive care unit number is out of range"));
		}
		// 1ICUの看護師の最大値を取得します。
		iIntensiveCareUnitNurseNumMax = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitNurseMax", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitNurseNumMax || iIntensiveCareUnitNurseNumMax < iIntensiveCareUnitNurseNumMin)
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of nurse in the intensive care unit is out of range"));
		}

		// HCU数の最小値を取得します。
		iHighCareUnitNumMin = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitMin", -1, strIniFullPath );
		if( 0 > iHighCareUnitNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of consultation room number is out of range"));
		}
		// HCU数の最大値を取得します。
		iHighCareUnitNumMax = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitMax", -1, strIniFullPath );
		if( 0 > iHighCareUnitNumMin || iHighCareUnitNumMax < iHighCareUnitNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of cohigh care unitumber is out of range"));
		}
		// HCUの医師の総数の最小値を取得します。
		iHighCareUnitTotalDoctorNumMin = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitTotalDoctorMin", -1, strIniFullPath );
		if( 0 > iHighCareUnitTotalDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total doctor in the high care unit number is out of range"));
		}
		// HCUの医師の総数の最大値を取得します。
		iHighCareUnitTotalDoctorNumMax = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitTotalDoctorMax", -1, strIniFullPath );
		if( 0 > iHighCareUnitTotalDoctorNumMax || iHighCareUnitTotalDoctorNumMax < iHighCareUnitTotalDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total doctor in the high care unit number is out of range"));
		}
		// 1HCUの医師の最小値を取得します。
		iHighCareUnitDoctorNumMin = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitDoctorMin", -1, strIniFullPath );
		if( 0 > iHighCareUnitDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of doctor in the high care unit number is out of range"));
		}
		// 1HCUの医師の最大値を取得します。
		iHighCareUnitDoctorNumMax = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitDoctorMax", -1, strIniFullPath );
		if( 0 > iHighCareUnitDoctorNumMax || iHighCareUnitDoctorNumMax < iHighCareUnitDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of doctor in the high care unit is out of range"));
		}
		// HCUの看護師の総数の最小値を取得します。
		iHighCareUnitTotalNurseNumMin = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitTotalNurseMin", -1, strIniFullPath );
		if( 0 > iHighCareUnitTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total nurse in the high care unit number is out of range"));
		}
		// HCUの看護師の総数の最大値を取得します。
		iHighCareUnitTotalNurseNumMax = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitTotalNurseMax", -1, strIniFullPath );
		if( 0 > iHighCareUnitTotalNurseNumMax || iHighCareUnitTotalNurseNumMax < iHighCareUnitTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total nurse in the high care unit number is out of range"));
		}
		// 1HCUの看護師の最小値を取得します。
		iHighCareUnitNurseNumMin = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitNurseMin", -1, strIniFullPath );
		if( 0 > iHighCareUnitNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of nurse in the high care unit number is out of range"));
		}
		// 1HCUの看護師の最大値を取得します。
		iHighCareUnitNurseNumMax = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitNurseMax", -1, strIniFullPath );
		if( 0 > iHighCareUnitNurseNumMax || iHighCareUnitNurseNumMax < iHighCareUnitNurseNumMin)
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of nurse in the high care unit is out of range"));
		}

		// 一般病棟数の最小値を取得します。
		iGeneralWardNumMin = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardMin", -1, strIniFullPath );
		if( 0 > iGeneralWardNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of general ward number is out of range"));
		}
		// 一般病棟数の最大値を取得します。
		iGeneralWardNumMax = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardMax", -1, strIniFullPath );
		if( 0 > iGeneralWardNumMin || iGeneralWardNumMax < iGeneralWardNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value general wardoom number is out of range"));
		}
		// 一般病棟の医師の総数の最小値を取得します。
		iGeneralWardTotalDoctorNumMin = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardTotalDoctorMin", -1, strIniFullPath );
		if( 0 > iGeneralWardTotalDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total doctor in the general ward number is out of range"));
		}
		// 一般病棟の医師の総数の最大値を取得します。
		iGeneralWardTotalDoctorNumMax = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardTotalDoctorMax", -1, strIniFullPath );
		if( 0 > iGeneralWardTotalDoctorNumMax || iGeneralWardTotalDoctorNumMax < iGeneralWardTotalDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total doctor in the general ward number is out of range"));
		}
		// 1一般病棟の医師の最小値を取得します。
		iGeneralWardDoctorNumMin = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardDoctorMin", -1, strIniFullPath );
		if( 0 > iGeneralWardDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of doctor in the general ward number is out of range"));
		}
		// 1一般病棟の医師の最大値を取得します。
		iGeneralWardDoctorNumMax = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardDoctorMax", -1, strIniFullPath );
		if( 0 > iGeneralWardDoctorNumMax || iGeneralWardDoctorNumMax < iGeneralWardDoctorNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of doctor in the general ward is out of range"));
		}
		// 一般病棟の看護師の総数の最小値を取得します。
		iGeneralWardTotalNurseNumMin = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardTotalNurseMin", -1, strIniFullPath );
		if( 0 > iGeneralWardTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total nurse in the general ward number is out of range"));
		}
		// 一般病棟の看護師の総数の最大値を取得します。
		iGeneralWardTotalNurseNumMax = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardTotalNurseMax", -1, strIniFullPath );
		if( 0 > iGeneralWardTotalNurseNumMax || iGeneralWardTotalNurseNumMax < iGeneralWardTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total nurse in the general ward number is out of range"));
		}
		// 1一般病棟の看護師の最小値を取得します。
		iGeneralWardNurseNumMin = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardNurseMin", -1, strIniFullPath );
		if( 0 > iGeneralWardNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of nurse in the general ward number is out of range"));
		}
		// 1一般病棟の看護師の最大値を取得します。
		iGeneralWardNurseNumMax = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardNurseMax", -1, strIniFullPath );
		if( 0 > iGeneralWardNurseNumMax || iGeneralWardNurseNumMax < iGeneralWardNurseNumMin)
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of nurse in the general ward is out of range"));
		}

		// 待合室数の最小値を取得します。
		iWaitingRoomNumMin = (int)GetInitDataInt( strWaitingRoomSectionName, "WaitingRoomMin", -1, strIniFullPath );
		if( 0 > iWaitingRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of waiting room number is out of range"));
		}
		// 待合室数の最大値を取得します。
		iWaitingRoomNumMax = (int)GetInitDataInt( strWaitingRoomSectionName, "WaitingRoomMax", -1, strIniFullPath );
		if( 0 > iWaitingRoomNumMin || iWaitingRoomNumMax < iWaitingRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of waiting room number is out of range"));
		}
		// 待合室の看護師の総数の最小値を取得します。
		iWaitingRoomTotalNurseNumMin = (int)GetInitDataInt( strWaitingRoomSectionName, "WaitingRoomTotalNurseMin", -1, strIniFullPath );
		if( 0 > iWaitingRoomTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total nurse in the waiting room number is out of range"));
		}
		// 待合室の看護師の総数の最大値を取得します。
		iWaitingRoomTotalNurseNumMax = (int)GetInitDataInt( strWaitingRoomSectionName, "WaitingRoomTotalNurseMax", -1, strIniFullPath );
		if( 0 > iWaitingRoomTotalNurseNumMax || iWaitingRoomTotalNurseNumMax < iWaitingRoomTotalNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total nurse in the waiting room number is out of range"));
		}
		// 1待合室の看護師の最小値を取得します。
		iWaitingRoomNurseNumMin = (int)GetInitDataInt( strWaitingRoomSectionName, "WaitingRoomNurseMin", -1, strIniFullPath );
		if( 0 > iWaitingRoomNurseNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of nurse in the waiting room number is out of range"));
		}
		// 1待合室の看護師の最大値を取得します。
		iWaitingRoomNurseNumMax = (int)GetInitDataInt( strWaitingRoomSectionName, "WaitingRoomNurseMax", -1, strIniFullPath );
		if( 0 > iWaitingRoomNurseNumMax || iWaitingRoomNurseNumMax < iWaitingRoomNurseNumMin)
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of nurse in the waiting room is out of range"));
		}

		// X線室数の最小値を取得します。
		iXRayRoomNumMin = (int)GetInitDataInt( strXRayRoomSectionName, "XRayRoomMin", -1, strIniFullPath );
		if( 0 > iXRayRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of x-ray room number is out of range"));
		}
		// X線室数の最大値を取得します。
		iXRayRoomNumMax = (int)GetInitDataInt( strXRayRoomSectionName, "XRayRoomMax", -1, strIniFullPath );
		if( 0 > iXRayRoomNumMin || iXRayRoomNumMax < iXRayRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of x-ray room number is out of range"));
		}
		// X線室の医療技師の総数の最小値を取得します。
		iXRayRoomTotalClinicalEngineerNumMin = (int)GetInitDataInt( strXRayRoomSectionName, "XRayRoomTotalClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iXRayRoomTotalClinicalEngineerNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total clinical engineer in the x-ray room number is out of range"));
		}
		// X線室の医療技師の総数の最大値を取得します。
		iXRayRoomTotalClinicalEngineerNumMax = (int)GetInitDataInt( strXRayRoomSectionName, "XRayRoomTotalClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iXRayRoomTotalClinicalEngineerNumMax || iXRayRoomTotalClinicalEngineerNumMax < iXRayRoomTotalClinicalEngineerNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total clinical engineer in the x-ray room number is out of range"));
		}
		// 1X線室の医療技師の最小値を取得します。
		iXRayRoomClinicalEngineerNumMin = (int)GetInitDataInt( strXRayRoomSectionName, "XRayRoomClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iXRayRoomClinicalEngineerNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of clinical engineer in the x-ray room number is out of range"));
		}
		// 1X線室の医療技師の最大値を取得します。
		iXRayRoomClinicalEngineerNumMax = (int)GetInitDataInt( strXRayRoomSectionName, "XRayRoomClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iXRayRoomClinicalEngineerNumMax || iXRayRoomClinicalEngineerNumMax < iXRayRoomClinicalEngineerNumMin)
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of clinical engineer in the x-ray room is out of range"));
		}

		// CT室数の最小値を取得します。
		iCTRoomNumMin = (int)GetInitDataInt( strCTRoomSectionName, "CTRoomMin", -1, strIniFullPath );
		if( 0 > iCTRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of ct room number is out of range"));
		}
		// CT室数の最大値を取得します。
		iCTRoomNumMax = (int)GetInitDataInt( strCTRoomSectionName, "CTRoomMax", -1, strIniFullPath );
		if( 0 > iCTRoomNumMin || iCTRoomNumMax < iCTRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of ct room number is out of range"));
		}
		// CT室の医療技師の総数の最小値を取得します。
		iCTRoomTotalClinicalEngineerNumMin = (int)GetInitDataInt( strCTRoomSectionName, "CTRoomTotalClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iCTRoomTotalClinicalEngineerNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total clinical engineer in the ct room number is out of range"));
		}
		// CT室の医療技師の総数の最大値を取得します。
		iCTRoomTotalClinicalEngineerNumMax = (int)GetInitDataInt( strCTRoomSectionName, "CTRoomTotalClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iCTRoomTotalClinicalEngineerNumMax || iCTRoomTotalClinicalEngineerNumMax < iCTRoomTotalClinicalEngineerNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total clinical engineer in the ct room number is out of range"));
		}
		// 1CT室の医療技師の最小値を取得します。
		iCTRoomClinicalEngineerNumMin = (int)GetInitDataInt( strCTRoomSectionName, "CTRoomClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iCTRoomClinicalEngineerNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of clinical engineer in the ct room number is out of range"));
		}
		// 1CT室の医療技師の最大値を取得します。
		iCTRoomClinicalEngineerNumMax = (int)GetInitDataInt( strCTRoomSectionName, "CTRoomClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iCTRoomClinicalEngineerNumMax || iCTRoomClinicalEngineerNumMax < iCTRoomClinicalEngineerNumMin)
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of clinical engineer in the ct room is out of range"));
		}

		// MRI室数の最小値を取得します。
		iMRIRoomNumMin = (int)GetInitDataInt( strMRIRoomSectionName, "MRIRoomMin", -1, strIniFullPath );
		if( 0 > iMRIRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of mri room number is out of range"));
		}
		// MRI室数の最大値を取得します。
		iMRIRoomNumMax = (int)GetInitDataInt( strMRIRoomSectionName, "MRIRoomMax", -1, strIniFullPath );
		if( 0 > iMRIRoomNumMin || iMRIRoomNumMax < iMRIRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of mri room number is out of range"));
		}
		// MRI室の医療技師の総数の最小値を取得します。
		iMRIRoomTotalClinicalEngineerNumMin = (int)GetInitDataInt( strMRIRoomSectionName, "MRIRoomTotalClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iMRIRoomTotalClinicalEngineerNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total clinical engineer in the mri room number is out of range"));
		}
		// MRI室の医療技師の総数の最大値を取得します。
		iMRIRoomTotalClinicalEngineerNumMax = (int)GetInitDataInt( strMRIRoomSectionName, "MRIRoomTotalClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iMRIRoomTotalClinicalEngineerNumMax || iMRIRoomTotalClinicalEngineerNumMax < iMRIRoomTotalClinicalEngineerNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total clinical engineer in the mri room number is out of range"));
		}
		// 1MRI室の医療技師の最小値を取得します。
		iMRIRoomClinicalEngineerNumMin = (int)GetInitDataInt( strMRIRoomSectionName, "MRIRoomClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iMRIRoomClinicalEngineerNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of clinical engineer in the mri room number is out of range"));
		}
		// 1MRI室の医療技師の最大値を取得します。
		iMRIRoomClinicalEngineerNumMax = (int)GetInitDataInt( strMRIRoomSectionName, "MRIRoomClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iMRIRoomClinicalEngineerNumMax || iMRIRoomClinicalEngineerNumMax < iMRIRoomClinicalEngineerNumMin)
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of clinical engineer in the mri room is out of range"));
		}

		// 血管造影室数の最小値を取得します。
		iAngiographyRoomNumMin = (int)GetInitDataInt( strAngiographyRoomSectionName, "AngiographyRoomMin", -1, strIniFullPath );
		if( 0 > iAngiographyRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of angiography room number is out of range"));
		}
		// 血管造影室数の最大値を取得します。
		iAngiographyRoomNumMax = (int)GetInitDataInt( strAngiographyRoomSectionName, "AngiographyRoomMax", -1, strIniFullPath );
		if( 0 > iAngiographyRoomNumMin || iAngiographyRoomNumMax < iAngiographyRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of angiography room number is out of range"));
		}
		// 血管造影室の医療技師の総数の最小値を取得します。
		iAngiographyRoomTotalClinicalEngineerNumMin = (int)GetInitDataInt( strAngiographyRoomSectionName, "AngiographyRoomTotalClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iAngiographyRoomTotalClinicalEngineerNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total clinical engineer in the angiography room number is out of range"));
		}
		// 血管造影室の医療技師の総数の最大値を取得します。
		iAngiographyRoomTotalClinicalEngineerNumMax = (int)GetInitDataInt( strAngiographyRoomSectionName, "AngiographyRoomTotalClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iAngiographyRoomTotalClinicalEngineerNumMax || iAngiographyRoomTotalClinicalEngineerNumMax < iAngiographyRoomTotalClinicalEngineerNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total clinical engineer in the angiography room number is out of range"));
		}
		// 1血管造影室の医療技師の最小値を取得します。
		iAngiographyRoomClinicalEngineerNumMin = (int)GetInitDataInt( strAngiographyRoomSectionName, "AngiographyRoomClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iAngiographyRoomClinicalEngineerNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of clinical engineer in the angiography room number is out of range"));
		}
		// 1血管造影室の医療技師の最大値を取得します。
		iAngiographyRoomClinicalEngineerNumMax = (int)GetInitDataInt( strAngiographyRoomSectionName, "AngiographyRoomClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iAngiographyRoomClinicalEngineerNumMax || iAngiographyRoomClinicalEngineerNumMax < iAngiographyRoomClinicalEngineerNumMin)
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of clinical engineer in the angiography room is out of range"));
		}

		// 診察室数の最小値を取得します。
		iFastRoomNumMin = (int)GetInitDataInt( strFastRoomSectionName, "FastRoomMin", -1, strIniFullPath );
		if( 0 > iFastRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of fast room number is out of range"));
		}
		// 診察FAST室最大値を取得します。
		iFastRoomNumMax = (int)GetInitDataInt( strFastRoomSectionName, "FastRoomMax", -1, strIniFullPath );
		if( 0 > iFastRoomNumMin || iFastRoomNumMax < iFastRoomNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of fast room number is out of range"));
		}
		// FAST室の医療技師の総数の最小値を取得します。
		iFastRoomTotalClinicalEngineerNumMin = (int)GetInitDataInt( strFastRoomSectionName, "FastRoomTotalClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iFastRoomTotalClinicalEngineerNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of total clinical engineer in the fast room number is out of range"));
		}
		// FAST室の医療技師の総数の最大値を取得します。
		iFastRoomTotalClinicalEngineerNumMax = (int)GetInitDataInt( strFastRoomSectionName, "FastRoomTotalClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iFastRoomTotalClinicalEngineerNumMax || iFastRoomTotalClinicalEngineerNumMax < iFastRoomTotalClinicalEngineerNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of total clinical engineer in the fast room number is out of range"));
		}
		// 1FAST室の医療技師の最小値を取得します。
		iFastRoomClinicalEngineerNumMin = (int)GetInitDataInt( strFastRoomSectionName, "FastRoomClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iFastRoomClinicalEngineerNumMin )
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("min value of clinical engineer in the fast room number is out of range"));
		}
		// 1FAST室の医療技師の最大値を取得します。
		iFastRoomClinicalEngineerNumMax = (int)GetInitDataInt( strFastRoomSectionName, "FastRoomClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iFastRoomClinicalEngineerNumMax || iFastRoomClinicalEngineerNumMax < iFastRoomClinicalEngineerNumMin)
		{
			/* 範囲外を指定した場合はエラーを出力します。*/
			throw(new IllegalArgumentException("max value of clinical engineer in the fast room is out of range"));
		}
	}

	public int iGetConsultationRoomNumMax()
	{
		return iConsultationRoomNumMax;
	}
	public int iGetConsultationRoomNumMin()
	{
		return iConsultationRoomNumMin;
	}
	public int iGetConsultationRoomTotalDoctorNumMax()
	{
		return iConsultationRoomTotalDoctorNumMax;
	}
	public int iGetConsultationRoomTotalDoctorNumMin()
	{
		return iConsultationRoomTotalDoctorNumMin;
	}
	public int iGetConsultationRoomDoctorNumMax()
	{
		return iConsultationRoomDoctorNumMax;
	}
	public int iGetConsultationRoomDoctorNumMin()
	{
		return iConsultationRoomDoctorNumMin;
	}
	public int iGetConsultationRoomTotalNurseNumMax()
	{
		return iConsultationRoomTotalNurseNumMax;
	}
	public int iGetConsultationRoomTotalNurseNumMin()
	{
		return iConsultationRoomTotalNurseNumMin;
	}
	public int iGetConsultationRoomNurseNumMax()
	{
		return iConsultationRoomNurseNumMax;
	}
	public int iGetConsultationRoomNurseNumMin()
	{
		return iConsultationRoomNurseNumMin;
	}

	public int iGetOperationRoomNumMax()
	{
		return iOperationRoomNumMax;
	}
	public int iGetOperationRoomNumMin()
	{
		return iOperationRoomNumMin;
	}
	public int iGetOperationRoomTotalDoctorNumMax()
	{
		return iOperationRoomTotalDoctorNumMax;
	}
	public int iGetOperationRoomTotalDoctorNumMin()
	{
		return iOperationRoomTotalDoctorNumMin;
	}
	public int iGetOperationRoomDoctorNumMax()
	{
		return iOperationRoomDoctorNumMax;
	}
	public int iGetOperationRoomDoctorNumMin()
	{
		return iOperationRoomDoctorNumMin;
	}
	public int iGetOperationRoomTotalNurseNumMax()
	{
		return iOperationRoomTotalNurseNumMax;
	}
	public int iGetOperationRoomTotalNurseNumMin()
	{
		return iOperationRoomTotalNurseNumMin;
	}
	public int iGetOperationRoomNurseNumMax()
	{
		return iOperationRoomNurseNumMax;
	}
	public int iGetOperationRoomNurseNumMin()
	{
		return iOperationRoomNurseNumMin;
	}

	public int iGetEmergencyRoomNumMax()
	{
		 return iEmergencyRoomNumMax;
	}
	public int iGetEmergencyRoomNumMin()
	{
		 return iEmergencyRoomNumMin;
	}
	public int iGetEmergencyRoomTotalDoctorNumMax()
	{
		 return iEmergencyRoomTotalDoctorNumMax;
	}
	public int iGetEmergencyRoomTotalDoctorNumMin()
	{
		 return iEmergencyRoomTotalDoctorNumMin;
	}
	public int iGetEmergencyRoomDoctorNumMax()
	{
		 return iEmergencyRoomDoctorNumMax;
	}
	public int iGetEmergencyRoomDoctorNumMin()
	{
		 return iEmergencyRoomDoctorNumMin;
	}
	public int iGetEmergencyRoomTotalNurseNumMax()
	{
		 return iEmergencyRoomTotalNurseNumMax;
	}
	public int iGetEmergencyRoomTotalNurseNumMin()
	{
		 return iEmergencyRoomTotalNurseNumMin;
	}
	public int iGetEmergencyRoomNurseNumMax()
	{
		 return iEmergencyRoomNurseNumMax;
	}
	public int iGetEmergencyRoomNurseNumMin()
	{
		 return iEmergencyRoomNurseNumMin;
	}
	public int iGetEmergencyRoomTotalClinicalEngineerNumMax()
	{
		 return iEmergencyRoomTotalClinicalEngineerNumMax;
	}
	public int iGetEmergencyRoomTotalClinicalEngineerNumMin()
	{
		 return iEmergencyRoomTotalClinicalEngineerNumMin;
	}
	public int iGetEmergencyRoomClinicalEngineerNumMax()
	{
		 return iEmergencyRoomClinicalEngineerNumMax;
	}
	public int iGetEmergencyRoomClinicalEngineerNumMin()
	{
		 return iEmergencyRoomClinicalEngineerNumMin;
	}

	public int iGetObservationRoomNumMax()
	{
		 return iObservationRoomNumMax;
	}
	public int iGetObservationRoomNumMin()
	{
		 return iObservationRoomNumMin;
	}
	public int iGetObservationRoomTotalNurseNumMax()
	{
		 return iObservationRoomTotalNurseNumMax;
	}
	public int iGetObservationRoomTotalNurseNumMin()
	{
		 return iObservationRoomTotalNurseNumMin;
	}
	public int iGetObservationRoomNurseNumMax()
	{
		 return iObservationRoomNurseNumMax;
	}
	public int iGetObservationRoomNurseNumMin()
	{
		 return iObservationRoomNurseNumMin;
	}

	public int iGetInjurySevereObservationRoomNumMax()
	{
		 return iInjurySevereObservationRoomNumMax;
	}
	public int iGetInjurySevereObservationRoomNumMin()
	{
		 return iInjurySevereObservationRoomNumMin;
	}
	public int iGetInjurySevereObservationRoomTotalNurseNumMax()
	{
		 return iInjurySevereObservationRoomTotalNurseNumMax;
	}
	public int iGetInjurySevereObservationRoomTotalNurseNumMin()
	{
		 return iInjurySevereObservationRoomTotalNurseNumMin;
	}
	public int iGetInjurySevereObservationRoomNurseNumMax()
	{
		 return iInjurySevereObservationRoomNurseNumMax;
	}
	public int iGetInjurySevereObservationRoomNurseNumMin()
	{
		 return iInjurySevereObservationRoomNurseNumMin;
	}

	public int iGetIntensiveCareUnitNumMax()
	{
		 return iIntensiveCareUnitNumMax;
	}
	public int iGetIntensiveCareUnitNumMin()
	{
		 return iIntensiveCareUnitNumMin;
	}
	public int iGetIntensiveCareUnitTotalDoctorNumMax()
	{
		 return iIntensiveCareUnitTotalDoctorNumMax;
	}
	public int iGetIntensiveCareUnitTotalDoctorNumMin()
	{
		 return iIntensiveCareUnitTotalDoctorNumMin;
	}
	public int iGetIntensiveCareUnitDoctorNumMax()
	{
		 return iIntensiveCareUnitDoctorNumMax;
	}
	public int iGetIntensiveCareUnitDoctorNumMin()
	{
		 return iIntensiveCareUnitDoctorNumMin;
	}
	public int iGetIntensiveCareUnitTotalNurseNumMax()
	{
		 return iIntensiveCareUnitTotalNurseNumMax;
	}
	public int iGetIntensiveCareUnitTotalNurseNumMin()
	{
		 return iIntensiveCareUnitTotalNurseNumMin;
	}
	public int iGetIntensiveCareUnitNurseNumMax()
	{
		 return iIntensiveCareUnitNurseNumMax;
	}
	public int iGetIntensiveCareUnitNurseNumMin()
	{
		 return iIntensiveCareUnitNurseNumMin;
	}

	public int iGetHighCareUnitNumMax()
	{
		 return iHighCareUnitNumMax;
	}
	public int iGetHighCareUnitNumMin()
	{
		 return iHighCareUnitNumMin;
	}
	public int iGetHighCareUnitTotalDoctorNumMax()
	{
		 return iHighCareUnitTotalDoctorNumMax;
	}
	public int iGetHighCareUnitTotalDoctorNumMin()
	{
		 return iHighCareUnitTotalDoctorNumMin;
	}
	public int iGetHighCareUnitDoctorNumMax()
	{
		 return iHighCareUnitDoctorNumMax;
	}
	public int iGetHighCareUnitDoctorNumMin()
	{
		 return iHighCareUnitDoctorNumMin;
	}
	public int iGetHighCareUnitTotalNurseNumMax()
	{
		 return iHighCareUnitTotalNurseNumMax;
	}
	public int iGetHighCareUnitTotalNurseNumMin()
	{
		 return iHighCareUnitTotalNurseNumMin;
	}
	public int iGetHighCareUnitNurseNumMax()
	{
		 return iHighCareUnitNurseNumMax;
	}
	public int iGetHighCareUnitNurseNumMin()
	{
		 return iHighCareUnitNurseNumMin;
	}

	public int iGetGeneralWardNumMax()
	{
		 return iGeneralWardNumMax;
	}
	public int iGetGeneralWardNumMin()
	{
		 return iGeneralWardNumMin;
	}
	public int iGetGeneralWardTotalDoctorNumMax()
	{
		 return iGeneralWardTotalDoctorNumMax;
	}
	public int iGetGeneralWardTotalDoctorNumMin()
	{
		 return iGeneralWardTotalDoctorNumMin;
	}
	public int iGetGeneralWardDoctorNumMax()
	{
		 return iGeneralWardDoctorNumMax;
	}
	public int iGetGeneralWardDoctorNumMin()
	{
		 return iGeneralWardDoctorNumMin;
	}
	public int iGetGeneralWardTotalNurseNumMax()
	{
		 return iGeneralWardTotalNurseNumMax;
	}
	public int iGetGeneralWardTotalNurseNumMin()
	{
		 return iGeneralWardTotalNurseNumMin;
	}
	public int iGetGeneralWardNurseNumMax()
	{
		 return iGeneralWardNurseNumMax;
	}
	public int iGetGeneralWardNurseNumMin()
	{
		 return iGeneralWardNurseNumMin;
	}

	public int iGetWaitingRoomNumMax()
	{
		 return iWaitingRoomNumMax;
	}
	public int iGetWaitingRoomNumMin()
	{
		 return iWaitingRoomNumMin;
	}
	public int iGetWaitingRoomTotalNurseNumMax()
	{
		 return iWaitingRoomTotalNurseNumMax;
	}
	public int iGetWaitingRoomTotalNurseNumMin()
	{
		 return iWaitingRoomTotalNurseNumMin;
	}
	public int iGetWaitingRoomNurseNumMax()
	{
		 return iWaitingRoomNurseNumMax;
	}
	public int iGetWaitingRoomNurseNumMin()
	{
		 return iWaitingRoomNurseNumMin;
	}

	public int iGetXRayRoomNumMax()
	{
		 return iXRayRoomNumMax;
	}
	public int iGetXRayRoomNumMin()
	{
		 return iXRayRoomNumMin;
	}
	public int iGetXRayRoomTotalClinicalEngineerNumMax()
	{
		 return iXRayRoomTotalClinicalEngineerNumMax;
	}
	public int iGetXRayRoomTotalClinicalEngineerNumMin()
	{
		 return iXRayRoomTotalClinicalEngineerNumMin;
	}
	public int iGetXRayRoomClinicalEngineerNumMax()
	{
		 return iXRayRoomClinicalEngineerNumMax;
	}
	public int iGetXRayRoomClinicalEngineerNumMin()
	{
		 return iXRayRoomClinicalEngineerNumMin;
	}

	public int iGetCTRoomNumMax()
	{
		 return iCTRoomNumMax;
	}
	public int iGetCTRoomNumMin()
	{
		 return iCTRoomNumMin;
	}
	public int iGetCTRoomTotalClinicalEngineerNumMax()
	{
		 return iCTRoomTotalClinicalEngineerNumMax;
	}
	public int iGetCTRoomTotalClinicalEngineerNumMin()
	{
		 return iCTRoomTotalClinicalEngineerNumMin;
	}
	public int iGetCTRoomClinicalEngineerNumMax()
	{
		 return iCTRoomClinicalEngineerNumMax;
	}
	public int iGetCTRoomClinicalEngineerNumMin()
	{
		 return iCTRoomClinicalEngineerNumMin;
	}

	public int iGetMRIRoomNumMax()
	{
		return iMRIRoomNumMax;
	}
	public int iGetMRIRoomNumMin()
	{
		return iMRIRoomNumMin;
	}
	public int iGetMRIRoomTotalClinicalEngineerNumMax()
	{
		return iMRIRoomTotalClinicalEngineerNumMax;
	}
	public int iGetMRIRoomTotalClinicalEngineerNumMin()
	{
		return iMRIRoomTotalClinicalEngineerNumMin;
	}
	public int iGetMRIRoomClinicalEngineerNumMax()
	{
		return iMRIRoomClinicalEngineerNumMax;
	}
	public int iGetMRIRoomClinicalEngineerNumMin()
	{
		return iMRIRoomClinicalEngineerNumMin;
	}

	public int iGetAngiographyRoomNumMax()
	{
		return iAngiographyRoomNumMax;
	}
	public int iGetAngiographyRoomNumMin()
	{
		return iAngiographyRoomNumMin;
	}
	public int iGetAngiographyRoomTotalClinicalEngineerNumMax()
	{
		return iAngiographyRoomTotalClinicalEngineerNumMax;
	}
	public int iGetAngiographyRoomTotalClinicalEngineerNumMin()
	{
		return iAngiographyRoomTotalClinicalEngineerNumMin;
	}
	public int iGetAngiographyRoomClinicalEngineerNumMax()
	{
		return iAngiographyRoomClinicalEngineerNumMax;
	}
	public int iGetAngiographyRoomClinicalEngineerNumMin()
	{
		return iAngiographyRoomClinicalEngineerNumMin;
	}

	public int iGetFastRoomNumMax()
	{
		return iFastRoomNumMax;
	}
	public int iGetFastRoomNumMin()
	{
		return iFastRoomNumMin;
	}
	public int iGetFastRoomTotalClinicalEngineerNumMax()
	{
		return iFastRoomTotalClinicalEngineerNumMax;
	}
	public int iGetFastRoomTotalClinicalEngineerNumMin()
	{
		return iFastRoomTotalClinicalEngineerNumMin;
	}
	public int iGetFastRoomClinicalEngineerNumMax()
	{
		return iFastRoomClinicalEngineerNumMax;
	}
	public int iGetFastRoomClinicalEngineerNumMin()
	{
		return iFastRoomClinicalEngineerNumMin;
	}

}
