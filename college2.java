interface AKTU{
    abstract void btech();
}
interface LPU{
    abstract void mtech();
    public void mba();
}
class college2 implements AKTU , LPU {
    public void btech(){
        System.out.println("btech program");
    }
    public void mtech(){
        System.out.println("mtech program");
    }
    public void mba(){
        System.out.println("mba program");
    }
    public static void main(String args[]){
        college2 obj = new college2();
        obj.btech();
        obj.mtech();
        obj.mba();
    }
}