package com.kpabr.DeeperCaves;

import com.kpabr.DeeperCaves.item.ItemAxeBase;
import com.kpabr.DeeperCaves.item.ItemBase;
import com.kpabr.DeeperCaves.item.ItemCrystal;
import com.kpabr.DeeperCaves.item.ItemForgottenCharm;
import com.kpabr.DeeperCaves.item.ItemFragmentedBedrockBucket;
import com.kpabr.DeeperCaves.item.ItemHoeBase;
import com.kpabr.DeeperCaves.item.ItemPickaxeBase;
import com.kpabr.DeeperCaves.item.ItemSpadeBase;
import com.kpabr.DeeperCaves.item.ItemSwordBase;
import com.kpabr.DeeperCaves.item.ItemVeneniumBucket;
import com.kpabr.DeeperCaves.item.ItemVoidCharm;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemRedstone;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class DeeperItems {
    /*Item declarations*/
    public static Item silverIngot;
    public static Item sapphireGem;
    public static Item ametrineGem;

    public static Item aquamarine;

    public static Item ametrineTippedDiamondPickaxe;

    public static Item ametrineTippedSilverPickaxe;

    public static Item silverPickaxe;

    public static Item ametrineTippedSilverAxe;

    public static Item silverAxe;

    public static Item ametrineTippedSilverShovel;

    public static Item silverShovel;

    public static Item ametrineTippedSilverSword;

    public static Item silverSword;

    public static Item ametrineTippedSilverHoe;

    public static Item silverHoe;

    public static Item ametrineTippedGoldenPickaxe;
    public static Item ametrineTippedIronPickaxe;
    public static Item ametrineTippedStonePickaxe;

    public static Item ametrineTippedWoodenPickaxe;

    public static Item tenebriumIngot;

    public static Item tenebriumIngotRaw;

    public static Item fragmentedBedrockBucket;

    public static Item fragmentedBedrockBucketMI;
    public static Item fragmentedBedrockBucketW;
    public static Item fragmentedBedrockBucketL;

    public static Item vesperiteGem;

    public static Item voidCharm;

    public static Item forgottenCharm;

    public static Item profundiumIngot;

    public static Item profundiumDust;

	public static Item bucketV;

	public static Item fragmentedBedrockBucketV;

	public static Item evanesciteGem;

	public static Item crystalShard;

	public static Item ruby;

    public static Item incenditeGem;

    public static Item robustiumIngot;

    public static Item prisciumIngot;

    /*Tool and Armor Material declarations*/
    static ToolMaterial AmetrineD = EnumHelper.addToolMaterial("AMETRINE_D", 4, 1561, 14.0F, 3.0F, 10);

    static ToolMaterial AmetrineG = EnumHelper.addToolMaterial("AMETRINE_G", 1, 32, 18.0F, 0.0F, 22);
    static ToolMaterial AmetrineI = EnumHelper.addToolMaterial("AMETRINE_I", 3, 250, 11.0F, 2.0F, 14);
    static ToolMaterial AmetrineS = EnumHelper.addToolMaterial("AMETRINE_S", 2, 131, 9.0F, 1.0F, 5);

    static ToolMaterial AmetrineAg = EnumHelper.addToolMaterial("AMETRINE_AG", 3, 1000, 16.0F, 2.5F, 30); //silver

    static ToolMaterial Silver = EnumHelper.addToolMaterial("SILVER", 2, 300, 16.0F, 2.5F, 30); //silver

    static ToolMaterial AmetrineW = EnumHelper.addToolMaterial("AMETRINE_W", 1, 50, 7.0F, 0.0F, 15);

    static ArmorMaterial AmetrineLArmor = EnumHelper.addArmorMaterial("AMETRINE_L_ARMOR", 5, new int[]{2, 5, 4, 1}, 15);

    static ArmorMaterial AmetrineCArmor = EnumHelper.addArmorMaterial("AMETRINE_C_ARMOR", 15, new int[]{2, 6, 5, 2}, 12);

    static ArmorMaterial AmetrineIArmor = EnumHelper.addArmorMaterial("AMETRINE_I_ARMOR", 15, new int[]{3, 8, 6, 3}, 9);

    static ArmorMaterial AmetrineGArmor = EnumHelper.addArmorMaterial("AMETRINE_G_ARMOR", 7, new int[]{2, 6, 5, 2}, 25);

    static ArmorMaterial AmetrineDArmor = EnumHelper.addArmorMaterial("AMETRINE_D_ARMOR", 33, new int[]{4, 10, 7, 3}, 10);

    public static Item forgottenGemstone;

    public void registerItems()
    {

        GameRegistry.registerItem(this.silverIngot, "silver_ingot");
        GameRegistry.registerItem(this.sapphireGem, "sapphire_gem");
        GameRegistry.registerItem(this.ametrineGem, "ametrine_gem");

        GameRegistry.registerItem(this.aquamarine, "aquamarine");

        GameRegistry.registerItem(this.ametrineTippedDiamondPickaxe, "ametrine_tipped_diamond_pickaxe");

        GameRegistry.registerItem(this.ametrineTippedSilverPickaxe, "ametrine_tipped_silver_pickaxe");

        GameRegistry.registerItem(this.silverPickaxe, "silver_pickaxe");

        GameRegistry.registerItem(this.ametrineTippedSilverAxe, "ametrine_tipped_silver_axe");

        GameRegistry.registerItem(this.silverAxe, "silver_axe");

        GameRegistry.registerItem(this.ametrineTippedSilverShovel, "ametrine_tipped_silver_shovel");

        GameRegistry.registerItem(this.silverShovel, "silver_shovel");

        GameRegistry.registerItem(this.ametrineTippedSilverSword, "ametrine_tipped_silver_sword");

        GameRegistry.registerItem(this.silverSword, "silver_sword");

        GameRegistry.registerItem(this.ametrineTippedSilverHoe, "ametrine_tipped_silver_hoe");

        GameRegistry.registerItem(this.silverHoe, "silver_hoe");

        GameRegistry.registerItem(this.ametrineTippedGoldenPickaxe, "ametrine_tipped_golden_pickaxe");
        GameRegistry.registerItem(this.ametrineTippedIronPickaxe, "ametrine_tipped_iron_pickaxe");
        GameRegistry.registerItem(this.ametrineTippedStonePickaxe, "ametrine_tipped_stone_pickaxe");

        GameRegistry.registerItem(this.ametrineTippedWoodenPickaxe, "ametrine_tipped_wooden_pickaxe");

        GameRegistry.registerItem(this.tenebriumIngot, "tenebrium_ingot");

        //GameRegistry.registerItem(this.tenebriumIngotRaw, "tenebriumIngotRaw");

        GameRegistry.registerItem(this.forgottenGemstone, "forgottenGemstone");

        GameRegistry.registerItem(this.fragmentedBedrockBucket, "fragmented_bedrock_bucket");

        GameRegistry.registerItem(this.fragmentedBedrockBucketMI, "fragmented_bedrock_bucket_molten_iron");
        GameRegistry.registerItem(this.fragmentedBedrockBucketW, "fragmented_bedrock_bucket_water");
        GameRegistry.registerItem(this.fragmentedBedrockBucketL, "fragmented_bedrock_bucket_lava");

        GameRegistry.registerItem(this.vesperiteGem, "vesperite_gem");

        GameRegistry.registerItem(this.voidCharm, "void_charm");

        GameRegistry.registerItem(this.forgottenCharm, "forgotten_charm");

        GameRegistry.registerItem(this.profundiumIngot, "profundium_ingot");

        GameRegistry.registerItem(this.profundiumDust, "profundium_dust");

        GameRegistry.registerItem(this.bucketV, "bucket_venenium");
        GameRegistry.registerItem(this.fragmentedBedrockBucketV, "fragmented_bedrock_bucket_venenium");

        GameRegistry.registerItem(this.evanesciteGem, "evanescite_gem");

        GameRegistry.registerItem(this.crystalShard, "crystal_shard");

        GameRegistry.registerItem(this.ruby, "ruby");

        GameRegistry.registerItem(this.prisciumIngot, "priscium_ingot");
        GameRegistry.registerItem(this.robustiumIngot, "robustium_ingot");
        GameRegistry.registerItem(this.incenditeGem, "incendite_gem");
    }

    public void registerItemsOreDict()
    {
    	OreDictionary.registerOre("ingotSilver", this.silverIngot);
    	OreDictionary.registerOre("gemSapphire", this.sapphireGem);
    	OreDictionary.registerOre("gemAmetrine", this.ametrineGem);

    	OreDictionary.registerOre("gemAquamarine", this.aquamarine);

    	OreDictionary.registerOre("ingotTenebrium", this.tenebriumIngot);

    	OreDictionary.registerOre("gemForgotten", this.forgottenGemstone);

    	OreDictionary.registerOre("ingotProfundium", this.profundiumIngot);

    	OreDictionary.registerOre("dustProfundium", this.profundiumDust);

    	OreDictionary.registerOre("gemVesperite", this.vesperiteGem);

    	OreDictionary.registerOre("gemEvanescite", this.evanesciteGem);

    	OreDictionary.registerOre("gemRuby", this.ruby);

        OreDictionary.registerOre("gemIncendite", this.incenditeGem);
        OreDictionary.registerOre("ingotPriscium", this.prisciumIngot);
        OreDictionary.registerOre("ingotRobustium", this.robustiumIngot);
    }

    public void setupItems()
    {

        this.silverIngot = new ItemBase().setTextureName("deepercaves:silver_ingot").setUnlocalizedName("silverIngot").setCreativeTab(DeeperCaves.tabDeeperCavesItems);
        this.sapphireGem = new ItemBase().setTextureName("deepercaves:sapphireGem").setUnlocalizedName("sapphireGem").setCreativeTab(DeeperCaves.tabDeeperCavesItems);
        this.ametrineGem = new ItemBase().setTextureName("deepercaves:ametrineGem").setUnlocalizedName("ametrineGem").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.aquamarine = new ItemBase().setTextureName("deepercaves:aquamarine").setUnlocalizedName("aquamarine").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.ametrineTippedDiamondPickaxe = new ItemPickaxeBase(this.AmetrineD).setTextureName("deepercaves:ametrineTippedDiamondPickaxe").setUnlocalizedName("ametrineTippedDiamondPickaxe").setCreativeTab(DeeperCaves.tabDeeperCavesTools);

        this.ametrineTippedSilverPickaxe = new ItemPickaxeBase(this.AmetrineAg).setTextureName("deepercaves:ametrineTippedSilverPickaxe").setUnlocalizedName("ametrineTippedSilverPickaxe").setCreativeTab(DeeperCaves.tabDeeperCavesTools);
        this.silverPickaxe = new ItemPickaxeBase(this.Silver).setTextureName("deepercaves:silver_pickaxe").setUnlocalizedName("silverPickaxe").setCreativeTab(DeeperCaves.tabDeeperCavesTools);

        this.ametrineTippedSilverAxe = new ItemAxeBase(this.AmetrineAg).setTextureName("deepercaves:ametrineTippedSilverAxe").setUnlocalizedName("ametrineTippedSilverAxe").setCreativeTab(DeeperCaves.tabDeeperCavesTools);
        this.silverAxe = new ItemAxeBase(this.Silver).setTextureName("deepercaves:silver_axe").setUnlocalizedName("silverAxe").setCreativeTab(DeeperCaves.tabDeeperCavesTools);

        this.ametrineTippedSilverShovel = new ItemSpadeBase(this.AmetrineAg).setTextureName("deepercaves:ametrineTippedSilverShovel").setUnlocalizedName("ametrineTippedSilverShovel").setCreativeTab(DeeperCaves.tabDeeperCavesTools);
        this.silverShovel = new ItemSpadeBase(this.Silver).setTextureName("deepercaves:silver_shovel").setUnlocalizedName("silverShovel").setCreativeTab(DeeperCaves.tabDeeperCavesTools);

        this.ametrineTippedSilverSword = new ItemSwordBase(this.AmetrineAg).setTextureName("deepercaves:ametrineTippedSilverSword").setUnlocalizedName("ametrineTippedSilverSword").setCreativeTab(DeeperCaves.tabDeeperCavesTools);
        this.silverSword = new ItemSwordBase(this.Silver).setTextureName("deepercaves:silver_sword").setUnlocalizedName("silverSword").setCreativeTab(DeeperCaves.tabDeeperCavesTools);

        this.ametrineTippedSilverHoe = new ItemHoeBase(this.AmetrineAg).setTextureName("deepercaves:ametrineTippedSilverHoe").setUnlocalizedName("ametrineTippedSilverHoe").setCreativeTab(DeeperCaves.tabDeeperCavesTools);
        this.silverHoe = new ItemHoeBase(this.Silver).setTextureName("deepercaves:silver_hoe").setUnlocalizedName("silverHoe").setCreativeTab(DeeperCaves.tabDeeperCavesTools);

        this.ametrineTippedGoldenPickaxe = new ItemPickaxeBase(this.AmetrineG).setTextureName("deepercaves:ametrineTippedGoldenPickaxe").setUnlocalizedName("ametrineTippedGoldenPickaxe").setCreativeTab(DeeperCaves.tabDeeperCavesTools);
        this.ametrineTippedIronPickaxe = new ItemPickaxeBase(this.AmetrineI).setTextureName("deepercaves:ametrineTippedIronPickaxe").setUnlocalizedName("ametrineTippedIronPickaxe").setCreativeTab(DeeperCaves.tabDeeperCavesTools);
        this.ametrineTippedStonePickaxe = new ItemPickaxeBase(this.AmetrineS).setTextureName("deepercaves:ametrineTippedStonePickaxe").setUnlocalizedName("ametrineTippedStonePickaxe").setCreativeTab(DeeperCaves.tabDeeperCavesTools);

        this.ametrineTippedWoodenPickaxe = new ItemPickaxeBase(this.AmetrineW).setTextureName("deepercaves:ametrineTippedWoodenPickaxe").setUnlocalizedName("ametrineTippedWoodenPickaxe").setCreativeTab(DeeperCaves.tabDeeperCavesTools);

        this.tenebriumIngot = new ItemBase().setTextureName("deepercaves:tenebriumIngot").setUnlocalizedName("tenebriumIngot").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        //this.tenebriumIngotRaw = new ItemBase().setTextureName("deepercaves:drippingtenebriumIngot").setUnlocalizedName("tenebriumIngotDripping").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.forgottenGemstone = new ItemBase().setTextureName("deepercaves:forgottenGemstone").setUnlocalizedName("forgottenGemstone").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.fragmentedBedrockBucket = new ItemFragmentedBedrockBucket(Blocks.air).setTextureName("deepercaves:fragmented_bedrock_bucket").setUnlocalizedName("fragmentedBedrockBucket").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.fragmentedBedrockBucketMI = new ItemFragmentedBedrockBucket(DeeperCaves.fluids.moltenIronBlock).setTextureName("deepercaves:fragmented_bedrock_bucket_mi").setUnlocalizedName("fragmentedBedrockBucketMoltenIron").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.fragmentedBedrockBucketW = new ItemFragmentedBedrockBucket(Blocks.flowing_water).setTextureName("deepercaves:fragmented_bedrock_bucket_w").setUnlocalizedName("fragmentedBedrockBucketWater").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.fragmentedBedrockBucketL = new ItemFragmentedBedrockBucket(Blocks.flowing_lava).setTextureName("deepercaves:fragmented_bedrock_bucket_l").setUnlocalizedName("fragmentedBedrockBucketLava").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.vesperiteGem = new ItemBase().setTextureName("deepercaves:vesperite_gem").setUnlocalizedName("vesperiteGem").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.voidCharm = new ItemVoidCharm().setTextureName("deepercaves:voidCharm").setUnlocalizedName("voidCharm").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.forgottenCharm = new ItemForgottenCharm().setTextureName("deepercaves:forgottenCharm").setUnlocalizedName("forgottenCharm").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.profundiumIngot = new ItemBase().setTextureName("deepercaves:profundium_ingot").setUnlocalizedName("profundiumIngot").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.profundiumDust = new ItemBase().setTextureName("deepercaves:profundium_dust").setUnlocalizedName("profundiumDust").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.bucketV = new ItemVeneniumBucket(DeeperCaves.fluids.veneniumBlock).setTextureName("deepercaves:bucket_v").setUnlocalizedName("bucketVenenium").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.fragmentedBedrockBucketV = new ItemFragmentedBedrockBucket(DeeperCaves.fluids.veneniumBlock).setTextureName("deepercaves:fragmented_bedrock_bucket_v").setUnlocalizedName("fragmentedBedrockBucketVenenium").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.evanesciteGem = new ItemBase().setTextureName("deepercaves:evanescite_gem").setUnlocalizedName("evanesciteGem").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.crystalShard = new ItemCrystal().setUnlocalizedName("crystalShard").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.ruby = new ItemBase().setTextureName("deepercaves:ruby").setUnlocalizedName("ruby").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

        this.incenditeGem = new ItemBase().setTextureName("deepercaves:incendite_gem").setUnlocalizedName("incenditeGem").setCreativeTab(DeeperCaves.tabDeeperCavesItems);
        this.prisciumIngot = new ItemBase().setTextureName("deepercaves:priscium_ingot").setUnlocalizedName("prisciumIngot").setCreativeTab(DeeperCaves.tabDeeperCavesItems);
        this.robustiumIngot = new ItemBase().setTextureName("deepercaves:robustium_ingot").setUnlocalizedName("robustiumIngot").setCreativeTab(DeeperCaves.tabDeeperCavesItems);

    }
}
