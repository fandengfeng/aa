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
       System.out.println("CPU�ٶ�:"+cpu.gatSpeed());
       System.out.println("CPU��С:"+cpu.getSize());

       System.out.println("Ӳ������:"+HD.getAmount());
       System.out.println("Ӳ�̴�С:"+HD.getA());

    }

}