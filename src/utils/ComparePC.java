package utils;

import data.Computer;

import java.util.Map;

/**
 * Created by olivier on 10/01/2016.
 */
public class ComparePC {

    private Computer _wishComputer;
    private Map<String, Integer> _priority;
    private boolean _expertMod;

    public ComparePC(Computer wishComputer, boolean expertMod){
        _wishComputer = wishComputer;
        _expertMod = expertMod;
        this.setPriority();
    }

    private void setPriority(){
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
}
