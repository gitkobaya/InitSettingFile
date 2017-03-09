package initparam;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

import initsettingfile.InitSettingFileRead;

public class InitInverseSimParam extends InitSettingFileRead
{
	private int iConsultationRoomNumMax;					// �f�@�����̍ő�l
	private int iConsultationRoomNumMin;					// �f�@�����̍ŏ��l
	private int iConsultationRoomTotalDoctorNumMax;			// �f�@���ɏ��������t�̑����̍ő�l
	private int iConsultationRoomTotalDoctorNumMin;			// �f�@���ɏ��������t�̑����̍ŏ��l
	private int iConsultationRoomDoctorNumMax;				// 1�f�@���ɏ��������t�̍ő�l
	private int iConsultationRoomDoctorNumMin;				// 1�f�@���ɏ��������t�̍ŏ��l
	private int iConsultationRoomTotalNurseNumMax;			// �f�@���ɏ�������Ō�t�̑����̍ő�l
	private int iConsultationRoomTotalNurseNumMin;			// �f�@���ɏ�������Ō�t�̑����̍ŏ��l
	private int iConsultationRoomNurseNumMax;				// 1�f�@���ɏ�������Ō�t�̍ő�l
	private int iConsultationRoomNurseNumMin;				// 1�f�@���ɏ�������Ō�t�̍ŏ��l

	private int iOperationRoomNumMax;						// ��p�����̍ő�l
	private int iOperationRoomNumMin;						// ��p�����̍ŏ��l
	private int iOperationRoomTotalDoctorNumMax;			// ��p���ɏ��������t�̑����̍ő�l
	private int iOperationRoomTotalDoctorNumMin;			// ��p���ɏ��������t�̑����̍ŏ��l
	private int iOperationRoomDoctorNumMax;					// 1��p���ɏ��������t�̍ő�l
	private int iOperationRoomDoctorNumMin;					// 1��p���ɏ��������t�̍ŏ��l
	private int iOperationRoomTotalNurseNumMax;				// 1��p���ɏ�������Ō�t�̑����̍ő�l
	private int iOperationRoomTotalNurseNumMin;				// 1��p���ɏ�������Ō�t�̑����̍ŏ��l
	private int iOperationRoomNurseNumMax;					// 1��p���ɏ�������Ō�t�̍ő�l
	private int iOperationRoomNurseNumMin;					// 1��p���ɏ�������Ō�t�̍ŏ��l

	private int iEmergencyRoomNumMax;						// ���Î����̍ő�l
	private int iEmergencyRoomNumMin;						// ���Î����̍ŏ��l
	private int iEmergencyRoomTotalDoctorNumMax;			// ���Î��ɏ��������t�̑����̍ő�l
	private int iEmergencyRoomTotalDoctorNumMin;			// ���Î��ɏ��������t�̑����̍ŏ��l
	private int iEmergencyRoomDoctorNumMax;					// 1���Î��ɏ��������t�̍ő�l
	private int iEmergencyRoomDoctorNumMin;					// 1���Î��ɏ��������t�̍ŏ��l
	private int iEmergencyRoomTotalNurseNumMax;				// ���Î��ɏ�������Ō�t�̑����̍ő�l
	private int iEmergencyRoomTotalNurseNumMin;				// ���Î��ɏ�������Ō�t�̑����̍ŏ��l
	private int iEmergencyRoomNurseNumMax;					// 1���Î��ɏ�������Ō�t�̍ő�l
	private int iEmergencyRoomNurseNumMin;					// 1���Î��ɏ�������Ō�t�̍ŏ��l
	private int iEmergencyRoomTotalClinicalEngineerNumMax;	// ���Î��ɏ��������ËZ�t�̑����̍ő�l
	private int iEmergencyRoomTotalClinicalEngineerNumMin;	// ���Î��ɏ��������ËZ�t�̑����̍ŏ��l
	private int iEmergencyRoomClinicalEngineerNumMax;		// 1���Î��ɏ��������ËZ�t�̍ő�l
	private int iEmergencyRoomClinicalEngineerNumMin;		// 1���Î��ɏ��������ËZ�t�̍ŏ��l

	private int iObservationRoomNumMax;						// �ώ@�����̍ő�l
	private int iObservationRoomNumMin;						// �ώ@�����̍ŏ��l
	private int iObservationRoomTotalNurseNumMax;			// �ώ@���ɏ�������Ō�t�̑����̍ő�l
	private int iObservationRoomTotalNurseNumMin;			// �ώ@���ɏ�������Ō�t�̑����̍ŏ��l
	private int iObservationRoomNurseNumMax;				// 1�ώ@���ɏ�������Ō�t�̍ő�l
	private int iObservationRoomNurseNumMin;				// 1�ώ@���ɏ�������Ō�t�̍ŏ��l

	private int iInjurySevereObservationRoomNumMax;			// �d�Ǌώ@�����̍ő�l
	private int iInjurySevereObservationRoomNumMin;			// �d�Ǌώ@�����̍ŏ��l
	private int iInjurySevereObservationRoomTotalNurseNumMax;// �d�Ǌώ@���ɏ�������Ō�t�̑����̍ő�l
	private int iInjurySevereObservationRoomTotalNurseNumMin;// �d�Ǌώ@���ɏ�������Ō�t�̑����̍ŏ��l
	private int iInjurySevereObservationRoomNurseNumMax;	// 1�d�Ǌώ@���ɏ�������Ō�t�̍ő�l
	private int iInjurySevereObservationRoomNurseNumMin;	// 1�d�Ǌώ@���ɏ�������Ō�t�̍ŏ��l

	private int iIntensiveCareUnitNumMax;				// �W�����Î����̍ő�l
	private int iIntensiveCareUnitNumMin;				// �W�����Î����̍ŏ��l
	private int iIntensiveCareUnitTotalDoctorNumMax;	// �W�����Î��ɏ��������t�̑����̍ő�l
	private int iIntensiveCareUnitTotalDoctorNumMin;	// �W�����Î��ɏ��������t�̑����̍ŏ��l
	private int iIntensiveCareUnitDoctorNumMax;			// 1�W�����Î��ɏ��������t�̍ő�l
	private int iIntensiveCareUnitDoctorNumMin;			// 1�W�����Î��ɏ��������t�̍ŏ��l
	private int iIntensiveCareUnitTotalNurseNumMax;		// �W�����Î��ɏ�������Ō�t�̑����̍ő�l
	private int iIntensiveCareUnitTotalNurseNumMin;		// �W�����Î��ɏ�������Ō�t�̑����̍ŏ��l
	private int iIntensiveCareUnitNurseNumMax;			// 1�W�����Î��ɏ�������Ō�t�̍ő�l
	private int iIntensiveCareUnitNurseNumMin;			// 1�W�����Î��ɏ�������Ō�t�̍ŏ��l

	private int iHighCareUnitNumMax;					// HCU���̍ő�l
	private int iHighCareUnitNumMin;					// HCU���̍ŏ��l
	private int iHighCareUnitTotalDoctorNumMax;			// HCU�ɏ��������t�̑����̍ő�l
	private int iHighCareUnitTotalDoctorNumMin;			// HCU�ɏ��������t�̑����̍ŏ��l
	private int iHighCareUnitDoctorNumMax;				// 1HCU�ɏ��������t�̍ő�l
	private int iHighCareUnitDoctorNumMin;				// 1HCU�ɏ��������t�̍ŏ��l
	private int iHighCareUnitTotalNurseNumMax;			// HCU�ɏ�������Ō�t�̑����̍ő�l
	private int iHighCareUnitTotalNurseNumMin;			// HCU�ɏ�������Ō�t�̑����̍ŏ��l
	private int iHighCareUnitNurseNumMax;				// 1HCU�ɏ�������Ō�t�̍ő�l
	private int iHighCareUnitNurseNumMin;				// 1HCU�ɏ�������Ō�t�̍ŏ��l

	private int iGeneralWardNumMax;						// ��ʕa�����̍ő�l
	private int iGeneralWardNumMin;						// ��ʕa�����̍ŏ��l
	private int iGeneralWardTotalDoctorNumMax;			// ��ʕa���ɏ��������t�̑����̍ő�l
	private int iGeneralWardTotalDoctorNumMin;			// ��ʕa���ɏ��������t�̑����̍ŏ��l
	private int iGeneralWardDoctorNumMax;				// 1��ʕa���ɏ��������t�̍ő�l
	private int iGeneralWardDoctorNumMin;				// 1��ʕa���ɏ��������t�̍ŏ��l
	private int iGeneralWardTotalNurseNumMax;			// ��ʕa���ɏ�������Ō�t�̑����̍ő�l
	private int iGeneralWardTotalNurseNumMin;			// ��ʕa���ɏ�������Ō�t�̑����̍ŏ��l
	private int iGeneralWardNurseNumMax;				// 1��ʕa���ɏ�������Ō�t�̍ő�l
	private int iGeneralWardNurseNumMin;				// 1��ʕa���ɏ�������Ō�t�̍ŏ��l

	private int iWaitingRoomNumMax;						// �ҍ������̍ő�l
	private int iWaitingRoomNumMin;						// �ҍ������̍ŏ��l
	private int iWaitingRoomTotalNurseNumMax;			// �ҍ����ɏ�������Ō�t�̑����̍ő�l
	private int iWaitingRoomTotalNurseNumMin;			// �ҍ����ɏ�������Ō�t�̑����̍ŏ��l
	private int iWaitingRoomNurseNumMax;				// 1�ҍ����ɏ�������Ō�t�̍ő�l
	private int iWaitingRoomNurseNumMin;				// 1�ҍ����ɏ�������Ō�t�̍ŏ��l

	private int iXRayRoomNumMax;							// X�������̍ő�l
	private int iXRayRoomNumMin;							// X�������̍ŏ��l
	private int iXRayRoomTotalClinicalEngineerNumMax;		// X�����ɏ��������ËZ�t�̑����̍ő�l
	private int iXRayRoomTotalClinicalEngineerNumMin;		// X�����ɏ��������ËZ�t�̑����̍ŏ��l
	private int iXRayRoomClinicalEngineerNumMax;			// 1X�����ɏ��������ËZ�t�̍ő�l
	private int iXRayRoomClinicalEngineerNumMin;			// 1X�����ɏ��������ËZ�t�̍ŏ��l

	private int iCTRoomNumMax;								// CT�����̍ő�l
	private int iCTRoomNumMin;								// CT�����̍ŏ��l
	private int iCTRoomTotalClinicalEngineerNumMax;			// CT���ɏ��������ËZ�t�̑����̍ő�l
	private int iCTRoomTotalClinicalEngineerNumMin;			// CT���ɏ��������ËZ�t�̑����̍ŏ��l
	private int iCTRoomClinicalEngineerNumMax;				// 1CT���ɏ��������ËZ�t�̍ő�l
	private int iCTRoomClinicalEngineerNumMin;				// 1CT���ɏ��������ËZ�t�̍ŏ��l

	private int iMRIRoomNumMax;								// MRI�����̍ő�l
	private int iMRIRoomNumMin;								// MRI�����̍ŏ��l
	private int iMRIRoomTotalClinicalEngineerNumMax;		// MRI���ɏ��������ËZ�t�̑����̍ő�l
	private int iMRIRoomTotalClinicalEngineerNumMin;		// MRI���ɏ��������ËZ�t�̑����̍ŏ��l
	private int iMRIRoomClinicalEngineerNumMax;				// 1MRI���ɏ��������ËZ�t�̍ő�l
	private int iMRIRoomClinicalEngineerNumMin;				// 1MRI���ɏ��������ËZ�t�̍ŏ��l

	private int iAngiographyRoomNumMax;						// ���Ǒ��e�����̍ő�l
	private int iAngiographyRoomNumMin;						// ���Ǒ��e�����̍ŏ��l
	private int iAngiographyRoomTotalClinicalEngineerNumMax;// ���Ǒ��e���ɏ��������ËZ�t�̑����̍ő�l
	private int iAngiographyRoomTotalClinicalEngineerNumMin;// ���Ǒ��e���ɏ��������ËZ�t�̑����̍ŏ��l
	private int iAngiographyRoomClinicalEngineerNumMax;		// 1���Ǒ��e���ɏ��������ËZ�t�̍ő�l
	private int iAngiographyRoomClinicalEngineerNumMin;		// 1���Ǒ��e���ɏ��������ËZ�t�̍ŏ��l

	private int iFastRoomNumMax;							// FAST�����̍ő�l
	private int iFastRoomNumMin;							// FAST�����̍ŏ��l
	private int iFastRoomTotalClinicalEngineerNumMax;		// FAST���ɏ��������ËZ�t�̑����̍ő�l
	private int iFastRoomTotalClinicalEngineerNumMin;		// FAST���ɏ��������ËZ�t�̑����̍ŏ��l
	private int iFastRoomClinicalEngineerNumMax;			// 1FAST���ɏ��������ËZ�t�̍ő�l
	private int iFastRoomClinicalEngineerNumMin;			// 1FAST���ɏ��������ËZ�t�̍ŏ��l

	@Override
	public void readInitSettingFile() throws IllegalArgumentException, IOException
	{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
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

	// ��������ݒ�

		strIniFullPath = file.getAbsolutePath( );

		// �f�@�����̍ŏ��l���擾���܂��B
		iConsultationRoomNumMin = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomMin", -1, strIniFullPath );
		if( 0 > iConsultationRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of consultation room number is out of range"));
		}
		// �f�@�����̍ő�l���擾���܂��B
		iConsultationRoomNumMax = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomMax", -1, strIniFullPath );
		if( 0 > iConsultationRoomNumMin || iConsultationRoomNumMax < iConsultationRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of consultation room number is out of range"));
		}
		// �f�@���̈�t�̑����̍ŏ��l���擾���܂��B
		iConsultationRoomTotalDoctorNumMin = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomTotalDoctorMin", -1, strIniFullPath );
		if( 0 > iConsultationRoomTotalDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total doctor in the consultation room number is out of range"));
		}
		// �f�@���̈�t�̑����̍ő�l���擾���܂��B
		iConsultationRoomTotalDoctorNumMax = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomTotalDoctorMax", -1, strIniFullPath );
		if( 0 > iConsultationRoomTotalDoctorNumMax || iConsultationRoomTotalDoctorNumMax < iConsultationRoomTotalDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total doctor in the consultation room number is out of range"));
		}
		// 1�f�@���̈�t�̍ŏ��l���擾���܂��B
		iConsultationRoomDoctorNumMin = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomDoctorMin", -1, strIniFullPath );
		if( 0 > iConsultationRoomDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of doctor in the consultation room number is out of range"));
		}
		// 1�f�@���̈�t�̍ő�l���擾���܂��B
		iConsultationRoomDoctorNumMax = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomDoctorMax", -1, strIniFullPath );
		if( 0 > iConsultationRoomDoctorNumMax || iConsultationRoomDoctorNumMax < iConsultationRoomDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of doctor in the consultation room is out of range"));
		}
		// �f�@���̊Ō�t�̑����̍ŏ��l���擾���܂��B
		iConsultationRoomTotalNurseNumMin = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomTotalNurseMin", -1, strIniFullPath );
		if( 0 > iConsultationRoomTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total nurse in the consultation room number is out of range"));
		}
		// �f�@���̊Ō�t�̑����̍ő�l���擾���܂��B
		iConsultationRoomTotalNurseNumMax = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomTotalNurseMax", -1, strIniFullPath );
		if( 0 > iConsultationRoomTotalNurseNumMax || iConsultationRoomTotalNurseNumMax < iConsultationRoomTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total nurse in the consultation room number is out of range"));
		}
		// 1�f�@���̊Ō�t�̍ŏ��l���擾���܂��B
		iConsultationRoomNurseNumMin = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomNurseMin", -1, strIniFullPath );
		if( 0 > iConsultationRoomNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of nurse in the consultation room number is out of range"));
		}
		// 1�f�@���̊Ō�t�̍ő�l���擾���܂��B
		iConsultationRoomNurseNumMax = (int)GetInitDataInt( strConsultationRoomSectionName, "ConsultationRoomNurseMax", -1, strIniFullPath );
		if( 0 > iConsultationRoomNurseNumMax || iConsultationRoomNurseNumMax < iConsultationRoomNurseNumMin)
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of nurse in the consultation room is out of range"));
		}

		// ��p�����̍ŏ��l���擾���܂��B
		iOperationRoomNumMin = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomMin", -1, strIniFullPath );
		if( 0 > iOperationRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of operation room number is out of range"));
		}
		// ��p�����̍ő�l���擾���܂��B
		iOperationRoomNumMax = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomMax", -1, strIniFullPath );
		if( 0 > iOperationRoomNumMin || iOperationRoomNumMax < iOperationRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of operation room number is out of range"));
		}
		// ��p���̈�t�̑����̍ŏ��l���擾���܂��B
		iOperationRoomTotalDoctorNumMin = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomTotalDoctorMin", -1, strIniFullPath );
		if( 0 > iOperationRoomTotalDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total doctor in the operation room number is out of range"));
		}
		// ��p���̈�t�̑����̍ő�l���擾���܂��B
		iOperationRoomTotalDoctorNumMax = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomTotalDoctorMax", -1, strIniFullPath );
		if( 0 > iOperationRoomTotalDoctorNumMax || iOperationRoomTotalDoctorNumMax < iOperationRoomTotalDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total doctor in the operation room number is out of range"));
		}
		// 1��p���̈�t�̍ŏ��l���擾���܂��B
		iOperationRoomDoctorNumMin = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomDoctorMin", -1, strIniFullPath );
		if( 0 > iOperationRoomDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of doctor in the operation room number is out of range"));
		}
		// 1��p���̈�t�̍ő�l���擾���܂��B
		iOperationRoomDoctorNumMax = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomDoctorMax", -1, strIniFullPath );
		if( 0 > iOperationRoomDoctorNumMax || iOperationRoomDoctorNumMax < iOperationRoomDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of doctor in the operation room is out of range"));
		}
		// ��p���̊Ō�t�̑����̍ŏ��l���擾���܂��B
		iOperationRoomTotalNurseNumMin = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomTotalNurseMin", -1, strIniFullPath );
		if( 0 > iOperationRoomTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total nurse in the operation room number is out of range"));
		}
		// ��p���̊Ō�t�̑����̍ő�l���擾���܂��B
		iOperationRoomTotalNurseNumMax = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomTotalNurseMax", -1, strIniFullPath );
		if( 0 > iOperationRoomTotalNurseNumMax || iOperationRoomTotalNurseNumMax < iOperationRoomTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total nurse in the operation room number is out of range"));
		}
		// 1��p���̊Ō�t�̍ŏ��l���擾���܂��B
		iOperationRoomNurseNumMin = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomNurseMin", -1, strIniFullPath );
		if( 0 > iOperationRoomNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of nurse in the operation room number is out of range"));
		}
		// 1��p���̊Ō�t�̍ő�l���擾���܂��B
		iOperationRoomNurseNumMax = (int)GetInitDataInt( strOperationRoomSectionName, "OperationRoomNurseMax", -1, strIniFullPath );
		if( 0 > iOperationRoomNurseNumMax || iOperationRoomNurseNumMax < iOperationRoomNurseNumMin)
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of nurse in the operation room is out of range"));
		}

		// ���Î����̍ŏ��l���擾���܂��B
		iEmergencyRoomNumMin = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomMin", -1, strIniFullPath );
		if( 0 > iEmergencyRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of emergency room number is out of range"));
		}
		// ���Î����̍ő�l���擾���܂��B
		iEmergencyRoomNumMax = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomMax", -1, strIniFullPath );
		if( 0 > iEmergencyRoomNumMin || iEmergencyRoomNumMax < iEmergencyRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of emergency room number is out of range"));
		}
		// ���Î��̈�t�̑����̍ŏ��l���擾���܂��B
		iEmergencyRoomTotalDoctorNumMin = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomTotalDoctorMin", -1, strIniFullPath );
		if( 0 > iEmergencyRoomTotalDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total doctor in the emergency room number is out of range"));
		}
		// ���Î��̈�t�̑����̍ő�l���擾���܂��B
		iEmergencyRoomTotalDoctorNumMax = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomTotalDoctorMax", -1, strIniFullPath );
		if( 0 > iEmergencyRoomTotalDoctorNumMax || iEmergencyRoomTotalDoctorNumMax < iEmergencyRoomTotalDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total doctor in the emergency room number is out of range"));
		}
		// 1���Î��̈�t�̍ŏ��l���擾���܂��B
		iEmergencyRoomDoctorNumMin = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomDoctorMin", -1, strIniFullPath );
		if( 0 > iEmergencyRoomDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of doctor in the emergency room number is out of range"));
		}
		// 1���Î��̈�t�̍ő�l���擾���܂��B
		iEmergencyRoomDoctorNumMax = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomDoctorMax", -1, strIniFullPath );
		if( 0 > iEmergencyRoomDoctorNumMax || iEmergencyRoomDoctorNumMax < iEmergencyRoomDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of doctor in the emergency room is out of range"));
		}
		// ���Î��̊Ō�t�̑����̍ŏ��l���擾���܂��B
		iEmergencyRoomTotalNurseNumMin = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomTotalNurseMin", -1, strIniFullPath );
		if( 0 > iEmergencyRoomTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total nurse in the emergency room number is out of range"));
		}
		// ���Î��̊Ō�t�̑����̍ő�l���擾���܂��B
		iEmergencyRoomTotalNurseNumMax = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomTotalNurseMax", -1, strIniFullPath );
		if( 0 > iEmergencyRoomTotalNurseNumMax || iEmergencyRoomTotalNurseNumMax < iEmergencyRoomTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total nurse in the emergency room number is out of range"));
		}
		// 1���Î��̊Ō�t�̍ŏ��l���擾���܂��B
		iEmergencyRoomNurseNumMin = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomNurseMin", -1, strIniFullPath );
		if( 0 > iEmergencyRoomNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of nurse in the emergency room number is out of range"));
		}
		// 1���Î��̊Ō�t�̍ő�l���擾���܂��B
		iEmergencyRoomNurseNumMax = (int)GetInitDataInt( strEmergencyRoomSectionName, "EmergencyRoomNurseMax", -1, strIniFullPath );
		if( 0 > iEmergencyRoomNurseNumMax || iEmergencyRoomNurseNumMax < iEmergencyRoomNurseNumMin)
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of nurse in the emergency room is out of range"));
		}

		// �ώ@�����̍ŏ��l���擾���܂��B
		iObservationRoomNumMin = (int)GetInitDataInt( strObservationRoomSectionName, "ObservationRoomMin", -1, strIniFullPath );
		if( 0 > iObservationRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of observation room number is out of range"));
		}
		// �ώ@�����̍ő�l���擾���܂��B
		iObservationRoomNumMax = (int)GetInitDataInt( strObservationRoomSectionName, "ObservationRoomMax", -1, strIniFullPath );
		if( 0 > iObservationRoomNumMin || iObservationRoomNumMax < iObservationRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of observation room number is out of range"));
		}
		// �ώ@���̊Ō�t�̑����̍ŏ��l���擾���܂��B
		iObservationRoomTotalNurseNumMin = (int)GetInitDataInt( strObservationRoomSectionName, "ObservationRoomTotalNurseMin", -1, strIniFullPath );
		if( 0 > iObservationRoomTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total nurse in the observation room number is out of range"));
		}
		// �ώ@���̊Ō�t�̑����̍ő�l���擾���܂��B
		iObservationRoomTotalNurseNumMax = (int)GetInitDataInt( strObservationRoomSectionName, "ObservationRoomTotalNurseMax", -1, strIniFullPath );
		if( 0 > iObservationRoomTotalNurseNumMax || iObservationRoomTotalNurseNumMax < iObservationRoomTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total nurse in the observation room number is out of range"));
		}
		// 1�ώ@���̊Ō�t�̍ŏ��l���擾���܂��B
		iObservationRoomNurseNumMin = (int)GetInitDataInt( strObservationRoomSectionName, "ObservationRoomNurseMin", -1, strIniFullPath );
		if( 0 > iObservationRoomNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of nurse in the observation room number is out of range"));
		}
		// 1�ώ@���̊Ō�t�̍ő�l���擾���܂��B
		iObservationRoomNurseNumMax = (int)GetInitDataInt( strObservationRoomSectionName, "ObservationRoomNurseMax", -1, strIniFullPath );
		if( 0 > iObservationRoomNurseNumMax || iObservationRoomNurseNumMax < iObservationRoomNurseNumMin)
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of nurse in the observation room is out of range"));
		}

		// �d�Ǌώ@�����̍ŏ��l���擾���܂��B
		iInjurySevereObservationRoomNumMin = (int)GetInitDataInt( strInjurySevereObservationRoomSectionName, "InjurySevereObservationRoomMin", -1, strIniFullPath );
		if( 0 > iInjurySevereObservationRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of injury severe observation room number is out of range"));
		}
		// �d�Ǌώ@�����̍ő�l���擾���܂��B
		iInjurySevereObservationRoomNumMax = (int)GetInitDataInt( strInjurySevereObservationRoomSectionName, "InjurySevereObservationRoomMax", -1, strIniFullPath );
		if( 0 > iInjurySevereObservationRoomNumMin || iInjurySevereObservationRoomNumMax < iInjurySevereObservationRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of injury severe observation room number is out of range"));
		}
		// �d�Ǌώ@���̊Ō�t�̑����̍ŏ��l���擾���܂��B
		iInjurySevereObservationRoomTotalNurseNumMin = (int)GetInitDataInt( strInjurySevereObservationRoomSectionName, "InjurySevereObservationRoomTotalNurseMin", -1, strIniFullPath );
		if( 0 > iInjurySevereObservationRoomTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total nurse in the injury severe observation room number is out of range"));
		}
		// �d�Ǌώ@���̊Ō�t�̑����̍ő�l���擾���܂��B
		iInjurySevereObservationRoomTotalNurseNumMax = (int)GetInitDataInt( strInjurySevereObservationRoomSectionName, "InjurySevereObservationRoomTotalNurseMax", -1, strIniFullPath );
		if( 0 > iInjurySevereObservationRoomTotalNurseNumMax || iInjurySevereObservationRoomTotalNurseNumMax < iInjurySevereObservationRoomTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total nurse in the injury severe observation room number is out of range"));
		}
		// 1�d�Ǌώ@���̊Ō�t�̍ŏ��l���擾���܂��B
		iInjurySevereObservationRoomNurseNumMin = (int)GetInitDataInt( strInjurySevereObservationRoomSectionName, "InjurySevereObservationRoomNurseMin", -1, strIniFullPath );
		if( 0 > iInjurySevereObservationRoomNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of nurse in the injury severe observation room number is out of range"));
		}
		// 1�d�Ǌώ@���̊Ō�t�̍ő�l���擾���܂��B
		iInjurySevereObservationRoomNurseNumMax = (int)GetInitDataInt( strInjurySevereObservationRoomSectionName, "InjurySevereObservationRoomNurseMax", -1, strIniFullPath );
		if( 0 > iInjurySevereObservationRoomNurseNumMax || iInjurySevereObservationRoomNurseNumMax < iInjurySevereObservationRoomNurseNumMin)
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of nurse in the injury severe observation room is out of range"));
		}

		// ICU���̍ŏ��l���擾���܂��B
		iIntensiveCareUnitNumMin = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitMin", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of consultation room number is out of range"));
		}
		// ICU���̍ő�l���擾���܂��B
		iIntensiveCareUnitNumMax = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitMax", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitNumMin || iIntensiveCareUnitNumMax < iIntensiveCareUnitNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of intensive care unit number is out of range"));
		}
		// ICU�̈�t�̑����̍ŏ��l���擾���܂��B
		iIntensiveCareUnitTotalDoctorNumMin = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitTotalDoctorMin", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitTotalDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total doctor in the intensive care unit number is out of range"));
		}
		// ICU�̈�t�̑����̍ő�l���擾���܂��B
		iIntensiveCareUnitTotalDoctorNumMax = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitTotalDoctorMax", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitTotalDoctorNumMax || iIntensiveCareUnitTotalDoctorNumMax < iIntensiveCareUnitTotalDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total doctor in the intensive care unit number is out of range"));
		}
		// 1ICU�̈�t�̍ŏ��l���擾���܂��B
		iIntensiveCareUnitDoctorNumMin = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitDoctorMin", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of doctor in the intensive care unit number is out of range"));
		}
		// 1ICU�̈�t�̍ő�l���擾���܂��B
		iIntensiveCareUnitDoctorNumMax = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitDoctorMax", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitDoctorNumMax || iIntensiveCareUnitDoctorNumMax < iIntensiveCareUnitDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of doctor in the intensive care unit is out of range"));
		}
		// ICU�̊Ō�t�̑����̍ŏ��l���擾���܂��B
		iIntensiveCareUnitTotalNurseNumMin = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitTotalNurseMin", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total nurse in the intensive care unit number is out of range"));
		}
		// ICU�̊Ō�t�̑����̍ő�l���擾���܂��B
		iIntensiveCareUnitTotalNurseNumMax = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitTotalNurseMax", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitTotalNurseNumMax || iIntensiveCareUnitTotalNurseNumMax < iIntensiveCareUnitTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total nurse in the intensive care unit number is out of range"));
		}
		// 1ICU�̊Ō�t�̍ŏ��l���擾���܂��B
		iIntensiveCareUnitNurseNumMin = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitNurseMin", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of nurse in the intensive care unit number is out of range"));
		}
		// 1ICU�̊Ō�t�̍ő�l���擾���܂��B
		iIntensiveCareUnitNurseNumMax = (int)GetInitDataInt( strIntensiveCareUnitSectionName, "IntensiveCareUnitNurseMax", -1, strIniFullPath );
		if( 0 > iIntensiveCareUnitNurseNumMax || iIntensiveCareUnitNurseNumMax < iIntensiveCareUnitNurseNumMin)
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of nurse in the intensive care unit is out of range"));
		}

		// HCU���̍ŏ��l���擾���܂��B
		iHighCareUnitNumMin = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitMin", -1, strIniFullPath );
		if( 0 > iHighCareUnitNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of consultation room number is out of range"));
		}
		// HCU���̍ő�l���擾���܂��B
		iHighCareUnitNumMax = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitMax", -1, strIniFullPath );
		if( 0 > iHighCareUnitNumMin || iHighCareUnitNumMax < iHighCareUnitNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of cohigh care unitumber is out of range"));
		}
		// HCU�̈�t�̑����̍ŏ��l���擾���܂��B
		iHighCareUnitTotalDoctorNumMin = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitTotalDoctorMin", -1, strIniFullPath );
		if( 0 > iHighCareUnitTotalDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total doctor in the high care unit number is out of range"));
		}
		// HCU�̈�t�̑����̍ő�l���擾���܂��B
		iHighCareUnitTotalDoctorNumMax = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitTotalDoctorMax", -1, strIniFullPath );
		if( 0 > iHighCareUnitTotalDoctorNumMax || iHighCareUnitTotalDoctorNumMax < iHighCareUnitTotalDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total doctor in the high care unit number is out of range"));
		}
		// 1HCU�̈�t�̍ŏ��l���擾���܂��B
		iHighCareUnitDoctorNumMin = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitDoctorMin", -1, strIniFullPath );
		if( 0 > iHighCareUnitDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of doctor in the high care unit number is out of range"));
		}
		// 1HCU�̈�t�̍ő�l���擾���܂��B
		iHighCareUnitDoctorNumMax = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitDoctorMax", -1, strIniFullPath );
		if( 0 > iHighCareUnitDoctorNumMax || iHighCareUnitDoctorNumMax < iHighCareUnitDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of doctor in the high care unit is out of range"));
		}
		// HCU�̊Ō�t�̑����̍ŏ��l���擾���܂��B
		iHighCareUnitTotalNurseNumMin = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitTotalNurseMin", -1, strIniFullPath );
		if( 0 > iHighCareUnitTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total nurse in the high care unit number is out of range"));
		}
		// HCU�̊Ō�t�̑����̍ő�l���擾���܂��B
		iHighCareUnitTotalNurseNumMax = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitTotalNurseMax", -1, strIniFullPath );
		if( 0 > iHighCareUnitTotalNurseNumMax || iHighCareUnitTotalNurseNumMax < iHighCareUnitTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total nurse in the high care unit number is out of range"));
		}
		// 1HCU�̊Ō�t�̍ŏ��l���擾���܂��B
		iHighCareUnitNurseNumMin = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitNurseMin", -1, strIniFullPath );
		if( 0 > iHighCareUnitNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of nurse in the high care unit number is out of range"));
		}
		// 1HCU�̊Ō�t�̍ő�l���擾���܂��B
		iHighCareUnitNurseNumMax = (int)GetInitDataInt( strHighCareUnitSectionName, "HighCareUnitNurseMax", -1, strIniFullPath );
		if( 0 > iHighCareUnitNurseNumMax || iHighCareUnitNurseNumMax < iHighCareUnitNurseNumMin)
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of nurse in the high care unit is out of range"));
		}

		// ��ʕa�����̍ŏ��l���擾���܂��B
		iGeneralWardNumMin = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardMin", -1, strIniFullPath );
		if( 0 > iGeneralWardNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of general ward number is out of range"));
		}
		// ��ʕa�����̍ő�l���擾���܂��B
		iGeneralWardNumMax = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardMax", -1, strIniFullPath );
		if( 0 > iGeneralWardNumMin || iGeneralWardNumMax < iGeneralWardNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value general wardoom number is out of range"));
		}
		// ��ʕa���̈�t�̑����̍ŏ��l���擾���܂��B
		iGeneralWardTotalDoctorNumMin = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardTotalDoctorMin", -1, strIniFullPath );
		if( 0 > iGeneralWardTotalDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total doctor in the general ward number is out of range"));
		}
		// ��ʕa���̈�t�̑����̍ő�l���擾���܂��B
		iGeneralWardTotalDoctorNumMax = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardTotalDoctorMax", -1, strIniFullPath );
		if( 0 > iGeneralWardTotalDoctorNumMax || iGeneralWardTotalDoctorNumMax < iGeneralWardTotalDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total doctor in the general ward number is out of range"));
		}
		// 1��ʕa���̈�t�̍ŏ��l���擾���܂��B
		iGeneralWardDoctorNumMin = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardDoctorMin", -1, strIniFullPath );
		if( 0 > iGeneralWardDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of doctor in the general ward number is out of range"));
		}
		// 1��ʕa���̈�t�̍ő�l���擾���܂��B
		iGeneralWardDoctorNumMax = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardDoctorMax", -1, strIniFullPath );
		if( 0 > iGeneralWardDoctorNumMax || iGeneralWardDoctorNumMax < iGeneralWardDoctorNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of doctor in the general ward is out of range"));
		}
		// ��ʕa���̊Ō�t�̑����̍ŏ��l���擾���܂��B
		iGeneralWardTotalNurseNumMin = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardTotalNurseMin", -1, strIniFullPath );
		if( 0 > iGeneralWardTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total nurse in the general ward number is out of range"));
		}
		// ��ʕa���̊Ō�t�̑����̍ő�l���擾���܂��B
		iGeneralWardTotalNurseNumMax = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardTotalNurseMax", -1, strIniFullPath );
		if( 0 > iGeneralWardTotalNurseNumMax || iGeneralWardTotalNurseNumMax < iGeneralWardTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total nurse in the general ward number is out of range"));
		}
		// 1��ʕa���̊Ō�t�̍ŏ��l���擾���܂��B
		iGeneralWardNurseNumMin = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardNurseMin", -1, strIniFullPath );
		if( 0 > iGeneralWardNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of nurse in the general ward number is out of range"));
		}
		// 1��ʕa���̊Ō�t�̍ő�l���擾���܂��B
		iGeneralWardNurseNumMax = (int)GetInitDataInt( strGeneralWardSectionName, "GeneralWardNurseMax", -1, strIniFullPath );
		if( 0 > iGeneralWardNurseNumMax || iGeneralWardNurseNumMax < iGeneralWardNurseNumMin)
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of nurse in the general ward is out of range"));
		}

		// �ҍ������̍ŏ��l���擾���܂��B
		iWaitingRoomNumMin = (int)GetInitDataInt( strWaitingRoomSectionName, "WaitingRoomMin", -1, strIniFullPath );
		if( 0 > iWaitingRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of waiting room number is out of range"));
		}
		// �ҍ������̍ő�l���擾���܂��B
		iWaitingRoomNumMax = (int)GetInitDataInt( strWaitingRoomSectionName, "WaitingRoomMax", -1, strIniFullPath );
		if( 0 > iWaitingRoomNumMin || iWaitingRoomNumMax < iWaitingRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of waiting room number is out of range"));
		}
		// �ҍ����̊Ō�t�̑����̍ŏ��l���擾���܂��B
		iWaitingRoomTotalNurseNumMin = (int)GetInitDataInt( strWaitingRoomSectionName, "WaitingRoomTotalNurseMin", -1, strIniFullPath );
		if( 0 > iWaitingRoomTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total nurse in the waiting room number is out of range"));
		}
		// �ҍ����̊Ō�t�̑����̍ő�l���擾���܂��B
		iWaitingRoomTotalNurseNumMax = (int)GetInitDataInt( strWaitingRoomSectionName, "WaitingRoomTotalNurseMax", -1, strIniFullPath );
		if( 0 > iWaitingRoomTotalNurseNumMax || iWaitingRoomTotalNurseNumMax < iWaitingRoomTotalNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total nurse in the waiting room number is out of range"));
		}
		// 1�ҍ����̊Ō�t�̍ŏ��l���擾���܂��B
		iWaitingRoomNurseNumMin = (int)GetInitDataInt( strWaitingRoomSectionName, "WaitingRoomNurseMin", -1, strIniFullPath );
		if( 0 > iWaitingRoomNurseNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of nurse in the waiting room number is out of range"));
		}
		// 1�ҍ����̊Ō�t�̍ő�l���擾���܂��B
		iWaitingRoomNurseNumMax = (int)GetInitDataInt( strWaitingRoomSectionName, "WaitingRoomNurseMax", -1, strIniFullPath );
		if( 0 > iWaitingRoomNurseNumMax || iWaitingRoomNurseNumMax < iWaitingRoomNurseNumMin)
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of nurse in the waiting room is out of range"));
		}

		// X�������̍ŏ��l���擾���܂��B
		iXRayRoomNumMin = (int)GetInitDataInt( strXRayRoomSectionName, "XRayRoomMin", -1, strIniFullPath );
		if( 0 > iXRayRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of x-ray room number is out of range"));
		}
		// X�������̍ő�l���擾���܂��B
		iXRayRoomNumMax = (int)GetInitDataInt( strXRayRoomSectionName, "XRayRoomMax", -1, strIniFullPath );
		if( 0 > iXRayRoomNumMin || iXRayRoomNumMax < iXRayRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of x-ray room number is out of range"));
		}
		// X�����̈�ËZ�t�̑����̍ŏ��l���擾���܂��B
		iXRayRoomTotalClinicalEngineerNumMin = (int)GetInitDataInt( strXRayRoomSectionName, "XRayRoomTotalClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iXRayRoomTotalClinicalEngineerNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total clinical engineer in the x-ray room number is out of range"));
		}
		// X�����̈�ËZ�t�̑����̍ő�l���擾���܂��B
		iXRayRoomTotalClinicalEngineerNumMax = (int)GetInitDataInt( strXRayRoomSectionName, "XRayRoomTotalClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iXRayRoomTotalClinicalEngineerNumMax || iXRayRoomTotalClinicalEngineerNumMax < iXRayRoomTotalClinicalEngineerNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total clinical engineer in the x-ray room number is out of range"));
		}
		// 1X�����̈�ËZ�t�̍ŏ��l���擾���܂��B
		iXRayRoomClinicalEngineerNumMin = (int)GetInitDataInt( strXRayRoomSectionName, "XRayRoomClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iXRayRoomClinicalEngineerNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of clinical engineer in the x-ray room number is out of range"));
		}
		// 1X�����̈�ËZ�t�̍ő�l���擾���܂��B
		iXRayRoomClinicalEngineerNumMax = (int)GetInitDataInt( strXRayRoomSectionName, "XRayRoomClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iXRayRoomClinicalEngineerNumMax || iXRayRoomClinicalEngineerNumMax < iXRayRoomClinicalEngineerNumMin)
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of clinical engineer in the x-ray room is out of range"));
		}

		// CT�����̍ŏ��l���擾���܂��B
		iCTRoomNumMin = (int)GetInitDataInt( strCTRoomSectionName, "CTRoomMin", -1, strIniFullPath );
		if( 0 > iCTRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of ct room number is out of range"));
		}
		// CT�����̍ő�l���擾���܂��B
		iCTRoomNumMax = (int)GetInitDataInt( strCTRoomSectionName, "CTRoomMax", -1, strIniFullPath );
		if( 0 > iCTRoomNumMin || iCTRoomNumMax < iCTRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of ct room number is out of range"));
		}
		// CT���̈�ËZ�t�̑����̍ŏ��l���擾���܂��B
		iCTRoomTotalClinicalEngineerNumMin = (int)GetInitDataInt( strCTRoomSectionName, "CTRoomTotalClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iCTRoomTotalClinicalEngineerNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total clinical engineer in the ct room number is out of range"));
		}
		// CT���̈�ËZ�t�̑����̍ő�l���擾���܂��B
		iCTRoomTotalClinicalEngineerNumMax = (int)GetInitDataInt( strCTRoomSectionName, "CTRoomTotalClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iCTRoomTotalClinicalEngineerNumMax || iCTRoomTotalClinicalEngineerNumMax < iCTRoomTotalClinicalEngineerNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total clinical engineer in the ct room number is out of range"));
		}
		// 1CT���̈�ËZ�t�̍ŏ��l���擾���܂��B
		iCTRoomClinicalEngineerNumMin = (int)GetInitDataInt( strCTRoomSectionName, "CTRoomClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iCTRoomClinicalEngineerNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of clinical engineer in the ct room number is out of range"));
		}
		// 1CT���̈�ËZ�t�̍ő�l���擾���܂��B
		iCTRoomClinicalEngineerNumMax = (int)GetInitDataInt( strCTRoomSectionName, "CTRoomClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iCTRoomClinicalEngineerNumMax || iCTRoomClinicalEngineerNumMax < iCTRoomClinicalEngineerNumMin)
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of clinical engineer in the ct room is out of range"));
		}

		// MRI�����̍ŏ��l���擾���܂��B
		iMRIRoomNumMin = (int)GetInitDataInt( strMRIRoomSectionName, "MRIRoomMin", -1, strIniFullPath );
		if( 0 > iMRIRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of mri room number is out of range"));
		}
		// MRI�����̍ő�l���擾���܂��B
		iMRIRoomNumMax = (int)GetInitDataInt( strMRIRoomSectionName, "MRIRoomMax", -1, strIniFullPath );
		if( 0 > iMRIRoomNumMin || iMRIRoomNumMax < iMRIRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of mri room number is out of range"));
		}
		// MRI���̈�ËZ�t�̑����̍ŏ��l���擾���܂��B
		iMRIRoomTotalClinicalEngineerNumMin = (int)GetInitDataInt( strMRIRoomSectionName, "MRIRoomTotalClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iMRIRoomTotalClinicalEngineerNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total clinical engineer in the mri room number is out of range"));
		}
		// MRI���̈�ËZ�t�̑����̍ő�l���擾���܂��B
		iMRIRoomTotalClinicalEngineerNumMax = (int)GetInitDataInt( strMRIRoomSectionName, "MRIRoomTotalClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iMRIRoomTotalClinicalEngineerNumMax || iMRIRoomTotalClinicalEngineerNumMax < iMRIRoomTotalClinicalEngineerNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total clinical engineer in the mri room number is out of range"));
		}
		// 1MRI���̈�ËZ�t�̍ŏ��l���擾���܂��B
		iMRIRoomClinicalEngineerNumMin = (int)GetInitDataInt( strMRIRoomSectionName, "MRIRoomClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iMRIRoomClinicalEngineerNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of clinical engineer in the mri room number is out of range"));
		}
		// 1MRI���̈�ËZ�t�̍ő�l���擾���܂��B
		iMRIRoomClinicalEngineerNumMax = (int)GetInitDataInt( strMRIRoomSectionName, "MRIRoomClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iMRIRoomClinicalEngineerNumMax || iMRIRoomClinicalEngineerNumMax < iMRIRoomClinicalEngineerNumMin)
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of clinical engineer in the mri room is out of range"));
		}

		// ���Ǒ��e�����̍ŏ��l���擾���܂��B
		iAngiographyRoomNumMin = (int)GetInitDataInt( strAngiographyRoomSectionName, "AngiographyRoomMin", -1, strIniFullPath );
		if( 0 > iAngiographyRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of angiography room number is out of range"));
		}
		// ���Ǒ��e�����̍ő�l���擾���܂��B
		iAngiographyRoomNumMax = (int)GetInitDataInt( strAngiographyRoomSectionName, "AngiographyRoomMax", -1, strIniFullPath );
		if( 0 > iAngiographyRoomNumMin || iAngiographyRoomNumMax < iAngiographyRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of angiography room number is out of range"));
		}
		// ���Ǒ��e���̈�ËZ�t�̑����̍ŏ��l���擾���܂��B
		iAngiographyRoomTotalClinicalEngineerNumMin = (int)GetInitDataInt( strAngiographyRoomSectionName, "AngiographyRoomTotalClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iAngiographyRoomTotalClinicalEngineerNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total clinical engineer in the angiography room number is out of range"));
		}
		// ���Ǒ��e���̈�ËZ�t�̑����̍ő�l���擾���܂��B
		iAngiographyRoomTotalClinicalEngineerNumMax = (int)GetInitDataInt( strAngiographyRoomSectionName, "AngiographyRoomTotalClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iAngiographyRoomTotalClinicalEngineerNumMax || iAngiographyRoomTotalClinicalEngineerNumMax < iAngiographyRoomTotalClinicalEngineerNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total clinical engineer in the angiography room number is out of range"));
		}
		// 1���Ǒ��e���̈�ËZ�t�̍ŏ��l���擾���܂��B
		iAngiographyRoomClinicalEngineerNumMin = (int)GetInitDataInt( strAngiographyRoomSectionName, "AngiographyRoomClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iAngiographyRoomClinicalEngineerNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of clinical engineer in the angiography room number is out of range"));
		}
		// 1���Ǒ��e���̈�ËZ�t�̍ő�l���擾���܂��B
		iAngiographyRoomClinicalEngineerNumMax = (int)GetInitDataInt( strAngiographyRoomSectionName, "AngiographyRoomClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iAngiographyRoomClinicalEngineerNumMax || iAngiographyRoomClinicalEngineerNumMax < iAngiographyRoomClinicalEngineerNumMin)
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of clinical engineer in the angiography room is out of range"));
		}

		// �f�@�����̍ŏ��l���擾���܂��B
		iFastRoomNumMin = (int)GetInitDataInt( strFastRoomSectionName, "FastRoomMin", -1, strIniFullPath );
		if( 0 > iFastRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of fast room number is out of range"));
		}
		// �f�@FAST���ő�l���擾���܂��B
		iFastRoomNumMax = (int)GetInitDataInt( strFastRoomSectionName, "FastRoomMax", -1, strIniFullPath );
		if( 0 > iFastRoomNumMin || iFastRoomNumMax < iFastRoomNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of fast room number is out of range"));
		}
		// FAST���̈�ËZ�t�̑����̍ŏ��l���擾���܂��B
		iFastRoomTotalClinicalEngineerNumMin = (int)GetInitDataInt( strFastRoomSectionName, "FastRoomTotalClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iFastRoomTotalClinicalEngineerNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of total clinical engineer in the fast room number is out of range"));
		}
		// FAST���̈�ËZ�t�̑����̍ő�l���擾���܂��B
		iFastRoomTotalClinicalEngineerNumMax = (int)GetInitDataInt( strFastRoomSectionName, "FastRoomTotalClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iFastRoomTotalClinicalEngineerNumMax || iFastRoomTotalClinicalEngineerNumMax < iFastRoomTotalClinicalEngineerNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("max value of total clinical engineer in the fast room number is out of range"));
		}
		// 1FAST���̈�ËZ�t�̍ŏ��l���擾���܂��B
		iFastRoomClinicalEngineerNumMin = (int)GetInitDataInt( strFastRoomSectionName, "FastRoomClinicalEngineerMin", -1, strIniFullPath );
		if( 0 > iFastRoomClinicalEngineerNumMin )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("min value of clinical engineer in the fast room number is out of range"));
		}
		// 1FAST���̈�ËZ�t�̍ő�l���擾���܂��B
		iFastRoomClinicalEngineerNumMax = (int)GetInitDataInt( strFastRoomSectionName, "FastRoomClinicalEngineerMax", -1, strIniFullPath );
		if( 0 > iFastRoomClinicalEngineerNumMax || iFastRoomClinicalEngineerNumMax < iFastRoomClinicalEngineerNumMin)
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
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
