package epicsquid.seaofstars;

import com.tterrag.registrate.Registrate;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.common.Mod;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@Mod(SeaOfStars.MOD_ID)
public class SeaOfStars {

	public static final String MOD_ID = "seaofstars";
	public static final Logger LOGGER = LogManager.getLogManager().getLogger(MOD_ID);
	private static final Lazy<Registrate> REGISTRATE = Lazy.of(() -> Registrate.create(MOD_ID));

//	public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(SeaOfStars.MOD_ID) {
//		@Override
//		@Nonnull
//		public ItemStack makeIcon() {
//			return new ItemStack(SeaOfStars.SOMETHING.get());
//		}
//	};

	public SeaOfStars() {
		MinecraftForge.EVENT_BUS.register(this);

//		registrate().creativeModeTab(() -> ITEM_GROUP);
	}


	public static Registrate registrate() {
		return REGISTRATE.get();
	}
}
