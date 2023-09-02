/**
package com.kpabr.DeeperCaves;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class DeeperAchievements {

    public static Achievement enterDrop;
    public static Achievement enterMaze;
    public static Achievement enterCrystal;
    public static Achievement enterCompressed;
    public static Achievement enterBedrockPlains;
    public static Achievement enterForgotten;
    public static AchievementPage deeperPage;

    public static void setupAchievements()
    {
        enterDrop = new Achievement("enterDrop", "enterDrop", 0, 0, Items.diamond_pickaxe, null);
        enterMaze = new Achievement("enterMaze", "enterMaze", 2, 2, Blocks.stone, enterDrop);
        enterCrystal = new Achievement("enterCrystal", "enterCrystal", 0, 4, DeeperItems.ametrineGem, enterMaze);
        enterCompressed = new Achievement("enterCompressed", "enterCompressed", 2, 6, DeeperBlocks.cdiamondOre, enterCrystal);
        enterBedrockPlains = new Achievement("enterBedrockPlains", "enterBedrockPlains", 0, 8, DeeperBlocks.fragmentedBedrock, enterCompressed);
        enterForgotten = new Achievement("enterForgotten", "enterForgotten", 0, 10, Blocks.bedrock, enterBedrockPlains);
    }

    public static void registerAchievements()
    {
        enterDrop.registerStat();
        enterMaze.registerStat();
        enterCrystal.registerStat();
        enterCompressed.registerStat();
        enterBedrockPlains.registerStat();
        enterForgotten.registerStat();
        deeperPage = new AchievementPage(I18n.format("achievement.tab.deeperCaves", new Achievement[]{enterDrop, enterMaze, enterCrystal, enterCompressed, enterBedrockPlains}));
        AchievementPage.registerAchievementPage(deeperPage);

    }
}
 */
