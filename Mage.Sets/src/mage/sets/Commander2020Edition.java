package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.Arrays;
import java.util.List;

/**
 * @author TheElk801
 */
public final class Commander2020Edition extends ExpansionSet {

    private static final List<String> mutateNames = Arrays.asList(
            "Mindleecher",
            "Otrimi, the Ever-Playful",
            "Sawtusk Demolisher",
            "Souvenir Snatcher"
    );

    private static final Commander2020Edition instance = new Commander2020Edition();

    public static Commander2020Edition getInstance() {
        return instance;
    }

    private Commander2020Edition() {
        super("Commander 2020 Edition", "C20", ExpansionSet.buildDate(2020, 4, 24), SetType.SUPPLEMENTAL);
        this.blockName = "Command Zone";
        this.hasBasicLands = false; // remove when basics are available

        cards.add(new SetCardInfo("Abandoned Sarcophagus", 236, Rarity.RARE, mage.cards.a.AbandonedSarcophagus.class));
        cards.add(new SetCardInfo("Abzan Ascendancy", 198, Rarity.RARE, mage.cards.a.AbzanAscendancy.class));
        cards.add(new SetCardInfo("Abzan Charm", 199, Rarity.UNCOMMON, mage.cards.a.AbzanCharm.class));
        cards.add(new SetCardInfo("Acidic Slime", 165, Rarity.UNCOMMON, mage.cards.a.AcidicSlime.class));
        cards.add(new SetCardInfo("Adriana, Captain of the Guard", 200, Rarity.RARE, mage.cards.a.AdrianaCaptainOfTheGuard.class));
        cards.add(new SetCardInfo("Aerial Responder", 72, Rarity.UNCOMMON, mage.cards.a.AerialResponder.class));
        cards.add(new SetCardInfo("Ajani Unyielding", 201, Rarity.MYTHIC, mage.cards.a.AjaniUnyielding.class));
        cards.add(new SetCardInfo("Akroma's Vengeance", 74, Rarity.RARE, mage.cards.a.AkromasVengeance.class));
        cards.add(new SetCardInfo("Akroma, Angel of Wrath", 73, Rarity.MYTHIC, mage.cards.a.AkromaAngelOfWrath.class));
        cards.add(new SetCardInfo("Alesha, Who Smiles at Death", 143, Rarity.RARE, mage.cards.a.AleshaWhoSmilesAtDeath.class));
        cards.add(new SetCardInfo("Ambition's Cost", 129, Rarity.UNCOMMON, mage.cards.a.AmbitionsCost.class));
        cards.add(new SetCardInfo("Angel of Finality", 75, Rarity.RARE, mage.cards.a.AngelOfFinality.class));
        cards.add(new SetCardInfo("Animist's Awakening", 166, Rarity.RARE, mage.cards.a.AnimistsAwakening.class));
        cards.add(new SetCardInfo("Arcane Signet", 237, Rarity.COMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Archon of Valor's Reach", 202, Rarity.RARE, mage.cards.a.ArchonOfValorsReach.class));
        cards.add(new SetCardInfo("Artifact Mutation", 203, Rarity.RARE, mage.cards.a.ArtifactMutation.class));
        cards.add(new SetCardInfo("Ash Barrens", 255, Rarity.COMMON, mage.cards.a.AshBarrens.class));
        cards.add(new SetCardInfo("Astral Drift", 76, Rarity.RARE, mage.cards.a.AstralDrift.class));
        cards.add(new SetCardInfo("Avenging Huntbonder", 22, Rarity.RARE, mage.cards.a.AvengingHuntbonder.class));
        cards.add(new SetCardInfo("Azorius Chancery", 256, Rarity.UNCOMMON, mage.cards.a.AzoriusChancery.class));
        cards.add(new SetCardInfo("Azorius Signet", 238, Rarity.UNCOMMON, mage.cards.a.AzoriusSignet.class));
        cards.add(new SetCardInfo("Banisher Priest", 77, Rarity.UNCOMMON, mage.cards.b.BanisherPriest.class));
        cards.add(new SetCardInfo("Battlefield Forge", 257, Rarity.RARE, mage.cards.b.BattlefieldForge.class));
        cards.add(new SetCardInfo("Beast Whisperer", 167, Rarity.RARE, mage.cards.b.BeastWhisperer.class));
        cards.add(new SetCardInfo("Beast Within", 168, Rarity.UNCOMMON, mage.cards.b.BeastWithin.class));
        cards.add(new SetCardInfo("Blighted Woodland", 258, Rarity.UNCOMMON, mage.cards.b.BlightedWoodland.class));
        cards.add(new SetCardInfo("Bojuka Bog", 259, Rarity.COMMON, mage.cards.b.BojukaBog.class));
        cards.add(new SetCardInfo("Bonder's Ornament", 67, Rarity.COMMON, mage.cards.b.BondersOrnament.class));
        cards.add(new SetCardInfo("Boneyard Mycodrax", 40, Rarity.RARE, mage.cards.b.BoneyardMycodrax.class));
        cards.add(new SetCardInfo("Boros Garrison", 260, Rarity.COMMON, mage.cards.b.BorosGarrison.class));
        cards.add(new SetCardInfo("Boros Signet", 239, Rarity.UNCOMMON, mage.cards.b.BorosSignet.class));
        cards.add(new SetCardInfo("Bounty Agent", 78, Rarity.RARE, mage.cards.b.BountyAgent.class));
        cards.add(new SetCardInfo("Brallin, Skyshark Rider", 4, Rarity.MYTHIC, mage.cards.b.BrallinSkysharkRider.class));
        cards.add(new SetCardInfo("Cairn Wanderer", 130, Rarity.RARE, mage.cards.c.CairnWanderer.class));
        cards.add(new SetCardInfo("Call the Coppercoats", 23, Rarity.RARE, mage.cards.c.CallTheCoppercoats.class));
        cards.add(new SetCardInfo("Canopy Vista", 261, Rarity.RARE, mage.cards.c.CanopyVista.class));
        cards.add(new SetCardInfo("Captivating Crew", 144, Rarity.RARE, mage.cards.c.CaptivatingCrew.class));
        cards.add(new SetCardInfo("Cast Out", 79, Rarity.UNCOMMON, mage.cards.c.CastOut.class));
        cards.add(new SetCardInfo("Cataclysmic Gearhulk", 80, Rarity.MYTHIC, mage.cards.c.CataclysmicGearhulk.class));
        cards.add(new SetCardInfo("Cavalry Pegasus", 81, Rarity.COMMON, mage.cards.c.CavalryPegasus.class));
        cards.add(new SetCardInfo("Caves of Koilos", 262, Rarity.RARE, mage.cards.c.CavesOfKoilos.class));
        cards.add(new SetCardInfo("Cazur, Ruthless Stalker", 5, Rarity.MYTHIC, mage.cards.c.CazurRuthlessStalker.class));
        cards.add(new SetCardInfo("Chandra, Flamecaller", 145, Rarity.MYTHIC, mage.cards.c.ChandraFlamecaller.class));
        cards.add(new SetCardInfo("Chaos Warp", 146, Rarity.RARE, mage.cards.c.ChaosWarp.class));
        cards.add(new SetCardInfo("Charmbreaker Devils", 147, Rarity.RARE, mage.cards.c.CharmbreakerDevils.class));
        cards.add(new SetCardInfo("Chemister's Insight", 108, Rarity.UNCOMMON, mage.cards.c.ChemistersInsight.class));
        cards.add(new SetCardInfo("Cinder Glade", 263, Rarity.RARE, mage.cards.c.CinderGlade.class));
        cards.add(new SetCardInfo("Citywide Bust", 82, Rarity.RARE, mage.cards.c.CitywideBust.class));
        cards.add(new SetCardInfo("Cleansing Nova", 83, Rarity.RARE, mage.cards.c.CleansingNova.class));
        cards.add(new SetCardInfo("Cold-Eyed Selkie", 204, Rarity.RARE, mage.cards.c.ColdEyedSelkie.class));
        cards.add(new SetCardInfo("Comet Storm", 148, Rarity.MYTHIC, mage.cards.c.CometStorm.class));
        cards.add(new SetCardInfo("Command Tower", 264, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Commander's Sphere", 240, Rarity.COMMON, mage.cards.c.CommandersSphere.class));
        cards.add(new SetCardInfo("Commune with Lava", 149, Rarity.RARE, mage.cards.c.CommuneWithLava.class));
        cards.add(new SetCardInfo("Crackling Doom", 205, Rarity.RARE, mage.cards.c.CracklingDoom.class));
        cards.add(new SetCardInfo("Crackling Drake", 206, Rarity.UNCOMMON, mage.cards.c.CracklingDrake.class));
        cards.add(new SetCardInfo("Crop Rotation", 169, Rarity.COMMON, mage.cards.c.CropRotation.class));
        cards.add(new SetCardInfo("Cryptic Trilobite", 21, Rarity.RARE, mage.cards.c.CrypticTrilobite.class));
        cards.add(new SetCardInfo("Crystalline Resonance", 31, Rarity.RARE, mage.cards.c.CrystallineResonance.class));
        cards.add(new SetCardInfo("Cultivate", 170, Rarity.COMMON, mage.cards.c.Cultivate.class));
        cards.add(new SetCardInfo("Curator of Mysteries", 109, Rarity.RARE, mage.cards.c.CuratorOfMysteries.class));
        cards.add(new SetCardInfo("Curious Herd", 59, Rarity.RARE, mage.cards.c.CuriousHerd.class));
        cards.add(new SetCardInfo("Daring Fiendbonder", 41, Rarity.RARE, mage.cards.d.DaringFiendbonder.class));
        cards.add(new SetCardInfo("Darkwater Catacombs", 265, Rarity.RARE, mage.cards.d.DarkwaterCatacombs.class));
        cards.add(new SetCardInfo("Deadbridge Chant", 207, Rarity.MYTHIC, mage.cards.d.DeadbridgeChant.class));
        cards.add(new SetCardInfo("Deadly Rollick", 42, Rarity.RARE, mage.cards.d.DeadlyRollick.class));
        cards.add(new SetCardInfo("Deadly Tempest", 131, Rarity.RARE, mage.cards.d.DeadlyTempest.class));
        cards.add(new SetCardInfo("Dearly Departed", 84, Rarity.RARE, mage.cards.d.DearlyDeparted.class));
        cards.add(new SetCardInfo("Deathsprout", 208, Rarity.UNCOMMON, mage.cards.d.Deathsprout.class));
        cards.add(new SetCardInfo("Decree of Justice", 85, Rarity.RARE, mage.cards.d.DecreeOfJustice.class));
        cards.add(new SetCardInfo("Deflecting Swat", 50, Rarity.RARE, mage.cards.d.DeflectingSwat.class));
        cards.add(new SetCardInfo("Descend upon the Sinful", 86, Rarity.MYTHIC, mage.cards.d.DescendUponTheSinful.class));
        cards.add(new SetCardInfo("Desert of the Fervent", 266, Rarity.COMMON, mage.cards.d.DesertOfTheFervent.class));
        cards.add(new SetCardInfo("Desert of the Mindful", 267, Rarity.COMMON, mage.cards.d.DesertOfTheMindful.class));
        cards.add(new SetCardInfo("Desert of the True", 268, Rarity.COMMON, mage.cards.d.DesertOfTheTrue.class));
        cards.add(new SetCardInfo("Desolate Lighthouse", 269, Rarity.RARE, mage.cards.d.DesolateLighthouse.class));
        cards.add(new SetCardInfo("Despark", 209, Rarity.UNCOMMON, mage.cards.d.Despark.class));
        cards.add(new SetCardInfo("Devout Chaplain", 87, Rarity.UNCOMMON, mage.cards.d.DevoutChaplain.class));
        cards.add(new SetCardInfo("Dimir Aqueduct", 270, Rarity.UNCOMMON, mage.cards.d.DimirAqueduct.class));
        cards.add(new SetCardInfo("Disciple of Bolas", 132, Rarity.RARE, mage.cards.d.DiscipleOfBolas.class));
        cards.add(new SetCardInfo("Dismantling Wave", 25, Rarity.RARE, mage.cards.d.DismantlingWave.class));
        cards.add(new SetCardInfo("Djinn Illuminatus", 210, Rarity.RARE, mage.cards.d.DjinnIlluminatus.class));
        cards.add(new SetCardInfo("Drake Haven", 110, Rarity.RARE, mage.cards.d.DrakeHaven.class));
        cards.add(new SetCardInfo("Dredge the Mire", 43, Rarity.RARE, mage.cards.d.DredgeTheMire.class));
        cards.add(new SetCardInfo("Drifting Meadow", 271, Rarity.COMMON, mage.cards.d.DriftingMeadow.class));
        cards.add(new SetCardInfo("Dualcaster Mage", 150, Rarity.RARE, mage.cards.d.DualcasterMage.class));
        cards.add(new SetCardInfo("Duneblast", 211, Rarity.RARE, mage.cards.d.Duneblast.class));
        cards.add(new SetCardInfo("Endless Sands", 272, Rarity.RARE, mage.cards.e.EndlessSands.class));
        cards.add(new SetCardInfo("Etali, Primal Storm", 151, Rarity.RARE, mage.cards.e.EtaliPrimalStorm.class));
        cards.add(new SetCardInfo("Eternal Dragon", 88, Rarity.RARE, mage.cards.e.EternalDragon.class));
        cards.add(new SetCardInfo("Ever After", 133, Rarity.RARE, mage.cards.e.EverAfter.class));
        cards.add(new SetCardInfo("Evolution Charm", 171, Rarity.COMMON, mage.cards.e.EvolutionCharm.class));
        cards.add(new SetCardInfo("Exotic Orchard", 273, Rarity.RARE, mage.cards.e.ExoticOrchard.class));
        cards.add(new SetCardInfo("Fierce Guardianship", 35, Rarity.RARE, mage.cards.f.FierceGuardianship.class));
        cards.add(new SetCardInfo("Find // Finality", 212, Rarity.RARE, mage.cards.f.FindFinality.class));
        cards.add(new SetCardInfo("Flawless Maneuver", 26, Rarity.RARE, mage.cards.f.FlawlessManeuver.class));
        cards.add(new SetCardInfo("Fluctuator", 241, Rarity.RARE, mage.cards.f.Fluctuator.class));
        cards.add(new SetCardInfo("Forgotten Cave", 274, Rarity.UNCOMMON, mage.cards.f.ForgottenCave.class));
        cards.add(new SetCardInfo("Frantic Search", 111, Rarity.COMMON, mage.cards.f.FranticSearch.class));
        cards.add(new SetCardInfo("Frontier Bivouac", 275, Rarity.UNCOMMON, mage.cards.f.FrontierBivouac.class));
        cards.add(new SetCardInfo("Frontline Medic", 89, Rarity.RARE, mage.cards.f.FrontlineMedic.class));
        cards.add(new SetCardInfo("Fumiko the Lowblood", 152, Rarity.RARE, mage.cards.f.FumikoTheLowblood.class));
        cards.add(new SetCardInfo("Garna, the Bloodflame", 213, Rarity.UNCOMMON, mage.cards.g.GarnaTheBloodflame.class));
        cards.add(new SetCardInfo("Gavony Township", 276, Rarity.RARE, mage.cards.g.GavonyTownship.class));
        cards.add(new SetCardInfo("Gaze of Granite", 214, Rarity.RARE, mage.cards.g.GazeOfGranite.class));
        cards.add(new SetCardInfo("Genesis Hydra", 172, Rarity.RARE, mage.cards.g.GenesisHydra.class));
        cards.add(new SetCardInfo("Glademuse", 60, Rarity.RARE, mage.cards.g.Glademuse.class));
        cards.add(new SetCardInfo("Goblin Dark-Dwellers", 153, Rarity.RARE, mage.cards.g.GoblinDarkDwellers.class));
        cards.add(new SetCardInfo("Golgari Rot Farm", 277, Rarity.UNCOMMON, mage.cards.g.GolgariRotFarm.class));
        cards.add(new SetCardInfo("Grim Backwoods", 278, Rarity.RARE, mage.cards.g.GrimBackwoods.class));
        cards.add(new SetCardInfo("Grisly Salvage", 215, Rarity.COMMON, mage.cards.g.GrislySalvage.class));
        cards.add(new SetCardInfo("Growth Spiral", 216, Rarity.COMMON, mage.cards.g.GrowthSpiral.class));
        cards.add(new SetCardInfo("Gruul Turf", 279, Rarity.UNCOMMON, mage.cards.g.GruulTurf.class));
        cards.add(new SetCardInfo("Halimar Depths", 280, Rarity.COMMON, mage.cards.h.HalimarDepths.class));
        cards.add(new SetCardInfo("Harmonize", 173, Rarity.UNCOMMON, mage.cards.h.Harmonize.class));
        cards.add(new SetCardInfo("Harrow", 174, Rarity.COMMON, mage.cards.h.Harrow.class));
        cards.add(new SetCardInfo("Heirloom Blade", 242, Rarity.UNCOMMON, mage.cards.h.HeirloomBlade.class));
        cards.add(new SetCardInfo("Herald of the Forgotten", 27, Rarity.RARE, mage.cards.h.HeraldOfTheForgotten.class));
        cards.add(new SetCardInfo("Heroes' Bane", 175, Rarity.UNCOMMON, mage.cards.h.HeroesBane.class));
        cards.add(new SetCardInfo("Hieroglyphic Illumination", 112, Rarity.COMMON, mage.cards.h.HieroglyphicIllumination.class));
        cards.add(new SetCardInfo("Hoofprints of the Stag", 90, Rarity.RARE, mage.cards.h.HoofprintsOfTheStag.class));
        cards.add(new SetCardInfo("Hornet Queen", 176, Rarity.RARE, mage.cards.h.HornetQueen.class));
        cards.add(new SetCardInfo("Hostile Desert", 281, Rarity.RARE, mage.cards.h.HostileDesert.class));
        cards.add(new SetCardInfo("Humble Defector", 154, Rarity.UNCOMMON, mage.cards.h.HumbleDefector.class));
        cards.add(new SetCardInfo("Hungering Hydra", 177, Rarity.RARE, mage.cards.h.HungeringHydra.class));
        cards.add(new SetCardInfo("Hunter's Insight", 178, Rarity.UNCOMMON, mage.cards.h.HuntersInsight.class));
        cards.add(new SetCardInfo("Hunting Pack", 179, Rarity.UNCOMMON, mage.cards.h.HuntingPack.class));
        cards.add(new SetCardInfo("Illusory Ambusher", 113, Rarity.UNCOMMON, mage.cards.i.IllusoryAmbusher.class));
        cards.add(new SetCardInfo("Increasing Devotion", 91, Rarity.RARE, mage.cards.i.IncreasingDevotion.class));
        cards.add(new SetCardInfo("Irrigated Farmland", 282, Rarity.RARE, mage.cards.i.IrrigatedFarmland.class));
        cards.add(new SetCardInfo("Isperia, Supreme Judge", 217, Rarity.MYTHIC, mage.cards.i.IsperiaSupremeJudge.class));
        cards.add(new SetCardInfo("Izzet Boilerworks", 283, Rarity.UNCOMMON, mage.cards.i.IzzetBoilerworks.class));
        cards.add(new SetCardInfo("Izzet Signet", 243, Rarity.UNCOMMON, mage.cards.i.IzzetSignet.class));
        cards.add(new SetCardInfo("Jace, Architect of Thought", 114, Rarity.MYTHIC, mage.cards.j.JaceArchitectOfThought.class));
        cards.add(new SetCardInfo("Jirina Kudro", 8, Rarity.MYTHIC, mage.cards.j.JirinaKudro.class));
        cards.add(new SetCardInfo("Kalemne's Captain", 92, Rarity.RARE, mage.cards.k.KalemnesCaptain.class));
        cards.add(new SetCardInfo("Karametra, God of Harvests", 218, Rarity.MYTHIC, mage.cards.k.KarametraGodOfHarvests.class));
        cards.add(new SetCardInfo("Kathril, Aspect Warper", 10, Rarity.MYTHIC, mage.cards.k.KathrilAspectWarper.class));
        cards.add(new SetCardInfo("Kessig Wolf Run", 284, Rarity.RARE, mage.cards.k.KessigWolfRun.class));
        cards.add(new SetCardInfo("Knight of the White Orchid", 93, Rarity.RARE, mage.cards.k.KnightOfTheWhiteOrchid.class));
        cards.add(new SetCardInfo("Kodama's Reach", 180, Rarity.COMMON, mage.cards.k.KodamasReach.class));
        cards.add(new SetCardInfo("Krosan Grip", 181, Rarity.UNCOMMON, mage.cards.k.KrosanGrip.class));
        cards.add(new SetCardInfo("Krosan Verge", 285, Rarity.UNCOMMON, mage.cards.k.KrosanVerge.class));
        cards.add(new SetCardInfo("Lifecrafter's Bestiary", 244, Rarity.RARE, mage.cards.l.LifecraftersBestiary.class));
        cards.add(new SetCardInfo("Lightning Greaves", 245, Rarity.UNCOMMON, mage.cards.l.LightningGreaves.class));
        cards.add(new SetCardInfo("Lightning Rift", 155, Rarity.UNCOMMON, mage.cards.l.LightningRift.class));
        cards.add(new SetCardInfo("Llanowar Wastes", 286, Rarity.RARE, mage.cards.l.LlanowarWastes.class));
        cards.add(new SetCardInfo("Lonely Sandbar", 287, Rarity.UNCOMMON, mage.cards.l.LonelySandbar.class));
        cards.add(new SetCardInfo("Lunar Mystic", 115, Rarity.RARE, mage.cards.l.LunarMystic.class));
        cards.add(new SetCardInfo("Magus of the Disk", 94, Rarity.RARE, mage.cards.m.MagusOfTheDisk.class));
        cards.add(new SetCardInfo("Magus of the Wheel", 156, Rarity.RARE, mage.cards.m.MagusOfTheWheel.class));
        cards.add(new SetCardInfo("Majestic Myriarch", 182, Rarity.MYTHIC, mage.cards.m.MajesticMyriarch.class));
        cards.add(new SetCardInfo("Masked Admirers", 183, Rarity.RARE, mage.cards.m.MaskedAdmirers.class));
        cards.add(new SetCardInfo("Melek, Izzet Paragon", 220, Rarity.RARE, mage.cards.m.MelekIzzetParagon.class));
        cards.add(new SetCardInfo("Memorial to Folly", 288, Rarity.UNCOMMON, mage.cards.m.MemorialToFolly.class));
        cards.add(new SetCardInfo("Mercurial Chemister", 221, Rarity.RARE, mage.cards.m.MercurialChemister.class));
        cards.add(new SetCardInfo("Migratory Route", 222, Rarity.UNCOMMON, mage.cards.m.MigratoryRoute.class));
        cards.add(new SetCardInfo("Mimic Vat", 246, Rarity.RARE, mage.cards.m.MimicVat.class));
        cards.add(new SetCardInfo("Mind Spring", 116, Rarity.RARE, mage.cards.m.MindSpring.class));
        cards.add(new SetCardInfo("Mortuary Mire", 289, Rarity.COMMON, mage.cards.m.MortuaryMire.class));
        cards.add(new SetCardInfo("Mossfire Valley", 290, Rarity.RARE, mage.cards.m.MossfireValley.class));
        cards.add(new SetCardInfo("Mosswort Bridge", 291, Rarity.RARE, mage.cards.m.MosswortBridge.class));
        cards.add(new SetCardInfo("Mulldrifter", 117, Rarity.UNCOMMON, mage.cards.m.Mulldrifter.class));
        cards.add(new SetCardInfo("Murmuring Mystic", 118, Rarity.UNCOMMON, mage.cards.m.MurmuringMystic.class));
        cards.add(new SetCardInfo("Myriad Landscape", 292, Rarity.UNCOMMON, mage.cards.m.MyriadLandscape.class));
        cards.add(new SetCardInfo("Mystic Monastery", 293, Rarity.UNCOMMON, mage.cards.m.MysticMonastery.class));
        cards.add(new SetCardInfo("Nahiri, the Harbinger", 223, Rarity.MYTHIC, mage.cards.n.NahiriTheHarbinger.class));
        cards.add(new SetCardInfo("Natural Connection", 184, Rarity.COMMON, mage.cards.n.NaturalConnection.class));
        cards.add(new SetCardInfo("Netherborn Altar", 45, Rarity.RARE, mage.cards.n.NetherbornAltar.class));
        cards.add(new SetCardInfo("New Perspectives", 119, Rarity.RARE, mage.cards.n.NewPerspectives.class));
        cards.add(new SetCardInfo("Niblis of Frost", 120, Rarity.RARE, mage.cards.n.NiblisOfFrost.class));
        cards.add(new SetCardInfo("Nikara, Lair Scavenger", 3, Rarity.MYTHIC, mage.cards.n.NikaraLairScavenger.class));
        cards.add(new SetCardInfo("Nimble Obstructionist", 121, Rarity.RARE, mage.cards.n.NimbleObstructionist.class));
        cards.add(new SetCardInfo("Nissa, Steward of Elements", 224, Rarity.MYTHIC, mage.cards.n.NissaStewardOfElements.class));
        cards.add(new SetCardInfo("Niv-Mizzet, the Firemind", 225, Rarity.RARE, mage.cards.n.NivMizzetTheFiremind.class));
        cards.add(new SetCardInfo("Nomad Outpost", 294, Rarity.UNCOMMON, mage.cards.n.NomadOutpost.class));
        cards.add(new SetCardInfo("Nyx Weaver", 226, Rarity.UNCOMMON, mage.cards.n.NyxWeaver.class));
        cards.add(new SetCardInfo("Obscuring Haze", 61, Rarity.RARE, mage.cards.o.ObscuringHaze.class));
        cards.add(new SetCardInfo("Odric, Lunarch Marshal", 95, Rarity.RARE, mage.cards.o.OdricLunarchMarshal.class));
        cards.add(new SetCardInfo("Odric, Master Tactician", 96, Rarity.RARE, mage.cards.o.OdricMasterTactician.class));
        cards.add(new SetCardInfo("Opulent Palace", 295, Rarity.UNCOMMON, mage.cards.o.OpulentPalace.class));
        cards.add(new SetCardInfo("Oran-Rief, the Vastwood", 296, Rarity.RARE, mage.cards.o.OranRiefTheVastwood.class));
        cards.add(new SetCardInfo("Orzhov Basilica", 297, Rarity.COMMON, mage.cards.o.OrzhovBasilica.class));
        cards.add(new SetCardInfo("Orzhov Signet", 247, Rarity.UNCOMMON, mage.cards.o.OrzhovSignet.class));
        cards.add(new SetCardInfo("Otrimi, the Ever-Playful", 12, Rarity.MYTHIC, mage.cards.o.OtrimiTheEverPlayful.class));
        cards.add(new SetCardInfo("Outpost Siege", 157, Rarity.RARE, mage.cards.o.OutpostSiege.class));
        cards.add(new SetCardInfo("Painful Truths", 134, Rarity.RARE, mage.cards.p.PainfulTruths.class));
        cards.add(new SetCardInfo("Path of Ancestry", 298, Rarity.COMMON, mage.cards.p.PathOfAncestry.class));
        cards.add(new SetCardInfo("Portal Mage", 122, Rarity.RARE, mage.cards.p.PortalMage.class));
        cards.add(new SetCardInfo("Prairie Stream", 299, Rarity.RARE, mage.cards.p.PrairieStream.class));
        cards.add(new SetCardInfo("Predator Ooze", 185, Rarity.RARE, mage.cards.p.PredatorOoze.class));
        cards.add(new SetCardInfo("Profane Command", 135, Rarity.RARE, mage.cards.p.ProfaneCommand.class));
        cards.add(new SetCardInfo("Propaganda", 123, Rarity.UNCOMMON, mage.cards.p.Propaganda.class));
        cards.add(new SetCardInfo("Prophetic Bolt", 227, Rarity.RARE, mage.cards.p.PropheticBolt.class));
        cards.add(new SetCardInfo("Psychic Impetus", 37, Rarity.UNCOMMON, mage.cards.p.PsychicImpetus.class));
        cards.add(new SetCardInfo("Psychosis Crawler", 248, Rarity.RARE, mage.cards.p.PsychosisCrawler.class));
        cards.add(new SetCardInfo("Putrefy", 228, Rarity.UNCOMMON, mage.cards.p.Putrefy.class));
        cards.add(new SetCardInfo("Rakdos Carnarium", 300, Rarity.COMMON, mage.cards.r.RakdosCarnarium.class));
        cards.add(new SetCardInfo("Rakdos Signet", 249, Rarity.UNCOMMON, mage.cards.r.RakdosSignet.class));
        cards.add(new SetCardInfo("Rashmi, Eternities Crafter", 229, Rarity.RARE, mage.cards.r.RashmiEternitiesCrafter.class));
        cards.add(new SetCardInfo("Reclamation Sage", 186, Rarity.UNCOMMON, mage.cards.r.ReclamationSage.class));
        cards.add(new SetCardInfo("Reliquary Tower", 301, Rarity.UNCOMMON, mage.cards.r.ReliquaryTower.class));
        cards.add(new SetCardInfo("Remote Isle", 302, Rarity.COMMON, mage.cards.r.RemoteIsle.class));
        cards.add(new SetCardInfo("Reveillark", 97, Rarity.RARE, mage.cards.r.Reveillark.class));
        cards.add(new SetCardInfo("Riders of Gavony", 98, Rarity.RARE, mage.cards.r.RidersOfGavony.class));
        cards.add(new SetCardInfo("Rogue's Passage", 303, Rarity.UNCOMMON, mage.cards.r.RoguesPassage.class));
        cards.add(new SetCardInfo("Rupture Spire", 304, Rarity.COMMON, mage.cards.r.RuptureSpire.class));
        cards.add(new SetCardInfo("Sakura-Tribe Elder", 187, Rarity.COMMON, mage.cards.s.SakuraTribeElder.class));
        cards.add(new SetCardInfo("Sandsteppe Citadel", 305, Rarity.UNCOMMON, mage.cards.s.SandsteppeCitadel.class));
        cards.add(new SetCardInfo("Satyr Wayfinder", 188, Rarity.COMMON, mage.cards.s.SatyrWayfinder.class));
        cards.add(new SetCardInfo("Scavenger Grounds", 306, Rarity.RARE, mage.cards.s.ScavengerGrounds.class));
        cards.add(new SetCardInfo("Secluded Steppe", 307, Rarity.UNCOMMON, mage.cards.s.SecludedSteppe.class));
        cards.add(new SetCardInfo("Selesnya Sanctuary", 308, Rarity.COMMON, mage.cards.s.SelesnyaSanctuary.class));
        cards.add(new SetCardInfo("Shabraz, the Skyshark", 14, Rarity.MYTHIC, mage.cards.s.ShabrazTheSkyshark.class));
        cards.add(new SetCardInfo("Shadowblood Ridge", 309, Rarity.RARE, mage.cards.s.ShadowbloodRidge.class));
        cards.add(new SetCardInfo("Shared Animosity", 158, Rarity.RARE, mage.cards.s.SharedAnimosity.class));
        cards.add(new SetCardInfo("Shiny Impetus", 55, Rarity.UNCOMMON, mage.cards.s.ShinyImpetus.class));
        cards.add(new SetCardInfo("Shivan Reef", 310, Rarity.RARE, mage.cards.s.ShivanReef.class));
        cards.add(new SetCardInfo("Shriekmaw", 136, Rarity.UNCOMMON, mage.cards.s.Shriekmaw.class));
        cards.add(new SetCardInfo("Silent Arbiter", 250, Rarity.RARE, mage.cards.s.SilentArbiter.class));
        cards.add(new SetCardInfo("Silvar, Devourer of the Free", 15, Rarity.MYTHIC, mage.cards.s.SilvarDevourerOfTheFree.class));
        cards.add(new SetCardInfo("Simic Growth Chamber", 311, Rarity.UNCOMMON, mage.cards.s.SimicGrowthChamber.class));
        cards.add(new SetCardInfo("Skullclamp", 251, Rarity.UNCOMMON, mage.cards.s.Skullclamp.class));
        cards.add(new SetCardInfo("Skullwinder", 189, Rarity.UNCOMMON, mage.cards.s.Skullwinder.class));
        cards.add(new SetCardInfo("Skycloud Expanse", 312, Rarity.RARE, mage.cards.s.SkycloudExpanse.class));
        cards.add(new SetCardInfo("Slice and Dice", 159, Rarity.UNCOMMON, mage.cards.s.SliceAndDice.class));
        cards.add(new SetCardInfo("Slice in Twain", 190, Rarity.UNCOMMON, mage.cards.s.SliceInTwain.class));
        cards.add(new SetCardInfo("Smoldering Crater", 313, Rarity.COMMON, mage.cards.s.SmolderingCrater.class));
        cards.add(new SetCardInfo("Smoldering Marsh", 314, Rarity.RARE, mage.cards.s.SmolderingMarsh.class));
        cards.add(new SetCardInfo("Soaring Seacliff", 315, Rarity.COMMON, mage.cards.s.SoaringSeacliff.class));
        cards.add(new SetCardInfo("Sol Ring", 252, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Solemn Recruit", 99, Rarity.RARE, mage.cards.s.SolemnRecruit.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 253, Rarity.RARE, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Soul of Innistrad", 137, Rarity.MYTHIC, mage.cards.s.SoulOfInnistrad.class));
        cards.add(new SetCardInfo("Soulflayer", 138, Rarity.RARE, mage.cards.s.Soulflayer.class));
        cards.add(new SetCardInfo("Souvenir Snatcher", 38, Rarity.RARE, mage.cards.s.SouvenirSnatcher.class));
        cards.add(new SetCardInfo("Spinerock Knoll", 316, Rarity.RARE, mage.cards.s.SpinerockKnoll.class));
        cards.add(new SetCardInfo("Spirit Cairn", 100, Rarity.UNCOMMON, mage.cards.s.SpiritCairn.class));
        cards.add(new SetCardInfo("Splinterfright", 191, Rarity.RARE, mage.cards.s.Splinterfright.class));
        cards.add(new SetCardInfo("Starstorm", 160, Rarity.RARE, mage.cards.s.Starstorm.class));
        cards.add(new SetCardInfo("Strength of the Tajuru", 192, Rarity.RARE, mage.cards.s.StrengthOfTheTajuru.class));
        cards.add(new SetCardInfo("Sun Titan", 101, Rarity.MYTHIC, mage.cards.s.SunTitan.class));
        cards.add(new SetCardInfo("Sunblast Angel", 102, Rarity.RARE, mage.cards.s.SunblastAngel.class));
        cards.add(new SetCardInfo("Sungrass Prairie", 317, Rarity.RARE, mage.cards.s.SungrassPrairie.class));
        cards.add(new SetCardInfo("Sunken Hollow", 318, Rarity.RARE, mage.cards.s.SunkenHollow.class));
        cards.add(new SetCardInfo("Surreal Memoir", 161, Rarity.UNCOMMON, mage.cards.s.SurrealMemoir.class));
        cards.add(new SetCardInfo("Swarm Intelligence", 124, Rarity.RARE, mage.cards.s.SwarmIntelligence.class));
        cards.add(new SetCardInfo("Swiftfoot Boots", 254, Rarity.UNCOMMON, mage.cards.s.SwiftfootBoots.class));
        cards.add(new SetCardInfo("Talrand, Sky Summoner", 125, Rarity.RARE, mage.cards.t.TalrandSkySummoner.class));
        cards.add(new SetCardInfo("Tectonic Reformation", 162, Rarity.RARE, mage.cards.t.TectonicReformation.class));
        cards.add(new SetCardInfo("Temple of the False God", 319, Rarity.UNCOMMON, mage.cards.t.TempleOfTheFalseGod.class));
        cards.add(new SetCardInfo("Temur Charm", 230, Rarity.UNCOMMON, mage.cards.t.TemurCharm.class));
        cards.add(new SetCardInfo("Terminate", 231, Rarity.UNCOMMON, mage.cards.t.Terminate.class));
        cards.add(new SetCardInfo("Thalia's Lieutenant", 103, Rarity.RARE, mage.cards.t.ThaliasLieutenant.class));
        cards.add(new SetCardInfo("The Locust God", 219, Rarity.MYTHIC, mage.cards.t.TheLocustGod.class));
        cards.add(new SetCardInfo("Thraben Doomsayer", 104, Rarity.RARE, mage.cards.t.ThrabenDoomsayer.class));
        cards.add(new SetCardInfo("Titan of Eternal Fire", 163, Rarity.RARE, mage.cards.t.TitanOfEternalFire.class));
        cards.add(new SetCardInfo("Together Forever", 105, Rarity.RARE, mage.cards.t.TogetherForever.class));
        cards.add(new SetCardInfo("Tribute to the Wild", 193, Rarity.UNCOMMON, mage.cards.t.TributeToTheWild.class));
        cards.add(new SetCardInfo("Trygon Predator", 232, Rarity.UNCOMMON, mage.cards.t.TrygonPredator.class));
        cards.add(new SetCardInfo("Trynn, Champion of Freedom", 1, Rarity.MYTHIC, mage.cards.t.TrynnChampionOfFreedom.class));
        cards.add(new SetCardInfo("Unburial Rites", 139, Rarity.UNCOMMON, mage.cards.u.UnburialRites.class));
        cards.add(new SetCardInfo("Unclaimed Territory", 320, Rarity.UNCOMMON, mage.cards.u.UnclaimedTerritory.class));
        cards.add(new SetCardInfo("Unexpectedly Absent", 106, Rarity.RARE, mage.cards.u.UnexpectedlyAbsent.class));
        cards.add(new SetCardInfo("Vampire Nighthawk", 140, Rarity.UNCOMMON, mage.cards.v.VampireNighthawk.class));
        cards.add(new SetCardInfo("Vastwood Hydra", 194, Rarity.RARE, mage.cards.v.VastwoodHydra.class));
        cards.add(new SetCardInfo("Vigilante Justice", 164, Rarity.UNCOMMON, mage.cards.v.VigilanteJustice.class));
        cards.add(new SetCardInfo("Villainous Wealth", 233, Rarity.RARE, mage.cards.v.VillainousWealth.class));
        cards.add(new SetCardInfo("Vizier of Tumbling Sands", 126, Rarity.UNCOMMON, mage.cards.v.VizierOfTumblingSands.class));
        cards.add(new SetCardInfo("Vorapede", 195, Rarity.MYTHIC, mage.cards.v.Vorapede.class));
        cards.add(new SetCardInfo("Whiplash Trap", 127, Rarity.COMMON, mage.cards.w.WhiplashTrap.class));
        cards.add(new SetCardInfo("Wilderness Reclamation", 196, Rarity.UNCOMMON, mage.cards.w.WildernessReclamation.class));
        cards.add(new SetCardInfo("Windbrisk Heights", 321, Rarity.RARE, mage.cards.w.WindbriskHeights.class));
        cards.add(new SetCardInfo("Windfall", 128, Rarity.UNCOMMON, mage.cards.w.Windfall.class));
        cards.add(new SetCardInfo("Wort, the Raidmother", 234, Rarity.RARE, mage.cards.w.WortTheRaidmother.class));
        cards.add(new SetCardInfo("Wydwen, the Biting Gale", 235, Rarity.RARE, mage.cards.w.WydwenTheBitingGale.class));
        cards.add(new SetCardInfo("Xathrid Necromancer", 141, Rarity.RARE, mage.cards.x.XathridNecromancer.class));
        cards.add(new SetCardInfo("Yavimaya Coast", 322, Rarity.RARE, mage.cards.y.YavimayaCoast.class));
        cards.add(new SetCardInfo("Yavimaya Dryad", 197, Rarity.UNCOMMON, mage.cards.y.YavimayaDryad.class));
        cards.add(new SetCardInfo("Zetalpa, Primal Dawn", 107, Rarity.RARE, mage.cards.z.ZetalpaPrimalDawn.class));
        cards.add(new SetCardInfo("Zulaport Cutthroat", 142, Rarity.UNCOMMON, mage.cards.z.ZulaportCutthroat.class));

        cards.removeIf(setCardInfo -> mutateNames.contains(setCardInfo.getName())); // remove when mutate is implemented
    }
}
