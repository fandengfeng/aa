package hhxx;

public class PC {
	CPU cpu;

    HardDisk HD;

    void setCPU(CPU cpu) {
        this.cpu = cpu;

    }

     void setHardDisk(HardDisk HD) {
        this.HD = HD;

    }

    void show(){
       System.out.println("CPU速度:"+cpu.gatSpeed());
       System.out.println("CPU大小:"+cpu.getSize());

       System.out.println("硬盘容量:"+HD.getAmount());
       System.out.println("硬盘大小:"+HD.getA());

    }

}