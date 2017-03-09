package initparam;

import initsettingfile.InitSettingFileRead;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class InitSimParam extends InitSettingFileRead
{
	private int iEndSimulationTime;								// �V�~�����[�V�����I������
	private int iExecMode;										// TRISim�̎��s���[�h�iCUI��GUI���j
	private int iSimulationTimeStep;							// TRISim�̃V�~�����[�V�������s�Ԋu
	private double lfPatientPepole;								// ���҂̓��B�l��
	private int iPatientRandomMode;								// ���҂̏��a��Ԃ𐶐����闐����̕ύX�i0:��l�����A1:���K�����j
	private int iFileWriteMode;									//

	// �n�`�̍쐬(�c����1���b�V���̃T�C�Y���w��B)
	private int iMeshWidth;
	private int iMeshHeight;
	// �c���̃��b�V�������w��
	private int iMeshWidthNum;
	private int iMeshHeightNum;

	// ���O�o�͐ݒ�
	private boolean bLogFileAppend;			// �t�@�C���ǋL�̉�
	private long lLogFileCount;				// ���O�t�@�C���o�͐�
	private long lLogFileSize;				// ���O�o�̓t�@�C���T�C�Y
	private int iLogLevel;					// ���O�o�̓��x��
	private String strLogDirectoryName;		// ���O�o�̓f�B���N�g��
	private String strLogPrefix;			// ���O�o�̓t�@�C���̐ړ���

	// �~�}����̃p�����[�^�ݒ���s���܂��B
	private String strEmergencyDepartmentPath 		 	= "./parameter/ER.csv";
	private String strConsultationRoomPath			 	= "./parameter/�f�@��.csv";
	private String strOperationRoomPath				 	= "./parameter/��p��.csv";
	private String strEmergencyRoomPath				 	= "./parameter/���Î�.csv";
	private String strObservationRoomPath			 	= "./parameter/�ώ@��.csv";
	private String strSevereInjuryObservationRoomPath	= "./parameter/�d�Ǌώ@��.csv";
	private String strIntensiveCareUnitPath				= "./parameter/ICU.csv";
	private String strHighCareUnitPath 					= "./parameter/HCU.csv";
	private String strGeneralWardPath					= "./parameter/��ʕa��.csv";
	private String strWaitingRoomPath					= "./parameter/�ҍ���.csv";
	private String strXRayRoomPath						= "./parameter/X����.csv";
	private String strCTRoomPath						= "./parameter/CT��.csv";
	private String strMRIRoomPath						= "./parameter/MRI��.csv";
	private String strAngiographyRoomPath				= "./parameter/���Ǒ��e��.csv";
	private String strFastRoomPath						= "./parameter/FAST��.csv";
	private int iPatientPepole = 365;

	// �~�}����̍��킹���݃p�����[�^�̓ǂݍ��݂��s���܂��B

	// �~�}����̎{�ݔz�u��`�悵�܂��B
	private String strEmergencyDepartmentAxisPath = "./parameter/ER�z�u.csv";
	private String strConsultationRoomAxisPath = "./parameter/�f�@���z�u.csv";
	private String strOperationRoomAxisPath = "./parameter/��p���z�u.csv";
	private String strEmergencyRoomAxisPath = "./parameter/���Î��z�u.csv";
	private String strObservationRoomAxisPath = "./parameter/�ώ@���z�u.csv";
	private String strSevereInjuryObservationRoomAxisPath = "./parameter/�d�Ǌώ@���z�u.csv";
	private String strIntensiveCareUnitAxisPath = "./parameter/ICU�z�u.csv";
	private String strHighCareUnitAxisPath = "./parameter/HCU�z�u.csv";
	private String strGeneralWardAxisPath = "./parameter/��ʕa���z�u.csv";
	private String strWaitingRoomAxisPath = "./parameter/�ҍ����z�u.csv";
	private String strXRayRoomAxisPath = "./parameter/X�����z�u.csv";
	private String strCTRoomAxisPath = "./parameter/CT���z�u.csv";
	private String strMRIRoomAxisPath = "./parameter/MRI���z�u.csv";
	private String strAngiographyRoomAxisPath = "./parameter/���Ǒ��e���z�u.csv";
	private String strFastRoomAxisPath = "./parameter/FAST���z�u.csv";
	private String strStairsAxisPath = "./parameter/�K�i�z�u.csv";
	private String strElevatorAxisPath = "./parameter/�G���x�[�^�[�z�u.csv";
	private String strOtherRoomAxisPath = "./parameter/���̑������z�u.csv";

	// �m�[�h�y�у����N�̐ݒ�����܂��B
	private String strNodeLinkFileName = "./parameter/TriageNodeLinkTable.txt";

	/**
	 * <PRE>
	 *	*.ini�t�@�C���ɐݒ肷��p�����[�^�[�̃f�t�H���g�l��ݒ肵�܂��B
	 * </PRE>
	 *
	 *	@return �Ȃ�
	 *	@author kobayashi
	 *	@since	0.1 2017/3/2
	 *	@version 0.1
	 */
	public void CEnvironmentValue()
	{
	// �f�t�H���g�l
		bLogFileAppend = true;				// �t�@�C���ǋL�̉�
		lLogFileCount = 50;					// ���O�t�@�C���o�͐�
		lLogFileSize = 100000;				// ���O�o�̓t�@�C���T�C�Y
		iLogLevel = 3;						// ���O�o�̓��x��
		strLogDirectoryName = "./";			// ���O�o�̓f�B���N�g��
		strLogPrefix = "TRISimLogging";		// ���O�o�̓t�@�C���̐ړ���

		iEndSimulationTime = 178000;		// �V�~�����[�V�����I������(�b�Ŏw��:86400��1��)
		iExecMode = 1;						// TRISim�̎��s���[�h�iCUI���[�h�AGUI���[�h�A�t�V�~�����[�V�������[�h���j
		iSimulationTimeStep = 10000;		// TRISim�̃V�~�����[�V�������s�Ԋu(�~���b�Ŏw��)
		lfPatientPepole = 365.0;			// ���҂̓��B�l��
		iPatientRandomMode = 0;				// ��l����
		iFileWriteMode = 0;					// �e���҂̍s���f�[�^�t�@�C���̏o�͕��@(0:�o�͂����A1:1�X�e�b�v���Ƃɏo�́A2:�ŏ��y�эŌ�̐��X�e�b�v���o��)

		// �n�`�̍쐬(�c����1���b�V���̃T�C�Y���w��B)
		iMeshWidth = 10;
		iMeshHeight = 10;

		// �c���̃��b�V�������w��
		iMeshWidthNum = 280;
		iMeshHeightNum = 250;
	}

	/**
	 * <PRE>
	 *	*.ini�t�@�C���ɐݒ肳�ꂽ�l��ǂݍ��݂܂��B
	 * </PRE>
	 * @throws IllegalArgumentException   �ݒ�p�����[�^�Ƀt�H�[�}�b�g��肪����ꍇ�ɗ�O
	 * @throws NoSuchFileException        �t�@�C���p�X�w��̂��̂Ɋւ��ė�O
	 * @throws IOException                �t�@�C���ǂݍ��ݎ��ɃG���[�����������ꍇ�ɗ�O
	 * @author kobayashi
	 * @since	2017/3/2
	 * @version 0.1
	 */
	public void readInitSettingFile() throws IllegalArgumentException, IOException
	{
		String func_name				= "GetEnvParameter";
		int i = 0;
		String strIniFullPath;
		String strIniFileName			= "erEV.ini";
		String strLogSectionName		= "LogData";
		String strInitParamSectionName	= "InitParameter";
		String strGeometrySectionName	= "Geometry";
		String strErSectionName			= "EmergencyDepartment";
		String strErDrawSectionName		= "EmergencyDepartmentDraw";
		String strParam;
		long lRet = 0L;
		double lfRet = 0.0;
		File file;
		File fPathCheck;

		file = new File( strIniFileName );

	// ���O�o�͐ݒ�

		strIniFullPath = file.getAbsolutePath( );
		//���O�̐ړ����̐ݒ�
		strParam = GetInitDataString( strLogSectionName, "LogPrefix", "TRISimLogging", strIniFullPath );
		if( strParam.indexOf("\\") != -1 || strParam.indexOf(":") != -1 ||
			strParam.indexOf("?") != -1  || strParam.indexOf("/") != -1 ||
			strParam.indexOf("*") != -1  || strParam.indexOf("<") != -1 ||
			strParam.indexOf(">") != -1  ||	strParam.indexOf("|") != -1 )
		{
			/* �p�X���֎~�������܂܂�Ă����Ƃ��̓G���[��Ԃ��ďI�� */
			throw(new IllegalArgumentException("contain the forbidden string"));
		}
		strLogPrefix = strParam;

		//���O�̕ۑ���ݒ�
		strParam = GetInitDataString( strLogSectionName, "LogDirectoryName", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
		if( fPathCheck.isDirectory() == false )
		{
			/* �f�B���N�g�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
			throw(new NoSuchFileException("the directory to output log file is none"));
		}
		fPathCheck.delete();
		strLogDirectoryName = strParam;

		//���O�̏o�̓��x���ݒ�
		iLogLevel = (int)GetInitDataInt( strLogSectionName, "LogLevel", -1, strIniFullPath );
		if( 0 > iLogLevel || iLogLevel > 6 )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("log level out of range"));
		}

		//���O�t�@�C���̃T�C�Y�ݒ�
		lLogFileSize = GetInitDataInt( strLogSectionName, "LogFileSize", -1, strIniFullPath );
		if (lLogFileSize < 0 )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("log file size is less than 0"));
		}

		//���O�t�@�C�����̐ݒ�
		lLogFileCount = GetInitDataInt( strLogSectionName, "LogFileCount", -1, strIniFullPath );
		if (lLogFileCount < 0 )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("log file count is less than 0"));
		}

		// ���O�t�@�C���ǋL�ۂ̐ݒ�
		bLogFileAppend = GetInitDataBoolean( strLogSectionName, "LogFileAppend", false, strIniFullPath );

	//�`��p�t�@�C���̎w��

		//�~�}����̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "EmergencyDepartmentPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.exists() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("emergency department setting file is none"));
//		}
		fPathCheck.delete();
		strEmergencyDepartmentPath = strParam;

		//�f�@���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "ConsultationRoomPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("consultation room setting file is none"));
//		}
		fPathCheck.delete();
		strConsultationRoomPath = strParam;

		//��p���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "OperationRoomPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("operation room setting file is none"));
//		}
		fPathCheck.delete();
		strOperationRoomPath = strParam;

		//���Î��̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "EmergencyRoomPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("emergency room setting file is none"));
//		}
		fPathCheck.delete();
		strEmergencyRoomPath = strParam;

		//�ώ@���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "ObservationRoomPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("observation room setting file is none"));
//		}
		fPathCheck.delete();
		strObservationRoomPath = strParam;

		//�d�Ǌώ@���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "SevereInjuryObservationRoomPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("injury severe observation room setting file is none"));
//		}
		fPathCheck.delete();
		strSevereInjuryObservationRoomPath = strParam;

		//�W�����Î��̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "IntensiveCareUnitPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("intensive care unit setting file is none"));
//		}
		fPathCheck.delete();
		strIntensiveCareUnitPath = strParam;

		//���x���Î��̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "HighCareUnitPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("high casre unit setting file is none"));
//		}
		fPathCheck.delete();
		strHighCareUnitPath = strParam;

		//��ʕa���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "GeneralWardPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("general ward setting file is none"));
//		}
		fPathCheck.delete();
		strGeneralWardPath = strParam;

		//�ҍ����̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "WaitingRoomPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("waiting room setting file is none"));
//		}
		fPathCheck.delete();
		strWaitingRoomPath = strParam;

		//X�����̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "XRayRoomPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("x-ray room setting file is none"));
//		}
		fPathCheck.delete();
		strXRayRoomPath = strParam;

		//CT���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "CTRoomPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("ct room setting file is none"));
//		}
		fPathCheck.delete();
		strCTRoomPath = strParam;

		//MRI���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "MRIRoomPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("mri room setting file is none"));
//		}
		fPathCheck.delete();
		strMRIRoomPath = strParam;

		//���Ǒ��e���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "AngiographyRoomPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("angiography room setting file is none"));
//		}
		fPathCheck.delete();
		strAngiographyRoomPath = strParam;

		//FAST���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "FastRoomPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("fast room setting file is none"));
//		}
		fPathCheck.delete();
		strFastRoomPath = strParam;


		//�~�}����`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "EmergencyDepartmentAxisPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("emergency department draw setting file is none"));
//		}
		fPathCheck.delete();
		strEmergencyDepartmentAxisPath = strParam;

		//�f�@���`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "ConsultationRoomAxisPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("consultation room draw setting file is none"));
//		}
		fPathCheck.delete();
		strConsultationRoomAxisPath = strParam;

		//��p���`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "OperationRoomAxisPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("operation room draw setting file is none"));
//		}
		fPathCheck.delete();
		strOperationRoomAxisPath = strParam;

		//���Î��`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "EmergencyRoomAxisPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("emergency room draw setting file is none"));
//		}
		fPathCheck.delete();
		strEmergencyRoomAxisPath = strParam;

		//�ώ@���`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "ObservationRoomAxisPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("observation room draw setting file is none"));
//		}
		fPathCheck.delete();
		strObservationRoomAxisPath = strParam;

		//�d�Ǌώ@���`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "SevereInjuryObservationRoomAxisPath", ".\\", strIniFullPath );
		strSevereInjuryObservationRoomAxisPath = strParam;

		//�W�����Î��`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "IntensiveCareUnitPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("intensive care unit draw setting file is none"));
//		}
		fPathCheck.delete();
		strIntensiveCareUnitAxisPath = strParam;

		//���x���Î��`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "HighCareUnitPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("high care unit draw setting file is none"));
//		}
		fPathCheck.delete();
		strHighCareUnitAxisPath = strParam;

		//��ʕa���`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "GeneralWardPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("general ward draw setting file is none"));
//		}
		fPathCheck.delete();
		strGeneralWardAxisPath = strParam;

		//�ҍ����`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "WaitingRoomAxisPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("waiting room draw setting file is none"));
//		}
		fPathCheck.delete();
		strWaitingRoomAxisPath = strParam;

		//X�����`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "XRayRoomAxisPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("x-ray room draw setting file is none"));
//		}
		fPathCheck.delete();
		strXRayRoomAxisPath = strParam;

		//CT���`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "CTRoomAxisPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("ct room draw setting file is none"));
//		}
		fPathCheck.delete();
		strCTRoomAxisPath = strParam;

		//MRI���`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "MRIRoomAxisPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("mri room draw setting file is none"));
//		}
		fPathCheck.delete();
		strMRIRoomAxisPath = strParam;

		//���Ǒ��e���`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "AngiographyRoomAxisPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("angiography room draw setting file is none"));
//		}
		fPathCheck.delete();
		strAngiographyRoomAxisPath = strParam;

		//FAST���`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "FastRoomAxisPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("fast room draw setting file is none"));
//		}
		fPathCheck.delete();
		strFastRoomAxisPath = strParam;

		//�G���x�[�^�[�`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "ElavatorAxisPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("elevator room draw setting file is none"));
//		}
		fPathCheck.delete();
		strElevatorAxisPath = strParam;

		//�K�i�`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "StairsAxisPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("stairs draw setting file is none"));
//		}
		fPathCheck.delete();
		strStairsAxisPath = strParam;

		//���̑������`�敔���̕ۑ���ݒ�
		strParam = GetInitDataString( strErSectionName, "OtherRoomAxisPath", ".\\", strIniFullPath );
		fPathCheck = new File( strParam );
//		if( fPathCheck.isFile() == false )
//		{
//			/* �t�@�C�������݂��Ȃ��ꍇ�͗�O��ԋp���܂��B */
//			throw(new NoSuchFileException("other room draw setting file is none"));
//		}
		fPathCheck.delete();
		strOtherRoomAxisPath = strParam;

	// �`��͈͋y�у��b�V���ݒ�

		//�`��͈͂̉��̃��b�V����
		iMeshWidthNum = (int)GetInitDataInt( strGeometrySectionName, "MeshWidthNum", iMeshWidthNum, strIniFullPath );
		// ���b�V������0�ȉ��ɂ��Ă����ꍇ�̓��b�V������280�Ƃ��܂��B
		if( iMeshWidthNum <= 0 )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("mesh width count is less than 0"));
		}

		//�`��͈͂̏c�̃��b�V����
		iMeshHeightNum = (int)GetInitDataInt( strGeometrySectionName, "MeshHeightNum", iMeshHeightNum, strIniFullPath );
		// ���b�V������0�ȉ��ɂ��Ă����ꍇ�̓��b�V������250�Ƃ��܂��B
		if( iMeshHeightNum <= 0 )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("mesh height count is less than 0"));
		}

		//�`��͈͂̉��̃��b�V���T�C�Y
		iMeshWidth = (int)GetInitDataInt( strGeometrySectionName, "MeshWidth", iMeshWidth, strIniFullPath );
		// ���b�V���T�C�Y��0�ȉ��ɂ��Ă����ꍇ�̓��b�V���T�C�Y��10�Ƃ��܂��B
		if( iMeshWidth <= 0 )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("mesh width size is less than 0"));
		}

		//�`��͈͂̏c�̃��b�V���T�C�Y
		iMeshHeight = (int)GetInitDataInt( strGeometrySectionName, "MeshHeight", iMeshHeight, strIniFullPath );
		// ���b�V���T�C�Y��0�ȉ��ɂ��Ă����ꍇ�̓��b�V���T�C�Y��10�Ƃ��܂��B
		if( iMeshHeight <= 0 )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("mesh height size is less than 0"));
		}

		iEndSimulationTime = (int)GetInitDataInt( strInitParamSectionName, "EndSimulationTime", iEndSimulationTime, strIniFullPath );
		// 0�ȉ����w�肵���ꍇ��1���ɐݒ肵�܂��B
		if( iEndSimulationTime <= 0 )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("simulation end time is less than 0"));
		}

		iExecMode = (int)GetInitDataInt( strInitParamSectionName, "ExecMode", iExecMode, strIniFullPath );
		// �͈͊O���w�肵���ꍇ�̓R���\�[�����[�h�ŋN�����܂��B
		if( iExecMode < 0 || iExecMode > 2 )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("simulation executive mode is none number"));
		}

		iSimulationTimeStep = (int)GetInitDataInt( strInitParamSectionName, "SimulationTimeStep", iSimulationTimeStep, strIniFullPath );
		// �V�~�����[�V�����̃^�C���X�e�b�v��0�ȉ��ɐݒ肵���ꍇ��1000(1�b)�Ƃ��܂��B
		if( iSimulationTimeStep < 0 )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("simulation time step is less than 0"));
		}

		lfPatientPepole = GetInitDataFloat( strInitParamSectionName, "PatientPepole", -1.0, strIniFullPath);
		if( lfPatientPepole < 0 )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException(" patient pepole is less than 0"));
		}

		iPatientRandomMode = (int)GetInitDataInt( strInitParamSectionName, "PatientRandomMode", 0, strIniFullPath );
		if( iPatientRandomMode < 0 )
		{
			/* �͈͊O���w�肵���ꍇ�̓G���[���o�͂��܂��B*/
			throw(new IllegalArgumentException("density of random patient is less than 0"));
		}
	}

	/**
	 * <PRE>
	 *    �~�}����̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return �~�}����̃t�@�C����
	 */
	public String strGetEmergencyDepartmentPath()
	{
		return strEmergencyDepartmentPath;
	}

	/**
	 * <PRE>
	 *    �f�@���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return �f�@���̃t�@�C����
	 */
	public String strGetConsultationRoomPath()
	{
		return strConsultationRoomPath;
	}

	/**
	 * <PRE>
	 *    ��p���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return ��p���̃t�@�C����
	 */
	public String strGetOperationRoomPath()
	{
		return strOperationRoomPath;
	}

	/**
	 * <PRE>
	 *    ���Î��̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return ���Î��̃t�@�C����
	 */
	public String strGetEmergencyRoomPath()
	{
		return strEmergencyRoomPath;
	}

	/**
	 * <PRE>
	 *    �ώ@���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return �ώ@���̃t�@�C����
	 */
	public String strGetObservationRoomPath()
	{
		return strObservationRoomPath;
	}

	/**
	 * <PRE>
	 *    �d���ώ@���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return �d�Ǌώ@���̃t�@�C����
	 */
	public String strGetSevereInjuryObservationRoomPath()
	{
		return strSevereInjuryObservationRoomPath;
	}

	/**
	 * <PRE>
	 *    �W�����Î��̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return �W�����Î��̃t�@�C����
	 */
	public String strGetIntensiveCareUnitPath()
	{
		return strIntensiveCareUnitPath;
	}

	/**
	 * <PRE>
	 *    ���x���Î��̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return ���x���Î��̃t�@�C����
	 */
	public String strGetHighCareUnitPath()
	{
		return strHighCareUnitPath;
	}

	/**
	 * <PRE>
	 *    ��ʕa���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return ��ʕa���̃t�@�C����
	 */
	public String strGetGeneralWardPath()
	{
		return strGeneralWardPath;
	}

	/**
	 * <PRE>
	 *    �ҍ����̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return �ҍ����̃t�@�C����
	 */
	public String strGetWaitingRoomPath()
	{
		return strWaitingRoomPath;
	}

	/**
	 * <PRE>
	 *    X�����̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return X�����̃t�@�C����
	 */
	public String strGetXRayRoomPath()
	{
		return strXRayRoomPath;
	}

	/**
	 * <PRE>
	 *    CT���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return CT���̃t�@�C����
	 */
	public String strGetCTRoomPath()
	{
		return strCTRoomPath;
	}

	/**
	 * <PRE>
	 *    �l�q�h���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return MRI���̃t�@�C����
	 */
	public String strGetMRIRoomPath()
	{
		return strMRIRoomPath;
	}

	/**
	 * <PRE>
	 *    ���Ǒ��e���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return ���Ǒ��e���̃t�@�C����
	 */
	public String strGetAngiographyRoomPath()
	{
		return strAngiographyRoomPath;
	}

	/**
	 * <PRE>
	 *    FAST���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return FAST���̃t�@�C����
	 */
	public String strGetFastRoomPath()
	{
		return strFastRoomPath;
	}

	/**
	 * <PRE>
	 *    �m�[�h�����N���L�q���ꂽ�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return �m�[�h�����N�L�q�t�@�C����
	 */
	public String strGetNodeLinkPath()
	{
		return strNodeLinkFileName;
	}


	/**
	 * <PRE>
	 *    �`��p�~�}����̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return �~�}����̕`��p�t�@�C����
	 */
	public String strGetEmergencyDepartmentAxisPath()
	{
		return strEmergencyDepartmentAxisPath;
	}

	/**
	 * <PRE>
	 *    �`��p�f�@���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return �f�@���̕`��p�t�@�C����
	 */
	public String strGetConsultationRoomAxisPath()
	{
		return strConsultationRoomAxisPath;
	}

	/**
	 * <PRE>
	 *    �`��p��p���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return ��p���̕`��p�t�@�C����
	 */
	public String strGetOperationRoomAxisPath()
	{
		return strOperationRoomAxisPath;
	}

	/**
	 * <PRE>
	 *    �`��p���Î��̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return ���Î��̕`��p�t�@�C����
	 */
	public String strGetEmergencyRoomAxisPath()
	{
		return strEmergencyRoomAxisPath;
	}

	/**
	 * <PRE>
	 *    �`��p�ώ@���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return �ώ@���̕`��p�t�@�C����
	 */
	public String strGetObservationRoomAxisPath()
	{
		return strObservationRoomAxisPath;
	}

	/**
	 * <PRE>
	 *    �`��p�d���ώ@���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return �d�Ǌώ@���̕`��p�t�@�C����
	 */
	public String strGetSevereInjuryObservationRoomAxisPath()
	{
		return strSevereInjuryObservationRoomAxisPath;
	}

	/**
	 * <PRE>
	 *    �`��p�W�����Î��̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return �W�����Î��̕`��p�t�@�C����
	 */
	public String strGetIntensiveCareUnitAxisPath()
	{
		return strIntensiveCareUnitAxisPath;
	}

	/**
	 * <PRE>
	 *    �`��p���x���Î��̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return ���x���Î��̕`��p�t�@�C����
	 */
	public String strGetHighCareUnitAxisPath()
	{
		return strHighCareUnitAxisPath;
	}

	/**
	 * <PRE>
	 *    �`��p��ʕa���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return ��ʕa���̕`��p�t�@�C����
	 */
	public String strGetGeneralWardAxisPath()
	{
		return strGeneralWardAxisPath;
	}

	/**
	 * <PRE>
	 *    �`��p�ҍ����̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return �ҍ����̕`��p�t�@�C����
	 */
	public String strGetWaitingRoomAxisPath()
	{
		return strWaitingRoomAxisPath;
	}

	/**
	 * <PRE>
	 *    �`��pX�����̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return X�����̕`��p�t�@�C����
	 */
	public String strGetXRayRoomAxisPath()
	{
		return strXRayRoomAxisPath;
	}

	/**
	 * <PRE>
	 *    �`��pCT���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return CT���̕`��p�t�@�C����
	 */
	public String strGetCTRoomAxisPath()
	{
		return strCTRoomAxisPath;
	}

	/**
	 * <PRE>
	 *    �`��p�l�q�h���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return MRI���̕`��p�t�@�C����
	 */
	public String strGetMRIRoomAxisPath()
	{
		return strMRIRoomAxisPath;
	}

	/**
	 * <PRE>
	 *    �`��p���Ǒ��e���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return ���Ǒ��e���̕`��p�t�@�C����
	 */
	public String strGetAngiographyRoomAxisPath()
	{
		return strAngiographyRoomAxisPath;
	}

	/**
	 * <PRE>
	 *    �`��pFAST���̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return FAST���̃t�@�C����
	 */
	public String strGetFastRoomAxisPath()
	{
		return strFastRoomAxisPath;
	}

	/**
	 * <PRE>
	 *    �`��p�G���x�[�^�̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return �G���x�[�^�̕`��p�t�@�C����
	 */
	public String strGetElevatorAxisPath()
	{
		return strElevatorAxisPath;
	}

	/**
	 * <PRE>
	 *    �`��p�G���x�[�^�̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return �G���x�[�^�̕`��p�t�@�C����
	 */
	public String strGetStairsAxisPath()
	{
		return strStairsAxisPath;
	}

	/**
	 * <PRE>
	 *    �`��p�G���x�[�^�̃p�����[�^��`�t�@�C�����擾���܂��B
	 * </PRE>
	 * @return �G���x�[�^�̕`��p�t�@�C����
	 */
	public String strGetOtherRoomAxisPath()
	{
		return strOtherRoomAxisPath;
	}

	/**
	 * <PRE>
	 *    �V�~�����[�V�����I�����Ԃ��擾���܂��B
	 * </PRE>
	 * @return �V�~�����[�V�����I������
	 */
	public int iGetEndSimulationTime()
	{
		return iEndSimulationTime;
	}

	/**
	 * <PRE>
	 *    �V�~�����[�V�������s���[�h���擾���܂��B
	 *    0 �R���\�[�����[�h
	 *    1 GUI���[�h
	 *    2 �t�V�~�����[�V�������[�h
	 * </PRE>
	 * @return �V�~�����[�V�������s���[�h
	 */
	public int iGetExecMode()
	{
		return iExecMode;
	}

	/**
	 * <PRE>
	 *    �V�~�����[�V�����̎��s�Ԋu���擾���܂��B
	 *    �b�Ŏw�肵�܂��B
	 * </PRE>
	 * @return �V�~�����[�V�������s�Ԋu
	 */
	public int iGetSimulationTimeStep()
	{
		return iSimulationTimeStep;
	}

	/**
	 * <PRE>
	 *    ���҂̓��B�l�����擾���܂��B
	 * </PRE>
	 * @return ���B�l��
	 */
	public double lfGetPatientPepole()
	{
		return lfPatientPepole;
	}

	/**
	 * <PRE>
	 *    �����̐������@�̃��[�h���擾���܂��B
	 * </PRE>
	 * @return �����������[�h
	 */
	public int iGetPatientRandomMode()
	{
		return iPatientRandomMode;
	}

	/**
	 * <PRE>
	 *    �����ԃV�~�����[�V�����t�@�C���������݃t���O
	 * </PRE>
	 * @return �t�@�C���������݃��[�h
	 */
	public int iGetFileWriteMode()
	{
		return iFileWriteMode;
	}

	/**
	 * <PRE>
	 *    �`��̈�̉����̃��b�V�������擾���܂��B
	 * </PRE>
	 * @return �����̃��b�V����
	 */
	public int iGetMeshWidthNum()
	{
		return iMeshWidthNum;
	}

	/**
	 * <PRE>
	 *    �`��̈�̏c�̃��b�V�������擾���܂��B
	 * </PRE>
	 * @return �c�̃��b�V����
	 */
	public int iGetMeshHeightNum()
	{
		return iMeshHeightNum;
	}

	/**
	 * <PRE>
	 *    �`��̈�̉���1���b�V���̃T�C�Y���擾���܂��B
	 * </PRE>
	 * @return 1���b�V���̉��̃T�C�Y
	 */
	public int iGetMeshWidth()
	{
		return iMeshWidth;
	}

	/**
	 * <PRE>
	 *    �`��̈�̏c��1���b�V���T�C�Y���擾���܂��B
	 * </PRE>
	 * @return 1���b�V���̏c�̃T�C�Y
	 */
	public int iGetMeshHeight()
	{
		return iMeshHeight;
	}

	/**
	 * <PRE>
	 *    ���O�o�̓t�@�C�����̐ړ������擾���܂��B
	 * </PRE>
	 * @return �t�@�C�����ړ���
	 */
	public String strGetLogPrefix()
	{
		return strLogPrefix;
	}

	/**
	 * <PRE>
	 *    ���O�o�̓t�@�C���p�X�f�B���N�g�������擾���܂��B
	 * </PRE>
	 * @return �f�B���N�g���p�X
	 */
	public String strGetLogDirectoryName()
	{
		return strLogDirectoryName;
	}

	/**
	 * <PRE>
	 *    ���O�o�̓��x�����擾���܂��B
	 * </PRE>
	 * @return ���O�o�̓��x��
	 */
	public int iGetLogLevel()
	{
		return iLogLevel;
	}

	/**
	 * <PRE>
	 *    ���O�o�̓t�@�C���T�C�Y���擾���܂��B
	 * </PRE>
	 * @return �t�@�C���T�C�Y
	 */
	public long lGetLogFileSize()
	{
		return lLogFileSize;
	}

	/**
	 * <PRE>
	 *    ���O�o�̓t�@�C�������擾���܂��B
	 * </PRE>
	 * @return ���O�o�̓t�@�C����
	 */
	public long lGetLogFileCount()
	{
		return lLogFileCount;
	}

	/**
	 * <PRE>
	 *    ���O�o�̓t�@�C���ǋL���[�h�̉ۂ��擾���܂��B
	 * </PRE>
	 * @return ���O�t�@�C���ǋL���[�h
	 */
	public boolean bGetLogFileAppend()
	{
		return bLogFileAppend;
	}

}