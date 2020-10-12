package hhxx;

public class Test {

	 public static void main(String args[]) {
	       CPU cpu = new CPU();

	       HardDisk HD=new HardDisk();

	       cpu.setSpeed(2200);
	       cpu.setSize(88);

	       HD.setAmount(200);
	       HD.setA(188);
	       

	       PC pc =new PC();

	       pc.setCPU(cpu);

	       pc.setHardDisk(HD);

	       pc.show();

	    }

	}