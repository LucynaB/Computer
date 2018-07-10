public class Main {
    public static void main(String[] args) {


        Procesor proc1 = new Procesor("Intel", "Core i7", 3.2);
        Memory mem1 = new Memory("Adata","DDR4", 8, 2400);
        Computer comp1 = new Computer("Lenovo V320", proc1, mem1);

        Procesor proc2 = new Procesor("Intel", "Core i5", 2.3);
        Memory mem2 = new Memory("Corsair","DDR2", 4, 800);
        Computer comp2 = new Computer("HP 4740s", proc2, mem2);

        System.out.println(comp1.procesor.cpuClock);
        System.out.println(comp2.procesor.cpuClock);
        Overlock overlock = new Overlock();
        overlock.increaseCpuClock(comp1, 0.8);
        overlock.decreaseCpuClock(comp2, 0.6);
        System.out.println("Po zmianie: " + comp1.procesor.cpuClock);
        System.out.println("Po zmianie: " + comp2.procesor.cpuClock);

        ComputerAssembly ca = new ComputerAssembly();
        Computer comp3 = ca.assembly("Samsung", "Intel", "Core i3", 1.7, "Corsair", "DDR", 2, 600);
        System.out.println("Nazwa: "+comp3.name+", procesor: "+comp3.procesor.producer+" "+comp3.procesor.model+" cpu clock "+comp3.procesor.cpuClock+
                ", pamieć: "+ comp3.memory.producer+" "+comp3.memory.model+" memory size "+comp3.memory.size+" memory clock "+comp3.memory.memoryClock);

    }
}
