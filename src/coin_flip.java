public class coin_flip {
    public static void main(String args[]){
        double check = ((Math.random()*10)%1);
        if (check < 0.5){
            System.out.println("Tails");
        }
        else{
            System.out.println("Heads");
        }
    }
}
