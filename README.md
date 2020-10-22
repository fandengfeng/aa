# aa
4（1）： CPU cpu = new CPU(); cpu.setSpeed(2200);
4（2）： HardDisk HD=new HardDisk();  HD.setAmount(200);
4（3）：CPU cpu = new CPU();
4（4）： pc.setCPU(cpu);
4（5）： pc.setHardDisk(HD);
4（6）：pc.show();
## 类中定义不少于两个构造方法； 
public void setSize(int speed){
	this.size= size;
}
 public void setA(double a){
		   this.a =a;
	   }
     
## 每个类定义不少于2个属性，且属性的类型应该多样化
      int getSize(){
	  return size;
  }
  System.out.println("CPU大小:"+cpu.getSize());
   cpu.setSize(88);
   
   
double getA(){
		return a;
	}
  public void setA(double a){
		   this.a =a;
	   }
     System.out.println("硬盘大小:"+HD.getA());
     HD.setA(188);
    
    
## 尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
private void setB(){
	this.setB();
}
	       
