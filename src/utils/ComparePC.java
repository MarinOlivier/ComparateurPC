package utils;

import data.Computer;

import java.util.*;

/**
 * Created by olivier on 10/01/2016.
 */
public class ComparePC {

    private Computer _wished;
    private HashMap<String, Integer> _priority;
    /* Classés dans l'ordre du meilleur au pire */
    private String[] _CPUs = new String[] {
            "Intel Core i7",
            "Intel Xeon E5",
            "Intel Core i5",
            "AMD FX 8-Core",
            "Intel Xeon E3",
            "Intel Core i3",
            "AMD FirePro APU",
            "AMD E2 Quad-Core APU",
            "AMD FX Quad-Core",
            "AMD A10 Quad-Core APU",
            "Intel Celeron",
            "AMD A4 Quad-Core APU",
            "AMD A8 Quad-Core APU",
            "Intel Pentium"};

    private HashMap<String, Double> _CPUList;
    private HashMap<String, Double> _GPUList;

    public ComparePC(Computer wished) {
        _wished = wished;
        _priority = new HashMap<>();
        _CPUList = new HashMap<>();
        _GPUList = new HashMap<>();

        /* Valeurs benchmark */
        _GPUList.put("NVIDIA GeForce GTX TITAN X", 10.835);
        _GPUList.put("NVIDIA GeForce GTX 980", 9.735);
        _GPUList.put("2 x NVIDIA GeForce GTX 980", 10.);
        _GPUList.put("NVIDIA GeForce GTX 980 Ti", 11.588);
        _GPUList.put("NVIDIA GeForce GTX 970M", 4.132);
        _GPUList.put("NVIDIA GeForce GTX 970", 8.674);
        _GPUList.put("NVIDIA GeForce GTX 960M", 1.677);
        _GPUList.put("Intel HD Graphics 530", 1.009);
        _GPUList.put("AMD Radeon R9 390X", 7.107);
        _GPUList.put("Intel HD Graphics 4600", 0.709);
        _GPUList.put("NVIDIA GeForce GTX 860M", 1.579);
        _GPUList.put("NVIDIA GeForce GTX 960", 5.956);
        _GPUList.put("Intel HD Graphics P4600", 0.604);
        _GPUList.put("NVIDIA GeForce GTX 950", 5.248);
        _GPUList.put("Intel HD Graphics 4400", 0.546);
        _GPUList.put("NVIDIA GeForce GTX 760", 4.955);
        _GPUList.put("AMD FirePro A320", 1.743);
        _GPUList.put("AMD Radeon R9 380", 5.525);
        _GPUList.put("NVIDIA Quadro K620", 2.262);
        _GPUList.put("Intel HD Graphics 5500", 0.560);
        _GPUList.put("NVIDIA GeForce 820A", 0.661);
        _GPUList.put("NVIDIA GeForce GTX 745", 2.155);
        _GPUList.put("NVIDIA GeForce GT 720", 0.748);
        _GPUList.put("AMD Radeon R2", 0.295);
        _GPUList.put("AMD Radeon R7", 0.963);
        _GPUList.put("Intel HD Graphics", 0.232);
        _GPUList.put("AMD Radeon R3", 0.373);
        _GPUList.put("AMD Radeon R7 370", 4.223);

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
        _priority.put("GPU", 1);
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
        double currentCPU = extractValueOfCPU(c);
        double wishedCPU = extractValueOfCPU(_wished);

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
     * @return  valeur du CPU.
     */
    public double extractValueOfCPU(Computer c) {
        for (String s : _CPUs) {
            if (c.getCPU().equals(s)) {
                return _CPUList.get(s);
            }
        }

        return -1;
    }

    /**
     *
     * @param  c computer,
     * @return   distance du GPU.
     */
    public double compareGPU(Computer c) {
        /* GPU */
        double priorityGPU = 1*_priority.get("GPU");
        double currentGPU = extractValueOfGPU(c);
        double wishedGPU = extractValueOfGPU(_wished);

        return Math.abs(wishedGPU - currentGPU)*priorityGPU;
    }
    /**
     *
     * @param   c computer,
     * @return  valeur du GPU.
     */
    public double extractValueOfGPU(Computer c) {
        for (HashMap.Entry<String, Double> entry : _GPUList.entrySet()) {
            if (c.getGPU().equals(entry.getKey())) {
                // *10 pour que la valeur ait un impact sur le matching. Sinon aucune diff.
                return entry.getValue()*10.;
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
        String typeROM = comp.getROM().substring(comp.getROM().length()-3, comp.getROM().length());

        /* On considère que le SSD est mieux que le HDD
        *  donc on multiplie par 1.5 la distance. */
        if (typeROM == "HDD")
            return Double.valueOf(comp.getROM().substring(0, comp.getROM().length()-4));
        else
            return Double.valueOf(comp.getROM().substring(0, comp.getROM().length()-4))*1.5;
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
