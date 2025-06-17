package OOPS.Inhertiance;

public class BoxWeightClass extends Box{
    double weight;

    public void BoxWeight(){
      this.weight = -1;
    }

    BoxWeightClass(double l, double h, double w, double weight){
        super(l, h, w);//used to call the parent class paremeter
        this.weight = weight;
    }
    
}
