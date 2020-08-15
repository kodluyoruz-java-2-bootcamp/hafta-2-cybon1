package org.kodluyoruz;


public class Computer
{


    private Motherboard motherboard;

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }


    private CPU cpu;

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }


    private RAM ram;

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }


    private SSD ssd;

    public SSD getSsd() {
        return ssd;
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    
    private GPU gpu;

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public double getTotalPrice()
    {

       return motherboard.getPrice()+cpu.getPrice()+ram.getPrice()+ssd.getPrice()+gpu.getPrice();
        
    }

    public int getTotalPower()
    {


          return motherboard.getPower()+cpu.getPower()+ram.getPower()+ssd.getPower()+gpu.getPower();

        
    }

}
