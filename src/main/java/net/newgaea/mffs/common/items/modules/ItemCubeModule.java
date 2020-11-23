package net.newgaea.mffs.common.items.modules;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.newgaea.mffs.api.EnumProjectorModule;
import net.newgaea.mffs.api.IModularProjector;

import java.util.Set;

public class ItemCubeModule extends ItemProjectorModule {
    public ItemCubeModule(Properties properties) {
        super(properties);
    }

    @Override
    public String getModuleType() {
        return EnumProjectorModule.Cube.getString();
    }
    @Override
    public boolean enabledFoci() {
        return false;
    }

    @Override
    public boolean enabledStrength() {
        return false;
    }

    @Override
    public boolean enabledDistance() {
        return true;
    }

    @Override
    public boolean is3D() {
        return true;
    }

    @Override
    public void calculateField(IModularProjector projector, Set<BlockPos> fieldPoints) {

    }

    @Override
    public void calculateField(IModularProjector projector, Set<BlockPos> fieldPoints, Set<BlockPos> interior) {

    }
}