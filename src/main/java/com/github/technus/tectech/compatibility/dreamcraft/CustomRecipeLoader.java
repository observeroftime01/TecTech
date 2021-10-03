package com.github.technus.tectech.compatibility.dreamcraft;

import com.github.technus.tectech.recipe.TT_recipeAdder;
import gregtech.api.enums.GTNH_ExtraMaterials;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import static gregtech.api.enums.Materials.*;
import static gregtech.api.enums.OrePrefixes.*;
import static gregtech.api.enums.ItemList.*;

public class CustomRecipeLoader implements Runnable{
    @Override
    public void run() {
        // UIV Pump recipe
        TT_recipeAdder.addResearchableAssemblylineRecipe(ItemList.Electric_Pump_UEV.get(1L),
                192000, 256, 800000, 8, new ItemStack[]{
                        ItemList.Electric_Motor_UIV.get(1L),
                        GT_OreDictUnificator.get(pipeHuge, Infinity, 8L),
                        GT_OreDictUnificator.get(plateDense, BlackPlutonium, 8L),
                        GT_OreDictUnificator.get(plateDense, BlackPlutonium, 8L),
                        GT_OreDictUnificator.get(screw, Tartarite, 64L),
                        GT_OreDictUnificator.get(ring, (AnySyntheticRubber), 64L),
                        GT_OreDictUnificator.get(rotor, GTNH_ExtraMaterials.ExtremeTurbineSteel, 4L),
                        GT_OreDictUnificator.get(cableGt16, NetherStar, 8L)}, new FluidStack[]{
                        Naquadria.getMolten(3888),
                        SolderingAlloy.getMolten(7776),
                        Lubricant.getFluid(10000)}, Electric_Pump_UIV.get(1), 4000, 3200000);

        // Advanced Chemical Reactor Recipe
        TT_recipeAdder.addResearchableAssemblylineRecipe(ItemList.Machine_Multi_LargeChemicalReactor.get(1L),
                480000, 1024, 2000000, 8, new ItemStack[]{
                        ItemList.Machine_Multi_LargeChemicalReactor.get(1L),
                        ItemList.Hull_MAX.get(16L),
                        GT_OreDictUnificator.get(rotor, Infinity, 4L),
                        GT_OreDictUnificator.get(pipeHuge, Oriharukon, 8),
                        ItemList.Electric_Motor_UHV.get(4L),
                        ItemList.Robot_Arm_UHV.get(2L),
                        ItemList.Field_Generator_ZPM.get(2L),
                        GT_OreDictUnificator.get(plateDense, Polytetrafluoroethylene, 8L),
                        GT_OreDictUnificator.get(plateDense, Polytetrafluoroethylene, 8L),
                        GT_OreDictUnificator.get(circuit, Infinite, 8L),
                        GT_OreDictUnificator.get(wireFine, Gold, 64L)}, new FluidStack[]{
                        SolderingAlloy.getMolten(2304),
                        Polytetrafluoroethylene.getMolten(4608)},
                ItemList.Machine_Multi_Advanced_LargeChemicalReactor.get(1L), 2000, 800000);


        // Modified Lapotron Recipes
        TT_recipeAdder.addResearchableAssemblylineRecipe(ItemList.Energy_Cluster.get(1L),
                12000, 16, 100000, 3, new Object[]{
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Tritanium, 64L),
                ItemList.Circuit_Wetwaremainframe.get(4),
                ItemList.Energy_Cluster.get(8L),
                ItemList.Field_Generator_UV.get(2),
                ItemList.Circuit_Wafer_HPIC.get(64),
                ItemList.Circuit_Wafer_HPIC.get(64),
                ItemList.Circuit_Parts_DiodeASMD.get(32),
                GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.SuperconductorUHV, 32),
        }, new FluidStack[]{
                Materials.SolderingAlloy.getMolten(2880),
                new FluidStack(FluidRegistry.getFluid("ic2coolant"), 16000)
        }, ItemList.ZPM2.get(1), 3000, 400000);

        // Modified Lapotron Recipes
        TT_recipeAdder.addResearchableAssemblylineRecipe(ItemList.ZPM2.get(1L),
                24000, 64, 200000, 6, new Object[]{
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Neutronium, 32L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Neutronium, 32L),
                ItemList.Circuit_Biomainframe.get(4L),
                ItemList.ZPM2.get(8),
                ItemList.Field_Generator_UHV.get(4),
                ItemList.Circuit_Wafer_UHPIC.get(64),
                ItemList.Circuit_Wafer_UHPIC.get(64),
                ItemList.Circuit_Wafer_SoC2.get(32),
                ItemList.Circuit_Parts_DiodeASMD.get(64),
                GT_OreDictUnificator.get(OrePrefixes.wireGt02, Materials.SuperconductorUHV, 64),
        }, new FluidStack[]{
                Materials.SolderingAlloy.getMolten(3760),
                Materials.Naquadria.getMolten(9216),
                new FluidStack(FluidRegistry.getFluid("ic2coolant"), 32000)
        }, ItemList.ZPM3.get(1), 4000, 1600000);
    }
}
