package com.fosoterritory.minecraft.beekeepermod.block.custom;

import com.fosoterritory.minecraft.beekeepermod.block.entity.HoneyExtractorBlockEntity;
import com.fosoterritory.minecraft.beekeepermod.block.entity.ModBlockEntities;
import net.minecraft.block.*;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class HoneyExtractorBlock extends BlockWithEntity implements BlockEntityProvider {
    //public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final BooleanProperty HONEY = BooleanProperty.of("honey");

    public HoneyExtractorBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH).with(HONEY, false));
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new HoneyExtractorBlockEntity(pos, state);
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof HoneyExtractorBlockEntity) {
                ItemScatterer.spawn(world, pos, (HoneyExtractorBlockEntity)blockEntity);
                world.updateComparators(pos, this);
            }
            //This is what's throwing the warning. Ask Caleb.
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            NamedScreenHandlerFactory screenHandlerFactory = ((HoneyExtractorBlockEntity) world.getBlockEntity(pos));

            if (screenHandlerFactory != null) {
                player.openHandledScreen(screenHandlerFactory);
            }
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    //Show Caleb:
    //These two are required for getting the block to face the correct direction in generated structures,
    //but I don't trust what's currently there.
    //"FACING" is copy-pasted from Furnace, but that didn't work.
    //"HORIZONTAL_FACING" is my guess of a fix, given it fixed the other stuff, but I haven't tested it.
    //Ultimately I don't think "return state" is correct, even if ".with" onward is correct after
    //changing F to P.H_F, but I don't know what I should change "return state" to.

    //@Override
    //public BlockState rotate(BlockState state, BlockRotation rotation) {
        //return state.with(Properties.HORIZONTAL_FACING, rotation.rotate(state.get(Properties.HORIZONTAL_FACING)));
    //}

    //@Override
    //public BlockState mirror(BlockState state, BlockMirror mirror) {
        //return state.rotate(mirror.getRotation(state.get(FACING)));
    //}

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING, HONEY);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, ModBlockEntities.HONEY_EXTRACTOR_BLOCK_ENTITY,
                (world1, pos, state1, blockEntity) -> blockEntity.tick(world1, pos, state1));
    }

    private <T extends BlockEntity> BlockEntityTicker<T> validateTicker(BlockEntityType<T> type, BlockEntityType<HoneyExtractorBlockEntity> HoneyExtractorBlockEntity, Object o) {
        return null;
    }

    //@Override
    //public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        //tooltip.add(Text.translatable("tooltip.beekeepermod.honey_extractor_block.tooltip"));
        //super.appendTooltip(stack, world, tooltip, options);
    //}
}
