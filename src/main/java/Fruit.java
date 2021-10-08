public class Fruit {

    private String fruitName;
    private String fruitDesc;
    private int FruityQty;

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitName='" + fruitName + '\'' +
                ", fruitDesc='" + fruitDesc + '\'' +
                ", FruityQty=" + FruityQty +
                '}';
    }

    public int getFruityQty() {
        return FruityQty;
    }

    public void setFruityQty(int fruityQty) {
        FruityQty = fruityQty;
    }

    public String getFruitDesc() {
        return fruitDesc;
    }

    public void setFruitDesc(String fruitDesc) {
        this.fruitDesc = fruitDesc;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
public int compareTo(Fruit that){

        if (this.fruitName.compareTo(that.fruitName)< 0){

            return -1;
        } else if(this.fruitName.compareTo(that.fruitName)> 0){
            return 1;
        }else if (this.FruityQty > that.FruityQty){
            return 1;
        }


    return 0;
}

    public Fruit(String fruitName, int fruityQty) {
        this.fruitName = fruitName;
        FruityQty = fruityQty;
    }
}



