public class PizzaShop {
    String name;
    int count;

    String getShopInfo(){
        return "リストランテ" + name;
    }

    void order(){
        if (count<20){
            System.out.println("注文を受け付けます。");
            count = count + 1;
        }
        else{
            
        }

    }

    void cook(){

    }

    void setTable(){

    }



}
