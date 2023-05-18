import java.net.InetAddress;
import java.net.UnknownHostException;

public class randomTest {
    public static void main(String[] args)
    {
        // generating address manually
        byte []address = new byte[4];
        address[0] = (byte)125;
        address[1] = (byte)125;
        address[2] = (byte)0;
        address[3] = (byte)70;

        try{
            InetAddress ipAddress = InetAddress.getByAddress(address);
            System.out.println("Ip Address : " + ipAddress);

            // system has it already though
            InetAddress hostInfo  = InetAddress.getLocalHost();
            System.out.println("Ip  : " + hostInfo);

        } catch (UnknownHostException e){
            e.getMessage();
        }
    }
}
