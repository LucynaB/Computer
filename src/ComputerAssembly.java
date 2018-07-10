class ComputerAssembly {

    Computer assembly(String compName, String procName, String procModel, double cpuClock, String memName, String memModel, double memSize, double memClock ){
        Procesor proc = new Procesor(procName, procModel, cpuClock);
        Memory mem = new Memory(memName, memModel, memSize, memClock);
        return new Computer(compName, proc, mem);

    }
}
