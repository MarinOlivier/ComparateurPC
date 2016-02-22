package data;

import utils.ComparePC;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * The type Computer.
 */
public class Computer {

    /**
     * The Id.
     */
    public String _id;
    /**
     * The Name.
     */
    public String _name;
    /**
     * The Mother board.
     */
    public String _motherBoard;
    /**
     * The Cpu.
     */
    public String _CPU;
    /**
     * The Ram.
     */
    public String _RAM;
    /**
     * The Gpu.
     */
    public String _GPU;
    /**
     * The Rom.
     */
    public String _ROM;
    /**
     * The Power supply.
     */
    public String _powerSupply;
    /**
     * The Price.
     */
    public String _price;
    /**
     * The Ram freq.
     */
    public String _RAM_freq;
    /**
     * The Cpu freq.
     */
    public String _CPU_freq;
    /**
     * The Gpu freq.
     */
    public String _GPU_freq;
    /**
     * The Gpu ram.
     */
    public String _GPU_RAM;
    /**
     * The E s.
     */
    public String _E_S;
    /**
     * The Case pc.
     */
    public String _case_PC;
    /**
     * The Airing.
     */
    public String _airing;
    /**
     * The Os.
     */
    public String _OS;
    /**
     * The Brand.
     */
    public String _brand;
    /**
     * The Sound card.
     */
    public String _soundCard;

    /**
     * The Pict.
     */
    public String _pict;

    /**
     * The Matching.
     */
    public int _matching;

    /**
     * The constant component.
     */
    public static String component[] = {"id", "name", "motherBoard", "CPU", "RAM", "GPU", "ROM", "powerSupply",
            "price", "RAM_freq", "CPU_freq", "GPU_freq", "GPU_RAM", "E_S",
            "case_PC", "airing", "OS", "brand", "soundCard", "pict"};

    /**
     * Instantiates a new Computer.
     */
    public Computer() {

    }

    /**
     * Instantiates a new Computer.
     *
     * @param mapPC the map pc
     */
    public Computer(HashMap<String, String> mapPC) {
    	for (int i = 0; i < component.length; i++) {
    		if (mapPC.containsKey(component[i]))
    			setName(mapPC.get(component[i]));
		}
        _matching = 0;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return _name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this._name = name;
    }

    /**
     * Gets mother board.
     *
     * @return the mother board
     */
    public String getMotherBoard() {
        return _motherBoard;
    }

    /**
     * Sets mother board.
     *
     * @param motherBoard the mother board
     */
    public void setMotherBoard(String motherBoard) {
        _motherBoard = motherBoard;
    }

    /**
     * Gets cpu.
     *
     * @return the cpu
     */
    public String getCPU() {
        return _CPU;
    }

    /**
     * Sets cpu.
     *
     * @param CPU the cpu
     */
    public void setCPU(String CPU) {
        this._CPU = CPU;
    }

    /**
     * Gets ram.
     *
     * @return the ram
     */
    public String getRAM() {
        return _RAM;
    }

    /**
     * Sets ram.
     *
     * @param RAM the ram
     */
    public void setRAM(String RAM) {
        this._RAM = RAM;
    }

    /**
     * Gets gpu.
     *
     * @return the gpu
     */
    public String getGPU() {
        return _GPU;
    }

    /**
     * Sets gpu.
     *
     * @param GPU the gpu
     */
    public void setGPU(String GPU) {
        this._GPU = GPU;
    }

    /**
     * Gets rom.
     *
     * @return the rom
     */
    public String getROM() {
        return _ROM;
    }

    /**
     * Sets rom.
     *
     * @param ROM the rom
     */
    public void setROM(String ROM) {
        this._ROM = ROM;
    }

    /**
     * Gets power supply.
     *
     * @return the power supply
     */
    public String getPowerSupply() {
        return _powerSupply;
    }

    /**
     * Sets power supply.
     *
     * @param powerSupply the power supply
     */
    public void setPowerSupply(String powerSupply) {
        this._powerSupply = powerSupply;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public String getPrice() {
        return _price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(String price) {
        this._price = price;
    }

    /**
     * Gets ram freq.
     *
     * @return the ram freq
     */
    public String getRAM_freq() {
        return _RAM_freq;
    }

    /**
     * Sets ram freq.
     *
     * @param RAM_freq the ram freq
     */
    public void setRAM_freq(String RAM_freq) {
        this._RAM_freq = RAM_freq;
    }

    /**
     * Gets cpu freq.
     *
     * @return the cpu freq
     */
    public String getCPU_freq() {
        return _CPU_freq;
    }

    /**
     * Sets cpu freq.
     *
     * @param CPU_freq the cpu freq
     */
    public void setCPU_freq(String CPU_freq) {
        this._CPU_freq = CPU_freq;
    }

    /**
     * Gets gpu freq.
     *
     * @return the gpu freq
     */
    public String getGPU_freq() {
        return _GPU_freq;
    }

    /**
     * Sets gpu freq.
     *
     * @param GPU_freq the gpu freq
     */
    public void setGPU_freq(String GPU_freq) {
        this._GPU_freq = GPU_freq;
    }

    /**
     * Gets gpu ram.
     *
     * @return the gpu ram
     */
    public String getGPU_RAM() {
        return _GPU_RAM;
    }

    /**
     * Sets gpu ram.
     *
     * @param GPU_RAM the gpu ram
     */
    public void setGPU_RAM(String GPU_RAM) {
        this._GPU_RAM = GPU_RAM;
    }

    /**
     * Gets e s.
     *
     * @return the e s
     */
    public String getE_S() {
        return _E_S;
    }

    /**
     * Sets e s.
     *
     * @param E_S the e s
     */
    public void setE_S(String E_S) {
        this._E_S = E_S;
    }

    /**
     * Gets case pc.
     *
     * @return the case pc
     */
    public String getCase_PC() {
        return _case_PC;
    }

    /**
     * Sets case pc.
     *
     * @param case_PC the case pc
     */
    public void setCase_PC(String case_PC) {
        this._case_PC = case_PC;
    }

    /**
     * Gets airing.
     *
     * @return the airing
     */
    public String getAiring() {
        return _airing;
    }

    /**
     * Sets airing.
     *
     * @param airing the airing
     */
    public void setAiring(String airing) {
        this._airing = airing;
    }

    /**
     * Gets os.
     *
     * @return the os
     */
    public String getOS() {
        return _OS;
    }

    /**
     * Sets os.
     *
     * @param OS the os
     */
    public void setOS(String OS) {
        this._OS = OS;
    }

    /**
     * Gets brand.
     *
     * @return the brand
     */
    public String getBrand() {
        return _brand;
    }

    /**
     * Sets brand.
     *
     * @param brand the brand
     */
    public void setBrand(String brand) {
        this._brand = brand;
    }

    /**
     * Gets sound card.
     *
     * @return the sound card
     */
    public String getSoundCard() {
        return _soundCard;
    }

    /**
     * Sets sound card.
     *
     * @param soundCard the sound card
     */
    public void setSoundCard(String soundCard) {
        this._soundCard = soundCard;
    }

    /**
     * Gets pict.
     *
     * @return the pict
     */
    public String getPict() {
        return _pict;
    }

    /**
     * Sets pict.
     *
     * @param pict the pict
     */
    public void setPict(String pict) {
        this._pict = pict;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return _id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        _id = id;
    }

    /**
     * Gets matching.
     *
     * @return the matching
     */
    public int getMatching() {
        return _matching;
    }

    /**
     * Sets matching.
     *
     * @param matching the matching
     */
    public void setMatching(int matching) {
        _matching = matching;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "_id=" + _id +
                ", _name='" + _name + '\'' +
                ", _motherBoard='" + _motherBoard + '\'' +
                ", _CPU='" + _CPU + '\'' +
                ", _RAM='" + _RAM + '\'' +                      // Done
                ", _GPU='" + _GPU + '\'' +
                ", _ROM='" + _ROM + '\'' +                      // Done
                ", _powerSupply='" + _powerSupply + '\'' +      // Done
                ", _price='" + _price + '\'' +                  // Done
                ", _RAM_freq='" + _RAM_freq + '\'' +            // Done
                ", _CPU_freq='" + _CPU_freq + '\'' +            // Done
                ", _GPU_freq='" + _GPU_freq + '\'' +
                ", _GPU_RAM='" + _GPU_RAM + '\'' +              // Done
                ", _E_S='" + _E_S + '\'' +
                ", _case_PC='" + _case_PC + '\'' +
                ", _airing='" + _airing + '\'' +
                ", _OS='" + _OS + '\'' +
                ", _brand='" + _brand + '\'' +
                ", _soundCard='" + _soundCard + '\'' +
                ", _pict='" + _pict + '\'' +
                '}';
    }

    /**
     * Comparison int.
     *
     * @param o the o
     * @return the int
     */
    public int comparison(Computer o) {
        double distance = 0;
        int matching = 0;
        ComparePC comparePC = new ComparePC(this);
        for (int i = 0; i < component.length; i++) {
            if (!component[i].equals("id") && !component[i].equals("name") && !component[i].equals("pict") && !component[i].equals("brand")) {
                try {
                    Field field = this.getClass().getDeclaredField("_" + component[i]);
                    if (field.get(this) != null && field.get(o) != null) {
                        if (field.getName().equals("_motherBoard") || field.getName().equals("_CPU") || field.getName().equals("_GPU") || field.getName().equals("_RAM") ||
                                field.getName().equals("_ROM") || field.getName().equals("_OS") || field.getName().equals("_powerSupply")) {
                            // meth => compareXXX(o);
                            Method meth = comparePC.getClass().getDeclaredMethod("compare" + field.getName().substring(1, field.getName().length()), Computer.class);
                            distance = distance + Double.valueOf(meth.invoke(comparePC, o).toString()); // Bizarre mais pas trouvé d'autre moyen
                        }
                    }
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }

        /* Tri par ordre de prix */
        double price = extractPriceValue(this);
        if (price <= 6000.) {
            matching = matching(distance);
            setMatching(matching);
        }

        return matching;
    }

    /**
     *
     * @param comp
     * @return
     */
    private static double extractPriceValue(Computer comp) {
        String tmp = comp.getPrice().replace("€", ".");
        tmp = tmp.replaceAll("\\s+", "");
        return Double.valueOf(tmp.trim());
    }

    private int matching(Double distance) {
        int maxScale = 400;
        int matching;

        if(distance > maxScale)
            matching = 0;
        else {
            double alpha = -(100.0 / maxScale)*distance;
            alpha = alpha + 100.0;
            matching = (int)alpha;
        }
        return matching;
    }

}
