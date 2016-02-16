package utils;

import data.Computer;

import java.util.*;

/**
 * Created by olivier on 10/01/2016.
 */
public class ComparePC {

    private Computer _wished;
    private HashMap<String, Integer> _priority;
    private String[] _CPUs = new String[] {"Intel Core i7", "Intel Xeon E5", "Intel Core i5", "AMD FX 8-Core", "Intel Xeon E3", "Intel Core i3", "AMD FirePro APU",
                                            "AMD E2 Quad-Core APU", "AMD FX Quad-Core", "AMD A10 Quad-Core APU", "Intel Celeron", "AMD A4 Quad-Core APU", "AMD A8 Quad-Core APU",
                                            "Intel Pentium"};
    private HashMap<String, Double> _CPUList;

    public ComparePC(Computer wished) {
        _wished = wished;
        _priority = new HashMap<>();
        _CPUList = new HashMap<>();
        setPriority();
    }

    private void setPriority() {
        // Nombre de CPU.
        double nbCPU = 14.;
        // Coefficient pour l'évaluation.
        double coeffCPU = 16.;
        double CPUEvaluation = nbCPU*coeffCPU;
        // Ajout des coefficients dans la _CPUList.
        for (String s : _CPUs) {
            _CPUList.put(s, CPUEvaluation);
            CPUEvaluation -= coeffCPU;
        }

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

    /**
     *
     * @param  c computer,
     * @return   distance du CPU + distance de la CPU_freq.
     */
    public double compareCPU(Computer c) {
        /* CPU */
        double priorityCPU = 1*_priority.get("CPU");
        double currentCPU = extractValueFromCPU(c);
        double wishedCPU = extractValueFromCPU(_wished);

        /* CPU_freq */
        double priorityCPU_freq = 1*_priority.get("CPU_freq");
        double currentCPU_freq = extractCPU_freqValue(c);
        double wishedCPU_freq = extractCPU_freqValue(_wished);

        /* Calcul des distances pour chaque élément du CPU */
        double distCPU = Math.abs(wishedCPU - currentCPU);
        double distCPU_freq = Math.abs(wishedCPU_freq - currentCPU_freq);

        return (distCPU+distCPU_freq)*priorityCPU*priorityCPU_freq;
    }

    /**
     *
     * @param   c computer,
     * @return    valeur du CPU.
     */
    public double extractValueFromCPU(Computer c) {
        for (String s : _CPUs) {
            if (c.getCPU().equals(s)) {
                System.out.println("CPU MATCHED: " + _CPUList.get(s));
                return _CPUList.get(s);
            }
        }

        return -1;
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
