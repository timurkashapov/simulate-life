package ucf;

/**
 * UCF CODER
 * Unit conversion format
 * FORMAT XXXX XXXX XXXX XXXX
 *
 * XXXX = {
 * 0000; 0001; 0010; 0011;
 * 0100; 0101; 0110; 0111;
 * 1000; 1001; 1010; 1011;
 * 1100; 1101; 1110; 1111;
 * }
 * Created by shako on 6/3/2017.
 */
public class UcfCoder {


    // LANDSCAPE'S AREAS
    public static final int LANDSCAPE_NULL = 0x0;

    public static final int LANDSCAPE_WATER_LOW = 0x1;
    public static final int LANDSCAPE_WATER_HIGH = 0x2;

    public static final int LANDSCAPE_GROUND_LOW = 0x3;
    public static final int LANDSCAPE_GROUND_HIGH = 0x4;

    public static final int LANDSCAPE_DESERT_LOW = 0x5;
    public static final int LANDSCAPE_DESERT_HIGH = 0x6;

    public static final int LANDSCAPE_SNOW_LOW = 0x7;
    public static final int LANDSCAPE_SNOW_HIGH = 0x8;

    public static final int LANDSCAPE_TREE_LOW = 0x9;
    public static final int LANDSCAPE_TREE_HIGH = 0xA;

    public static final int LANDSCAPE_MOUNTAIN_LOW = 0xB;
    public static final int LANDSCAPE_MOUNTAIN_HIGH = 0xC;

    public static final int LANDSCAPE_SWAMP_LOW = 0xD;
    public static final int LANDSCAPE_SWAMP_HIGH = 0xE;

    public static final int LANDSCAPE_CAVE = 0xF;


    // ANIMAL'S and HUMANS
    public static final int ANIMAL_NULL  = 0x0;

    public static final int ANIMAL_HUMAN = 0x1;
    public static final int ANIMAL_MAMMONTH = 0x2;

    public static final int ANIMAL_WOLF = 0x3;
    public static final int ANIMAL_RABBIT = 0x4;

    public static final int ANIMAL_SHARK = 0x5;
    public static final int ANIMAL_DOLPHIN = 0x6;

    public static final int ANIMAL_DRAGON = 0x7;
    public static final int ANIMAL_FALCON = 0x8;

    public static final int ANIMAL_UNICORN = 0x9;
    public static final int ANIMAL_COW = 0xA;

    public static final int ANIMAL_DOG = 0xB;
    public static final int ANIMAL_CAT = 0xC;

    public static final int ANIMAL_SCORPION = 0xD;
    public static final int ANIMAL_HORSE = 0xE;

    public static final int ANIMAL_BEAR = 0xF;


    //


    public static int decodeLandscape(int ucf) {


        return 0;
    }

}
