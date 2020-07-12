package org.kodluyoruz;



   class Gpu extends Hardware{
    public int memory;
    public int bit;
   }

public class GPU<bit, Bits>
{
    public void setBrand(String amd) {
    }

    public void setPower(int i) {
    }

    public void setPrice(double v) {
    }

    public void setMemory(int i) {
        int memory =8;
        if(memory>=8)

            System.out.println("Her 2 gb fiyat\u0131 250 Tl Artar");
    }

    public void setBits() {

        int i = 128;
        if (i>=128) {


            System.out.println("her 64 bits için fiyatı 400 TL artar");
        }
    }



}
