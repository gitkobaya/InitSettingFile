import java.io.IOException;

import initparam.InitSimParam;
import initparam.InitInverseSimParam;

public class InitSettingFile
{
	public static void main( String args[] )
	{
		try
		{
			InitSimParam env = new InitSimParam();
			env.readInitSettingFile();

			vInitSimParamPrint( env );
		}
		catch( IOException ioe )
		{
			String str = ioe.getMessage();
			str += "\n";
			for( int i = 0;i < ioe.getStackTrace().length; i++ )
			{
				str += ioe.getStackTrace()[i];
				str += "\n";
			}
			System.out.println( str );
		}
		catch( IllegalArgumentException iae )
		{
			String str = iae.getMessage();
			for( int i = 0;i < iae.getStackTrace().length; i++ )
			{
				str += iae.getStackTrace()[i];
				str += "\n";
			}
			System.out.println( str );
		}
	}

	public static void vInitSimParamPrint( InitSimParam initSim )
	{
		System.out.println( "LogPrefix = " + initSim.strGetLogPrefix() );
		System.out.println( "LogDirectoryName = " + initSim.strGetLogDirectoryName() );
		System.out.println( "LogLevel = " + initSim.iGetLogLevel() );
		System.out.println( "LogFileSize = " + initSim.lGetLogFileSize() );
		System.out.println( "LogFileCount = " + initSim.lGetLogFileCount() );
		System.out.println( "LogFileAppend = " + initSim.bGetLogFileAppend() );
		System.out.println( "MeshWidth = " + initSim.iGetMeshWidth() );
		System.out.println( "MeshHeight = " + initSim.iGetMeshHeight() );
		System.out.println( "MeshWidthNum = " + initSim.iGetMeshWidthNum() );
		System.out.println( "MeshHeightNum = " + initSim.iGetMeshHeightNum() );
	}

	public static void vInitInverseSimParamPrint( InitInverseSimParam initInvSim )
	{

	}
}
