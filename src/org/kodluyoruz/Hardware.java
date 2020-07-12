package org.kodluyoruz;

public  class Hardware extends CPU{
   public int cores;
   public int threads;

    public int getThreads() {
        return threads;
    }

    @Override
    public void setThreads(int threads) {
        this.threads = threads;
    }

    public int getCores() {
     return cores;
 }

 @Override
 public void setCores(int cores) {
     this.cores = cores;
 }
}
