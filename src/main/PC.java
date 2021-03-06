package main;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by olivier on 10/01/2016.
 */
public class PC {
    private String _motherBoard;
    private String _CPU;
    private String _RAM;
    private String _GPU;
    private String _ROM;
    private String _powerSupply;
    private String _price;
    private String _RAM_freq;
    private String _CPU_freq;
    private String _GPU_freq;
    private String _GPU_RAM;
    private String _E_S;
    private String _case_PC;
    private String _airing;
    private String _OS;
    private String _brand;
    private String _soundCard;


    public PC(){

    }

    public PC(Map<String, String> mapPC) {
    	String component[] = {"name", "motherBoard", "CPU", "RAM", "GPU", "ROM", "PowerSupply", 
				"price", "RAM_freq", "CPU_freq", "GPU_freq", "GPU_RAM", "E_S", 
				"case_pc", "airing", "OS", "brand", "soundCard"};
    	
    	for (int i = 0; i < mapPC.size(); i++) {
	    	if (mapPC.containsKey(component[i]))
	    		setMotherBoard(mapPC.get(component[i]));
    	}
    }

    public String getMotherBoard() {
        return _motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this._motherBoard = motherBoard;
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
}
