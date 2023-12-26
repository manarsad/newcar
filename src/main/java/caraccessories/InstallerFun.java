package caraccessories;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.*;
public class InstallerFun {
	static Logger logger = Logger.getLogger(firstclass.class.getName());
	private static List<Installer> installerList = new ArrayList<Installer>();	
	private static boolean flag1;
	public static boolean getflag1() {
		return flag1;
	}
	
	static {
		Installer installer1 = new Installer("ali","ali@gmail.com", "Sunday","14-April",12);
		Installer installer2 = new Installer("ali","ali@gmail.com", "Monday","14-April",2);
		Installer installer3 = new Installer("ali","ali@gmail.com", "Monday","14-April",4);
		installerList.add(installer1);
		installerList.add(installer2);
		installerList.add(installer3);
	}
	
	public List<Installer> scheduleappointments(String installername ,String installeremail ,String day , String month , int hour ) {
		  for (Installer installer : installerList) {
	            if (installer.getInstalleremail().equals(installeremail)&&installer.getInstallername().equals(installername)&& installer.getDay().equals(day)&&installer.getMonth().equals(month)&&installer.getHour()==hour) {
	                System.out.println("This appointment is already exists.");
	                flag1=false;
	                return null; 
	            }
	        }
		installerList.add(new Installer(installername ,installeremail ,day , month , hour));
		flag1=true;
        return installerList;
    }
	
	
	public void printInstallerList() {
	    System.out.println("Installer List:");
	    int i = 1;
	    for (Installer installer : installerList) {
	        System.out.println("Installer { " + i + ": " + installer);
	        i++;
	    }
	}
	
	public static Installer getinstalleremail1(String email) {
		
		for (Installer installer : installerList) {
		
			if ( email.equals(installer.getInstalleremail())) {
			
			return installer;

		}
	
		}
		return null;
	}
	
    public String getinstallername1(int installerNumber) {
        if (installerNumber > 0 && installerNumber <= installerList.size()) {
            return installerList.get(installerNumber - 1).getInstallername();
        } else {
            return "Invalid installer number";
        }
    }
    
    public String getinstallerday1(int installerNumber) {
            return installerList.get(installerNumber - 1).getDay();

    }
    public String getinstallermonth1(int installerNumber) {
      return installerList.get(installerNumber - 1).getMonth();

    }
    public int getinstallerhour1(int installerNumber) {
        return installerList.get(installerNumber - 1).getHour();

      }
    



}
