package at.hannibal2.skyhanni.config.features.event;

import at.hannibal2.skyhanni.config.FeatureToggle;
import com.google.gson.annotations.Expose;
import io.github.notenoughupdates.moulconfig.annotations.ConfigEditorBoolean;
import io.github.notenoughupdates.moulconfig.annotations.ConfigLink;
import io.github.notenoughupdates.moulconfig.annotations.ConfigOption;

import javax.swing.text.Position;

public class GreatSpookConfig {

    @Expose
    @ConfigOption(name = "Primal Fear Timer", desc = "Show cooldown timer for next Primal Fear.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean primalFearTimer = false;

    @Expose
    @ConfigOption(name = "Primal Fear Notify", desc = "Play a notification sound when the next Primal Fear can spawn.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean primalFearNotification = false;

    @Expose
    @ConfigLink(owner = GreatSpookConfig.class, field = "primalFearTimer")
    public Position positionTimer = new Position(20, 20, false, true);

    @Expose
    @ConfigOption(name = "Fear Stat Display", desc = "Show your current Fear stat value.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean fearStatDisplay = false;

    @Expose
    @ConfigLink(owner = GreatSpookConfig.class, field = "fearStatDisplay")
    public Position positionFear = new Position(30, 30, false, true);

    @Expose
    @ConfigOption(name = "IRL Time Left", desc = "Show the IRL time left before The Great Spook ends.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean greatSpookTimeLeft = false;

    @Expose
    @ConfigLink(owner = GreatSpookConfig.class, field = "greatSpookTimeLeft")
    public Position positionTimeLeft = new Position(40, 40, false, true);

}
