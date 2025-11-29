package net.parzival.wth;

import net.fabricmc.api.ModInitializer;

import net.parzival.wth.index.WelcomeToHawkinsItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WelcomeToHawkins implements ModInitializer {
	public static final String MOD_ID = "wth";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        WelcomeToHawkinsItems.registerWelcomeToHawkinsItems();

		LOGGER.info("Welcome To Hawkins, Indiana!");
	}
}