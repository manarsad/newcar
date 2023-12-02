package caraccessoriesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;

import caraccessories.Installer;
import caraccessories.InstallerFun;
import caraccessories.User;
import caraccessories.UserFun;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scheduleappointment {
    private Installer installer = new Installer();
    private static InstallerFun installerfun = new InstallerFun();
    private static List<Installer> result;
    
	
	
	@When("I try to add a appointmant with installername {string} and installeremail {string} and installerday {string} and installermonth {string} and installerhour {int}")
	public void i_try_to_add_a_appointmant_with_installername_and_installeremail_and_installerday_and_installermonth_and_installerhour(String string, String string2, String string3, String string4, Integer int1) {
	    result = installerfun.scheduleappointments(string, string2, string3, string4, int1);
	    
	}
	@Then("I will add the installer appointment with email {string}")
	public void i_will_add_the_installer_appointment_with_email(String string) {
		assertTrue(InstallerFun.getflag1()==true);

		 //assertTrue(installerfun.getinstalleremail1(string)!=null);
		 installerfun.printInstallerList();

	}

}
