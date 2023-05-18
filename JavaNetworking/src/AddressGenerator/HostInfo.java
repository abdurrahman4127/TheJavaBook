package AddressGenerator;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostInfo {
  	public static void main(String[] args)
	{
  		try {
			// system has it already though
			InetAddress ipAddress = InetAddress.getLocalHost();
      		System.out.println(ipAddress);
    	}
    	catch ( UnknownHostException ex ) {
      		System.out.println(ex);
    	}
  	}
} 