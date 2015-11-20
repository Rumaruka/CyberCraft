package com.rumaruka.cybercraft.reference;

import com.rumaruka.cybercraft.util.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

public class Textures {
	
	public static final String Resource_Prefix =  Reference.LOWERCASE_MOD_ID + ":";
	
	
	
	public static final class Model{
		 private static final String MODEL_TEXTURE_LOCATION = "textures/models/";
	}
	
	public static final class Gui{
		public static final String GUI_TEXTURE_LOCATION = "textures/gui/";
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


