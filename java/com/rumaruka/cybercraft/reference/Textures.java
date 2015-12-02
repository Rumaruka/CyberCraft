package com.rumaruka.cybercraft.reference;

import com.rumaruka.cybercraft.util.ResourceLocationHelper;

import net.minecraft.util.ResourceLocation;

public class Textures {
	
	public static final String Resource_Prefix =  Reference.LOWERCASE_MOD_ID + ":";
	
	
	
	public static final class Model{
		 private static final String MODEL_TEXTURE_LOCATION = "textures/models/";
	}
	
	 public static final class Gui
	    {
	        protected static final String GUI_TEXTURE_LOCATION = "textures/gui/";
	        public static final ResourceLocation CALCINATOR = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "calcinator.png");
	        public static final ResourceLocation ALUDEL = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "aludel.png");
	        public static final ResourceLocation ALCHEMICAL_BAG_SMALL = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "alchemicalBag_small.png");
	        public static final ResourceLocation ALCHEMICAL_BAG_MEDIUM = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "alchemicalBag_medium.png");
	        public static final ResourceLocation ALCHEMICAL_BAG_LARGE = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "alchemicalBag_large.png");
	        public static final ResourceLocation ALCHEMICAL_CHEST_SMALL = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "alchemicalChest_small.png");
	        public static final ResourceLocation ALCHEMICAL_CHEST_MEDIUM = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "alchemicalChest_medium.png");
	        public static final ResourceLocation ALCHEMICAL_CHEST_LARGE = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "alchemicalChest_large.png");
	        public static final ResourceLocation GLASS_BELL = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "glassBell.png");
	        public static final ResourceLocation RESEARCH_STATION = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "researchStation.png");
	        public static final ResourceLocation RESEARCH_STATION_GYLPH_1 = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "researchStation_Glyph1.png");
	        public static final ResourceLocation RESEARCH_STATION_GYLPH_2 = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "researchStation_Glyph2.png");
	        public static final ResourceLocation AUGMENTATION_TABLE = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "augmentationTable.png");
	        public static final ResourceLocation PORTABLE_CRAFTING = new ResourceLocation("textures/gui/container/crafting_table.png");
	        public static final ResourceLocation ALCHEMICAL_TOME = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "alchemicalTome.png");
	        public static final ResourceLocation TRANSMUTATION_ARRAY_1 = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "transmutationArray_1.png");
	        public static final ResourceLocation TRANSMUTATION_ARRAY_3 = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "transmutationArray_3.png");
	        public static final ResourceLocation TRANSMUTATION_ARRAY_5 = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "transmutationArray_5.png");
	        public static final ResourceLocation TRANSMUTATION_TABLET = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "transmutationTablet.png");
	}
	
	  public static final class Elements
      {
		  protected static final String GUI_TEXTURE_LOCATION = "textures/gui/";
		  protected static final String ELEMENT_TEXTURE_LOCATION = GUI_TEXTURE_LOCATION + "elements/";
          public static final ResourceLocation ARROW_LEFT = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "arrowLeft.png");
          public static final ResourceLocation ARROW_RIGHT = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "arrowRight.png");
          public static final ResourceLocation SLIDER_VERTICAL_ENABLED = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "sliderVerticalEnabled.png");
          public static final ResourceLocation SLIDER_VERTICAL_DISABLED = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "sliderVerticalDisabled.png");
          public static final ResourceLocation BUTTON_ENABLED = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "buttonEnabled.png");
          public static final ResourceLocation BUTTON_DISABLED = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "buttonDisabled.png");
          public static final ResourceLocation BUTTON_HOVER = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "buttonHover.png");
          public static final ResourceLocation BUTTON_SORT_OPTION = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "buttonSortOption.png");
          public static final ResourceLocation BUTTON_SORT_ORDER = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "buttonSortOrder.png");
      }
	  public static final class Particles
	    {
	        private static final String PARTICLES_LOCATION = "textures/particles/";
	        public static final ResourceLocation WORLD_TRANSMUTATION = ResourceLocationHelper.getResourceLocation(PARTICLES_LOCATION + "noise.png");
	    }
  }


