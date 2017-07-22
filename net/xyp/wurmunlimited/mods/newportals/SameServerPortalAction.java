package net.xyp.wurmunlimited.mods.newportals;

import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;
import org.gotti.wurmunlimited.modsupport.actions.ModAction;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.behaviours.Action;
import com.wurmonline.server.behaviours.ActionEntry;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.items.ItemTypes;
import com.wurmonline.server.players.Player;

import java.util.List;
import java.util.Arrays;

public class SameServerPortalAction implements WurmServerMod, ItemTypes, MiscConstants, ModAction, BehaviourProvider, ActionPerformer {

	static short actionId;
	static ActionEntry actionEntry;

	public SameServerPortalAction() {
		actionId = (short) ModActions.getNextActionId();
		actionEntry = ActionEntry.createEntry(actionId, "Port", "Porting", new int[]{ 
				}); 
		ModActions.registerAction(actionEntry);
	}

	@Override
	public BehaviourProvider getBehaviourProvider() {
		return this;
	}

	@Override
	public ActionPerformer getActionPerformer() {
		return this;
	}

	@Override
	public short getActionId() {
		return actionId;
	}
	
	@Override
	public List<ActionEntry> getBehavioursFor(Creature performer, Item source, Item target) {
		return getBehavioursFor(performer, target);
	}
	
	@Override
	public List<ActionEntry> getBehavioursFor(Creature performer, Item target) {
		int clicked = target.getTemplateId();
		int altData = target.getAuxData();
		if (performer instanceof Player) {
			if (clicked == 4002 || clicked == 4003 || clicked == 4004 || clicked == 4010 || clicked == 4011 || clicked == 4016 || clicked == 4015) {
				if (altData == 1) {
				return (List<ActionEntry>) Arrays.asList(actionEntry);
				} else {
					return null;
				}
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
	
	@Override
	public boolean action(Action act, Creature performer, Item source, Item target, short action, float counter) {
		return action(act, performer, target, action, counter);
	}
	
	@Override
	public boolean action(Action act, Creature performer, Item target, short action, float counter) {
		try {
			float tx = (target.getData1() *4);
			float ty = (target.getData2() *4);
			float tx1 = tx + 2;
			float ty1 = ty + 2;
			int layer = 0;
			int floorLevel = performer.getFloorLevel();
			performer.setTeleportPoints(tx1, ty1, layer, floorLevel);
			performer.startTeleporting();
			performer.getCommunicator().sendNormalServerMessage("You feel a slight tingle in your spine.");
			performer.getCommunicator().sendTeleport(false,false,(byte) 0);
			performer.teleport(true);
			performer.stopTeleporting();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
