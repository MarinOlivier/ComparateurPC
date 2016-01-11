package data;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by olivier on 10/01/2016.
 */
public class Computer {
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


    public Computer(){

    }

    public Computer(Map<String, String> mapPC){
        if(mapPC.containsKey("name"))
            setName(mapPC.get("name"));
        if(mapPC.containsKey("motherBoard"))
            setMotherBoard(mapPC.get("motherBoard"));
        if(mapPC.containsKey("CPU"))
            setCPU(mapPC.get("CPU"));
        if(mapPC.containsKey("RAM"))
            setRAM(mapPC.get("RAM"));
        if(mapPC.containsKey("GPU"))
            setGPU(mapPC.get("GPU"));
        if(mapPC.containsKey("ROM"))
            setROM(mapPC.get("ROM"));
        if(mapPC.containsKey("powerSupply"))
            setPowerSupply(mapPC.get("powerSupply"));
        if(mapPC.containsKey("price"))
            setPrice(mapPC.get("price"));
        if(mapPC.containsKey("RAM_freq"))
            setRAM_freq(mapPC.get("RAM_freq"));
        if(mapPC.containsKey("CPU_freq"))
            setCPU_freq(mapPC.get("CPU_freq"));
        if(mapPC.containsKey("GPU_freq"))
            setGPU_freq(mapPC.get("GPU_freq"));
        if(mapPC.containsKey("E_S"))
            setE_S(mapPC.get("E_S"));
        if(mapPC.containsKey("case_PC"))
            setCase_PC(mapPC.get("case_PC"));
        if(mapPC.containsKey("airing"))
            setAiring(mapPC.get("airing"));
        if(mapPC.containsKey("OS"))
            setOS(mapPC.get("OS"));
        if(mapPC.containsKey("brand"))
            setBrand(mapPC.get("brand"));
        if(mapPC.containsKey("soundCard"))
            setSoundCard(mapPC.get("soundCard"));
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

    @Override
    public String toString() {
        return "Computer{" +
                "_name='" + _name + '\'' +
                ", _motherBoard='" + _motherBoard + '\'' +
                ", _CPU='" + _CPU + '\'' +
                ", _RAM='" + _RAM + '\'' +
                ", _GPU='" + _GPU + '\'' +
                ", _ROM='" + _ROM + '\'' +
                ", _powerSupply='" + _powerSupply + '\'' +
                ", _price='" + _price + '\'' +
                ", _RAM_freq='" + _RAM_freq + '\'' +
                ", _CPU_freq='" + _CPU_freq + '\'' +
                ", _GPU_freq='" + _GPU_freq + '\'' +
                ", _GPU_RAM='" + _GPU_RAM + '\'' +
                ", _E_S='" + _E_S + '\'' +
                ", _case_PC='" + _case_PC + '\'' +
                ", _airing='" + _airing + '\'' +
                ", _OS='" + _OS + '\'' +
                ", _brand='" + _brand + '\'' +
                ", _soundCard='" + _soundCard + '\'' +
                '}';
    }
}
