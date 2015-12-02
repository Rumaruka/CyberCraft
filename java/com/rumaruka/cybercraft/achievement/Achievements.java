package com.rumaruka.cybercraft.achievement;

import com.rumaruka.cybercraft.blocks.register.ModBlocks;

import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class Achievements {

	public static Achievement achievementbuildAlloyPresser;

	public static void init() {
		achievementbuildAlloyPresser = new Achievement("achievement.buildingAlloyPresser", "AlloyPresser",4, -1,ModBlocks.alloy_presser, achievementbuildAlloyPresser).registerStat();
		AchievementPage.registerAchievementPage(new AchievementPage("CyberCraft", new Achievement[]{achievementbuildAlloyPresser})); 
	}
}