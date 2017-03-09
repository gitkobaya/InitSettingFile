package initsettingfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public abstract class InitSettingFileRead
{
	/**
	 * <PRE>
	 *	*.ini�t�@�C���ɐݒ肳�ꂽ�l��ǂݍ��݂܂��B
	 * </PRE>
	 * @throws IllegalArgumentException   �ݒ�p�����[�^�Ƀt�H�[�}�b�g��肪����ꍇ�ɗ�O
	 * @throws IOException                �t�@�C���ǂݍ��ݎ��ɃG���[�����������ꍇ�ɗ�O
	 * @author kobayashi
	 * @since	2017/3/8
	 * @version 0.1
	 */
	abstract public void readInitSettingFile() throws IllegalArgumentException, IOException;

	/**
	 *  <PRE>
	 *	*.ini�t�@�C���̃p�����[�^�[�l(������)��ǂݍ��݂܂��B
	 * </PRE>
	 *	@param strSectionName		������Z�N�V�����̖��O
	 *	@param strParamName			�p�����[�^�[�̖��O
	 *	@param strDefaultParamValue	�p�����[�^�[�̃f�t�H���g�l
	 *	@param strIniFilePath		�t�@�C���̃p�X��
	 *	@return 					�ǂݍ��񂾃p�����[�^
	 *	@author kobayashi
	 *	@since	0.1
	 *	@version 0.1 2017/03/01
	 */
	protected String GetInitDataString(String strSectionName, String strParamName, String strDefaultParamValue, String strIniFilePath ) throws IOException
	{
		String strRes = "";
		String strReadData;
		String strAbsolutePath;
		String[] strParamData;
		File file;
		BufferedReader brReadFile = null;

		file = new File(strIniFilePath);
		strAbsolutePath = file.getAbsolutePath();

		brReadFile = new BufferedReader( new FileReader( strAbsolutePath ) );

		//�Z�N�V�������̓ǂݍ���
		while( (strReadData = brReadFile.readLine()) != null )
		{
			// �R�����g���Ȃ̂œǂݔ�΂��܂��B
			if( strReadData.indexOf(";") != -1 ) continue;
			// �w�肳�ꂽ�Z�N�V���������������炻���̎��̍s����ǂݎn�߂܂��B
			if( strReadData.indexOf(strSectionName) != -1 ) break;
		}
		// �p�����[�^�̓ǂݍ��݂��J�n���܂��B
		while( (strReadData = brReadFile.readLine()) != null )
		{
			// �R�����g���Ȃ̂œǂݔ�΂��܂��B
			if( strReadData.indexOf(";") != -1 ) continue;
			// �w�肳�ꂽ�p�����[�^������������p�����[�^��ǂݍ��݂܂��B
			if( strReadData.indexOf(strParamName) != -1 )
			{
				// "="," ","""�ŕ������܂��B
				strParamData = strReadData.split("[=\"]");
				for( String str : strParamData )
				{
					if( str.equals("") == false && str.equals(" ") == false && str.indexOf(strParamName) == -1 )
					{
						// �p�����[�^���擾���܂��B
						strRes = str;
						break;
					}
				}
				if( strRes.equals("") == true )
				{
					strRes = strDefaultParamValue;
				}
				break;
			}
		}
		brReadFile.close();
		return strRes;
	}

	/**
	 * <PRE>
	 *   *.ini�t�@�C���̃p�����[�^�[�l(���������_�^)��ǂݍ��݂܂��B
	 * </PRE>
	 * @param strSectionName			������Z�N�V�����̖��O
	 * @param strParamName				�p�����[�^�[�̖��O
	 * @param lfDefaultParamValue		�p�����[�^�[�̃f�t�H���g�l
	 * @param strIniFilePath			�����t�@�C���p�X��
	 * @return 							�ǂݍ��񂾃p�����[�^�l
	 * @author kobayashi
	 * @since   0.1
	 * @version 0.1 2017/03/01
	 */
	protected double GetInitDataFloat(String strSectionName, String strParamName, double lfDefaultParamValue, String strIniFilePath ) throws IOException
	{
		String strReadData;
		String strAbsolutePath;
		String[] strParamData;
		File file;
		BufferedReader brReadFile = null;
		double lfRes = Double.MAX_VALUE;

		file = new File(strIniFilePath);
		strAbsolutePath = file.getAbsolutePath();

		brReadFile = new BufferedReader( new FileReader( strAbsolutePath ) );

		//�Z�N�V�������̓ǂݍ���
		while( (strReadData = brReadFile.readLine()) != null )
		{
			// �R�����g���Ȃ̂œǂݔ�΂��܂��B
			if( strReadData.indexOf(";") != -1 ) continue;
			// �w�肳�ꂽ�Z�N�V���������������炻���̎��̍s����ǂݎn�߂܂��B
			if( strReadData.indexOf(strSectionName) != -1 ) break;
		}
		// �p�����[�^�̓ǂݍ��݂��J�n���܂��B
		while( (strReadData = brReadFile.readLine()) != null )
		{
			// �R�����g���Ȃ̂œǂݔ�΂��܂��B
			if( strReadData.indexOf(";") != -1 ) continue;
			// �w�肳�ꂽ�p�����[�^������������p�����[�^��ǂݍ��݂܂��B
			if( strReadData.indexOf(strParamName) != -1 )
			{
				// "="," ","""�ŕ������܂��B
				strParamData = strReadData.split("[=\\s\"]");
				for( String str : strParamData )
				{
					if( str.equals("") == false && str.equals(" ") == false && str.indexOf(strParamName) == -1 )
					{
						// �p�����[�^���擾���܂��B
						try
						{
							// �������ꍇ�͂��̒l��ݒ肵�܂��B
							lfRes = Double.parseDouble(str);
						}
						catch( NumberFormatException nfe )
						{
							// ���l�ȊO�̂��̂��w�肳��Ă����ꍇ�̓f�t�H���g�l���w�肵�܂��B
							lfRes = lfDefaultParamValue;
						}
						break;
					}
				}
				// �w�肳��Ă��Ȃ������ꍇ�̓f�t�H���g�l��ݒ肵�܂��B
				if( lfRes == Double.MAX_VALUE )
				{
					lfRes = lfDefaultParamValue;
				}
				break;
			}
		}
		brReadFile.close();
		return lfRes;
	}

	/**
	 * <PRE>
	 *   *.ini�t�@�C���̃p�����[�^�[�l(�����^)��ǂݍ��݂܂��B
	 * </PRE>
	 * @param strSectionName			������Z�N�V�����̖��O
	 * @param strParamName				�p�����[�^�[�̖��O
	 * @param strDefaultParamValue		�p�����[�^�[�̃f�t�H���g�l
	 * @param strIniFilePath			�t�@�C���p�X��
	 * @return 							�ǂݍ��񂾃p�����[�^�l
	 * @author kobayashi
	 * @since   0.1
	 * @version 0.1 2017/03/01
	 */
	protected long GetInitDataInt(String strSectionName, String strParamName, long lDefaultParamValue, String strIniFilePath ) throws IOException
	{
		String strReadData;
		String strAbsolutePath;
		String[] strParamData;
		File file;
		BufferedReader brReadFile = null;
		long lRes = Long.MAX_VALUE;

		file = new File(strIniFilePath);
		strAbsolutePath = file.getAbsolutePath();

		brReadFile = new BufferedReader( new FileReader( strAbsolutePath ) );

		//�Z�N�V�������̓ǂݍ���
		while( (strReadData = brReadFile.readLine()) != null )
		{
			// �R�����g���Ȃ̂œǂݔ�΂��܂��B
			if( strReadData.indexOf(";") != -1 ) continue;
			// �w�肳�ꂽ�Z�N�V���������������炻���̎��̍s����ǂݎn�߂܂��B
			if( strReadData.indexOf(strSectionName) != -1 ) break;
		}
		// �p�����[�^�̓ǂݍ��݂��J�n���܂��B
		while( (strReadData = brReadFile.readLine()) != null )
		{
			// �R�����g���Ȃ̂œǂݔ�΂��܂��B
			if( strReadData.indexOf(";") != -1 ) continue;
			// �w�肳�ꂽ�p�����[�^������������p�����[�^��ǂݍ��݂܂��B
			if( strReadData.indexOf(strParamName) != -1 )
			{
				// "="," ","""�ŕ������܂��B
				strParamData = strReadData.split("[=\\s\"]");
				for( String str : strParamData )
				{
					if( str.equals("") == false && str.equals(" ") == false && str.indexOf(strParamName) == -1 )
					{
						// �p�����[�^���擾���܂��B
						try
						{
							// �������ꍇ�͂��̒l��ݒ肵�܂��B
							lRes = Long.parseLong(str);
						}
						catch( NumberFormatException nfe )
						{
							// ���l�ȊO�̂��̂��w�肳��Ă����ꍇ�̓f�t�H���g�l���w�肵�܂��B
							lRes = lDefaultParamValue;
						}
						break;
					}
				}
				// �w�肳��Ă��Ȃ������ꍇ�̓f�t�H���g�l��ݒ肵�܂��B
				if( lRes == Long.MAX_VALUE )
				{
					lRes = lDefaultParamValue;
				}
				break;
			}
		}
		brReadFile.close();
		return lRes;
	}

	/**
	 * <PRE>
	 *   *.ini�t�@�C���̃p�����[�^�[�l(�����^)��ǂݍ��݂܂��B
	 * </PRE>
	 * @param strSectionName			������Z�N�V�����̖��O
	 * @param strParamName				�p�����[�^�[�̖��O
	 * @param bDefaultParamValue		�p�����[�^�[�̃f�t�H���g�l
	 * @param strIniFilePath			�t�@�C���p�X��
	 * @return 							�ǂݍ��񂾃p�����[�^�l
	 * @author kobayashi
	 * @since   0.1
	 * @version 0.1 2017/03/01
	 */
	protected boolean GetInitDataBoolean(String strSectionName, String strParamName, boolean bDefaultParamValue, String strIniFilePath ) throws IOException
	{
		int iCount;
		String strReadData;
		String strAbsolutePath;
		String[] strParamData;
		File file;
		BufferedReader brReadFile = null;
		boolean bRes = false;

		file = new File(strIniFilePath);
		strAbsolutePath = file.getAbsolutePath();

		brReadFile = new BufferedReader( new FileReader( strAbsolutePath ) );

		//�Z�N�V�������̓ǂݍ���
		while( (strReadData = brReadFile.readLine()) != null )
		{
			// �R�����g���Ȃ̂œǂݔ�΂��܂��B
			if( strReadData.indexOf(";") != -1 ) continue;
			// �w�肳�ꂽ�Z�N�V���������������炻���̎��̍s����ǂݎn�߂܂��B
			if( strReadData.indexOf(strSectionName) != -1 ) break;
		}
		iCount = 0;
		// �p�����[�^�̓ǂݍ��݂��J�n���܂��B
		while( (strReadData = brReadFile.readLine()) != null )
		{
			// �R�����g���Ȃ̂œǂݔ�΂��܂��B
			if( strReadData.indexOf(";") != -1 ) continue;
			// �w�肳�ꂽ�p�����[�^������������p�����[�^��ǂݍ��݂܂��B
			if( strReadData.indexOf(strParamName) != -1 )
			{
				// "="," ","""�ŕ������܂��B
				strParamData = strReadData.split("[=\\s\"]");
				for( String str : strParamData )
				{
					if( str.equals("") == false && str.equals(" ") == false && str.indexOf(strParamName) == -1 )
					{
						// �p�����[�^���擾���܂��B
						try
						{
							// �������ꍇ�͂��̒l��ݒ肵�܂��B
							bRes = Boolean.parseBoolean(strParamData[1]);
						}
						catch( NumberFormatException nfe )
						{
							bRes = bDefaultParamValue;
						}
						break;
					}
					iCount++;
				}
				// �w�肳��Ă��Ȃ������ꍇ�̓f�t�H���g�l��ݒ肵�܂��B
				if( iCount == strParamData.length )
				{
					bRes = bDefaultParamValue;
				}
				break;
			}
		}
		brReadFile.close();
		return bRes;
	}
}
