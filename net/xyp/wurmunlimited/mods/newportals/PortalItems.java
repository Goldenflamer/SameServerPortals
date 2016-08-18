package net.xyp.wurmunlimited.mods.newportals;

import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;
import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.ItemTypes;
import java.io.IOException;

public class PortalItems implements WurmServerMod, ItemTypes, MiscConstants {
	
	public PortalItems() {
		try {
			com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(4002, "Server Portal", "portals", "almost full", "somewhat occupied", "half-full", "emptyish",
					"This rudimentary structure made from stone bricks and logs is rumoured to lead to far away lands.",
					new short[] { 108, 25, 49, 31, 52, 44, 48, 67, 51, 86, 178 },(short) 60,(short) 1, 0, 2419200L, 500, 500, 1000, -10,
					MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.portal.8.", 1.0F, 2000000,(byte) 15, 100, false);

			com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(4003, "Huge Server Portal", "portals", "almost full", "somewhat occupied", "half-full",
					"emptyish",
					"This impressive structure made from both known and leads to far away lands.",
					new short[] { 108, 25, 49, 31, 52, 44, 48, 67, 51, 178 },(short) 60,(short) 1, 0, 9223372036854775807L, 500, 500,
					1000, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.portal.7.", 1.0F, 2000000,(byte) 15,
					100, false);
			
			com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(4004, 3, "Steel Server Portal", "portals", "superb", "good", "ok", "poor", "",
					new short[] { 108, 25, 49, 31, 52, 44, 48, 67, 51, 178 },(short) 60,(short) 1, 0, 9223372036854775807L, 100, 100, 100, -10,
					MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.portal.9.", 30.0F, 240000,(byte) 57, 10000, false,
					-1);
			
			com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(4010, 3, "Dark Crystal Server Portal", "portals", "superb", "good", "ok", "poor", "",
					new short[] { 108, 25, 49, 31, 52, 44, 48, 67, 51, 178 },(short) 60,(short) 1, 0, 9223372036854775807L, 100, 100, 100, -10,
					MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.portal.3.", 30.0F, 240000,(byte) 57, 10000, false,
					-1);
			
			com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(4011, 3, "Crystal Server Portal", "portals", "superb", "good", "ok", "poor", "",
					new short[] { 108, 25, 49, 31, 52, 44, 48, 67, 51, 178 },(short) 60,(short) 1, 0, 9223372036854775807L, 100, 100, 100, -10,
					MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.portal.4.", 30.0F, 240000,(byte) 57, 10000, false,
					-1);
			
		}catch(IOException e){
			
		}
	}	
}