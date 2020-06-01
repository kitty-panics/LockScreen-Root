package now.lock_root;
import android.app.*;
import android.os.*;
import java.io.*;
public class a extends Activity
{
	@Override
	public void onCreate(Bundle sis)
	{
		super.onCreate(sis);
		try
		{
			String cmd="su -c input keyevent 6\n";
			Runtime.getRuntime().exec(cmd);
		}
		catch (IOException e)
		{}
		System.exit(0);
	}
}
