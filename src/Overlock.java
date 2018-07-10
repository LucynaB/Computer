class Overlock {

    void increaseCpuClock(Computer computer, double increase){
        computer.procesor.cpuClock += increase;
    }

    void decreaseCpuClock(Computer computer, double decrease){
        computer.procesor.cpuClock -= decrease;
    }
}
