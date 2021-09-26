package com.github.technus.tectech.compatibility.dreamcraft;

import com.github.technus.tectech.recipe.TT_recipeAdder;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import static gregtech.api.enums.Materials.*;
import static gregtech.api.enums.Materials.Gold;
import static gregtech.api.enums.OrePrefixes.*;
import static gregtech.api.enums.OrePrefixes.wireFine;

public class CustomRecipeLoader implements Runnable{
    @Override
    public void run() {

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


    }
}
