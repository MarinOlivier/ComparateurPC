package utils;

import data.Computer;

import java.util.*;

/**
 * Created by olivier on 10/01/2016.
 */
public class ComparePC {

    private Computer _wished;
    private HashMap<String, Integer> _priority;
    /* CPU classés par ordre décroissant */
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

    /* OS classés par ordre décroissant */
    private String[] _OSs = new String[] {
            "Microsoft Windows 10 Professionnel 64 bits",
            "Microsoft Windows 10 Famille 64 bits",
            "Microsoft Windows 10",
            "Microsoft Windows 8.1 64 bits",
            "Microsoft Windows 8.1 Pro 64 bits",
            "Microsoft Windows 8 Pro 64 bits",
            "Microsoft Windows 7 Professionnel 64 bits",
            "Microsoft Windows 7 Édition Familiale Premium 64 bits",
            "SteamOS"};

    private HashMap<String, Double> _CPUList;
    private HashMap<String, Double> _GPUList;
    private HashMap<String, Double> _OSList;
    private HashMap<String, Double> _MBList;

    public ComparePC(Computer wished) {
        _wished = wished;
        _priority = new HashMap<>();
        _CPUList = new HashMap<>();
        _GPUList = new HashMap<>();
        _OSList = new HashMap<>();
        _MBList = new HashMap<>();

        /* Valeurs benchmark GPU. */
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

        /* Valeurs Carte-mère basées sur leur côté de popularité. */
        _MBList.put("MSI X99A GAMING 7", 21.);
        _MBList.put("ASUS MAXIMUS VIII RANGER", 9.);
        _MBList.put("ASUS X99-A", 207.);
        _MBList.put("MSI B85-G43 GAMING", 297.);
        _MBList.put("MSI H81M-P33", 171.);

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

        // Nombre d'OS.
        double nbOS = 9.;
        // Coefficient pour l'évaluation.
        double coeffOS = 2.;
        double OSEvaluation = nbOS*coeffOS;
        // Ajout des coefficients dans la _OSList.
        for (String s : _OSs) {
            _OSList.put(s, OSEvaluation);
            OSEvaluation -= coeffOS;
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

        /* On considère que la distance MAX du CPU est 75. */
        if (distCPU > 75)
            distCPU = 75.;

        /* On considère que la distance MAX de la CPU_freq est 25. */
        if (distCPU_freq > 25)
            distCPU_freq = 25.;

        return (distCPU+distCPU_freq)*priorityCPU*priorityCPU_freq;
    }

    /**
     *
     * @param  c computer,
     * @return   distance de l'OS.
     */
    public double compareOS(Computer c) {
        /* OS */
        double priorityOS = 1*_priority.get("OS");
        double currentOS = extractValueOfOS(c);
        double wishedOS = extractValueOfOS(_wished);

        /* Calcul de la distance pour l'OS. */
        double distCPU = Math.abs(wishedOS - currentOS);

        /* On considère que la distance MAX du CPU est 50. */
        if (distCPU > 50)
            distCPU = 50.;

        return distCPU*priorityOS;
    }

    /**
     *
     * @param   c computer,
     * @return    valeur du CPU.
     */
    public double extractValueOfCPU(Computer c) {
        for (String s : _CPUs) {
            if (c.getCPU().equals(s))
                return _CPUList.get(s);
        }
        return -1;
    }

    /**
     *
     * @param  c computer,
     * @return   distance du GPU + distance de la GPU_RAM.
     */
    public double compareGPU(Computer c) {
        /* GPU */
        double priorityGPU = 1*_priority.get("GPU");
        double currentGPU = extractValueOfGPU(c);
        double wishedGPU = extractValueOfGPU(_wished);

        /* GPU_RAM */
        double priorityGPU_RAM = 1*_priority.get("GPU_RAM");
        double currentGPU_RAM = extractGPU_RAM(c);
        double wishedGPU_RAM = extractGPU_RAM(_wished);

        /* Calcul des distances pour chaque élément du GPU */
        double distGPU = Math.abs(wishedGPU - currentGPU);
        double distGPU_RAM = Math.abs(wishedGPU_RAM - currentGPU_RAM);

        /* On considère que la distance MAX du GPU est 30. */
        if (distGPU > 30)
            distGPU = 30.;

        /* On considère que la distance MAX de la GPU_RAM est 20. */
        if (distGPU_RAM > 20)
            distGPU_RAM = 20.;

        return (distGPU+distGPU_RAM)*priorityGPU*priorityGPU_RAM;
    }

    /**
     *
     * @param   c computer,
     * @return    valeur du GPU.
     */
    public double extractValueOfGPU(Computer c) {
        for (HashMap.Entry<String, Double> entry : _GPUList.entrySet()) {
            if (c.getGPU().equals(entry.getKey()))
                // *10 pour que la valeur ait un impact sur le matching. Sinon aucune diff.
                return entry.getValue()*10.;
        }
        return -1;
    }

    /**
     *
     * @param  c computer,
     * @return   distance de la Carte-mère.
     */
    public double comparemotherBoard(Computer c) {

        /* Mother Board */
        double priorityMB = 1*_priority.get("motherBoard");
        double currentMB = extractValueOfMB(c);
        double wishedMB = extractValueOfMB(_wished);

        /* Calcul de la distance de la carte-mère. */
        double distMB = Math.abs(wishedMB - currentMB);
        System.out.println("distMB = " + distMB);
        /* On considère que la distance MAX de la carte-mère est 50. */
        if (distMB > 50)
            distMB = 50.;

        return distMB*priorityMB;
    }

    /**
     *
     * @param   c computer,
     * @return    valeur de la Carte-mère.
     */
    public double extractValueOfMB(Computer c) {
        for (HashMap.Entry<String, Double> entry : _MBList.entrySet()) {
            if (c.getMotherBoard().equals(entry.getKey()))
                return entry.getValue();
            else
                return 0.;
        }
        return -1;
    }

    /**
     *
     * @param   c computer,
     * @return    distance de la RAM + distance de la RAM_freq.
     */
    public double compareRAM(Computer c) {
        /* RAM */
        double priorityRAM = 1*_priority.get("RAM");
        double currentRAM = extractRAMValue(c);
        double wishedRAM = extractRAMValue(_wished);

        /* RAM_freq */
        double priorityRAM_freq = 1*_priority.get("RAM_freq");
        double currentRAM_freq = extractRAM_freqValue(c);
        double wishedRAM_freq = extractRAM_freqValue(_wished);

        /* Calcul des distances pour chaque élément de la RAM. */
        double distRAM = Math.abs(wishedRAM - currentRAM);
        double distRAM_freq = Math.abs(wishedRAM_freq - currentRAM_freq);

        /* On considère que la distance MAX de la RAM est 25. */
        if (distRAM > 25)
            distRAM = 25.;

        /* On considère que la distance MAX de la RAM_freq est 25. */
        if (distRAM_freq > 25)
            distRAM_freq = 25.;

        return (distRAM+distRAM_freq)*priorityRAM*priorityRAM_freq;
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

    /*public double compareprice(Computer o) {
        double priority = 0.01*_priority.get("price");
        double current = extractPriceValue(o);
        double wished = extractPriceValue(_wished);

        return Math.abs(wished - current)*priority;
    }*/

    /**
     *
     * @param   c computer,
     * @return    valeur de l'OS.
     */
    public double extractValueOfOS(Computer c) {
        for (String s : _OSs) {
            if (c.getOS().equals(s)) {
                return _OSList.get(s);
            }
        }

        return -1;
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

    /*private static double extractPriceValue(Computer comp) {
        String tmp = comp.getPrice().replace("€", ".");
        tmp = tmp.replaceAll("\\s+", "");
        return Double.valueOf(tmp.trim());
    }*/

    private static double extractRAM_freqValue(Computer comp) {
        if (comp.getRAM_freq() != null) {
            int length = comp.getRAM_freq().length();
            return Double.valueOf(comp.getRAM_freq().substring(length - 8, length - 4));
        } else
            return 25.;
    }

    private static double extractGPU_RAM(Computer comp) {
        if (comp.getGPU_RAM() != null)
            return Double.valueOf(comp.getGPU_RAM().substring(0, comp.getGPU_RAM().length()-3));
        else
            return 20.;
    }
}
