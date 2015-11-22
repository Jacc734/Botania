/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Nov 14, 2014, 11:00:16 PM (GMT)]
 */
package vazkii.botania.common.block.tile.string;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.util.BlockPos;

public class TileRedStringDispenser extends TileRedStringContainer {

	@Override
	public boolean acceptBlock(BlockPos pos) {
		TileEntity tile = worldObj.getTileEntity(pos);
		return tile != null && tile instanceof TileEntityDispenser;
	}

	public void tickDispenser() {
		BlockPos bind = getBinding();
		if(bind != null) {
			TileEntity tile = worldObj.getTileEntity(bind);
			if(tile instanceof TileEntityDispenser)
				worldObj.scheduleUpdate(bind, tile.getBlockType(), tile.getBlockType().tickRate(worldObj));
		}
	}

}
