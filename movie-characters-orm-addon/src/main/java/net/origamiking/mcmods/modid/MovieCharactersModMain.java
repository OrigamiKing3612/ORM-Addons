package net.origamiking.mcmods.modid;

import net.fabricmc.api.ModInitializer;

import net.origamiking.mcmods.orm.OrmMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MovieCharactersModMain implements ModInitializer {
	public static final String MOD_ID = "movie-characters";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final String VERSION = "0.0.1-1.20.1";

	@Override
	public void onInitialize() {
		MovieCharactersModMain.LOGGER.info("Starting "+ MOD_ID + "-" + VERSION + " for ORM-" + OrmMain.VERSION);
	}
}