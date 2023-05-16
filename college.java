abstract class AKTUniv {
    void btech(){
        System.out.println("btech from AKTU");
    }
}
class college extends AKTUniv {
    void diploma(){
        System.out.println("Self service");
    }
    public static void main(String[] args){
        college obj = new college();
        obj.btech();
    }
}
