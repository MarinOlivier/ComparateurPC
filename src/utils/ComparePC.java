package utils;

import data.Computer;

import java.util.*;

/**
 * Created by olivier on 10/01/2016.
 */
public class ComparePC {

    private Computer _wished;
    private HashMap<String, Integer> _priority;

    public ComparePC(Computer wished) {
        _wished = wished;
        _priority = new HashMap<>();
        setPriority();
    }

    private void setPriority() {
        _priority.put("motherBoard", 1);
        _priority.put("CPU", 1);
        _priority.put("RAM", 1);
        _priority.put("GPU", 2);
        _priority.put("ROM", 2);
        _priority.put("powerSupply", 3);
        _priority.put("price", 1);
        _priority.put("RAM_freq", 2);
        _priority.put("CPU_freq", 2);
        _priority.put("GPU_freq", 2);
        _priority.put("GPU_RAM", 2);
        _priority.put("E_S", 2);
        _priority.put("case_PC", 2);
        _priority.put("airing", 3);
        _priority.put("OS", 1);
        _priority.put("brand", 2);
        _priority.put("soundCard", 3);

    }

    public double compareCPU_freq(Computer o) {
        double priority = 1*_priority.get("CPU_freq");
        double current = extractCPU_freqValue(o);
        double wished = extractCPU_freqValue(_wished);

        return Math.abs(wished - current)*priority;
    }

    public double compareRAM(Computer o) {
        double priority = 1*_priority.get("RAM");
        double current = extractRAMValue(o);
        double wished = extractRAMValue(_wished);

        if(current > wished)
            return 0;
        else
            return (wished - current)*priority;
    }

    public double compareROM(Computer o) {
        double priority = 0.01*_priority.get("ROM");
        double current = extractROMValue(o);
        double wished = extractROMValue(_wished);

        return Math.abs(wished - current)*priority;
    }

    public double comparepowerSupply(Computer o) {
        double priority = 0.1*_priority.get("powerSupply");
        double current = extractPowerSupplyValue(o);
        double wished = extractPowerSupplyValue(_wished);

        if(current > wished)
            return 0;
        else
            return (wished - current)*priority;
    }

    public double compareprice(Computer o) {
        double priority = 0.01*_priority.get("price");
        double current = extractPriceValue(o);
        double wished = extractPriceValue(_wished);

        return Math.abs(wished - current)*priority;
    }

    public double compareRAM_freq(Computer o) {
        double priority = 1*_priority.get("RAM_freq");
        double current = extractRAM_freqValue(o);
        double wished = extractRAM_freqValue(_wished);

        return Math.abs(wished - current)*priority;
    }

    public double compareGPU_RAM(Computer o) {
        double priority = 1*_priority.get("GPU_RAM");
        double current = extractGPU_RAM(o);
        double wished = extractGPU_RAM(_wished);

        if(current > wished)
            return 0;
        else
            return (wished - current)*priority;
    }

    private static double extractCPU_freqValue(Computer comp) {
        return Double.valueOf(comp.getCPU_freq().substring(0, comp.getCPU_freq().length()-4));
    }

    private static double extractRAMValue(Computer comp) {
        return Double.valueOf(comp.getRAM().substring(0, comp.getRAM().length()-3));
    }

    private static double extractROMValue(Computer comp) {
        return Double.valueOf(comp.getROM().substring(0, comp.getROM().length()-4));
    }

    private static double extractPowerSupplyValue(Computer comp) {
        return Double.valueOf(comp.getPowerSupply().substring(0, comp.getPowerSupply().length()-2));
    }

    private static double extractPriceValue(Computer comp) {
        String tmp = comp.getPrice().replace("€", ".");
        tmp = tmp.replaceAll("\\s+", "");
        return Double.valueOf(tmp.trim());
    }

    private static double extractRAM_freqValue(Computer comp) {
        int lenght = comp.getRAM_freq().length();
        return Double.valueOf(comp.getRAM_freq().substring(lenght-8, lenght-4));
    }

    private static double extractGPU_RAM(Computer comp) {
        return Double.valueOf(comp.getGPU_RAM().substring(0, comp.getGPU_RAM().length()-3));
    }

}
