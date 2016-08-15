package net.xyp.wurmunlimited.mods.newportals;

import org.gotti.wurmunlimited.modloader.interfaces.ItemTemplatesCreatedListener;
import org.gotti.wurmunlimited.modloader.interfaces.PreInitable;
import org.gotti.wurmunlimited.modloader.interfaces.ServerStartedListener;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.ItemTypes;

public class NewPortals implements WurmServerMod, PreInitable, ServerStartedListener, ItemTemplatesCreatedListener, ItemTypes, MiscConstants {
	
	@Override
	public void onItemTemplatesCreated() {
		new PortalItems();
	}

	@Override
	public void onServerStarted() {
		ModActions.registerAction(new SameServerPortalAction());
	}
	    
	@Override
	public void preInit() {
		ModActions.init();
	}

}
