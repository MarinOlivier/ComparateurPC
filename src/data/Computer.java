package data;

import utils.ComparePC;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.HashMap;

public class Computer implements Comparable<Computer>, Comparator<Computer> {
    public String _id;
    public String _name;
    public String _motherBoard;
    public String _CPU;
    public String _RAM;
    public String _GPU;
    public String _ROM;
    public String _powerSupply;
    public String _price;
    public String _RAM_freq;
    public String _CPU_freq;
    public String _GPU_freq;
    public String _GPU_RAM;
    public String _E_S;
    public String _case_PC;
    public String _airing;
    public String _OS;
    public String _brand;
    public String _soundCard;

    public String _pict;

    public int _matching;
    
    public static String component[] = {"id", "name", "motherBoard", "CPU", "RAM", "GPU", "ROM", "powerSupply",
            "price", "RAM_freq", "CPU_freq", "GPU_freq", "GPU_RAM", "E_S",
            "case_PC", "airing", "OS", "brand", "soundCard", "pict"};

    public Computer() {

    }

    public Computer(HashMap<String, String> mapPC) {
    	for (int i = 0; i < component.length; i++) {
    		if (mapPC.containsKey(component[i]))
    			setName(mapPC.get(component[i]));
		}
        _matching = 0;
    }
    
    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getMotherBoard() {
        return _motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        _motherBoard = motherBoard;
    }

    public String getCPU() {
        return _CPU;
    }

    public void setCPU(String CPU) {
        this._CPU = CPU;
    }

    public String getRAM() {
        return _RAM;
    }

    public void setRAM(String RAM) {
        this._RAM = RAM;
    }

    public String getGPU() {
        return _GPU;
    }

    public void setGPU(String GPU) {
        this._GPU = GPU;
    }

    public String getROM() {
        return _ROM;
    }

    public void setROM(String ROM) {
        this._ROM = ROM;
    }

    public String getPowerSupply() {
        return _powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this._powerSupply = powerSupply;
    }

    public String getPrice() {
        return _price;
    }

    public void setPrice(String price) {
        this._price = price;
    }

    public String getRAM_freq() {
        return _RAM_freq;
    }

    public void setRAM_freq(String RAM_freq) {
        this._RAM_freq = RAM_freq;
    }

    public String getCPU_freq() {
        return _CPU_freq;
    }

    public void setCPU_freq(String CPU_freq) {
        this._CPU_freq = CPU_freq;
    }

    public String getGPU_freq() {
        return _GPU_freq;
    }

    public void setGPU_freq(String GPU_freq) {
        this._GPU_freq = GPU_freq;
    }

    public String getGPU_RAM() {
        return _GPU_RAM;
    }

    public void setGPU_RAM(String GPU_RAM) {
        this._GPU_RAM = GPU_RAM;
    }

    public String getE_S() {
        return _E_S;
    }

    public void setE_S(String E_S) {
        this._E_S = E_S;
    }

    public String getCase_PC() {
        return _case_PC;
    }

    public void setCase_PC(String case_PC) {
        this._case_PC = case_PC;
    }

    public String getAiring() {
        return _airing;
    }

    public void setAiring(String airing) {
        this._airing = airing;
    }

    public String getOS() {
        return _OS;
    }

    public void setOS(String OS) {
        this._OS = OS;
    }

    public String getBrand() {
        return _brand;
    }

    public void setBrand(String brand) {
        this._brand = brand;
    }

    public String getSoundCard() {
        return _soundCard;
    }

    public void setSoundCard(String soundCard) {
        this._soundCard = soundCard;
    }

    public String getPict() {
        return _pict;
    }

    public void setPict(String pict) {
        this._pict = pict;
    }

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        _id = id;
    }

    public int getMatching() {
        return _matching;
    }

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

    @Override
    public int compareTo(Computer o) {
        double distance = 0;
        int matching = 0;
        ComparePC comparePC = new ComparePC(this);
        for (int i = 0; i < component.length; i++) {
            if (!component[i].equals("id") && !component[i].equals("name") && !component[i].equals("pict") && !component[i].equals("brand")) {
                try {
                    Field field = this.getClass().getDeclaredField("_" + component[i]);
                    if (field.get(this) != null && field.get(o) != null) {
                        // Cond à enlever après les tests, juste pour controler sur que ce fait la reflexion le temps de tout coder
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

    @Override
    public int compare(Computer c1, Computer c2) {
        return c1.compareTo(c2);
    }
}
