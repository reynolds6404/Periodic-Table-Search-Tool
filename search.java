public class search {
    //Lists of Searchable Properties
    protected static String[] name = {"Hydrogen", "Helium","Lithium","Beryllium","Boron","Carbon","Nitrogen","Oxygen","Fluorine","Neon",
            "Sodium", "Magnesium","Aluminum","Silicon","Phosphorus","Sulfur","Chlorine","Argon","Potassium","Calcium",
            "Scandium", "Titanium", "Vanadium","Chromium","Manganese","Iron","Cobalt","Nickel","Copper", "Zinc",
            "Gallium", "Germanium","Arsenic","Selenium","Bromine","Krypton","Rubidium","Strontium","Yttrium","Zirconium",
            "Niobium","Molydbenum","Technetium","Ruthenium","Rhodium","Palladium","Silver","Cadmium","Indium","Tin",
            "Antimony","Tellurium","Iodine","Xenon","Caesium","Barium","Lanthanum","Cerium","Praseodymium","Neodymium",
            "Promethium","Samarium","Europium","Gadolinium","Terbium","Dysprosium","Holmium","Erbium","Thulium","Ytterbium",
            "Lutetium","Hafnium","Tantalum","Tungsten","Rhenium","Osmium","Iridium","Platinum","Gold","Mercury",
            "Thallium", "Lead","Bismuth","polonium","Astatine","Radon","Francium","Radium","Actinium","Thorium",
            "Protactinium","Uranium","Neptunium","Plutonium","Americium","Curium","Berkelium","Californium","Einsteinium","Fermium",
            "Mendelevium","Nobelium","Lawrencium","Rutherfordium","Dubnium","Seaborgium","Bohrium","Hassium","Meitnerium","Darmstadtium",
            "Roentgenium","Copernicium","Nihonium","Flerovium","Moscovium","Livermorium","Tennessine","Oganesson"};

    protected static String[] abbreviation = {"H","He","Li","Be","B","C","N","O","F","Ne","Na","Mg","Al","Si","P","S","Cl","Ar","K","Ca",
            "Sc","Ti","V","Cr","Mn","Fe","Co","Ni","Cu","Zn","Ga","Ge","As","Se","Br","Kr","Rb","Sr","Y","Zr",
            "Nb","Mo","Tc","Ru","Rh","Pd","Ag","Cd","In","Sn","Sb","Te","I","Xe","Cs","Ba","La","Ce","Pr","Nd",
            "Pm","Sm","Eu","Gd","Tb","Dy","Ho","Er","Tm","Yb","Lu","Hf","Ta","W","Re","Os","Ir","Pt","Au","Hg",
            "Tl","Pb","Bi","Po","At","Rn","Fr","Ra","Ac","Th","Pa","U","Np","Pu","Am","Cm","Bk","Cf","Es","Fm",
            "Md","No","Lr","Rf","Db","Sg","Bh","Hs","Mt","Ds","Rg","Cn","Nh","Fl","Mc","Lv","Ts","Og"};

    protected static int[] number = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
            41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,
            81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,
            116,117,118};

    //Lists of Non-searchable Properties
    protected static String[] phases = {"Gas","Gas","Solid","Solid","Solid","Solid","Gas","Gas","Gas","Gas","Solid","Solid","Solid","Solid","Solid","Solid",
            "Gas","Gas","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Liquid","Gas",
            "Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Gas",
            "Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid",
            "Solid","Solid","Solid","Solid","Solid","Liquid","Solid","Solid","Solid","Solid","Solid","Gas","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid",
            "Solid","Solid","Solid","Solid","Solid","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown",
            "Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown"};

    protected static double[] mass = {1.008,4.002602,6.94,9.0121831,10.81,12.011,14.007,15.999,18.998403163,20.1797,22.98976928,24.305,26.9815384,28.085,30.973761998,
            32.06,35.45,39.948,39.0983,40.078,44.955908,47.867,50.9415,51.9961,54.938043,55.845,58.933194,58.6934,63.546,65.38,69.723,72.630,74.921595,78.971,79.904,83.798,85.4678,
            87.62,88.90584,91.224,92.90637,95.95,98,101.07,102.90549,106.42,107.8682,112.414,114.818,118.710,121.760,127.60,126.90447,131.293,132.90545196,137.327,
            138.90547,140.116,140.90766,144.242,145,150.36,151.964,157.25,158.925354,162.500,164.930328,167.259,168.934218,173.045,174.9668,178.49,180.94788,183.84,186.207,
            190.23,192.217,195.084,196.966570,200.592,204.38,207.2,208.98040,209,210,222,223,226,227,232.0377,231.03588,238.02891,237,244,243,247,247,251,252,257,258,259,
            266,267,268,269,270,270,278,281,282,285,286,289,290,293,294,294};

    //Sequential search algorithms
    public static int namesearch(String look){
       int foundat = -1;
       for (int i = 0; i < name.length; i++){
           if (name[i].toLowerCase().equals(look)){
               foundat = i;
           }
       }
       return foundat;
    }

    public static int abbrevsearch(String look){
        int foundat = -1;
        for (int i = 0; i < abbreviation.length; i++){
            if (abbreviation[i].toLowerCase().equals(look)){
                foundat = i;
            }
        }
        return foundat;
    }

    public static int numsearch(int look) {
        int foundat = -1;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == look) {
                foundat = i;
            }
        }
        return foundat;
    }

}

