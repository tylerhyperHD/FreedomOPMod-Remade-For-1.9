package me.RoboSystems.DonationSystem;

import org.bukkit.event.Listener;
import me.StevenLawson.TotalFreedomMod.*;

public class FOM_Listener implements Listener
{
    public static void loadDonatorConfig()
    {
        try
        {
            FOM_DonatorList.backupSavedList();
            FOM_DonatorList.loadDonatorList();

            superadmin = FOM_DonatorList.getDonatorNames();
            superadmin_ips = FOM_DonatorList.getDonatorIPs();
        }
        catch (Exception ex)
        {
            TFM_Log.severe("Error loading donator list: " + ex.getMessage());
        }
    }
}