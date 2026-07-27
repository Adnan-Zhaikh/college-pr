
class MilkHouse{
    boolean milkAvailable = false;
    synchronized void waitForMilk(){
        System.out.println("customer:Waiting for milk");
        while(!milkAvailable){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("customer:Got milk");       
    }
    synchronized void deliverMilk(){
        System.out.println("milkman:Delivering milk");
                milkAvailable = true;
                notify();
            }
        }
        
public class waitNotify{
        public static void main(String args[]){
           MilkHouse shop = new MilkHouse();
           Thread t1=new Thread(() ->shop.waitForMilk());
           Thread t2=new Thread(()->{
           try{
               Thread.sleep(1000);
           }catch(Exception e){}        
                  shop.deliverMilk();
        });
        t1.start();
        t2.start();
      }
    }
        
        